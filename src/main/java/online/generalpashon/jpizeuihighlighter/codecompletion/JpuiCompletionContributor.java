package online.generalpashon.jpizeuihighlighter.codecompletion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.AutoCompletionPolicy;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import org.jetbrains.annotations.NotNull;

public class JpuiCompletionContributor extends CompletionContributor{

    @Override
    public void fillCompletionVariants(@NotNull CompletionParameters parameters, @NotNull CompletionResultSet result){
        // result.addElement(LookupElementBuilder.create("px").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
        // result.addElement(LookupElementBuilder.create("at").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
        // result.addElement(LookupElementBuilder.create("rw").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
        // result.addElement(LookupElementBuilder.create("rh").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
        // result.addElement(LookupElementBuilder.create("auto").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
        // result.addElement(LookupElementBuilder.create("zero").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
        // result.addElement(LookupElementBuilder.create("match_parent").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
        // result.addElement(LookupElementBuilder.create("wrap_content").withAutoCompletionPolicy(AutoCompletionPolicy.ALWAYS_AUTOCOMPLETE));
    }

}
