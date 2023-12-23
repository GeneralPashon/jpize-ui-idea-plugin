package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class JpuiPsiElement extends ASTWrapperPsiElement{

    public JpuiPsiElement(@NotNull ASTNode node){
        super(node);
        System.out.println("NEW PSI: " + node.getElementType() + " (" + node.getText() + ")");
    }

}
