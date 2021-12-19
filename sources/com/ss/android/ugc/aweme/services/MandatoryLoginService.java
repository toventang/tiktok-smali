package com.ss.android.ugc.aweme.services;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.experiment.SEANonPersonalizedExperiencePopupSettings;
import com.ss.android.ugc.aweme.account.experiment.j;
import com.ss.android.ugc.aweme.account.experiment.m;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.language.d;
import h.a.am;
import h.f.b.g;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public final class MandatoryLoginService implements IMandatoryLoginService {
    public static final Companion Companion = new Companion(null);
    private boolean hasRequestComplianceApi;
    private final Keva keva = Keva.getRepo("mandatory_login_repo");
    private final String regionIT = "IT";
    private final String regionUS = "US";
    private final Set<String> regionsEU = am.a((Object[]) new String[]{"AL", "AX", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB"});

    static {
        Covode.recordClassIndex(79527);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79528);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public final boolean getHasRequestComplianceApi() {
        return this.hasRequestComplianceApi;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public final boolean shouldShowLoginTabFirst() {
        return j.a();
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public final boolean shouldShowForcedLogin() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin() || !enableForcedLogin()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public final Bundle getLoginActivityBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_fullscreen_dialog", true);
        bundle.putString("enter_from", "cold_launch");
        bundle.putString("enter_method", "reopen");
        bundle.putBoolean("is_skippable_dialog", !enableForcedLogin());
        return bundle;
    }

    public final boolean enableForcedLogin() {
        SEANonPersonalizedExperiencePopupSettings.a popupSettings;
        String a2 = d.a();
        l.b(a2, "");
        Locale locale = Locale.ROOT;
        l.b(locale, "");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a2.toUpperCase(locale);
        l.b(upperCase, "");
        if (l.a((Object) upperCase, (Object) this.regionIT) || l.a((Object) upperCase, (Object) this.regionUS)) {
            return true;
        }
        if (GuestModeServiceImpl.d().c()) {
            return false;
        }
        if (GuestModeServiceImpl.d().b() || this.regionsEU.contains(upperCase)) {
            return true;
        }
        if (!m.c() || (m.b() != 3 && (m.b() != 2 || (popupSettings = SEANonPersonalizedExperiencePopupSettings.getPopupSettings()) == null || System.currentTimeMillis() - m.a() <= ((long) popupSettings.f62967b) * 86400000))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IMandatoryLoginService
    public final void setHasRequestComplianceApi(boolean z) {
        this.hasRequestComplianceApi = z;
    }

    public static IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(13776);
        Object a2 = com.ss.android.ugc.b.a(IMandatoryLoginService.class, z);
        if (a2 != null) {
            IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) a2;
            MethodCollector.o(13776);
            return iMandatoryLoginService;
        }
        if (com.ss.android.ugc.b.dw == null) {
            synchronized (IMandatoryLoginService.class) {
                try {
                    if (com.ss.android.ugc.b.dw == null) {
                        com.ss.android.ugc.b.dw = new MandatoryLoginService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13776);
                    throw th;
                }
            }
        }
        MandatoryLoginService mandatoryLoginService = (MandatoryLoginService) com.ss.android.ugc.b.dw;
        MethodCollector.o(13776);
        return mandatoryLoginService;
    }
}
