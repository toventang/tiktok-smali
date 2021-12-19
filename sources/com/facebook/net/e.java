package com.facebook.net;

import android.net.Uri;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ttnet.a.c;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f48974a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f48975b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, Long> f48976c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f48977d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentHashMap<String, b> f48978e = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(29515);
    }

    private static boolean c() {
        if (c.f44450a == null || c.f44450a.f44453b != 1) {
            return false;
        }
        return true;
    }

    private e() {
    }

    private static int d() {
        if (c.f44450a == null || c.f44450a.f44455d <= 0) {
            return 5;
        }
        return c.f44450a.f44455d;
    }

    private static int e() {
        if (c.f44450a == null || c.f44450a.f44456e <= 0) {
            return 50;
        }
        return c.f44450a.f44456e;
    }

    public static e a() {
        MethodCollector.i(3846);
        if (f48974a == null) {
            synchronized (f48975b) {
                try {
                    if (f48974a == null) {
                        f48974a = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3846);
                    throw th;
                }
            }
        }
        e eVar = f48974a;
        MethodCollector.o(3846);
        return eVar;
    }

    private static boolean b() {
        int i2;
        if (c.f44450a != null) {
            i2 = c.f44450a.b().getValue();
        } else {
            i2 = 0;
        }
        if (i2 == l.a.WIFI.getValue() || i2 == l.a.MOBILE_4G.getValue() || i2 == l.a.MOBILE_3G.getValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        int f48979a;

        /* renamed from: b  reason: collision with root package name */
        int f48980b = 1;

        /* renamed from: c  reason: collision with root package name */
        boolean f48981c = false;

        /* renamed from: d  reason: collision with root package name */
        long f48982d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f48983e;

        static {
            Covode.recordClassIndex(29516);
        }

        public a(int i2, int i3) {
            this.f48979a = i2;
            this.f48983e = i3;
        }
    }

    private void a(boolean z, long j2, boolean z2) {
        int i2;
        long j3;
        try {
            if ((c.f44450a != null && c.f44450a.f44453b == 2) || !z2) {
                return;
            }
            if (this.f48978e.containsKey("p.pstap.com")) {
                b bVar = this.f48978e.get("p.pstap.com");
                if (!z || j2 <= 0) {
                    bVar.f48986b++;
                } else {
                    bVar.f48985a++;
                    bVar.f48987c += j2;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bVar.f48988d > 300000) {
                    if (bVar.f48985a > 0) {
                        j3 = bVar.f48987c / ((long) bVar.f48985a);
                    } else {
                        j3 = 0;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", bVar.f48986b);
                    jSONObject.put("success", bVar.f48985a);
                    jSONObject.put("average_duration", j3);
                    if (c()) {
                        jSONObject.put("has_opt", 1);
                    }
                    bVar.f48986b = 0;
                    bVar.f48985a = 0;
                    bVar.f48987c = 0;
                    bVar.f48988d = currentTimeMillis;
                    return;
                }
                return;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            this.f48978e.put("p.pstap.com", new b(z ? 1 : 0, i2, j2));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        int f48985a;

        /* renamed from: b  reason: collision with root package name */
        int f48986b;

        /* renamed from: c  reason: collision with root package name */
        long f48987c;

        /* renamed from: d  reason: collision with root package name */
        long f48988d = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(29517);
        }

        public b(int i2, int i3, long j2) {
            this.f48985a = i2;
            this.f48986b = i3;
            this.f48987c = j2;
        }
    }

    public final void a(String str, boolean z, long j2, boolean z2) {
        if (!m.a(str) && b()) {
            a(z, j2, z2);
            if (c()) {
                try {
                    String host = Uri.parse(str).getHost();
                    int i2 = 1;
                    if (this.f48977d.containsKey(host)) {
                        a aVar = this.f48977d.get(host);
                        if (aVar == null) {
                            return;
                        }
                        if (!aVar.f48981c) {
                            if (!z) {
                                aVar.f48979a++;
                            }
                            aVar.f48980b++;
                            if (aVar.f48979a >= d() && (aVar.f48979a * 100) / aVar.f48980b >= 10) {
                                aVar.f48981c = true;
                                aVar.f48980b = 0;
                                aVar.f48979a = 0;
                                this.f48976c.put(host, Long.valueOf(System.currentTimeMillis()));
                            } else if (aVar.f48980b > aVar.f48983e) {
                                aVar.f48980b = 0;
                                aVar.f48979a = 0;
                                aVar.f48981c = false;
                            }
                        }
                    } else {
                        if (z) {
                            i2 = 0;
                        }
                        this.f48977d.put(host, new a(i2, e()));
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
