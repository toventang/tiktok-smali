package com.ss.android.ugc.aweme.settingsrequest.api;

import b.i;
import com.bytedance.apm.b;
import com.bytedance.apm.config.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.j;
import com.google.gson.o;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.setting.api.ABApi;
import com.ss.android.ugc.aweme.share.a;

public final class a {
    static {
        Covode.recordClassIndex(80890);
    }

    public static void a() {
        if (j.a().c()) {
            d.a a2 = d.a();
            a2.f24827a = "settings_v3_fallback_to_v1";
            b.a(a2.a());
        }
        ABApi.a.a().querySettings().a(b.f123163a).a(c.f123164a, i.f4826c, null);
    }

    public static void a(o oVar) {
        AVExternalServiceImpl.a().configService().avsettingsConfig().updateABTestModel(oVar);
        a.C3192a.a(oVar);
        SettingsRequestServiceImpl.i().a(oVar);
    }

    static final /* synthetic */ Boolean b(i iVar) {
        try {
            if (iVar.b()) {
                return false;
            }
            if (iVar.c()) {
                iVar.e();
                return false;
            }
            a((o) iVar.d());
            o f2 = ((o) iVar.d()).j().f("data");
            if (f2 != null) {
                a.b.f109011a.a("method_save_abtest_keva", false);
                com.bytedance.ies.abmock.b.a().a(f2);
                a.b.f109011a.b("method_save_abtest_keva", false);
                com.ss.android.ugc.aweme.setting.a.f122009a.a();
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        } catch (IncompatibleClassChangeError unused) {
        }
    }
}
