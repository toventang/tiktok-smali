package com.ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.da.c;
import com.ss.android.ugc.aweme.da.d;
import com.ss.android.ugc.aweme.da.e;

public final class v implements d {

    /* renamed from: a  reason: collision with root package name */
    public e f131067a = new e.a();

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f131068b;

    /* renamed from: c  reason: collision with root package name */
    private View f131069c;

    /* renamed from: d  reason: collision with root package name */
    private View f131070d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f131071e;

    /* renamed from: f  reason: collision with root package name */
    private ValueAnimator f131072f;

    static {
        Covode.recordClassIndex(85895);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void c() {
        this.f131070d.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a() {
        this.f131070d.setVisibility(4);
        this.f131069c.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void d() {
        MethodCollector.i(5797);
        ValueAnimator valueAnimator = this.f131071e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.f131068b.removeView(this.f131069c);
        }
        MethodCollector.o(5797);
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(c cVar) {
        c(cVar);
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(e eVar) {
        this.f131067a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void b(final c cVar) {
        ValueAnimator valueAnimator = this.f131071e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.f131071e.cancel();
        }
        this.f131067a.c();
        c();
        cVar.c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        this.f131072f = duration;
        duration.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
        final int measuredHeight = this.f131069c.getMeasuredHeight();
        this.f131072f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.subtitle.v.AnonymousClass3 */

            static {
                Covode.recordClassIndex(85898);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v.this.f131067a.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                v.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        this.f131072f.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.shortvideo.subtitle.v.AnonymousClass4 */

            static {
                Covode.recordClassIndex(85899);
            }

            public final void onAnimationEnd(Animator animator) {
                v.this.f131067a.d();
                v.this.d();
                cVar.d();
            }
        });
        this.f131072f.start();
    }

    public final void c(final c cVar) {
        MethodCollector.i(5750);
        ValueAnimator valueAnimator = this.f131072f;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.f131072f.cancel();
        }
        this.f131069c.setAlpha(0.0f);
        if (this.f131069c.getParent() != null) {
            ((ViewGroup) this.f131069c.getParent()).removeView(this.f131069c);
        }
        this.f131068b.addView(this.f131069c);
        this.f131067a.a();
        a();
        cVar.a();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        this.f131071e = duration;
        duration.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
        final int measuredHeight = this.f131069c.getMeasuredHeight();
        this.f131071e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.subtitle.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85896);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                v.this.f131067a.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                v.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        this.f131071e.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.shortvideo.subtitle.v.AnonymousClass2 */

            static {
                Covode.recordClassIndex(85897);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                v.this.f131067a.b();
                cVar.b();
            }
        });
        this.f131071e.start();
        MethodCollector.o(5750);
    }

    public v(ViewGroup viewGroup, View view, View view2) {
        this.f131068b = viewGroup;
        this.f131070d = view;
        this.f131069c = view2;
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a(float f2, int i2, int i3) {
        this.f131069c.setTranslationY(((float) i3) + (((float) (i2 - i3)) * f2));
        this.f131069c.setAlpha(f2);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b(float f2, int i2, int i3) {
        this.f131069c.setTranslationY(((float) (i3 - i2)) * f2);
        this.f131069c.setAlpha(1.0f - f2);
    }
}
