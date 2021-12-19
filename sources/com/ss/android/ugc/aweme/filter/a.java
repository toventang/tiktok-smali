package com.ss.android.ugc.aweme.filter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.da.c;
import com.ss.android.ugc.aweme.da.d;
import com.ss.android.ugc.aweme.da.e;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public e f95467a = new e.a();

    /* renamed from: b  reason: collision with root package name */
    public View f95468b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f95469c;

    /* renamed from: d  reason: collision with root package name */
    private View f95470d;

    static {
        Covode.recordClassIndex(60486);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a() {
        this.f95468b.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void d() {
        MethodCollector.i(2651);
        this.f95469c.removeView(this.f95470d);
        MethodCollector.o(2651);
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(e eVar) {
        this.f95467a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(final c cVar) {
        MethodCollector.i(2637);
        this.f95469c.removeAllViews();
        this.f95469c.addView(this.f95470d);
        this.f95469c.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.filter.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60487);
            }

            public final void run() {
                a.this.f95467a.a();
                a.this.a();
                cVar.a();
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(490L);
                duration.setInterpolator(new com.ss.android.ugc.aweme.g.a());
                final int measuredHeight = a.this.f95468b.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.filter.a.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(60488);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        a.this.f95467a.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        a.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        cVar.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.filter.a.AnonymousClass1.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(60489);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        a.this.f95467a.b();
                        cVar.b();
                    }
                });
                duration.start();
            }
        });
        MethodCollector.o(2637);
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void b(final c cVar) {
        this.f95467a.c();
        cVar.c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
        duration.setInterpolator(new com.ss.android.ugc.tools.view.c.c());
        final int measuredHeight = this.f95468b.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.filter.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(60490);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.f95467a.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                a.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.filter.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(60491);
            }

            public final void onAnimationEnd(Animator animator) {
                a.this.f95467a.d();
                a.this.d();
                cVar.d();
            }
        });
        duration.start();
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a(float f2, int i2, int i3) {
        this.f95468b.setTranslationY(((float) i3) + (((float) (i2 - i3)) * f2));
        this.f95468b.setAlpha(f2);
    }

    public a(FrameLayout frameLayout, View view, View view2) {
        this.f95469c = frameLayout;
        this.f95470d = view;
        this.f95468b = view2;
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b(float f2, int i2, int i3) {
        this.f95468b.setTranslationY(((float) (i3 - i2)) * f2);
        this.f95468b.setAlpha(1.0f - f2);
    }
}
