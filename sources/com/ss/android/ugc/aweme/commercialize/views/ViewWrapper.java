package com.ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Objects;

public final class ViewWrapper {
    private final View view;

    static {
        Covode.recordClassIndex(46805);
    }

    public final View getView() {
        return this.view;
    }

    public final int getHeight() {
        return this.view.getLayoutParams().height;
    }

    public final int getWidth() {
        return this.view.getLayoutParams().width;
    }

    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        if (this.view.getParent() instanceof FrameLayout) {
            ViewGroup.LayoutParams layoutParams2 = this.view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = this.view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public ViewWrapper(View view2) {
        l.d(view2, "");
        this.view = view2;
    }

    public final void setHeight(int i2) {
        this.view.getLayoutParams().height = i2;
        this.view.requestLayout();
    }

    public final void setWidth(int i2) {
        this.view.getLayoutParams().width = i2;
        this.view.requestLayout();
    }
}
