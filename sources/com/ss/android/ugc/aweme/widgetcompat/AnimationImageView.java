package com.ss.android.ugc.aweme.widgetcompat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;

public class AnimationImageView extends LottieAnimationView {
    static {
        Covode.recordClassIndex(94853);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        k.a(this);
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public AnimationImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageFolder("images");
        a(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.widgetcompat.AnimationImageView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94854);
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
}
