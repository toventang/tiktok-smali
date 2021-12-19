package com.bytedance.android.live.liveinteract.multiguest.g.c;

import com.bytedance.android.live.liveinteract.multiguest.g.b.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f11286a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11287b;

    static {
        Covode.recordClassIndex(6073);
    }

    e(b bVar, a aVar) {
        this.f11286a = bVar;
        this.f11287b = aVar;
    }

    public final void run() {
        MethodCollector.i(6417);
        b bVar = this.f11286a;
        bVar.f11264b.removeView(this.f11287b);
        MethodCollector.o(6417);
    }
}
