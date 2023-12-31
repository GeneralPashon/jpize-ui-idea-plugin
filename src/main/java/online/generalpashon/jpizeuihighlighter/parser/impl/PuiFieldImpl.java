// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiField;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiValue;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiVisitor;
import org.jetbrains.annotations.NotNull;

public class PuiFieldImpl extends ASTWrapperPsiElement implements PuiField {

  public PuiFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PuiVisitor visitor) {
    visitor.visitField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PuiVisitor) accept((PuiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PuiValue getValue() {
    return findNotNullChildByClass(PuiValue.class);
  }

}
