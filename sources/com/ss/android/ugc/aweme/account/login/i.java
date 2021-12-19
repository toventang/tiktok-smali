package com.ss.android.ugc.aweme.account.login;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.account.m.b;
import com.ss.android.ugc.aweme.account.util.r;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.main.service.ILanguageService;

public final class i {
    static {
        Covode.recordClassIndex(39111);
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean b2 = b();
        j.f107226e = b2;
        return b2;
    }

    public static c a(String str) {
        boolean z;
        c cVar = new c();
        if (TextUtils.equals(str, "google")) {
            PackageInfo a2 = r.a(a.f62426a, "com.google.android.gms");
            if (a2 != null) {
                z = true;
            } else {
                z = false;
            }
            cVar.a("google_isAvaliable", String.valueOf(z));
            if (a2 != null) {
                cVar.a("google_versionName", a2.versionName);
                cVar.a("google_versionCode", String.valueOf(a2.versionCode));
            }
            cVar.a("eligible", String.valueOf(com.ss.android.ugc.aweme.account.n.f.a(a.f62426a)));
        }
        return cVar;
    }

    public static void a(int i2, int i3, String str) {
        b.a("aweme_agegate_rate", i2, new c().a("eligible", String.valueOf(i3)).a("errorDesc", str).a());
    }

    public static void a(String str, String str2, String str3) {
        if (a()) {
            b.a("aweme_thirdparty_login_error_rate", 0, a(str3).a("app_language", ((ILanguageService) a.a(ILanguageService.class)).a()).a("platform", str3).a("errorDesc", String.valueOf(str2)).a("errorUrl", str).a());
        }
    }

    public static void a(int i2, String str, String str2) {
        if (a()) {
            b.a("aweme_thirdparty_login_error_rate", 0, a(str2).a("app_language", ((ILanguageService) a.a(ILanguageService.class)).a()).a("platform", str2).a("errorCode", String.valueOf(i2)).a("errorDesc", String.valueOf(str)).a());
        }
    }
}
