// This is a generated file. Not intended for manual editing.
package online.generalpashon.jpizeuihighlighter.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static online.generalpashon.jpizeuihighlighter.lexer.PuiTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

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
  // field_single|field_group|field_vector
  public static boolean field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_single(b, l + 1);
    if (!r) r = field_group(b, l + 1);
    if (!r) r = field_vector(b, l + 1);
    exit_section_(b, m, FIELD, r);
    return r;
  }

  /* ********************************************************** */
  // KEY OPEN_BRACKET (field|COMMENT)* CLOSE_BRACKET
  public static boolean field_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_group")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY, OPEN_BRACKET);
    r = r && field_group_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, FIELD_GROUP, r);
    return r;
  }

  // (field|COMMENT)*
  private static boolean field_group_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_group_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!field_group_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "field_group_2", c)) break;
    }
    return true;
  }

  // field|COMMENT
  private static boolean field_group_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_group_2_0")) return false;
    boolean r;
    r = field(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // KEY single_value
  public static boolean field_single(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_single")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    r = r && single_value(b, l + 1);
    exit_section_(b, m, FIELD_SINGLE, r);
    return r;
  }

  /* ********************************************************** */
  // KEY vector
  public static boolean field_vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_vector")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    r = r && vector(b, l + 1);
    exit_section_(b, m, FIELD_VECTOR, r);
    return r;
  }

  /* ********************************************************** */
  // COMMENT* component_block COMMENT*
  static boolean pui_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pui_file")) return false;
    if (!nextTokenIs(b, "", COMMENT, COMPONENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pui_file_0(b, l + 1);
    r = r && component_block(b, l + 1);
    r = r && pui_file_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMENT*
  private static boolean pui_file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pui_file_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "pui_file_0", c)) break;
    }
    return true;
  }

  // COMMENT*
  private static boolean pui_file_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pui_file_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, COMMENT)) break;
      if (!empty_element_parsed_guard_(b, "pui_file_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NUMBER|CONSTRAINT|LITERAL|RESOURCE
  public static boolean single_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_VALUE, "single-value");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, CONSTRAINT);
    if (!r) r = consumeToken(b, LITERAL);
    if (!r) r = consumeToken(b, RESOURCE);
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
