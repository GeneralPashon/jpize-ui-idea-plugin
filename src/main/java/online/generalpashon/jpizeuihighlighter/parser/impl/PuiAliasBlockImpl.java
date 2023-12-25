// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiAliasBlock;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiValue;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiVisitor;
import org.jetbrains.annotations.NotNull;

public class PuiAliasBlockImpl extends ASTWrapperPsiElement implements PuiAliasBlock {

  public PuiAliasBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PuiVisitor visitor) {
    visitor.visitAliasBlock(this);
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
