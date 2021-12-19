package com.airbnb.lottie.g;

import com.airbnb.lottie.e;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f5614a;

    /* renamed from: b  reason: collision with root package name */
    public static long f5615b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f5616c;

    static {
        Covode.recordClassIndex(2337);
    }

    public static void b(g gVar) {
        if (f5616c) {
            if (gVar == null) {
                a aVar = f5614a;
                if (aVar != null) {
                    aVar.a(f5615b);
                }
            } else if (gVar.o != null) {
                gVar.o.a(f5615b);
            }
        }
    }

    public static void a(g gVar) {
        if (f5616c) {
            if (gVar != null) {
                if (gVar.o == null) {
                    gVar.o = new a();
                }
            } else if (f5614a == null) {
                a aVar = new a();
                f5614a = aVar;
                aVar.f5598a = true;
            }
        }
    }

    public static void c(g gVar) {
        float f2;
        if (f5616c) {
            float f3 = 0.0f;
            if (gVar.o != null) {
                e eVar = gVar.f5554a;
                if (eVar != null) {
                    f2 = eVar.f5340k;
                } else {
                    f2 = 0.0f;
                }
                gVar.o.b();
                gVar.o.f5599b = f2;
            }
            if (f5614a != null) {
                e eVar2 = gVar.f5554a;
                if (eVar2 != null) {
                    f3 = eVar2.f5340k;
                }
                a aVar = f5614a;
                aVar.f5599b = Math.max(aVar.f5599b, f3);
                f5614a.b();
            }
        }
    }

    public static void a(g gVar, boolean z) {
        if (f5616c) {
            if (!(gVar == null || gVar.o == null)) {
                gVar.o.a(z);
            }
            a aVar = f5614a;
            if (aVar != null) {
                aVar.a(z);
            }
        }
    }
}
