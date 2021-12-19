package com.bytedance.android.live.liveinteract.multiguest.g.c;

import com.bytedance.android.live.liveinteract.multiguest.g.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f11288a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11289b;

    static {
        Covode.recordClassIndex(6074);
    }

    f(b bVar, a aVar) {
        this.f11288a = bVar;
        this.f11289b = aVar;
    }

    public final void run() {
        MethodCollector.i(7174);
        b bVar = this.f11288a;
        bVar.f11264b.removeView(this.f11289b);
        MethodCollector.o(7174);
    }
}
