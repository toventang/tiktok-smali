package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;

public final class UIUXBugsExperimentService implements IUIUXBugsExperimentService {
    static {
        Covode.recordClassIndex(38412);
    }

    @Override // com.ss.android.ugc.aweme.IUIUXBugsExperimentService
    public final boolean a() {
        if (b.a().a(true, "enable_uiux_enhancements", 0) == 1) {
            return true;
        }
        return false;
    }

    public static IUIUXBugsExperimentService b() {
        MethodCollector.i(9238);
        Object a2 = com.ss.android.ugc.b.a(IUIUXBugsExperimentService.class, false);
        if (a2 != null) {
            IUIUXBugsExperimentService iUIUXBugsExperimentService = (IUIUXBugsExperimentService) a2;
            MethodCollector.o(9238);
            return iUIUXBugsExperimentService;
        }
        if (com.ss.android.ugc.b.v == null) {
            synchronized (IUIUXBugsExperimentService.class) {
                try {
                    if (com.ss.android.ugc.b.v == null) {
                        com.ss.android.ugc.b.v = new UIUXBugsExperimentService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9238);
                    throw th;
                }
            }
        }
        UIUXBugsExperimentService uIUXBugsExperimentService = (UIUXBugsExperimentService) com.ss.android.ugc.b.v;
        MethodCollector.o(9238);
        return uIUXBugsExperimentService;
    }
}
