package online.generalpashon.jpizeuihighlighter.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class PuiFileType extends LanguageFileType{

    public static final PuiFileType INSTANCE = new PuiFileType();

    private PuiFileType(){
        super(PuiLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName(){
        return "Jpize UI File";
    }

    @NotNull
    @Override
    public String getDescription(){
        return "Jpize-Engine UI markup language";
    }

    @NotNull
    @Override
    public String getDefaultExtension(){
        return ".pui";
    }

    @Override
    public Icon getIcon(){
        return PuiIcons.FILE;
    }

}
