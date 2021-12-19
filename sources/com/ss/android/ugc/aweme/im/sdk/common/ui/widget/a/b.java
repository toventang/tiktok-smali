package com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f102596a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(65693);
    }

    public static void a(View view) {
        l.d(view, "");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(700L);
        animatorSet.setInterpolator(new a());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }
}
