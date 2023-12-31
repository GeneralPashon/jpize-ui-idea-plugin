// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package online.generalpashon.jpizeuihighlighter.lexer;

import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.lexer.PuiTypes;
import com.intellij.psi.TokenType;
import com.intellij.lexer.FlexLexer;

%%

%class PuiLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}



%states WAITING_COMPONENT, WAITING_OPEN_BRACKET, WAITING_CLOSE_BRACKET, WAITING_VALUE, COMPONENT
%state WAITING_COMPONENT

NL = \n | \r | \r\n
SPACES = \s+

%%
{SPACES}                                                          { return TokenType.WHITE_SPACE; }

"{"                                                               { return PuiTypes.OPEN_BRACKET; }
"}"                                                               { return PuiTypes.CLOSE_BRACKET; }
"("                                                               { return PuiTypes.OPEN_BRACE; }
")"                                                               { return PuiTypes.CLOSE_BRACE; }
","                                                               { return PuiTypes.COMMA; }

"="                                                               { return PuiTypes.ASSIGN; }
"#"(.*[^\n\r])?                                                   { return PuiTypes.COMMENT; }
"@"[\w\.]+                                                        { return PuiTypes.COMPONENT; }
(([0-9\\.]+(px|rw|rh|ap))|auto|zero|match_parent|wrap_content)    { return PuiTypes.CONSTRAINT; }
(\'(\\.|[^\'\\])*\')|(\"(\\.|[^\"\\])*\")                         { return PuiTypes.LITERAL; }
[0-9]+((\.[0-9]+)((e|E)(\+|\-)?[0-9]+)?)?                         { return PuiTypes.NUMBER; }
[\w\.]+:                                                          { return PuiTypes.KEY; }
"!"[\w\.\:]+                                                      { return PuiTypes.RESOURCE; }
"$"[\w\.]+                                                        { return PuiTypes.ALIAS; }

{NL}                                                              { return TokenType.NEW_LINE_INDENT; }
[^]                                                               { return TokenType.BAD_CHARACTER; }