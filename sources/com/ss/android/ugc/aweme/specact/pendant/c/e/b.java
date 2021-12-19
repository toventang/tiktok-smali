package com.ss.android.ugc.aweme.specact.pendant.c.e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f134186j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f134187a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f134188b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f134189c;

    /* renamed from: d  reason: collision with root package name */
    final com.ss.android.ugc.aweme.specact.pendant.c.a f134190d = new com.ss.android.ugc.aweme.specact.pendant.c.a(this.f134194h);

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.views.b f134191e;

    /* renamed from: f  reason: collision with root package name */
    public View f134192f;

    /* renamed from: g  reason: collision with root package name */
    public View f134193g;

    /* renamed from: h  reason: collision with root package name */
    View f134194h;

    /* renamed from: i  reason: collision with root package name */
    View f134195i;

    static {
        Covode.recordClassIndex(87761);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87762);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134198a;

        static {
            Covode.recordClassIndex(87765);
        }

        public d(b bVar) {
            this.f134198a = bVar;
        }

        public final void run() {
            b bVar = this.f134198a;
            bVar.f134191e.setCanDrag(false);
            ViewGroup.LayoutParams layoutParams = bVar.f134194h.getLayoutParams();
            layoutParams.width = bVar.f134195i.getWidth();
            layoutParams.height = bVar.f134195i.getHeight();
            bVar.f134194h.setLayoutParams(layoutParams);
            bVar.f134193g.setVisibility(0);
            bVar.f134187a = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f134190d, "width", 0.0f, (float) bVar.f134195i.getWidth()), ObjectAnimator.ofFloat(bVar.f134195i, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new e(bVar));
            animatorSet.start();
        }
    }

    public final void a() {
        if (!this.f134187a) {
            this.f134187a = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f134190d, "width", (float) this.f134195i.getWidth(), 0.0f), ObjectAnimator.ofFloat(this.f134195i, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C3485b(this));
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.e.b$b  reason: collision with other inner class name */
    public static final class C3485b extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134196a;

        static {
            Covode.recordClassIndex(87763);
        }

        C3485b(b bVar) {
            this.f134196a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134196a.f134193g.setVisibility(8);
            b bVar = this.f134196a;
            bVar.f134192f.setPivotX(b.a(bVar.f134192f.getContext(), 20.0f));
            bVar.f134192f.setPivotY(b.a(bVar.f134192f.getContext(), 25.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f134192f, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(bVar.f134192f, "scaleY", 1.3f, 1.0f));
            animatorSet.setDuration(297L);
            animatorSet.addListener(new f(bVar));
            animatorSet.setTarget(bVar.f134192f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(bVar.f134192f, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(bVar.f134192f, "scaleY", 0.0f, 1.3f));
            animatorSet2.setDuration(528L);
            animatorSet2.addListener(new g(bVar, animatorSet));
            animatorSet2.setTarget(bVar.f134192f);
            bVar.f134192f.setVisibility(0);
            animatorSet2.start();
            bVar.f134188b = false;
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134197a;

        static {
            Covode.recordClassIndex(87764);
        }

        c(b bVar) {
            this.f134197a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134197a.f134192f.setVisibility(8);
            this.f134197a.f134191e.setCanDrag(true);
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134199a;

        static {
            Covode.recordClassIndex(87766);
        }

        e(b bVar) {
            this.f134199a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134199a.f134193g.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.specact.pendant.c.e.b.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f134200a;

                static {
                    Covode.recordClassIndex(87767);
                }

                {
                    this.f134200a = r1;
                }

                public final void run() {
                    this.f134200a.f134199a.a();
                }
            }, 5000);
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134201a;

        static {
            Covode.recordClassIndex(87768);
        }

        f(b bVar) {
            this.f134201a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134201a.f134192f.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.specact.pendant.c.e.b.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f134202a;

                static {
                    Covode.recordClassIndex(87769);
                }

                {
                    this.f134202a = r1;
                }

                public final void run() {
                    b bVar = this.f134202a.f134201a;
                    if (!bVar.f134188b) {
                        bVar.f134188b = true;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f134192f, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(bVar.f134192f, "scaleY", 1.0f, 0.0f));
                        animatorSet.setDuration(330L);
                        animatorSet.addListener(new c(bVar));
                        animatorSet.setTarget(bVar.f134192f);
                        animatorSet.start();
                    }
                }
            }, 3000);
        }
    }

    public static final class g extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134203a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnimatorSet f134204b;

        static {
            Covode.recordClassIndex(87770);
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134204b.start();
        }

        g(b bVar, AnimatorSet animatorSet) {
            this.f134203a = bVar;
            this.f134204b = animatorSet;
        }
    }

    public static float a(Context context, float f2) {
        if (context == null) {
            return 0.0f;
        }
        Resources resources = context.getResources();
        l.b(resources, "");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }

    public b(com.ss.android.ugc.aweme.specact.pendant.views.b bVar, View view, View view2, View view3, View view4) {
        l.d(bVar, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(view3, "");
        l.d(view4, "");
        this.f134191e = bVar;
        this.f134192f = view;
        this.f134193g = view2;
        this.f134194h = view3;
        this.f134195i = view4;
    }
}
