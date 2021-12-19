package com.bytedance.ies.dmt.ui.dialog;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.c.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final View f33447a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f33448b;

    static {
        Covode.recordClassIndex(19958);
    }

    l(View view, boolean z) {
        this.f33447a = view;
        this.f33448b = z;
    }

    public final void run() {
        View view = this.f33447a;
        boolean z = this.f33448b;
        int height = (int) (((float) view.getHeight()) * 0.075f);
        long j2 = z ? 300 : 100;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        fArr[0] = z ? 0.0f : 1.0f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        ofFloat.setDuration(j2);
        ofFloat.addUpdateListener(new m(height, view, z));
        ofFloat.setInterpolator(new c());
        ofFloat.start();
    }
}
