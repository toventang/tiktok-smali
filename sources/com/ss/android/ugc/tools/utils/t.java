package com.ss.android.ugc.tools.utils;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f150015a;

    /* renamed from: b  reason: collision with root package name */
    private final float f150016b;

    static {
        Covode.recordClassIndex(98763);
    }

    t(View view, float f2) {
        this.f150015a = view;
        this.f150016b = f2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f150015a;
        float f2 = this.f150016b;
        if (motionEvent.getAction() == 0) {
            s.a(view2, 1.0f, f2);
            return false;
        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        } else {
            s.a(view2, f2, 1.0f);
            return false;
        }
    }
}
