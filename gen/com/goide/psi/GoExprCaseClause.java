// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoExprCaseClause extends GoCompositeElement {

  @NotNull
  GoExprSwitchCase getExprSwitchCase();

  @NotNull
  List<GoStatement> getStatementList();

  @NotNull
  PsiElement getColon();

}