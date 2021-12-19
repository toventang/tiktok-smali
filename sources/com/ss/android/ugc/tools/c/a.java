package com.ss.android.ugc.tools.c;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.b.i;
import com.facebook.common.k.g;
import com.facebook.d.c;
import com.facebook.d.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class a {

    public interface b {
        static {
            Covode.recordClassIndex(98226);
        }

        void a(c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar);

        void a(Exception exc);
    }

    static {
        Covode.recordClassIndex(98222);
    }

    public static void a(SimpleDraweeView simpleDraweeView, String str, int i2, int i3, Bitmap.Config config) {
        b(simpleDraweeView, str, i2, i3, config);
    }

    public static void a(UrlModel urlModel, int i2, int i3, final androidx.core.g.a<Bitmap> aVar) {
        h e2 = k.a().e();
        com.facebook.imagepipeline.o.b[] a2 = a(urlModel, (i2 <= 0 || i3 <= 0) ? null : new d(i2, i3), (com.facebook.imagepipeline.o.d) null);
        if (a2.length != 0) {
            final c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a3 = e2.a(a2[0], (Object) null);
            a3.a(new com.facebook.imagepipeline.f.b() {
                /* class com.ss.android.ugc.tools.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(98223);
                }

                @Override // com.facebook.d.b
                public final void onFailureImpl(c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    if (cVar != null) {
                        cVar.g();
                    }
                    aVar.a(null);
                }

                @Override // com.facebook.imagepipeline.f.b
                public final void a(Bitmap bitmap) {
                    MethodCollector.i(4818);
                    if (!a3.b() || bitmap == null) {
                        aVar.a(null);
                        MethodCollector.o(4818);
                        return;
                    }
                    aVar.a(Bitmap.createBitmap(bitmap));
                    a3.g();
                    MethodCollector.o(4818);
                }
            }, com.facebook.common.b.a.f47054a);
        }
    }

    public static com.facebook.imagepipeline.o.b[] a(UrlModel urlModel, d dVar, com.facebook.imagepipeline.o.d dVar2) {
        return a(urlModel, dVar, com.facebook.imagepipeline.common.c.MEDIUM, dVar2, Bitmap.Config.RGB_565);
    }

    public static com.facebook.imagepipeline.o.b[] a(UrlModel urlModel, d dVar, com.facebook.imagepipeline.common.c cVar, com.facebook.imagepipeline.o.d dVar2, Bitmap.Config config) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlModel.getUrlList()) {
            if (!TextUtils.isEmpty(str)) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                imageDecodeOptionsBuilder.a(1);
                imageDecodeOptionsBuilder.f47724e = false;
                com.facebook.imagepipeline.common.b bVar = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
                com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
                a2.f48453j = cVar;
                a2.f48449f = bVar;
                if (dVar2 != null) {
                    a2.f48454k = dVar2;
                }
                if (dVar != null) {
                    a2.f48447d = dVar;
                }
                arrayList.add(a2.a());
            }
        }
        if (arrayList.size() == 0) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        return (com.facebook.imagepipeline.o.b[]) arrayList.toArray(new com.facebook.imagepipeline.o.b[arrayList.size()]);
    }

    public static boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return k.a().d().d(j.a().a(com.facebook.imagepipeline.o.b.fromUri(uri)));
    }

    public static void a(UrlModel urlModel, final b bVar) {
        final com.facebook.imagepipeline.o.b[] a2 = a(urlModel, (d) null, (com.facebook.imagepipeline.o.d) null);
        final h e2 = k.a().e();
        a(e2, a2, 0, new com.facebook.d.b<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>>() {
            /* class com.ss.android.ugc.tools.c.a.AnonymousClass2 */

            /* renamed from: d  reason: collision with root package name */
            private int f149158d = 1;

            static {
                Covode.recordClassIndex(98224);
            }

            @Override // com.facebook.d.b
            public final void onNewResultImpl(c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                bVar.a(cVar);
            }

            @Override // com.facebook.d.b
            public final void onFailureImpl(c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                Throwable e2 = cVar.e();
                h hVar = e2;
                com.facebook.imagepipeline.o.b[] bVarArr = a2;
                int i2 = this.f149158d;
                this.f149158d = i2 + 1;
                if (!a.a(hVar, bVarArr, i2, this)) {
                    bVar.a(new RuntimeException(e2));
                }
            }
        });
    }

    public static boolean a(h hVar, com.facebook.imagepipeline.o.b[] bVarArr, int i2, e<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> eVar) {
        if (i2 >= bVarArr.length) {
            return false;
        }
        hVar.a(bVarArr[i2], (Object) null).a(eVar, i.b());
        return true;
    }

    /* renamed from: com.ss.android.ugc.tools.c.a$a  reason: collision with other inner class name */
    public static class C4027a extends com.facebook.drawee.c.c<f> {

        /* renamed from: a  reason: collision with root package name */
        private final View f149159a;

        static {
            Covode.recordClassIndex(98225);
        }

        public C4027a(View view) {
            this.f149159a = view;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            f fVar2 = fVar;
            if (fVar2 != null) {
                int width = fVar2.getWidth();
                int height = fVar2.getHeight();
                if (height > 0) {
                    ViewGroup.LayoutParams layoutParams = this.f149159a.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f149159a.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public static void b(SimpleDraweeView simpleDraweeView, String str) {
        c(simpleDraweeView, str, -1, -1);
    }

    public static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        a(simpleDraweeView, urlModel, -1, -1);
    }

    public static void a(SimpleDraweeView simpleDraweeView, int i2) {
        if (simpleDraweeView != null) {
            simpleDraweeView.setImageURI(com.facebook.imagepipeline.o.c.a(g.a(i2)).a().mSourceUri);
        }
    }

    public static void b(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        a(simpleDraweeView, urlModel, new c(null, new C4027a(simpleDraweeView)));
    }

    public static void a(SimpleDraweeView simpleDraweeView, String str) {
        a(simpleDraweeView, str, -1, -1);
    }

    private static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, com.facebook.drawee.c.d<f> dVar) {
        a(simpleDraweeView, urlModel, Bitmap.Config.RGB_565, false, dVar);
    }

    public static void b(SimpleDraweeView simpleDraweeView, String str, int i2, int i3) {
        c(simpleDraweeView, str, i2, i3);
    }

    public static void a(SimpleDraweeView simpleDraweeView, Uri uri, int i2, int i3) {
        a(simpleDraweeView, uri, i2, i3, Bitmap.Config.RGB_565);
    }

    public static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, int i2, int i3) {
        d dVar;
        if (i2 <= 0 || i3 <= 0) {
            dVar = null;
        } else {
            dVar = new d(i2, i3);
        }
        a(simpleDraweeView, urlModel, dVar, (com.facebook.imagepipeline.o.d) null);
    }

    private static void c(SimpleDraweeView simpleDraweeView, String str, int i2, int i3) {
        if (simpleDraweeView != null && !TextUtils.isEmpty(str)) {
            d dVar = null;
            if (i2 > 0 && i3 > 0) {
                dVar = new d(i2, i3);
            }
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
            if (dVar != null) {
                a2.f48447d = dVar;
            }
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = simpleDraweeView.getController();
            b2.f47315c = (REQUEST) a2.a();
            b2.f47322j = true;
            simpleDraweeView.setController(b2.e());
        }
    }

    private static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, d dVar, com.facebook.imagepipeline.o.d dVar2) {
        com.facebook.imagepipeline.o.b[] a2;
        if (simpleDraweeView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0 && (a2 = a(urlModel, dVar, (com.facebook.imagepipeline.o.d) null)) != null && a2.length != 0) {
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = simpleDraweeView.getController();
            simpleDraweeView.setController(b2.a(a2).e());
        }
    }

    public static void a(SimpleDraweeView simpleDraweeView, String str, int i2, int i3) {
        a(simpleDraweeView, str, i2, i3, Bitmap.Config.ARGB_8888);
    }

    private static void a(SimpleDraweeView simpleDraweeView, Uri uri, int i2, int i3, Bitmap.Config config) {
        b(simpleDraweeView, uri, i2, i3, config);
    }

    private static void b(SimpleDraweeView simpleDraweeView, Uri uri, int i2, int i3, Bitmap.Config config) {
        if (simpleDraweeView != null && uri != null) {
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(uri);
            if (i2 > 0 && i3 > 0) {
                a2.f48447d = new d(i2, i3);
            }
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                a2.f48449f = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
            }
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = simpleDraweeView.getController();
            b2.f47315c = (REQUEST) a2.a();
            simpleDraweeView.setController(b2.e());
        }
    }

    public static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, Bitmap.Config config, boolean z, com.facebook.drawee.c.d<f> dVar) {
        com.facebook.imagepipeline.o.b[] a2;
        if (simpleDraweeView != null && urlModel != null && simpleDraweeView.getContext() != null && (a2 = a(urlModel, (d) null, com.facebook.imagepipeline.common.c.MEDIUM, (com.facebook.imagepipeline.o.d) null, config)) != null && a2.length > 0) {
            simpleDraweeView.getContext();
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = simpleDraweeView.getController();
            com.facebook.drawee.a.a.e eVar = (com.facebook.drawee.a.a.e) b2.a(a2);
            eVar.f47322j = z;
            eVar.f47319g = new c(null, dVar);
            simpleDraweeView.setController(eVar.e());
        }
    }

    private static void b(SimpleDraweeView simpleDraweeView, String str, int i2, int i3, Bitmap.Config config) {
        d dVar;
        if (simpleDraweeView != null) {
            if (TextUtils.isEmpty(str)) {
                a(simpleDraweeView, (int) R.drawable.bmx);
                return;
            }
            if (i2 <= 0 || i3 <= 0) {
                dVar = null;
            } else {
                dVar = new d(i2, i3);
            }
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
            if (dVar != null) {
                a2.f48447d = dVar;
            }
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                a2.f48449f = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
            }
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = simpleDraweeView.getController();
            b2.f47319g = null;
            b2.f47315c = (REQUEST) a2.a();
            simpleDraweeView.setController(b2.e());
        }
    }
}
