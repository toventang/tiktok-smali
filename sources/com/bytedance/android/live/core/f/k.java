package com.bytedance.android.live.core.f;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.EnableImageDefault565Setting;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TTliveAudienceDeviceRatingLowSetting;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.h;
import com.facebook.common.k.g;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.e.q;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.j.f;
import com.facebook.imagepipeline.o.c;
import com.facebook.imagepipeline.o.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f9082a = new Handler(Looper.getMainLooper());

    public static void a(HSImageView hSImageView, String str, String str2) {
        if (hSImageView != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            b(hSImageView, HSAnimImageView.b(str, str2));
        }
    }

    public static void a(HSImageView hSImageView, String str) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            hSImageView.setImageURI(c.a(Uri.parse(str)).a().mSourceUri);
        }
    }

    public static void a(HSImageView hSImageView, String str, d dVar) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            c a2 = c.a(Uri.parse(str));
            a2.f48454k = dVar;
            com.facebook.imagepipeline.o.b a3 = a2.a();
            e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = hSImageView.getController();
            com.facebook.drawee.c.b a4 = b2.a(new com.facebook.imagepipeline.o.b[]{a3});
            hSImageView.setImageURI(a3.mSourceUri);
            hSImageView.setController(a4.e());
        }
    }

    public static void a(HSImageView hSImageView, ImageModel imageModel, d dVar) {
        a(hSImageView, imageModel, null, dVar, null, false);
    }

    public static void a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, d dVar, p.a aVar, boolean z) {
        a(simpleDraweeView, imageModel, drawable, -1, -1, dVar, aVar, z, false);
    }

    public static void a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i2, int i3, d dVar, p.a aVar, boolean z, boolean z2) {
        if (simpleDraweeView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            com.facebook.imagepipeline.common.d dVar2 = null;
            if (i2 < 0 || i3 < 0) {
                i2 = simpleDraweeView.getMeasuredWidth();
                i3 = simpleDraweeView.getMeasuredHeight();
            }
            if (i2 > 0 && i3 > 0) {
                dVar2 = new com.facebook.imagepipeline.common.d(i2, i3);
            }
            com.facebook.imagepipeline.o.b[] a2 = a(imageModel, dVar2, dVar, z2);
            if (a2 != null && a2.length != 0) {
                e b2 = com.facebook.drawee.a.a.c.b();
                b2.f47325m = simpleDraweeView.getController();
                com.facebook.drawee.c.b a3 = b2.a(a2);
                if (z) {
                    a3.f47322j = true;
                }
                if (drawable != null) {
                    if (simpleDraweeView.getHierarchy() == null) {
                        com.facebook.drawee.f.b bVar = new com.facebook.drawee.f.b(simpleDraweeView.getContext().getResources());
                        bVar.f47463d = 300;
                        bVar.f47465f = drawable;
                        bVar.f47466g = q.b.f47442h;
                        simpleDraweeView.setHierarchy(bVar.a());
                    } else {
                        com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) simpleDraweeView.getHierarchy();
                        aVar2.b(300);
                        aVar2.a(1, drawable);
                        simpleDraweeView.setHierarchy(aVar2);
                    }
                }
                a3.f47319g = new b(imageModel, aVar);
                simpleDraweeView.setController(a3.e());
            }
        }
    }

    private static com.facebook.imagepipeline.o.b[] a(ImageModel imageModel, com.facebook.imagepipeline.common.d dVar, d dVar2, boolean z) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new com.facebook.imagepipeline.o.b[0];
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.android.live.core.f.a.c cVar = new com.bytedance.android.live.core.f.a.c();
        for (String str : imageModel.getUrls()) {
            if (!m.a(str)) {
                c a2 = c.a(Uri.parse(str));
                if (dVar2 != null) {
                    a2.f48454k = dVar2;
                }
                if (dVar != null) {
                    a2.f48447d = dVar;
                }
                cVar.a(a2);
                if (z) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                    a2.f48449f = imageDecodeOptionsBuilder.a();
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
        return com.facebook.imagepipeline.e.k.a().d().d(j.a().a(com.facebook.imagepipeline.o.b.fromUri(uri)));
    }

    public static void a(String str, com.facebook.imagepipeline.f.b bVar) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null) {
            c a2 = c.a(parse);
            a2.f48451h = true;
            com.facebook.imagepipeline.e.k.a().e().a(a2.a(), (Object) null).a(bVar, com.facebook.common.b.a.f47054a);
        }
    }

    public static Drawable a() {
        return y.e().getResources().getDrawable(2131234630);
    }

    static {
        Covode.recordClassIndex(4647);
    }

    public static void a(Runnable runnable) {
        f9082a.post(runnable);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ImageModel f9086a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f9087b;

        /* renamed from: c  reason: collision with root package name */
        public int f9088c = 300;

        /* renamed from: d  reason: collision with root package name */
        public int f9089d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f9090e = -1;

        /* renamed from: f  reason: collision with root package name */
        public d f9091f;

        /* renamed from: g  reason: collision with root package name */
        public p.a f9092g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9093h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f9094i;

        static {
            Covode.recordClassIndex(4650);
        }

        public a(ImageModel imageModel) {
            boolean z;
            if (!EnableImageDefault565Setting.INSTANCE.getValue() || TTliveAudienceDeviceRatingLowSetting.INSTANCE.getValue() < TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            this.f9094i = z;
            this.f9086a = imageModel;
        }
    }

    public static InputStream b(Uri uri) {
        MethodCollector.i(11184);
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            com.facebook.imagepipeline.e.k.a().e().b(c.a(uri).a(), null).a(new com.facebook.d.e<com.facebook.common.h.a<h>>() {
                /* class com.bytedance.android.live.core.f.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(4648);
                }

                @Override // com.facebook.d.e
                public final void onProgressUpdate(com.facebook.d.c<com.facebook.common.h.a<h>> cVar) {
                }

                @Override // com.facebook.d.e
                public final void onCancellation(com.facebook.d.c<com.facebook.common.h.a<h>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.g();
                    }
                }

                @Override // com.facebook.d.e
                public final void onFailure(com.facebook.d.c<com.facebook.common.h.a<h>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.g();
                    }
                }

                @Override // com.facebook.d.e
                public final void onNewResult(com.facebook.d.c<com.facebook.common.h.a<h>> cVar) {
                    MethodCollector.i(10663);
                    com.facebook.common.h.a<h> d2 = cVar.d();
                    if (d2 != null) {
                        h a2 = d2.a();
                        byte[] bArr = new byte[a2.a()];
                        a2.a(0, bArr, 0, a2.a());
                        try {
                            pipedOutputStream.write(bArr);
                            pipedOutputStream.close();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            cVar.g();
                            MethodCollector.o(10663);
                            throw th;
                        }
                        cVar.g();
                        MethodCollector.o(10663);
                        return;
                    }
                    MethodCollector.o(10663);
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
            MethodCollector.o(11184);
            return pipedInputStream;
        } catch (IOException unused) {
            MethodCollector.o(11184);
            return null;
        }
    }

    public static void a(ImageModel imageModel) {
        if (y.e() != null && imageModel != null && !com.bytedance.common.utility.h.a(imageModel.getUrls())) {
            com.facebook.imagepipeline.e.k.a().e().c(com.facebook.imagepipeline.o.b.fromUri(imageModel.getUrls().get(0)), y.e());
        }
    }

    public static class b implements com.facebook.drawee.c.d<f> {

        /* renamed from: a  reason: collision with root package name */
        private ImageModel f9095a;

        /* renamed from: b  reason: collision with root package name */
        private p.a f9096b;

        static {
            Covode.recordClassIndex(4651);
        }

        @Override // com.facebook.drawee.c.d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
        }

        @Override // com.facebook.drawee.c.d
        public final void onRelease(String str) {
        }

        public b(ImageModel imageModel, p.a aVar) {
            this.f9095a = imageModel;
            this.f9096b = aVar;
        }

        @Override // com.facebook.drawee.c.d
        public final void onFailure(String str, Throwable th) {
            p.a aVar = this.f9096b;
            if (aVar != null) {
                aVar.a(this.f9095a, new RuntimeException(th));
            }
        }

        @Override // com.facebook.drawee.c.d
        public final void onSubmit(String str, Object obj) {
            p.a aVar = this.f9096b;
            if (aVar != null) {
                aVar.a(this.f9095a);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            int i2;
            List<String> urls;
            f fVar2 = fVar;
            o.f9101a.a(this.f9095a);
            int i3 = -1;
            if (fVar2 != null) {
                i2 = fVar2.getWidth();
                i3 = fVar2.getHeight();
            } else {
                i2 = -1;
            }
            if (this.f9095a != null) {
                o oVar = o.f9101a;
                ImageModel imageModel = this.f9095a;
                if (!(imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty() || ThreadPoolOptExperiment.INSTANCE.isEnableAll() || oVar.f9102b == null)) {
                    oVar.f9102b.execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: INVOKE  
                          (wrap: java.util.concurrent.ExecutorService : 0x0046: IGET  (r1v3 java.util.concurrent.ExecutorService) = (r5v0 'oVar' com.bytedance.android.live.core.f.o) com.bytedance.android.live.core.f.o.b java.util.concurrent.ExecutorService)
                          (wrap: com.bytedance.android.live.core.f.o$1 : 0x004a: CONSTRUCTOR  (r0v9 com.bytedance.android.live.core.f.o$1) = (r5v0 'oVar' com.bytedance.android.live.core.f.o), (r2v0 'urls' java.util.List<java.lang.String>) call: com.bytedance.android.live.core.f.o.1.<init>(com.bytedance.android.live.core.f.o, java.util.List):void type: CONSTRUCTOR)
                         type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.android.live.core.f.k.b.onFinalImageSet(java.lang.String, com.facebook.imagepipeline.j.f, android.graphics.drawable.Animatable):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004a: CONSTRUCTOR  (r0v9 com.bytedance.android.live.core.f.o$1) = (r5v0 'oVar' com.bytedance.android.live.core.f.o), (r2v0 'urls' java.util.List<java.lang.String>) call: com.bytedance.android.live.core.f.o.1.<init>(com.bytedance.android.live.core.f.o, java.util.List):void type: CONSTRUCTOR in method: com.bytedance.android.live.core.f.k.b.onFinalImageSet(java.lang.String, com.facebook.imagepipeline.j.f, android.graphics.drawable.Animatable):void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.live.core.f.o, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                        this = this;
                        com.facebook.imagepipeline.j.f r8 = (com.facebook.imagepipeline.j.f) r8
                        com.bytedance.android.live.core.f.o r1 = com.bytedance.android.live.core.f.o.f9101a
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f9095a
                        r1.a(r0)
                        r4 = -1
                        if (r8 == 0) goto L_0x0051
                        int r3 = r8.getWidth()
                        int r4 = r8.getHeight()
                    L_0x0014:
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f9095a
                        if (r0 == 0) goto L_0x0030
                        com.bytedance.android.live.core.f.o r5 = com.bytedance.android.live.core.f.o.f9101a
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f9095a
                        if (r0 == 0) goto L_0x002a
                        java.util.List r2 = r0.getUrls()
                        if (r2 == 0) goto L_0x002a
                        boolean r0 = r2.isEmpty()
                        if (r0 == 0) goto L_0x003a
                    L_0x002a:
                        com.bytedance.android.live.base.model.ImageModel r1 = r6.f9095a
                        r0 = 1
                        r1.setLoaded(r0)
                    L_0x0030:
                        com.bytedance.android.live.core.f.p$a r1 = r6.f9096b
                        if (r1 == 0) goto L_0x0039
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f9095a
                        r1.a(r0, r3, r4)
                    L_0x0039:
                        return
                    L_0x003a:
                        com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment r0 = com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment.INSTANCE
                        boolean r0 = r0.isEnableAll()
                        if (r0 != 0) goto L_0x002a
                        java.util.concurrent.ExecutorService r0 = r5.f9102b
                        if (r0 == 0) goto L_0x002a
                        java.util.concurrent.ExecutorService r1 = r5.f9102b
                        com.bytedance.android.live.core.f.o$1 r0 = new com.bytedance.android.live.core.f.o$1
                        r0.<init>(r2)
                        r1.execute(r0)
                        goto L_0x002a
                    L_0x0051:
                        r3 = -1
                        goto L_0x0014
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.f.k.b.onFinalImageSet(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
                }
            }

            public static void a(HSImageView hSImageView, int i2) {
                if (hSImageView != null) {
                    hSImageView.setImageURI(c.a(g.a(i2)).a().mSourceUri);
                }
            }

            private static void b(HSImageView hSImageView, String str) {
                if (hSImageView != null && !TextUtils.isEmpty(str)) {
                    e a2 = com.facebook.drawee.a.a.c.b().b(Uri.parse(str));
                    a2.f47322j = true;
                    a2.f47325m = hSImageView.getController();
                    hSImageView.setController(a2.e());
                }
            }

            public static void a(HSImageView hSImageView, ImageModel imageModel) {
                a(hSImageView, imageModel, null, null, null, false);
            }

            public static void b(HSImageView hSImageView, ImageModel imageModel, p.a aVar) {
                a(hSImageView, imageModel, a(), null, aVar, false);
            }

            public static com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a(ImageModel imageModel, int i2, int i3) {
                com.facebook.imagepipeline.common.d dVar;
                if (i2 <= 0 || i3 <= 0) {
                    dVar = null;
                } else {
                    dVar = new com.facebook.imagepipeline.common.d(i2, i3);
                }
                com.facebook.imagepipeline.o.b[] a2 = a(imageModel, dVar, (d) null, false);
                if (a2 == null || a2.length == 0) {
                    return null;
                }
                return com.facebook.imagepipeline.e.k.a().e().a(a2[0], (Object) null);
            }

            public static void a(HSImageView hSImageView, ImageModel imageModel, p.a aVar) {
                a(hSImageView, imageModel, null, null, aVar, false);
            }

            public static void a(HSImageView hSImageView, ImageModel imageModel, p.a aVar, boolean z) {
                a(hSImageView, imageModel, null, null, aVar, z);
            }

            public static void a(ImageModel imageModel, int i2, int i3, d dVar, final p.b bVar) {
                com.facebook.imagepipeline.common.d dVar2;
                if (i2 <= 0 || i3 <= 0) {
                    dVar2 = null;
                } else {
                    dVar2 = new com.facebook.imagepipeline.common.d(i2, i3);
                }
                com.facebook.imagepipeline.o.b[] a2 = a(imageModel, dVar2, dVar, false);
                if (a2 != null && a2.length != 0) {
                    final com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a3 = com.facebook.imagepipeline.e.k.a().e().a(a2[0], (Object) null);
                    a3.a(new com.facebook.imagepipeline.f.b() {
                        /* class com.bytedance.android.live.core.f.k.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(4649);
                        }

                        @Override // com.facebook.d.b
                        public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                            if (cVar != null) {
                                cVar.g();
                            }
                            if (bVar != null) {
                                k.a(new n(bVar));
                            }
                        }

                        @Override // com.facebook.imagepipeline.f.b
                        public final void a(Bitmap bitmap) {
                            MethodCollector.i(10657);
                            if (a3.b() && bitmap != null) {
                                k.a(new l(bVar, Bitmap.createBitmap(bitmap)));
                            } else if (bVar != null) {
                                k.a(new m(bVar));
                            }
                            a3.g();
                            MethodCollector.o(10657);
                        }
                    }, com.facebook.common.b.a.f47054a);
                }
            }
        }
