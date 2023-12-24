package online.generalpashon.jpizeuihighlighter.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.lexer.PuiLexerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static online.generalpashon.jpizeuihighlighter.lexer.PuiTypes.*;

public class PuiSyntaxHighlighter extends SyntaxHighlighterBase{

    private final Map<IElementType, TextAttributesKey[]> keys;
    private final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    private void putKey(IElementType type, TextAttributesKey key){
        keys.put(type, new TextAttributesKey[]{
            TextAttributesKey.createTextAttributesKey(type.toString(), key)
        });
    }

    public PuiSyntaxHighlighter(){
        this.keys = new HashMap<>();
        putKey(COMPONENT, DefaultLanguageHighlighterColors.METADATA);
        putKey(LITERAL, DefaultLanguageHighlighterColors.STRING);
        putKey(NUMBER, DefaultLanguageHighlighterColors.NUMBER);
        putKey(COMMA, DefaultLanguageHighlighterColors.COMMA);
        putKey(KEY, DefaultLanguageHighlighterColors.IDENTIFIER);
        putKey(RESOURCE, DefaultLanguageHighlighterColors.BLOCK_COMMENT);
        putKey(CONSTRAINT, DefaultLanguageHighlighterColors.NUMBER);
        putKey(OPEN_BRACKET, DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);
        putKey(CLOSE_BRACKET, DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);
        putKey(OPEN_BRACE, DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);
        putKey(CLOSE_BRACE, DefaultLanguageHighlighterColors.DOC_COMMENT_TAG_VALUE);
    }

    @Override
    public @NotNull Lexer getHighlightingLexer(){
        return new PuiLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType){
        return keys.getOrDefault(tokenType, EMPTY_KEYS);
    }

}
