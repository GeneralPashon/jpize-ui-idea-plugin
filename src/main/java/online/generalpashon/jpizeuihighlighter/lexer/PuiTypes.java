// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import online.generalpashon.jpizeuihighlighter.parser.PuiTokenType;
import online.generalpashon.jpizeuihighlighter.parser.impl.*;

public interface PuiTypes {

  IElementType ARGUMENTS = new PuiElementType("arguments");
  IElementType COMPONENT_BLOCK = new PuiElementType("component block");
  IElementType FIELD = new PuiElementType("field");
  IElementType FIELD_GROUP = new PuiElementType("group");
  IElementType FIELD_SINGLE = new PuiElementType("single value field");
  IElementType FIELD_VECTOR = new PuiElementType("vector field");
  IElementType SINGLE_VALUE = new PuiElementType("single value");
  IElementType VECTOR = new PuiElementType("(vector)");

  IElementType CLOSE_BRACE = new PuiTokenType(")");
  IElementType CLOSE_BRACKET = new PuiTokenType("}");
  IElementType COMMA = new PuiTokenType(",");
  IElementType COMMENT = new PuiTokenType("comment");
  IElementType COMPONENT = new PuiTokenType("@Component");
  IElementType CONSTRAINT = new PuiTokenType("constraint");
  IElementType KEY = new PuiTokenType("key:");
  IElementType LITERAL = new PuiTokenType("literal");
  IElementType NUMBER = new PuiTokenType("number");
  IElementType OPEN_BRACE = new PuiTokenType("(");
  IElementType OPEN_BRACKET = new PuiTokenType("{");
  IElementType RESOURCE = new PuiTokenType("!resource");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENTS) {
        return new PuiArgumentsImpl(node);
      }
      else if (type == COMPONENT_BLOCK) {
        return new PuiComponentBlockImpl(node);
      }
      else if (type == FIELD) {
        return new PuiFieldImpl(node);
      }
      else if (type == FIELD_GROUP) {
        return new PuiFieldGroupImpl(node);
      }
      else if (type == FIELD_SINGLE) {
        return new PuiFieldSingleImpl(node);
      }
      else if (type == FIELD_VECTOR) {
        return new PuiFieldVectorImpl(node);
      }
      else if (type == SINGLE_VALUE) {
        return new PuiSingleValueImpl(node);
      }
      else if (type == VECTOR) {
        return new PuiVectorImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
