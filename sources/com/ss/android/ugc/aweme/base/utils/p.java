package com.ss.android.ugc.aweme.base.utils;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final /* synthetic */ class p implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static final View.OnTouchListener f68444a = new p();

    static {
        Covode.recordClassIndex(42144);
    }

    private p() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setScaleX(0.8f);
            view.setScaleY(0.8f);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(40).start();
            return false;
        }
    }
}
