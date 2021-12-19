package com.ss.android.ugc.aweme.mix;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public class MixHelperService implements IMixHelperService {
    static {
        Covode.recordClassIndex(70236);
    }

    public static IMixHelperService a() {
        MethodCollector.i(5300);
        Object a2 = b.a(IMixHelperService.class, false);
        if (a2 != null) {
            IMixHelperService iMixHelperService = (IMixHelperService) a2;
            MethodCollector.o(5300);
            return iMixHelperService;
        }
        if (b.cA == null) {
            synchronized (IMixHelperService.class) {
                try {
                    if (b.cA == null) {
                        b.cA = new MixHelperService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5300);
                    throw th;
                }
            }
        }
        MixHelperService mixHelperService = (MixHelperService) b.cA;
        MethodCollector.o(5300);
        return mixHelperService;
    }
}
