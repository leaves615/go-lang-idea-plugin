// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoTypeAssertionExpr extends GoExpression {

  @NotNull
  GoExpression getExpression();

  @NotNull
  GoType getType();

  @NotNull
  PsiElement getDot();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
