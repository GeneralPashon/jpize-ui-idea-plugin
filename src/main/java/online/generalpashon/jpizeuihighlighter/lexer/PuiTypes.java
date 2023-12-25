// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import online.generalpashon.jpizeuihighlighter.parser.PuiTokenType;
import online.generalpashon.jpizeuihighlighter.parser.impl.*;

public interface PuiTypes {

  IElementType ALIAS_BLOCK = new PuiElementType("ALIAS_BLOCK");
  IElementType ARGUMENTS = new PuiElementType("ARGUMENTS");
  IElementType COMPONENT_BLOCK = new PuiElementType("COMPONENT_BLOCK");
  IElementType FIELD = new PuiElementType("FIELD");
  IElementType GROUP = new PuiElementType("GROUP");
  IElementType SINGLE_VALUE = new PuiElementType("SINGLE_VALUE");
  IElementType VALUE = new PuiElementType("VALUE");
  IElementType VECTOR = new PuiElementType("VECTOR");

  IElementType ALIAS = new PuiTokenType("ALIAS");
  IElementType ASSIGN = new PuiTokenType("ASSIGN");
  IElementType CLOSE_BRACE = new PuiTokenType("CLOSE_BRACE");
  IElementType CLOSE_BRACKET = new PuiTokenType("CLOSE_BRACKET");
  IElementType COMMA = new PuiTokenType("COMMA");
  IElementType COMMENT = new PuiTokenType("COMMENT");
  IElementType COMPONENT = new PuiTokenType("COMPONENT");
  IElementType CONSTRAINT = new PuiTokenType("CONSTRAINT");
  IElementType KEY = new PuiTokenType("KEY");
  IElementType LITERAL = new PuiTokenType("LITERAL");
  IElementType NUMBER = new PuiTokenType("NUMBER");
  IElementType OPEN_BRACE = new PuiTokenType("OPEN_BRACE");
  IElementType OPEN_BRACKET = new PuiTokenType("OPEN_BRACKET");
  IElementType RESOURCE = new PuiTokenType("RESOURCE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_BLOCK) {
        return new PuiAliasBlockImpl(node);
      }
      else if (type == ARGUMENTS) {
        return new PuiArgumentsImpl(node);
      }
      else if (type == COMPONENT_BLOCK) {
        return new PuiComponentBlockImpl(node);
      }
      else if (type == FIELD) {
        return new PuiFieldImpl(node);
      }
      else if (type == GROUP) {
        return new PuiGroupImpl(node);
      }
      else if (type == SINGLE_VALUE) {
        return new PuiSingleValueImpl(node);
      }
      else if (type == VALUE) {
        return new PuiValueImpl(node);
      }
      else if (type == VECTOR) {
        return new PuiVectorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
