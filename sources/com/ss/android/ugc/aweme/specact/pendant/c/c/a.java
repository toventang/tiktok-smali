package com.ss.android.ugc.aweme.specact.pendant.c.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final C3481a f134147h = new C3481a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f134148a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f134149b;

    /* renamed from: c  reason: collision with root package name */
    final com.ss.android.ugc.aweme.specact.pendant.c.a f134150c = new com.ss.android.ugc.aweme.specact.pendant.c.a(this.f134153f);

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.views.a f134151d;

    /* renamed from: e  reason: collision with root package name */
    public View f134152e;

    /* renamed from: f  reason: collision with root package name */
    View f134153f;

    /* renamed from: g  reason: collision with root package name */
    View f134154g;

    static {
        Covode.recordClassIndex(87740);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.c.a$a  reason: collision with other inner class name */
    public static final class C3481a {
        static {
            Covode.recordClassIndex(87741);
        }

        private C3481a() {
        }

        public /* synthetic */ C3481a(byte b2) {
            this();
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134156a;

        static {
            Covode.recordClassIndex(87743);
        }

        public c(a aVar) {
            this.f134156a = aVar;
        }

        public final void run() {
            a aVar = this.f134156a;
            aVar.f134151d.setCanDrag(false);
            ViewGroup.LayoutParams layoutParams = aVar.f134153f.getLayoutParams();
            layoutParams.width = aVar.f134154g.getWidth();
            layoutParams.height = aVar.f134154g.getHeight();
            aVar.f134153f.setLayoutParams(layoutParams);
            aVar.f134152e.setVisibility(0);
            aVar.f134148a = false;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f134150c, "width", 0.0f, (float) aVar.f134154g.getWidth()), ObjectAnimator.ofFloat(aVar.f134154g, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new d(aVar));
            animatorSet.start();
        }
    }

    public final void a() {
        if (!this.f134148a) {
            this.f134148a = true;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f134150c, "width", (float) this.f134154g.getWidth(), 0.0f), ObjectAnimator.ofFloat(this.f134154g, "alpha", 1.0f, 0.0f));
            animatorSet.setDuration(466L);
            animatorSet.addListener(new b(this));
            animatorSet.start();
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134155a;

        static {
            Covode.recordClassIndex(87742);
        }

        b(a aVar) {
            this.f134155a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134155a.f134152e.setVisibility(8);
            this.f134155a.f134151d.setCanDrag(true);
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134157a;

        static {
            Covode.recordClassIndex(87744);
        }

        d(a aVar) {
            this.f134157a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134157a.f134152e.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.specact.pendant.c.c.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f134158a;

                static {
                    Covode.recordClassIndex(87745);
                }

                {
                    this.f134158a = r1;
                }

                public final void run() {
                    this.f134158a.f134157a.a();
                }
            }, 5000);
        }
    }

    public a(com.ss.android.ugc.aweme.specact.pendant.views.a aVar, View view, View view2, View view3) {
        l.d(aVar, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(view3, "");
        this.f134151d = aVar;
        this.f134152e = view;
        this.f134153f = view2;
        this.f134154g = view3;
    }
}
