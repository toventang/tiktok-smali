package com.bytedance.ies.dmt.ui.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private float f33633a = 0.5f;

    /* renamed from: b  reason: collision with root package name */
    private float f33634b = 1.0f;

    static {
        Covode.recordClassIndex(20026);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setAlpha(this.f33633a);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            view.setAlpha(this.f33634b);
            return false;
        }
    }
}
