package com.ss.android.ugc.aweme.shortvideo.duet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.da.d;
import com.ss.android.ugc.aweme.da.e;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public e f126501a = new e.a();

    /* renamed from: b  reason: collision with root package name */
    public View f126502b;

    /* renamed from: c  reason: collision with root package name */
    private View f126503c;

    static {
        Covode.recordClassIndex(82984);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a() {
        this.f126503c.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void d() {
        this.f126503c.setVisibility(4);
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(e eVar) {
        this.f126501a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void a(final com.ss.android.ugc.aweme.da.c cVar) {
        this.f126502b.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.duet.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82985);
            }

            public final void run() {
                c.this.f126501a.a();
                c.this.a();
                cVar.a();
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
                final int measuredHeight = c.this.f126502b.getMeasuredHeight();
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.shortvideo.duet.c.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(82986);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        c.this.f126501a.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        c.this.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                        cVar.a(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.shortvideo.duet.c.AnonymousClass1.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(82987);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        c.this.f126501a.b();
                        cVar.b();
                    }
                });
                duration.start();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.da.d
    public final void b(final com.ss.android.ugc.aweme.da.c cVar) {
        this.f126501a.c();
        cVar.c();
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        final int measuredHeight = this.f126502b.getMeasuredHeight();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.duet.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(82988);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.this.f126501a.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                c.this.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
                cVar.b(valueAnimator.getAnimatedFraction(), 0, measuredHeight);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.shortvideo.duet.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(82989);
            }

            public final void onAnimationEnd(Animator animator) {
                c.this.f126501a.d();
                c.this.d();
                cVar.d();
            }
        });
        duration.start();
    }

    c(View view, View view2) {
        this.f126502b = view;
        this.f126503c = view2;
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void a(float f2, int i2, int i3) {
        this.f126502b.setTranslationY(((float) i3) + (((float) (i2 - i3)) * f2));
    }

    @Override // com.ss.android.ugc.aweme.da.c
    public final void b(float f2, int i2, int i3) {
        this.f126502b.setTranslationY(((float) (i3 - i2)) * f2);
    }
}
