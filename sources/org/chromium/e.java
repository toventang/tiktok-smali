package org.chromium;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.b;
import com.ttnet.org.chromium.base.k;
import com.ttnet.org.chromium.net.impl.CronetLibraryLoader;
import com.ttnet.org.chromium.net.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class e extends u {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f159761b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f159762a;

    static {
        Covode.recordClassIndex(106446);
    }

    private e() {
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(String str, String str2) {
        if (this.f159762a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onServerConfigUpdated json = ".concat(String.valueOf(str)));
            }
            try {
                if (a2.f159757a != null) {
                    k.a(a2.f159757a).a("onServerConfigEtagChanged", new Class[]{String.class}, str2);
                    k.a(a2.f159757a).a("onServerConfigUpdated", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(String str) {
        if (this.f159762a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onTTNetDetectInfoChanged info str = ".concat(String.valueOf(str)));
            }
            try {
                if (a2.f159757a != null) {
                    k.a(a2.f159757a).a("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(String str, String str2, int i2, int i3, int i4, List<String> list, String str3) {
        c a2 = c.a();
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "onTTDnsResolveResult info uuid = " + str + " host: " + str2);
        }
        try {
            if (a2.f159757a != null) {
                k.a(a2.f159757a).a("onTTDnsResolveResult", new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class, String.class}, str, str2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), list, str3);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(String str, String str2, String str3) {
        if (this.f159762a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onStoreIdcChanged ");
            }
            try {
                if (a2.f159757a != null) {
                    k.a(a2.f159757a).a("onStoreIdcChanged", new Class[]{String.class, String.class, String.class}, str, str2, str3);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(String[] strArr, String str) {
        if (this.f159762a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
            }
            try {
                if (!(a2.f159757a == null || strArr == null)) {
                    if (strArr.length > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArr) {
                            arrayList.add(str2);
                        }
                        k.a(a2.f159757a).a("onTNCUpdateFailed", new Class[]{ArrayList.class, String.class}, arrayList, str);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static e c() {
        MethodCollector.i(12845);
        if (f159761b == null) {
            synchronized (e.class) {
                try {
                    if (f159761b == null) {
                        f159761b = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12845);
                    throw th;
                }
            }
        }
        e eVar = f159761b;
        MethodCollector.o(12845);
        return eVar;
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a() {
        if (this.f159762a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onColdStartFinish ");
            }
            try {
                if (a2.f159757a != null) {
                    k.a(a2.f159757a).a("onColdStartFinish");
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void b() {
        if (this.f159762a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onCronetBootSucceed ");
            }
            try {
                if (a2.f159757a != null) {
                    k.a(a2.f159757a).a("onCronetBootSucceed");
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(int i2) {
        c a2 = c.a();
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "onEffectiveConnectionTypeChanged type = ".concat(String.valueOf(i2)));
        }
        try {
            if (a2.f159757a != null) {
                k.a(a2.f159757a).a("onEffectiveConnectionTypeChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i2));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void b(String str) {
        if (this.f159762a) {
            c a2 = c.a();
            if (d.a().loggerDebug()) {
                d.a().loggerD("CronetAppProviderManager", "onClientIPChanged ");
            }
            try {
                if (a2.f159757a != null) {
                    k.a(a2.f159757a).a("onClientIPChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final Map<String, String> a(String str, Map<String, String> map) {
        return c.a().a(str, map);
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(int i2, int i3) {
        c a2 = c.a();
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "onMultiNetworkStateChanged, prev state = " + i2 + ", curr state = " + i3);
        }
        try {
            if (a2.f159757a != null) {
                k.a(a2.f159757a).a("onMultiNetworkStateChanged", new Class[]{Integer.TYPE, Integer.TYPE}, Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(int i2, int i3, int i4) {
        c a2 = c.a();
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "onRTTOrThroughputEstimatesComputed httpRtt = " + i2 + ", transportRttMs = " + i3 + ",downstreamThroughputKbps = " + i4);
        }
        try {
            if (a2.f159757a != null) {
                k.a(a2.f159757a).a("onRTTOrThroughputEstimatesComputed", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(int i2, double d2, double d3, double d4, double d5) {
        c a2 = c.a();
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetAppProviderManager", "onPacketLossComputed protocol = " + i2 + ", upstreamLossRate = " + d2 + ", upstreamLossRateVariance = " + d3 + ", downstreamLossRate = " + d4 + ", downstreamLossRateVariance = " + d5);
        }
        try {
            if (a2.f159757a != null) {
                k.a(a2.f159757a).a("onPacketLossComputed", new Class[]{Integer.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE}, Integer.valueOf(i2), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ttnet.org.chromium.net.u
    public final void a(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        b a2 = b.a();
        a2.f29002d = Process.getThreadPriority(0);
        a2.f29010l = CronetLibraryLoader.f155519a;
        a2.f29011m = CronetLibraryLoader.f155520b;
        a2.u = CronetLibraryLoader.f155521c;
        a2.n = j2;
        a2.o = j3;
        a2.p = j4;
        a2.q = j5;
        a2.r = j6;
        a2.s = j7;
        a2.v = j8;
        a2.w = j9;
        a2.x = j10;
        a2.y = j11;
        a2.z = j12;
        a2.A = j13;
        a2.B = j14;
        a2.C = j15;
        a2.D = j16;
        a2.E = j17;
        a2.F = j18;
        a2.G = j19;
        c.a().a(b.a().b().toString(), "ttnet_init");
    }
}
