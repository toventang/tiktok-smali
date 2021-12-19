package com.ss.android.ugc.aweme.commercialize.playfun.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import com.ss.android.ugc.aweme.commercialize.playfun.b;
import com.ss.android.ugc.aweme.commercialize.playfun.c;
import com.ss.android.ugc.aweme.commercialize.playfun.e;
import com.ss.android.ugc.aweme.commercialize.playfun.f;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.b.l;
import java.util.Objects;

public final class d extends a {

    /* renamed from: d  reason: collision with root package name */
    public Animator f74963d;

    static {
        Covode.recordClassIndex(46222);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void e() {
        super.e();
        Animator animator = this.f74963d;
        if (animator != null) {
            animator.cancel();
        }
        this.f74963d = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void a() {
        a("ExpandState---handle");
        super.a();
        this.f74994b.b("popupbadge");
        a(new a(this));
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f74964a;

        static {
            Covode.recordClassIndex(46223);
        }

        a(d dVar) {
            this.f74964a = dVar;
        }

        public final void run() {
            float f2;
            int i2;
            int i3;
            int i4;
            int i5;
            PointF pointF;
            int i6;
            long j2;
            AwemePlayFunModel awemePlayFunModel = this.f74964a.f74994b.f74997c;
            if (awemePlayFunModel != null) {
                f2 = awemePlayFunModel.getStartDuration();
            } else {
                f2 = 0.0f;
            }
            float f3 = f2 * 1000.0f;
            b.a aVar = new b.a();
            aVar.f74974a = f3;
            d dVar = this.f74964a;
            if (awemePlayFunModel == null) {
                pointF = new PointF(0.0f, 0.0f);
            } else {
                ViewParent parent = dVar.f74994b.n.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) parent;
                ao aoVar = dVar.f74994b.f75005k;
                if (aoVar != null) {
                    i2 = aoVar.f74868a;
                } else {
                    i2 = 0;
                }
                ao aoVar2 = dVar.f74994b.f75005k;
                if (aoVar2 != null) {
                    i3 = aoVar2.f74869b;
                } else {
                    i3 = 0;
                }
                if (i2 > viewGroup.getWidth()) {
                    i4 = (i2 - viewGroup.getWidth()) / 2;
                } else {
                    i4 = 0;
                }
                if (i3 > viewGroup.getHeight()) {
                    i5 = (i3 - viewGroup.getHeight()) / 2;
                } else {
                    i5 = 0;
                }
                int i7 = dVar.f74994b.f74995a.f74989a;
                float positionX = (((float) i2) * awemePlayFunModel.getPositionX()) - ((float) i4);
                float f4 = (float) (i7 / 2);
                float f5 = positionX - f4;
                if (gb.a()) {
                    f5 = -(((float) (viewGroup.getWidth() - i7)) - f5);
                }
                pointF = new PointF(f5, ((((float) i3) * awemePlayFunModel.getPositionY()) - ((float) i5)) - f4);
            }
            b.a a2 = aVar.a(pointF);
            d dVar2 = this.f74964a;
            float f6 = dVar2.f74994b.f74995a.f74991c;
            if (gb.a()) {
                f6 = -f6;
            }
            b.a b2 = a2.b(new PointF(f6, dVar2.f74994b.f74995a.f74990b - ((float) f.a(dVar2.f74994b.n))));
            if (awemePlayFunModel != null) {
                i6 = awemePlayFunModel.getAngle();
            } else {
                i6 = 0;
            }
            b2.f74976c = i6;
            b2.f74975b = 0.0f;
            b a3 = b2.a();
            d dVar3 = this.f74964a;
            View view = dVar3.f74994b.f74999e;
            c cVar = this.f74964a.f74994b.f74995a;
            l.d(view, "");
            l.d(cVar, "");
            l.d(a3, "");
            view.setPivotX(((float) cVar.f74989a) / 2.0f);
            view.setPivotY(((float) cVar.f74989a) / 2.0f);
            view.setTranslationX(a3.f74968b);
            view.setTranslationY(a3.f74969c);
            view.setScaleX(a3.f74970d);
            view.setScaleY(a3.f74970d);
            view.setRotation((float) a3.f74971e);
            Path path = new Path();
            path.moveTo(a3.f74968b, a3.f74969c);
            path.lineTo(a3.f74972f, a3.f74973g);
            Animator a4 = com.ss.android.ugc.aweme.commercialize.playfun.a.a(view, path);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", a3.f74970d, 1.0f);
            l.b(ofFloat, "");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", a3.f74970d, 1.0f);
            l.b(ofFloat2, "");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", (float) a3.f74971e, 0.0f);
            l.b(ofFloat3, "");
            AnimatorSet animatorSet = new AnimatorSet();
            float f7 = a3.f74967a;
            if (f7 > 0.0f) {
                j2 = (long) f7;
            } else {
                j2 = 500;
            }
            animatorSet.setDuration(j2);
            animatorSet.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
            animatorSet.play(a4).with(ofFloat).with(ofFloat2).with(ofFloat3);
            dVar3.a(animatorSet);
            this.f74964a.f74994b.f74999e.setAlpha(1.0f);
            Animator animator = this.f74964a.f74955c;
            if (animator != null) {
                animator.start();
            }
            long j3 = ((long) f3) / 2;
            this.f74964a.f74994b.f74998d.setAlpha(0.0f);
            d dVar4 = this.f74964a;
            View view2 = dVar4.f74994b.f74998d;
            l.d(view2, "");
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
            l.b(ofFloat4, "");
            ofFloat4.setDuration(j3);
            dVar4.f74963d = ofFloat4;
            Animator animator2 = this.f74964a.f74963d;
            if (animator2 != null) {
                animator2.setStartDelay(j3);
            }
            Animator animator3 = this.f74964a.f74963d;
            if (animator3 != null) {
                animator3.start();
            }
            this.f74964a.f74994b.a("start_expand", new Point((int) a3.f74968b, (int) a3.f74969c), null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(eVar);
        l.d(eVar, "");
    }
}
