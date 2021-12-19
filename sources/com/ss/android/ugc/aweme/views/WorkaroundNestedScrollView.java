package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class WorkaroundNestedScrollView extends NestedScrollView {
    static {
        Covode.recordClassIndex(94612);
    }

    @Override // androidx.core.widget.NestedScrollView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            computeScroll();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WorkaroundNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
    }
}
