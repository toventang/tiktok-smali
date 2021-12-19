package com.ss.android.ugc.aweme.emoji.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.j.f;
import com.facebook.imagepipeline.o.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class h {
    static {
        Covode.recordClassIndex(56216);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public RemoteImageView f89456a;

        /* renamed from: b  reason: collision with root package name */
        public i f89457b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f89458c = true;

        /* renamed from: d  reason: collision with root package name */
        d<f> f89459d = new d<f>() {
            /* class com.ss.android.ugc.aweme.emoji.utils.h.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            boolean f89467a;

            static {
                Covode.recordClassIndex(56218);
            }

            @Override // com.facebook.drawee.c.d
            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            @Override // com.facebook.drawee.c.d
            public final void onSubmit(String str, Object obj) {
            }

            @Override // com.facebook.drawee.c.d
            public final void onRelease(String str) {
                this.f89467a = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.c.d
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
                this.f89467a = false;
            }

            @Override // com.facebook.drawee.c.d
            public final void onFailure(String str, Throwable th) {
                if (a.this.f89457b != null) {
                    a.this.f89457b.a();
                }
                a.this.a();
                this.f89467a = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                Animatable i2;
                if (animatable != null) {
                    this.f89467a = true;
                    if (a.this.f89456a.getController() != null && this.f89467a && (i2 = a.this.f89456a.getController().i()) != null && !i2.isRunning() && a.this.f89458c) {
                        i2.start();
                    }
                    if (a.this.f89457b != null) {
                        a.this.f89457b.b();
                        return;
                    }
                    return;
                }
                this.f89467a = false;
            }
        };

        /* renamed from: e  reason: collision with root package name */
        private int f89460e;

        /* renamed from: f  reason: collision with root package name */
        private UrlModel f89461f;

        /* renamed from: g  reason: collision with root package name */
        private b[] f89462g;

        /* renamed from: h  reason: collision with root package name */
        private com.facebook.drawee.h.a f89463h;

        /* renamed from: i  reason: collision with root package name */
        private int f89464i;

        /* renamed from: j  reason: collision with root package name */
        private int f89465j;

        /* renamed from: k  reason: collision with root package name */
        private e f89466k;

        static {
            Covode.recordClassIndex(56217);
        }

        public final void a() {
            List<String> urlList = this.f89461f.getUrlList();
            int i2 = this.f89460e;
            this.f89460e = i2 + 1;
            b[] a2 = a(a(urlList, i2));
            if (this.f89466k == null) {
                e b2 = c.b();
                b2.f47325m = this.f89456a.getController();
                e eVar = (e) b2.a(a2);
                eVar.f47319g = this.f89459d;
                this.f89466k = eVar;
            }
            this.f89466k.a(a2);
            if (this.f89463h == null) {
                this.f89463h = this.f89466k.e();
            }
            this.f89456a.setController(this.f89463h);
        }

        private b[] a(String str) {
            if (this.f89462g == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                imageDecodeOptionsBuilder.a(1);
                imageDecodeOptionsBuilder.f47724e = false;
                com.facebook.imagepipeline.common.b bVar = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
                com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
                a2.f48449f = bVar;
                if (this.f89465j > 0 && this.f89464i > 0) {
                    a2.f48447d = new com.facebook.imagepipeline.common.d(this.f89464i, this.f89465j);
                }
                this.f89462g = new b[]{a2.a()};
            }
            return this.f89462g;
        }

        private static String a(List<String> list, int i2) {
            if (!com.bytedance.common.utility.collection.b.a((Collection) list) && i2 < list.size()) {
                return list.get(i2);
            }
            return null;
        }

        a(RemoteImageView remoteImageView, UrlModel urlModel, i iVar) {
            this.f89456a = remoteImageView;
            this.f89461f = urlModel;
            this.f89464i = 0;
            this.f89465j = 0;
            this.f89457b = iVar;
        }
    }

    public static void a(RemoteImageView remoteImageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            List<String> singletonList = Collections.singletonList(str);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(singletonList);
            a(remoteImageView, urlModel, null);
        }
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, i iVar) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            a aVar = new a(remoteImageView, urlModel, iVar);
            aVar.f89458c = true;
            aVar.a();
        }
    }
}
