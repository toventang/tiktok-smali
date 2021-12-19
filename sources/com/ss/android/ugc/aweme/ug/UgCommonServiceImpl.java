package com.ss.android.ugc.aweme.ug;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.ca.g;
import com.ss.android.ugc.aweme.experiment.aw;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.ug.a.b;
import com.ss.android.ugc.aweme.ug.b.b;
import com.ss.android.ugc.aweme.ug.c.a;
import com.ss.android.ugc.aweme.ug.dynamicresource.d;
import com.ss.android.ugc.aweme.ug.dynamicresource.l;
import com.ss.android.ugc.aweme.ug.e;
import com.ss.android.ugc.aweme.ug.praise.b;
import com.ss.android.ugc.aweme.ug.praise.b.a;
import com.ss.android.ugc.aweme.ug.praise.c;
import com.ss.android.ugc.aweme.ug.praise.c.b;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.zhiliaoapp.musically.R;
import h.n;
import org.json.JSONObject;

public final class UgCommonServiceImpl implements IUgCommonService {
    static {
        Covode.recordClassIndex(92621);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final c a() {
        return b.f141712b;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final d b() {
        return a.f141760f;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final l c() {
        return d.f141792e;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean g() {
        return com.ss.android.ugc.aweme.ug.b.b.f141746a;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final long e() {
        return new c(b.EnumC3781b.LIKE).f141980e;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final SQLiteDatabase f() {
        SQLiteDatabase sQLiteDatabase = com.ss.android.ugc.aweme.ug.b.a.a().f141745b;
        h.f.b.l.b(sQLiteDatabase, "");
        return sQLiteDatabase;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final e h() {
        if (i()) {
            return com.ss.android.ugc.aweme.ug.f.b.f141835d;
        }
        return com.ss.android.ugc.aweme.ug.f.c.f141840a;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final boolean i() {
        if (com.bytedance.ies.abmock.b.a().a(true, "launch_mob_refactored_version_ab", false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void d() {
        i.a(500).a(b.a.f141987a, i.f4824a, null).a(b.C3782b.f141988a, i.f4826c, null);
    }

    public static IUgCommonService j() {
        MethodCollector.i(3203);
        Object a2 = com.ss.android.ugc.b.a(IUgCommonService.class, false);
        if (a2 != null) {
            IUgCommonService iUgCommonService = (IUgCommonService) a2;
            MethodCollector.o(3203);
            return iUgCommonService;
        }
        if (com.ss.android.ugc.b.et == null) {
            synchronized (IUgCommonService.class) {
                try {
                    if (com.ss.android.ugc.b.et == null) {
                        com.ss.android.ugc.b.et = new UgCommonServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3203);
                    throw th;
                }
            }
        }
        UgCommonServiceImpl ugCommonServiceImpl = (UgCommonServiceImpl) com.ss.android.ugc.b.et;
        MethodCollector.o(3203);
        return ugCommonServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void c(com.bytedance.ies.foundation.activity.a aVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.ug.b.b.f141747b.c((e) aVar);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void a(Context context) {
        i.a(300).a(new a.C3780a(context), i.f4824a, null).a(new a.b(context), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final String a(h hVar) {
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(hVar, "");
        com.ss.android.ugc.aweme.ug.d.c cVar = (com.ss.android.ugc.aweme.ug.d.c) SettingsManager.a().a("ug_resources_cdn_url_settings", com.ss.android.ugc.aweme.ug.d.c.class, com.ss.android.ugc.aweme.ug.d.d.f141777a);
        int i2 = com.ss.android.ugc.aweme.ug.d.e.f141779a[hVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new n();
            } else if (cVar != null) {
                return cVar.f141776b;
            } else {
                return null;
            }
        } else if (cVar != null) {
            return cVar.f141775a;
        } else {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void b(com.bytedance.ies.foundation.activity.a aVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar, "");
        androidx.lifecycle.i lifecycle = aVar.getLifecycle();
        h.f.b.l.b(lifecycle, "");
        if (lifecycle.a().isAtLeast(i.b.STARTED)) {
            com.ss.android.ugc.aweme.ug.b.b.f141747b.b((e) aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void b(Context context) {
        if (com.ss.android.ugc.aweme.ug.praise.b.a.f141967a) {
            com.ss.android.ugc.aweme.ug.praise.b.a.f141967a = false;
            b.i.a(300).a(new a.c(context), b.i.f4824a, null).a(new a.d(context), b.i.f4826c, null);
            return;
        }
        c.a.a(b.EnumC3781b.LIKE + " :conditions not met or not return from 「thumbs-up」list");
        if (context != null) {
            NoticeServiceImpl.f().a(context);
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void a(Intent intent) {
        Uri data;
        if (intent != null && (data = intent.getData()) != null) {
            String host = data.getHost();
            String path = data.getPath();
            if (h.f.b.l.a((Object) "mine", (Object) host) || h.f.b.l.a((Object) "user/homepage", (Object) h.f.b.l.a(host, (Object) path))) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (g2.isLogin()) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void a(com.bytedance.ies.foundation.activity.a aVar) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar, "");
        com.ss.android.ugc.aweme.ug.f.b bVar = com.ss.android.ugc.aweme.ug.f.b.f141835d;
        if (bVar.f141829b && bVar.f141830c == e.a.MAIN) {
            bVar.f141829b = false;
            bVar.f141830c = null;
            com.ss.android.ugc.aweme.ug.f.a.a(bVar, e.a.MAIN.getValue());
        }
        Intent intent = aVar.getIntent();
        if (!(intent == null || com.ss.android.ugc.aweme.ug.b.b.a(intent) == null)) {
            Bundle a2 = com.ss.android.ugc.aweme.ug.b.b.a(intent);
            if (a2 == null) {
                h.f.b.l.b();
            }
            String string = a2.getString("payload");
            Bundle a3 = com.ss.android.ugc.aweme.ug.b.b.a(intent);
            if (a3 == null) {
                h.f.b.l.b();
            }
            String string2 = a3.getString("from");
            try {
                JSONObject jSONObject = new JSONObject(string);
                PushService.createIPushApibyMonsterPlugin(false).onGcmNotificationClick(jSONObject, aVar, jSONObject.optInt("id", 0), string2, jSONObject.optInt("pass_through", 1), null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (aw.b()) {
            g.a(new b.a(aVar));
            return;
        }
        com.ss.android.ugc.aweme.ug.c.a.a(aVar);
        ShareServiceImpl.d().c().a();
        com.ss.android.ugc.aweme.ug.b.b.f141747b.a((androidx.fragment.app.e) aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(com.bytedance.ies.foundation.activity.a r10) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ug.UgCommonServiceImpl.d(com.bytedance.ies.foundation.activity.a):void");
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void a(boolean z) {
        if (z) {
            com.ss.android.ugc.aweme.ug.praise.b.a.f141967a = true;
            c.a.a(b.EnumC3781b.LIKE + " :into the 「thumbs-up」list,Condition is met");
            return;
        }
        c.a.a(b.EnumC3781b.LIKE + " :into the 「thumbs-up」list,But conditions not met");
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void a(com.bytedance.ies.foundation.activity.a aVar, boolean z) {
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar, "");
        if (z) {
            if (!com.ss.android.ugc.aweme.ug.b.b.f141746a) {
                com.ss.android.b.a.a.a.a(b.c.f141751a, 200);
            }
            if (aVar.getIntent().getBooleanExtra("unlogin_deeplink_third_part", false)) {
                new com.bytedance.tux.g.b(aVar).e(R.string.b5e).b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ug.IUgCommonService
    public final void a(Context context, int i2, int i3, Intent intent) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(context, "");
        if (i2 == 18 && i3 == -1 && intent != null) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
        }
        com.ss.android.ugc.aweme.ug.c.a aVar = com.ss.android.ugc.aweme.ug.c.a.f141760f;
        if (i2 == 19 && i3 == -1) {
            aVar.a("app_update_click");
        }
    }
}
