// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;

import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import static online.generalpashon.jpizeuihighlighter.lexer.PuiTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PuiParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return pui_file(b, l + 1);
  }

  /* ********************************************************** */
  // ALIAS ASSIGN value
  public static boolean alias_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alias_block")) return false;
    if (!nextTokenIs(b, ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ALIAS, ASSIGN);
    r = r && value(b, l + 1);
    exit_section_(b, m, ALIAS_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // vector
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vector(b, l + 1);
    exit_section_(b, m, ARGUMENTS, r);
    return r;
  }

  /* ********************************************************** */
  // COMPONENT arguments? OPEN_BRACKET (component_block|field|COMMENT)* CLOSE_BRACKET
  public static boolean component_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_block")) return false;
    if (!nextTokenIs(b, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMPONENT);
    r = r && component_block_1(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKET);
    r = r && component_block_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, COMPONENT_BLOCK, r);
    return r;
  }

  // arguments?
  private static boolean component_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_block_1")) return false;
    arguments(b, l + 1);
    return true;
  }

  // (component_block|field|COMMENT)*
  private static boolean component_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_block_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!component_block_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "component_block_3", c)) break;
    }
    return true;
  }

  // component_block|field|COMMENT
  private static boolean component_block_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "component_block_3_0")) return false;
    boolean r;
    r = component_block(b, l + 1);
    if (!r) r = field(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // KEY value
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    r = r && value(b, l + 1);
    exit_section_(b, m, FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACKET (field|COMMENT)* CLOSE_BRACKET
  public static boolean group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && group_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, GROUP, r);
    return r;
  }

  // (field|COMMENT)*
  private static boolean group_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!group_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "group_1", c)) break;
    }
    return true;
  }

  // field|COMMENT
  private static boolean group_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_1_0")) return false;
    boolean r;
    r = field(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // (alias_block|COMMENT)* component_block
  static boolean pui_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pui_file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pui_file_0(b, l + 1);
    r = r && component_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (alias_block|COMMENT)*
  private static boolean pui_file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pui_file_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!pui_file_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pui_file_0", c)) break;
    }
    return true;
  }

  // alias_block|COMMENT
  private static boolean pui_file_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pui_file_0_0")) return false;
    boolean r;
    r = alias_block(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // NUMBER|CONSTRAINT|LITERAL|RESOURCE|ALIAS
  public static boolean single_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_VALUE, "<single value>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, CONSTRAINT);
    if (!r) r = consumeToken(b, LITERAL);
    if (!r) r = consumeToken(b, RESOURCE);
    if (!r) r = consumeToken(b, ALIAS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // vector|group|single_value
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = vector(b, l + 1);
    if (!r) r = group(b, l + 1);
    if (!r) r = single_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACE (single_value COMMA?)* CLOSE_BRACE
  public static boolean vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && vector_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, VECTOR, r);
    return r;
  }

  // (single_value COMMA?)*
  private static boolean vector_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!vector_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "vector_1", c)) break;
    }
    return true;
  }

  // single_value COMMA?
  private static boolean vector_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_value(b, l + 1);
    r = r && vector_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean vector_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_1_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

}
