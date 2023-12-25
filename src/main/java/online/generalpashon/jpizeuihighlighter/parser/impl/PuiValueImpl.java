// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import online.generalpashon.jpizeuihighlighter.parser.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PuiValueImpl extends ASTWrapperPsiElement implements PuiValue {

  public PuiValueImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PuiVisitor visitor) {
    visitor.visitValue(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PuiVisitor) accept((PuiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PuiGroup getGroup() {
    return findChildByClass(PuiGroup.class);
  }

  @Override
  @Nullable
  public PuiSingleValue getSingleValue() {
    return findChildByClass(PuiSingleValue.class);
  }

  @Override
  @Nullable
  public PuiVector getVector() {
    return findChildByClass(PuiVector.class);
  }

}
