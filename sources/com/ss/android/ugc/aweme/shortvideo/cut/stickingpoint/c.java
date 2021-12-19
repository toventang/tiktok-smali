package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f125916a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(82727);
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f125917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f125918b = true;

        static {
            Covode.recordClassIndex(82728);
        }

        public final void onAnimationEnd(Animator animator) {
            int i2;
            l.d(animator, "");
            super.onAnimationEnd(animator);
            View view = this.f125917a;
            if (this.f125918b) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
        }

        a(View view, boolean z) {
            this.f125917a = view;
        }
    }

    public static void a(View view) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addListener(new a(view, true));
            ofFloat.start();
        }
    }

    public static void b(View view) {
        if (view != null) {
            view.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.start();
        }
    }
}
