package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public final class SmartRegressCalculateServiceImpl extends SmartRegressCalculateService {
    static {
        Covode.recordClassIndex(71003);
    }

    public static ISmartRegressCalculateService a() {
        MethodCollector.i(8155);
        Object a2 = b.a(ISmartRegressCalculateService.class, false);
        if (a2 != null) {
            ISmartRegressCalculateService iSmartRegressCalculateService = (ISmartRegressCalculateService) a2;
            MethodCollector.o(8155);
            return iSmartRegressCalculateService;
        }
        if (b.cO == null) {
            synchronized (ISmartRegressCalculateService.class) {
                try {
                    if (b.cO == null) {
                        b.cO = new SmartRegressCalculateServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8155);
                    throw th;
                }
            }
        }
        SmartRegressCalculateService smartRegressCalculateService = (SmartRegressCalculateService) b.cO;
        MethodCollector.o(8155);
        return smartRegressCalculateService;
    }
}
