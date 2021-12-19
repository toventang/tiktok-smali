package com.bytedance.android.livesdk.feed.i;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final m f17546a;

    static {
        Covode.recordClassIndex(9714);
    }

    n(m mVar) {
        this.f17546a = mVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m mVar = this.f17546a;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            mVar.f17534a.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
        mVar.f17534a.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
