package androidx.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final class u {
    static {
        Covode.recordClassIndex(1241);
    }

    static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f3362a;

        /* renamed from: b  reason: collision with root package name */
        private final View f3363b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3364c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3365d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f3366e;

        /* renamed from: f  reason: collision with root package name */
        private float f3367f;

        /* renamed from: g  reason: collision with root package name */
        private float f3368g;

        /* renamed from: h  reason: collision with root package name */
        private final float f3369h;

        /* renamed from: i  reason: collision with root package name */
        private final float f3370i;

        static {
            Covode.recordClassIndex(1242);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f3363b.setTranslationX(this.f3369h);
            this.f3363b.setTranslationY(this.f3370i);
        }

        public final void onAnimationResume(Animator animator) {
            this.f3363b.setTranslationX(this.f3367f);
            this.f3363b.setTranslationY(this.f3368g);
        }

        public final void onAnimationPause(Animator animator) {
            this.f3367f = this.f3363b.getTranslationX();
            this.f3368g = this.f3363b.getTranslationY();
            this.f3363b.setTranslationX(this.f3369h);
            this.f3363b.setTranslationY(this.f3370i);
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f3366e == null) {
                this.f3366e = new int[2];
            }
            this.f3366e[0] = Math.round(((float) this.f3364c) + this.f3363b.getTranslationX());
            this.f3366e[1] = Math.round(((float) this.f3365d) + this.f3363b.getTranslationY());
            this.f3362a.setTag(R.id.eqd, this.f3366e);
        }

        a(View view, View view2, int i2, int i3, float f2, float f3) {
            this.f3363b = view;
            this.f3362a = view2;
            this.f3364c = i2 - Math.round(view.getTranslationX());
            this.f3365d = i3 - Math.round(view.getTranslationY());
            this.f3369h = f2;
            this.f3370i = f3;
            int[] iArr = (int[]) view2.getTag(R.id.eqd);
            this.f3366e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.eqd, null);
            }
        }
    }

    static Animator a(View view, s sVar, int i2, int i3, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        float f6 = f2;
        float f7 = f3;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) sVar.f3356b.getTag(R.id.eqd);
        if (iArr != null) {
            f6 = ((float) (iArr[0] - i2)) + translationX;
            f7 = ((float) (iArr[1] - i3)) + translationY;
        }
        int round = i2 + Math.round(f6 - translationX);
        int round2 = i3 + Math.round(f7 - translationY);
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f6, f4), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f7, f5));
        a aVar = new a(view, sVar.f3356b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(aVar);
        a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
