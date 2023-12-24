package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.lang.PuiLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PuiElementType extends IElementType{

    public PuiElementType(@NonNls @NotNull String debugName){
        super(debugName, PuiLanguage.INSTANCE);
    }

}
