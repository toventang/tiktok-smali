package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.contentlanguage.j;
import com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.main.ba;
import com.ss.android.ugc.aweme.requesttask.b.a;
import com.ss.android.ugc.aweme.requesttask.b.b;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.ugc.aweme.user.e;
import com.ss.android.ugc.aweme.user.f;
import h.f.b.l;

public final class NewUserMainModuleService implements INewUserMainModuleService {

    /* renamed from: a  reason: collision with root package name */
    public final ba f66882a = new ba();

    static {
        Covode.recordClassIndex(41187);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> a() {
        return AppLinkHandlerV2.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> b() {
        return DeepLinkActivityV2.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final Class<? extends Activity> f() {
        return SplashActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final r d() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final r e() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void g() {
        j.a.a().c();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final boolean c() {
        return j.a.a().b();
    }

    public static INewUserMainModuleService h() {
        MethodCollector.i(3525);
        Object a2 = com.ss.android.ugc.b.a(INewUserMainModuleService.class, false);
        if (a2 != null) {
            INewUserMainModuleService iNewUserMainModuleService = (INewUserMainModuleService) a2;
            MethodCollector.o(3525);
            return iNewUserMainModuleService;
        }
        if (com.ss.android.ugc.b.O == null) {
            synchronized (INewUserMainModuleService.class) {
                try {
                    if (com.ss.android.ugc.b.O == null) {
                        com.ss.android.ugc.b.O = new NewUserMainModuleService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3525);
                    throw th;
                }
            }
        }
        NewUserMainModuleService newUserMainModuleService = (NewUserMainModuleService) com.ss.android.ugc.b.O;
        MethodCollector.o(3525);
        return newUserMainModuleService;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final r a(aa aaVar) {
        l.d(aaVar, "");
        return new com.ss.android.ugc.aweme.request_combine.request.a.a(aaVar);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void a(String str) {
        l.d(str, "");
        j a2 = j.a.a();
        l.d(str, "");
        if (f.a(e.f142364k.a())) {
            a2.a().setContentLanguage("content_language", str, 1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new j.d());
        } else {
            a2.f78193a.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserMainModuleService
    public final void a(Context context, boolean z) {
        l.d(context, "");
        ((com.ss.android.ugc.aweme.i18n.language.a.j) com.ss.android.ugc.aweme.base.b.a.a.a(context, com.ss.android.ugc.aweme.i18n.language.a.j.class)).a();
    }
}
