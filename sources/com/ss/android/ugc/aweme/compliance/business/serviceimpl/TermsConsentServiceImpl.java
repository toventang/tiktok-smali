package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.a;
import com.ss.android.ugc.aweme.compliance.business.a.c;
import com.ss.android.ugc.aweme.compliance.common.b;
import h.f.b.l;

public final class TermsConsentServiceImpl implements ITermsConsentService {
    static {
        Covode.recordClassIndex(47713);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final String b() {
        return b.m();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final String c() {
        return b.n();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final boolean f() {
        return c.a.d();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final boolean a() {
        Boolean addTermsConsentForRegister;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (addTermsConsentForRegister = c2.getAddTermsConsentForRegister()) == null) {
            return false;
        }
        return addTermsConsentForRegister.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final String d() {
        TermsConsentInfo termsConsentInfo;
        String cbNotificationTitle;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (termsConsentInfo = c2.getTermsConsentInfo()) == null || (cbNotificationTitle = termsConsentInfo.getCbNotificationTitle()) == null) {
            return "";
        }
        return cbNotificationTitle;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final String e() {
        TermsConsentInfo termsConsentInfo;
        String cbNotificationSubTitle;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (termsConsentInfo = c2.getTermsConsentInfo()) == null || (cbNotificationSubTitle = termsConsentInfo.getCbNotificationSubTitle()) == null) {
            return "";
        }
        return cbNotificationSubTitle;
    }

    public static ITermsConsentService g() {
        MethodCollector.i(6669);
        Object a2 = com.ss.android.ugc.b.a(ITermsConsentService.class, false);
        if (a2 != null) {
            ITermsConsentService iTermsConsentService = (ITermsConsentService) a2;
            MethodCollector.o(6669);
            return iTermsConsentService;
        }
        if (com.ss.android.ugc.b.aK == null) {
            synchronized (ITermsConsentService.class) {
                try {
                    if (com.ss.android.ugc.b.aK == null) {
                        com.ss.android.ugc.b.aK = new TermsConsentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6669);
                    throw th;
                }
            }
        }
        TermsConsentServiceImpl termsConsentServiceImpl = (TermsConsentServiceImpl) com.ss.android.ugc.b.aK;
        MethodCollector.o(6669);
        return termsConsentServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService
    public final void a(a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        c.f76723j.remove(aVar);
    }
}
