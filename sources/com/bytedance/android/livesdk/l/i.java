package com.bytedance.android.livesdk.l;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.c.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final View f18303a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f18304b;

    static {
        Covode.recordClassIndex(10304);
    }

    i(View view, boolean z) {
        this.f18303a = view;
        this.f18304b = z;
    }

    public final void run() {
        View view = this.f18303a;
        boolean z = this.f18304b;
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
        ofFloat.addUpdateListener(new j(height, view, z));
        ofFloat.setInterpolator(new c());
        ofFloat.start();
    }
}
