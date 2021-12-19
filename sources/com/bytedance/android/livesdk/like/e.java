package com.bytedance.android.livesdk.like;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final GestureDetector f18331a;

    static {
        Covode.recordClassIndex(10320);
    }

    e(GestureDetector gestureDetector) {
        this.f18331a = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f18331a.onTouchEvent(motionEvent);
    }
}
