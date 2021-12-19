package com.ss.android.ugc.aweme.compliance.business.commentfilter.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import h.f.b.l;

public final class TagMaxHeightRecyclerView extends RecyclerView {
    static {
        Covode.recordClassIndex(47521);
    }

    public TagMaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(n.a(150.0d), Integer.MIN_VALUE));
    }

    private /* synthetic */ TagMaxHeightRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TagMaxHeightRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        addOnAttachStateChangeListener(new f());
    }
}
