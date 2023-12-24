// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static online.generalpashon.jpizeuihighlighter.lexer.PuiTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import online.generalpashon.jpizeuihighlighter.parser.psi.*;

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
  @Nullable
  public PuiFieldGroup getFieldGroup() {
    return findChildByClass(PuiFieldGroup.class);
  }

  @Override
  @Nullable
  public PuiFieldSingle getFieldSingle() {
    return findChildByClass(PuiFieldSingle.class);
  }

  @Override
  @Nullable
  public PuiFieldVector getFieldVector() {
    return findChildByClass(PuiFieldVector.class);
  }

}
