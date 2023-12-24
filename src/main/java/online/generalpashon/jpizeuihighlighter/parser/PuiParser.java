package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static online.generalpashon.jpizeuihighlighter.lexer.PuiTypes.*;

public class PuiParser implements PsiParser{

    private PsiBuilder builder;

    /** TOKEN */

    private IElementType next(){
        builder.advanceLexer();

        if(builder.eof()){
            builder.error("Expected token");
            return EOF;
        }

        // System.out.println("      T: " + builder.getTokenType() + " = " + string());
        return builder.getTokenType();
    }

    private IElementType peek(){
        return builder.getTokenType();
    }

    private void skip(){
        builder.advanceLexer();
    }

    private void expect(String expectation, IElementType type){
        if(peek() != type)
            builder.error("Expected '" + expectation + "'");
    }

    private String string(){
        return builder.getTokenText();
    }



    /** PARSER */

    @Override
    public @NotNull ASTNode parse(@NotNull IElementType root, @NotNull PsiBuilder builder){
        this.builder = builder;
        final PsiBuilder.Marker marker = builder.mark();

        final IElementType token = peek();
        if(token == COMPONENT)
            parseComponent();
        else
            builder.error("Expected component");

        while(!builder.eof())
            skip();

        marker.done(root);
        return builder.getTreeBuilt();
    }

    private void parseComponentArgs(){
        if(next() == OPEN_BRACKET) // '{' => no args
            return;
        expect("(", OPEN_BRACE);

        IElementType token = next();
        while(!builder.eof()){
            if(token == CLOSE_BRACE){
                break;
            }else if(token == COMMA){
                token = next();

                if(token == CLOSE_BRACE){
                    builder.error("Expected argument");
                    break;
                }
            }else
                token = next();
        }

        next();
        expect("{", OPEN_BRACKET);
    }

    private void parseComponent(){
        parseComponentArgs();

        IElementType token = next();
        while(token != CLOSE_BRACKET && !builder.eof()){
            parseComponentField(token);
            token = next();
        }
    }

    private void parseComponentField(IElementType token){
        if(token == COMPONENT)
            parseComponent();
        else if(token == KEY)
            parseField();
        else
            builder.error("Unexpected field type '" + peek() + "': '" + string() + "'");
    }

    private void parseField(){
        final IElementType token = next();
        if(token == OPEN_BRACE)
            parseVector();
        else if(token == OPEN_BRACKET)
            parseComponentFieldGroup();
        else if(token == RESOURCE || token == LITERAL || token == CONSTRAINT || token == NUMBER)
            parseValue();
        else
            builder.error("Expected value");
    }

    private void parseComponentFieldGroup(){
        IElementType token = next();
        while(token != CLOSE_BRACKET && !builder.eof()){
            parseField();
            token = next();
        }
    }

    private void parseValue(){ }

    private void parseVector(){
        IElementType token = next();
        while(!builder.eof()){
            if(token == CLOSE_BRACE){
                break;
            }else if(token == COMMA){
                token = next();

                if(token == CLOSE_BRACE){
                    builder.error("Expected value");
                    break;
                }
            }else
                token = next();
        }
    }

}
