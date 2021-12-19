package com.ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.b;

public final class CrossLanguageUserExperiment implements ICrossLanguageUserService {
    static {
        Covode.recordClassIndex(67175);
    }

    @Override // com.ss.android.ugc.aweme.internal.ICrossLanguageUserService
    public final boolean b() {
        return c.a();
    }

    @Override // com.ss.android.ugc.aweme.internal.ICrossLanguageUserService
    public final boolean a() {
        if (b.a().a(true, "enable_cla_creator_auth_flow", 0) == b.f104777a) {
            return true;
        }
        return false;
    }

    public static ICrossLanguageUserService c() {
        MethodCollector.i(9352);
        Object a2 = com.ss.android.ugc.b.a(ICrossLanguageUserService.class, false);
        if (a2 != null) {
            ICrossLanguageUserService iCrossLanguageUserService = (ICrossLanguageUserService) a2;
            MethodCollector.o(9352);
            return iCrossLanguageUserService;
        }
        if (com.ss.android.ugc.b.bL == null) {
            synchronized (ICrossLanguageUserService.class) {
                try {
                    if (com.ss.android.ugc.b.bL == null) {
                        com.ss.android.ugc.b.bL = new CrossLanguageUserExperiment();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9352);
                    throw th;
                }
            }
        }
        CrossLanguageUserExperiment crossLanguageUserExperiment = (CrossLanguageUserExperiment) com.ss.android.ugc.b.bL;
        MethodCollector.o(9352);
        return crossLanguageUserExperiment;
    }
}
