package com.ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.da.d;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.aweme.g.a;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public e f139273a = new e.a();

    /* renamed from: b  reason: collision with root package name */
    public View f139274b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f139275c = true;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f139276d;

    /* renamed from: e  reason: collision with root package name */
    private View f139277e;

    static {
        Covode.recordClassIndex(91051);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b() {
        this.f139274b.setTranslationY(0.0f);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a() {
        this.f139277e.setVisibility(0);
        this.f139274b.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void d() {
        MethodCollector.i(11915);
        this.f139276d.removeView(this.f139277e);
        MethodCollector.o(11915);
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(e eVar) {
        this.f139273a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(final com.ss.android.ugc.aweme.da.c cVar) {
        MethodCollector.i(11749);
        this.f139276d.removeAllViews();
        ViewGroup viewGroup = (ViewGroup) this.f139277e.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f139277e);
        }
        this.f139276d.addView(this.f139277e);
        if (this.f139275c) {
            this.f139276d.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.tools.beauty.views.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(91052);
                }

                public final void run() {
                    c.this.f139273a.a();
                    c.this.a();
                    cVar.a();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(490L);
                    duration.setInterpolator(new a());
                    final int measuredHeight = c.this.f139274b.getMeasuredHeight();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.ugc.aweme.tools.beauty.views.c.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(91053);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            c.this.f139273a.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            c.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                            cVar.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        }
                    });
                    duration.addListener(new AnimatorListenerAdapter() {
                        /* class com.ss.android.ugc.aweme.tools.beauty.views.c.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(91054);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            c.this.f139273a.b();
                            c.this.b();
                            cVar.b();
                        }
                    });
                    duration.start();
                }
            });
            MethodCollector.o(11749);
            return;
        }
        this.f139273a.b();
        b();
        cVar.b();
        MethodCollector.o(11749);
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void b(final com.ss.android.ugc.aweme.da.c cVar) {
        this.f139273a.c();
        cVar.c();
        if (this.f139275c) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            final int measuredHeight = this.f139274b.getMeasuredHeight();
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.ugc.aweme.tools.beauty.views.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(91055);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    c.this.f139273a.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    c.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    cVar.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.tools.beauty.views.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(91056);
                }

                public final void onAnimationEnd(Animator animator) {
                    c.this.f139273a.d();
                    c.this.d();
                    cVar.d();
                }
            });
            duration.start();
            return;
        }
        this.f139273a.d();
        d();
        cVar.d();
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b(float f2, int i2, int i3) {
        this.f139274b.setTranslationY(((float) (i3 - i2)) * f2);
    }

    public c(ViewGroup viewGroup, View view, View view2) {
        this.f139276d = viewGroup;
        this.f139277e = view;
        this.f139274b = view2;
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a(float f2, int i2, int i3) {
        float f3 = ((float) i3) + (((float) (i2 - i3)) * f2);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        this.f139274b.setTranslationY(f3);
    }
}
