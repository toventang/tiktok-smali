package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c;
import com.bytedance.lighten.a.c.l;
import com.bytedance.lighten.a.c.n;
import com.bytedance.lighten.a.d.a;
import com.bytedance.lighten.a.d.b;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.i;
import com.bytedance.lighten.a.u;
import com.bytedance.lighten.loader.a;
import com.bytedance.lighten.loader.k;
import com.bytedance.lighten.loader.m;
import com.bytedance.lighten.loader.s;
import com.facebook.d.f;
import com.facebook.drawee.e.p;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.e;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.o.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public final class q implements i {

    /* renamed from: a  reason: collision with root package name */
    public c f39998a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f39999b;

    static {
        Covode.recordClassIndex(24662);
    }

    private static d e(u uVar) {
        return new d(uVar.f39900i, uVar.f39901j);
    }

    @Override // com.bytedance.lighten.a.i
    public final void trimDisk(final int i2) {
        this.f39999b.submit(new Runnable() {
            /* class com.bytedance.lighten.loader.q.AnonymousClass3 */

            static {
                Covode.recordClassIndex(24665);
            }

            public final void run() {
                com.a.a("before trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(k.a().d().b()), Long.valueOf(k.a().d().a() / 1024), Long.valueOf(k.a().h().b()), Long.valueOf(k.a().h().a() / 1024)});
                int i2 = i2;
                if (i2 == 1) {
                    k.a().d().d();
                    k.a().h().d();
                } else if (i2 == 2) {
                    k.a().d().e();
                    k.a().h().e();
                }
                com.a.a("after trim, main-disk picture_count:%d, picture_size:%dkb, small-disk picture_count:%d, picture_size:%dkb", new Object[]{Long.valueOf(k.a().d().b()), Long.valueOf(k.a().d().a() / 1024), Long.valueOf(k.a().h().b()), Long.valueOf(k.a().h().a() / 1024)});
            }
        });
    }

    class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        public l f40021a;

        /* renamed from: c  reason: collision with root package name */
        private u f40023c;

        static {
            Covode.recordClassIndex(24672);
        }

        @Override // com.bytedance.lighten.loader.m.b
        public final void a(final File file) {
            u uVar;
            if (this.f40021a != null && (uVar = this.f40023c) != null) {
                q.a(uVar).execute(new Runnable() {
                    /* class com.bytedance.lighten.loader.q.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(24673);
                    }

                    public final void run() {
                        a.this.f40021a.a();
                    }
                });
            }
        }

        public a(u uVar, l lVar) {
            this.f40021a = lVar;
            this.f40023c = uVar;
        }
    }

    q(c cVar) {
        this.f39998a = cVar;
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
        a2.f79173b = "fresco-loader-io";
        a2.f79174c = 2;
        this.f39999b = g.a(a2.a());
    }

    public static Executor a(u uVar) {
        b bVar = b.a.f39818a;
        if (uVar.B != null) {
            return uVar.B;
        }
        return bVar;
    }

    private static com.facebook.imagepipeline.common.c h(u uVar) {
        com.bytedance.lighten.a.q qVar = uVar.z;
        if (qVar == com.bytedance.lighten.a.q.LOW) {
            return com.facebook.imagepipeline.common.c.LOW;
        }
        if (qVar == com.bytedance.lighten.a.q.HIGH) {
            return com.facebook.imagepipeline.common.c.HIGH;
        }
        return com.facebook.imagepipeline.common.c.MEDIUM;
    }

    private static List<String> i(u uVar) {
        if (uVar.N == null || uVar.N.a()) {
            return Collections.emptyList();
        }
        return uVar.N.f39811a;
    }

    static com.facebook.imagepipeline.o.b[] b(u uVar) {
        List<String> i2 = i(uVar);
        ArrayList arrayList = new ArrayList();
        for (String str : i2) {
            arrayList.add(b(uVar, Uri.parse(str)).a());
        }
        if (arrayList.size() == 0) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        return (com.facebook.imagepipeline.o.b[]) arrayList.toArray(new com.facebook.imagepipeline.o.b[arrayList.size()]);
    }

    private static void c(u uVar) {
        com.facebook.drawee.view.c cVar;
        e eVar;
        if (uVar.v != null && (cVar = (com.facebook.drawee.view.c) uVar.D) != null) {
            com.bytedance.lighten.a.e eVar2 = uVar.v;
            if (((com.facebook.drawee.f.a) cVar.getHierarchy()).f47454a != null) {
                eVar = ((com.facebook.drawee.f.a) cVar.getHierarchy()).f47454a;
            } else {
                eVar = new e();
            }
            ((com.facebook.drawee.f.a) cVar.getHierarchy()).a(a(eVar, eVar2));
        }
    }

    private static void f(u uVar) {
        com.facebook.drawee.view.c cVar;
        if (!uVar.I && (cVar = (com.facebook.drawee.view.c) uVar.D) != null) {
            Drawable drawable = uVar.s;
            if (drawable == null) {
                ((com.facebook.drawee.f.a) cVar.getHierarchy()).a(0, (Drawable) null);
            } else {
                ((com.facebook.drawee.f.a) cVar.getHierarchy()).a(0, new p(drawable, q.b.f47442h));
            }
        }
    }

    @Override // com.bytedance.lighten.a.i
    public final void trimMemory(int i2) {
        if (i2 == 5) {
            s.a.f40036a.a(com.facebook.common.g.b.OnSystemLowMemoryWhileAppInForeground);
            a.C0978a.f39959a.a();
        } else if (i2 == 10) {
            s.a.f40036a.a(com.facebook.common.g.b.OnCloseToDalvikHeapLimit);
            a.C0978a.f39959a.a();
        } else if (i2 == 40) {
            s.a.f40036a.a(com.facebook.common.g.b.OnSystemLowMemoryWhileAppInBackground);
        }
    }

    private static com.facebook.imagepipeline.common.b d(u uVar) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        if (uVar.t != null) {
            imageDecodeOptionsBuilder.setBitmapConfig(uVar.t);
        }
        imageDecodeOptionsBuilder.f47724e = uVar.f39897f;
        if (uVar.f39898g >= 0) {
            imageDecodeOptionsBuilder.a(uVar.f39898g);
        }
        if (uVar.f39895d != com.bytedance.lighten.a.a.f39807a.f39808b) {
            HashMap hashMap = new HashMap();
            hashMap.put("frame_scheduler_id", Integer.valueOf(uVar.f39895d));
            if (uVar.O != null) {
                hashMap.put("frame_scheduler_listener", uVar.O);
            }
            imageDecodeOptionsBuilder.f47730k = hashMap;
        }
        return imageDecodeOptionsBuilder.a();
    }

    @Override // com.bytedance.lighten.a.i
    public final void download(final u uVar) {
        final Uri parse;
        List<String> i2 = i(uVar);
        if (i2.isEmpty()) {
            parse = uVar.f39892a;
        } else {
            parse = Uri.parse(i2.get(0));
        }
        final com.bytedance.lighten.a.c.l lVar = uVar.G;
        if (!this.f39998a.c(parse)) {
            com.facebook.imagepipeline.o.b fromUri = com.facebook.imagepipeline.o.b.fromUri(parse);
            h e2 = k.a().e();
            if (lVar == null) {
                e2.d(fromUri, null);
            } else {
                e2.d(fromUri, null).a(new com.facebook.d.b<Void>() {
                    /* class com.bytedance.lighten.loader.q.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(24664);
                    }

                    @Override // com.facebook.d.b
                    public final void onFailureImpl(com.facebook.d.c<Void> cVar) {
                        Thread.currentThread();
                        cVar.e();
                        com.bytedance.lighten.a.c.l lVar = lVar;
                        cVar.e();
                        lVar.b();
                    }

                    @Override // com.facebook.d.b
                    public final void onNewResultImpl(com.facebook.d.c<Void> cVar) {
                        if (cVar.b()) {
                            File b2 = q.this.f39998a.b(parse);
                            Thread.currentThread();
                            if (b2 != null) {
                                lVar.a();
                                return;
                            }
                            com.facebook.c.a.e a2 = j.a().a(com.facebook.imagepipeline.o.b.fromUri(parse));
                            m mVar = m.a.f39990a;
                            a aVar = new a(uVar, lVar);
                            List<SoftReference<m.b>> list = mVar.f39987a.get(a2);
                            if (list == null) {
                                list = new LinkedList<>();
                                mVar.f39987a.put(a2, list);
                            }
                            list.add(new SoftReference<>(aVar));
                        }
                    }
                }, a(uVar));
            }
        } else if (lVar != null) {
            a(uVar).execute(new Runnable() {
                /* class com.bytedance.lighten.loader.q.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(24663);
                }

                public final void run() {
                    q.this.f39998a.b(parse);
                    Thread.currentThread();
                    lVar.a();
                }
            });
        }
    }

    @Override // com.bytedance.lighten.a.i
    public final void loadBitmap(u uVar) {
        if (uVar.N == null || uVar.N.a()) {
            a(k.a().e().a(a(uVar, uVar.f39892a), (Object) null), uVar);
            return;
        }
        com.facebook.imagepipeline.o.b[] b2 = b(uVar);
        if (b2.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (com.facebook.imagepipeline.o.b bVar : b2) {
                if (bVar != null) {
                    arrayList.add(k.a().e().a(bVar, b.EnumC1183b.FULL_FETCH));
                }
            }
            if (!arrayList.isEmpty()) {
                a(f.a(arrayList).b(), uVar);
            }
        }
    }

    private static void g(u uVar) {
        com.facebook.drawee.view.c cVar = (com.facebook.drawee.view.c) uVar.D;
        if (cVar != null) {
            if (uVar.n > 0) {
                if (uVar.p != null) {
                    ((com.facebook.drawee.f.a) cVar.getHierarchy()).a(uVar.n, x.a(uVar.p));
                } else {
                    ((com.facebook.drawee.f.a) cVar.getHierarchy()).c(uVar.n);
                }
            } else if (uVar.o != null) {
                ((com.facebook.drawee.f.a) cVar.getHierarchy()).a(1, uVar.o);
            }
            if (uVar.q > 0) {
                if (uVar.r != null) {
                    ((com.facebook.drawee.f.a) cVar.getHierarchy()).b(uVar.q, x.a(uVar.r));
                } else {
                    ((com.facebook.drawee.f.a) cVar.getHierarchy()).d(uVar.q);
                }
            }
            if (uVar.u != null) {
                ((com.facebook.drawee.f.a) cVar.getHierarchy()).a(x.a(uVar.u));
            }
            if (uVar.L > 0) {
                if (uVar.M != null) {
                    ((com.facebook.drawee.f.a) cVar.getHierarchy()).c(uVar.L, x.a(uVar.M));
                } else {
                    ((com.facebook.drawee.f.a) cVar.getHierarchy()).e(uVar.L);
                }
            }
            if (uVar.f39904m >= 0) {
                ((com.facebook.drawee.f.a) cVar.getHierarchy()).b(uVar.f39904m);
            }
        }
    }

    @Override // com.bytedance.lighten.a.i
    public final void display(u uVar) {
        Object obj;
        com.facebook.drawee.view.b bVar;
        com.facebook.imagepipeline.o.b[] bVarArr;
        com.facebook.imagepipeline.o.b[] bVarArr2;
        boolean z;
        if (uVar.D instanceof SmartCircleImageView) {
            ((SmartImageView) uVar.D).a(uVar);
        } else if (uVar.D instanceof SmartImageView) {
            ((SmartImageView) uVar.D).a(uVar);
        } else if (uVar.E != null) {
            ImageView imageView = uVar.E;
            if (imageView != null) {
                Object tag = imageView.getTag();
                if (!(tag instanceof a.C0977a) || (obj = ((a.C0977a) tag).get("DraweeHolder")) == null) {
                    obj = null;
                }
                if (obj instanceof com.facebook.drawee.view.b) {
                    bVar = (com.facebook.drawee.view.b) obj;
                } else {
                    bVar = null;
                }
                c cVar = new c();
                cVar.a(uVar);
                boolean z2 = true;
                if (bVar == null) {
                    imageView.getContext();
                    bVar = com.facebook.drawee.view.b.a((com.facebook.drawee.h.b) null);
                    k.a aVar = new k.a(bVar);
                    bVar.b(k.a(imageView, uVar));
                    if (uVar.N != null && !uVar.N.a()) {
                        bVarArr2 = b(uVar);
                        if (bVarArr2 == null) {
                            return;
                        }
                    } else if (uVar.f39892a != null) {
                        bVarArr2 = new com.facebook.imagepipeline.o.b[]{a(uVar, uVar.f39892a)};
                    } else {
                        return;
                    }
                    if (bVarArr2.length != 0) {
                        com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
                        b2.f47322j = uVar.f39894c;
                        b2.f47319g = cVar;
                        b2.f47325m = bVar.f47495b;
                        com.facebook.drawee.a.a.e eVar = (com.facebook.drawee.a.a.e) b2.a(bVarArr2);
                        eVar.f47323k = false;
                        if (uVar.L > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        eVar.f47321i = z;
                        bVar.a(eVar.e());
                        int i2 = Build.VERSION.SDK_INT;
                        if (imageView.isAttachedToWindow()) {
                            aVar.onViewAttachedToWindow(imageView);
                        }
                        imageView.addOnAttachStateChangeListener(aVar);
                        imageView.setOnTouchListener(aVar);
                        Object tag2 = imageView.getTag();
                        if (tag2 instanceof a.C0977a) {
                            ((a.C0977a) tag2).put("DraweeHolder", bVar);
                        } else {
                            imageView.setTag(new a.C0977a("DraweeHolder", bVar, (byte) 0));
                        }
                    } else {
                        return;
                    }
                } else {
                    bVar.c();
                    bVar.b(k.a(imageView, uVar));
                    if (uVar.N != null && !uVar.N.a()) {
                        bVarArr = b(uVar);
                        if (bVarArr == null) {
                            return;
                        }
                    } else if (uVar.f39892a != null) {
                        bVarArr = new com.facebook.imagepipeline.o.b[]{a(uVar, uVar.f39892a)};
                    } else {
                        return;
                    }
                    if (bVarArr.length != 0) {
                        com.facebook.drawee.a.a.e b3 = com.facebook.drawee.a.a.c.b();
                        b3.f47322j = uVar.f39894c;
                        b3.f47319g = cVar;
                        com.facebook.drawee.a.a.e eVar2 = (com.facebook.drawee.a.a.e) b3.a(bVarArr);
                        eVar2.f47325m = bVar.f47495b;
                        eVar2.f47323k = false;
                        if (uVar.L <= 0) {
                            z2 = false;
                        }
                        eVar2.f47321i = z2;
                        bVar.a(eVar2.e());
                        bVar.b();
                    } else {
                        return;
                    }
                }
                imageView.setImageDrawable(bVar.f());
            }
        } else {
            throw new IllegalArgumentException("Lighten:needs SmartImageView or ImageView to display, use with(view)");
        }
    }

    static com.facebook.imagepipeline.o.b a(u uVar, Uri uri) {
        return b(uVar, uri).a();
    }

    private static void b(com.facebook.imagepipeline.o.c cVar, u uVar) {
        if (uVar.x != null) {
            cVar.f48454k = new d(uVar.x);
        }
    }

    private static void c(com.facebook.imagepipeline.o.c cVar, u uVar) {
        com.bytedance.lighten.a.b bVar = uVar.w;
        if (bVar != null) {
            cVar.f48454k = new com.facebook.imagepipeline.m.a(bVar.f39812a, uVar.f39893b, bVar.f39815d);
        }
    }

    private void a(final com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar, final u uVar) {
        final n nVar = uVar.H;
        if (nVar != null) {
            cVar.a(new com.facebook.imagepipeline.f.b() {
                /* class com.bytedance.lighten.loader.q.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(24666);
                }

                @Override // com.facebook.d.e, com.facebook.d.b
                public final void onCancellation(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    if (cVar != null) {
                        cVar.g();
                        q.a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.q.AnonymousClass4.AnonymousClass5 */

                            static {
                                Covode.recordClassIndex(24671);
                            }

                            public final void run() {
                                Thread.currentThread();
                                nVar.a();
                            }
                        });
                    }
                }

                @Override // com.facebook.d.b
                public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    if (cVar != null) {
                        final Throwable e2 = cVar.e();
                        q.a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.q.AnonymousClass4.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(24669);
                            }

                            public final void run() {
                                Thread.currentThread();
                                nVar.a(e2);
                            }
                        });
                    }
                }

                @Override // com.facebook.d.e, com.facebook.d.b
                public final void onProgressUpdate(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    if (cVar != null) {
                        final float f2 = cVar.f();
                        q.a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.q.AnonymousClass4.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(24670);
                            }

                            public final void run() {
                                Thread.currentThread();
                            }
                        });
                    }
                }

                @Override // com.facebook.imagepipeline.f.b
                public final void a(Bitmap bitmap) {
                    MethodCollector.i(12327);
                    if (!cVar.b() || bitmap == null) {
                        q.a(uVar).execute(new Runnable() {
                            /* class com.bytedance.lighten.loader.q.AnonymousClass4.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(24668);
                            }

                            public final void run() {
                                Thread.currentThread();
                                cVar.e();
                                nVar.a(cVar.e());
                            }
                        });
                        MethodCollector.o(12327);
                        return;
                    }
                    Bitmap.Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    final Bitmap copy = bitmap.copy(config, true);
                    cVar.g();
                    q.a(uVar).execute(new Runnable() {
                        /* class com.bytedance.lighten.loader.q.AnonymousClass4.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(24667);
                        }

                        public final void run() {
                            Thread.currentThread();
                            nVar.a(copy);
                        }
                    });
                    MethodCollector.o(12327);
                }
            }, this.f39999b);
        }
    }

    static e a(e eVar, com.bytedance.lighten.a.e eVar2) {
        if (eVar2 == null) {
            return eVar;
        }
        if (eVar == null) {
            eVar = new e();
        }
        if (eVar2.f39825g != null) {
            e.b bVar = eVar2.f39825g;
            eVar.a(bVar.f39835a, bVar.f39836b, bVar.f39837c, bVar.f39838d);
        } else if (eVar2.f39823e > 0.0f) {
            eVar.a(eVar2.f39823e);
        }
        eVar.f47476b = eVar2.f39822d;
        eVar.c(eVar2.f39819a);
        eVar.f47480f = eVar2.f39820b;
        eVar.a(eVar2.f39821c);
        eVar.d(eVar2.f39824f);
        eVar.f47475a = z.a(eVar2.f39826h);
        return eVar;
    }

    private static com.facebook.imagepipeline.o.c b(u uVar, Uri uri) {
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(uri);
        a2.f48451h = uVar.f39899h;
        com.facebook.imagepipeline.o.c a3 = a2.a(uVar.f39896e);
        if (uVar.C == com.bytedance.lighten.a.d.SMALL) {
            a3.f48450g = b.a.SMALL;
        }
        b(a3, uVar);
        a(a3, uVar);
        c(a3, uVar);
        c(uVar);
        com.facebook.imagepipeline.common.c h2 = h(uVar);
        a3.f48449f = d(uVar);
        a3.f48453j = h2;
        a3.a(uVar.f39896e);
        if (uVar.f39900i > 0 || uVar.f39901j > 0) {
            a3.f48447d = e(uVar);
        }
        a3.f48456m = uVar.K;
        f(uVar);
        g(uVar);
        return a3;
    }

    private static void a(com.facebook.imagepipeline.o.c cVar, u uVar) {
        if (uVar.y != null && uVar.y.f39919a != null && !uVar.y.f39919a.isEmpty()) {
            cVar.f48454k = new g(uVar.y.f39919a.get(0));
        }
    }
}
