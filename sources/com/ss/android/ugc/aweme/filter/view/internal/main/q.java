package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.da.e;
import h.f.b.l;

public final class q extends e.a implements com.ss.android.ugc.aweme.da.d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f95985d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public e f95986a;

    /* renamed from: b  reason: collision with root package name */
    public final View f95987b;

    /* renamed from: c  reason: collision with root package name */
    public final long f95988c;

    static {
        Covode.recordClassIndex(60793);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60794);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f95994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f95995b;

        static {
            Covode.recordClassIndex(60797);
        }

        d(q qVar, com.ss.android.ugc.aweme.da.c cVar) {
            this.f95994a = qVar;
            this.f95995b = cVar;
        }

        public final void run() {
            e eVar = this.f95994a.f95986a;
            if (eVar != null) {
                eVar.a();
            }
            com.ss.android.ugc.aweme.da.c cVar = this.f95995b;
            if (cVar != null) {
                cVar.a();
            }
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f95994a.f95988c);
            l.b(duration, "");
            duration.setInterpolator(new com.ss.android.ugc.tools.view.c.c());
            final int measuredHeight = this.f95994a.f95987b.getMeasuredHeight();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                /* class com.ss.android.ugc.aweme.filter.view.internal.main.q.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f95996a;

                static {
                    Covode.recordClassIndex(60798);
                }

                {
                    this.f95996a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l.b(valueAnimator, "");
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    int i2 = measuredHeight;
                    e eVar = this.f95996a.f95994a.f95986a;
                    if (eVar != null) {
                        eVar.a(animatedFraction, 0, i2);
                    }
                    this.f95996a.f95994a.f95987b.setTranslationY(((float) i2) + (((float) (0 - i2)) * animatedFraction));
                    this.f95996a.f95994a.f95987b.setAlpha(animatedFraction);
                    com.ss.android.ugc.aweme.da.c cVar = this.f95996a.f95995b;
                    if (cVar != null) {
                        cVar.a(animatedFraction, 0, i2);
                    }
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.ugc.aweme.filter.view.internal.main.q.d.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f95998a;

                static {
                    Covode.recordClassIndex(60799);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f95998a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    e eVar = this.f95998a.f95994a.f95986a;
                    if (eVar != null) {
                        eVar.b();
                    }
                    com.ss.android.ugc.aweme.da.c cVar = this.f95998a.f95995b;
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
        this.f95986a = eVar;
    }

    private q(View view) {
        l.d(view, "");
        this.f95987b = view;
        this.f95988c = 200;
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(com.ss.android.ugc.aweme.da.c cVar) {
        this.f95987b.post(new d(this, cVar));
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f95992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f95993b;

        static {
            Covode.recordClassIndex(60796);
        }

        public final void onAnimationEnd(Animator animator) {
            e eVar = this.f95992a.f95986a;
            if (eVar != null) {
                eVar.d();
            }
            com.ss.android.ugc.aweme.da.c cVar = this.f95993b;
            if (cVar != null) {
                cVar.d();
            }
        }

        c(q qVar, com.ss.android.ugc.aweme.da.c cVar) {
            this.f95992a = qVar;
            this.f95993b = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f95989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f95990b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f95991c;

        static {
            Covode.recordClassIndex(60795);
        }

        b(q qVar, int i2, com.ss.android.ugc.aweme.da.c cVar) {
            this.f95989a = qVar;
            this.f95990b = i2;
            this.f95991c = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i2 = this.f95990b;
            e eVar = this.f95989a.f95986a;
            if (eVar != null) {
                eVar.b(animatedFraction, 0, i2);
            }
            this.f95989a.f95987b.setTranslationY(((float) (i2 + 0)) * animatedFraction);
            this.f95989a.f95987b.setAlpha(1.0f - animatedFraction);
            com.ss.android.ugc.aweme.da.c cVar = this.f95991c;
            if (cVar != null) {
                cVar.b(animatedFraction, 0, i2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void b(com.ss.android.ugc.aweme.da.c cVar) {
        e eVar = this.f95986a;
        if (eVar != null) {
            eVar.c();
        }
        cVar.c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f95988c);
        duration.addUpdateListener(new b(this, this.f95987b.getMeasuredHeight(), cVar));
        duration.addListener(new c(this, cVar));
        duration.start();
    }

    public /* synthetic */ q(View view, byte b2) {
        this(view);
    }
}
