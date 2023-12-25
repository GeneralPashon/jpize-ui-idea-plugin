// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiField;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiGroup;
import online.generalpashon.jpizeuihighlighter.parser.psi.PuiVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PuiGroupImpl extends ASTWrapperPsiElement implements PuiGroup {

  public PuiGroupImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PuiVisitor visitor) {
    visitor.visitGroup(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PuiVisitor) accept((PuiVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PuiField> getFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PuiField.class);
  }

}
