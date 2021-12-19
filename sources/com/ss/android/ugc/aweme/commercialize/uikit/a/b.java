package com.ss.android.ugc.aweme.commercialize.uikit.a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f75388a;

    /* renamed from: b  reason: collision with root package name */
    private final float f75389b = 0.75f;

    /* renamed from: c  reason: collision with root package name */
    private final float f75390c;

    static {
        Covode.recordClassIndex(46527);
    }

    b(View view, float f2) {
        this.f75388a = view;
        this.f75390c = f2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.f75388a;
        float f2 = this.f75389b;
        float f3 = this.f75390c;
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
