package com.ss.android.ugc.aweme.benchmark;

import com.benchmark.collection.b;
import com.benchmark.collection.f;
import com.benchmark.strategy.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import h.f.b.l;
import h.q;
import h.r;

public final class BenchmarkServiceImpl implements IBenchmarkService {
    static {
        Covode.recordClassIndex(42244);
    }

    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkService
    public final void a() {
        b bVar = b.f6115a;
        l.b(bVar, "");
        f a2 = bVar.a();
        if (a2 != null) {
            a2.b();
        }
    }

    public static IBenchmarkService c() {
        MethodCollector.i(9429);
        Object a2 = com.ss.android.ugc.b.a(IBenchmarkService.class, false);
        if (a2 != null) {
            IBenchmarkService iBenchmarkService = (IBenchmarkService) a2;
            MethodCollector.o(9429);
            return iBenchmarkService;
        }
        if (com.ss.android.ugc.b.V == null) {
            synchronized (IBenchmarkService.class) {
                try {
                    if (com.ss.android.ugc.b.V == null) {
                        com.ss.android.ugc.b.V = new BenchmarkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9429);
                    throw th;
                }
            }
        }
        BenchmarkServiceImpl benchmarkServiceImpl = (BenchmarkServiceImpl) com.ss.android.ugc.b.V;
        MethodCollector.o(9429);
        return benchmarkServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkService
    public final float b() {
        Object obj;
        try {
            obj = q.m223constructorimpl(Float.valueOf(a.f6346b.a(com.benchmark.port.a.f6311a.f6320j)));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        Float f2 = (Float) obj;
        if (f2 != null) {
            return f2.floatValue();
        }
        return 0.0f;
    }

    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkService
    public final void a(int i2) {
        b bVar = b.f6115a;
        l.b(bVar, "");
        f a2 = bVar.a();
        if (a2 != null) {
            a2.a(i2);
        }
    }
}
