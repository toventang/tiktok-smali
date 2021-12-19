package com.ss.android.ugc.aweme.base.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;

public class AnimationImageView extends LottieAnimationView {
    static {
        Covode.recordClassIndex(42044);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
    }

    private void g() {
        setImageFolder("images");
        a(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.base.ui.AnimationImageView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42045);
            }

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AnimationImageView.this.setLayerType(0, null);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AnimationImageView.this.setLayerType(0, null);
            }
        });
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public AnimationImageView(Context context) {
        super(context);
        g();
    }

    public AnimationImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
