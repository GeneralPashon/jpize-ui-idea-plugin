package online.generalpashon.jpizeuihighlighter.codecompletion;

import com.intellij.codeInsight.completion.*;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import online.generalpashon.jpizeuihighlighter.lexer.PuiTypes;
import org.jetbrains.annotations.NotNull;

public class PuiCompletionContributor extends com.intellij.codeInsight.completion.CompletionContributor{

    public PuiCompletionContributor(){
        super.extend(CompletionType.SMART, PlatformPatterns.psiElement(PuiTypes.CLOSE_BRACKET), new CompletionProvider<>(){
            public void addCompletions(
                                       @NotNull CompletionParameters parameters,
                                       @NotNull ProcessingContext context,
                                       @NotNull CompletionResultSet resultSet){

            }
        });
    }

}
