// This is a generated file. Not intended for manual editing.
package com.r4intellij.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.r4intellij.parsing.RElementTypes.*;
import com.r4intellij.psi.api.*;

public class ROperatorExpressionImpl extends RExpressionImpl implements ROperatorExpression {

  public ROperatorExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RVisitor visitor) {
    visitor.visitOperatorExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RVisitor) accept((RVisitor)visitor);
    else super.accept(visitor);
  }

  @Nullable
  public ROperator getOperator() {
    return RPsiImplUtil.getOperator(this);
  }

  public boolean isBinary() {
    return RPsiImplUtil.isBinary(this);
  }

  public RExpression getLeftExpr() {
    return RPsiImplUtil.getLeftExpr(this);
  }

  public RExpression getRightExpr() {
    return RPsiImplUtil.getRightExpr(this);
  }

}
