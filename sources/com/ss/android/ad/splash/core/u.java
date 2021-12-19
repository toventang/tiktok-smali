package com.ss.android.ad.splash.core;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.aa;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.l;
import com.ss.android.ad.splash.core.e.p;
import com.ss.android.ad.splash.f.d;
import com.ss.android.ad.splash.f.f;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.h;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class u {

    /* renamed from: d  reason: collision with root package name */
    private static volatile u f58695d;

    /* renamed from: a  reason: collision with root package name */
    public volatile long f58696a;

    /* renamed from: b  reason: collision with root package name */
    public long f58697b = 20000;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ad.splash.e.a f58698c = new a();

    static {
        Covode.recordClassIndex(36375);
    }

    public static void a(List<l> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (!f.a(list)) {
                for (l lVar : list) {
                    String x = lVar.x();
                    if (!com.ss.android.ad.splash.f.l.a(x)) {
                        jSONArray.put(x);
                    }
                }
            }
            jSONObject2.put("splash_receive_key", jSONArray);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", k.a().f58667l);
            h.a(84378473382L, "splash_ad", "splash_receive", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void a(b bVar) {
        if (g(bVar)) {
            v.a().a(bVar.f58438a);
        }
        d(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.ss.android.ad.splash.core.e.b r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.u.a(com.ss.android.ad.splash.core.e.b, java.lang.String, java.lang.String, boolean):boolean");
    }

    private static boolean a(p pVar, boolean z) {
        if (pVar != null && pVar.a()) {
            String a2 = j.a(pVar);
            String a3 = j.a(pVar, z);
            if (com.ss.android.ad.splash.f.l.a(a2) || com.ss.android.ad.splash.f.l.a(a3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void a(final b bVar, final String str, final String str2, final int i2, final boolean z) {
        h a2 = a(bVar, true);
        final long currentTimeMillis = System.currentTimeMillis();
        if (h.f58574c != null) {
            h.f58574c.a(str, str2, a2, new aa.a() {
                /* class com.ss.android.ad.splash.core.u.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(36381);
                }

                @Override // com.ss.android.ad.splash.aa.a
                public final void b() {
                    int i2;
                    com.ss.android.ad.splash.f.a.a(bVar.f58441d, " the resource url of video ad is " + str + ", download async failed");
                    int i3 = i2;
                    if (i3 > 0) {
                        u.this.a(bVar, str, str2, i3 - 1);
                        return;
                    }
                    b bVar = bVar;
                    if (z) {
                        i2 = 2;
                    } else {
                        i2 = -1;
                    }
                    u.a(bVar, 17, true, i2);
                }

                @Override // com.ss.android.ad.splash.aa.a
                public final void a() {
                    int i2;
                    com.ss.android.ad.splash.f.a.a(bVar.f58441d, " the resource url of video ad is " + str);
                    u.a(str2, bVar.e());
                    b bVar = bVar;
                    if (z) {
                        i2 = 2;
                    } else {
                        i2 = -1;
                    }
                    u.a(bVar, 16, true, i2);
                    u.a(1, str2);
                    u.a(2, System.currentTimeMillis() - currentTimeMillis);
                    v.a().a(bVar.r);
                }
            });
        }
    }

    public static void a(String str, long j2) {
        JSONArray jSONArray;
        MethodCollector.i(3179);
        try {
            if (com.ss.android.ad.splash.f.l.a(str) || j2 <= 0) {
                MethodCollector.o(3179);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j2));
            synchronized (v.class) {
                try {
                    String g2 = v.a().g();
                    if (com.ss.android.ad.splash.f.l.a(g2)) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = new JSONArray(g2);
                    }
                    jSONArray.put(jSONObject);
                    v.a().f(jSONArray.toString()).h();
                } finally {
                    MethodCollector.o(3179);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(3179);
        }
    }

    private u() {
    }

    public final boolean b() {
        if (System.currentTimeMillis() - this.f58696a > this.f58697b) {
            return true;
        }
        return false;
    }

    public static u a() {
        MethodCollector.i(3125);
        if (f58695d == null) {
            synchronized (u.class) {
                try {
                    if (f58695d == null) {
                        f58695d = new u();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3125);
                    throw th;
                }
            }
        }
        u uVar = f58695d;
        MethodCollector.o(3125);
        return uVar;
    }

    class a implements com.ss.android.ad.splash.e.a {
        static {
            Covode.recordClassIndex(36382);
        }

        a() {
        }
    }

    public static void a(long j2) {
        if (j2 > 0) {
            g.a("splash remote server time: ".concat(String.valueOf(j2)));
            v.a().d(j2);
        }
    }

    public static void c(b bVar) {
        long j2;
        String str = k.a().f58667l;
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            j2 = bVar.f58441d;
            str = bVar.f58447j;
            currentTimeMillis = bVar.f58439b;
        } else {
            j2 = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", str);
            jSONObject.put("is_ad_event", "1");
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(currentTimeMillis));
            h.a(j2, "splash_ad", "launch_covered", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private boolean d(b bVar) {
        boolean z = false;
        if (!f.a(bVar.p)) {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, "start to download resource of time-gap ad");
            for (b bVar2 : bVar.p) {
                if (bVar2 != null && bVar2.a() && g(bVar2)) {
                    v.a().a(bVar2.f58438a);
                    z = true;
                }
            }
        }
        return z;
    }

    private void e(b bVar) {
        if (!f.a(bVar.p)) {
            for (b bVar2 : bVar.p) {
                if (bVar2 != null && bVar2.a()) {
                    j(bVar2);
                }
            }
        }
    }

    private static boolean f(b bVar) {
        if (!j.a(bVar)) {
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(bVar, "splash_start_download");
        }
        p pVar = bVar.r;
        if (a(pVar, bVar.k()) && h(bVar)) {
            return a(bVar, j.a(pVar), j.a(pVar, bVar.k()), false);
        }
        return false;
    }

    private static boolean h(b bVar) {
        if (j.a(bVar.r, v.a())) {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, " video resource exist, no more download");
            b(bVar, 0);
            return false;
        } else if (!j.a(bVar)) {
            return true;
        } else {
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(bVar, "topview_start_download");
            return true;
        }
    }

    private static boolean i(b bVar) {
        if (j.a(bVar.f58438a, v.a())) {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, " image resource exist, no more download");
            if (bVar.q != 3) {
                b(bVar, 0);
            }
            return false;
        } else if (!j.a(bVar) || bVar.q == 3) {
            return true;
        } else {
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(bVar, "topview_start_download");
            return true;
        }
    }

    public static void c(List<b> list) {
        if (com.ss.android.ad.splash.f.h.b(h.r) && !f.a(list) && h.f58574c != null) {
            try {
                if (com.ss.android.ad.splash.f.h.c(h.r) != 0) {
                    for (b bVar : list) {
                        if (bVar != null && bVar.a()) {
                            int i2 = bVar.q;
                            if (!(i2 == 0 || i2 == 1)) {
                                if (i2 == 2 || i2 == 3) {
                                    a(bVar, 2);
                                } else if (i2 != 4) {
                                }
                            }
                            a(bVar, 1);
                            if (!f.a(bVar.p)) {
                                for (b bVar2 : bVar.p) {
                                    if (bVar2 != null && bVar2.a()) {
                                        a(bVar2, 1);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(List<b> list) {
        if (!f.a(list)) {
            for (b bVar : list) {
                if (bVar.u == 1 && bVar.u()) {
                    c(bVar);
                    return;
                }
            }
        }
    }

    private void f(List<b> list) {
        int c2 = com.ss.android.ad.splash.f.h.c(h.r);
        if (c2 != 0) {
            for (b bVar : list) {
                if (bVar != null && bVar.a()) {
                    if ((bVar.I & c2) != 0) {
                        int i2 = bVar.q;
                        if (!(i2 == 0 || i2 == 1)) {
                            if (i2 == 2 || i2 == 3) {
                                if (j.a(bVar.G, true)) {
                                    k(bVar);
                                    if (bVar.q == 3) {
                                        j(bVar);
                                    }
                                } else {
                                    b(bVar);
                                }
                            } else if (i2 != 4) {
                            }
                        }
                        if (j.a(bVar.G, false)) {
                            j(bVar);
                            e(bVar);
                        } else {
                            a(bVar);
                        }
                    } else {
                        b(bVar, 1);
                    }
                }
            }
        }
    }

    private void j(final b bVar) {
        if (!j.a(bVar) && bVar.q != 3) {
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(bVar, "splash_start_download");
        }
        com.ss.android.ad.splash.core.e.f fVar = bVar.f58438a;
        if (fVar != null) {
            String a2 = j.a(fVar);
            final String b2 = j.b(fVar);
            if (!com.ss.android.ad.splash.f.l.a(a2) && !com.ss.android.ad.splash.f.l.a(b2) && i(bVar)) {
                h a3 = a(bVar, false);
                final long currentTimeMillis = System.currentTimeMillis();
                if (h.f58574c != null) {
                    h.f58574c.a(a2, b2, a3, new aa.a() {
                        /* class com.ss.android.ad.splash.core.u.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(36380);
                        }

                        @Override // com.ss.android.ad.splash.aa.a
                        public final void b() {
                            u.a(bVar, 1, true, -1);
                        }

                        @Override // com.ss.android.ad.splash.aa.a
                        public final void a() {
                            u.a(b2, bVar.e());
                            u.a(bVar, 0, true, -1);
                            u.a(0, b2);
                            u.a(1, System.currentTimeMillis() - currentTimeMillis);
                            v.a().a(bVar.f58438a);
                        }
                    });
                }
            }
        }
    }

    private void k(b bVar) {
        if (!j.a(bVar)) {
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(bVar, "splash_start_download");
        }
        p pVar = bVar.r;
        if (a(pVar, bVar.k())) {
            if (h(bVar)) {
                a(bVar, j.a(pVar), j.a(pVar, bVar.k()), 1);
            }
            if (bVar.G == 3) {
                com.ss.android.ad.splash.f.a.a(bVar.f58441d, " interactive splash ad, checking if resource of second video exist");
                p pVar2 = bVar.s;
                if (a(pVar2, bVar.k()) && !j.a(pVar2, v.a())) {
                    com.ss.android.ad.splash.f.a.a(bVar.f58441d, " start to download the second video of interactive ad async");
                    a(bVar, j.a(pVar2), j.a(pVar2, bVar.k()), 3, true);
                }
            }
        }
    }

    public final void b(b bVar) {
        if (f(bVar)) {
            v.a().a(bVar.r);
        }
        if (bVar.q == 3 && g(bVar)) {
            v.a().a(bVar.f58438a);
        }
        if (bVar.G == 3) {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, " interactive splash ad, checking if resource of second video exist");
            p pVar = bVar.s;
            if (a(pVar, bVar.k())) {
                if (!j.a(pVar, v.a())) {
                    com.ss.android.ad.splash.f.a.a(bVar.f58441d, " start to download the second video of interactive splash ad ");
                    if (a(bVar, j.a(pVar), j.a(pVar, bVar.k()), true)) {
                        v.a().a(bVar.s);
                        return;
                    }
                    return;
                }
                com.ss.android.ad.splash.f.a.a(bVar.f58441d, " the second video of interactive splash ad exist, no more download ");
            }
        }
    }

    public static void d(List<b> list) {
        if (!com.ss.android.ad.splash.f.h.b(h.r) || f.a(list) || h.f58574c == null) {
            return;
        }
        if (h.f58575d == null || !h.f58575d.a()) {
            g.b("microapp is not supported");
            return;
        }
        for (b bVar : list) {
            if (bVar == null || !bVar.a() || bVar.J == 0) {
                g.b("invalid splashAd or not preload");
            } else if (j.a(bVar.f58444g) == 5 && com.ss.android.ad.splash.f.h.b(h.r)) {
                if (bVar.J != 1) {
                    if (bVar.J == 2) {
                        Context context = h.r;
                        if (com.ss.android.ad.splash.f.h.b(context)) {
                            if (com.ss.android.ad.splash.f.h.c(context) != 1) {
                            }
                        }
                    }
                }
                "microgame".equals(Uri.parse(bVar.f58444g).getHost());
                g.b("preload micro app success:false");
            }
        }
    }

    private void g(List<b> list) {
        if (h.f58578g == null) {
            int i2 = k.a().f58665j;
            l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
            a2.f79174c = i2;
            h.f58578g = com.ss.android.ugc.aweme.cw.g.a(a2.a());
        }
        if (h.f58583l == null) {
            h.f58583l = new ConcurrentHashMap<>();
        }
        int c2 = com.ss.android.ad.splash.f.h.c(h.r);
        if (c2 != 0) {
            for (final b bVar : list) {
                if (!(bVar == null || !bVar.a() || (bVar.I & c2) == 0)) {
                    long j2 = bVar.f58441d;
                    if (!h.f58583l.containsKey(Long.valueOf(j2))) {
                        h.f58583l.put(Long.valueOf(j2), 0);
                        int i3 = bVar.q;
                        if (!(i3 == 0 || i3 == 1)) {
                            if (i3 == 2 || i3 == 3) {
                                h.f58578g.execute(new Runnable() {
                                    /* class com.ss.android.ad.splash.core.u.AnonymousClass4 */

                                    static {
                                        Covode.recordClassIndex(36379);
                                    }

                                    public final void run() {
                                        Thread.currentThread().setName("SplashSDKDownloadThread_" + bVar.f58441d);
                                        u.this.b(bVar);
                                        h.a(bVar.f58441d);
                                    }
                                });
                            } else if (i3 != 4) {
                            }
                        }
                        h.f58578g.execute(new Runnable() {
                            /* class com.ss.android.ad.splash.core.u.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(36378);
                            }

                            public final void run() {
                                Thread.currentThread().setName("SplashSDKDownloadThread_" + bVar.f58441d);
                                u.this.a(bVar);
                                h.a(bVar.f58441d);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean g(com.ss.android.ad.splash.core.e.b r10) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.u.g(com.ss.android.ad.splash.core.e.b):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0149 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0108 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x014c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ef A[Catch:{ all -> 0x0158 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List<com.ss.android.ad.splash.core.e.b> r14) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.u.b(java.util.List):void");
    }

    private static void b(b bVar, int i2) {
        String str;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.put("reason", Integer.valueOf(i2));
        if (j.a(bVar)) {
            str = "topview_no_download";
        } else {
            str = "splash_no_download";
        }
        com.ss.android.ad.splash.core.c.b.a();
        com.ss.android.ad.splash.core.c.b.a(bVar, 0, str, hashMap2, hashMap);
    }

    private static h a(b bVar, boolean z) {
        h.a aVar = new h.a();
        aVar.f58993a = bVar.f58441d;
        aVar.f58994b = bVar.f58447j;
        aVar.f58995c = bVar.A;
        aVar.f58996d = j.a(bVar);
        aVar.f58997e = bVar.A();
        if (z) {
            aVar.f58998f = 2;
        } else {
            aVar.f58998f = 1;
        }
        h a2 = aVar.a();
        a2.f58990d = bVar.h();
        return a2;
    }

    public static void a(int i2, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j2));
            jSONObject.putOpt("res_type", Integer.valueOf(i2));
            com.ss.android.ad.splash.b.a.a().a("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(int i2, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(d.a(str)));
            com.ss.android.ad.splash.b.a.a().a("sevice_ad_file_size", i2, jSONObject, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(b bVar, int i2) {
        h.a aVar = new h.a();
        aVar.f58993a = bVar.f58441d;
        aVar.f58994b = bVar.f58447j;
        aVar.f58998f = i2;
        aVar.f58995c = bVar.A;
        aVar.f58997e = bVar.A();
        aVar.a();
    }

    public final void a(b bVar, String str, String str2, int i2) {
        a(bVar, str, str2, i2, false);
    }

    public static void a(b bVar, int i2, boolean z, int i3) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        String str3 = "";
        if (i2 == 0) {
            str3 = j.a(bVar.f58438a);
            str = "download_image_succeed";
            hashMap2.put("image_mode", Integer.valueOf(bVar.f58450m));
        } else if (i2 == 1) {
            str3 = j.a(bVar.f58438a);
            str = "download_image_failed";
            hashMap2.put("image_mode", Integer.valueOf(bVar.f58450m));
        } else if (i2 == 16) {
            try {
                str3 = j.a(bVar.r);
                str = "download_video_succeed";
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        } else if (i2 != 17) {
            str = str3;
        } else {
            str3 = j.a(bVar.r);
            str = "download_video_failed";
        }
        hashMap.put("ad_fetch_time", Long.valueOf(bVar.f58439b));
        if (i3 != -1) {
            hashMap2.put("position", Integer.valueOf(i3));
        }
        hashMap2.put("url", str3);
        String str4 = "1";
        if (j.a(bVar)) {
            str2 = str4;
        } else {
            str2 = "0";
        }
        hashMap2.put("is_topview", str2);
        if (!z) {
            str4 = "0";
        }
        hashMap2.put("is_async", str4);
        com.ss.android.ad.splash.core.c.b.a();
        com.ss.android.ad.splash.core.c.b.a(bVar, 0, str, hashMap, hashMap2);
    }
}
