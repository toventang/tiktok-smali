package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.da.d;
import com.ss.android.ugc.aweme.da.e;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class p extends e.a implements d {

    /* renamed from: a  reason: collision with root package name */
    public e f136334a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f136335b;

    /* renamed from: c  reason: collision with root package name */
    public final View f136336c;

    /* renamed from: d  reason: collision with root package name */
    public final View f136337d;

    /* renamed from: e  reason: collision with root package name */
    public final long f136338e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f136339f;

    /* renamed from: g  reason: collision with root package name */
    private final long f136340g = 250;

    static {
        Covode.recordClassIndex(89038);
    }

    public final boolean e() {
        if (!v.y(this.f136336c)) {
            return true;
        }
        return false;
    }

    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f136346b;

        static {
            Covode.recordClassIndex(89040);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f136347a;

            static {
                Covode.recordClassIndex(89041);
            }

            a(b bVar) {
                this.f136347a = bVar;
            }

            public final void run() {
                MethodCollector.i(12546);
                this.f136347a.f136345a.f136335b.removeView(this.f136347a.f136345a.f136336c);
                MethodCollector.o(12546);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            if (!this.f136345a.e()) {
                e eVar = this.f136345a.f136334a;
                if (eVar != null) {
                    eVar.d();
                }
                this.f136345a.f136335b.post(new a(this));
                com.ss.android.ugc.aweme.da.c cVar = this.f136346b;
                if (cVar != null) {
                    cVar.d();
                }
            }
        }

        b(p pVar, com.ss.android.ugc.aweme.da.c cVar) {
            this.f136345a = pVar;
            this.f136346b = cVar;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f136349b;

        static {
            Covode.recordClassIndex(89042);
        }

        c(p pVar, com.ss.android.ugc.aweme.da.c cVar) {
            this.f136348a = pVar;
            this.f136349b = cVar;
        }

        public final void run() {
            if (this.f136348a.f136335b.indexOfChild(this.f136348a.f136336c) != -1 && !this.f136348a.e()) {
                e eVar = this.f136348a.f136334a;
                if (eVar != null) {
                    eVar.a();
                }
                this.f136348a.f136337d.setVisibility(0);
                com.ss.android.ugc.aweme.da.c cVar = this.f136349b;
                if (cVar != null) {
                    cVar.a();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f136348a.f136338e);
                l.b(duration, "");
                duration.setInterpolator(this.f136348a.f136339f);
                final int measuredHeight = this.f136348a.f136337d.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    /* class com.ss.android.ugc.aweme.sticker.view.internal.main.p.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f136350a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ int f136351b = 0;

                    static {
                        Covode.recordClassIndex(89043);
                    }

                    {
                        this.f136350a = r2;
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        l.b(valueAnimator, "");
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        e eVar = this.f136350a.f136348a.f136334a;
                        if (eVar != null) {
                            eVar.a(animatedFraction, this.f136351b, measuredHeight);
                        }
                        int i2 = measuredHeight;
                        this.f136350a.f136348a.f136337d.setTranslationY(((float) i2) + (((float) (this.f136351b - i2)) * animatedFraction));
                        com.ss.android.ugc.aweme.da.c cVar = this.f136350a.f136349b;
                        if (cVar != null) {
                            cVar.a(animatedFraction, this.f136351b, measuredHeight);
                        }
                    }
                });
                duration.addListener(new AnimatorListenerAdapter(this) {
                    /* class com.ss.android.ugc.aweme.sticker.view.internal.main.p.c.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f136353a;

                    static {
                        Covode.recordClassIndex(89044);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f136353a = r1;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        l.d(animator, "");
                        super.onAnimationEnd(animator);
                        if (!this.f136353a.f136348a.e()) {
                            e eVar = this.f136353a.f136348a.f136334a;
                            if (eVar != null) {
                                eVar.b();
                            }
                            com.ss.android.ugc.aweme.da.c cVar = this.f136353a.f136349b;
                            if (cVar != null) {
                                cVar.b();
                            }
                        }
                    }
                });
                duration.start();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(e eVar) {
        l.d(eVar, "");
        this.f136334a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(com.ss.android.ugc.aweme.da.c cVar) {
        MethodCollector.i(12544);
        this.f136335b.removeAllViews();
        this.f136335b.addView(this.f136336c);
        this.f136335b.post(new c(this, cVar));
        MethodCollector.o(12544);
    }

    static final class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f136341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f136342b = 0;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f136343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.da.c f136344d;

        static {
            Covode.recordClassIndex(89039);
        }

        a(p pVar, int i2, com.ss.android.ugc.aweme.da.c cVar) {
            this.f136341a = pVar;
            this.f136343c = i2;
            this.f136344d = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            e eVar = this.f136341a.f136334a;
            if (eVar != null) {
                eVar.b(animatedFraction, this.f136342b, this.f136343c);
            }
            this.f136341a.f136337d.setTranslationY(((float) (this.f136343c - this.f136342b)) * animatedFraction);
            com.ss.android.ugc.aweme.da.c cVar = this.f136344d;
            if (cVar != null) {
                cVar.b(animatedFraction, this.f136342b, this.f136343c);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void b(com.ss.android.ugc.aweme.da.c cVar) {
        e eVar = this.f136334a;
        if (eVar != null) {
            eVar.c();
        }
        cVar.c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f136340g);
        duration.addUpdateListener(new a(this, this.f136337d.getMeasuredHeight(), cVar));
        duration.addListener(new b(this, cVar));
        duration.start();
    }

    public p(ViewGroup viewGroup, View view, View view2, long j2, long j3, Interpolator interpolator) {
        l.d(viewGroup, "");
        l.d(view, "");
        l.d(view2, "");
        l.d(interpolator, "");
        this.f136335b = viewGroup;
        this.f136336c = view;
        this.f136337d = view2;
        this.f136338e = j2;
        this.f136339f = interpolator;
    }
}
