package com.ss.android.ugc.aweme.benchmark;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bl.IBenchmarkInitService;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.b;

public final class BenchmarkInitService implements IBenchmarkInitService {
    static {
        Covode.recordClassIndex(42243);
    }

    @Override // com.ss.android.ugc.aweme.bl.IBenchmarkInitService
    public final w a() {
        return new BenchmarkInitRequest();
    }

    public static IBenchmarkInitService b() {
        MethodCollector.i(9088);
        Object a2 = b.a(IBenchmarkInitService.class, false);
        if (a2 != null) {
            IBenchmarkInitService iBenchmarkInitService = (IBenchmarkInitService) a2;
            MethodCollector.o(9088);
            return iBenchmarkInitService;
        }
        if (b.U == null) {
            synchronized (IBenchmarkInitService.class) {
                try {
                    if (b.U == null) {
                        b.U = new BenchmarkInitService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9088);
                    throw th;
                }
            }
        }
        BenchmarkInitService benchmarkInitService = (BenchmarkInitService) b.U;
        MethodCollector.o(9088);
        return benchmarkInitService;
    }
}
