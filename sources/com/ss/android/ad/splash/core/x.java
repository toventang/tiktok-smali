package com.ss.android.ad.splash.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.r;
import com.ss.android.ad.splash.f.a;
import com.ss.android.ad.splash.f.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class x {

    /* renamed from: k  reason: collision with root package name */
    private static volatile x f58922k;

    /* renamed from: l  reason: collision with root package name */
    private static volatile boolean f58923l;

    /* renamed from: a  reason: collision with root package name */
    public volatile r f58924a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f58925b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicInteger f58926c;

    /* renamed from: d  reason: collision with root package name */
    public AtomicInteger f58927d;

    /* renamed from: e  reason: collision with root package name */
    public int f58928e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Map<String, String>> f58929f;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f58930g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f58931h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f58932i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f58933j;

    /* renamed from: m  reason: collision with root package name */
    private int f58934m;
    private volatile boolean n;
    private long o;

    static {
        Covode.recordClassIndex(36457);
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.n = true;
        this.f58924a = null;
    }

    /* access modifiers changed from: package-private */
    public final LinkedHashMap<Long, String> b() {
        if (!d()) {
            return null;
        }
        return this.f58924a.f58534b;
    }

    public final long e() {
        if (this.f58933j) {
            return -1;
        }
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if ((!(!this.n) || !f58923l) || this.f58924a == null || this.f58924a.f58533a == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if ((!(!this.n) || !f58923l) || this.f58924a == null || this.f58924a.f58534b == null) {
            return false;
        }
        return true;
    }

    private x() {
        this.f58925b = -1;
        this.f58926c = new AtomicInteger();
        this.f58927d = new AtomicInteger();
        this.f58928e = 0;
        this.f58929f = Collections.synchronizedList(new ArrayList());
        this.f58930g = 0;
        this.o = -1;
        this.f58931h = false;
        this.f58932i = false;
        this.f58933j = false;
        this.f58924a = null;
        this.f58932i = false;
        this.f58934m = 0;
        this.f58931h = false;
        this.n = false;
    }

    public static x a() {
        MethodCollector.i(2392);
        if (f58922k == null) {
            synchronized (x.class) {
                try {
                    if (f58922k == null) {
                        f58922k = new x();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2392);
                    throw th;
                }
            }
        }
        x xVar = f58922k;
        MethodCollector.o(2392);
        return xVar;
    }

    public final void a(int i2) {
        g.b("UDPClient. setUDPSwitchResult: ".concat(String.valueOf(i2)));
        this.f58925b = i2;
    }

    public final void a(long j2) {
        if (j2 == -1) {
            this.o = -1;
            a.a(0, " time valid, reset remote time ");
        } else if (this.o == -1) {
            v.a().d(j2);
            a.a(0, " time valid, saving remote time: ".concat(String.valueOf(j2)));
            this.o = j2;
        }
    }

    public final void a(AtomicInteger atomicInteger) {
        JSONObject jSONObject;
        MethodCollector.i(2396);
        this.f58927d = atomicInteger;
        if (this.f58928e == atomicInteger.get()) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            try {
                synchronized (this.f58929f) {
                    try {
                        for (Map<String, String> map : this.f58929f) {
                            JSONObject jSONObject4 = new JSONObject();
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                jSONObject4.putOpt(entry.getKey(), entry.getValue());
                            }
                            jSONArray.put(jSONObject4);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2396);
                        throw th;
                    }
                }
                jSONObject2.put("udp_addrs", jSONArray);
                jSONObject3.putOpt("log_extra", k.a().f58667l);
                jSONObject3.putOpt("ad_extra_data", jSONObject2);
                jSONObject3.putOpt("is_ad_event", "1");
                g.b("UDPClient. sendStopShowingEvent:\n" + jSONObject3.toString());
                jSONObject = jSONObject3;
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject = null;
            }
            h.a(84378473382L, "splash_ad", "splash_init_monitor_all", jSONObject);
        }
        MethodCollector.o(2396);
    }
}
