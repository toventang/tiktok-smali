package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.c.a;
import com.ss.android.ad.splash.core.e.b;
import com.ss.android.ad.splash.core.e.h;
import com.ss.android.ad.splash.core.e.k;
import com.ss.android.ad.splash.f.a;
import com.ss.android.ad.splash.f.f;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class n {

    /* renamed from: d  reason: collision with root package name */
    private static volatile n f58671d;

    /* renamed from: a  reason: collision with root package name */
    public long f58672a;

    /* renamed from: b  reason: collision with root package name */
    public String f58673b = "";

    /* renamed from: c  reason: collision with root package name */
    public long f58674c;

    /* renamed from: e  reason: collision with root package name */
    private long f58675e;

    /* renamed from: f  reason: collision with root package name */
    private b f58676f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58677g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58678h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f58679i;

    static {
        Covode.recordClassIndex(36366);
    }

    private static void a(b bVar, int i2, String str) {
        String str2 = "1";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("log_extra", bVar.f58447j).putOpt("is_ad_event", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ad_position", str);
            jSONObject2.putOpt("error_code", Integer.valueOf(i2));
            if (!j.a(bVar)) {
                str2 = "0";
            }
            jSONObject2.putOpt("is_topview", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.f58439b);
        } catch (Exception unused) {
        }
        h.a(bVar.f58441d, "splash_ad", "data_invalid", jSONObject);
    }

    private static void a(b bVar, int i2) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.f58447j);
            JSONObject jSONObject2 = new JSONObject();
            String str2 = "";
            if (i2 == 1) {
                str2 = "not_download_image";
                str = j.a(bVar.f58438a);
            } else if (i2 != 2) {
                str = str2;
            } else {
                str2 = "not_download_video";
                str = j.a(bVar.r);
            }
            jSONObject2.putOpt("reason", str2);
            jSONObject2.putOpt("url", str);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.f58439b));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        h.a(bVar.f58441d, "splash_ad", "not_showing_reason", jSONObject);
    }

    private static void a(long j2, boolean z, boolean z2, boolean z3) {
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", str);
            jSONObject2.putOpt("status", z ? str : "0");
            jSONObject.putOpt("log_extra", k.a().f58667l);
            if (z) {
                jSONObject2.putOpt("duration", Long.valueOf(j2));
                if (!z3) {
                    str = "0";
                }
                jSONObject2.putOpt("stop_show", str);
            } else {
                if (!z2) {
                    str = "0";
                }
                jSONObject2.putOpt("is_penalty_period", str);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        h.a(84378473382L, "splash_ad", "stop_showing_monitor", jSONObject);
    }

    private static void a(String str, int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length == 2) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 : iArr) {
                        jSONArray.put(i2);
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("log_extra", k.a().f58667l);
                    jSONObject2.put("first_show_period", jSONArray);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("is_ad_event", "1");
                    h.a(84378473382L, "splash_ad", str, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.ss.android.ad.splash.core.e.b r7) {
        /*
            r6 = this;
            com.ss.android.ad.splash.c.c r1 = com.ss.android.ad.splash.core.h.U
            r5 = 0
            if (r1 != 0) goto L_0x000b
            java.lang.String r0 = "origin splash operation is null"
            com.ss.android.ad.splash.f.g.d(r0)
            return r5
        L_0x000b:
            java.lang.String r0 = r7.H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = "origin splash adid is empty"
            com.ss.android.ad.splash.f.g.d(r0)
            return r5
        L_0x0019:
            boolean r0 = r7.h()
            if (r0 == 0) goto L_0x0043
            boolean r5 = r1.a(r7, r5)
            if (r5 == 0) goto L_0x0040
            java.lang.String r4 = "topview_show_confirmed"
            long r0 = java.lang.System.currentTimeMillis()
            r6.a(r0)
        L_0x002e:
            com.ss.android.ad.splash.core.k r3 = com.ss.android.ad.splash.core.k.a()
            long r1 = r7.f58441d
            r0 = 2009(0x7d9, float:2.815E-42)
            r3.a(r1, r0)
            com.ss.android.ad.splash.core.c.b.a()
            com.ss.android.ad.splash.core.c.b.b(r7, r4)
            return r5
        L_0x0040:
            java.lang.String r4 = "topview_show_rejected"
            goto L_0x004b
        L_0x0043:
            boolean r0 = r7.i()
            if (r0 == 0) goto L_0x0052
            java.lang.String r4 = "topview_search_show_rejected"
        L_0x004b:
            com.ss.android.ad.splash.core.e.b r0 = r6.f58676f
            if (r0 != 0) goto L_0x002e
            r6.f58676f = r7
            goto L_0x002e
        L_0x0052:
            java.lang.String r4 = ""
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.n.a(com.ss.android.ad.splash.core.e.b):boolean");
    }

    private n() {
    }

    public static n a() {
        MethodCollector.i(2864);
        if (f58671d == null) {
            synchronized (n.class) {
                try {
                    if (f58671d == null) {
                        f58671d = new n();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2864);
                    throw th;
                }
            }
        }
        n nVar = f58671d;
        MethodCollector.o(2864);
        return nVar;
    }

    private void e() {
        boolean z;
        if (h.f58582k) {
            z = this.f58677g;
        } else {
            z = this.f58678h;
        }
        if (!this.f58679i && !z && h.a().f58912d) {
            v.a().e().h();
            HashMap hashMap = new HashMap(1);
            hashMap.put("is_emptyround", 1);
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("log_extra", v.a().t());
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(null, 84378473382L, "showlimit", hashMap2, hashMap);
            a.a(0, "empty list, add show count");
        }
    }

    private List<b> d() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (k.a().f58657b != null) {
            arrayList = new ArrayList(k.a().f58657b);
        } else {
            arrayList = null;
        }
        if (!f.a(arrayList)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b bVar = (b) it.next();
                if (bVar.u()) {
                    arrayList2.add(bVar);
                    a.a(bVar.f58441d, "retrieved first show ad");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.f58447j).putOpt("ad_fetch_time", Long.valueOf(bVar.f58439b));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    h.a(bVar.f58441d, "splash_ad", "launch_miss", jSONObject);
                    v.a().a(false).h();
                    break;
                }
                a.a(bVar.f58441d, "retrieve first show ad failed with showtime expired");
            }
        } else {
            a.a(0, "retrieve first show ad failed with empty array");
        }
        if (arrayList2.size() > 0) {
            this.f58674c = ((b) arrayList2.get(0)).f58441d;
        }
        return arrayList2;
    }

    private com.ss.android.ad.splash.core.e.j c() {
        boolean z;
        MethodCollector.i(2946);
        if (x.a().f58931h) {
            MethodCollector.o(2946);
            return null;
        }
        com.ss.android.ad.splash.core.e.j jVar = new com.ss.android.ad.splash.core.e.j();
        b b2 = g.a().b();
        if (b2 != null) {
            g.a().c();
            jVar.f58494a = b2;
            jVar.f58495b = 200;
            MethodCollector.o(2946);
            return jVar;
        }
        this.f58679i = false;
        int i2 = 2;
        int i3 = 1;
        if (h.a().f58912d) {
            v a2 = v.a();
            v.f58718c.setTimeInMillis(System.currentTimeMillis());
            if (v.f58718c.get(5) + v.f58718c.get(2) + v.f58718c.get(1) != a2.l()) {
                z = true;
            } else {
                z = false;
            }
            this.f58678h = z;
        }
        this.f58677g = !v.a().d();
        boolean z2 = h.T;
        int a3 = a(z2);
        if (a3 != 4) {
            if (a3 == 0) {
                a.a(0, " interval check passed while ad show time has reached limits, stop showing ad with refresh-time increased ");
                b(true);
                com.ss.android.ad.splash.core.c.b.a();
                a.C1285a aVar = new a.C1285a();
                aVar.f58415a = 84378473382L;
                aVar.f58418d = k.a().f58667l;
                aVar.f58416b = 6;
                com.ss.android.ad.splash.core.c.b.c(aVar.a());
                jVar.f58495b = -1;
                if (!this.f58677g) {
                    jVar.f58496c = j.f();
                }
                k.a().a(84378473382L, 1002);
            } else {
                com.ss.android.ad.splash.f.a.a(0, " interval check failed, stop showing ad with refresh-time unchanging ");
                if (z2 && h.a().f58918j) {
                    i2 = 29;
                }
                com.ss.android.ad.splash.core.c.b.a();
                a.C1285a aVar2 = new a.C1285a();
                aVar2.f58415a = 84378473382L;
                aVar2.f58416b = i2;
                aVar2.f58418d = k.a().f58667l;
                com.ss.android.ad.splash.core.c.b.a(aVar2.a());
                jVar.f58495b = 301;
                k.a().a(84378473382L, 1001);
            }
            MethodCollector.o(2946);
            return jVar;
        }
        com.ss.android.ad.splash.f.a.a(0, " interval check passed with refresh-time increased, now checking stop-show status ");
        com.ss.android.ad.splash.f.a.a(0, " last show time is  " + com.ss.android.ad.splash.f.n.a(v.a().v()));
        b(false);
        if (!this.f58677g) {
            jVar.f58496c = j.f();
        }
        g.b("UDPClient. getCurrentSplashAd " + System.currentTimeMillis() + "result :" + x.a().f58925b);
        if (x.a().f58925b != -1) {
            long j2 = x.a().f58930g;
            if (x.a().f58925b == 1) {
                a(j2, true, false, true);
                com.ss.android.ad.splash.f.a.a(0, " receiving stop-show order success, stop selecting ad ");
                jVar.f58495b = 302;
                k.a().a(84378473382L, 1003);
                MethodCollector.o(2946);
                return jVar;
            } else if (x.a().f58925b == 2) {
                com.ss.android.ad.splash.f.a.a(0, " receiving stop-show order success, continue to selecting ad ");
                a(j2, true, false, false);
            }
        } else {
            com.ss.android.ad.splash.f.a.a(0, " receiving stop-show order failed, fallback to preloaded stop-show period ");
            if (!x.a().d()) {
                long j3 = k.a().f58661f;
                long j4 = k.a().f58662g;
                if (j.a(j3, j4)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= j3 && currentTimeMillis <= j4) {
                        if (h.T) {
                            a(0, false, true, false);
                        }
                        com.ss.android.ad.splash.f.a.a(0, " current time is in stop-show period, stop selecting ad ");
                        jVar.f58495b = 302;
                        k.a().a(84378473382L, 1004);
                        MethodCollector.o(2946);
                        return jVar;
                    }
                }
            }
            if (h.T) {
                a(0, false, false, false);
            }
            com.ss.android.ad.splash.f.a.a(0, " current time is not in stop-show period, continue to selecting ad ");
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (h.as) {
            synchronized (n.class) {
                try {
                    a(jVar);
                } catch (Throwable th) {
                    MethodCollector.o(2946);
                    throw th;
                }
            }
        } else {
            a(jVar);
            i3 = 0;
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", currentTimeMillis3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ss.android.ad.splash.b.a.a().a("service_get_available_ad_duration", i3, jSONObject, null);
        MethodCollector.o(2946);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ad.splash.core.e.j b() {
        List<b> list;
        List<k> list2;
        if (x.a().f58931h) {
            com.ss.android.ad.splash.f.a.b(" SDK is unavailable ");
            return null;
        } else if (h.Y) {
            com.ss.android.ad.splash.core.e.j c2 = c();
            if (!(c2 == null || c2.f58496c == 0)) {
                com.ss.android.ad.splash.f.a.a(0, " recording show time of first-show-timegap ad ");
                v a2 = v.a();
                a2.u().putLong("key_splash_ad_showed_time", c2.f58496c);
                a2.h();
            }
            return c2;
        } else {
            com.ss.android.ad.splash.core.e.j jVar = new com.ss.android.ad.splash.core.e.j();
            b b2 = g.a().b();
            if (b2 != null) {
                g.a().c();
                jVar.f58495b = 200;
                jVar.f58494a = b2;
                return jVar;
            }
            this.f58677g = !v.a().d();
            int a3 = a(h.T);
            int i2 = 4;
            if (a3 != 4) {
                if (a3 == 0) {
                    com.ss.android.ad.splash.f.a.a(0, " interval check passed while ad show time has reached limits, stop showing ad with refresh-time increased ");
                    b(true);
                    a.C1285a aVar = new a.C1285a();
                    aVar.f58415a = 84378473382L;
                    aVar.f58418d = k.a().f58667l;
                    aVar.f58416b = 6;
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.c(aVar.a());
                    jVar.f58495b = -1;
                } else {
                    com.ss.android.ad.splash.f.a.a(0, " interval check failed, stop showing ad with refresh-time unchanging ");
                    a.C1285a aVar2 = new a.C1285a();
                    aVar2.f58415a = 84378473382L;
                    aVar2.f58416b = 2;
                    aVar2.f58418d = k.a().f58667l;
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(aVar2.a());
                    jVar.f58495b = 301;
                }
                return jVar;
            }
            com.ss.android.ad.splash.f.a.a(0, " interval check passed with refresh-time increased, now checking stop-show status ");
            b(false);
            g.b("UDPClient. getCurrentSplashAd " + System.currentTimeMillis() + "result :" + x.a().f58925b);
            if (x.a().f58925b != -1) {
                long j2 = x.a().f58930g;
                if (x.a().f58925b == 1) {
                    a(j2, true, false, true);
                    com.ss.android.ad.splash.f.a.a(0, " receiving stop-show order success, stop selecting ad ");
                    jVar.f58495b = 302;
                    return jVar;
                } else if (x.a().f58925b == 2) {
                    com.ss.android.ad.splash.f.a.a(0, " receiving stop-show order success, continue to selecting ad ");
                    a(j2, true, false, false);
                }
            } else {
                com.ss.android.ad.splash.f.a.a(0, " receiving stop-show order failed, fallback to preloaded stop-show period ");
                if (!x.a().c()) {
                    long j3 = k.a().f58661f;
                    long j4 = k.a().f58662g;
                    if (j.a(j3, j4)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis >= j3 && currentTimeMillis <= j4) {
                            if (h.T) {
                                a(0, false, true, false);
                            }
                            com.ss.android.ad.splash.f.a.a(0, " current time is in stop-show period, stop selecting ad ");
                            jVar.f58495b = 302;
                            return jVar;
                        }
                    }
                }
                if (h.T) {
                    a(0, false, false, false);
                }
                com.ss.android.ad.splash.f.a.a(0, " current time is not in stop-show period, continue to selecting ad ");
            }
            h hVar = k.a().f58658c;
            if (hVar == null) {
                return null;
            }
            if (!hVar.f58490e || !x.a().c()) {
                if (h.P) {
                    com.ss.android.ad.splash.f.a.a(0, " realtime request failed, fall back to preloaded array");
                    com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 3, (JSONObject) null);
                }
                list = hVar.f58487b;
                if (f.a(list)) {
                    com.ss.android.ad.splash.f.a.a(0, "empty ad array, not showing ad this time");
                    a.C1285a aVar3 = new a.C1285a();
                    aVar3.f58415a = 84378473382L;
                    aVar3.f58416b = 3;
                    aVar3.f58418d = k.a().f58667l;
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(aVar3.a());
                    com.ss.android.ad.splash.b.b.a();
                    com.ss.android.ad.splash.b.b.a(1);
                    return null;
                }
            } else {
                com.ss.android.ad.splash.f.a.a(0, " receiving realtime ad ");
                x a4 = x.a();
                if (!a4.c()) {
                    list2 = null;
                } else {
                    list2 = a4.f58924a.f58533a;
                }
                list = j.a(hVar.f58488c, list2);
                if (f.a(list)) {
                    if (f.a(list2)) {
                        com.ss.android.ad.splash.f.a.a(0, " the realtime array received is empty ");
                        com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 2, (JSONObject) null);
                    } else {
                        com.ss.android.ad.splash.f.a.a(0, " there is no suitable ad between realtime array and preloaded array");
                        i2 = 5;
                        com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 1, (JSONObject) null);
                    }
                    a.C1285a aVar4 = new a.C1285a();
                    aVar4.f58415a = 84378473382L;
                    aVar4.f58416b = i2;
                    aVar4.f58418d = k.a().f58667l;
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(aVar4.a());
                    com.ss.android.ad.splash.b.b.a();
                    com.ss.android.ad.splash.b.b.a(1);
                    return null;
                }
                com.ss.android.ad.splash.b.a.a().a("service_real_time_ad_monitor", 0, (JSONObject) null);
            }
            if (h.f58582k) {
                com.ss.android.ad.splash.f.a.a(0, "support first show logic, is first show: " + this.f58677g);
                if (this.f58677g) {
                    if (!h.ar) {
                        v.a().b(true).h();
                    }
                    com.ss.android.ad.splash.f.a.a(0, "first show, selecting first show ad");
                    list = f(list);
                } else {
                    com.ss.android.ad.splash.f.a.a(0, "not first show, selecting non-first show ad");
                    list = h(list);
                }
            } else {
                com.ss.android.ad.splash.f.a.a(0, "not support first show");
            }
            List<b> e2 = e(list);
            if (f.a(e2)) {
                com.ss.android.ad.splash.f.a.a(0, "not suitable ad, not showing ad this time");
                return null;
            }
            b i3 = i(e2);
            if (!(this.f58676f == null || i3 == null)) {
                com.ss.android.ad.splash.core.c.b.a();
                com.ss.android.ad.splash.core.c.b.a(this.f58676f, i3);
            }
            this.f58676f = null;
            if (i3 != null) {
                jVar.f58495b = 200;
                jVar.f58494a = i3;
            } else {
                jVar.f58495b = -1;
            }
            return jVar;
        }
    }

    private static void a(int i2) {
        com.ss.android.ad.splash.b.b.a();
        com.ss.android.ad.splash.b.b.a(i2);
    }

    private boolean b(long j2) {
        if (Math.abs(j2 - this.f58675e) < k.a().f58659d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        this.f58675e = j2;
        if (h.a().f58918j) {
            v.a().c(j2).h();
        }
    }

    private b a(List<b> list) {
        if (f.a(list)) {
            com.ss.android.ad.splash.f.a.a(0, "not suitable ad, not showing ad this time");
            return null;
        } else if (x.a().c()) {
            com.ss.android.ad.splash.f.a.a(0, " checking ad resource with realtime data ");
            return c(list);
        } else {
            com.ss.android.ad.splash.f.a.a(0, " checking ad resource with non-realtime data ");
            com.ss.android.ad.splash.b.a.a().a("service_real_time_show", 3, (JSONObject) null);
            return b(list);
        }
    }

    private static void d(List<b> list) {
        b bVar;
        if (!f.a(list) && (bVar = list.get(0)) != null && bVar.a()) {
            HashMap hashMap = new HashMap();
            hashMap.put("show_expected", Integer.valueOf(bVar.f58440c));
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(bVar, 0, "should_show", null, hashMap);
        }
    }

    private static List<b> g(List<b> list) {
        if (f.a(list)) {
            com.ss.android.ad.splash.f.a.a(0, "selecting time gap first show ad, empty array, not showing ad this time");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            if (bVar.u == 4) {
                arrayList.add(bVar);
            } else {
                k.a().a(bVar.f58441d, 2007);
            }
        }
        return arrayList;
    }

    private static int b(b bVar) {
        if (bVar == null) {
            return 5006;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (h.ak) {
            currentTimeMillis = j.f();
        }
        if (bVar.d() > currentTimeMillis) {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, "ad not reached show time");
            return 5001;
        } else if (bVar.e() < currentTimeMillis) {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, "ad show time expired");
            return 5002;
        } else if (bVar.t) {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, "ad call backed");
            return 5003;
        } else if (h.ao == null || h.ao.a(bVar)) {
            return 5000;
        } else {
            com.ss.android.ad.splash.f.a.a(bVar.f58441d, "ad intercepted");
            return 5007;
        }
    }

    private static boolean c(b bVar) {
        int i2 = bVar.q;
        if (i2 != 0) {
            if (i2 == 2) {
                boolean a2 = j.a(bVar.r, v.a());
                if (a2 && bVar.G == 3) {
                    a2 = j.a(bVar.s, v.a());
                }
                if (a2) {
                    return a2;
                }
                a(bVar, 2);
                return a2;
            } else if (i2 == 3) {
                boolean a3 = j.a(bVar.f58438a, v.a());
                if (!a3) {
                    a(bVar, 1);
                }
                boolean a4 = j.a(bVar.r, v.a());
                if (!a4) {
                    a(bVar, 2);
                }
                if (!a3 || !a4) {
                    return false;
                }
                return true;
            } else if (i2 != 4) {
                return false;
            }
        }
        boolean a5 = j.a(bVar.f58438a, v.a());
        if (a5) {
            return a5;
        }
        a(bVar, 1);
        return a5;
    }

    private List<b> f(List<b> list) {
        if (f.a(list)) {
            com.ss.android.ad.splash.f.a.a(0, "not suitable ad, not showing ad this time");
            if (!h.ad) {
                return null;
            }
            list = new ArrayList<>();
        }
        List<b> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (bVar.u == 1) {
                com.ss.android.ad.splash.f.a.a(bVar.f58441d, "selected first show ad");
                arrayList.add(bVar);
            } else if (bVar.u != 3) {
                k.a().a(bVar.f58441d, 2006);
            }
        }
        if (f.a(arrayList) && h.ad) {
            com.ss.android.ad.splash.f.a.a(0, "no first show ad, retrieving local array");
            arrayList = d();
        }
        for (b bVar2 : list) {
            if (bVar2.u == 3) {
                com.ss.android.ad.splash.f.a.a(0, "selected gd ad");
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    private static List<b> h(List<b> list) {
        if (f.a(list)) {
            com.ss.android.ad.splash.f.a.a(0, "non first show with empty array, not showing this time");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar : list) {
            if (bVar.u == 1 || bVar.u == 4) {
                com.ss.android.ad.splash.core.c.b a2 = com.ss.android.ad.splash.core.c.b.a();
                a.C1285a aVar = new a.C1285a();
                aVar.f58415a = bVar.f58441d;
                aVar.f58417c = 5005;
                com.ss.android.ad.splash.core.c.a a3 = aVar.a();
                if (a2.f58421a != null) {
                    a2.f58421a.add(a3);
                }
            } else {
                com.ss.android.ad.splash.f.a.a(bVar.f58441d, "not first show, selected non-first show ad");
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private int a(boolean z) {
        if (h.a().t || !j.a(v.a())) {
            long currentTimeMillis = System.currentTimeMillis();
            if (h.f58584m && Math.abs(currentTimeMillis - h.n) > 10000) {
                a(3);
                return 3;
            } else if (Math.abs(currentTimeMillis - h.f58581j) < k.a().f58660e) {
                com.ss.android.ad.splash.f.a.a(0, "background interval illegal, not showing this time");
                a(4);
                return 1;
            } else {
                if (z && h.a().f58918j) {
                    long j2 = k.a().f58664i;
                    com.ss.android.ad.splash.f.a.a(0, "current time: " + com.ss.android.ad.splash.f.n.a(currentTimeMillis) + ", last show time: " + com.ss.android.ad.splash.f.n.a(this.f58672a) + ", diff: " + (currentTimeMillis - this.f58672a) + ", cold launch interval: " + j2);
                    if (Math.abs(currentTimeMillis - this.f58672a) < j2) {
                        com.ss.android.ad.splash.f.a.a(0, "splash cold launch show interval illegal, not showing ad this time");
                        a(5);
                        return 5;
                    }
                }
                if (b(currentTimeMillis)) {
                    com.ss.android.ad.splash.f.a.a(0, "splash show interval illegal, not showing this time");
                    a(5);
                    return 2;
                } else if (!h.a().t || !j.a(v.a())) {
                    return 4;
                } else {
                    com.ss.android.ad.splash.f.a.a(0, "show time exceeded today, not showing ad this time");
                    a(2);
                    return 0;
                }
            }
        } else {
            com.ss.android.ad.splash.f.a.a(0, "show time exceeded today, not showing ad this time");
            a(2);
            return 0;
        }
    }

    private b b(List<b> list) {
        b bVar = null;
        for (b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.b(bVar2);
                    k.a().a(bVar2.f58441d, 2008);
                } else {
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(bVar2);
                    if (bVar2.h() || bVar2.i()) {
                        if (a(bVar2)) {
                            com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "topview show confirmed");
                        } else {
                            com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "topview show rejected");
                        }
                    } else if (bVar2.a()) {
                        if (bVar2.D()) {
                            com.ss.android.ad.splash.f.a.a(bVar2.f58441d, " this ad has reached it\\'s show time limit ");
                        } else if (c(bVar2)) {
                            com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "normal ad ready to show");
                        } else {
                            com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "normal ad failed to show ");
                            if (this.f58674c == bVar2.f58441d) {
                                com.ss.android.ad.splash.core.c.b.a();
                                a.C1285a aVar = new a.C1285a();
                                aVar.f58415a = bVar2.f58441d;
                                aVar.f58417c = 4004;
                                aVar.f58418d = bVar2.f58447j;
                                aVar.f58416b = 1;
                                com.ss.android.ad.splash.core.c.b.b(aVar.a());
                            }
                            k.a().a(bVar2.f58441d, 2011);
                        }
                    }
                    bVar = bVar2;
                }
            }
        }
        if (bVar == null) {
            com.ss.android.ad.splash.b.b.a();
            com.ss.android.ad.splash.b.b.a(6);
        }
        return bVar;
    }

    private b c(List<b> list) {
        LinkedHashMap<Long, String> b2 = x.a().b();
        if (b2 == null) {
            return null;
        }
        if (b2.size() > 0) {
            b bVar = null;
            boolean z = false;
            for (Map.Entry<Long, String> entry : b2.entrySet()) {
                Long key = entry.getKey();
                String value = entry.getValue();
                Iterator<b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    if (next != null && next.f58441d == key.longValue()) {
                        if (bVar != null) {
                            com.ss.android.ad.splash.core.c.b.a();
                            com.ss.android.ad.splash.core.c.b.b(next);
                        } else {
                            com.ss.android.ad.splash.core.c.b.a();
                            com.ss.android.ad.splash.core.c.b.a(next);
                            if (!next.h() && !next.i()) {
                                boolean a2 = next.a();
                                boolean c2 = c(next);
                                if (!a2 || !c2) {
                                    com.ss.android.ad.splash.f.a.a(next.f58441d, "normal ad failed to show ");
                                    if (!c2 && this.f58674c == next.f58441d) {
                                        com.ss.android.ad.splash.core.c.b.a();
                                        a.C1285a aVar = new a.C1285a();
                                        aVar.f58415a = next.f58441d;
                                        aVar.f58417c = 4004;
                                        aVar.f58418d = next.f58447j;
                                        aVar.f58416b = 1;
                                        com.ss.android.ad.splash.core.c.b.b(aVar.a());
                                    }
                                } else {
                                    com.ss.android.ad.splash.f.a.a(next.f58441d, "normal ad ready to show");
                                    bVar = (b) next.clone();
                                    bVar.C = true;
                                    bVar.f58447j = value;
                                    com.ss.android.ad.splash.b.a.a().a("service_real_time_show", 0, (JSONObject) null);
                                }
                                z = true;
                            } else if (a(next)) {
                                com.ss.android.ad.splash.f.a.a(next.f58441d, "topview show confirmed");
                                bVar = next;
                            } else {
                                com.ss.android.ad.splash.f.a.a(next.f58441d, "topview show rejected");
                            }
                        }
                    }
                }
            }
            if (!z) {
                a(1, 1);
            }
            return bVar;
        }
        a(4, 2);
        return null;
    }

    private b i(List<b> list) {
        b bVar = null;
        for (b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.b(bVar2);
                } else {
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(bVar2);
                    if (!bVar2.h() && !bVar2.i()) {
                        boolean a2 = bVar2.a();
                        boolean c2 = c(bVar2);
                        if (a2) {
                            if (c2) {
                                com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "normal ad ready to show");
                                bVar = bVar2;
                            }
                        } else if (c2) {
                        }
                        com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "normal ad failed to show ");
                        if (!TextUtils.isEmpty(bVar2.E) && !TextUtils.isEmpty(this.f58673b) && bVar2.E.equals(this.f58673b)) {
                            com.ss.android.ad.splash.core.c.b.a();
                            a.C1285a aVar = new a.C1285a();
                            aVar.f58415a = bVar2.f58441d;
                            aVar.f58417c = 4004;
                            aVar.f58418d = bVar2.f58447j;
                            aVar.f58416b = 1;
                            com.ss.android.ad.splash.core.c.b.b(aVar.a());
                        }
                    } else if (a(bVar2)) {
                        com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "topview show confirmed");
                        return bVar2;
                    } else {
                        com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "topview show rejected");
                    }
                }
            }
        }
        return bVar;
    }

    private void b(boolean z) {
        v.a().f().h();
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad_sequence", Integer.valueOf(v.a().p()));
        hashMap.put("show_limit", Integer.valueOf(z ? 1 : 0));
        if (h.X != -1) {
            hashMap.put("is_cold_start", Integer.valueOf(h.X));
        }
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("log_extra", v.a().t());
        com.ss.android.ad.splash.core.c.b.a();
        com.ss.android.ad.splash.core.c.b.a(null, 84378473382L, "valid_stock", hashMap2, hashMap);
        com.ss.android.ad.splash.f.a.a(0, "sending stock request");
        com.ss.android.ad.splash.core.f.a.a(z);
        if (this.f58677g && h.ar) {
            com.ss.android.ad.splash.f.a.a(0, " consuming first-show ad opportunity ");
            v.a().b(true).h();
        }
    }

    private List<b> e(List<b> list) {
        if (h.ak) {
            if (j.f() == -1) {
                com.ss.android.ad.splash.core.c.b.a();
                com.ss.android.ad.splash.core.c.b.a(0, 1);
                return null;
            }
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(1, 0);
        }
        if (f.a(list)) {
            com.ss.android.ad.splash.f.a.a(0, "empty ad array, not showing ad this time");
            return null;
        }
        if (!TextUtils.isEmpty(list.get(0).E)) {
            this.f58673b = list.get(0).E;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar != null) {
                if (bVar.p != null && !bVar.p.isEmpty()) {
                    com.ss.android.ad.splash.f.a.a(bVar.f58441d, "selecting time gap ad");
                    for (int i3 = 0; i3 < bVar.p.size(); i3++) {
                        b bVar2 = bVar.p.get(i3);
                        if (bVar2 != null) {
                            int b2 = bVar2.b();
                            if (b2 != 2000) {
                                com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "time gap ad data illegal");
                                a(bVar2, b2, i2 + "_" + i3);
                                if (i2 == 0) {
                                    com.ss.android.ad.splash.core.c.b.a();
                                    a.C1285a aVar = new a.C1285a();
                                    aVar.f58415a = bVar2.f58441d;
                                    aVar.f58417c = b2;
                                    aVar.f58418d = bVar2.f58447j;
                                    aVar.f58416b = 1;
                                    com.ss.android.ad.splash.core.c.b.b(aVar.a());
                                }
                            } else {
                                com.ss.android.ad.splash.core.c.b.a();
                                com.ss.android.ad.splash.core.c.b.a(bVar2, b2);
                                int b3 = b(bVar2);
                                if (b3 == 5000) {
                                    com.ss.android.ad.splash.f.a.a(bVar2.f58441d, "time gap ad time-check passed");
                                    arrayList.add(bVar2);
                                    com.ss.android.ad.splash.core.c.b.a();
                                    com.ss.android.ad.splash.core.c.b.a(bVar2, b3);
                                } else {
                                    com.ss.android.ad.splash.core.c.b.a();
                                    a.C1285a aVar2 = new a.C1285a();
                                    aVar2.f58415a = bVar2.f58441d;
                                    aVar2.f58417c = b3;
                                    aVar2.f58418d = bVar2.f58447j;
                                    a.C1285a a2 = aVar2.a(j.a(bVar2));
                                    a2.f58416b = 1;
                                    com.ss.android.ad.splash.core.c.b.b(a2.a());
                                }
                            }
                        }
                    }
                }
                int b4 = bVar.b();
                if (b4 != 2000) {
                    com.ss.android.ad.splash.f.a.a(bVar.f58441d, "illegal ad data");
                    a(bVar, b4, String.valueOf(i2));
                    if (i2 == 0) {
                        com.ss.android.ad.splash.core.c.b.a();
                        a.C1285a aVar3 = new a.C1285a();
                        aVar3.f58415a = bVar.f58441d;
                        aVar3.f58417c = b4;
                        aVar3.f58418d = bVar.f58447j;
                        aVar3.f58416b = 1;
                        com.ss.android.ad.splash.core.c.b.b(aVar3.a());
                    }
                } else {
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(bVar, b4);
                    int b5 = b(bVar);
                    if (b5 == 5000) {
                        com.ss.android.ad.splash.f.a.a(bVar.f58441d, "ad time-check passed");
                        arrayList.add(bVar);
                        com.ss.android.ad.splash.core.c.b.a();
                        com.ss.android.ad.splash.core.c.b.a(bVar, b5);
                    } else {
                        com.ss.android.ad.splash.core.c.b.a();
                        a.C1285a aVar4 = new a.C1285a();
                        aVar4.f58415a = bVar.f58441d;
                        aVar4.f58417c = b5;
                        aVar4.f58418d = bVar.f58447j;
                        a.C1285a a3 = aVar4.a(j.a(bVar));
                        a3.f58416b = 1;
                        com.ss.android.ad.splash.core.c.b.b(a3.a());
                    }
                }
            }
        }
        if (h.ak) {
            x.a().f58933j = true;
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ad.splash.core.e.j a(com.ss.android.ad.splash.core.e.j r17) {
        /*
        // Method dump skipped, instructions count: 945
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.n.a(com.ss.android.ad.splash.core.e.j):com.ss.android.ad.splash.core.e.j");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0068 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int[][]] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ad.splash.core.e.b a(java.util.List<com.ss.android.ad.splash.core.e.b> r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.n.a(java.util.List, boolean):com.ss.android.ad.splash.core.e.b");
    }

    private static void a(int i2, int i3) {
        com.ss.android.ad.splash.core.c.b.a();
        a.C1285a aVar = new a.C1285a();
        aVar.f58415a = 84378473382L;
        aVar.f58416b = i2;
        aVar.f58418d = "{}";
        com.ss.android.ad.splash.core.c.b.c(aVar.a());
        com.ss.android.ad.splash.core.c.b.a().b();
        com.ss.android.ad.splash.b.a.a().a("service_real_time_show", i3, (JSONObject) null);
    }
}
