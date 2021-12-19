package com.ss.android.ugc.aweme.specact.pendant.c.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C3480a f134134d = new C3480a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f134135a = true;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.views.b f134136b;

    /* renamed from: c  reason: collision with root package name */
    public View f134137c;

    static {
        Covode.recordClassIndex(87731);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.c.b.a$a  reason: collision with other inner class name */
    public static final class C3480a {
        static {
            Covode.recordClassIndex(87732);
        }

        private C3480a() {
        }

        public /* synthetic */ C3480a(byte b2) {
            this();
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134138a;

        static {
            Covode.recordClassIndex(87733);
        }

        b(a aVar) {
            this.f134138a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134138a.f134137c.setVisibility(8);
            this.f134138a.f134136b.setCanDrag(true);
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134139a;

        static {
            Covode.recordClassIndex(87734);
        }

        public c(a aVar) {
            this.f134139a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134139a.f134137c.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.specact.pendant.c.b.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f134140a;

                static {
                    Covode.recordClassIndex(87735);
                }

                {
                    this.f134140a = r1;
                }

                public final void run() {
                    a aVar = this.f134140a.f134139a;
                    if (!aVar.f134135a) {
                        aVar.f134135a = true;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f134137c, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(aVar.f134137c, "scaleY", 1.0f, 0.0f));
                        animatorSet.setDuration(330L);
                        animatorSet.addListener(new b(aVar));
                        animatorSet.setTarget(aVar.f134137c);
                        animatorSet.start();
                    }
                }
            }, 3000);
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.specact.pendant.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnimatorSet f134142b;

        static {
            Covode.recordClassIndex(87736);
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.c.d
        public final void onAnimationEnd(Animator animator) {
            this.f134142b.start();
        }

        public d(a aVar, AnimatorSet animatorSet) {
            this.f134141a = aVar;
            this.f134142b = animatorSet;
        }
    }

    public a(com.ss.android.ugc.aweme.specact.pendant.views.b bVar, View view) {
        l.d(bVar, "");
        l.d(view, "");
        this.f134136b = bVar;
        this.f134137c = view;
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
