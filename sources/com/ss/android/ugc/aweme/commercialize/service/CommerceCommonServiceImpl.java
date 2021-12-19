package com.ss.android.ugc.aweme.commercialize.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.log.ad;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.b;

public final class CommerceCommonServiceImpl implements ICommerceCommonService {
    static {
        Covode.recordClassIndex(46451);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService
    public final ad a() {
        return d.f74778a;
    }

    public static ICommerceCommonService b() {
        MethodCollector.i(2740);
        Object a2 = b.a(ICommerceCommonService.class, false);
        if (a2 != null) {
            ICommerceCommonService iCommerceCommonService = (ICommerceCommonService) a2;
            MethodCollector.o(2740);
            return iCommerceCommonService;
        }
        if (b.av == null) {
            synchronized (ICommerceCommonService.class) {
                try {
                    if (b.av == null) {
                        b.av = new CommerceCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2740);
                    throw th;
                }
            }
        }
        CommerceCommonServiceImpl commerceCommonServiceImpl = (CommerceCommonServiceImpl) b.av;
        MethodCollector.o(2740);
        return commerceCommonServiceImpl;
    }
}
