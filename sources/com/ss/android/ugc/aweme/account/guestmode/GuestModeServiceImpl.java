package com.ss.android.ugc.aweme.account.guestmode;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.cf;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.language.d;
import h.a.am;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public final class GuestModeServiceImpl implements IGuestModeService {

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f63037a = am.a((Object[]) new String[]{"AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"});

    static {
        Covode.recordClassIndex(38831);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean b() {
        return AccountExperimentLayerServiceImpl.b().a(cf.GUEST_MODE_ENABLED);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean c() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return false;
        }
        return AgeGateServiceImpl.e().d();
    }

    public static IGuestModeService d() {
        MethodCollector.i(9399);
        Object a2 = com.ss.android.ugc.b.a(IGuestModeService.class, false);
        if (a2 != null) {
            IGuestModeService iGuestModeService = (IGuestModeService) a2;
            MethodCollector.o(9399);
            return iGuestModeService;
        }
        if (com.ss.android.ugc.b.D == null) {
            synchronized (IGuestModeService.class) {
                try {
                    if (com.ss.android.ugc.b.D == null) {
                        com.ss.android.ugc.b.D = new GuestModeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9399);
                    throw th;
                }
            }
        }
        GuestModeServiceImpl guestModeServiceImpl = (GuestModeServiceImpl) com.ss.android.ugc.b.D;
        MethodCollector.o(9399);
        return guestModeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final boolean a() {
        Set<String> set = this.f63037a;
        String a2 = d.a();
        l.b(a2, "");
        Locale locale = Locale.ROOT;
        l.b(locale, "");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a2.toUpperCase(locale);
        l.b(upperCase, "");
        return set.contains(upperCase);
    }

    @Override // com.ss.android.ugc.aweme.IGuestModeService
    public final void a(Context context, Bundle bundle) {
        l.d(context, "");
        l.d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/login/signup_or_login").withParam("current_scene", j.GUEST_MODE.getValue()).withParam("next_page", k.AGE_GATE_SIGN_UP.getValue());
        l.b(withParam, "");
        withParam.withParam(bundle);
        withParam.open();
    }
}
