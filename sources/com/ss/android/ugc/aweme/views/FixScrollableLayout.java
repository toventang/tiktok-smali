package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.social.a.c;
import h.f.b.l;

public final class FixScrollableLayout extends ScrollableLayout {
    static {
        Covode.recordClassIndex(94576);
    }

    public FixScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (c.f133649c.b() && motionEvent.getAction() == 0) {
            requestDisallowInterceptTouchEvent(true);
        }
        return dispatchTouchEvent;
    }

    private /* synthetic */ FixScrollableLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FixScrollableLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
