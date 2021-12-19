package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.aa;
import com.ss.android.ad.splash.c;
import com.ss.android.ad.splash.core.i.d;
import com.ss.android.ad.splash.d.a;
import com.ss.android.ad.splash.d.b;
import com.ss.android.ad.splash.e;
import com.ss.android.ad.splash.f;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.k;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ad.splash.m;
import com.ss.android.ad.splash.n;
import com.ss.android.ad.splash.o;
import com.ss.android.ad.splash.u;
import com.ss.android.ad.splash.v;
import com.ss.android.ad.splash.x;
import com.ss.android.ad.splash.z;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class s implements o, com.ss.android.ad.splash.s, u, z {

    /* renamed from: b  reason: collision with root package name */
    private static volatile s f58687b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f58688a;

    static {
        Covode.recordClassIndex(36372);
    }

    @Override // com.ss.android.ad.splash.u
    public final u d() {
        g.f58952a = 2;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u e() {
        h.s = false;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u i() {
        h.V = true;
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z p() {
        h.N = 1;
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z q() {
        h.O = 1;
        return this;
    }

    private s() {
    }

    @Override // com.ss.android.ad.splash.s
    public final void a() {
        a a2;
        h.n = System.currentTimeMillis();
        boolean z = true;
        h.f58584m = true;
        for (WeakReference<i> weakReference : e.a()) {
            i iVar = weakReference.get();
            if (iVar != null) {
                iVar.b();
            }
        }
        b a3 = b.a();
        if (System.currentTimeMillis() - a3.f58940a <= 3600000) {
            z = false;
        }
        String str = "";
        if (!(!z || h.R == null || (a2 = h.R.a()) == null)) {
            a3.f58940a = System.currentTimeMillis();
            v.a().u().putString("key_splash_ad_rt_necessary_device_params", a2.toString()).apply();
            String str2 = a2.f58935a;
            String d2 = h.b() != null ? h.b().d() : str;
            if (!TextUtils.isEmpty(d2)) {
                str2 = d2;
            }
            if (!l.a(str2)) {
                v.a().b(str2).h();
            }
        }
        if (h.o != null) {
            str = h.b().d();
        }
        if (!l.a(str)) {
            v.a().b(str).h();
        }
    }

    @Override // com.ss.android.ad.splash.o
    public final byte[] a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return j.b(str, str2);
    }

    @Override // com.ss.android.ad.splash.o
    public final boolean a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            Package r0 = n.class.getPackage();
            if (r0 != null) {
                arrayList.add(r0.getName());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    com.ss.android.ad.splash.f.a.a(84378473382L, "crashed，ad array is: " + k.a().b() + "\n crash stack is: " + str, null);
                    if (v.a().w() + 1 >= h.a().f58909a) {
                        h.f58579h.execute(new Runnable() {
                            /* class com.ss.android.ad.splash.core.s.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(36373);
                            }

                            public final void run() {
                                try {
                                    com.ss.android.ad.splash.f.a.b("clear splash ad data");
                                    JSONArray jSONArray = new JSONArray();
                                    v.a().a(jSONArray.toString()).c(jSONArray.toString()).h();
                                } catch (Throwable th) {
                                    com.ss.android.ad.splash.f.a.a(0, "  crashed while clearing ad data ", th);
                                }
                            }
                        });
                        v.a().u().putInt("key_exception_time", 0).commit();
                    } else {
                        v a2 = v.a();
                        a2.u().putInt("key_exception_time", a2.w() + 1).commit();
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            com.ss.android.ad.splash.f.a.a(0, " crashed while processing crash ", null);
        }
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(m mVar) {
        h.f58573b = mVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(x xVar) {
        h.f58576e = xVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z a(e eVar) {
        h.u = eVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(boolean z) {
        h.f58582k = z;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(JSONArray jSONArray, int i2) {
        if (jSONArray.length() > 0) {
            x.a().f58928e = jSONArray.length();
            x.a().a(-1);
            x.a().a(-1L);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                try {
                    new k(jSONArray.getString(i3), i2).executeOnExecutor(h.f58577f, new Void[0]);
                } catch (Throwable unused) {
                }
            }
        }
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z k() {
        h.A = R.style.mc;
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z l() {
        h.D = false;
        h.v = 0;
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z m() {
        h.y = R.string.g3c;
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z n() {
        h.C = 2131233871;
        return this;
    }

    @Override // com.ss.android.ad.splash.z
    public final z o() {
        h.z = R.string.g3b;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final v f() {
        t();
        return new t();
    }

    @Override // com.ss.android.ad.splash.u
    public final int j() {
        return v.a().p();
    }

    @Override // com.ss.android.ad.splash.s
    public final void c() {
        u.a().f58696a = 0;
    }

    @Override // com.ss.android.ad.splash.u
    public final u h() {
        if (h.aq == null) {
            com.ss.android.ad.splash.f.a.a(0, "please setup SplashAdManager#setSDKMonitorInitializer before enable SDKMonitor", null);
            return this;
        }
        com.ss.android.ad.splash.b.a a2 = com.ss.android.ad.splash.b.a.a();
        a2.f58266b = true;
        a2.a(null);
        return this;
    }

    public static s r() {
        MethodCollector.i(5111);
        if (f58687b == null) {
            synchronized (s.class) {
                try {
                    if (f58687b == null) {
                        f58687b = new s();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5111);
                    throw th;
                }
            }
        }
        s sVar = f58687b;
        MethodCollector.o(5111);
        return sVar;
    }

    static boolean s() {
        boolean z = false;
        if (!h.ae) {
            com.ss.android.ad.splash.f.a.b(" SDK is unavailable ");
            return false;
        }
        if (!h.F) {
            com.ss.android.ad.splash.f.a.a(0, "splash ad data is not ready, ad is unavailable", null);
            com.ss.android.ad.splash.b.a.a().a("service_load_local_status_monitor", 1, (JSONObject) null);
        } else {
            z = true;
        }
        t();
        return z;
    }

    private static void t() {
        int i2 = 0;
        try {
            if (h.f58574c == null) {
                i2 = 1;
                com.ss.android.ad.splash.f.a.a(0, "SplashNetWork is null! please setup it in SplashAdManager!", null);
            }
            if (h.f58573b == null) {
                i2 = 2;
                com.ss.android.ad.splash.f.a.a(0, "EventListener is null! please setup it in SplashAdManager!", null);
            }
            if (h.f58576e == null) {
                i2 = 3;
                com.ss.android.ad.splash.f.a.a(0, "SplashAdResourceLoader is null! please setup it in SplashAdManager!", null);
            }
            if (h.f58575d == null) {
                com.ss.android.ad.splash.f.a.a(0, "SplashAdPlatformSupportCallback is null! please setup it in SplashAdManager!", null);
            }
            if (i2 > 0) {
                com.ss.android.ad.splash.b.a.a().a("service_sdk_engine_invalidate", i2, (JSONObject) null);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.android.ad.splash.s
    public final void b() {
        h.f58581j = System.currentTimeMillis();
        h.f58584m = false;
        for (WeakReference<i> weakReference : e.a()) {
            i iVar = weakReference.get();
            if (iVar != null) {
                iVar.c();
            }
        }
        x.a().a(-1);
        h.k();
        h.W = null;
        h.X = -1;
    }

    @Override // com.ss.android.ad.splash.u
    public final boolean g() {
        boolean z;
        int i2 = 0;
        if (!s()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ad.splash.core.e.j b2 = n.a().b();
        if (b2 == null || b2.f58494a == null) {
            z = false;
        } else {
            z = true;
        }
        x.a().f();
        if (z) {
            com.ss.android.ad.splash.f.a.a(b2.f58494a.f58441d, " there is a suitable ad this time ");
            g a2 = g.a();
            a2.f58556a = b2.f58494a;
            a2.f58557b = System.currentTimeMillis();
            i2 = 1;
        } else {
            com.ss.android.ad.splash.f.a.a(0, " there is no suitable ad this time ");
            com.ss.android.ad.splash.core.f.a.a();
            m.a().b();
        }
        h.k();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", System.currentTimeMillis() - currentTimeMillis);
            com.ss.android.ad.splash.b.a.a().a("bda_splash_pick_model_duration", i2, jSONObject, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return z;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(int i2) {
        h.X = i2;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u b(long j2) {
        h.ab = j2;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u c(long j2) {
        h.ac = j2;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u f(boolean z) {
        h.ar = z;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(com.ss.android.ad.splash.b bVar) {
        h.q = bVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u b(String str) {
        h.G = str;
        h.K = true;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u c(String str) {
        h.H = str;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u d(boolean z) {
        h.aa = z;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u e(boolean z) {
        h.ak = z;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(long j2) {
        if (j2 <= 86400000) {
            j2 = 86400000;
        }
        h.J = j2;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u b(boolean z) {
        h.Q = z;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u c(boolean z) {
        h.Z = z;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(aa aaVar) {
        if (h.t == null) {
            g.e("SplashAdTracker is null, please init SplashAdTracker before SplashNetwork!!!");
        }
        h.f58574c = aaVar;
        com.ss.android.ad.splash.core.i.b g2 = h.g();
        if (g2 instanceof d) {
            ((d) g2).a();
        }
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final void b(int i2) {
        h.a(i2);
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(c cVar) {
        h.an = cVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(com.ss.android.ad.splash.core.i.a aVar) {
        h.al = aVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(com.ss.android.ad.splash.core.i.b bVar) {
        if (!(bVar == null || bVar == h.t)) {
            h.t = new com.ss.android.ad.splash.core.i.j(bVar);
        }
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(com.ss.android.ad.splash.d dVar) {
        h.am = dVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(f fVar) {
        h.ao = fVar;
        return this;
    }

    @Override // com.ss.android.ad.splash.u
    public final u a(com.ss.android.ad.splash.k kVar) {
        h.aq = kVar;
        return this;
    }
}
