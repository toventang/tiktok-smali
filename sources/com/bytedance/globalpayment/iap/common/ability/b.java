package com.bytedance.globalpayment.iap.common.ability;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.g.a.d;
import com.bytedance.globalpayment.iap.common.ability.g.b.a;
import com.bytedance.globalpayment.iap.common.ability.g.b.e;
import com.bytedance.globalpayment.iap.common.ability.g.b.f;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f30256a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile f f30257b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile e f30258c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f30259d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile com.bytedance.globalpayment.iap.common.ability.g.b.b f30260e;

    static {
        Covode.recordClassIndex(17561);
    }

    private b() {
    }

    public static a e() {
        MethodCollector.i(5932);
        if (f30256a == null) {
            synchronized (b.class) {
                try {
                    if (f30256a == null) {
                        f30256a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5932);
                    throw th;
                }
            }
        }
        a aVar = f30256a;
        MethodCollector.o(5932);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.a
    public final f a() {
        MethodCollector.i(5938);
        if (f30257b == null) {
            synchronized (this) {
                try {
                    if (f30257b == null) {
                        f30257b = new com.bytedance.globalpayment.iap.common.ability.g.a.e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5938);
                    throw th;
                }
            }
        }
        f fVar = f30257b;
        MethodCollector.o(5938);
        return fVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.a
    public final e b() {
        MethodCollector.i(5989);
        if (f30258c == null) {
            synchronized (this) {
                try {
                    if (f30258c == null) {
                        f30258c = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5989);
                    throw th;
                }
            }
        }
        e eVar = f30258c;
        MethodCollector.o(5989);
        return eVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.a
    public final a c() {
        MethodCollector.i(6053);
        if (f30259d == null) {
            synchronized (this) {
                try {
                    if (f30259d == null) {
                        f30259d = new com.bytedance.globalpayment.iap.common.ability.g.a.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6053);
                    throw th;
                }
            }
        }
        a aVar = f30259d;
        MethodCollector.o(6053);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.a
    public final com.bytedance.globalpayment.iap.common.ability.g.b.b d() {
        MethodCollector.i(6123);
        if (f30260e == null) {
            synchronized (this) {
                try {
                    if (f30260e == null) {
                        f30260e = new com.bytedance.globalpayment.iap.common.ability.g.a.b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6123);
                    throw th;
                }
            }
        }
        com.bytedance.globalpayment.iap.common.ability.g.b.b bVar = f30260e;
        MethodCollector.o(6123);
        return bVar;
    }
}
