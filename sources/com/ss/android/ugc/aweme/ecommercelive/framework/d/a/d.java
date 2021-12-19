package com.ss.android.ugc.aweme.ecommercelive.framework.d.a;

import com.bytedance.common.utility.b.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final ExecutorService f88038a;

    /* renamed from: b  reason: collision with root package name */
    static final ExecutorService f88039b;

    /* renamed from: c  reason: collision with root package name */
    static final ExecutorService f88040c;

    /* renamed from: d  reason: collision with root package name */
    static final ExecutorService f88041d = new com.bytedance.common.utility.b.d(c.f26897g, c.f26898h, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c("TTImmediateExecutors"));

    /* renamed from: e  reason: collision with root package name */
    public static final d f88042e = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(55339);
        ExecutorService executorService = c.f26892b;
        l.b(executorService, "");
        f88038a = executorService;
        ExecutorService executorService2 = c.f26894d;
        l.b(executorService2, "");
        f88039b = executorService2;
        ScheduledExecutorService scheduledExecutorService = c.f26893c;
        l.b(scheduledExecutorService, "");
        f88040c = scheduledExecutorService;
    }
}
