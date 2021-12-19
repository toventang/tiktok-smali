package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f108569a;

    static {
        Covode.recordClassIndex(69586);
    }

    c(b bVar) {
        this.f108569a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        b bVar = this.f108569a;
        bVar.f108563b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (bVar.f108562a != 0) {
            bVar.a((1.0f - bVar.f108563b) / 0.5f);
            bVar.f108565d.setAlpha(1.0f - ((1.0f - bVar.f108563b) / 0.5f));
        }
    }
}
