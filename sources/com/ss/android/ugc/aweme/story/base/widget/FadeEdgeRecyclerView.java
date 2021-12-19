package com.ss.android.ugc.aweme.story.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.c;
import h.f.b.l;

public final class FadeEdgeRecyclerView extends RecyclerView {
    private int O;

    static {
        Covode.recordClassIndex(89499);
    }

    public FadeEdgeRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final float getBottomFadingEdgeStrength() {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public final int getMaxHeight() {
        return this.O;
    }

    /* access modifiers changed from: protected */
    public final float getLeftFadingEdgeStrength() {
        if (c.a(getContext())) {
            return 1.0f;
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public final float getRightFadingEdgeStrength() {
        if (c.a(getContext())) {
            return 0.0f;
        }
        return 1.0f;
    }

    public final void setMaxHeight(int i2) {
        this.O = i2;
        invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onMeasure(int i2, int i3) {
        int i4 = this.O;
        if (i4 > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
    }

    private /* synthetic */ FadeEdgeRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FadeEdgeRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        addOnAttachStateChangeListener(new f());
    }
}
