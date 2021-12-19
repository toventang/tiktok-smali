package com.ss.android.ugc.aweme.commercialize.g;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;

public final class a implements d<f> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f74438a = false;

    /* renamed from: b  reason: collision with root package name */
    private SimpleDraweeView f74439b;

    static {
        Covode.recordClassIndex(45911);
    }

    @Override // com.facebook.drawee.c.d
    public final void onFailure(String str, Throwable th) {
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

    @Override // com.facebook.drawee.c.d
    public final void onSubmit(String str, Object obj) {
    }

    public a(SimpleDraweeView simpleDraweeView) {
        this.f74439b = simpleDraweeView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.c.d
    public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
        f fVar2 = fVar;
        if (animatable != null) {
            ValueAnimator a2 = com.facebook.fresco.animation.c.a.a.a((com.facebook.fresco.animation.c.a) animatable);
            a2.setRepeatCount(-1);
            a2.start();
            if (this.f74438a && fVar2 != null) {
                this.f74439b.getLayoutParams().width = n.a(this.f74439b.getContext());
                this.f74439b.getLayoutParams().height = -2;
                this.f74439b.setAspectRatio(((float) fVar2.getWidth()) / ((float) fVar2.getHeight()));
            }
        }
    }
}
