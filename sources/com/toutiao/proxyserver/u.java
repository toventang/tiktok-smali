package com.toutiao.proxyserver;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.toutiao.proxyserver.ae;
import com.toutiao.proxyserver.c.c;
import com.toutiao.proxyserver.e.b;
import com.toutiao.proxyserver.h;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class u {
    public static boolean A;
    public static boolean B;
    public static volatile boolean C = true;
    private static volatile String D;
    private static long E;

    /* renamed from: a  reason: collision with root package name */
    public static volatile g f154986a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile h f154987b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile r f154988c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile c f154989d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Context f154990e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile String f154991f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile o f154992g;

    /* renamed from: h  reason: collision with root package name */
    public static volatile n f154993h;

    /* renamed from: i  reason: collision with root package name */
    public static volatile m f154994i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile l f154995j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile p f154996k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile boolean f154997l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile boolean f154998m = true;
    public static int n = 8192;
    public static int o = 10;
    public static volatile boolean p = true;
    public static boolean q;
    public static boolean r = true;
    public static boolean s;
    public static boolean t = true;
    public static boolean u;
    public static volatile int v = 10;
    public static volatile boolean w;
    public static volatile int x;
    public static volatile b y;
    public static volatile boolean z = true;

    static {
        Covode.recordClassIndex(103196);
    }

    public static synchronized long b() {
        long j2;
        synchronized (u.class) {
            MethodCollector.i(12395);
            j2 = E;
            MethodCollector.o(12395);
        }
        return j2;
    }

    public static synchronized long a() {
        long j2;
        synchronized (u.class) {
            MethodCollector.i(12394);
            long j3 = E;
            j2 = 1;
            if (j3 < Long.MAX_VALUE) {
                j2 = 1 + j3;
            }
            E = j2;
            MethodCollector.o(12394);
        }
        return j2;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static void a(int i2, String str) {
        if (f154995j != null) {
            f154995j.a(i2, str);
        }
    }

    public static void a(h hVar, Context context) {
        if (hVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        f154990e = a(context);
        if (f154987b == null) {
            g gVar = f154986a;
            if (gVar == null || !gVar.f154855a.getAbsolutePath().equals(hVar.f154865a.getAbsolutePath())) {
                f154987b = hVar;
                f154989d = c.a(context);
                f154987b.a(new h.a() {
                    /* class com.toutiao.proxyserver.u.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(103197);
                    }

                    @Override // com.toutiao.proxyserver.h.a
                    public final void a(String str) {
                        com.toutiao.proxyserver.e.c.b("TAG_PROXY_DiskLruCache", "new cache created: ".concat(String.valueOf(str)), null);
                    }

                    @Override // com.toutiao.proxyserver.h.a
                    public final void a(Set<String> set) {
                        MethodCollector.i(10427);
                        c cVar = u.f154989d;
                        if (set != null && !set.isEmpty()) {
                            int size = set.size() + 1;
                            String[] strArr = new String[size];
                            int i2 = -1;
                            Map<String, com.toutiao.proxyserver.c.a> map = cVar.f154808a.get(0);
                            for (String str : set) {
                                if (map != null) {
                                    map.remove(str);
                                }
                                i2++;
                                strArr[i2] = str;
                            }
                            strArr[i2 + 1] = "0";
                            try {
                                cVar.f154809b.getWritableDatabase().delete("video_http_header_t", "key IN(" + c.a(size - 1) + ") AND flag=?", strArr);
                            } catch (Throwable unused) {
                            }
                        }
                        com.toutiao.proxyserver.e.c.b("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(String.valueOf(set)), null);
                        if (set != null) {
                            for (String str2 : set) {
                                ae aeVar = ae.b.f154780a;
                                String str3 = aeVar.f154776b.get(str2);
                                if (str3 != null) {
                                    aeVar.f154775a.remove(str3);
                                }
                            }
                        }
                        MethodCollector.o(10427);
                    }
                });
                v a2 = v.a();
                a2.f155005f = hVar;
                a2.f155004e = f154989d;
                t a3 = t.a();
                a3.f154958d = hVar;
                a3.f154957c = f154989d;
                return;
            }
            throw new IllegalArgumentException("DiskLruCache & DiskCache can not use same path");
        }
    }

    public static void a(r rVar, Context context) {
        if (context != null) {
            f154990e = a(context);
            if (f154988c == null) {
                h hVar = f154987b;
                if (hVar == null || !hVar.f154865a.getAbsolutePath().equals(rVar.f154949k.getAbsolutePath())) {
                    f154988c = rVar;
                    v.a().f155006g = rVar;
                    t.a().f154960f = rVar;
                    return;
                }
                throw new IllegalArgumentException("DiskLruCache & DiskCache can not use same path");
            }
            return;
        }
        throw new IllegalArgumentException("MusicDiskCache and Context can't be null");
    }

    public static void a(int i2, String str, String str2) {
        if (f154994i != null) {
            f154994i.a(i2, str, str2);
        }
    }

    public static String a(String str, String str2, List<String> list, String str3) {
        Object[] objArr = new Object[3];
        if (D == null) {
            D = String.valueOf(new Random().nextInt());
        }
        objArr[0] = D;
        objArr[1] = str;
        objArr[2] = str2;
        StringBuilder sb = new StringBuilder(com.a.a("%s-%s-%s", objArr));
        if (!TextUtils.isEmpty(str3)) {
            sb.append("-").append(str3);
        }
        for (String str4 : list) {
            sb.append("-").append(str4);
        }
        com.toutiao.proxyserver.e.c.a("TAG_PROXY", "------as-----:" + sb.toString(), null);
        return new StringBuilder().append(sb.toString().hashCode()).toString();
    }
}
