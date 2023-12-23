package online.generalpashon.jpizeuihighlighter.lang;

import com.intellij.lang.Language;

public class JpuiLanguage extends Language{
    public static final JpuiLanguage INSTANCE = new JpuiLanguage();

    private JpuiLanguage(){
        super("JPUI");
    }
}
