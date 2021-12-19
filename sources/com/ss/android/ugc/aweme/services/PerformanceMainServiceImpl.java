package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.PerformanceMainService;
import com.ss.android.ugc.aweme.settingsrequest.e.a;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.b;

public final class PerformanceMainServiceImpl implements PerformanceMainService {
    static {
        Covode.recordClassIndex(79535);
    }

    private final void preloadInstance(Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.PerformanceMainService
    public final Activity newAddWikiActivity() {
        return new AddWikiActivity();
    }

    @Override // com.ss.android.ugc.aweme.PerformanceMainService
    public final void preloadPushSettingsManager() {
        preloadInstance(a.f123216a);
    }

    public static PerformanceMainService createPerformanceMainServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(3123);
        Object a2 = b.a(PerformanceMainService.class, z);
        if (a2 != null) {
            PerformanceMainService performanceMainService = (PerformanceMainService) a2;
            MethodCollector.o(3123);
            return performanceMainService;
        }
        if (b.dy == null) {
            synchronized (PerformanceMainService.class) {
                try {
                    if (b.dy == null) {
                        b.dy = new PerformanceMainServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3123);
                    throw th;
                }
            }
        }
        PerformanceMainServiceImpl performanceMainServiceImpl = (PerformanceMainServiceImpl) b.dy;
        MethodCollector.o(3123);
        return performanceMainServiceImpl;
    }
}
