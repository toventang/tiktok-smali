package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.c;
import com.bytedance.lighten.a.s;
import com.bytedance.lighten.loader.s;
import com.facebook.c.a.d;
import com.facebook.c.b.c;
import com.facebook.fresco.animation.c.a;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.i;
import com.facebook.imagepipeline.g.d;
import com.facebook.imagepipeline.memory.ab;
import com.facebook.imagepipeline.memory.ac;
import com.facebook.imageutils.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.HashSet;

final class v {
    static {
        Covode.recordClassIndex(24680);
    }

    private static d a(final c cVar) {
        return new d() {
            /* class com.bytedance.lighten.loader.v.AnonymousClass2 */

            static {
                Covode.recordClassIndex(24682);
            }

            @Override // com.facebook.c.a.d
            public final void a(com.facebook.c.a.c cVar) {
            }
        };
    }

    private static void g(final s sVar) {
        a.f47559c = new com.facebook.fresco.animation.d.c() {
            /* class com.bytedance.lighten.loader.v.AnonymousClass3 */

            static {
                Covode.recordClassIndex(24683);
            }

            /* JADX WARNING: Removed duplicated region for block: B:39:0x0096 A[LOOP:3: B:38:0x0094->B:39:0x0096, LOOP_END] */
            @Override // com.facebook.fresco.animation.d.c
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.facebook.fresco.animation.d.b a(com.facebook.fresco.animation.a.a r13, java.lang.Object r14) {
                /*
                // Method dump skipped, instructions count: 188
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.v.AnonymousClass3.a(com.facebook.fresco.animation.a.a, java.lang.Object):com.facebook.fresco.animation.d.b");
            }
        };
    }

    private static void b(final s sVar) {
        if (sVar.x != null) {
            b.f48470a = new b.a() {
                /* class com.bytedance.lighten.loader.v.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(24681);
                }

                @Override // com.facebook.imageutils.b.a
                public final void a(String str) {
                }
            };
        }
    }

    private static void c(s sVar) {
        if (sVar.f39868c >= 0) {
            com.facebook.imagepipeline.a.b.b.f47658b = sVar.f39868c;
        }
    }

    private static void a(i.a aVar) {
        aVar.y = new d.a().a(com.bytedance.lighten.b.b.f39920a, new com.bytedance.lighten.b.b(), new com.bytedance.lighten.b.a()).a();
    }

    private static void f(s sVar) {
        com.f.a.b.f46468e = sVar.f39866a;
        com.f.a.b.f46464a = new w(sVar.t);
        com.f.a.b.f46465b = false;
        com.f.a.b.f46466c = true;
        com.f.a.b.f46467d = sVar.r;
    }

    static i a(s sVar) {
        c(sVar);
        i.a a2 = i.a(sVar.f39866a);
        a2.n = d(sVar);
        a2.w = e(sVar);
        a2.f47874a = sVar.f39867b;
        a2.f47879f = true;
        b(sVar, a2);
        c(sVar, a2);
        d(sVar, a2);
        a(a2);
        e(sVar, a2);
        g(sVar);
        b(sVar);
        a(sVar, a2);
        return a2.a();
    }

    private static com.facebook.c.b.c d(s sVar) {
        c.a a2 = com.facebook.c.b.c.a(sVar.f39866a).a(sVar.f39870e);
        a2.f46992b = "fresco_cache";
        if (sVar.f39873h > 0) {
            a2.f46994d = sVar.f39873h;
        }
        a2.f47000j = com.facebook.common.a.c.a();
        if (sVar.u != null) {
            a2.f46999i = a(sVar.u);
        }
        return a2.a();
    }

    private static com.facebook.c.b.c e(s sVar) {
        c.a a2 = com.facebook.c.b.c.a(sVar.f39866a).a(sVar.f39870e);
        a2.f46992b = "fresco_small_cache";
        if (sVar.f39874i > 0) {
            a2.f46994d = sVar.f39874i;
        }
        a2.f47000j = com.facebook.common.a.c.a();
        if (sVar.u != null) {
            a2.f46999i = a(sVar.u);
        }
        return a2.a();
    }

    private static void a(s sVar, i.a aVar) {
        if (sVar.y) {
            aVar.A.a();
        }
    }

    private static void b(s sVar, i.a aVar) {
        if (sVar.w) {
            aVar.o = s.a.f40036a;
            ab.a a2 = ab.a();
            a2.f48046d = s.a.f40036a;
            aVar.s = new ac(a2.a());
        }
    }

    private static void c(com.bytedance.lighten.a.s sVar, i.a aVar) {
        if (sVar.f39869d != null) {
            aVar.q = new p(sVar.f39869d);
            return;
        }
        try {
            aVar.q = new com.facebook.net.c();
        } catch (Throwable unused) {
        }
    }

    private static void e(com.bytedance.lighten.a.s sVar, i.a aVar) {
        if (sVar.q) {
            HashSet hashSet = new HashSet();
            t.f40037a = new com.f.a.c();
            hashSet.add(t.f40037a);
            aVar.u = hashSet;
            f(sVar);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12029);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(12029);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void d(com.bytedance.lighten.a.s sVar, i.a aVar) {
        aVar.a(new b((ActivityManager) a(sVar.f39866a, "activity"), (int) sVar.f39871f));
        aVar.b(new h((int) sVar.f39872g));
        if (sVar.o) {
            aVar.f47882i = r.a();
        }
        if (sVar.f39877l) {
            j.a().a(sVar.n);
        }
        if (sVar.f39878m) {
            j.a().f47811a = true;
        }
    }
}
