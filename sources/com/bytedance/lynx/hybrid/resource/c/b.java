package com.bytedance.lynx.hybrid.resource.c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.resource.config.c;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.service.c.a;
import h.f.b.l;
import h.m.p;
import h.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f41082a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(25183);
    }

    public static String a(j jVar) {
        String str;
        l.c(jVar, "");
        if (p.b(jVar.f41112h, "/", false)) {
            String str2 = jVar.f41112h;
            if (str2 != null) {
                str = str2.substring(1);
                l.a((Object) str, "");
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        } else {
            str = jVar.f41112h;
        }
        return jVar.t + '_' + jVar.f41111g + '_' + str;
    }

    public static boolean a(c cVar, Uri uri, j jVar) {
        l.c(cVar, "");
        l.c(uri, "");
        l.c(jVar, "");
        String queryParameter = uri.getQueryParameter("__dev");
        if (l.a((Object) queryParameter, (Object) "1") || ((queryParameter == null || queryParameter.length() == 0) && c.a.a().f40901a)) {
            return false;
        }
        if (l.a((Object) a.a(uri, "enable_memory_cache"), (Object) "1") || cVar.f41093e) {
            return true;
        }
        return false;
    }
}
