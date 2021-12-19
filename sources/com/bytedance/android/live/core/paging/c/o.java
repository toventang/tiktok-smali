package com.bytedance.android.live.core.paging.c;

import androidx.h.g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f9206a;

    /* renamed from: b  reason: collision with root package name */
    private final g.f f9207b;

    /* renamed from: c  reason: collision with root package name */
    private final g.a f9208c;

    static {
        Covode.recordClassIndex(4713);
    }

    o(c cVar, g.f fVar, g.a aVar) {
        this.f9206a = cVar;
        this.f9207b = fVar;
        this.f9208c = aVar;
    }

    public final void run() {
        this.f9206a.b(this.f9207b, this.f9208c);
    }
}
