package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;

public final class dq<V> {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f51423f = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f51424a;

    /* renamed from: b  reason: collision with root package name */
    private final dp<V> f51425b;

    /* renamed from: c  reason: collision with root package name */
    private final V f51426c;

    /* renamed from: d  reason: collision with root package name */
    private final V f51427d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f51428e;

    /* renamed from: g  reason: collision with root package name */
    private volatile V f51429g;

    /* renamed from: h  reason: collision with root package name */
    private volatile V f51430h;

    static {
        Covode.recordClassIndex(32184);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4 = com.google.android.gms.measurement.internal.p.f52036a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        if (r4.hasNext() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        r3 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0048, code lost:
        if (com.google.android.gms.measurement.internal.kl.a() != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0 = r3.f51425b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004d, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        r2 = r0.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0060, code lost:
        r1 = new java.lang.IllegalStateException("Refreshing flag cache must be done on a worker thread.");
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6860);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V a(V r7) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.dq.a(java.lang.Object):java.lang.Object");
    }

    private dq(String str, V v, V v2, dp<V> dpVar) {
        this.f51428e = new Object();
        this.f51429g = null;
        this.f51430h = null;
        this.f51424a = str;
        this.f51426c = v;
        this.f51427d = v2;
        this.f51425b = dpVar;
    }

    /* synthetic */ dq(String str, Object obj, Object obj2, dp dpVar, byte b2) {
        this(str, obj, obj2, dpVar);
    }
}
