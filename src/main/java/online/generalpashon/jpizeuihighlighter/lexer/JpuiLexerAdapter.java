package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.lexer.FlexAdapter;

public class JpuiLexerAdapter extends FlexAdapter{

    public JpuiLexerAdapter(){
        super(new JpuiLexer(null));
    }

}
