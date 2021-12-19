package com.ss.android.ugc.aweme.commercialize.playfun.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.commercialize.playfun.e;
import com.ss.android.ugc.aweme.commercialize.playfun.f;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public Animator f74958d;

    /* renamed from: e  reason: collision with root package name */
    private Animator f74959e;

    /* renamed from: f  reason: collision with root package name */
    private Animator f74960f;

    static {
        Covode.recordClassIndex(46219);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void a() {
        a("EggShowState---handle");
        super.a();
        a(new a(this));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void d() {
        super.d();
        Animator animator = this.f74955c;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f74958d;
        if (animator2 != null) {
            animator2.end();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void e() {
        super.e();
        Animator animator = this.f74958d;
        if (animator != null) {
            animator.cancel();
        }
        this.f74958d = null;
        Animator animator2 = this.f74959e;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f74959e = null;
        Animator animator3 = this.f74960f;
        if (animator3 != null) {
            animator3.cancel();
        }
        this.f74960f = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.d
    public final boolean f() {
        a("isEggClickable" + this.f74994b.n.f74937h);
        if (!this.f74994b.n.f74937h) {
            return true;
        }
        return false;
    }

    public final void h() {
        com.ss.android.ugc.aweme.commercialize.playfun.c a2 = this.f74994b.n.a();
        int i2 = a2.f74989a;
        float f2 = a2.f74990b;
        int i3 = this.f74994b.f74995a.f74989a;
        if (i2 != i3 || f2 != this.f74994b.f74995a.f74990b) {
            float f3 = ((float) (i3 - i2)) / 2.0f;
            float a3 = f2 - ((float) f.a(this.f74994b.n));
            Animator animator = this.f74959e;
            if (animator != null) {
                animator.cancel();
            }
            float f4 = (float) i2;
            Animator a4 = com.ss.android.ugc.aweme.commercialize.playfun.a.a(this.f74994b.f74999e, a3 - f3, f4 / ((float) i3), i3);
            this.f74959e = a4;
            if (a4 != null) {
                a4.start();
            }
            float f5 = f4 + a3;
            Animator animator2 = this.f74960f;
            if (animator2 != null) {
                animator2.cancel();
            }
            Animator a5 = com.ss.android.ugc.aweme.commercialize.playfun.a.a(this.f74994b.f75000f, f5);
            this.f74960f = a5;
            if (a5 != null) {
                a5.start();
            }
            a("EggShowState.checkPosition, newSize:" + i2 + ", newTop:" + f2 + ", rawEggImageSize:" + i3 + ", eggTransY:" + a3 + ", titleTransY:" + f5);
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f74961a;

        static {
            Covode.recordClassIndex(46220);
        }

        a(c cVar) {
            this.f74961a = cVar;
        }

        public final void run() {
            float f2;
            long j2;
            float translationX;
            AwemePlayFunModel awemePlayFunModel = this.f74961a.f74994b.f74997c;
            if (awemePlayFunModel != null) {
                f2 = awemePlayFunModel.getShowDuration();
            } else {
                f2 = 0.0f;
            }
            float f3 = f2 * 1000.0f;
            c cVar = this.f74961a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            l.b(ofFloat, "");
            if (f3 > 0.0f) {
                j2 = (long) f3;
            } else {
                j2 = 3000;
            }
            ofFloat.setDuration(j2);
            cVar.a(ofFloat);
            Animator animator = this.f74961a.f74955c;
            if (animator != null) {
                animator.start();
            }
            this.f74961a.f74994b.f75004j = System.currentTimeMillis();
            View view = this.f74961a.f74994b.f75000f;
            View view2 = this.f74961a.f74994b.f74999e;
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.measure(0, 0);
            int measuredWidth = view.getMeasuredWidth();
            l.d("eggTitleViewWidth: ".concat(String.valueOf(measuredWidth)), "");
            if (gb.a()) {
                translationX = (view2.getTranslationX() - (((float) view2.getWidth()) / 2.0f)) + (((float) measuredWidth) / 2.0f);
            } else {
                translationX = (view2.getTranslationX() + (((float) view2.getWidth()) / 2.0f)) - (((float) measuredWidth) / 2.0f);
            }
            view.setTranslationX(translationX);
            float translationY = view2.getTranslationY() + ((float) this.f74961a.f74994b.f74995a.f74989a);
            c cVar2 = this.f74961a;
            l.d(view, "");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", n.b(d.a(), 25.0f) + translationY, translationY);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200L);
            animatorSet.play(ofFloat2).with(ofFloat3);
            cVar2.f74958d = animatorSet;
            Animator animator2 = this.f74961a.f74958d;
            if (animator2 != null) {
                animator2.addListener(new AnimatorListenerAdapter(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.playfun.a.c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f74962a;

                    static {
                        Covode.recordClassIndex(46221);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f74962a = r1;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        this.f74962a.f74961a.h();
                    }
                });
            }
            Animator animator3 = this.f74961a.f74958d;
            if (animator3 != null) {
                animator3.start();
            }
            this.f74961a.f74994b.a("show_in_center", new Point((int) view2.getTranslationX(), (int) view2.getTranslationY()), new Point((int) view.getTranslationX(), (int) translationY));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(eVar);
        l.d(eVar, "");
    }
}
