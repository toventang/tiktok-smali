package com.bytedance.ies.ugc.aweme.network;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider;
import com.ss.android.ugc.aweme.network.a.d;
import com.ss.android.ugc.aweme.network.c;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final Object f35026a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f35027b;

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f35028c;

    /* renamed from: d  reason: collision with root package name */
    static final List<String> f35029d = n.b("MI PAD 2", "YT3-X90L", "YT3-X90F", "GT-810");

    /* renamed from: e  reason: collision with root package name */
    public static final g f35030e = new g();

    /* renamed from: f  reason: collision with root package name */
    private static final h f35031f = i.a((h.f.a.a) b.f35033a);

    public static com.ss.android.ugc.aweme.network.a a() {
        return (com.ss.android.ugc.aweme.network.a) f35031f.getValue();
    }

    private g() {
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.network.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35033a = new b();

        static {
            Covode.recordClassIndex(21018);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.network.a invoke() {
            INetworkConfigProvider b2 = NetworkConfigProvider.b();
            if (b2 == null) {
                l.b();
            }
            return b2.a();
        }
    }

    static boolean c() {
        if (Build.VERSION.SDK_INT <= 19) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(21016);
    }

    public static void b() {
        MethodCollector.i(6496);
        if (com.ss.android.ugc.aweme.network.a.b.f112533a) {
            MethodCollector.o(6496);
        } else if (f35027b) {
            MethodCollector.o(6496);
        } else {
            Object obj = f35026a;
            synchronized (obj) {
                try {
                    if (!f35027b) {
                        try {
                            obj.wait();
                            f35027b = true;
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(6496);
                }
            }
        }
    }

    static boolean d() {
        List a2;
        try {
            if (Build.VERSION.SDK_INT == 18) {
                return true;
            }
            if (Build.VERSION.SDK_INT < 21) {
                a2 = n.a(Build.CPU_ABI);
            } else if (Build.VERSION.SDK_INT >= 21) {
                String[] strArr = Build.SUPPORTED_ABIS;
                l.b(strArr, "");
                a2 = h.a.i.a(strArr);
            } else {
                a2 = n.a("");
            }
            if (a2.contains("x86") || a2.contains("x86_64")) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f35032a;

        static {
            Covode.recordClassIndex(21017);
        }

        a(c cVar) {
            this.f35032a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            MethodCollector.i(6551);
            TTNetInit.useCustomizedCookieStoreName();
            com.ss.android.ugc.aweme.network.a a2 = g.a();
            c cVar = this.f35032a;
            if (cVar != null) {
                cVar.a(a2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l.d(a2, "");
            TTNetInit.setDelayTime(a2.f112525m.a().intValue());
            if (((Boolean) d.f112539a.getValue()).booleanValue()) {
                TTNetInit.setBypassOfflineCheck(true);
            }
            TTNetInit.setTTNetDepend(a2.f112514b);
            if (!g.c() && f.a(a2.f112513a)) {
                TTNetInit.setFirstRequestWaitTime(0);
            }
            e.f29340l = a2.f112521i;
            e.f29331c = new com.bytedance.ies.ugc.aweme.network.zstd.a();
            TTNetInit.setCronetDepend(a2.f112515c);
            String b2 = f.b(a2.f112513a);
            boolean z2 = false;
            if (b2 == null || !p.a((CharSequence) b2, (CharSequence) "miniapp", false)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (!g.c()) {
                    TTNetInit.setFirstRequestWaitTime(0);
                }
                TTNetInit.tryInitTTNet(a2.f112513a, a2.f112513a, new com.ss.android.ugc.aweme.net.c.b(), a2.f112523k, null, true, true);
            } else {
                TTNetInit.tryInitTTNet(a2.f112513a, a2.f112513a, new com.ss.android.ugc.aweme.net.c.b(), a2.f112523k, null, true, false);
            }
            try {
                com.bytedance.ttnet.a.a.a(a2.f112513a);
                if (g.d() || g.f35029d.contains(Build.MODEL) || (z && Build.VERSION.SDK_INT == 22)) {
                    z2 = true;
                }
                if (z2) {
                    com.bytedance.ttnet.a.a.a(a2.f112513a);
                    com.bytedance.ttnet.a.a.f44432l = true;
                } else {
                    com.bytedance.ttnet.a.a.a(a2.f112513a);
                }
                org.chromium.d.a().setAdapter(a2.f112515c);
                org.chromium.c a3 = org.chromium.c.a();
                com.bytedance.ttnet.b.a aVar = a2.f112515c;
                if (aVar != null) {
                    try {
                        Class<?> cls = aVar.getClass();
                        if (cls != null) {
                            List a4 = org.chromium.f.a(cls);
                            if (a4 != null) {
                                if (!a4.isEmpty()) {
                                    Iterator it = a4.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        } else if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(((Class) it.next()).getName())) {
                                            if (org.chromium.d.a().loggerDebug()) {
                                                org.chromium.d.a().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                                            }
                                            a3.f159757a = aVar;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                TTNetInit.preInitCronetKernel();
                g.f35028c = true;
            } catch (Throwable unused2) {
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ttnet_init_time", elapsedRealtime2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.apm.b.a("ttnet_init_time", jSONObject);
            if (cVar != null) {
                cVar.b(a2);
            }
            synchronized (g.f35026a) {
                try {
                    g.f35027b = true;
                    g.f35026a.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.o(6551);
                    throw th;
                }
            }
            c cVar2 = this.f35032a;
            if (cVar2 != null) {
                cVar2.c(g.a());
                z zVar = z.f158842a;
                MethodCollector.o(6551);
                return zVar;
            }
            MethodCollector.o(6551);
            return null;
        }
    }
}
