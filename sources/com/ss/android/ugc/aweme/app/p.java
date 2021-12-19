package com.ss.android.ugc.aweme.app;

import android.app.Application;
import android.content.Context;
import com.bytedance.business.base.IBusinessToolsService;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.h;
import com.bytedance.ies.uikit.a.d;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider;
import com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.depend.aa;
import com.ss.android.ugc.aweme.commercialize.depend.ab;
import com.ss.android.ugc.aweme.commercialize.depend.i;
import com.ss.android.ugc.aweme.commercialize.depend.j;
import com.ss.android.ugc.aweme.commercialize.depend.k;
import com.ss.android.ugc.aweme.commercialize.depend.m;
import com.ss.android.ugc.aweme.commercialize.depend.n;
import com.ss.android.ugc.aweme.commercialize.depend.o;
import com.ss.android.ugc.aweme.commercialize.depend.q;
import com.ss.android.ugc.aweme.commercialize.depend.r;
import com.ss.android.ugc.aweme.commercialize.depend.s;
import com.ss.android.ugc.aweme.commercialize.depend.u;
import com.ss.android.ugc.aweme.commercialize.depend.v;
import com.ss.android.ugc.aweme.commercialize.depend.x;
import com.ss.android.ugc.aweme.commercialize.depend.z;
import com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.de.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask;
import com.ss.android.ugc.aweme.legoImp.task.InitRouter;
import com.ss.android.ugc.aweme.legoImp.task.PreloadInstanceTask;
import com.ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.ss.android.ugc.aweme.service.IBusinessToolsUtilService;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.util.e;
import com.ss.android.ugc.aweme.utils.bx;
import h.f.b.l;

public abstract class p implements IInitAllService {
    static {
        Covode.recordClassIndex(41171);
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void i() {
        o.a();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w c() {
        return new GeckoHighPriorityCheckInRequest();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w d() {
        return new GeckoCheckInRequest();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w f() {
        return new SettingsReaderInitTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w g() {
        return new PreloadInstanceTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w j() {
        return new InitRouter();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final w k() {
        return new InitLiveServiceTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void e() {
        d.f35381b = AwemeAppData.a();
        d.f35383d = AwemeAppData.a();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void a() {
        if (!com.ss.android.ugc.aweme.lego.d.f() && a.f79387a == null) {
            try {
                a.f79387a = new a();
            } catch (Exception unused) {
            }
            Logger.debug();
        }
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void b() {
        if (com.ss.android.ugc.aweme.local_test.a.a()) {
            com.weekend.recorder.api.a.f156392b.init(String.valueOf(com.bytedance.ies.ugc.appcontext.d.n), com.bytedance.ies.ugc.appcontext.d.s, new com.ss.android.ugc.aweme.commerce.c.a(), new com.weekend.recorder.api.a.a() {
                /* class com.ss.android.ugc.aweme.app.p.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(41172);
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void h() {
        new f.c().b((w) new BaseInitAllService$2(this)).a();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void b(Application application) {
        try {
            Context applicationContext = application.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            bx.a(applicationContext);
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void c(Application application) {
        IBusinessToolsUtilService iBusinessToolsUtilService;
        if (e.b() && com.ss.android.common.util.f.a(application)) {
            IBusinessToolsService a2 = e.a();
            if (e.b() && a2 != null && (iBusinessToolsUtilService = (IBusinessToolsUtilService) ServiceManager.get().getService(IBusinessToolsUtilService.class)) != null) {
                iBusinessToolsUtilService.initBusinessToolsLogic(application);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void a(Application application) {
        b bVar = new b();
        j jVar = new j();
        l.c(jVar, "");
        bVar.f31904b = jVar;
        i iVar = new i();
        l.c(iVar, "");
        bVar.f31909g = iVar;
        aa aaVar = new aa();
        l.c(aaVar, "");
        bVar.f31906d = aaVar;
        u uVar = new u();
        l.c(uVar, "");
        bVar.f31905c = uVar;
        q qVar = new q();
        l.c(qVar, "");
        bVar.f31903a = qVar;
        r rVar = new r();
        l.c(rVar, "");
        bVar.f31910h = rVar;
        s sVar = new s();
        l.c(sVar, "");
        bVar.f31908f = sVar;
        v vVar = new v();
        l.c(vVar, "");
        bVar.f31907e = vVar;
        x xVar = new x();
        l.c(xVar, "");
        bVar.f31911i = xVar;
        ab abVar = new ab();
        l.c(abVar, "");
        bVar.f31913k = abVar;
        com.bytedance.ies.android.base.runtime.a.f31876e.a(bVar);
        if (!((Boolean) h.f34819a.getValue()).booleanValue()) {
            ISplashAdService h2 = SplashAdServiceImpl.h();
            if (h2 != null) {
                h2.a(new com.ss.android.ugc.aweme.commercialize.splash.a());
            }
            com.ss.android.ugc.aweme.commercialize.depend.b bVar2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b;
            bVar2.f73783a.a(new com.ss.android.ugc.aweme.commercialize.depend.a());
            com.ss.android.ugc.aweme.ad.b.a.f65583a.a(a.f66514a);
            ICommercializeAdService a2 = CommercializeAdServiceImpl.a();
            if (a2 != null) {
                a2.a(application, r.f66864a, !com.bytedance.ies.ugc.aweme.commercialize.splash.setting.j.e());
            }
            if (!com.bytedance.ies.ugc.aweme.commercialize.splash.setting.j.e()) {
                a.f66514a.a();
                a.f66514a.c();
                a.f66514a.b();
                r.a();
            }
            ICommerceEggService c2 = CommerceEggServiceImpl.c();
            if (c2 != null) {
                c2.a(new m());
            }
            ICommerceMediaService f2 = CommerceMediaServiceImpl.f();
            if (f2 != null) {
                f2.a(new n());
            }
            ICommerceChallengeService e2 = CommerceChallengeServiceImpl.e();
            if (e2 != null) {
                e2.a(new com.ss.android.ugc.aweme.commercialize.depend.l());
            }
            ICommerceStickerService c3 = CommerceStickerServiceImpl.c();
            if (c3 != null) {
                c3.a(new o());
            }
            IChallengeDetailProvider b2 = ChallengeDetailProvicer.b();
            if (b2 != null) {
                b2.a(new k());
            }
            ITcmService j2 = TcmServiceImpl.j();
            if (j2 != null) {
                j2.a(new z());
            }
        }
    }
}
