package online.generalpashon.jpizeuihighlighter.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class PuiFile extends PsiFileBase{

    public PuiFile(@NotNull FileViewProvider viewProvider){
        super(viewProvider, PuiLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType(){
        return PuiFileType.INSTANCE;
    }

    @Override
    public String toString(){
        return "Jpize UI File";
    }

}