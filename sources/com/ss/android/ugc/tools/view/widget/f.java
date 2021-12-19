package com.ss.android.ugc.tools.view.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class f implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public View.OnTouchListener f150439a = null;

    /* renamed from: b  reason: collision with root package name */
    private final float f150440b = 0.5f;

    /* renamed from: c  reason: collision with root package name */
    private final long f150441c = 200;

    static {
        Covode.recordClassIndex(98924);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().alpha(this.f150440b).setDuration(this.f150441c).start();
        } else if (action == 1 || action == 3) {
            view.animate().alpha(1.0f).setDuration(this.f150441c).start();
        }
        View.OnTouchListener onTouchListener = this.f150439a;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }
}
