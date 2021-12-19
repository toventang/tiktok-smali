package com.bytedance.android.live.core.paging.c;

import androidx.h.g;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f9188a;

    /* renamed from: b  reason: collision with root package name */
    private final g.e f9189b;

    /* renamed from: c  reason: collision with root package name */
    private final g.c f9190c;

    static {
        Covode.recordClassIndex(4705);
    }

    g(c cVar, g.e eVar, g.c cVar2) {
        this.f9188a = cVar;
        this.f9189b = eVar;
        this.f9190c = cVar2;
    }

    public final void run() {
        this.f9188a.b(this.f9189b, this.f9190c);
    }
}
