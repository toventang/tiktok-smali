package com.facebook.imagepipeline.e;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.k;
import com.facebook.common.g.d;
import com.facebook.common.l.b;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.d.h;
import com.facebook.imagepipeline.d.n;
import com.facebook.imagepipeline.d.q;
import com.facebook.imagepipeline.d.t;
import com.facebook.imagepipeline.e.j;
import com.facebook.imagepipeline.g.c;
import com.facebook.imagepipeline.g.e;
import com.facebook.imagepipeline.g.g;
import com.facebook.imagepipeline.memory.ab;
import com.facebook.imagepipeline.memory.ac;
import com.facebook.imagepipeline.n.ag;
import com.facebook.imagepipeline.n.u;
import com.ss.android.ugc.aweme.experiment.bc;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class i {
    public static b B = new b((byte) 0);
    public final boolean A;
    private final int C;

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.Config f47860a;

    /* renamed from: b  reason: collision with root package name */
    public final k<q> f47861b;

    /* renamed from: c  reason: collision with root package name */
    public final h.a f47862c;

    /* renamed from: d  reason: collision with root package name */
    public final f f47863d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f47864e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f47865f;

    /* renamed from: g  reason: collision with root package name */
    public final f f47866g;

    /* renamed from: h  reason: collision with root package name */
    public final k<q> f47867h;

    /* renamed from: i  reason: collision with root package name */
    public final e f47868i;

    /* renamed from: j  reason: collision with root package name */
    public final n f47869j;

    /* renamed from: k  reason: collision with root package name */
    public final c f47870k;

    /* renamed from: l  reason: collision with root package name */
    public final com.facebook.imagepipeline.q.c f47871l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f47872m;
    public final k<Boolean> n;
    public final com.facebook.c.b.c o;
    public final d p;
    public final int q;
    public final ag r;
    public final com.facebook.imagepipeline.c.f s;
    public final ac t;
    public final e u;
    final Set<com.facebook.imagepipeline.k.c> v;
    public final boolean w;
    public final com.facebook.c.b.c x;
    public final com.facebook.imagepipeline.g.d y;
    public final j z;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f47887a;

        static {
            Covode.recordClassIndex(28986);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static class a {
        public final j.a A;
        public boolean B;

        /* renamed from: a  reason: collision with root package name */
        public Bitmap.Config f47874a;

        /* renamed from: b  reason: collision with root package name */
        public k<q> f47875b;

        /* renamed from: c  reason: collision with root package name */
        public h.a f47876c;

        /* renamed from: d  reason: collision with root package name */
        public f f47877d;

        /* renamed from: e  reason: collision with root package name */
        public final Context f47878e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f47879f;

        /* renamed from: g  reason: collision with root package name */
        public k<q> f47880g;

        /* renamed from: h  reason: collision with root package name */
        public e f47881h;

        /* renamed from: i  reason: collision with root package name */
        public n f47882i;

        /* renamed from: j  reason: collision with root package name */
        public c f47883j;

        /* renamed from: k  reason: collision with root package name */
        public com.facebook.imagepipeline.q.c f47884k;

        /* renamed from: l  reason: collision with root package name */
        public Integer f47885l;

        /* renamed from: m  reason: collision with root package name */
        public k<Boolean> f47886m;
        public com.facebook.c.b.c n;
        public d o;
        public Integer p;
        public ag q;
        public com.facebook.imagepipeline.c.f r;
        public ac s;
        public e t;
        public Set<com.facebook.imagepipeline.k.c> u;
        public boolean v;
        public com.facebook.c.b.c w;
        public f x;
        public com.facebook.imagepipeline.g.d y;
        public int z;

        static {
            Covode.recordClassIndex(28985);
        }

        public final i a() {
            return new i(this, (byte) 0);
        }

        public final a a(k<q> kVar) {
            this.f47875b = (k) com.facebook.common.d.i.a(kVar);
            return this;
        }

        public final a b(k<q> kVar) {
            this.f47880g = (k) com.facebook.common.d.i.a(kVar);
            return this;
        }

        private a(Context context) {
            this.v = true;
            this.z = -1;
            this.A = new j.a(this);
            this.B = true;
            this.f47878e = (Context) com.facebook.common.d.i.a(context);
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    static {
        Covode.recordClassIndex(28983);
    }

    public static a a(Context context) {
        a aVar = new a(context, (byte) 0);
        if (bc.b() || bc.a() == 2) {
            aVar.f47881h = new com.ss.android.ugc.aweme.ca.f();
        }
        return aVar;
    }

    /* JADX INFO: finally extract failed */
    private static com.facebook.c.b.c b(Context context) {
        try {
            com.facebook.imagepipeline.p.b.a();
            com.facebook.c.b.c a2 = com.facebook.c.b.c.a(context).a();
            com.facebook.imagepipeline.p.b.a();
            return a2;
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    private i(a aVar) {
        k<q> kVar;
        h.a aVar2;
        Bitmap.Config config;
        f fVar;
        f fVar2;
        k<q> kVar2;
        n nVar;
        com.facebook.imagepipeline.q.c cVar;
        k<Boolean> kVar3;
        com.facebook.c.b.c cVar2;
        d dVar;
        int i2;
        ag agVar;
        ac acVar;
        e eVar;
        Set<com.facebook.imagepipeline.k.c> set;
        e eVar2;
        com.facebook.common.l.b a2;
        com.facebook.imagepipeline.p.b.a();
        int i3 = 0;
        j jVar = new j(aVar.A, (byte) 0);
        this.z = jVar;
        if (aVar.f47875b == null) {
            kVar = new com.facebook.imagepipeline.d.i((ActivityManager) a(aVar.f47878e, "activity"));
        } else {
            kVar = aVar.f47875b;
        }
        this.f47861b = kVar;
        if (aVar.f47876c == null) {
            aVar2 = new com.facebook.imagepipeline.d.d();
        } else {
            aVar2 = aVar.f47876c;
        }
        this.f47862c = aVar2;
        if (aVar.f47874a == null) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = aVar.f47874a;
        }
        this.f47860a = config;
        if (aVar.f47877d == null) {
            fVar = com.facebook.imagepipeline.d.j.a();
        } else {
            fVar = aVar.f47877d;
        }
        this.f47863d = fVar;
        this.f47864e = (Context) com.facebook.common.d.i.a(aVar.f47878e);
        if (aVar.x == null) {
            fVar2 = new b(new d());
        } else {
            fVar2 = aVar.x;
        }
        this.f47866g = fVar2;
        this.f47865f = aVar.f47879f;
        if (aVar.f47880g == null) {
            kVar2 = new com.facebook.imagepipeline.d.k();
        } else {
            kVar2 = aVar.f47880g;
        }
        this.f47867h = kVar2;
        if (aVar.f47882i == null) {
            nVar = t.a();
        } else {
            nVar = aVar.f47882i;
        }
        this.f47869j = nVar;
        this.f47870k = aVar.f47883j;
        if (aVar.f47884k == null || aVar.f47885l == null) {
            if (aVar.f47884k != null) {
                cVar = aVar.f47884k;
            } else {
                cVar = null;
            }
            this.f47871l = cVar;
            this.f47872m = aVar.f47885l;
            if (aVar.f47886m == null) {
                kVar3 = new k<Boolean>() {
                    /* class com.facebook.imagepipeline.e.i.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28984);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.facebook.common.d.k
                    public final /* synthetic */ Boolean b() {
                        return true;
                    }
                };
            } else {
                kVar3 = aVar.f47886m;
            }
            this.n = kVar3;
            if (aVar.n == null) {
                cVar2 = b(aVar.f47878e);
            } else {
                cVar2 = aVar.n;
            }
            this.o = cVar2;
            if (aVar.o == null) {
                dVar = com.facebook.common.g.e.a();
            } else {
                dVar = aVar.o;
            }
            this.p = dVar;
            if (aVar.p != null) {
                i3 = aVar.p.intValue();
            } else if (jVar.f47898k) {
                i3 = 1;
            }
            this.q = i3;
            if (aVar.z < 0) {
                i2 = 30000;
            } else {
                i2 = aVar.z;
            }
            this.C = i2;
            com.facebook.imagepipeline.p.b.a();
            if (aVar.q == null) {
                agVar = new u(i2);
            } else {
                agVar = aVar.q;
            }
            this.r = agVar;
            com.facebook.imagepipeline.p.b.a();
            this.s = aVar.r;
            if (aVar.s == null) {
                acVar = new ac(ab.a().a());
            } else {
                acVar = aVar.s;
            }
            this.t = acVar;
            if (aVar.t == null) {
                eVar = new g();
            } else {
                eVar = aVar.t;
            }
            this.u = eVar;
            if (aVar.u == null) {
                set = new HashSet<>();
            } else {
                set = aVar.u;
            }
            this.v = set;
            this.w = aVar.v;
            this.x = aVar.w != null ? aVar.w : cVar2;
            this.y = aVar.y;
            int c2 = acVar.c();
            if (aVar.f47881h == null) {
                eVar2 = new a(c2);
            } else {
                eVar2 = aVar.f47881h;
            }
            this.f47868i = eVar2;
            this.A = aVar.B;
            com.facebook.common.l.b bVar = jVar.f47891d;
            if (bVar != null) {
                a(bVar, jVar, new com.facebook.imagepipeline.c.d(acVar));
            } else if (jVar.f47888a && com.facebook.common.l.c.f47136a && (a2 = com.facebook.common.l.c.a()) != null) {
                a(a2, jVar, new com.facebook.imagepipeline.c.d(acVar));
            }
            com.facebook.imagepipeline.p.b.a();
            return;
        }
        throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
    }

    /* synthetic */ i(a aVar, byte b2) {
        this(aVar);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11987);
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
                    MethodCollector.o(11987);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void a(com.facebook.common.l.b bVar, j jVar, com.facebook.common.l.a aVar) {
        com.facebook.common.l.c.f47139d = bVar;
        b.a aVar2 = jVar.f47889b;
        if (aVar2 != null) {
            bVar.setWebpErrorLogger(aVar2);
        }
        bVar.setBitmapCreator(aVar);
    }
}
