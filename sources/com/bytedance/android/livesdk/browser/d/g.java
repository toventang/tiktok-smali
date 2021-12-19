package com.bytedance.android.livesdk.browser.d;

import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.container.e.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f14353a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14354b;

    static {
        Covode.recordClassIndex(7951);
    }

    g(a aVar, int i2) {
        this.f14353a = aVar;
        this.f14354b = i2;
    }

    public final void run() {
        a aVar = this.f14353a;
        int i2 = this.f14354b;
        View f2 = aVar.p.f();
        if (f2 != null) {
            a.a(f2, y.a((float) i2));
        }
        if (aVar.f14331f != null) {
            a.a(aVar.f14331f, y.a((float) i2));
        }
    }
}
