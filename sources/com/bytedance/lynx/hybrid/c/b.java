package com.bytedance.lynx.hybrid.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import com.bytedance.lynx.hybrid.resource.o;
import com.bytedance.lynx.hybrid.service.IResourceService;
import h.f.b.l;
import h.m.p;
import h.w;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static c f40914a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f40915b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(25080);
    }

    private static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return p.j(str, str2);
    }

    private static String a(a aVar, String str) {
        T t;
        List<String> list = aVar.f40910f;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (p.b(str, (String) t, false)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                int length = t2.length();
                if (str != null) {
                    String substring = str.substring(length);
                    l.a((Object) substring, "");
                    return p.a(substring, '?');
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
        return null;
    }

    public static String a(IResourceService iResourceService, a aVar, String str, String str2, String str3, j jVar) {
        String a2 = a(aVar, str);
        if (a2 != null) {
            String a3 = a(a2, str3);
            if (iResourceService != null) {
                String uri = o.a(str2).toString();
                l.a((Object) uri, "");
                e loadSync = iResourceService.loadSync(uri, jVar);
                if (loadSync != null) {
                    File file = new File(loadSync.n + File.separator + a3);
                    if (file.exists()) {
                        return file.getAbsolutePath();
                    }
                }
            }
        }
        return null;
    }
}
