package com.bytedance.globalpayment.payment.common.lib.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.payment.common.lib.h.b.b;
import com.bytedance.globalpayment.payment.common.lib.h.b.c;
import com.bytedance.globalpayment.payment.common.lib.h.b.d;
import com.bytedance.globalpayment.payment.common.lib.h.b.e;
import com.bytedance.globalpayment.payment.common.lib.h.b.f;
import com.bytedance.globalpayment.payment.common.lib.h.b.g;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f30568a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f30569b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f30570c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile g f30571d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile com.bytedance.globalpayment.payment.common.lib.h.b.a f30572e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile d f30573f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile d f30574g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile f f30575h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile c f30576i;

    static {
        Covode.recordClassIndex(17724);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final void b() {
        h();
        com.bytedance.globalpayment.payment.common.lib.b.a c2 = i().c();
        if (c2 != null && c2.r != null) {
            j().a(c2.r);
        }
    }

    public static b a() {
        MethodCollector.i(3414);
        if (f30568a == null) {
            synchronized (a.class) {
                try {
                    if (f30568a == null) {
                        f30568a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3414);
                    throw th;
                }
            }
        }
        b bVar = f30568a;
        MethodCollector.o(3414);
        return bVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final c c() {
        MethodCollector.i(3421);
        if (f30576i == null) {
            synchronized (this) {
                try {
                    if (f30576i == null) {
                        f30576i = new com.bytedance.globalpayment.payment.common.lib.h.a.c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3421);
                    throw th;
                }
            }
        }
        c cVar = f30576i;
        MethodCollector.o(3421);
        return cVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final e d() {
        MethodCollector.i(3422);
        if (f30569b == null) {
            synchronized (this) {
                try {
                    if (f30569b == null) {
                        f30569b = new com.bytedance.globalpayment.payment.common.lib.h.a.e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3422);
                    throw th;
                }
            }
        }
        e eVar = f30569b;
        MethodCollector.o(3422);
        return eVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final d e() {
        MethodCollector.i(3423);
        if (f30573f == null) {
            synchronized (this) {
                try {
                    if (f30573f == null) {
                        f30573f = new com.bytedance.globalpayment.payment.common.lib.h.a.d("IAP");
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3423);
                    throw th;
                }
            }
        }
        d dVar = f30573f;
        MethodCollector.o(3423);
        return dVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final d f() {
        MethodCollector.i(3424);
        if (f30574g == null) {
            synchronized (this) {
                try {
                    if (f30574g == null) {
                        f30574g = new com.bytedance.globalpayment.payment.common.lib.h.a.d("ECommerce");
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3424);
                    throw th;
                }
            }
        }
        d dVar = f30574g;
        MethodCollector.o(3424);
        return dVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final f g() {
        MethodCollector.i(3425);
        if (f30575h == null) {
            synchronized (this) {
                try {
                    if (f30575h == null) {
                        f30575h = new com.bytedance.globalpayment.payment.common.lib.h.a.f();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3425);
                    throw th;
                }
            }
        }
        f fVar = f30575h;
        MethodCollector.o(3425);
        return fVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final g h() {
        MethodCollector.i(3426);
        if (f30571d == null) {
            synchronized (this) {
                try {
                    if (f30571d == null) {
                        f30571d = new com.bytedance.globalpayment.payment.common.lib.h.a.g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3426);
                    throw th;
                }
            }
        }
        g gVar = f30571d;
        MethodCollector.o(3426);
        return gVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final com.bytedance.globalpayment.payment.common.lib.h.b.a i() {
        MethodCollector.i(3428);
        if (f30572e == null) {
            synchronized (this) {
                try {
                    if (f30572e == null) {
                        f30572e = new com.bytedance.globalpayment.payment.common.lib.h.a.a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3428);
                    throw th;
                }
            }
        }
        com.bytedance.globalpayment.payment.common.lib.h.b.a aVar = f30572e;
        MethodCollector.o(3428);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b
    public final b j() {
        MethodCollector.i(3430);
        if (f30570c == null) {
            synchronized (this) {
                try {
                    if (f30570c == null) {
                        f30570c = new com.bytedance.globalpayment.payment.common.lib.h.a.b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3430);
                    throw th;
                }
            }
        }
        b bVar = f30570c;
        MethodCollector.o(3430);
        return bVar;
    }
}
