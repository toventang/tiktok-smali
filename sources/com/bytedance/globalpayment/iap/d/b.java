package com.bytedance.globalpayment.iap.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.g.b.c;
import com.bytedance.globalpayment.iap.d.b.a;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f30339a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile com.bytedance.globalpayment.iap.d.b.b f30340b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f30341c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f30342d;

    static {
        Covode.recordClassIndex(17613);
    }

    public static a d() {
        MethodCollector.i(7493);
        if (f30339a == null) {
            synchronized (b.class) {
                try {
                    if (f30339a == null) {
                        f30339a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7493);
                    throw th;
                }
            }
        }
        a aVar = f30339a;
        MethodCollector.o(7493);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.d.a
    public final com.bytedance.globalpayment.iap.d.b.b a() {
        MethodCollector.i(7546);
        if (f30340b == null) {
            synchronized (this) {
                try {
                    if (f30340b == null) {
                        f30340b = new com.bytedance.globalpayment.iap.d.a.b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7546);
                    throw th;
                }
            }
        }
        com.bytedance.globalpayment.iap.d.b.b bVar = f30340b;
        MethodCollector.o(7546);
        return bVar;
    }

    @Override // com.bytedance.globalpayment.iap.d.a
    public final c b() {
        MethodCollector.i(7628);
        if (f30341c == null) {
            synchronized (this) {
                try {
                    if (f30341c == null) {
                        f30341c = new com.bytedance.globalpayment.iap.common.ability.g.a.c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7628);
                    throw th;
                }
            }
        }
        c cVar = f30341c;
        MethodCollector.o(7628);
        return cVar;
    }

    @Override // com.bytedance.globalpayment.iap.d.a
    public final a c() {
        MethodCollector.i(7631);
        if (f30342d == null) {
            synchronized (this) {
                try {
                    if (f30342d == null) {
                        f30342d = new com.bytedance.globalpayment.iap.d.a.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7631);
                    throw th;
                }
            }
        }
        a aVar = f30342d;
        MethodCollector.o(7631);
        return aVar;
    }
}
