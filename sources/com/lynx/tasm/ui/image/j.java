package com.lynx.tasm.ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.facebook.common.k.g;
import com.facebook.drawee.c.d;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.e;
import com.facebook.imagepipeline.e.k;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.ui.image.b.c;
import com.lynx.tasm.ui.image.b.d;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public class j {
    public static Handler t = new Handler(Looper.getMainLooper());
    int A;
    public boolean B;
    String C;
    String D;
    public int E;
    public boolean F;
    private f G;
    private final List<c> H;
    private c I;
    private Bitmap.Config J;

    /* renamed from: a  reason: collision with root package name */
    public final Context f56986a;

    /* renamed from: b  reason: collision with root package name */
    public c f56987b;

    /* renamed from: c  reason: collision with root package name */
    c f56988c;

    /* renamed from: d  reason: collision with root package name */
    public final com.facebook.drawee.c.b f56989d;

    /* renamed from: e  reason: collision with root package name */
    com.facebook.imagepipeline.m.b f56990e;

    /* renamed from: f  reason: collision with root package name */
    public d f56991f;

    /* renamed from: g  reason: collision with root package name */
    public d f56992g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f56993h;

    /* renamed from: i  reason: collision with root package name */
    int f56994i;

    /* renamed from: j  reason: collision with root package name */
    int f56995j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f56996k;

    /* renamed from: l  reason: collision with root package name */
    public ReadableMap f56997l;

    /* renamed from: m  reason: collision with root package name */
    public q.b f56998m;
    public boolean n;
    com.lynx.tasm.behavior.ui.utils.b o;
    public boolean p;
    public com.facebook.drawee.view.b<com.facebook.drawee.f.a> q;
    public a r;
    public com.facebook.imagepipeline.o.b s;
    d u;
    String v;
    int w;
    int x;
    int y;
    int z;

    public interface a {
        static {
            Covode.recordClassIndex(35459);
        }

        void O_();

        void a(Drawable drawable);

        void a(com.facebook.common.h.a<?> aVar);
    }

    private boolean d() {
        if (this.H.size() > 1) {
            return true;
        }
        return false;
    }

    public final void a() {
        this.p = true;
        com.facebook.drawee.view.b<com.facebook.drawee.f.a> bVar = this.q;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void b() {
        this.p = false;
        com.facebook.drawee.view.b<com.facebook.drawee.f.a> bVar = this.q;
        if (bVar != null) {
            bVar.c();
        }
    }

    static {
        Covode.recordClassIndex(35452);
    }

    public final String c() {
        List<c> list = this.H;
        if (list == null || list.size() <= 0 || this.H.get(0) == null) {
            return null;
        }
        return this.H.get(0).a().toString();
    }

    public final void a(Bitmap.Config config) {
        this.J = config;
        this.n = true;
    }

    static void b(String str) {
        LLog.c("Lynx", "Warning: Image source \"" + str + "\" doesn't exist");
    }

    public final void a(String str) {
        this.v = str;
        this.w = 1;
        a(str, true);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, boolean z2) {
        if (z2) {
            str = com.lynx.tasm.behavior.ui.image.a.a(this.f56986a, str);
        }
        if (this.H.isEmpty() || !this.H.get(0).f56961a.equals(str)) {
            this.H.clear();
            if (str != null && !str.isEmpty()) {
                c cVar = new c(this.f56986a, str);
                this.H.add(cVar);
                if (Uri.EMPTY.equals(cVar.a())) {
                    b(str);
                }
            }
            this.n = true;
        }
    }

    private j(Context context, com.facebook.drawee.c.b bVar, a aVar) {
        this.G = f.RESIZE;
        this.f56986a = context;
        this.f56998m = q.b.f47436b;
        this.f56989d = bVar;
        this.f56993h = null;
        this.H = new LinkedList();
        this.r = aVar;
    }

    public j(Context context, com.facebook.drawee.c.b bVar, a aVar, boolean z2) {
        this(context, bVar, aVar);
        this.B = z2;
    }

    public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        float[] fArr;
        boolean z2;
        com.facebook.common.h.a<com.facebook.imagepipeline.j.c> a2;
        if (!(this.f56994i == i2 && this.f56995j == i3)) {
            this.f56994i = i2;
            this.f56995j = i3;
            this.n = true;
        }
        this.x = i4;
        this.y = i6;
        this.z = i5;
        this.A = i7;
        if (this.n && !d() && i2 > 0 && i3 > 0) {
            this.f56987b = null;
            if (!this.H.isEmpty()) {
                if (d()) {
                    d.a a3 = com.lynx.tasm.ui.image.b.d.a(i2, i3, this.H);
                    this.f56987b = a3.f56965a;
                    this.I = a3.f56966b;
                } else {
                    this.f56987b = this.H.get(0);
                }
            }
            if (this.f56987b != null || this.f56988c != null) {
                TraceEvent.a(0, "LynxImageManager.maybeUpdateView");
                c cVar = this.f56987b;
                if (!(cVar == null || cVar.f56961a == null || !this.F || this.f56986a == null)) {
                    final String str = this.f56987b.f56961a;
                    com.lynx.tasm.behavior.ui.image.a.a(this.f56986a, str, (float) i2, (float) i3, new f.a() {
                        /* class com.lynx.tasm.ui.image.j.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(35457);
                        }

                        @Override // com.lynx.tasm.behavior.f.a
                        public final void a(final Object obj, Throwable th) {
                            if (obj instanceof com.facebook.common.h.a) {
                                try {
                                    Object a2 = ((com.facebook.common.h.a) obj).a();
                                    if ((a2 instanceof Bitmap) || (a2 instanceof com.facebook.imagepipeline.j.b)) {
                                        AnonymousClass1 r2 = new Runnable() {
                                            /* class com.lynx.tasm.ui.image.j.AnonymousClass2.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(35458);
                                            }

                                            public final void run() {
                                                if (j.this.f56987b != null && str.equals(j.this.f56987b.f56961a)) {
                                                    j.this.r.a(((com.facebook.common.h.a) obj).clone());
                                                }
                                            }
                                        };
                                        if (Looper.myLooper() == Looper.getMainLooper()) {
                                            r2.run();
                                        } else {
                                            new Handler(Looper.getMainLooper()).post(r2);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    });
                }
                final WeakReference weakReference = new WeakReference(this);
                q.b bVar = this.f56998m;
                final com.facebook.drawee.view.b<com.facebook.drawee.f.a> bVar2 = this.q;
                if (bVar2 instanceof l) {
                    bVar2 = null;
                }
                com.lynx.tasm.behavior.ui.utils.b bVar3 = this.o;
                if (bVar3 != null) {
                    bVar3.a((float) i2, (float) i3);
                    fArr = this.o.a();
                } else {
                    fArr = null;
                }
                final com.facebook.imagepipeline.o.b a4 = a(this.f56987b, i2, i3, i4, i5, i6, i7, fArr, bVar);
                this.s = a4;
                if (a4 == null || (a2 = k.a().e().f47836a.a(k.a().e().f47839d.b(a4, null))) == null || a2.a() == null || !(a2.a() instanceof com.facebook.imagepipeline.j.d) || a2.a() == null) {
                    final String str2 = this.v;
                    final com.facebook.imagepipeline.o.b a5 = a(this.I, i2, i3, i4, i5, i6, i7, fArr, bVar);
                    final com.facebook.imagepipeline.o.b a6 = a(this.f56988c, i2, i3, i4, i5, i6, i7, fArr, bVar);
                    e a7 = e.a();
                    AnonymousClass1 r11 = new Runnable() {
                        /* class com.lynx.tasm.ui.image.j.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(35453);
                        }

                        public final void run() {
                            final com.facebook.drawee.view.b bVar = bVar2;
                            if (bVar == null) {
                                com.facebook.drawee.f.b bVar2 = new com.facebook.drawee.f.b(j.this.f56986a.getResources());
                                bVar2.t = e.b(0.0f);
                                bVar = com.facebook.drawee.view.b.a(bVar2.a());
                            }
                            j.this.f56989d.b();
                            REQUEST request = (REQUEST) a5;
                            if (request == null) {
                                request = (REQUEST) a6;
                            }
                            com.facebook.drawee.c.b bVar3 = j.this.f56989d;
                            bVar3.f47322j = true;
                            bVar3.f47314b = j.this.f56993h;
                            bVar3.f47319g = new com.facebook.drawee.c.c() {
                                /* class com.lynx.tasm.ui.image.j.AnonymousClass1.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(35454);
                                }

                                @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                                public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                    if (weakReference.get() != null) {
                                        ((j) weakReference.get()).r.O_();
                                    }
                                    if (animatable instanceof com.facebook.fresco.animation.c.a) {
                                        com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                                        aVar.a(new com.lynx.tasm.ui.image.a.c(aVar.f47564d, j.this.E));
                                        com.lynx.tasm.ui.image.b.b.a(aVar);
                                    }
                                }
                            };
                            bVar3.f47315c = (REQUEST) a4;
                            bVar3.f47316d = request;
                            j.this.f56991f = new com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f>() {
                                /* class com.lynx.tasm.ui.image.j.AnonymousClass1.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(35455);
                                }

                                @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                                public final void onSubmit(String str, Object obj) {
                                }

                                @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                                public final void onFailure(String str, Throwable th) {
                                    j jVar = j.this;
                                    String str2 = str2;
                                    if (str2 != null && str2.equals(jVar.v) && str2.startsWith("http")) {
                                        int i2 = jVar.w;
                                        jVar.w = i2 - 1;
                                        if (i2 > 0) {
                                            jVar.a(str2, false);
                                            jVar.n = true;
                                            jVar.a(jVar.f56994i, jVar.f56995j, jVar.x, jVar.z, jVar.y, jVar.A);
                                            return;
                                        }
                                    }
                                    LLog.d("FrescoImageView", "onFailed src:" + str2 + "with reason" + th.getMessage());
                                    if (j.this.u != null) {
                                        String message = th.getMessage();
                                        if (TextUtils.isEmpty(message) && (message = Log.getStackTraceString(th)) != null && message.length() > 200) {
                                            message = message.substring(0, 200);
                                        }
                                        j.this.u.a("Android LynxImageManager loading image failed, and the url is " + j.this.c() + ". The Fresco throw error msg is " + message);
                                    }
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                                @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                                public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                                    com.facebook.imagepipeline.j.f fVar2 = fVar;
                                    if (j.this.u != null) {
                                        j.this.u.a(fVar2.getWidth(), fVar2.getHeight());
                                    }
                                    if (animatable instanceof com.facebook.fresco.animation.c.a) {
                                        com.facebook.fresco.animation.c.a aVar = (com.facebook.fresco.animation.c.a) animatable;
                                        aVar.a(new com.lynx.tasm.ui.image.a.c(aVar.f47564d, j.this.E));
                                        com.lynx.tasm.ui.image.b.b.a(aVar);
                                    }
                                }
                            };
                            if (j.this.f56992g == null) {
                                j.this.f56989d.f47319g = j.this.f56991f;
                            } else {
                                com.facebook.drawee.c.f fVar = new com.facebook.drawee.c.f();
                                fVar.a(j.this.f56991f);
                                fVar.a(j.this.f56992g);
                                j.this.f56989d.f47319g = fVar;
                            }
                            bVar.a(j.this.f56989d.e());
                            j.this.f56989d.b();
                            if (j.this.B && bVar.e()) {
                                ((com.facebook.drawee.f.a) bVar.d()).a(q.b.f47436b);
                            }
                            final Drawable f2 = bVar.f();
                            j.t.post(new Runnable() {
                                /* class com.lynx.tasm.ui.image.j.AnonymousClass1.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(35456);
                                }

                                public final void run() {
                                    if (a4 == j.this.s) {
                                        if (j.this.r != null) {
                                            j.this.r.a(f2);
                                        }
                                        if (j.this.q != bVar) {
                                            if (j.this.q != null) {
                                                j.this.q.c();
                                            }
                                            j.this.q = bVar;
                                            if (j.this.p) {
                                                j.this.q.b();
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    };
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    com.lynx.tasm.base.c.a(z2);
                    if (a7.f56979c == null) {
                        if (a7.f56977a == null) {
                            a7.f56977a = new LinkedList();
                        }
                        a7.f56977a.add(r11);
                    } else {
                        a7.f56979c.post(r11);
                    }
                    this.n = false;
                    TraceEvent.b(0, "LynxImageManager.maybeUpdateView");
                    return;
                }
                com.facebook.drawee.view.b<com.facebook.drawee.f.a> bVar4 = this.q;
                if (bVar4 != null) {
                    bVar4.c();
                }
                l lVar = new l(a2);
                this.q = lVar;
                if (this.B && lVar.e()) {
                    this.q.d().a(q.b.f47436b);
                }
                if (this.u != null) {
                    com.facebook.imagepipeline.j.c a8 = a2.a();
                    this.u.a(a8.getWidth(), a8.getHeight());
                }
                this.r.a(this.q.f());
                this.n = false;
                TraceEvent.b(0, "LynxImageManager.maybeUpdateView");
            }
        }
    }

    private com.facebook.imagepipeline.o.b a(c cVar, int i2, int i3, int i4, int i5, int i6, int i7, float[] fArr, q.b bVar) {
        com.facebook.imagepipeline.common.d dVar = null;
        if (cVar == null) {
            return null;
        }
        TraceEvent.a(0, "LynxImageManager.createImageRequest");
        if (this.G != f.AUTO ? this.G == f.RESIZE : !(!g.d(cVar.a()) && !g.c(cVar.a()))) {
            dVar = new com.facebook.imagepipeline.common.d(i2, i3);
        }
        LinkedList linkedList = new LinkedList();
        if (this.B) {
            linkedList.add(new com.lynx.tasm.ui.image.a.a(cVar.a().toString(), i2, i3, i4, i5, i6, i7, this.J));
        } else {
            linkedList.add(new b(cVar.a().toString(), i2, i3, i4, i5, i6, i7, fArr, bVar, this.C, this.D, this.J));
        }
        com.facebook.imagepipeline.m.b bVar2 = this.f56990e;
        if (bVar2 != null) {
            linkedList.add(bVar2);
        }
        com.facebook.imagepipeline.o.d a2 = k.a(linkedList);
        com.facebook.imagepipeline.o.c a3 = com.facebook.imagepipeline.o.c.a(cVar.a());
        com.lynx.tasm.ui.image.b.b.a(a3);
        a3.f48454k = a2;
        a3.f48447d = dVar;
        a3.a(true).f48451h = this.f56996k;
        com.lynx.tasm.ui.image.a.d a4 = com.lynx.tasm.ui.image.a.d.a(a3, this.f56997l);
        TraceEvent.b(0, "LynxImageManager.createImageRequest");
        return a4;
    }

    /* access modifiers changed from: package-private */
    public static class b extends com.lynx.tasm.ui.image.a.b {
        static {
            Covode.recordClassIndex(35460);
        }

        b(String str, int i2, int i3, int i4, int i5, int i6, int i7, float[] fArr, q.b bVar, String str2, String str3, Bitmap.Config config) {
            super(str, i2, i3, i4, i5, i6, i7, fArr, bVar, str2, str3, config);
        }
    }
}
