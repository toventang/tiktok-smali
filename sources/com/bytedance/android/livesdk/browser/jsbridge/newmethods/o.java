package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final d f14701a;

    static {
        Covode.recordClassIndex(8163);
    }

    o(d dVar) {
        this.f14701a = dVar;
    }

    public final void run() {
        this.f14701a.dismissAllowingStateLoss();
    }
}
