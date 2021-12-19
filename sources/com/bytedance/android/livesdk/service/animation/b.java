package com.bytedance.android.livesdk.service.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;

public final class b {

    public interface c {
        static {
            Covode.recordClassIndex(12502);
        }

        void a();

        void b();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(12498);
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21178a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 12499(0x30d3, float:1.7515E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.service.animation.b$b[] r0 = com.bytedance.android.livesdk.service.animation.b.EnumC0450b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.service.animation.b.AnonymousClass1.f21178a = r2
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.b.EnumC0450b.entry     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.service.animation.b.AnonymousClass1.f21178a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.b.EnumC0450b.comb     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.service.animation.b.AnonymousClass1.f21178a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.b.EnumC0450b.show     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.service.animation.b.AnonymousClass1.f21178a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdk.service.animation.b$b r0 = com.bytedance.android.livesdk.service.animation.b.EnumC0450b.exit     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.animation.b.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.b$b  reason: collision with other inner class name */
    public enum EnumC0450b {
        entry,
        comb,
        show,
        exit;

        static {
            Covode.recordClassIndex(12501);
        }
    }

    public static class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        private c f21179a;

        /* renamed from: b  reason: collision with root package name */
        private final EnumC0450b f21180b;

        static {
            Covode.recordClassIndex(12500);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f21179a != null) {
                int i2 = AnonymousClass1.f21178a[this.f21180b.ordinal()];
                if (i2 == 1) {
                    this.f21179a.a();
                } else if (i2 == 2) {
                    this.f21179a.b();
                } else if (i2 != 3) {
                    this.f21179a.d();
                    this.f21179a = null;
                } else {
                    this.f21179a.c();
                }
            }
        }

        public a(EnumC0450b bVar, c cVar) {
            this.f21179a = cVar;
            this.f21180b = bVar;
        }
    }

    public static AnimatorSet b(View view, c cVar) {
        view.getX();
        float y = view.getY();
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", y, y - 100.0f).setDuration(300L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new a(EnumC0450b.exit, cVar));
        return animatorSet;
    }

    public static AnimatorSet a(View view, c cVar) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "scaleX", 1.5f, 1.0f).setDuration(200L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleY", 1.5f, 1.0f).setDuration(200L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(100L);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.2f).setDuration(100L);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.2f).setDuration(100L);
        ObjectAnimator duration6 = ObjectAnimator.ofFloat(view, "scaleX", 1.2f, 1.0f).setDuration(100L);
        ObjectAnimator duration7 = ObjectAnimator.ofFloat(view, "scaleY", 1.2f, 1.0f).setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(duration4, duration5);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(duration6, duration7);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(animatorSet, animatorSet2, animatorSet3);
        animatorSet4.addListener(new a(EnumC0450b.comb, cVar));
        return animatorSet4;
    }

    public static AnimatorSet a(View view, boolean z, c cVar) {
        int i2;
        float x = view.getX();
        if (z) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        float f2 = (float) i2;
        float f3 = x * f2;
        float f4 = f2 * 75.0f;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", f3, f4).setDuration(200L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", f4, 0.0f).setDuration(50L);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, 0.0f).setDuration(50L);
        if (z) {
            duration = ObjectAnimator.ofFloat(view, "translationX", f3, f4).setDuration(200L);
            duration2 = ObjectAnimator.ofFloat(view, "translationX", f4, (float) y.a(16.0f)).setDuration(50L);
            duration3 = ObjectAnimator.ofFloat(view, "translationX", (float) y.a(16.0f), (float) y.a(16.0f)).setDuration(50L);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2, duration3);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new a(EnumC0450b.entry, cVar));
        return animatorSet;
    }
}
