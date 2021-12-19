package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.c.c;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.j.f;
import com.facebook.imagepipeline.o.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.Collection;
import java.util.List;

public final class ah {
    static {
        Covode.recordClassIndex(65536);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public RemoteImageView f102380a;

        /* renamed from: b  reason: collision with root package name */
        public o f102381b;

        /* renamed from: c  reason: collision with root package name */
        boolean f102382c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f102383d = true;

        /* renamed from: e  reason: collision with root package name */
        d<f> f102384e = new c<f>() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ah.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            boolean f102393a;

            static {
                Covode.recordClassIndex(65538);
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onRelease(String str) {
                super.onRelease(str);
                this.f102393a = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
                super.onIntermediateImageSet(str, fVar);
                this.f102393a = false;
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                if (a.this.f102381b != null) {
                    a.this.f102381b.a(str, th);
                }
                a.this.a();
                this.f102393a = false;
            }

            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final void onSubmit(String str, Object obj) {
                super.onSubmit(str, obj);
                if (a.this.f102381b != null) {
                    a.this.f102381b.a(str);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
            public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
                Animatable i2;
                f fVar2 = fVar;
                if (animatable != null) {
                    this.f102393a = true;
                    if (a.this.f102380a.getController() != null && this.f102393a && (i2 = a.this.f102380a.getController().i()) != null && !i2.isRunning() && a.this.f102383d) {
                        i2.start();
                    }
                    if (a.this.f102381b != null) {
                        a.this.f102381b.a(str, fVar2, animatable);
                        return;
                    }
                    return;
                }
                this.f102393a = false;
            }
        };

        /* renamed from: f  reason: collision with root package name */
        private int f102385f;

        /* renamed from: g  reason: collision with root package name */
        private UrlModel f102386g;

        /* renamed from: h  reason: collision with root package name */
        private b[] f102387h;

        /* renamed from: i  reason: collision with root package name */
        private com.facebook.drawee.h.a f102388i;

        /* renamed from: j  reason: collision with root package name */
        private int f102389j;

        /* renamed from: k  reason: collision with root package name */
        private int f102390k;

        /* renamed from: l  reason: collision with root package name */
        private e f102391l;

        /* renamed from: m  reason: collision with root package name */
        private int f102392m;
        private int n;

        static {
            Covode.recordClassIndex(65537);
        }

        public final void a() {
            o oVar;
            List<String> urlList = this.f102386g.getUrlList();
            int i2 = this.f102385f;
            this.f102385f = i2 + 1;
            String a2 = ah.a(urlList, i2);
            if (!TextUtils.isEmpty(a2)) {
                b[] a3 = a(a2);
                if (this.f102391l == null) {
                    e b2 = com.facebook.drawee.a.a.c.b();
                    b2.f47325m = this.f102380a.getController();
                    e eVar = (e) b2.a(a3);
                    eVar.f47319g = this.f102384e;
                    this.f102391l = eVar;
                }
                this.f102391l.a(a3);
                if (this.f102388i == null) {
                    this.f102388i = this.f102391l.e();
                }
                this.f102380a.setController(this.f102388i);
            } else if (this.f102382c && (oVar = this.f102381b) != null && oVar.a()) {
                int a4 = com.ss.android.ugc.aweme.framework.d.b.a(this.f102380a.getContext(), 90.0f);
                ViewGroup.LayoutParams layoutParams = this.f102380a.getLayoutParams();
                layoutParams.width = a4;
                layoutParams.height = a4;
                this.f102380a.setLayoutParams(layoutParams);
            }
        }

        private b[] a(String str) {
            if (this.f102387h == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                imageDecodeOptionsBuilder.a(1);
                imageDecodeOptionsBuilder.f47724e = false;
                com.facebook.imagepipeline.common.b bVar = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
                com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
                a2.f48449f = bVar;
                if (this.f102390k > 0 && this.f102389j > 0) {
                    a2.f48447d = new com.facebook.imagepipeline.common.d(this.f102389j, this.f102390k);
                }
                this.f102387h = new b[]{a2.a()};
            }
            return this.f102387h;
        }

        public a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3, o oVar, int i4, int i5) {
            this.f102380a = remoteImageView;
            this.f102386g = urlModel;
            this.f102389j = i2;
            this.f102390k = i3;
            this.f102381b = oVar;
            this.n = i5;
            this.f102392m = i4;
        }
    }

    public static String a(List<String> list, int i2) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) list) && i2 < list.size()) {
            return list.get(i2);
        }
        return null;
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, o oVar, boolean z) {
        a(remoteImageView, urlModel, 0, 0, oVar, z, 0, 0);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3, o oVar, boolean z, int i4, int i5) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            a aVar = new a(remoteImageView, urlModel, i2, i3, oVar, i4, i5);
            aVar.f102382c = true;
            aVar.f102383d = z;
            aVar.a();
        }
    }
}
