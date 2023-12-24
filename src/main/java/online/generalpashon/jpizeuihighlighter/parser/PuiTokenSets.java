package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.psi.tree.TokenSet;
import online.generalpashon.jpizeuihighlighter.lexer.PuiTypes;

public interface PuiTokenSets{

    TokenSet COMMENTS = TokenSet.create(PuiTypes.COMMENT);
    TokenSet LITERALS = TokenSet.create(PuiTypes.LITERAL);

}
