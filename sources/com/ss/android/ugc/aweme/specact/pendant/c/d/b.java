package com.ss.android.ugc.aweme.specact.pendant.c.d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f134167g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f134168a = true;

    /* renamed from: b  reason: collision with root package name */
    final com.ss.android.ugc.aweme.specact.pendant.c.a f134169b = new com.ss.android.ugc.aweme.specact.pendant.c.a(this.f134172e);

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.specact.pendant.views.b f134170c;

    /* renamed from: d  reason: collision with root package name */
    public View f134171d;

    /* renamed from: e  reason: collision with root package name */
    View f134172e;

    /* renamed from: f  reason: collision with root package name */
    View f134173f;

    static {
        Covode.recordClassIndex(87751);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87752);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134175a;

        static {
            Covode.recordClassIndex(87754);
        }

        public c(b bVar) {
            this.f134175a = bVar;
        }

        public final void run() {
            b bVar = this.f134175a;
            bVar.f134170c.setCanDrag(false);
            ViewGroup.LayoutParams layoutParams = bVar.f134172e.getLayoutParams();
            layoutParams.width = bVar.f134173f.getWidth();
            layoutParams.height = bVar.f134173f.getHeight();
            bVar.f134172e.setLayoutParams(layoutParams);
            bVar.f134171d.setVisibility(0);
            bVar.f134168a = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bVar.f134169b, "width", 0.0f, (float) bVar.f134173f.getWidth()), ObjectAnimator.ofFloat(bVar.f134173f, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new d(bVar));
            animatorSet.start();
        }
    }

    public final void a() {
        if (!this.f134168a) {
            this.f134168a = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f134169b, "width", (float) this.f134173f.getWidth(), 0.0f), ObjectAnimator.ofFloat(this.f134173f, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new C3483b(this));
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.d.b$b  reason: collision with other inner class name */
    public static final class C3483b extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134174a;

        static {
            Covode.recordClassIndex(87753);
        }

        C3483b(b bVar) {
            this.f134174a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134174a.f134171d.setVisibility(8);
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134176a;

        static {
            Covode.recordClassIndex(87755);
        }

        d(b bVar) {
            this.f134176a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134176a.f134171d.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.specact.pendant.c.d.b.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f134177a;

                static {
                    Covode.recordClassIndex(87756);
                }

                {
                    this.f134177a = r1;
                }

                public final void run() {
                    this.f134177a.f134176a.a();
                }
            }, 5000);
        }
    }

    public b(com.ss.android.ugc.aweme.specact.pendant.views.b bVar, View view, View view2, View view3) {
        l.d(bVar, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(view3, "");
        this.f134170c = bVar;
        this.f134171d = view;
        this.f134172e = view2;
        this.f134173f = view3;
    }
}
