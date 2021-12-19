package com.bytedance.ttnet.a;

import android.webkit.CookieManager;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.a.a.a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.c;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class f implements a.AbstractC0617a, h.a, h.b, e.h, c.b {

    /* renamed from: g  reason: collision with root package name */
    private static volatile f f44463g;

    /* renamed from: a  reason: collision with root package name */
    private String f44464a;

    /* renamed from: b  reason: collision with root package name */
    private int f44465b;

    /* renamed from: c  reason: collision with root package name */
    private int f44466c;

    /* renamed from: d  reason: collision with root package name */
    private int f44467d;

    /* renamed from: e  reason: collision with root package name */
    private int f44468e;

    /* renamed from: f  reason: collision with root package name */
    private int f44469f;

    static {
        Covode.recordClassIndex(27237);
    }

    private f() {
        h();
    }

    @Override // com.bytedance.frameworks.a.a.a.AbstractC0617a
    public final boolean d() {
        if (this.f44465b > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.a.a.a.AbstractC0617a
    public final boolean e() {
        if (this.f44466c > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.a.a.a.AbstractC0617a
    public final boolean f() {
        if (this.f44467d > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.h.b
    public final boolean c() {
        if (!a.f44432l && this.f44468e > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.h.a
    public final boolean b() {
        if (!a.f44431k && TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "chromium_boot_failures", 0) > 5) {
            return false;
        }
        return true;
    }

    public static f a() {
        MethodCollector.i(7870);
        if (f44463g == null) {
            synchronized (f.class) {
                try {
                    if (f44463g == null) {
                        f44463g = new f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7870);
                    throw th;
                }
            }
        }
        f fVar = f44463g;
        MethodCollector.o(7870);
        return fVar;
    }

    @Override // com.bytedance.ttnet.c.b
    public final boolean g() {
        if (a.f44432l) {
            o.f29274b = 0;
            return false;
        } else if (a.f44433m) {
            o.f29274b = 8;
            return false;
        } else if (a.f44431k || this.f44469f <= 5) {
            TTNetInit.getTTNetDepend();
            return true;
        } else {
            o.f29274b = 3;
            return false;
        }
    }

    public final void h() {
        this.f44464a = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "share_cookie_host_list", "");
        TTNetInit.getTTNetDepend().a(this.f44464a);
        boolean z = false;
        this.f44465b = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "add_ss_queries_open", 0);
        int a2 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "add_ss_queries_header_open", 0);
        this.f44466c = a2;
        if (this.f44465b > 0 || a2 > 0) {
            SsInterceptor.f44640a = true;
        }
        this.f44467d = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "add_ss_queries_plaintext_open", 1);
        this.f44468e = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "http_dns_enabled", 0);
        this.f44469f = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "chromium_boot_failures", 0);
        int a3 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "query_filter_enabled", Integer.MIN_VALUE);
        String a4 = TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "query_filter_actions", "");
        com.bytedance.frameworks.baselib.network.c.c.a().b(TTNetInit.getTTNetDepend().a(TTNetInit.getTTNetDepend().a(), "L0_params", ""));
        if (a3 != Integer.MIN_VALUE) {
            com.bytedance.frameworks.baselib.network.c.c a5 = com.bytedance.frameworks.baselib.network.c.c.a();
            if (a3 > 0) {
                z = true;
            }
            a5.f28904a = z;
            com.bytedance.frameworks.baselib.network.c.c.a().a(a4);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e.h
    public final List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = this.f44464a.split(",");
        for (String str2 : split) {
            if (!m.a(str2)) {
                arrayList.add(str2);
            }
        }
        String d2 = TTNetInit.getTTNetDepend().d();
        if (!m.a(d2) && !a(d2, arrayList)) {
            arrayList.add(d2);
        }
        if (a(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    private static boolean a(String str, List<String> list) {
        if (!m.a(str) && !com.bytedance.common.utility.h.a(list)) {
            for (String str2 : list) {
                if (str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.e.h
    public final List<String> a(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.c.a aVar, URI uri) {
        String str;
        if (uri == null) {
            return null;
        }
        if (cookieManager == null && aVar == null) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        String[] split = this.f44464a.split(",");
        for (String str2 : split) {
            if (!m.a(str2)) {
                arrayList.add(str2);
            }
        }
        if (m.a(str) || !a(str, arrayList)) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(TTNetInit.getTTNetDepend().d());
            if (!m.a(cookie)) {
                arrayList2.add(cookie);
            }
        }
        if (!com.bytedance.common.utility.h.a(arrayList2) || aVar == null) {
            return arrayList2;
        }
        try {
            Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().d()), new LinkedHashMap());
            if (map == null || map.isEmpty()) {
                return arrayList2;
            }
            return map.get("Cookie");
        } catch (Throwable unused2) {
            return arrayList2;
        }
    }
}
