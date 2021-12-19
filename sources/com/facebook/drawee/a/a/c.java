package com.facebook.drawee.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.c.g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.i;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.p.b;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.io.IOException;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f47260a = c.class;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f47261b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f47262c = true;

    /* renamed from: d  reason: collision with root package name */
    private static f f47263d;

    /* renamed from: e  reason: collision with root package name */
    private static g f47264e;

    private c() {
    }

    public static boolean d() {
        return f47261b;
    }

    static {
        Covode.recordClassIndex(28733);
    }

    public static h c() {
        return k.a().e();
    }

    public static void a() {
        g gVar;
        if (f47263d == null && (gVar = f47264e) != null) {
            f47263d = (f) gVar.a();
        }
    }

    public static e b() {
        a();
        return f47263d.b();
    }

    public static void a(Context context) {
        a(context, null);
    }

    public static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static void c(Context context) {
        b.a();
        AnonymousClass1 r1 = new g(context, null) {
            /* class com.facebook.drawee.a.a.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f47265a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f47266b = null;

            /* renamed from: c  reason: collision with root package name */
            private volatile f f47267c;

            static {
                Covode.recordClassIndex(28734);
            }

            @Override // com.facebook.drawee.c.g
            public final com.facebook.common.d.k<? extends com.facebook.drawee.c.b> a() {
                MethodCollector.i(3481);
                if (this.f47267c == null) {
                    synchronized (this) {
                        try {
                            if (this.f47267c == null) {
                                this.f47267c = new f(this.f47265a, this.f47266b);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(3481);
                            throw th;
                        }
                    }
                }
                f fVar = this.f47267c;
                MethodCollector.o(3481);
                return fVar;
            }

            {
                this.f47265a = r2;
            }
        };
        f47264e = r1;
        SimpleDraweeView.initialize(r1);
        b.a();
    }

    public static void a(Context context, i iVar) {
        b.a();
        if (f47261b) {
            com.facebook.common.e.a.c(f47260a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
            if (!f47262c) {
                b.a();
                return;
            }
        } else {
            f47261b = true;
        }
        try {
            b.a();
            com.facebook.imageutils.b.a(context);
            b.a();
        } catch (IOException e2) {
            com.facebook.common.e.a.a(f47260a, e2, "Could not initialize SoLoader", new Object[0]);
            b.a();
        }
        Context b2 = b(context);
        if (iVar == null) {
            k.a(b2);
        } else {
            k.a(iVar);
        }
        c(b2);
        b.a();
    }
}
