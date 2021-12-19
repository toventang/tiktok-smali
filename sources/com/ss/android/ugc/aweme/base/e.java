package com.ss.android.ugc.aweme.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.b.i;
import com.facebook.common.k.g;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.f;
import com.facebook.imagepipeline.o.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f68105a;

    public interface a {
        static {
            Covode.recordClassIndex(41964);
        }

        void a();

        void a(Exception exc);
    }

    static {
        Covode.recordClassIndex(41959);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, d<f> dVar, boolean z) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (remoteImageView.getContext() != null) {
                a(remoteImageView.getContext());
            }
            b[] a2 = a(urlModel, (com.facebook.imagepipeline.common.d) null, (com.facebook.imagepipeline.o.d) null);
            if (a2 != null && a2.length != 0) {
                com.facebook.drawee.a.a.e b2 = c.b();
                b2.f47325m = remoteImageView.getController();
                com.facebook.drawee.a.a.e eVar = (com.facebook.drawee.a.a.e) b2.a(a2);
                eVar.f47322j = z;
                eVar.f47319g = a(dVar);
                remoteImageView.setController(eVar.e());
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, String str, int i2, int i3) {
        a(remoteImageView, str, i2, i3, true);
    }

    public static void a(RemoteImageView remoteImageView, String str) {
        a(remoteImageView, str, -1, -1, false);
    }

    private static void a(RemoteImageView remoteImageView, String str, int i2, int i3, boolean z) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                a(remoteImageView, 2131232324);
                return;
            }
            com.facebook.imagepipeline.common.d dVar = null;
            if (i2 > 0 && i3 > 0) {
                dVar = new com.facebook.imagepipeline.common.d(i2, i3);
            }
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
            if (dVar != null) {
                a2.f48447d = dVar;
            }
            com.facebook.drawee.a.a.e b2 = c.b();
            b2.f47325m = remoteImageView.getController();
            b2.f47315c = (REQUEST) a2.a();
            b2.f47322j = z;
            remoteImageView.setController(b2.e());
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, d<f> dVar) {
        com.facebook.imagepipeline.common.c cVar = com.facebook.imagepipeline.common.c.MEDIUM;
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (remoteImageView.getContext() != null) {
                a(remoteImageView.getContext());
            }
            b[] a2 = a(urlModel, (com.facebook.imagepipeline.common.d) null, cVar, (com.facebook.imagepipeline.o.d) null, Bitmap.Config.RGB_565);
            if (a2 != null && a2.length != 0) {
                com.facebook.drawee.a.a.e b2 = c.b();
                b2.f47325m = remoteImageView.getController();
                com.facebook.drawee.c.b a3 = b2.a(a2);
                a3.f47319g = a(dVar);
                remoteImageView.setController(a3.e());
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3, com.facebook.imagepipeline.o.d dVar, d<f> dVar2) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            com.facebook.imagepipeline.common.d dVar3 = null;
            if (i2 > 0 && i3 > 0) {
                dVar3 = new com.facebook.imagepipeline.common.d(i2, i3);
            }
            if (remoteImageView.getContext() != null) {
                a(remoteImageView.getContext());
            }
            b[] a2 = a(urlModel, dVar3, dVar);
            if (a2 != null && a2.length != 0) {
                com.facebook.drawee.a.a.e b2 = c.b();
                b2.f47325m = remoteImageView.getController();
                com.facebook.drawee.c.b a3 = b2.a(a2);
                a3.f47319g = a(dVar2);
                remoteImageView.setController(a3.e());
            }
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3, com.facebook.imagepipeline.o.d dVar) {
        com.facebook.imagepipeline.common.d dVar2;
        b[] a2;
        if (i2 <= 0 || i3 <= 0) {
            dVar2 = null;
        } else {
            dVar2 = new com.facebook.imagepipeline.common.d(i2, i3);
        }
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0 && (a2 = a(urlModel, dVar2, dVar)) != null && a2.length != 0) {
            com.facebook.drawee.a.a.e b2 = c.b();
            b2.f47325m = remoteImageView.getController();
            remoteImageView.setController(b2.a(a2).e());
        }
    }

    public static void a(RemoteImageView remoteImageView, com.ss.android.ugc.aweme.base.model.a aVar) {
        int i2 = AnonymousClass4.f68113a[aVar.f68152a.ordinal()];
        if (i2 == 1) {
            a(remoteImageView, aVar.a());
        } else if (i2 == 2) {
            a(remoteImageView, (UrlModel) aVar.f68153b);
        } else if (i2 == 3) {
            b(remoteImageView, (String) aVar.f68153b, -1, -1);
        }
    }

    private static void a(RemoteImageView remoteImageView, String str, int i2, int i3, Bitmap.Config config) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                a(remoteImageView, 2131232324);
                return;
            }
            com.facebook.imagepipeline.common.d dVar = null;
            if (i2 > 0 && i3 > 0) {
                dVar = new com.facebook.imagepipeline.common.d(i2, i3);
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
            com.facebook.drawee.a.a.e b2 = c.b();
            b2.f47325m = remoteImageView.getController();
            b2.f47315c = (REQUEST) a2.a();
            remoteImageView.setController(b2.e());
        }
    }

    public static b[] a(UrlModel urlModel, com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.o.d dVar2) {
        return a(urlModel, dVar, com.facebook.imagepipeline.common.c.MEDIUM, dVar2, Bitmap.Config.RGB_565);
    }

    public static b[] a(UrlModel urlModel, Bitmap.Config config) {
        return a(urlModel, (com.facebook.imagepipeline.common.d) null, com.facebook.imagepipeline.common.c.MEDIUM, (com.facebook.imagepipeline.o.d) null, config);
    }

    private static b[] a(UrlModel urlModel, com.facebook.imagepipeline.common.d dVar, com.facebook.imagepipeline.common.c cVar, com.facebook.imagepipeline.o.d dVar2, Bitmap.Config config) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new b[0];
        }
        ArrayList arrayList = new ArrayList();
        h hVar = null;
        if (!f68105a) {
            hVar = new h();
        }
        for (String str : urlModel.getUrlList()) {
            if (!m.a(str)) {
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
                if (hVar != null) {
                    hVar.a(a2);
                }
                arrayList.add(a2.a());
            }
        }
        if (arrayList.size() == 0) {
            return new b[0];
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return k.a().d().d(j.a().a(b.fromUri(uri)));
    }

    public static boolean a(h hVar, b[] bVarArr, int i2, com.facebook.d.e<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> eVar) {
        if (i2 >= bVarArr.length) {
            return false;
        }
        hVar.a(bVarArr[i2], (Object) null).a(eVar, i.b());
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.e$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f68113a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 41963(0xa3eb, float:5.8803E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.base.model.a$a[] r0 = com.ss.android.ugc.aweme.base.model.a.EnumC1542a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.base.e.AnonymousClass4.f68113a = r2
                com.ss.android.ugc.aweme.base.model.a$a r0 = com.ss.android.ugc.aweme.base.model.a.EnumC1542a.RES_ID     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.base.e.AnonymousClass4.f68113a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.base.model.a$a r0 = com.ss.android.ugc.aweme.base.model.a.EnumC1542a.URL_MODEL     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.base.e.AnonymousClass4.f68113a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.base.model.a$a r0 = com.ss.android.ugc.aweme.base.model.a.EnumC1542a.URL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.e.AnonymousClass4.<clinit>():void");
        }
    }

    public static d<f> a(final d<f> dVar) {
        return new d<f>() {
            /* class com.ss.android.ugc.aweme.base.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41960);
            }

            @Override // com.facebook.drawee.c.d
            public final void onRelease(String str) {
                d dVar = dVar;
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }

            @Override // com.facebook.drawee.c.d
            public final void onFailure(String str, Throwable th) {
                d dVar = dVar;
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }

            @Override // com.facebook.drawee.c.d
            public final void onIntermediateImageFailed(String str, Throwable th) {
                d dVar = dVar;
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.c.d
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
                d dVar = dVar;
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, fVar);
                }
            }

            @Override // com.facebook.drawee.c.d
            public final void onSubmit(String str, Object obj) {
                d dVar = dVar;
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d
            public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                d dVar = dVar;
                if (dVar != null) {
                    dVar.onFinalImageSet(str, fVar, animatable);
                }
            }
        };
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static String a(UrlModel urlModel) {
        if (urlModel != null) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    List<String> urlList = urlModel.getUrlList();
                    if (urlList != null && !urlList.isEmpty()) {
                        int size = urlList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (a(Uri.parse(urlList.get(i2)))) {
                                return urlList.get(i2);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static void b(String str) {
        if (str != null && !str.isEmpty() && !a(Uri.parse(str))) {
            k.a().e().d(b.fromUri(str), null);
        }
    }

    public static String a(String str) {
        com.facebook.b.a a2;
        File file;
        if (str == null || str.isEmpty()) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (!a(parse) || (a2 = k.a().d().a(j.a().a(b.fromUri(parse)))) == null || (file = ((com.facebook.b.b) a2).f46951a) == null) {
            return "";
        }
        return file.getAbsolutePath();
    }

    public static void a(UrlModel urlModel, final a aVar) {
        final b[] a2 = a(urlModel, (com.facebook.imagepipeline.common.d) null, (com.facebook.imagepipeline.o.d) null);
        final h e2 = k.a().e();
        a(e2, a2, 0, new com.facebook.d.b<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>>() {
            /* class com.ss.android.ugc.aweme.base.e.AnonymousClass3 */

            /* renamed from: d  reason: collision with root package name */
            private int f68112d = 1;

            static {
                Covode.recordClassIndex(41962);
            }

            @Override // com.facebook.d.b
            public final void onNewResultImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                aVar.a();
            }

            @Override // com.facebook.d.b
            public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                Throwable e2 = cVar.e();
                h hVar = e2;
                b[] bVarArr = a2;
                int i2 = this.f68112d;
                this.f68112d = i2 + 1;
                if (!e.a(hVar, bVarArr, i2, this)) {
                    aVar.a(new RuntimeException(e2));
                }
            }
        });
    }

    public static void a(RemoteImageView remoteImageView, int i2) {
        if (remoteImageView != null) {
            remoteImageView.setImageURI(com.facebook.imagepipeline.o.c.a(g.a(i2)).a().mSourceUri);
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel) {
        a(remoteImageView, urlModel, -1, -1, (com.facebook.imagepipeline.o.d) null);
    }

    public static void b(RemoteImageView remoteImageView, String str, int i2, int i3) {
        a(remoteImageView, str, i2, i3, Bitmap.Config.ARGB_8888);
    }

    public static void a(UrlModel urlModel, int i2, int i3, final com.ss.android.ugc.aweme.base.e.a.a<Bitmap> aVar) {
        com.facebook.imagepipeline.common.d dVar;
        h e2 = k.a().e();
        if (i2 <= 0 || i3 <= 0) {
            dVar = null;
        } else {
            dVar = new com.facebook.imagepipeline.common.d(i2, i3);
        }
        b[] a2 = a(urlModel, dVar, (com.facebook.imagepipeline.o.d) null);
        if (a2.length != 0) {
            final com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a3 = e2.a(a2[0], (Object) null);
            a3.a(new com.facebook.imagepipeline.f.b() {
                /* class com.ss.android.ugc.aweme.base.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(41961);
                }

                @Override // com.facebook.d.b
                public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    if (cVar != null) {
                        cVar.g();
                    }
                    aVar.a(null);
                }

                @Override // com.facebook.imagepipeline.f.b
                public final void a(Bitmap bitmap) {
                    MethodCollector.i(2263);
                    if (!a3.b() || bitmap == null) {
                        aVar.a(null);
                        MethodCollector.o(2263);
                        return;
                    }
                    aVar.a(Bitmap.createBitmap(bitmap));
                    a3.g();
                    MethodCollector.o(2263);
                }
            }, com.facebook.common.b.a.f47054a);
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3) {
        a(remoteImageView, urlModel, i2, i3, (com.facebook.imagepipeline.o.d) null);
    }
}
