package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.lang.JpuiLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class JpuiElementType extends IElementType{

    public JpuiElementType(@NonNls @NotNull String debugName){
        super(debugName, JpuiLanguage.INSTANCE);
    }

}
