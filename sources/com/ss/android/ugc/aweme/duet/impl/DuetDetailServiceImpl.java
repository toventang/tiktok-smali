package com.ss.android.ugc.aweme.duet.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.detail.operators.aa;
import com.ss.android.ugc.aweme.duet.a.d;
import com.ss.android.ugc.aweme.tools.detail.IDuetDetailService;
import com.ss.android.ugc.b;

public final class DuetDetailServiceImpl implements IDuetDetailService {
    static {
        Covode.recordClassIndex(52450);
    }

    public static IDuetDetailService a() {
        MethodCollector.i(10445);
        Object a2 = b.a(IDuetDetailService.class, false);
        if (a2 != null) {
            IDuetDetailService iDuetDetailService = (IDuetDetailService) a2;
            MethodCollector.o(10445);
            return iDuetDetailService;
        }
        if (b.bg == null) {
            synchronized (IDuetDetailService.class) {
                try {
                    if (b.bg == null) {
                        b.bg = new DuetDetailServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10445);
                    throw th;
                }
            }
        }
        DuetDetailServiceImpl duetDetailServiceImpl = (DuetDetailServiceImpl) b.bg;
        MethodCollector.o(10445);
        return duetDetailServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IDuetDetailService
    public final aa a(a<?, ?> aVar) {
        return new d(aVar);
    }
}
