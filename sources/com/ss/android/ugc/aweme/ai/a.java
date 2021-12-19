package com.ss.android.ugc.aweme.ai;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public View.OnTouchListener f66328a = null;

    /* renamed from: b  reason: collision with root package name */
    private final float f66329b;

    /* renamed from: c  reason: collision with root package name */
    private final long f66330c = 150;

    static {
        Covode.recordClassIndex(40759);
    }

    public a(float f2) {
        this.f66329b = f2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().alpha(this.f66329b).setDuration(this.f66330c).start();
        } else if (action == 1 || action == 3) {
            view.animate().alpha(1.0f).setDuration(this.f66330c).start();
        }
        View.OnTouchListener onTouchListener = this.f66328a;
        if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }
}
