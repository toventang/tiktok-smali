package com.ss.android.ugc.aweme.compliance.privacy.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.a;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;

public final class PrivacyServiceImpl implements IPrivacyService {
    static {
        Covode.recordClassIndex(47903);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void a() {
        b.a(true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final w c() {
        return new LaunchTask();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean b() {
        if (a.a() || a.b()) {
            return true;
        }
        return false;
    }

    public static IPrivacyService d() {
        MethodCollector.i(3444);
        Object a2 = com.ss.android.ugc.b.a(IPrivacyService.class, false);
        if (a2 != null) {
            IPrivacyService iPrivacyService = (IPrivacyService) a2;
            MethodCollector.o(3444);
            return iPrivacyService;
        }
        if (com.ss.android.ugc.b.aP == null) {
            synchronized (IPrivacyService.class) {
                try {
                    if (com.ss.android.ugc.b.aP == null) {
                        com.ss.android.ugc.b.aP = new PrivacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3444);
                    throw th;
                }
            }
        }
        PrivacyServiceImpl privacyServiceImpl = (PrivacyServiceImpl) com.ss.android.ugc.b.aP;
        MethodCollector.o(3444);
        return privacyServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final m a(String str) {
        l.d(str, "");
        return b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void b(String str) {
        l.d(str, "");
        b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final o a(int i2, String str) {
        l.d(str, "");
        return b.a(i2, str);
    }
}
