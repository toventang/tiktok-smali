package com.ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.e.k;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.extract.l;
import com.ss.android.ugc.tools.utils.q;
import f.a.d.f;
import f.a.t;
import f.a.v;
import f.a.w;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public final class e extends a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f140051g = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public String f140052e;

    /* renamed from: f  reason: collision with root package name */
    public final VideoPublishEditModel f140053f;

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f140059a = new c();

        static {
            Covode.recordClassIndex(91526);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(91522);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final List<z> d() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.l
    public final String e() {
        return "extract_custom_sticker";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91523);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.e$e  reason: collision with other inner class name */
    static final class C3696e implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l.a f140063b;

        static {
            Covode.recordClassIndex(91528);
        }

        C3696e(e eVar, l.a aVar) {
            this.f140062a = eVar;
            this.f140063b = aVar;
        }

        @Override // f.a.d.a
        public final void a() {
            if (!(this.f140062a.f140053f.extractFramesModel == null || this.f140062a.f140053f.extractFramesModel.getExtractFramesDir() == null)) {
                String extractFramesDir = this.f140062a.f140053f.extractFramesModel.getExtractFramesDir();
                String str = File.separator;
                h.f.b.l.b(str, "");
                if (!p.c(extractFramesDir, str, false)) {
                    extractFramesDir = extractFramesDir + File.separator;
                }
                File[] listFiles = new File(this.f140062a.f140052e).listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file : listFiles) {
                        StringBuilder append = new StringBuilder().append(extractFramesDir);
                        h.f.b.l.b(file, "");
                        String sb = append.append(file.getName()).toString();
                        com.ss.android.ugc.aweme.video.e.c(file.getAbsolutePath(), sb);
                        this.f140062a.f140053f.extractFramesModel.addFrameAtLastSegment(new FrameItem(sb, 0, 0, 6, null));
                    }
                }
                com.ss.android.ugc.aweme.video.e.e(this.f140062a.f140052e);
                com.ss.android.ugc.aweme.video.e.c(this.f140062a.f140052e);
            }
            this.f140063b.a(true);
            this.f140062a.a(true);
            this.f140062a.a();
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l.a f140061b;

        static {
            Covode.recordClassIndex(91527);
        }

        d(e eVar, l.a aVar) {
            this.f140060a = eVar;
            this.f140061b = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f140061b.a(false);
            this.f140060a.a(true);
            this.f140060a.a();
        }
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f140054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StickerItemModel f140055b;

        static {
            Covode.recordClassIndex(91524);
        }

        b(e eVar, StickerItemModel stickerItemModel) {
            this.f140054a = eVar;
            this.f140055b = stickerItemModel;
        }

        @Override // f.a.w
        public final void subscribe(final v<Void> vVar) {
            h.f.b.l.d(vVar, "");
            final String str = this.f140055b.path;
            if (!new File(str).exists()) {
                vVar.a(new IllegalStateException("File not exists"));
                return;
            }
            com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a2 = k.a().e().a(com.facebook.imagepipeline.o.c.a(Uri.fromFile(new File(str))).a(), this.f140054a);
            h.f.b.l.b(a2, "");
            a2.a(new com.facebook.d.e<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>>(this) {
                /* class com.ss.android.ugc.aweme.tools.extract.e.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f140056a;

                static {
                    Covode.recordClassIndex(91525);
                }

                @Override // com.facebook.d.e
                public final void onProgressUpdate(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                }

                @Override // com.facebook.d.e
                public final void onCancellation(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    q.b("fetchDecodedImage onCancellation");
                    vVar.a();
                }

                @Override // com.facebook.d.e
                public final void onFailure(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    q.b("fetchDecodedImage Error");
                    vVar.a();
                }

                @Override // com.facebook.d.e
                public final void onNewResult(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> d2;
                    com.facebook.imagepipeline.j.c a2;
                    int duration;
                    boolean z;
                    int[] iArr;
                    MethodCollector.i(9257);
                    if (cVar == null || (d2 = cVar.d()) == null || (a2 = d2.a()) == null) {
                        MethodCollector.o(9257);
                    } else if (a2 instanceof com.facebook.imagepipeline.j.a) {
                        com.facebook.imagepipeline.j.a aVar = (com.facebook.imagepipeline.j.a) a2;
                        com.facebook.imagepipeline.a.a.e d3 = aVar.d();
                        h.f.b.l.b(d3, "");
                        com.facebook.imagepipeline.a.a.c cVar2 = d3.f47649a;
                        h.f.b.l.b(cVar2, "");
                        if (cVar2.getDuration() <= 0) {
                            duration = 1;
                        } else {
                            com.facebook.imagepipeline.a.a.e d4 = aVar.d();
                            h.f.b.l.b(d4, "");
                            com.facebook.imagepipeline.a.a.c cVar3 = d4.f47649a;
                            h.f.b.l.b(cVar3, "");
                            duration = cVar3.getDuration();
                        }
                        com.facebook.imagepipeline.a.a.e d5 = aVar.d();
                        h.f.b.l.b(d5, "");
                        com.facebook.imagepipeline.a.a.c cVar4 = d5.f47649a;
                        h.f.b.l.b(cVar4, "");
                        int frameCount = cVar4.getFrameCount();
                        int i2 = ((int) (((float) frameCount) / (((float) duration) / 1000.0f))) * 2;
                        for (int i3 = 0; i3 < frameCount; i3 += i2) {
                            com.facebook.fresco.animation.b.c.b bVar = new com.facebook.fresco.animation.b.c.b(new com.facebook.fresco.animation.b.a.c(), new com.facebook.imagepipeline.a.c.a(new com.facebook.imagepipeline.a.d.a(), aVar.d(), new Rect(0, 0, aVar.getWidth(), aVar.getHeight())));
                            Bitmap createBitmap = Bitmap.createBitmap(aVar.getWidth(), aVar.getHeight(), Bitmap.Config.ARGB_8888);
                            bVar.a(i3, createBitmap);
                            int width = aVar.getWidth();
                            int height = aVar.getHeight();
                            if (width > height) {
                                z = true;
                                iArr = new int[]{k.f140100a[0], (int) ((((float) height) / ((float) width)) * ((float) k.f140100a[0]))};
                            } else {
                                z = true;
                                iArr = new int[]{(int) ((((float) width) / ((float) height)) * ((float) k.f140100a[1])), k.f140100a[1]};
                            }
                            int i4 = iArr[0];
                            char c2 = z ? 1 : 0;
                            char c3 = z ? 1 : 0;
                            char c4 = z ? 1 : 0;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i4, iArr[c2], z);
                            e eVar = this.f140056a.f140054a;
                            h.f.b.l.b(createScaledBitmap, "");
                            com.ss.android.ugc.tools.utils.c.a(createScaledBitmap, new File(eVar.f140052e + "extract-frame-custom_sticker-" + System.currentTimeMillis() + ".jpg"), 70, Bitmap.CompressFormat.JPEG);
                            createScaledBitmap.recycle();
                            createBitmap.recycle();
                        }
                        vVar.a();
                        MethodCollector.o(9257);
                    } else {
                        e eVar2 = this.f140056a.f140054a;
                        String str = str;
                        h.f.b.l.b(str, "");
                        com.ss.android.ugc.tools.utils.c.a(com.ss.android.ugc.tools.utils.c.a(str, k.f140100a, Bitmap.Config.ARGB_4444), new File(eVar2.f140052e + "extract-frame-custom_sticker-" + System.currentTimeMillis() + ".jpg"), 70, Bitmap.CompressFormat.JPEG);
                        vVar.a();
                        MethodCollector.o(9257);
                    }
                }

                {
                    this.f140056a = r1;
                }
            }, Executors.newCachedThreadPool());
        }
    }

    public e(VideoPublishEditModel videoPublishEditModel) {
        h.f.b.l.d(videoPublishEditModel, "");
        this.f140053f = videoPublishEditModel;
        n nVar = this.f139985c;
        h.f.b.l.b(nVar, "");
        String str = nVar.f140102b;
        this.f140052e = str;
        h.f.b.l.b(str, "");
        String str2 = File.separator;
        h.f.b.l.b(str2, "");
        if (!p.c(str, str2, false)) {
            this.f140052e += File.separator;
        }
        String str3 = this.f140052e + "custom_sticker";
        this.f140052e = str3;
        this.f140052e = str3 + File.separator;
        new File(this.f140052e).mkdirs();
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        super.a(aVar);
        if (!b()) {
            aVar.a(false);
            a(true);
            a();
        } else if (!this.f140053f.hasImageStickers()) {
            aVar.a(false);
            a(true);
            a();
        } else {
            List<StickerItemModel> list = this.f140053f.infoStickerModel.stickers;
            h.f.b.l.b(list, "");
            ArrayList arrayList = new ArrayList();
            ArrayList<StickerItemModel> arrayList2 = new ArrayList();
            for (T t : list) {
                if (t.type == 11) {
                    arrayList2.add(t);
                }
            }
            for (StickerItemModel stickerItemModel : arrayList2) {
                h.f.b.l.d(stickerItemModel, "");
                t a2 = t.a(new b(this, stickerItemModel));
                h.f.b.l.b(a2, "");
                arrayList.add(a2);
            }
            t.c(arrayList).b(f.a.h.a.b(f.a.k.a.f158006c)).a(c.f140059a, new d(this, aVar), new C3696e(this, aVar));
        }
    }
}
