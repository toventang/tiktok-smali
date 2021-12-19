package com.ss.android.ugc.tools.view.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.da.e;
import h.f.b.l;

public final class f extends e.a implements com.ss.android.ugc.aweme.da.d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f150067d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public e f150068a;

    /* renamed from: b  reason: collision with root package name */
    public final View f150069b;

    /* renamed from: c  reason: collision with root package name */
    public final long f150070c = 490;

    /* renamed from: e  reason: collision with root package name */
    private final long f150071e = 250;

    static {
        Covode.recordClassIndex(98793);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98794);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f150077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f150078b;

        static {
            Covode.recordClassIndex(98797);
        }

        d(f fVar, com.ss.android.ugc.aweme.da.c cVar) {
            this.f150077a = fVar;
            this.f150078b = cVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.da.c cVar = this.f150078b;
            if (cVar != null) {
                cVar.a();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f150077a.f150070c);
            l.b(duration, "");
            duration.setInterpolator(new com.ss.android.ugc.tools.view.c.c());
            final int measuredHeight = this.f150077a.f150069b.getMeasuredHeight();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.tools.view.base.f.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f150079a;

                static {
                    Covode.recordClassIndex(98798);
                }

                {
                    this.f150079a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l.b(valueAnimator, "");
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i2 = measuredHeight;
                    e eVar = this.f150079a.f150077a.f150068a;
                    if (eVar != null) {
                        eVar.a(animatedFraction, 0, i2);
                    }
                    this.f150079a.f150077a.f150069b.setTranslationY(((float) i2) + (((float) (0 - i2)) * animatedFraction));
                    this.f150079a.f150077a.f150069b.setAlpha(animatedFraction);
                    com.ss.android.ugc.aweme.da.c cVar = this.f150079a.f150078b;
                    if (cVar != null) {
                        cVar.a(animatedFraction, 0, i2);
                    }
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.ugc.tools.view.base.f.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f150081a;

                static {
                    Covode.recordClassIndex(98799);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f150081a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    e eVar = this.f150081a.f150077a.f150068a;
                    if (eVar != null) {
                        eVar.b();
                    }
                    com.ss.android.ugc.aweme.da.c cVar = this.f150081a.f150078b;
                    if (cVar != null) {
                        cVar.b();
                    }
                }
            });
            duration.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f150068a = eVar;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f150075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f150076b;

        static {
            Covode.recordClassIndex(98796);
        }

        public final void onAnimationEnd(Animator animator) {
            e eVar = this.f150075a.f150068a;
            if (eVar != null) {
                eVar.d();
            }
            com.ss.android.ugc.aweme.da.c cVar = this.f150076b;
            if (cVar != null) {
                cVar.d();
            }
        }

        c(f fVar, com.ss.android.ugc.aweme.da.c cVar) {
            this.f150075a = fVar;
            this.f150076b = cVar;
        }
    }

    public f(View view) {
        l.d(view, "");
        this.f150069b = view;
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(com.ss.android.ugc.aweme.da.c cVar) {
        e eVar = this.f150068a;
        if (eVar != null) {
            eVar.a();
        }
        this.f150069b.setAlpha(0.0f);
        this.f150069b.post(new d(this, cVar));
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f150072a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f150073b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f150074c;

        static {
            Covode.recordClassIndex(98795);
        }

        b(f fVar, int i2, com.ss.android.ugc.aweme.da.c cVar) {
            this.f150072a = fVar;
            this.f150073b = i2;
            this.f150074c = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i2 = this.f150073b;
            e eVar = this.f150072a.f150068a;
            if (eVar != null) {
                eVar.b(animatedFraction, 0, i2);
            }
            this.f150072a.f150069b.setTranslationY(((float) (i2 + 0)) * animatedFraction);
            this.f150072a.f150069b.setAlpha(1.0f - animatedFraction);
            com.ss.android.ugc.aweme.da.c cVar = this.f150074c;
            if (cVar != null) {
                cVar.b(animatedFraction, 0, i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void b(com.ss.android.ugc.aweme.da.c cVar) {
        e eVar = this.f150068a;
        if (eVar != null) {
            eVar.c();
        }
        cVar.c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f150071e);
        duration.addUpdateListener(new b(this, this.f150069b.getMeasuredHeight(), cVar));
        duration.addListener(new c(this, cVar));
        duration.start();
    }
}
