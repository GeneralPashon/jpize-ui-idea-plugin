package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class PuiPsiElement extends ASTWrapperPsiElement{

    public PuiPsiElement(@NotNull ASTNode node){
        super(node);
    }

}
