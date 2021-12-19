package com.ss.android.ugc.aweme.ai;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class d implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f66341a = 1.2f;

    /* renamed from: b  reason: collision with root package name */
    private final long f66342b = 100;

    /* renamed from: c  reason: collision with root package name */
    private final View.OnTouchListener f66343c = null;

    static {
        Covode.recordClassIndex(40763);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().scaleX(this.f66341a).scaleY(this.f66341a).setDuration(this.f66342b).start();
        } else if (action == 1 || action == 3) {
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f66342b).start();
        }
        View.OnTouchListener onTouchListener = this.f66343c;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }
}
