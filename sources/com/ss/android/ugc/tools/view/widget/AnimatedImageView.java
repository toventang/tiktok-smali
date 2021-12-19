package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.a;
import com.facebook.drawee.c.c;
import com.facebook.drawee.c.d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.lang.ref.WeakReference;

public class AnimatedImageView extends SimpleDraweeView {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<g> f150235a;

    /* renamed from: b  reason: collision with root package name */
    public a f150236b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f150237c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f150238d;

    /* renamed from: e  reason: collision with root package name */
    boolean f150239e;

    /* renamed from: f  reason: collision with root package name */
    protected d<f> f150240f = new c<f>() {
        /* class com.ss.android.ugc.tools.view.widget.AnimatedImageView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(98859);
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onRelease(String str) {
            super.onRelease(str);
            AnimatedImageView.this.f150238d = false;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            AnimatedImageView.this.f150238d = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, f fVar) {
            super.onIntermediateImageSet(str, fVar);
            AnimatedImageView.this.f150238d = false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            Animatable i2;
            f fVar2 = fVar;
            String url = AnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && a.C0978a.f39959a.a(url) == null && (fVar2 instanceof com.facebook.imagepipeline.j.a)) {
                a.C0978a.f39959a.a(url, (com.facebook.imagepipeline.j.a) fVar2);
            }
            if (animatable != null) {
                AnimatedImageView.this.f150238d = true;
                if (AnimatedImageView.this.f150237c) {
                    AnimatedImageView animatedImageView = AnimatedImageView.this;
                    if (animatedImageView.getController() != null && animatedImageView.f150237c && animatedImageView.f150238d && animatedImageView.f150239e && (i2 = animatedImageView.getController().i()) != null && !i2.isRunning()) {
                        i2.start();
                        if (animatedImageView.f150235a != null && animatedImageView.f150235a.get() != null) {
                            animatedImageView.f150235a.get();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            AnimatedImageView.this.f150238d = false;
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private UrlModel f150241g;

    public interface a {
        static {
            Covode.recordClassIndex(98860);
        }
    }

    static {
        Covode.recordClassIndex(98858);
    }

    public d<f> getControllerListener() {
        return this.f150240f;
    }

    public String getUrl() {
        UrlModel urlModel = this.f150241g;
        if (urlModel == null || urlModel.getUrlList() == null || this.f150241g.getUrlList().size() == 0) {
            return "";
        }
        return this.f150241g.getUrlList().get(0);
    }

    public void setAttached(boolean z) {
        this.f150237c = z;
    }

    public void setImageLoadFinishListener(a aVar) {
        this.f150236b = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.f150239e = z;
    }

    public void setAnimationListener(g gVar) {
        this.f150235a = new WeakReference<>(gVar);
    }

    public AnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
