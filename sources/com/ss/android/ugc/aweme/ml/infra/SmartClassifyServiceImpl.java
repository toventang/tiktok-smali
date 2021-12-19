package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public final class SmartClassifyServiceImpl extends SmartClassifyService {
    static {
        Covode.recordClassIndex(70975);
    }

    public static ISmartClassifyService a() {
        MethodCollector.i(7307);
        Object a2 = b.a(ISmartClassifyService.class, false);
        if (a2 != null) {
            ISmartClassifyService iSmartClassifyService = (ISmartClassifyService) a2;
            MethodCollector.o(7307);
            return iSmartClassifyService;
        }
        if (b.cJ == null) {
            synchronized (ISmartClassifyService.class) {
                try {
                    if (b.cJ == null) {
                        b.cJ = new SmartClassifyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7307);
                    throw th;
                }
            }
        }
        SmartClassifyService smartClassifyService = (SmartClassifyService) b.cJ;
        MethodCollector.o(7307);
        return smartClassifyService;
    }
}
