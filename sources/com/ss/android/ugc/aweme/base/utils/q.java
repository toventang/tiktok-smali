package com.ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class q implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    static final View.OnTouchListener f68445a = new q();

    static {
        Covode.recordClassIndex(42145);
    }

    private q() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MethodCollector.i(1029);
        Context context = view.getContext();
        int action = motionEvent.getAction();
        if (action == 0) {
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.s);
            loadAnimation.setFillAfter(true);
            view.startAnimation(loadAnimation);
        } else if (action == 1 || action == 3) {
            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.t);
            loadAnimation2.setFillAfter(true);
            view.startAnimation(loadAnimation2);
        }
        MethodCollector.o(1029);
        return false;
    }
}
