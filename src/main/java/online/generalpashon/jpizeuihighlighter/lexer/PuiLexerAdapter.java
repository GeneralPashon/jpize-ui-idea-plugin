package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.lexer.FlexAdapter;

public class PuiLexerAdapter extends FlexAdapter{

    public PuiLexerAdapter(){
        super(new PuiLexer(null));
    }

}
