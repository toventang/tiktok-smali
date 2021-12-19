package com.ss.android.ugc.aweme.commerce.sdk.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.b;

public final class CommerceService extends EmptyCommerceService {
    static {
        Covode.recordClassIndex(45234);
    }

    public static ICommerceService createICommerceServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(1115);
        Object a2 = b.a(ICommerceService.class, z);
        if (a2 != null) {
            ICommerceService iCommerceService = (ICommerceService) a2;
            MethodCollector.o(1115);
            return iCommerceService;
        }
        if (b.ah == null) {
            synchronized (ICommerceService.class) {
                try {
                    if (b.ah == null) {
                        b.ah = new CommerceService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1115);
                    throw th;
                }
            }
        }
        EmptyCommerceService emptyCommerceService = (EmptyCommerceService) b.ah;
        MethodCollector.o(1115);
        return emptyCommerceService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02b3  */
    @Override // com.ss.android.ugc.aweme.commerce.service.ICommerceService, com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logCommerceEvents(java.lang.String r3, com.ss.android.ugc.aweme.commerce.service.a.a r4) {
        /*
        // Method dump skipped, instructions count: 902
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService.logCommerceEvents(java.lang.String, com.ss.android.ugc.aweme.commerce.service.a.a):void");
    }
}
