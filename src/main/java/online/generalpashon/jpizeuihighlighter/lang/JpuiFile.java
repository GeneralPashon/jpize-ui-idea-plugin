package online.generalpashon.jpizeuihighlighter.lang;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class JpuiFile extends PsiFileBase{

    public JpuiFile(@NotNull FileViewProvider viewProvider){
        super(viewProvider, JpuiLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType(){
        return JpuiFileType.INSTANCE;
    }

    @Override
    public String toString(){
        return "JPUI File";
    }

}