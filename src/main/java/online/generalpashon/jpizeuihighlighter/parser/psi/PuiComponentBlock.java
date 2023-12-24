// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PuiComponentBlock extends PsiElement {

  @Nullable
  PuiArguments getArguments();

  @NotNull
  List<PuiComponentBlock> getComponentBlockList();

  @NotNull
  List<PuiField> getFieldList();

}
