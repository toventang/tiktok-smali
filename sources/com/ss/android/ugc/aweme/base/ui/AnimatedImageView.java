package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.a;
import com.facebook.drawee.c.c;
import com.facebook.drawee.c.d;
import com.facebook.drawee.e.p;
import com.facebook.drawee.e.q;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;

public class AnimatedImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public a f68255a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f68256b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f68257c;

    /* renamed from: d  reason: collision with root package name */
    protected d<f> f68258d = new c<f>() {
        /* class com.ss.android.ugc.aweme.base.ui.AnimatedImageView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(42042);
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onRelease(String str) {
            super.onRelease(str);
            AnimatedImageView.this.f68257c = false;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            AnimatedImageView.this.f68257c = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
            super.onIntermediateImageSet(str, fVar);
            AnimatedImageView.this.f68257c = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            f fVar2 = fVar;
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && a.C0978a.f39959a.a(url) == null && (fVar2 instanceof com.facebook.imagepipeline.j.a)) {
                a.C0978a.f39959a.a(url, (com.facebook.imagepipeline.j.a) fVar2);
            }
            if (animatable != null) {
                AnimatedImageView.this.f68257c = true;
                if (AnimatedImageView.this.f68256b) {
                    AnimatedImageView.this.b();
                    return;
                }
                return;
            }
            AnimatedImageView.this.f68257c = false;
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<com.ss.android.ugc.aweme.base.ui.b.a> f68259e;

    /* renamed from: f  reason: collision with root package name */
    private com.facebook.common.h.a<Bitmap> f68260f;

    /* renamed from: g  reason: collision with root package name */
    private UrlModel f68261g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f68262h;

    public interface a {
        static {
            Covode.recordClassIndex(42043);
        }
    }

    static {
        Covode.recordClassIndex(42041);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.base.ui.RemoteImageView
    public void a() {
    }

    public d<f> getControllerListener() {
        return this.f68258d;
    }

    public final void b() {
        Animatable i2;
        if (getController() != null && this.f68256b && this.f68257c && this.f68262h && (i2 = getController().i()) != null && !i2.isRunning()) {
            i2.start();
            WeakReference<com.ss.android.ugc.aweme.base.ui.b.a> weakReference = this.f68259e;
            if (weakReference != null && weakReference.get() != null) {
                this.f68259e.get();
            }
        }
    }

    public final void c() {
        Animatable i2;
        if (getController() != null && (i2 = getController().i()) != null && i2.isRunning()) {
            i2.stop();
            WeakReference<com.ss.android.ugc.aweme.base.ui.b.a> weakReference = this.f68259e;
            if (weakReference != null && weakReference.get() != null) {
                this.f68259e.get();
            }
        }
    }

    public String getUrl() {
        UrlModel urlModel = this.f68261g;
        if (urlModel == null || urlModel.getUrlList() == null || this.f68261g.getUrlList().size() == 0) {
            return "";
        }
        return this.f68261g.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f68256b = z;
    }

    public void setImageLoadFinishListener(a aVar) {
        this.f68255a = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f68262h = z;
    }

    public void setAnimationListener(com.ss.android.ugc.aweme.base.ui.b.a aVar) {
        this.f68259e = new WeakReference<>(aVar);
    }

    public AnimatedImageView(Context context) {
        super(context);
        a();
    }

    public final void a(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            this.f68261g = urlModel;
            ((com.facebook.drawee.f.a) getHierarchy()).a(0, (Drawable) null);
            com.facebook.common.h.a<Bitmap> a2 = a.C0978a.f39959a.a(getUrl());
            this.f68260f = a2;
            if (a2 != null && a2.d()) {
                Bitmap a3 = this.f68260f.a();
                if (!a3.isRecycled()) {
                    ((com.facebook.drawee.f.a) getHierarchy()).a(0, new p(new BitmapDrawable(a3), q.b.f47442h));
                    return;
                }
                ((com.facebook.drawee.f.a) getHierarchy()).a(0, (Drawable) null);
            }
        }
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
