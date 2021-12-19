package com.ss.android.ugc.aweme.account.experiment.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.INonPersonalizationService;
import com.ss.android.ugc.aweme.account.experiment.SEANonPersonalizedExperiencePopupSettings;
import com.ss.android.ugc.aweme.account.experiment.m;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class NonPersonalizationService implements INonPersonalizationService {
    static {
        Covode.recordClassIndex(38823);
    }

    public static INonPersonalizationService c() {
        MethodCollector.i(9397);
        Object a2 = b.a(INonPersonalizationService.class, false);
        if (a2 != null) {
            INonPersonalizationService iNonPersonalizationService = (INonPersonalizationService) a2;
            MethodCollector.o(9397);
            return iNonPersonalizationService;
        }
        if (b.C == null) {
            synchronized (INonPersonalizationService.class) {
                try {
                    if (b.C == null) {
                        b.C = new NonPersonalizationService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9397);
                    throw th;
                }
            }
        }
        NonPersonalizationService nonPersonalizationService = (NonPersonalizationService) b.C;
        MethodCollector.o(9397);
        return nonPersonalizationService;
    }

    @Override // com.ss.android.ugc.aweme.INonPersonalizationService
    public final boolean a() {
        if (!m.c()) {
            return false;
        }
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        if (e2.isLogin() || m.b() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.INonPersonalizationService
    public final boolean b() {
        SEANonPersonalizedExperiencePopupSettings.a popupSettings;
        if (!m.c()) {
            return false;
        }
        if ((m.b() == 1 || m.b() == 2) && (popupSettings = SEANonPersonalizedExperiencePopupSettings.getPopupSettings()) != null && System.currentTimeMillis() - m.a() > ((long) popupSettings.f62966a) * 86400000) {
            return true;
        }
        return false;
    }
}
