// Copyright 2000-2022 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import online.generalpashon.jpizeuihighlighter.lexer.JpuiTypes;
import com.intellij.psi.TokenType;

%%

%class JpuiLexer
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

"{"                                                               { return JpuiTypes.OPEN_BRACKET; }
"}"                                                               { return JpuiTypes.CLOSE_BRACKET; }
"("                                                               { return JpuiTypes.OPEN_BRACE; }
")"                                                               { return JpuiTypes.CLOSE_BRACE; }
","                                                               { return JpuiTypes.COMMA; }

"@"[\w\.]+                                                        { return JpuiTypes.COMPONENT; }
(([0-9\\.]+(px|rw|rh|ap))|auto|zero|match_parent|wrap_content)    { return JpuiTypes.CONSTRAINT; }
('[\w\s\.\/\\{}\[\]()\-\+\:]*')|(\"[\w\s\.\/\\{}\[\]()\-\+\:]*\") { return JpuiTypes.LITERAL; }
[0-9]+((\.[0-9]+)((e|E)(\+|\-)?[0-9]+)?)?                         { return JpuiTypes.NUMBER; }
[\w\.]+:                                                          { return JpuiTypes.KEY; }
"!"[\w\.\:]+                                                      { return JpuiTypes.RESOURCE; }

{NL}                                                              { return TokenType.NEW_LINE_INDENT; }
[^]                                                               { return TokenType.BAD_CHARACTER; }