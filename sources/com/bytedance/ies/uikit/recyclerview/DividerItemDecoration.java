package com.bytedance.ies.uikit.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;

public class DividerItemDecoration extends RecyclerView.h {
    private static final int[] ATTRS = {16843284};
    protected Drawable mDivider;
    private boolean mDrawFirstChildTopLine;
    private boolean mDrawLastChildBottomLine;
    private int mFirstOffset;
    private int mOrientation;

    static {
        Covode.recordClassIndex(21215);
    }

    public void setFirstOffset(int i2) {
        this.mFirstOffset = i2;
    }

    public void setOrientation(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.mOrientation = i2;
            return;
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        if (!this.mDrawLastChildBottomLine) {
            childCount--;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int right = childAt.getRight() + ((RecyclerView.j) childAt.getLayoutParams()).rightMargin;
            this.mDivider.setBounds(right, paddingTop, this.mDivider.getIntrinsicHeight() + right, height);
            this.mDivider.draw(canvas);
        }
        if (this.mDrawFirstChildTopLine) {
            View childAt2 = recyclerView.getChildAt(0);
            if (RecyclerView.d(childAt2) == 0) {
                this.mDivider.setBounds(childAt2.getLeft() - ((RecyclerView.j) childAt2.getLayoutParams()).leftMargin, paddingTop, this.mDivider.getIntrinsicHeight() + paddingTop, height);
                this.mDivider.draw(canvas);
            }
        }
    }

    public void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        if (!this.mDrawLastChildBottomLine) {
            childCount--;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int bottom = childAt.getBottom() + ((RecyclerView.j) childAt.getLayoutParams()).bottomMargin;
            this.mDivider.setBounds(paddingLeft, bottom, width, (this.mDivider.getIntrinsicHeight() + bottom) - 1);
            this.mDivider.draw(canvas);
        }
        if (this.mDrawFirstChildTopLine) {
            View childAt2 = recyclerView.getChildAt(0);
            if (RecyclerView.d(childAt2) == 0) {
                int top = childAt2.getTop() - ((RecyclerView.j) childAt2.getLayoutParams()).topMargin;
                this.mDivider.setBounds(paddingLeft, (top - this.mDivider.getIntrinsicHeight()) + 1, width, top);
                this.mDivider.draw(canvas);
            }
        }
    }

    public DividerItemDecoration(Context context, int i2, int i3) {
        this(context, i2, i3, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.s sVar) {
        if (this.mOrientation == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }

    public DividerItemDecoration(Context context, int i2, int i3, boolean z) {
        this(context, i2, i3, z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.s sVar) {
        int i2;
        int d2 = RecyclerView.d(view);
        if (!this.mDrawFirstChildTopLine || d2 != 0) {
            i2 = 0;
        } else {
            i2 = this.mDivider.getIntrinsicHeight();
        }
        if (this.mOrientation == 1) {
            if (d2 == 0) {
                i2 += (int) n.b(recyclerView.getContext(), (float) this.mFirstOffset);
            }
            rect.set(0, i2, 0, this.mDivider.getIntrinsicHeight());
            return;
        }
        rect.set(0, i2, this.mDivider.getIntrinsicWidth(), 0);
    }

    public DividerItemDecoration(Context context, int i2, int i3, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        this.mDivider = context.getResources().getDrawable(i3);
        obtainStyledAttributes.recycle();
        setOrientation(i2);
        this.mDrawFirstChildTopLine = z;
        this.mDrawLastChildBottomLine = z2;
    }
}
