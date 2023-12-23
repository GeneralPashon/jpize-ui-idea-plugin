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
import online.generalpashon.jpizeuihighlighter.lang.JpuiFile;
import online.generalpashon.jpizeuihighlighter.lang.JpuiLanguage;
import online.generalpashon.jpizeuihighlighter.lexer.JpuiLexerAdapter;
import online.generalpashon.jpizeuihighlighter.lexer.JpuiTypes;
import org.jetbrains.annotations.NotNull;

public class JpuiParserDefinition implements ParserDefinition{

    public static final IFileElementType FILE = new IFileElementType(JpuiLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project){
        return new JpuiLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project){
        return new JpuiParser();
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider){
        return new JpuiFile(viewProvider);
    }


    @Override
    public @NotNull IFileElementType getFileNodeType(){
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens(){
        return JpuiTokenSets.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements(){
        return JpuiTokenSets.LITERALS;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node){
        return JpuiTypes.createElement(node);
    }

}
