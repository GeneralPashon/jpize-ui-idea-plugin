package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.Deque;
import java.util.LinkedList;

import static online.generalpashon.jpizeuihighlighter.lexer.JpuiTypes.*;

public class JpuiParser implements PsiParser{

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
        System.out.println("\n-->START PARSING:");
        PsiBuilder.Marker rootMarker = builder.mark();

        IElementType token = peek();
        if(token == COMPONENT)
            parseComponent();
        else
            builder.error("Expected component");

        while(!builder.eof())
            skip();

        System.out.println("<--END PARSING\n");
        rootMarker.done(root);
        return builder.getTreeBuilt();
    }

    private void parseComponentArgs(){
        if(next() == OPEN_BRACKET) // '{' => no args
            return;
        expect("(", OPEN_BRACE);

        System.out.print("    -->START ARGS [");

        IElementType token = next();
        while(!builder.eof()){
            if(token == CLOSE_BRACE){
                break;
            }else if(token == COMMA){
                System.out.print(", ");
                token = next();

                if(token == CLOSE_BRACE){
                    builder.error("Expected argument");
                    System.out.println("]<--ERROR ARGS END");
                    break;
                }
            }else{
                System.out.print(string() + " (" + token + ")");
                token = next();
            }
        }

        System.out.println("]<--END ARGS (with '" + string() + "')");

        next();
        expect("{", OPEN_BRACKET);
    }

    private void parseComponent(){
        System.out.println("  -->START COMPONENT (" + string() + ")");

        parseComponentArgs();

        IElementType token = next();
        while(token != CLOSE_BRACKET && !builder.eof()){
            parseComponentField(token);
            token = next();
        }

        System.out.println("  <--END COMPONENT (with '" + string() + "')");
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
        System.out.println("    -->START FIELD (" + string() + ")");

        final IElementType token = next();
        if(token == OPEN_BRACE)
            parseVector();
        else if(token == OPEN_BRACKET)
            parseComponentFieldGroup();
        else if(token == RESOURCE || token == LITERAL || token == CONSTRAINT || token == NUMBER)
            parseValue();
        else
            builder.error("Expected value");

        System.out.println("    <--END FIELD");
    }

    private void parseComponentFieldGroup(){
        System.out.println("  -->START GROUP (" + string() + ")");

        IElementType token = next();
        while(token != CLOSE_BRACKET && !builder.eof()){
            parseField();
            token = next();
        }

        System.out.println("  <--END GROUP (with '" + string() + "')");
    }

    private void parseValue(){
        System.out.print("      -->START VALUE '");
        System.out.println(string() + "' <--END VALUE");
    }

    private void parseVector(){
        System.out.print("      -->START VECTOR [");

        IElementType token = next();
        while(!builder.eof()){
            if(token == CLOSE_BRACE){
                break;
            }else if(token == COMMA){
                System.out.print(", ");
                token = next();

                if(token == CLOSE_BRACE){
                    builder.error("Expected argument");
                    System.out.println("]<--ERROR VECTOR END");
                    break;
                }
            }else{
                System.out.print(string() + " (" + token + ")");
                token = next();
            }
        }

        System.out.println("]<--END VECTOR (with '" + string() + "')");
    }

}
