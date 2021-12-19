package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.aj;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public Context f81093a;

    /* renamed from: b  reason: collision with root package name */
    public int f81094b;

    /* renamed from: c  reason: collision with root package name */
    protected int f81095c;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f81096d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f81097e;

    static {
        Covode.recordClassIndex(50400);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Animator animator);

    /* access modifiers changed from: protected */
    public abstract void a(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    public abstract void b(Animator animator);

    /* access modifiers changed from: protected */
    public abstract void b(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    public abstract void c(Animator animator);

    /* access modifiers changed from: protected */
    public abstract void d(Animator animator);

    public void a() {
        a(true);
    }

    private void c() {
        ValueAnimator valueAnimator = this.f81097e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f81097e.end();
        }
        ValueAnimator valueAnimator2 = this.f81096d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f81096d.end();
        }
    }

    public void b() {
        long j2;
        c();
        if (this.f81095c != 0) {
            if (this.f81097e == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f81097e = valueAnimator;
                valueAnimator.setFloatValues(0.0f, 1.0f);
                ValueAnimator valueAnimator2 = this.f81097e;
                int i2 = this.f81094b;
                if (i2 == 0) {
                    j2 = 200;
                } else {
                    j2 = (long) i2;
                }
                valueAnimator2.setDuration(j2);
                this.f81097e.setInterpolator(new aj(0.32f, 0.94f, 0.6f));
                this.f81097e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.discover.helper.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(50403);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        b.this.b(valueAnimator);
                    }
                });
                this.f81097e.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.discover.helper.b.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(50404);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        b.this.d(animator);
                        b.this.f81095c = 0;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        b.this.c(animator);
                    }
                });
            }
            this.f81097e.start();
        }
    }

    public b(Context context) {
        this.f81093a = context;
    }

    public final void a(boolean z) {
        long j2;
        c();
        if (this.f81095c != 1) {
            if (this.f81096d == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f81096d = valueAnimator;
                valueAnimator.setFloatValues(0.0f, 1.0f);
                int i2 = this.f81094b;
                if (i2 == 0) {
                    j2 = 200;
                } else {
                    j2 = (long) i2;
                }
                if (!z) {
                    j2 = 0;
                }
                this.f81096d.setDuration(j2);
                this.f81096d.setInterpolator(new aj(0.32f, 0.94f, 0.6f));
                this.f81096d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.discover.helper.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(50401);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        b.this.a(valueAnimator);
                    }
                });
                this.f81096d.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.discover.helper.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(50402);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        b.this.b(animator);
                        b.this.f81095c = 1;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        b.this.a(animator);
                    }
                });
            }
            this.f81096d.start();
        }
    }
}
