package com.bytedance.android.live.broadcast.stream.capture;

import android.view.Surface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f8561a;

    /* renamed from: b  reason: collision with root package name */
    private final Surface f8562b;

    static {
        Covode.recordClassIndex(4391);
    }

    h(g gVar, Surface surface) {
        this.f8561a = gVar;
        this.f8562b = surface;
    }

    public final void run() {
        g gVar = this.f8561a;
        Surface surface = this.f8562b;
        if (gVar.f8548b != null) {
            gVar.f8548b.a(surface);
        }
    }
}
