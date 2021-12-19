package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f125747a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(82597);
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f125750a;

        static {
            Covode.recordClassIndex(82599);
        }

        b(h.f.a.b bVar) {
            this.f125750a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            super.onAnimationEnd(animator);
            this.f125750a.invoke(true);
        }
    }

    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f125748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f125749b;

        static {
            Covode.recordClassIndex(82598);
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            super.onAnimationEnd(animator);
            this.f125748a.setVisibility(8);
            this.f125749b.invoke(false);
        }

        a(View view, h.f.a.b bVar) {
            this.f125748a = view;
            this.f125749b = bVar;
        }
    }

    public static void a(View view, boolean z, h.f.a.b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        if (view != null) {
            float b2 = n.b(view.getContext(), 16.0f);
            view.setVisibility(0);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", b2, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200L);
                animatorSet.addListener(new b(bVar));
                animatorSet.start();
            }
        }
    }

    public static void b(View view, boolean z, h.f.a.b<? super Boolean, z> bVar) {
        l.d(bVar, "");
        if (view != null) {
            float b2 = n.b(view.getContext(), 16.0f);
            if (z) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, b2);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                animatorSet.setDuration(200L);
                animatorSet.addListener(new a(view, bVar));
                animatorSet.start();
                return;
            }
            view.setVisibility(8);
        }
    }
}
