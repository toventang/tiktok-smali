package com.bytedance.hybrid.spark.e;

import android.view.View;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final View f31182a;

    static {
        Covode.recordClassIndex(18105);
    }

    b(View view) {
        this.f31182a = view;
    }

    public final void run() {
        this.f31182a.requestLayout();
    }
}
