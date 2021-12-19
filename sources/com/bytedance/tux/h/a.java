package com.bytedance.tux.h;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.a.m;

public final class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f45085a = 0.75f;

    /* renamed from: b  reason: collision with root package name */
    private final long f45086b = 50;

    /* renamed from: c  reason: collision with root package name */
    private final m<View, MotionEvent, Boolean> f45087c = null;

    static {
        Covode.recordClassIndex(27500);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Boolean invoke;
        if (view == null || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.animate().alpha(this.f45085a).setDuration(this.f45086b).start();
        } else if (action == 1 || action == 3) {
            view.animate().alpha(1.0f).setDuration(this.f45086b).start();
        }
        m<View, MotionEvent, Boolean> mVar = this.f45087c;
        if (mVar == null || (invoke = mVar.invoke(view, motionEvent)) == null) {
            return false;
        }
        return invoke.booleanValue();
    }

    public a(float f2, long j2, m<? super View, ? super MotionEvent, Boolean> mVar) {
    }
}
