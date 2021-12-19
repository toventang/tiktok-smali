package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Process;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import com.ttnet.org.chromium.base.PowerMonitor;
import com.ttnet.org.chromium.base.f;
import com.ttnet.org.chromium.base.h;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import com.ttnet.org.chromium.net.t;
import com.ttnet.org.chromium.net.u;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import com.ttnet.org.chromium.net.v;
import com.ttnet.org.chromium.net.w;
import com.ttnet.org.chromium.net.x;
import java.io.File;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class CronetUrlRequestContext extends c {
    private static final HashSet<String> D = new HashSet<>();

    /* renamed from: b  reason: collision with root package name */
    static final String f155580b = CronetUrlRequestContext.class.getSimpleName();
    private TTAppInfoProvider A;
    private v B;
    private volatile ConditionVariable C;
    private final String E;

    /* renamed from: c  reason: collision with root package name */
    public final Object f155581c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicInteger f155582d = new AtomicInteger(0);

    /* renamed from: e  reason: collision with root package name */
    public long f155583e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f155584f;

    /* renamed from: g  reason: collision with root package name */
    u f155585g;

    /* renamed from: h  reason: collision with root package name */
    private final ConditionVariable f155586h = new ConditionVariable(false);

    /* renamed from: i  reason: collision with root package name */
    private Thread f155587i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f155588j;

    /* renamed from: k  reason: collision with root package name */
    private final Object f155589k = new Object();

    /* renamed from: l  reason: collision with root package name */
    private final Object f155590l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private int f155591m = 0;
    private int n;
    private int o;
    private int p;
    private double[] q;
    private double[] r;
    private double[] s;
    private double[] t;
    private final h<VersionSafeCallbacks.b> u;
    private final h<VersionSafeCallbacks.c> v;
    private final Map<t.a, VersionSafeCallbacks.d> w;
    private String[] x;
    private int[] y;
    private int[] z;

    private native void nativeAddClientOpaqueData(long j2, String[] strArr, byte[] bArr, byte[] bArr2);

    private static native void nativeAddPkp(long j2, String str, byte[][] bArr, boolean z2, long j3);

    private static native void nativeAddQuicHint(long j2, String str, int i2, int i3);

    private native void nativeClearClientOpaqueData(long j2);

    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j2, boolean z2, boolean z3, boolean z4);

    private native void nativeControlHttpDNSConfig(long j2, boolean z2, boolean z3, boolean z4);

    private static native long nativeCreateRequestContextAdapter(long j2);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z2, String str3, boolean z3, boolean z4, boolean z5, int i2, long j2, String str4, long j3, boolean z6, boolean z7, boolean z8, boolean z9, String str5, int i3);

    private native void nativeDestroy(long j2);

    private native void nativeDnsLookup(long j2, DnsQuery dnsQuery);

    private static native void nativeEnableBoeProxy(long j2, boolean z2);

    private native void nativeEnableTTBizHttpDns(long j2, boolean z2, String str, String str2, String str3, boolean z3, String str4);

    private static native byte[] nativeGetHistogramDeltas();

    private static native long[] nativeGetOpaqueFuncAddress();

    private static native void nativeInitALogFuncAddr(long j2);

    private native void nativeNotifySwitchToMultiNetwork(long j2, boolean z2);

    private native void nativeNotifyTNCConfigUpdated(long j2, String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativePreconnectUrl(long j2, String str, int i2);

    private native void nativeProvideRTTObservations(long j2, boolean z2);

    private native void nativeProvideThroughputObservations(long j2, boolean z2);

    private native void nativeRemoveClientOpaqueData(long j2, String str);

    private native void nativeReportNetDiagnosisUserLog(long j2, String str);

    private native void nativeSetAlogFuncAddr(long j2, long j3);

    private native void nativeSetAppStartUpState(long j2, int i2);

    private static native void nativeSetBypassBOEJSON(long j2, String str);

    private static native void nativeSetClientOpaqueData(long j2, String[] strArr, byte[] bArr, byte[] bArr2);

    private static native void nativeSetGetDomainDefaultJSON(long j2, String str);

    private native void nativeSetHostResolverRules(long j2, String str);

    private static native int nativeSetMinLogLevel(int i2);

    private static native void nativeSetOpaqueData(long j2, byte[][] bArr);

    private native void nativeSetProxy(long j2, String str);

    private static native void nativeSetProxyConfig(long j2, String str);

    private static native void nativeSetStoreIdcRuleJSON(long j2, String str);

    private native void nativeStartNetLogToDisk(long j2, String str, boolean z2, int i2);

    private native boolean nativeStartNetLogToFile(long j2, String str, boolean z2);

    private native void nativeStopNetLog(long j2);

    private native void nativeTTDnsResolve(long j2, String str, int i2, String str2);

    public static native void nativeTTUrlDispatch(long j2, URLDispatch uRLDispatch, String str);

    private native void nativeTriggerGetDomain(long j2, boolean z2);

    private native void nativeTryStartNetDetect(long j2, String[] strArr, int i2, int i3);

    private native void nativeUpdateStoreRegionFromServer(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    public native void nativeInitRequestContextOnInitThread(long j2);

    @Override // com.ttnet.org.chromium.net.g
    public final void a(boolean z2) {
        MethodCollector.i(11646);
        synchronized (this.f155581c) {
            try {
                nativeTriggerGetDomain(this.f155583e, z2);
            } finally {
                MethodCollector.o(11646);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(String[] strArr, byte[] bArr, byte[] bArr2) {
        MethodCollector.i(11804);
        synchronized (this.f155581c) {
            try {
                nativeAddClientOpaqueData(this.f155583e, strArr, bArr, bArr2);
            } finally {
                MethodCollector.o(11804);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(String str) {
        MethodCollector.i(11972);
        synchronized (this.f155581c) {
            try {
                nativeRemoveClientOpaqueData(this.f155583e, str);
            } finally {
                MethodCollector.o(11972);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(t.a aVar) {
        MethodCollector.i(12982);
        synchronized (this.f155590l) {
            try {
                this.w.put(aVar, new VersionSafeCallbacks.d(aVar));
            } finally {
                MethodCollector.o(12982);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.c
    public final URLConnection a(URL url) {
        if (Proxy.NO_PROXY.type() == Proxy.Type.DIRECT) {
            String protocol = url.getProtocol();
            if ("http".equals(protocol) || "https".equals(protocol)) {
                return new CronetHttpURLConnection(url, this);
            }
            throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r2.hasNext() == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r0 = (com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.d) r2.next();
        a(r0.getExecutor(), new com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.AnonymousClass6(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(13652);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final com.ttnet.org.chromium.net.t r5) {
        /*
            r4 = this;
            r3 = 13652(0x3554, float:1.913E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            java.lang.Object r2 = r4.f155590l
            monitor-enter(r2)
            java.util.Map<com.ttnet.org.chromium.net.t$a, com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$d> r0 = r4.w     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r2)     // Catch:{ all -> 0x0042 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0015:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Map<com.ttnet.org.chromium.net.t$a, com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$d> r0 = r4.w
            java.util.Collection r0 = r0.values()
            r1.<init>(r0)
            monitor-exit(r2)
            java.util.Iterator r2 = r1.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r2.next()
            com.ttnet.org.chromium.net.impl.VersionSafeCallbacks$d r0 = (com.ttnet.org.chromium.net.impl.VersionSafeCallbacks.d) r0
            com.ttnet.org.chromium.net.impl.CronetUrlRequestContext$6 r1 = new com.ttnet.org.chromium.net.impl.CronetUrlRequestContext$6
            r1.<init>(r0, r5)
            java.util.concurrent.Executor r0 = r0.getExecutor()
            a(r0, r1)
            goto L_0x0025
        L_0x003e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.a(com.ttnet.org.chromium.net.t):void");
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(long j2) {
        MethodCollector.i(13717);
        synchronized (this.f155581c) {
            try {
                k();
                f.c(f155580b, "Set alog func addr: ".concat(String.valueOf(j2)), new Object[0]);
                nativeSetAlogFuncAddr(this.f155583e, j2);
            } finally {
                MethodCollector.o(13717);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(String[] strArr, int i2, int i3) {
        MethodCollector.i(13773);
        synchronized (this.f155581c) {
            try {
                nativeTryStartNetDetect(this.f155583e, strArr, i2, i3);
            } finally {
                MethodCollector.o(13773);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(String str, int i2, String str2) {
        MethodCollector.i(13823);
        synchronized (this.f155581c) {
            try {
                nativeTTDnsResolve(this.f155583e, str, i2, str2);
            } finally {
                MethodCollector.o(13823);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(boolean z2, String str, String str2, String str3, boolean z3, String str4) {
        MethodCollector.i(13875);
        synchronized (this.f155581c) {
            try {
                nativeEnableTTBizHttpDns(this.f155583e, z2, str, str2, str3, z3, str4);
            } finally {
                MethodCollector.o(13875);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        MethodCollector.i(13877);
        synchronized (this.f155581c) {
            try {
                nativeNotifyTNCConfigUpdated(this.f155583e, str, str2, str3, str4, str5, str6);
            } finally {
                MethodCollector.o(13877);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        MethodCollector.i(13925);
        synchronized (this.f155581c) {
            try {
                nativeUpdateStoreRegionFromServer(this.f155583e, str, str2, str3, str4, str5, str6, str7, str8);
            } finally {
                MethodCollector.o(13925);
            }
        }
    }

    private void onColdStartFinish() {
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f155582d.decrementAndGet();
    }

    public void stopNetLogCompleted() {
        this.C.open();
    }

    private void k() {
        if (!l()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private boolean l() {
        if (this.f155583e != 0) {
            return true;
        }
        return false;
    }

    private TTAppInfoProvider.AppInfo onGetAppInfo() {
        TTAppInfoProvider tTAppInfoProvider = this.A;
        if (tTAppInfoProvider != null) {
            return tTAppInfoProvider.a();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(103459);
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        boolean z2;
        MethodCollector.i(12983);
        synchronized (this.f155590l) {
            try {
                if (!this.w.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } finally {
                MethodCollector.o(12983);
            }
        }
        return z2;
    }

    public final long j() {
        long j2;
        MethodCollector.i(12987);
        synchronized (this.f155581c) {
            try {
                k();
                j2 = this.f155583e;
            } finally {
                MethodCollector.o(12987);
            }
        }
        return j2;
    }

    private void initNetworkThread() {
        this.f155587i = Thread.currentThread();
        Thread.currentThread().setName("ChromiumNet" + Process.getThreadPriority(0));
        this.f155585g.b();
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void b() {
        MethodCollector.i(11965);
        synchronized (this.f155581c) {
            try {
                nativeClearClientOpaqueData(this.f155583e);
            } finally {
                MethodCollector.o(11965);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int c() {
        int i2;
        MethodCollector.i(12549);
        if (this.f155588j) {
            synchronized (this.f155589k) {
                try {
                    i2 = this.n;
                    if (i2 == -1) {
                        i2 = -1;
                    }
                } finally {
                    MethodCollector.o(12549);
                }
            }
            return i2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.o(12549);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int d() {
        int i2;
        MethodCollector.i(12652);
        if (this.f155588j) {
            synchronized (this.f155589k) {
                try {
                    i2 = this.o;
                    if (i2 == -1) {
                        i2 = -1;
                    }
                } finally {
                    MethodCollector.o(12652);
                }
            }
            return i2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.o(12652);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int e() {
        int i2;
        MethodCollector.i(12653);
        if (this.f155588j) {
            synchronized (this.f155589k) {
                try {
                    i2 = this.p;
                    if (i2 == -1) {
                        i2 = -1;
                    }
                } finally {
                    MethodCollector.o(12653);
                }
            }
            return i2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.o(12653);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final List<Long> g() {
        MethodCollector.i(14026);
        ArrayList arrayList = new ArrayList();
        synchronized (this.f155581c) {
            try {
                for (long j2 : nativeGetOpaqueFuncAddress()) {
                    arrayList.add(Long.valueOf(j2));
                }
            } finally {
                MethodCollector.o(14026);
            }
        }
        return arrayList;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final int a() {
        int i2;
        MethodCollector.i(12264);
        if (this.f155588j) {
            synchronized (this.f155589k) {
                try {
                    i2 = this.f155591m;
                } finally {
                    MethodCollector.o(12264);
                }
            }
            return i2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
        MethodCollector.o(12264);
        throw illegalStateException;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final Map<String, int[]> f() {
        MethodCollector.i(13772);
        if (this.f155588j) {
            HashMap hashMap = new HashMap();
            synchronized (this.f155589k) {
                try {
                    if (this.x == null) {
                        return hashMap;
                    }
                    int i2 = 0;
                    while (true) {
                        String[] strArr = this.x;
                        if (i2 < strArr.length) {
                            hashMap.put(strArr[i2], new int[]{this.y[i2], this.z[i2]});
                            i2++;
                        } else {
                            MethodCollector.o(13772);
                            return hashMap;
                        }
                    }
                } finally {
                    MethodCollector.o(13772);
                }
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Network quality estimator must be enabled");
            MethodCollector.o(13772);
            throw illegalStateException;
        }
    }

    private void onClientIPChanged(String str) {
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.b(str);
        }
    }

    private void onTTNetDetectInfoChanged(String str) {
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a(str);
        }
    }

    public final boolean a(Thread thread) {
        if (thread == this.f155587i) {
            return true;
        }
        return false;
    }

    private void onEffectiveConnectionTypeChanged(int i2) {
        MethodCollector.i(13074);
        synchronized (this.f155589k) {
            try {
                this.f155591m = i2;
                u uVar = this.f155585g;
                if (uVar != null) {
                    uVar.a(i2);
                }
            } finally {
                MethodCollector.o(13074);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final double b(int i2) {
        double d2;
        MethodCollector.i(12656);
        f(i2);
        synchronized (this.f155589k) {
            try {
                d2 = this.r[i2];
            } finally {
                MethodCollector.o(12656);
            }
        }
        return d2;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final double c(int i2) {
        double d2;
        MethodCollector.i(12776);
        f(i2);
        synchronized (this.f155589k) {
            try {
                d2 = this.q[i2];
            } finally {
                MethodCollector.o(12776);
            }
        }
        return d2;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final double d(int i2) {
        double d2;
        MethodCollector.i(12884);
        f(i2);
        synchronized (this.f155589k) {
            try {
                d2 = this.t[i2];
            } finally {
                MethodCollector.o(12884);
            }
        }
        return d2;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void e(int i2) {
        MethodCollector.i(14075);
        synchronized (this.f155581c) {
            try {
                nativeSetAppStartUpState(this.f155583e, i2);
            } finally {
                MethodCollector.o(14075);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void f(String str) {
        MethodCollector.i(12263);
        synchronized (this.f155581c) {
            try {
                k();
                nativeSetHostResolverRules(this.f155583e, str);
            } finally {
                MethodCollector.o(12263);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void g(String str) {
        MethodCollector.i(14112);
        synchronized (this.f155581c) {
            try {
                nativeReportNetDiagnosisUserLog(this.f155583e, str);
            } finally {
                MethodCollector.o(14112);
            }
        }
    }

    private void f(int i2) {
        if (!this.f155588j) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        } else if (i2 != 0 && i2 != 1) {
            throw new IllegalStateException("Error protocol: ".concat(String.valueOf(i2)));
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final double a(int i2) {
        double d2;
        MethodCollector.i(12655);
        f(i2);
        synchronized (this.f155589k) {
            try {
                d2 = this.q[i2];
            } finally {
                MethodCollector.o(12655);
            }
        }
        return d2;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void b(String str) {
        MethodCollector.i(11973);
        synchronized (this.f155581c) {
            try {
                nativeSetProxy(this.f155583e, str);
            } finally {
                MethodCollector.o(11973);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final Map<String, String> c(String str) {
        MethodCollector.i(12107);
        URLDispatch uRLDispatch = new URLDispatch(str);
        synchronized (this.f155581c) {
            try {
                k();
                nativeTTUrlDispatch(this.f155583e, uRLDispatch, str);
            } catch (Throwable th) {
                MethodCollector.o(12107);
                throw th;
            }
        }
        uRLDispatch.f155665f.a(300);
        HashMap hashMap = new HashMap();
        hashMap.put("final_url", uRLDispatch.f155662c);
        hashMap.put("epoch", uRLDispatch.f155663d);
        hashMap.put("etag", uRLDispatch.f155664e);
        MethodCollector.o(12107);
        return hashMap;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void d(String str) {
        MethodCollector.i(12260);
        synchronized (this.f155581c) {
            try {
                k();
                nativePreconnectUrl(this.f155583e, str, 1);
            } finally {
                MethodCollector.o(12260);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.g
    public final List<InetAddress> e(String str) {
        MethodCollector.i(12262);
        DnsQuery dnsQuery = new DnsQuery(str);
        synchronized (this.f155581c) {
            try {
                k();
                nativeDnsLookup(this.f155583e, dnsQuery);
            } catch (Throwable th) {
                MethodCollector.o(12262);
                throw th;
            }
        }
        dnsQuery.f155643d.a(0);
        if (dnsQuery.f155641b != 0 || dnsQuery.f155642c == null || dnsQuery.f155642c.length == 0) {
            UnknownHostException unknownHostException = new UnknownHostException(dnsQuery.f155640a);
            MethodCollector.o(12262);
            throw unknownHostException;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : dnsQuery.f155642c) {
            byte[] address = InetAddress.getByName(str2).getAddress();
            if (address != null) {
                arrayList.add(InetAddress.getByAddress(dnsQuery.f155640a, address));
            }
        }
        if (!arrayList.isEmpty()) {
            MethodCollector.o(12262);
            return arrayList;
        }
        UnknownHostException unknownHostException2 = new UnknownHostException(dnsQuery.f155640a);
        MethodCollector.o(12262);
        throw unknownHostException2;
    }

    @Override // com.ttnet.org.chromium.net.g
    public final void b(boolean z2) {
        MethodCollector.i(13976);
        synchronized (this.f155581c) {
            try {
                nativeNotifySwitchToMultiNetwork(this.f155583e, z2);
            } finally {
                MethodCollector.o(13976);
            }
        }
    }

    public CronetUrlRequestContext(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        MethodCollector.i(11155);
        Object obj = new Object();
        this.f155581c = obj;
        int i2 = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = new double[]{-1.0d, -1.0d};
        this.r = new double[]{-1.0d, -1.0d};
        this.s = new double[]{-1.0d, -1.0d};
        this.t = new double[]{-1.0d, -1.0d};
        this.u = new h<>();
        this.v = new h<>();
        this.w = new HashMap();
        this.f155588j = cronetEngineBuilderImpl.o;
        CronetLibraryLoader.a(cronetEngineBuilderImpl.f155499a, cronetEngineBuilderImpl);
        String str = f155580b;
        if (Log.isLoggable(str, 2)) {
            i2 = -2;
        } else if (!Log.isLoggable(str, 3)) {
            i2 = 3;
        }
        nativeSetMinLogLevel(i2);
        if (cronetEngineBuilderImpl.f155509k == 1) {
            String str2 = cronetEngineBuilderImpl.f155504f;
            this.E = str2;
            HashSet<String> hashSet = D;
            synchronized (hashSet) {
                try {
                    if (!hashSet.add(str2)) {
                        IllegalStateException illegalStateException = new IllegalStateException("Disk cache storage path already in use");
                        MethodCollector.o(11155);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11155);
                    throw th;
                }
            }
        } else {
            this.E = null;
        }
        this.A = cronetEngineBuilderImpl.s;
        this.B = cronetEngineBuilderImpl.t;
        this.f155585g = cronetEngineBuilderImpl.u;
        this.f155584f = cronetEngineBuilderImpl.E;
        synchronized (obj) {
            try {
                long nativeCreateRequestContextAdapter = nativeCreateRequestContextAdapter(a(cronetEngineBuilderImpl));
                this.f155583e = nativeCreateRequestContextAdapter;
                if (nativeCreateRequestContextAdapter == 0) {
                    NullPointerException nullPointerException = new NullPointerException("Context Adapter creation failed.");
                    MethodCollector.o(11155);
                    throw nullPointerException;
                }
            } catch (Throwable th2) {
                MethodCollector.o(11155);
                throw th2;
            }
        }
        CronetLibraryLoader.a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103460);
            }

            public final void run() {
                MethodCollector.i(11227);
                CronetLibraryLoader.a();
                PowerMonitor.f155186g = CronetUrlRequestContext.this.f155584f;
                PowerMonitor.e();
                synchronized (CronetUrlRequestContext.this.f155581c) {
                    try {
                        CronetUrlRequestContext cronetUrlRequestContext = CronetUrlRequestContext.this;
                        cronetUrlRequestContext.nativeInitRequestContextOnInitThread(cronetUrlRequestContext.f155583e);
                    } finally {
                        MethodCollector.o(11227);
                    }
                }
            }
        });
        MethodCollector.o(11155);
    }

    private static long a(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String str;
        int i2;
        String str2 = "";
        MethodCollector.i(11314);
        try {
            Context context = cronetEngineBuilderImpl.f155499a;
            if (d.f107195c == null || !d.f107197e) {
                d.f107195c = context.getFilesDir();
            }
            File file = d.f107195c;
            if (file != null) {
                str = file.getAbsolutePath();
            } else {
                str = str2;
            }
        } catch (Throwable unused) {
            str = str2;
        }
        String str3 = cronetEngineBuilderImpl.f155503e;
        String str4 = cronetEngineBuilderImpl.f155504f;
        boolean z2 = cronetEngineBuilderImpl.f155505g;
        if (cronetEngineBuilderImpl.f155505g) {
            Context context2 = cronetEngineBuilderImpl.f155499a;
            StringBuilder sb = new StringBuilder();
            sb.append(context2.getPackageName());
            s.a(sb);
            str2 = sb.toString();
        }
        boolean z3 = cronetEngineBuilderImpl.f155506h;
        boolean z4 = cronetEngineBuilderImpl.f155507i;
        boolean z5 = cronetEngineBuilderImpl.f155508j;
        int i3 = cronetEngineBuilderImpl.f155509k;
        long j2 = cronetEngineBuilderImpl.f155510l;
        String str5 = cronetEngineBuilderImpl.f155511m;
        long j3 = cronetEngineBuilderImpl.n;
        boolean z6 = cronetEngineBuilderImpl.o;
        boolean z7 = cronetEngineBuilderImpl.f155502d;
        boolean z8 = cronetEngineBuilderImpl.q;
        boolean z9 = cronetEngineBuilderImpl.r;
        if (cronetEngineBuilderImpl.p == 20) {
            i2 = 0;
        } else {
            i2 = cronetEngineBuilderImpl.p;
        }
        long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(str3, str4, z2, str2, z3, z4, z5, i3, j2, str5, j3, z6, z7, z8, z9, str, i2);
        for (CronetEngineBuilderImpl.b bVar : cronetEngineBuilderImpl.f155500b) {
            nativeAddQuicHint(nativeCreateRequestContextConfig, bVar.f155516a, bVar.f155517b, bVar.f155518c);
        }
        for (CronetEngineBuilderImpl.a aVar : cronetEngineBuilderImpl.f155501c) {
            nativeAddPkp(nativeCreateRequestContextConfig, aVar.f155512a, aVar.f155513b, aVar.f155514c, aVar.f155515d.getTime());
        }
        String str6 = cronetEngineBuilderImpl.v;
        if (str6 != null) {
            nativeSetGetDomainDefaultJSON(nativeCreateRequestContextConfig, str6);
        }
        ArrayList<byte[]> arrayList = cronetEngineBuilderImpl.w;
        if (arrayList != null && !arrayList.isEmpty()) {
            nativeSetOpaqueData(nativeCreateRequestContextConfig, (byte[][]) arrayList.toArray(new byte[arrayList.size()][]));
        }
        Map<String[], Pair<byte[], byte[]>> map = cronetEngineBuilderImpl.x;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String[], Pair<byte[], byte[]>> entry : map.entrySet()) {
                nativeSetClientOpaqueData(nativeCreateRequestContextConfig, entry.getKey(), (byte[]) entry.getValue().first, (byte[]) entry.getValue().second);
            }
        }
        String str7 = cronetEngineBuilderImpl.y;
        if (str7 != null) {
            nativeSetBypassBOEJSON(nativeCreateRequestContextConfig, str7);
        }
        String str8 = cronetEngineBuilderImpl.z;
        if (str8 != null) {
            nativeSetStoreIdcRuleJSON(nativeCreateRequestContextConfig, str8);
        }
        String str9 = cronetEngineBuilderImpl.A;
        if (str9 != null) {
            nativeSetProxyConfig(nativeCreateRequestContextConfig, str9);
        }
        nativeEnableBoeProxy(nativeCreateRequestContextConfig, cronetEngineBuilderImpl.B);
        nativeInitALogFuncAddr(cronetEngineBuilderImpl.C);
        MethodCollector.o(11314);
        return nativeCreateRequestContextConfig;
    }

    private void onMultiNetworkStateChanged(int i2, int i3) {
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a(i2, i3);
        }
    }

    private void onSendAppMonitorEvent(String str, String str2) {
        v vVar = this.B;
        if (vVar != null) {
            vVar.a(str, str2);
        }
    }

    private void onServerConfigUpdated(String str, String str2) {
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a(str, str2);
        }
    }

    private void onTNCUpdateFailed(String[] strArr, String str) {
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a(strArr, str);
        }
    }

    private static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e2) {
            f.c(f155580b, "Exception posting task to executor", e2);
        }
    }

    private void onStoreIdcChanged(String str, String str2, String str3) {
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a(str, str2, str3);
        }
    }

    private void onDnsLookupComplete(final DnsQuery dnsQuery, int i2, String[] strArr) {
        dnsQuery.f155641b = i2;
        dnsQuery.f155642c = strArr;
        try {
            dnsQuery.f155643d.execute(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(103461);
                }

                public final void run() {
                    dnsQuery.f155643d.b();
                }
            });
        } catch (RejectedExecutionException e2) {
            f.c("DnsQuery", "Exception DnsQuery resume ", e2);
        }
    }

    private void onRttObservation(final int i2, final long j2, final int i3) {
        MethodCollector.i(13507);
        synchronized (this.f155589k) {
            try {
                Iterator<VersionSafeCallbacks.b> it = this.u.iterator();
                while (it.hasNext()) {
                    final VersionSafeCallbacks.b next = it.next();
                    a(next.f155668a.a(), new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(103463);
                        }

                        public final void run() {
                        }
                    });
                }
            } finally {
                MethodCollector.o(13507);
            }
        }
    }

    private void onThroughputObservation(final int i2, final long j2, final int i3) {
        MethodCollector.i(13575);
        synchronized (this.f155589k) {
            try {
                Iterator<VersionSafeCallbacks.c> it = this.v.iterator();
                while (it.hasNext()) {
                    final VersionSafeCallbacks.c next = it.next();
                    a(next.f155669a.a(), new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(103464);
                        }

                        public final void run() {
                        }
                    });
                }
            } finally {
                MethodCollector.o(13575);
            }
        }
    }

    private void onUrlDispatchComplete(final URLDispatch uRLDispatch, String str, String str2, String str3) {
        uRLDispatch.f155662c = str;
        uRLDispatch.f155664e = str2;
        uRLDispatch.f155663d = str3;
        try {
            uRLDispatch.f155665f.execute(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.CronetUrlRequestContext.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(103462);
                }

                public final void run() {
                    uRLDispatch.f155665f.b();
                }
            });
        } catch (RejectedExecutionException e2) {
            f.c(URLDispatch.f155660a, "Exception URLDispatch resume ", e2);
        }
    }

    private void onPacketLossComputed(int i2, double d2, double d3, double d4, double d5) {
        MethodCollector.i(13251);
        synchronized (this.f155589k) {
            if (i2 == 0 || i2 == 1) {
                this.q[i2] = d2;
                this.r[i2] = d3;
                this.s[i2] = d4;
                this.t[i2] = d5;
                u uVar = this.f155585g;
                if (uVar != null) {
                    uVar.a(i2, d2, d3, d4, d5);
                }
                MethodCollector.o(13251);
                return;
            }
            try {
                f.c(f155580b, "Error protocol from native. Protocol: ".concat(String.valueOf(i2)), new Object[0]);
            } finally {
                MethodCollector.o(13251);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.c
    public final w a(w.b bVar, Executor executor, int i2, List<String> list, int i3, int i4) {
        return new TTCronetNetExpRequest(this, bVar, executor, i2, list, i3, i4);
    }

    private void onRTTOrThroughputEstimatesComputed(int i2, int i3, int i4, String[] strArr, int[] iArr, int[] iArr2) {
        MethodCollector.i(13169);
        synchronized (this.f155589k) {
            try {
                this.n = i2;
                this.o = i3;
                this.p = i4;
                this.x = strArr;
                this.y = iArr;
                this.z = iArr2;
                u uVar = this.f155585g;
                if (uVar != null) {
                    uVar.a(i2, i3, i4);
                }
            } finally {
                MethodCollector.o(13169);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.c
    public final x a(x.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z2) {
        return new CronetWebsocketConnection(this, bVar, executor, list, map, map2, z2);
    }

    private void onTTDnsResolveResult(String str, String str2, int i2, int i3, int i4, String[] strArr, String str3) {
        ArrayList arrayList = new ArrayList(strArr.length);
        Collections.addAll(arrayList, strArr);
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a(str, str2, i2, i3, i4, arrayList, str3);
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.c
    public final p a(String str, ab.b bVar, Executor executor, int i2, Collection<Object> collection, boolean z2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, int i4, t.a aVar) {
        Throwable th;
        MethodCollector.i(11469);
        synchronized (this.f155581c) {
            try {
                k();
                try {
                    CronetUrlRequest cronetUrlRequest = new CronetUrlRequest(this, str, i2, bVar, executor, collection, z2, z3, z4, z5, i3, z6, i4, aVar);
                    MethodCollector.o(11469);
                    return cronetUrlRequest;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.o(11469);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(11469);
                throw th;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.c
    public final x a(x.b bVar, Executor executor, List<String> list, int i2, String str, long j2, int i3, long j3, String str2, int i4, String str3, Map<String, String> map, Map<String, String> map2, boolean z2) {
        return new CronetWebsocketConnection(this, bVar, executor, list, i2, str, j2, i3, j3, str2, i4, str3, map, map2, z2);
    }

    private void onContextInitCompleted(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f155586h.open();
        u uVar = this.f155585g;
        if (uVar != null) {
            uVar.a(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19);
        }
    }

    private void handleApiResult(boolean z2, String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, boolean z3, long j12, long j13, String str4, String str5, String str6, int i2, int i3, String str7) {
        v vVar = this.B;
        if (vVar != null) {
            vVar.a(z2, str, str2, str3, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, z3, j12, j13, str4, str5, str6, i2, i3, str7);
        }
    }
}
