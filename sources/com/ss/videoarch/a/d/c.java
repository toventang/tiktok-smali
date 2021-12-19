package com.ss.videoarch.a.d;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.videoarch.a.c f154285a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f154286b;

    /* renamed from: c  reason: collision with root package name */
    private Future f154287c;

    static {
        Covode.recordClassIndex(102862);
    }

    public final void a() {
        Future future = this.f154287c;
        if (future != null && !future.isDone()) {
            this.f154287c.cancel(true);
            this.f154287c = null;
        }
    }

    public c(ExecutorService executorService, com.ss.videoarch.a.c cVar) {
        this.f154286b = executorService;
        this.f154285a = cVar;
    }
}
