// Generated by JFlex 1.9.1 http://jflex.de/  (tweaked for IntelliJ platform)
// source: PuiLexer.flex

// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;


class PuiLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_COMPONENT = 2;
  public static final int WAITING_OPEN_BRACKET = 4;
  public static final int WAITING_CLOSE_BRACKET = 6;
  public static final int WAITING_VALUE = 8;
  public static final int COMPONENT = 10;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\2\u1f00\1\u2000\7\u1f00\1\u2100\1\u2200\1\u2300"+
    "\1\u1f00\1\u2400\1\u2500\2\u1f00\31\u0100\1\u2600\121\u0100\1\u2700"+
    "\4\u0100\1\u2800\1\u0100\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00"+
    "\1\u2e00\53\u0100\1\u2f00\41\u1f00\1\u0100\1\u3000\1\u3100\1\u0100"+
    "\1\u3200\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900"+
    "\1\u3a00\1\u0100\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000"+
    "\1\u4100\1\u1f00\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700"+
    "\1\u4800\1\u4900\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00"+
    "\1\u4f00\1\u5000\1\u1f00\3\u0100\1\u5100\1\u5200\1\u5300\12\u1f00"+
    "\4\u0100\1\u5400\17\u1f00\2\u0100\1\u5500\41\u1f00\2\u0100\1\u5600"+
    "\1\u5700\2\u1f00\1\u5800\1\u5900\27\u0100\1\u5a00\2\u0100\1\u5b00"+
    "\45\u1f00\1\u0100\1\u5c00\1\u5d00\11\u1f00\1\u5e00\24\u1f00\1\u5f00"+
    "\1\u6000\1\u1f00\1\u6100\1\u6200\1\u6300\1\u6400\2\u1f00\1\u6500"+
    "\5\u1f00\1\u6600\1\u6700\1\u6800\5\u1f00\1\u6900\1\u6a00\4\u1f00"+
    "\1\u6b00\2\u1f00\1\u6c00\16\u1f00\246\u0100\1\u6d00\20\u0100\1\u6e00"+
    "\1\u6f00\25\u0100\1\u7000\34\u0100\1\u7100\14\u1f00\2\u0100\1\u7200"+
    "\u0b06\u1f00\1\u2700\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\5\1\22\0\1\1\1\2\1\3\4\0\1\4"+
    "\1\5\1\6\1\0\1\7\1\10\1\7\1\11\1\12"+
    "\12\13\1\14\5\0\1\15\4\16\1\17\25\16\1\12"+
    "\1\20\1\12\1\0\1\21\1\0\1\22\1\16\1\23"+
    "\1\16\1\24\2\16\1\25\4\16\1\26\1\27\1\30"+
    "\1\31\1\16\1\32\1\16\1\33\1\34\1\16\1\35"+
    "\1\36\1\16\1\37\1\40\1\0\1\41\7\0\1\1"+
    "\32\0\1\1\11\0\1\16\12\0\1\16\4\0\1\16"+
    "\5\0\27\16\1\0\37\16\1\0\u01ca\16\4\0\14\16"+
    "\16\0\5\16\7\0\1\16\1\0\1\16\21\0\165\16"+
    "\1\0\2\16\2\0\4\16\1\0\1\16\6\0\1\16"+
    "\1\0\3\16\1\0\1\16\1\0\24\16\1\0\123\16"+
    "\1\0\213\16\1\0\255\16\1\0\46\16\2\0\1\16"+
    "\6\0\51\16\10\0\55\16\1\0\1\16\1\0\2\16"+
    "\1\0\2\16\1\0\1\16\10\0\33\16\4\0\4\16"+
    "\35\0\13\16\5\0\112\16\4\0\146\16\1\0\10\16"+
    "\2\0\12\16\1\0\23\16\2\0\1\16\20\0\73\16"+
    "\2\0\145\16\16\0\66\16\4\0\1\16\2\0\1\16"+
    "\2\0\56\16\22\0\34\16\4\0\13\16\65\0\25\16"+
    "\1\0\10\16\25\0\17\16\1\0\201\16\2\0\12\16"+
    "\1\0\23\16\1\0\10\16\2\0\2\16\2\0\26\16"+
    "\1\0\7\16\1\0\1\16\3\0\4\16\2\0\11\16"+
    "\2\0\2\16\2\0\4\16\10\0\1\16\4\0\2\16"+
    "\1\0\5\16\2\0\14\16\12\0\1\16\1\0\1\16"+
    "\2\0\3\16\1\0\6\16\4\0\2\16\2\0\26\16"+
    "\1\0\7\16\1\0\2\16\1\0\2\16\1\0\2\16"+
    "\2\0\1\16\1\0\5\16\4\0\2\16\2\0\3\16"+
    "\3\0\1\16\7\0\4\16\1\0\1\16\7\0\20\16"+
    "\13\0\3\16\1\0\11\16\1\0\3\16\1\0\26\16"+
    "\1\0\7\16\1\0\2\16\1\0\5\16\2\0\12\16"+
    "\1\0\3\16\1\0\3\16\2\0\1\16\17\0\4\16"+
    "\2\0\12\16\11\0\7\16\1\0\3\16\1\0\10\16"+
    "\2\0\2\16\2\0\26\16\1\0\7\16\1\0\2\16"+
    "\1\0\5\16\2\0\11\16\2\0\2\16\2\0\3\16"+
    "\10\0\2\16\4\0\2\16\1\0\5\16\2\0\12\16"+
    "\1\0\1\16\20\0\2\16\1\0\6\16\3\0\3\16"+
    "\1\0\4\16\3\0\2\16\1\0\1\16\1\0\2\16"+
    "\3\0\2\16\3\0\3\16\3\0\14\16\4\0\5\16"+
    "\3\0\3\16\1\0\4\16\2\0\1\16\6\0\1\16"+
    "\16\0\12\16\20\0\15\16\1\0\3\16\1\0\27\16"+
    "\1\0\20\16\3\0\10\16\1\0\3\16\1\0\4\16"+
    "\7\0\2\16\1\0\3\16\5\0\4\16\2\0\12\16"+
    "\20\0\4\16\1\0\10\16\1\0\3\16\1\0\27\16"+
    "\1\0\12\16\1\0\5\16\2\0\11\16\1\0\3\16"+
    "\1\0\4\16\7\0\2\16\7\0\1\16\1\0\4\16"+
    "\2\0\12\16\1\0\2\16\15\0\4\16\1\0\10\16"+
    "\1\0\3\16\1\0\63\16\1\0\3\16\1\0\5\16"+
    "\5\0\4\16\7\0\5\16\2\0\12\16\12\0\6\16"+
    "\2\0\2\16\1\0\22\16\3\0\30\16\1\0\11\16"+
    "\1\0\1\16\2\0\7\16\3\0\1\16\4\0\6\16"+
    "\1\0\1\16\1\0\10\16\6\0\12\16\2\0\2\16"+
    "\15\0\72\16\5\0\17\16\1\0\12\16\47\0\2\16"+
    "\1\0\1\16\1\0\5\16\1\0\30\16\1\0\1\16"+
    "\1\0\27\16\2\0\5\16\1\0\1\16\1\0\6\16"+
    "\2\0\12\16\2\0\4\16\40\0\1\16\27\0\2\16"+
    "\6\0\12\16\13\0\1\16\1\0\1\16\1\0\1\16"+
    "\4\0\12\16\1\0\44\16\4\0\24\16\1\0\22\16"+
    "\1\0\44\16\11\0\1\16\71\0\112\16\6\0\116\16"+
    "\2\0\46\16\1\0\1\16\5\0\1\16\2\0\53\16"+
    "\1\0\115\16\1\0\4\16\2\0\7\16\1\0\1\16"+
    "\1\0\4\16\2\0\51\16\1\0\4\16\2\0\41\16"+
    "\1\0\4\16\2\0\7\16\1\0\1\16\1\0\4\16"+
    "\2\0\17\16\1\0\71\16\1\0\4\16\2\0\103\16"+
    "\2\0\3\16\40\0\20\16\20\0\126\16\2\0\6\16"+
    "\3\0\u016c\16\2\0\21\16\1\1\32\16\5\0\113\16"+
    "\3\0\13\16\7\0\15\16\1\0\7\16\13\0\25\16"+
    "\13\0\24\16\14\0\15\16\1\0\3\16\1\0\2\16"+
    "\14\0\124\16\3\0\1\16\4\0\2\16\2\0\12\16"+
    "\41\0\3\16\2\0\12\16\6\0\131\16\7\0\53\16"+
    "\5\0\106\16\12\0\37\16\1\0\14\16\4\0\14\16"+
    "\12\0\50\16\2\0\5\16\13\0\54\16\4\0\32\16"+
    "\6\0\12\16\46\0\34\16\4\0\77\16\1\0\35\16"+
    "\2\0\13\16\6\0\12\16\15\0\1\16\10\0\17\16"+
    "\101\0\114\16\4\0\12\16\21\0\11\16\14\0\164\16"+
    "\14\0\70\16\10\0\12\16\3\0\61\16\2\0\11\16"+
    "\7\0\53\16\2\0\3\16\20\0\3\16\1\0\47\16"+
    "\5\0\372\16\1\0\33\16\2\0\6\16\2\0\46\16"+
    "\2\0\6\16\2\0\10\16\1\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\37\16\2\0\65\16\1\0\7\16"+
    "\1\0\1\16\3\0\3\16\1\0\7\16\3\0\4\16"+
    "\2\0\6\16\4\0\15\16\5\0\3\16\1\0\7\16"+
    "\3\0\13\1\35\0\2\1\5\0\1\1\17\0\2\16"+
    "\23\0\1\16\12\0\1\1\21\0\1\16\15\0\1\16"+
    "\20\0\15\16\63\0\41\16\21\0\1\16\4\0\1\16"+
    "\2\0\12\16\1\0\1\16\3\0\5\16\6\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\4\16\1\0\13\16"+
    "\2\0\4\16\5\0\5\16\4\0\1\16\21\0\51\16"+
    "\u022d\0\64\16\26\0\57\16\1\0\57\16\1\0\205\16"+
    "\6\0\11\16\14\0\46\16\1\0\1\16\5\0\1\16"+
    "\2\0\70\16\7\0\1\16\17\0\30\16\11\0\7\16"+
    "\1\0\7\16\1\0\7\16\1\0\7\16\1\0\7\16"+
    "\1\0\7\16\1\0\7\16\1\0\7\16\1\0\40\16"+
    "\57\0\1\16\320\0\1\1\4\0\3\16\31\0\17\16"+
    "\1\0\5\16\2\0\5\16\4\0\126\16\2\0\2\16"+
    "\2\0\3\16\1\0\132\16\1\0\4\16\5\0\53\16"+
    "\1\0\136\16\21\0\33\16\65\0\306\16\112\0\360\16"+
    "\20\0\215\16\103\0\56\16\2\0\15\16\3\0\34\16"+
    "\24\0\63\16\1\0\12\16\1\0\163\16\45\0\11\16"+
    "\2\0\147\16\2\0\65\16\2\0\5\16\60\0\61\16"+
    "\30\0\64\16\14\0\106\16\12\0\12\16\6\0\30\16"+
    "\3\0\1\16\1\0\61\16\2\0\44\16\14\0\35\16"+
    "\3\0\101\16\16\0\13\16\6\0\37\16\1\0\67\16"+
    "\11\0\16\16\2\0\12\16\6\0\27\16\3\0\111\16"+
    "\30\0\3\16\2\0\20\16\2\0\5\16\12\0\6\16"+
    "\2\0\6\16\2\0\6\16\11\0\7\16\1\0\7\16"+
    "\1\0\53\16\1\0\14\16\10\0\173\16\1\0\2\16"+
    "\2\0\12\16\6\0\244\16\14\0\27\16\4\0\61\16"+
    "\4\0\156\16\2\0\152\16\46\0\7\16\14\0\5\16"+
    "\5\0\14\16\1\0\15\16\1\0\5\16\1\0\1\16"+
    "\1\0\2\16\1\0\2\16\1\0\154\16\41\0\153\16"+
    "\22\0\100\16\2\0\66\16\50\0\14\16\4\0\20\16"+
    "\20\0\20\16\3\0\2\16\30\0\3\16\40\0\5\16"+
    "\1\0\207\16\23\0\12\16\7\0\32\16\4\0\1\16"+
    "\1\0\32\16\13\0\131\16\3\0\6\16\2\0\6\16"+
    "\2\0\6\16\2\0\3\16\43\0\14\16\1\0\32\16"+
    "\1\0\23\16\1\0\2\16\1\0\17\16\2\0\16\16"+
    "\42\0\173\16\105\0\65\16\210\0\1\16\202\0\35\16"+
    "\3\0\61\16\17\0\1\16\37\0\40\16\15\0\36\16"+
    "\5\0\53\16\5\0\36\16\2\0\44\16\4\0\10\16"+
    "\1\0\5\16\52\0\236\16\2\0\12\16\6\0\44\16"+
    "\4\0\44\16\4\0\50\16\10\0\64\16\234\0\67\16"+
    "\11\0\26\16\12\0\10\16\230\0\6\16\2\0\1\16"+
    "\1\0\54\16\1\0\2\16\3\0\1\16\2\0\27\16"+
    "\12\0\27\16\11\0\37\16\101\0\23\16\1\0\2\16"+
    "\12\0\26\16\12\0\32\16\106\0\70\16\6\0\2\16"+
    "\100\0\4\16\1\0\2\16\5\0\10\16\1\0\3\16"+
    "\1\0\35\16\2\0\3\16\4\0\1\16\40\0\35\16"+
    "\3\0\35\16\43\0\10\16\1\0\36\16\31\0\66\16"+
    "\12\0\26\16\12\0\23\16\15\0\22\16\156\0\111\16"+
    "\67\0\63\16\15\0\63\16\15\0\50\16\10\0\12\16"+
    "\306\0\35\16\12\0\1\16\10\0\41\16\217\0\27\16"+
    "\11\0\107\16\37\0\12\16\17\0\74\16\25\0\31\16"+
    "\7\0\12\16\6\0\65\16\1\0\12\16\4\0\3\16"+
    "\11\0\44\16\2\0\1\16\11\0\105\16\4\0\4\16"+
    "\3\0\13\16\1\0\1\16\43\0\22\16\1\0\45\16"+
    "\6\0\1\16\101\0\7\16\1\0\1\16\1\0\4\16"+
    "\1\0\17\16\1\0\12\16\7\0\73\16\5\0\12\16"+
    "\6\0\4\16\1\0\10\16\2\0\2\16\2\0\26\16"+
    "\1\0\7\16\1\0\2\16\1\0\5\16\1\0\12\16"+
    "\2\0\2\16\2\0\3\16\2\0\1\16\6\0\1\16"+
    "\5\0\7\16\2\0\7\16\3\0\5\16\213\0\113\16"+
    "\5\0\12\16\4\0\2\16\40\0\106\16\1\0\1\16"+
    "\10\0\12\16\246\0\66\16\2\0\11\16\27\0\6\16"+
    "\42\0\101\16\3\0\1\16\13\0\12\16\46\0\71\16"+
    "\7\0\12\16\66\0\33\16\2\0\17\16\4\0\12\16"+
    "\306\0\73\16\145\0\112\16\25\0\1\16\240\0\10\16"+
    "\2\0\56\16\2\0\10\16\1\0\2\16\33\0\77\16"+
    "\10\0\1\16\10\0\112\16\3\0\1\16\42\0\71\16"+
    "\7\0\11\16\1\0\55\16\1\0\11\16\17\0\12\16"+
    "\30\0\36\16\2\0\26\16\1\0\16\16\111\0\7\16"+
    "\1\0\2\16\1\0\54\16\3\0\1\16\1\0\2\16"+
    "\1\0\11\16\10\0\12\16\6\0\6\16\1\0\2\16"+
    "\1\0\45\16\1\0\2\16\1\0\6\16\7\0\12\16"+
    "\u0136\0\27\16\11\0\232\16\146\0\157\16\21\0\304\16"+
    "\274\0\57\16\321\0\107\16\271\0\71\16\7\0\37\16"+
    "\1\0\12\16\146\0\36\16\2\0\5\16\13\0\67\16"+
    "\11\0\4\16\14\0\12\16\11\0\25\16\5\0\23\16"+
    "\260\0\100\16\200\0\113\16\4\0\71\16\7\0\21\16"+
    "\100\0\2\16\1\0\1\16\34\0\370\16\10\0\363\16"+
    "\15\0\37\16\61\0\3\16\21\0\4\16\10\0\u018c\16"+
    "\4\0\153\16\5\0\15\16\3\0\11\16\7\0\12\16"+
    "\3\0\2\16\306\0\5\16\3\0\6\16\10\0\10\16"+
    "\2\0\7\16\36\0\4\16\224\0\3\16\273\0\125\16"+
    "\1\0\107\16\1\0\2\16\2\0\1\16\2\0\2\16"+
    "\2\0\4\16\1\0\14\16\1\0\1\16\1\0\7\16"+
    "\1\0\101\16\1\0\4\16\2\0\10\16\1\0\7\16"+
    "\1\0\34\16\1\0\4\16\1\0\5\16\1\0\1\16"+
    "\3\0\7\16\1\0\u0154\16\2\0\31\16\1\0\31\16"+
    "\1\0\37\16\1\0\31\16\1\0\37\16\1\0\31\16"+
    "\1\0\37\16\1\0\31\16\1\0\37\16\1\0\31\16"+
    "\1\0\10\16\2\0\151\16\4\0\62\16\10\0\1\16"+
    "\16\0\1\16\26\0\5\16\1\0\17\16\120\0\7\16"+
    "\1\0\21\16\2\0\7\16\1\0\2\16\1\0\5\16"+
    "\325\0\55\16\3\0\16\16\2\0\12\16\4\0\1\16"+
    "\u0171\0\72\16\6\0\305\16\13\0\7\16\51\0\114\16"+
    "\4\0\12\16\246\0\4\16\1\0\33\16\1\0\2\16"+
    "\1\0\1\16\2\0\1\16\1\0\12\16\1\0\4\16"+
    "\1\0\1\16\1\0\1\16\6\0\1\16\4\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\3\16\1\0\2\16"+
    "\1\0\1\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\2\16\1\0\1\16"+
    "\2\0\4\16\1\0\7\16\1\0\4\16\1\0\4\16"+
    "\1\0\1\16\1\0\12\16\1\0\21\16\5\0\3\16"+
    "\1\0\5\16\1\0\21\16\164\0\32\16\6\0\32\16"+
    "\6\0\32\16\166\0\327\16\51\0\65\16\13\0\336\16"+
    "\2\0\u0182\16\16\0\u0131\16\37\0\36\16\342\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[29440];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\3\1\1\3\1\4\1\5\1\1"+
    "\1\6\7\1\1\7\1\10\1\11\1\0\1\12\2\0"+
    "\1\13\6\0\1\14\7\0\1\15\1\6\1\15\7\0"+
    "\1\6\2\0\1\6\11\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[63];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\42\0\42"+
    "\0\42\0\314\0\356\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198"+
    "\0\u01ba\0\u01dc\0\42\0\42\0\146\0\210\0\42\0\252"+
    "\0\314\0\42\0\u0132\0\u0154\0\u01fe\0\u0220\0\u0242\0\u0264"+
    "\0\u0110\0\u0286\0\u02a8\0\u02ca\0\u02ec\0\u030e\0\u0330\0\u0352"+
    "\0\u0132\0\u0374\0\42\0\u0396\0\u03b8\0\u03da\0\u03fc\0\u041e"+
    "\0\u0440\0\u0462\0\u0484\0\u04a6\0\u04c8\0\u0462\0\u04ea\0\u050c"+
    "\0\u052e\0\u0550\0\u0572\0\u0594\0\u05b6\0\u05d8\0\u05fa";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[63];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\1\2\1\13\1\2\1\14\2\15\1\16"+
    "\1\15\1\17\3\15\1\20\6\15\1\21\1\15\1\22"+
    "\1\23\1\24\43\0\1\3\51\0\1\25\1\0\2\25"+
    "\1\0\2\25\1\0\17\25\3\0\1\26\1\0\1\27"+
    "\1\0\3\26\1\0\4\26\1\0\24\26\1\0\1\30"+
    "\2\0\1\27\3\30\1\0\4\30\1\0\24\30\11\0"+
    "\1\31\1\0\1\31\1\32\1\0\2\33\1\34\1\33"+
    "\1\35\6\33\1\36\1\37\5\33\13\0\1\40\1\0"+
    "\1\13\1\32\1\0\2\33\1\34\1\33\1\35\6\33"+
    "\1\36\1\37\5\33\13\0\1\41\1\0\1\41\2\0"+
    "\2\41\1\0\17\41\13\0\1\33\1\0\1\33\1\32"+
    "\1\0\2\33\1\0\17\33\13\0\1\34\1\0\1\34"+
    "\4\0\1\34\1\0\1\42\6\0\1\43\1\44\20\0"+
    "\1\33\1\0\1\33\1\32\1\0\2\33\1\0\13\33"+
    "\1\45\3\33\13\0\1\33\1\0\1\33\1\32\1\0"+
    "\2\33\1\0\1\33\1\46\15\33\13\0\1\33\1\0"+
    "\1\33\1\32\1\0\2\33\1\0\11\33\1\47\5\33"+
    "\13\0\1\33\1\0\1\33\1\32\1\0\2\33\1\0"+
    "\3\33\1\50\13\33\13\0\1\33\1\0\1\33\1\32"+
    "\1\0\2\33\1\0\10\33\1\51\6\33\13\0\1\33"+
    "\1\0\1\33\1\32\1\0\2\33\1\0\15\33\1\51"+
    "\1\33\13\0\1\33\1\0\1\33\1\32\1\0\2\33"+
    "\1\0\4\33\1\51\7\33\1\51\2\33\13\0\1\31"+
    "\1\0\1\52\1\32\1\0\2\33\1\34\1\33\1\35"+
    "\6\33\1\36\1\37\5\33\33\0\1\53\46\0\1\53"+
    "\30\0\1\53\7\0\1\53\15\0\1\33\1\0\1\33"+
    "\1\32\1\0\2\33\1\0\12\33\1\54\4\33\13\0"+
    "\1\33\1\0\1\33\1\32\1\0\2\33\1\0\12\33"+
    "\1\55\4\33\13\0\1\33\1\0\1\33\1\32\1\0"+
    "\2\33\1\0\1\33\1\56\15\33\13\0\1\33\1\0"+
    "\1\33\1\32\1\0\2\33\1\0\11\33\1\54\5\33"+
    "\13\0\1\31\1\0\1\52\1\32\1\0\1\33\1\57"+
    "\1\34\1\33\1\35\1\33\1\57\4\33\1\36\1\37"+
    "\5\33\13\0\1\33\1\0\1\33\1\32\1\0\2\33"+
    "\1\0\7\33\1\51\7\33\13\0\1\33\1\0\1\33"+
    "\1\32\1\0\2\33\1\0\2\33\1\60\14\33\13\0"+
    "\1\33\1\0\1\33\1\32\1\0\2\33\1\0\10\33"+
    "\1\61\6\33\11\0\1\62\1\0\1\33\1\0\1\63"+
    "\1\32\1\0\2\33\1\0\17\33\13\0\1\33\1\0"+
    "\1\33\1\32\1\0\2\33\1\0\4\33\1\64\12\33"+
    "\13\0\1\33\1\0\1\33\1\32\1\0\2\33\1\0"+
    "\1\65\16\33\15\0\1\66\37\0\1\33\1\0\1\63"+
    "\1\32\1\0\2\33\1\0\17\33\13\0\1\33\1\0"+
    "\1\33\1\32\1\0\2\33\1\0\1\67\16\33\13\0"+
    "\1\33\1\0\1\33\1\32\1\0\2\33\1\0\2\33"+
    "\1\70\14\33\13\0\1\33\1\0\1\33\1\32\1\0"+
    "\2\33\1\0\10\33\1\71\6\33\13\0\1\33\1\0"+
    "\1\33\1\32\1\0\2\33\1\0\7\33\1\72\7\33"+
    "\13\0\1\33\1\0\1\33\1\32\1\0\2\33\1\0"+
    "\1\33\1\73\15\33\13\0\1\33\1\0\1\33\1\32"+
    "\1\0\2\33\1\0\6\33\1\74\10\33\13\0\1\33"+
    "\1\0\1\33\1\32\1\0\2\33\1\0\11\33\1\75"+
    "\5\33\13\0\1\33\1\0\1\33\1\32\1\0\2\33"+
    "\1\0\12\33\1\75\4\33\13\0\1\33\1\0\1\33"+
    "\1\32\1\0\2\33\1\0\3\33\1\76\13\33\13\0"+
    "\1\33\1\0\1\33\1\32\1\0\2\33\1\0\6\33"+
    "\1\77\10\33\13\0\1\33\1\0\1\33\1\32\1\0"+
    "\2\33\1\0\12\33\1\51\4\33\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[1564];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\3\11\11\1\2\11\1\1\1\0"+
    "\1\11\2\0\1\11\6\0\1\1\7\0\2\1\1\11"+
    "\7\0\1\1\2\0\1\1\11\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[63];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  protected int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  PuiLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return TokenType.BAD_CHARACTER;
            }
          // fall through
          case 14: break;
          case 2:
            { return TokenType.WHITE_SPACE;
            }
          // fall through
          case 15: break;
          case 3:
            { return PuiTypes.OPEN_BRACE;
            }
          // fall through
          case 16: break;
          case 4:
            { return PuiTypes.CLOSE_BRACE;
            }
          // fall through
          case 17: break;
          case 5:
            { return PuiTypes.COMMA;
            }
          // fall through
          case 18: break;
          case 6:
            { return PuiTypes.NUMBER;
            }
          // fall through
          case 19: break;
          case 7:
            { return PuiTypes.OPEN_BRACKET;
            }
          // fall through
          case 20: break;
          case 8:
            { return PuiTypes.CLOSE_BRACKET;
            }
          // fall through
          case 21: break;
          case 9:
            { return PuiTypes.RESOURCE;
            }
          // fall through
          case 22: break;
          case 10:
            { return PuiTypes.LITERAL;
            }
          // fall through
          case 23: break;
          case 11:
            { return PuiTypes.KEY;
            }
          // fall through
          case 24: break;
          case 12:
            { return PuiTypes.COMPONENT;
            }
          // fall through
          case 25: break;
          case 13:
            { return PuiTypes.CONSTRAINT;
            }
          // fall through
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}