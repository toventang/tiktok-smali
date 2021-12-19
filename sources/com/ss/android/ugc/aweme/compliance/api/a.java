package com.ss.android.ugc.aweme.compliance.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService;
import com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService;
import com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.b;
import com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AlgofreeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.FTCServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.GDPRServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PrivateAccountServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ReportServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TermsConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.VPAServiceImpl;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceMonitorServiceImpl;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceSettingsServiceImpl;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AntiAddictionServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static IReportService f76621a;

    /* renamed from: b  reason: collision with root package name */
    private static IAntiAddictionService f76622b;

    /* renamed from: c  reason: collision with root package name */
    private static IBanAppealService f76623c;

    /* renamed from: d  reason: collision with root package name */
    private static IComplianceBusinessService f76624d;

    /* renamed from: e  reason: collision with root package name */
    private static IVPAService f76625e;

    /* renamed from: f  reason: collision with root package name */
    private static IAlgofreeService f76626f;

    /* renamed from: g  reason: collision with root package name */
    private static IGDPRService f76627g;

    /* renamed from: h  reason: collision with root package name */
    private static IAgeGateService f76628h;

    /* renamed from: i  reason: collision with root package name */
    private static IPrivateAccountService f76629i;

    /* renamed from: j  reason: collision with root package name */
    private static IComplianceSettingsService f76630j;

    /* renamed from: k  reason: collision with root package name */
    private static ITermsConsentService f76631k;

    /* renamed from: l  reason: collision with root package name */
    private static IComplianceMonitorService f76632l;

    /* renamed from: m  reason: collision with root package name */
    private static IFTCService f76633m;
    private static IPolicyNoticeService n;
    private static IProtectionService o;
    private static IFamilyPairingService p;
    private static IChildModeService q;
    private static ITpcConsentService r;
    private static IPrivacyService s;

    static {
        Covode.recordClassIndex(47306);
    }

    public static IReportService a() {
        IReportService iReportService = f76621a;
        if (iReportService != null) {
            return iReportService;
        }
        IReportService a2 = ReportServiceImpl.a();
        f76621a = a2;
        if (a2 == null) {
            f76621a = new com.ss.android.ugc.aweme.compliance.api.services.report.a();
        }
        return f76621a;
    }

    public static IAntiAddictionService b() {
        IAntiAddictionService iAntiAddictionService = f76622b;
        if (iAntiAddictionService != null) {
            return iAntiAddictionService;
        }
        IAntiAddictionService h2 = AntiAddictionServiceImpl.h();
        f76622b = h2;
        if (h2 == null) {
            f76622b = new com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.a();
        }
        return f76622b;
    }

    public static IBanAppealService c() {
        IBanAppealService iBanAppealService = f76623c;
        if (iBanAppealService != null) {
            return iBanAppealService;
        }
        IBanAppealService f2 = BanAppealServiceImpl.f();
        f76623c = f2;
        if (f2 == null) {
            f76623c = new com.ss.android.ugc.aweme.compliance.api.services.banappeal.a();
        }
        return f76623c;
    }

    public static IComplianceBusinessService d() {
        IComplianceBusinessService iComplianceBusinessService = f76624d;
        if (iComplianceBusinessService != null) {
            return iComplianceBusinessService;
        }
        IComplianceBusinessService k2 = ComplianceBusinessServiceImpl.k();
        f76624d = k2;
        if (k2 == null) {
            f76624d = new com.ss.android.ugc.aweme.compliance.api.services.businesses.a();
        }
        return f76624d;
    }

    public static IVPAService e() {
        IVPAService iVPAService = f76625e;
        if (iVPAService != null) {
            return iVPAService;
        }
        IVPAService h2 = VPAServiceImpl.h();
        f76625e = h2;
        if (h2 == null) {
            f76625e = new com.ss.android.ugc.aweme.compliance.api.services.vpa.a();
        }
        return f76625e;
    }

    public static IAlgofreeService f() {
        IAlgofreeService iAlgofreeService = f76626f;
        if (iAlgofreeService != null) {
            return iAlgofreeService;
        }
        IAlgofreeService d2 = AlgofreeServiceImpl.d();
        f76626f = d2;
        if (d2 == null) {
            f76626f = new com.ss.android.ugc.aweme.compliance.api.services.algofree.a();
        }
        return f76626f;
    }

    public static IGDPRService g() {
        IGDPRService iGDPRService = f76627g;
        if (iGDPRService != null) {
            return iGDPRService;
        }
        IGDPRService d2 = GDPRServiceImpl.d();
        f76627g = d2;
        if (d2 == null) {
            f76627g = new com.ss.android.ugc.aweme.compliance.api.services.gdpr.a();
        }
        return f76627g;
    }

    public static IAgeGateService h() {
        IAgeGateService iAgeGateService = f76628h;
        if (iAgeGateService != null) {
            return iAgeGateService;
        }
        IAgeGateService e2 = AgeGateServiceImpl.e();
        f76628h = e2;
        if (e2 == null) {
            f76628h = new com.ss.android.ugc.aweme.compliance.api.services.agegate.a();
        }
        return f76628h;
    }

    public static IPrivateAccountService i() {
        IPrivateAccountService iPrivateAccountService = f76629i;
        if (iPrivateAccountService != null) {
            return iPrivateAccountService;
        }
        IPrivateAccountService e2 = PrivateAccountServiceImpl.e();
        f76629i = e2;
        if (e2 == null) {
            f76629i = new com.ss.android.ugc.aweme.compliance.api.services.privateaccount.a();
        }
        return f76629i;
    }

    public static IComplianceSettingsService j() {
        IComplianceSettingsService iComplianceSettingsService = f76630j;
        if (iComplianceSettingsService != null) {
            return iComplianceSettingsService;
        }
        IComplianceSettingsService b2 = ComplianceSettingsServiceImpl.b();
        f76630j = b2;
        if (b2 == null) {
            f76630j = new com.ss.android.ugc.aweme.compliance.api.services.settings.a();
        }
        return f76630j;
    }

    public static ITermsConsentService k() {
        ITermsConsentService iTermsConsentService = f76631k;
        if (iTermsConsentService != null) {
            return iTermsConsentService;
        }
        ITermsConsentService g2 = TermsConsentServiceImpl.g();
        f76631k = g2;
        if (g2 == null) {
            f76631k = new b();
        }
        return f76631k;
    }

    public static IComplianceMonitorService l() {
        IComplianceMonitorService iComplianceMonitorService = f76632l;
        if (iComplianceMonitorService != null) {
            return iComplianceMonitorService;
        }
        IComplianceMonitorService a2 = ComplianceMonitorServiceImpl.a();
        f76632l = a2;
        if (a2 == null) {
            f76632l = new com.ss.android.ugc.aweme.compliance.api.services.monitor.a();
        }
        return f76632l;
    }

    public static IFTCService m() {
        IFTCService iFTCService = f76633m;
        if (iFTCService != null) {
            return iFTCService;
        }
        IFTCService d2 = FTCServiceImpl.d();
        f76633m = d2;
        if (d2 == null) {
            f76633m = new com.ss.android.ugc.aweme.compliance.api.services.ftc.a();
        }
        return f76633m;
    }

    public static IPolicyNoticeService n() {
        IPolicyNoticeService iPolicyNoticeService = n;
        if (iPolicyNoticeService != null) {
            return iPolicyNoticeService;
        }
        IPolicyNoticeService f2 = PolicyNoticeServiceImpl.f();
        n = f2;
        if (f2 == null) {
            n = new com.ss.android.ugc.aweme.compliance.api.services.policynotice.a();
        }
        return n;
    }

    public static IProtectionService o() {
        IProtectionService iProtectionService = o;
        if (iProtectionService != null) {
            return iProtectionService;
        }
        IProtectionService k2 = ProtectionServiceImpl.k();
        o = k2;
        if (k2 == null) {
            o = new com.ss.android.ugc.aweme.compliance.api.services.teenmode.b();
        }
        return o;
    }

    public static IFamilyPairingService p() {
        IFamilyPairingService iFamilyPairingService = p;
        if (iFamilyPairingService != null) {
            return iFamilyPairingService;
        }
        IFamilyPairingService f2 = FamilyPairingServiceImpl.f();
        p = f2;
        if (f2 == null) {
            p = new com.ss.android.ugc.aweme.compliance.api.services.familypairing.a();
        }
        return p;
    }

    public static IChildModeService q() {
        IChildModeService iChildModeService = q;
        if (iChildModeService != null) {
            return iChildModeService;
        }
        IChildModeService e2 = ChildModeServiceImpl.e();
        q = e2;
        if (e2 == null) {
            q = new com.ss.android.ugc.aweme.compliance.api.services.child.a();
        }
        return q;
    }

    public static ITpcConsentService r() {
        ITpcConsentService iTpcConsentService = r;
        if (iTpcConsentService != null) {
            return iTpcConsentService;
        }
        ITpcConsentService j2 = TpcConsentServiceImpl.j();
        r = j2;
        if (j2 == null) {
            r = new com.ss.android.ugc.aweme.compliance.api.services.consent.b();
        }
        return r;
    }

    public static IPrivacyService s() {
        IPrivacyService iPrivacyService = s;
        if (iPrivacyService != null) {
            return iPrivacyService;
        }
        IPrivacyService d2 = PrivacyServiceImpl.d();
        s = d2;
        if (d2 == null) {
            s = new com.ss.android.ugc.aweme.compliance.api.services.privacy.a();
        }
        return s;
    }
}
