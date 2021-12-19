package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.business.a.a;
import com.ss.android.ugc.aweme.compliance.business.a.c;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.Objects;

public final class TpcConsentServiceImpl implements ITpcConsentService {
    static {
        Covode.recordClassIndex(47714);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void a() {
        c.f76720g = true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void c() {
        c.a.a().a();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean e() {
        return c.a.b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final ITpcConsentService.a f() {
        return c.a.c();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void d() {
        c.f76719f.storeBoolean("user_logged_in_atleast_once", true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void h() {
        c.a.a().a(false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean b() {
        c.a.a();
        if (((Number) a.f76706b.getValue()).intValue() == a.f76705a) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void i() {
        c a2 = c.a.a();
        if (a2.f76729d == -1) {
            a2.f76729d = System.currentTimeMillis();
        }
    }

    public static ITpcConsentService j() {
        MethodCollector.i(5809);
        Object a2 = b.a(ITpcConsentService.class, false);
        if (a2 != null) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) a2;
            MethodCollector.o(5809);
            return iTpcConsentService;
        }
        if (b.aL == null) {
            synchronized (ITpcConsentService.class) {
                try {
                    if (b.aL == null) {
                        b.aL = new TpcConsentServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5809);
                    throw th;
                }
            }
        }
        TpcConsentServiceImpl tpcConsentServiceImpl = (TpcConsentServiceImpl) b.aL;
        MethodCollector.o(5809);
        return tpcConsentServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void g() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return;
        }
        if (c.a.c() == ITpcConsentService.a.US || c.a.c() == ITpcConsentService.a.EU) {
            Iterator<T> it = c.f76723j.iterator();
            while (it.hasNext()) {
                it.next().a(false);
            }
            c.f76719f.storeBoolean("have_passed_consent", false);
            c.a.b(9);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void a(int i2) {
        c.a.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void b(int i2) {
        Iterator<T> it = c.f76723j.iterator();
        while (it.hasNext()) {
            it.next().a(false);
        }
        c.f76719f.storeBoolean("have_passed_consent", false);
        c.a.b(i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final boolean a(com.ss.android.ugc.aweme.compliance.api.services.consent.a aVar) {
        c.a.a().f76728c = aVar;
        boolean b2 = GuestModeServiceImpl.d().b();
        if ((c.a.c() == ITpcConsentService.a.ROW || c.a.c() == ITpcConsentService.a.KR) && !c.a.b()) {
            String a2 = d.a();
            l.b(a2, "");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a2.toUpperCase();
            l.b(upperCase, "");
            if (!l.a((Object) upperCase, (Object) c.f76722i) && !b2) {
                return true;
            }
        }
        a.C0732a.f33434a.a(b.a.TERMS_PRIVACY_COOKIE);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService
    public final void a(Activity activity, String str) {
        int i2;
        l.d(activity, "");
        l.d(str, "");
        c a2 = c.a.a();
        l.d(activity, "");
        l.d(str, "");
        a2.f76727b = str;
        com.ss.android.ugc.aweme.compliance.api.services.consent.a aVar = a2.f76728c;
        if (aVar != null) {
            aVar.f();
        }
        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a2.f76727b);
        if (c.a.c() == ITpcConsentService.a.KR) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        r.a("show_consent_box", a3.a("is_region_kr", i2).a("consent_region", d.a()).f66730a);
        if (c.a.c() != ITpcConsentService.a.KR) {
            i.b(new c.CallableC1748c(a2, activity), i.f4826c);
        } else {
            i.b(new c.d(a2, activity), i.f4826c);
        }
    }
}
