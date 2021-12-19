package com.ss.android.ugc.aweme.specact.pendant.c.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C3479a f134113e = new C3479a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f134114a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f134115b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.views.a f134116c;

    /* renamed from: d  reason: collision with root package name */
    public View f134117d;

    static {
        Covode.recordClassIndex(87721);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.a.a.a$a  reason: collision with other inner class name */
    public static final class C3479a {
        static {
            Covode.recordClassIndex(87722);
        }

        private C3479a() {
        }

        public /* synthetic */ C3479a(byte b2) {
            this();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134119a;

        static {
            Covode.recordClassIndex(87724);
        }

        public c(a aVar) {
            this.f134119a = aVar;
        }

        public final void run() {
            a aVar = this.f134119a;
            aVar.f134117d.setPivotX(a.a(aVar.f134117d.getContext(), 40.0f));
            aVar.f134117d.setPivotY(a.a(aVar.f134117d.getContext(), 25.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f134117d, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(aVar.f134117d, "scaleY", 1.3f, 1.0f));
            animatorSet.setDuration(297L);
            animatorSet.addListener(new d(aVar));
            animatorSet.setTarget(aVar.f134117d);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(aVar.f134117d, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(aVar.f134117d, "scaleY", 0.0f, 1.3f));
            animatorSet2.setDuration(528L);
            animatorSet2.addListener(new e(aVar, animatorSet));
            animatorSet2.setTarget(aVar.f134117d);
            aVar.f134117d.setVisibility(0);
            animatorSet2.start();
            aVar.f134114a = false;
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134118a;

        static {
            Covode.recordClassIndex(87723);
        }

        b(a aVar) {
            this.f134118a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134118a.f134117d.setVisibility(8);
            this.f134118a.f134116c.setCanDrag(true);
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134120a;

        static {
            Covode.recordClassIndex(87725);
        }

        d(a aVar) {
            this.f134120a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134120a.f134117d.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.specact.pendant.c.a.a.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f134121a;

                static {
                    Covode.recordClassIndex(87726);
                }

                {
                    this.f134121a = r1;
                }

                public final void run() {
                    a aVar = this.f134121a.f134120a;
                    if (!aVar.f134114a) {
                        aVar.f134114a = true;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f134117d, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(aVar.f134117d, "scaleY", 1.0f, 0.0f));
                        animatorSet.setDuration(330L);
                        animatorSet.addListener(new b(aVar));
                        animatorSet.setTarget(aVar.f134117d);
                        animatorSet.start();
                    }
                }
            }, 3000);
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134122a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnimatorSet f134123b;

        static {
            Covode.recordClassIndex(87727);
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134123b.start();
        }

        e(a aVar, AnimatorSet animatorSet) {
            this.f134122a = aVar;
            this.f134123b = animatorSet;
        }
    }

    public a(com.ss.android.ugc.aweme.specact.pendant.views.a aVar, View view) {
        l.d(aVar, "");
        l.d(view, "");
        this.f134116c = aVar;
        this.f134117d = view;
    }

    public static float a(Context context, float f2) {
        if (context == null) {
            return 0.0f;
        }
        Resources resources = context.getResources();
        l.b(resources, "");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }
}
