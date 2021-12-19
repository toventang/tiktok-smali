package com.bytedance.ies.xelement.bytedlottie;

import android.content.Context;
import android.graphics.Canvas;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.LottieAnimationView;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lancet.k;

public final class LynxBytedLottieAnimationView extends LottieAnimationView implements au {

    /* renamed from: c  reason: collision with root package name */
    private boolean f36736c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36737d;

    /* renamed from: e  reason: collision with root package name */
    private String f36738e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36739f;

    static {
        Covode.recordClassIndex(22065);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // com.bytedance.lottie.LottieAnimationView, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final boolean getDestroyed() {
        return this.f36737d;
    }

    public final boolean getMAutoPlay() {
        return this.f36736c;
    }

    public final String getSrcUrl() {
        return this.f36738e;
    }

    @Override // com.bytedance.lottie.LottieAnimationView
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36736c && this.f36739f && !g()) {
            c();
        }
    }

    @Override // com.bytedance.lottie.LottieAnimationView
    public final void onDetachedFromWindow() {
        if (g()) {
            this.f36739f = true;
        }
        super.onDetachedFromWindow();
        h();
        k.a(this);
    }

    public LynxBytedLottieAnimationView(Context context) {
        super(context);
    }

    public final void setDestroyed(boolean z) {
        this.f36737d = z;
    }

    public final void setMAutoPlay(boolean z) {
        this.f36736c = z;
    }

    public final void setSrcUrl(String str) {
        this.f36738e = str;
    }

    @Override // com.bytedance.lottie.LottieAnimationView
    public final void onDraw(Canvas canvas) {
        if (this.f36737d) {
            LLog.a("byted-lottie", "draw lottie-view after destroyed with src " + this.f36738e);
        } else {
            super.onDraw(canvas);
        }
    }
}
