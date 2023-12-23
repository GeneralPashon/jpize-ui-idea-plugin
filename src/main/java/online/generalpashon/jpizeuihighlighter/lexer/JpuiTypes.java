package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.parser.JpuiPsiElement;

import java.lang.reflect.InvocationTargetException;

public interface JpuiTypes{

    IElementType EOF = new JpuiElementType("END OF LINE");

    IElementType OPEN_BRACKET = new JpuiElementType("OPEN BRACKET");
    IElementType CLOSE_BRACKET = new JpuiElementType("CLOSE BRACKET");
    IElementType OPEN_BRACE = new JpuiElementType("OPEN BRACE");
    IElementType CLOSE_BRACE = new JpuiElementType("CLOSE BRACE");
    IElementType COMMA = new JpuiElementType("COMMA");
    IElementType COMMENT = new JpuiElementType("COMMENT");

    IElementType COMPONENT = new JpuiElementType("COMPONENT");
    IElementType CONSTRAINT = new JpuiElementType("CONSTRAINT");
    IElementType LITERAL = new JpuiElementType("LITERAL");
    IElementType NUMBER = new JpuiElementType("NUMBER");
    IElementType KEY = new JpuiElementType("KEY");
    IElementType RESOURCE = new JpuiElementType("RESOURCE");

    static PsiElement createElement(ASTNode node){
        return new JpuiPsiElement(node);
    }

}
