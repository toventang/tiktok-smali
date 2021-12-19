package com.ss.android.ugc.aweme.utils;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f143129a;

    /* renamed from: b  reason: collision with root package name */
    private final float f143130b = 0.75f;

    /* renamed from: c  reason: collision with root package name */
    private final float f143131c;

    static {
        Covode.recordClassIndex(93693);
    }

    k(View view, float f2) {
        this.f143129a = view;
        this.f143131c = f2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f143129a;
        float f2 = this.f143130b;
        float f3 = this.f143131c;
        int action = motionEvent.getAction();
        if (action == 0) {
            view2.animate().alpha(f2).setDuration(150).start();
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            view2.animate().alpha(f3).setDuration(150).start();
            return false;
        }
    }
}
