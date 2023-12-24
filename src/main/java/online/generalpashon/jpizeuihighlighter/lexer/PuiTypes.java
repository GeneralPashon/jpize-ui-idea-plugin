package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.parser.PuiPsiElement;

public interface PuiTypes{

    IElementType EOF = new PuiElementType("END OF LINE");

    IElementType OPEN_BRACKET = new PuiElementType("OPEN BRACKET");
    IElementType CLOSE_BRACKET = new PuiElementType("CLOSE BRACKET");
    IElementType OPEN_BRACE = new PuiElementType("OPEN BRACE");
    IElementType CLOSE_BRACE = new PuiElementType("CLOSE BRACE");
    IElementType COMMA = new PuiElementType("COMMA");
    IElementType COMMENT = new PuiElementType("COMMENT");

    IElementType COMPONENT = new PuiElementType("COMPONENT");
    IElementType CONSTRAINT = new PuiElementType("CONSTRAINT");
    IElementType LITERAL = new PuiElementType("LITERAL");
    IElementType NUMBER = new PuiElementType("NUMBER");
    IElementType KEY = new PuiElementType("KEY");
    IElementType RESOURCE = new PuiElementType("RESOURCE");

    static PsiElement createElement(ASTNode node){
        return new PuiPsiElement(node);
    }

}
