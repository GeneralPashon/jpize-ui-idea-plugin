package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.lang.PuiLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PuiTokenType extends IElementType{

    public PuiTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PuiLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
