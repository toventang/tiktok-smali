package com.ss.android.ugc.trill.main.login;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.utils.hm;

public final class a {
    static {
        Covode.recordClassIndex(98976);
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
            PackageInfo a2 = hm.a(d.a(), "com.google.android.gms");
            if (a2 != null) {
                z = true;
            } else {
                z = false;
            }
            cVar.a("google_isInstalled", String.valueOf(z));
            if (a2 != null) {
                cVar.a("google_versionName", a2.versionName);
                cVar.a("google_versionCode", String.valueOf(a2.versionCode));
            }
            cVar.a("eligible", String.valueOf(com.ss.android.ugc.trill.h.a.a(d.a())));
        }
        return cVar;
    }
}
