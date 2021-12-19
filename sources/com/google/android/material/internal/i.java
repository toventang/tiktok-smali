package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f52557a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f52558b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f52559c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f52560d = new AnimatorListenerAdapter() {
        /* class com.google.android.material.internal.i.AnonymousClass1 */

        static {
            Covode.recordClassIndex(32561);
        }

        public final void onAnimationEnd(Animator animator) {
            if (i.this.f52559c == animator) {
                i.this.f52559c = null;
            }
        }
    };

    static {
        Covode.recordClassIndex(32560);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f52562a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f52563b;

        static {
            Covode.recordClassIndex(32562);
        }

        a(int[] iArr, ValueAnimator valueAnimator) {
            this.f52562a = iArr;
            this.f52563b = valueAnimator;
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        a aVar = new a(iArr, valueAnimator);
        valueAnimator.addListener(this.f52560d);
        this.f52557a.add(aVar);
    }
}
