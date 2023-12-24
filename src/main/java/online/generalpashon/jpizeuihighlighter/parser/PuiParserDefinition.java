package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import online.generalpashon.jpizeuihighlighter.lang.PuiFile;
import online.generalpashon.jpizeuihighlighter.lang.PuiLanguage;
import online.generalpashon.jpizeuihighlighter.lexer.PuiLexerAdapter;
import online.generalpashon.jpizeuihighlighter.lexer.PuiTypes;
import org.jetbrains.annotations.NotNull;

public class PuiParserDefinition implements ParserDefinition{

    public static final IFileElementType FILE = new IFileElementType(PuiLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project){
        return new PuiLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project){
        return new PuiParser();
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider){
        return new PuiFile(viewProvider);
    }


    @Override
    public @NotNull IFileElementType getFileNodeType(){
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens(){
        return PuiTokenSets.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements(){
        return PuiTokenSets.LITERALS;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node){
        return PuiTypes.Factory.createElement(node);
    }

}
