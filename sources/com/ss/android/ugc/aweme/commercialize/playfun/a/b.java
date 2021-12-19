package com.ss.android.ugc.aweme.commercialize.playfun.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.playfun.b;
import com.ss.android.ugc.aweme.commercialize.playfun.e;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private List<? extends Animator> f74957d;

    public interface a {
        static {
            Covode.recordClassIndex(46215);
        }

        void a(Animator animator);
    }

    static {
        Covode.recordClassIndex(46214);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.a.b$b  reason: collision with other inner class name */
    public static final class C1704b implements a {
        static {
            Covode.recordClassIndex(46216);
        }

        C1704b() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.b.a
        public final void a(Animator animator) {
            l.d(animator, "");
            int i2 = Build.VERSION.SDK_INT;
            animator.pause();
        }
    }

    public static final class c implements a {
        static {
            Covode.recordClassIndex(46217);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.b.a
        public final void a(Animator animator) {
            l.d(animator, "");
            animator.cancel();
        }
    }

    public static final class d implements a {
        static {
            Covode.recordClassIndex(46218);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.b.a
        public final void a(Animator animator) {
            l.d(animator, "");
            int i2 = Build.VERSION.SDK_INT;
            animator.resume();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void b() {
        super.b();
        a(new C1704b());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void c() {
        super.c();
        a(new d());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void e() {
        super.e();
        a(new c());
        this.f74957d = null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.a.a, com.ss.android.ugc.aweme.commercialize.playfun.d
    public final void a() {
        float f2;
        long j2;
        a("CollapseState---handle");
        super.a();
        AwemePlayFunModel awemePlayFunModel = this.f74994b.f74997c;
        if (awemePlayFunModel != null) {
            f2 = awemePlayFunModel.getEndDuration();
        } else {
            f2 = 0.0f;
        }
        float f3 = f2 * 1000.0f;
        PointF c2 = this.f74994b.c();
        b.a aVar = new b.a();
        aVar.f74974a = f3;
        com.ss.android.ugc.aweme.commercialize.playfun.b a2 = aVar.a(new PointF(this.f74994b.f74999e.getTranslationX(), this.f74994b.f74999e.getTranslationY())).b(new PointF(c2.x, c2.y)).a();
        View view = this.f74994b.f74999e;
        com.ss.android.ugc.aweme.commercialize.playfun.c cVar = this.f74994b.f74995a;
        l.d(view, "");
        l.d(cVar, "");
        l.d(a2, "");
        view.setPivotX(((float) cVar.f74989a) / 2.0f);
        view.setPivotY(((float) cVar.f74989a) / 2.0f);
        Path path = new Path();
        path.moveTo(a2.f74968b, a2.f74969c);
        path.cubicTo((a2.f74968b + a2.f74972f) / 2.0f, a2.f74969c, a2.f74972f, (a2.f74969c + a2.f74973g) / 2.0f, a2.f74972f, a2.f74973g);
        Animator a3 = com.ss.android.ugc.aweme.commercialize.playfun.a.a(view, path);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), cVar.f74992d);
        l.b(ofFloat, "");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "ScaleY", view.getScaleY(), cVar.f74992d);
        l.b(ofFloat2, "");
        AnimatorSet animatorSet = new AnimatorSet();
        float f4 = a2.f74967a;
        if (f4 > 0.0f) {
            j2 = (long) f4;
        } else {
            j2 = 400;
        }
        animatorSet.setDuration(j2);
        animatorSet.setInterpolator(new com.ss.android.ugc.aweme.bd.a());
        animatorSet.play(a3).with(ofFloat).with(ofFloat2);
        a(animatorSet);
        Animator animator = this.f74955c;
        if (animator != null) {
            animator.start();
        }
        View view2 = this.f74994b.f74998d;
        l.d(view2, "");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f, 0.0f);
        l.b(ofFloat3, "");
        ofFloat3.setDuration(((long) f3) / 2);
        ofFloat3.start();
        View view3 = this.f74994b.f75000f;
        l.d(view3, "");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view3, "alpha", 1.0f, 0.0f);
        l.b(ofFloat4, "");
        ofFloat4.setDuration(200L);
        ofFloat4.start();
        List<? extends Animator> b2 = n.b(ofFloat3, ofFloat4);
        if (b2 == null) {
            l.b();
        }
        this.f74957d = b2;
        a(String.valueOf(this.f74994b.f75001g));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(e eVar) {
        super(eVar);
        l.d(eVar, "");
    }

    private void a(a aVar) {
        l.d(aVar, "");
        List<? extends Animator> list = this.f74957d;
        if (list != null) {
            for (T t : list) {
                if (t != null) {
                    aVar.a(t);
                }
            }
        }
    }
}
