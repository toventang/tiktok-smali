package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.j.f;

public final class ay implements d<f> {

    /* renamed from: a  reason: collision with root package name */
    private View f94293a;

    /* renamed from: b  reason: collision with root package name */
    private Context f94294b;

    static {
        Covode.recordClassIndex(59911);
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

    public ay(View view, Context context) {
        this.f94293a = view;
        this.f94294b = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
    @Override // com.facebook.drawee.c.d
    public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
        f fVar2 = fVar;
        if (fVar2 != null) {
            ViewGroup.LayoutParams layoutParams = this.f94293a.getLayoutParams();
            int width = (int) (((float) fVar2.getWidth()) * (((float) layoutParams.height) / ((float) fVar2.getHeight())));
            if (width != layoutParams.width) {
                layoutParams.width = width;
                this.f94293a.setLayoutParams(layoutParams);
            }
        }
    }
}
