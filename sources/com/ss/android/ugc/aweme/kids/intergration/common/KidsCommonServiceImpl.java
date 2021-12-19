package com.ss.android.ugc.aweme.kids.intergration.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.a.d;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.ss.android.ugc.aweme.kids.homepage.compliance.a;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.AppStateReporterKid$init$1;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.setting.services.f;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class KidsCommonServiceImpl implements IKidsCommonService {
    static {
        Covode.recordClassIndex(68195);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void e() {
        a.a();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final String c() {
        return f.f122672a.getReleaseBuildString();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void d() {
        d.f35381b = a.f106699a;
        d.f35383d = a.f106699a;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void f() {
        com.ss.android.ugc.aweme.kids.common.c.d.f105892a = com.ss.android.ugc.aweme.kids.common.c.a.COLD;
        com.ss.android.ugc.aweme.kids.common.c.d.f105893b = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void b() {
        BulletService.f().b().f31938b.a("kids_mode", new com.ss.android.ugc.aweme.kids.setting.items.account.a());
    }

    public static IKidsCommonService g() {
        MethodCollector.i(7885);
        Object a2 = b.a(IKidsCommonService.class, false);
        if (a2 != null) {
            IKidsCommonService iKidsCommonService = (IKidsCommonService) a2;
            MethodCollector.o(7885);
            return iKidsCommonService;
        }
        if (b.bU == null) {
            synchronized (IKidsCommonService.class) {
                try {
                    if (b.bU == null) {
                        b.bU = new KidsCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7885);
                    throw th;
                }
            }
        }
        KidsCommonServiceImpl kidsCommonServiceImpl = (KidsCommonServiceImpl) b.bU;
        MethodCollector.o(7885);
        return kidsCommonServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void a() {
        new f.c().b((w) new AppStateReporterKid$init$1()).a();
        com.bytedance.ies.ugc.appcontext.f.b().d(b.a.f106902a);
        com.bytedance.ies.ugc.appcontext.f.c().d(b.C2742b.f106909a);
        com.bytedance.ies.ugc.appcontext.f.e().d(b.c.f106910a);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService
    public final void a(Context context) {
        l.d(context, "");
        com.ss.android.ugc.aweme.compliance.api.a.q().b(context);
    }
}
