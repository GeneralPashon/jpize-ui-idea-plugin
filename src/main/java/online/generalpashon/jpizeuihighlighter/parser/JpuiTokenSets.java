package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.psi.tree.TokenSet;
import online.generalpashon.jpizeuihighlighter.lexer.JpuiTypes;

public interface JpuiTokenSets{

    TokenSet COMMENTS = TokenSet.create(JpuiTypes.COMMENT);
    TokenSet LITERALS = TokenSet.create(JpuiTypes.LITERAL);

}
