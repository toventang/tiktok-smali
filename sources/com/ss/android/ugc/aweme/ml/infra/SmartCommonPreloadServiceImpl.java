package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;

public final class SmartCommonPreloadServiceImpl extends SmartCommonPreloadService {

    /* renamed from: a  reason: collision with root package name */
    private boolean f110584a;

    static {
        Covode.recordClassIndex(70980);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService
    public final void checkAndInit() {
        if (!this.f110584a) {
            this.f110584a = true;
        }
    }

    public static ISmartCommonPreloadService a() {
        MethodCollector.i(3687);
        Object a2 = b.a(ISmartCommonPreloadService.class, false);
        if (a2 != null) {
            ISmartCommonPreloadService iSmartCommonPreloadService = (ISmartCommonPreloadService) a2;
            MethodCollector.o(3687);
            return iSmartCommonPreloadService;
        }
        if (b.cK == null) {
            synchronized (ISmartCommonPreloadService.class) {
                try {
                    if (b.cK == null) {
                        b.cK = new SmartCommonPreloadServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3687);
                    throw th;
                }
            }
        }
        SmartCommonPreloadService smartCommonPreloadService = (SmartCommonPreloadService) b.cK;
        MethodCollector.o(3687);
        return smartCommonPreloadService;
    }
}
