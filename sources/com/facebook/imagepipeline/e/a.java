package com.facebook.imagepipeline.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f47830a = a(2, new l("FrescoIoBoundExecutor"));

    /* renamed from: b  reason: collision with root package name */
    private final Executor f47831b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f47832c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f47833d;

    static {
        Covode.recordClassIndex(28969);
    }

    @Override // com.facebook.imagepipeline.e.e
    public final Executor a() {
        return this.f47830a;
    }

    @Override // com.facebook.imagepipeline.e.e
    public final Executor b() {
        return this.f47830a;
    }

    @Override // com.facebook.imagepipeline.e.e
    public final Executor c() {
        return this.f47831b;
    }

    @Override // com.facebook.imagepipeline.e.e
    public final Executor d() {
        return this.f47832c;
    }

    @Override // com.facebook.imagepipeline.e.e
    public final Executor e() {
        return this.f47833d;
    }

    public a(int i2) {
        this.f47831b = a(i2, new l("FrescoDecodeExecutor"));
        this.f47832c = a(i2, new l("FrescoBackgroundExecutor"));
        this.f47833d = a(1, new l("FrescoLightWeightBackgroundExecutor"));
    }

    private static ExecutorService a(int i2, ThreadFactory threadFactory) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = i2;
        a2.f79178g = threadFactory;
        return g.a(a2.a());
    }
}
