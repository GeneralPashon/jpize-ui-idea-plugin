package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class JpuiLexerAdapter extends FlexAdapter{

    public JpuiLexerAdapter(){
        super(new JpuiLexer(null));
    }

}
