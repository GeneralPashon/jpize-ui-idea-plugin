package online.generalpashon.jpizeuihighlighter.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class JpuiFileType extends LanguageFileType{

    public static final JpuiFileType INSTANCE = new JpuiFileType();

    private JpuiFileType(){
        super(JpuiLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName(){
        return "JPUI File";
    }

    @NotNull
    @Override
    public String getDescription(){
        return "Jpize-Engine UI markup language";
    }

    @NotNull
    @Override
    public String getDefaultExtension(){
        return ".jpui";
    }

    @Override
    public Icon getIcon(){
        return JpuiIcons.FILE;
    }

}
