package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final dg f94596a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f94597b;

    /* renamed from: c  reason: collision with root package name */
    private final int f94598c;

    static {
        Covode.recordClassIndex(60042);
    }

    dj(dg dgVar, boolean z, int i2) {
        this.f94596a = dgVar;
        this.f94597b = z;
        this.f94598c = i2;
    }

    public final void run() {
        dg dgVar = this.f94596a;
        boolean z = this.f94597b;
        int i2 = this.f94598c;
        if (z) {
            dgVar.f94579f.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dgVar.f94579f, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.setRepeatCount(0);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.feed.ui.dg.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(60036);
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    dg.this.f94581h = false;
                }
            });
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dgVar.f94578e, "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(500L);
            ofFloat2.addListener(new AnimatorListenerAdapter(i2, ofFloat) {
                /* class com.ss.android.ugc.aweme.feed.ui.dg.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ int f94589a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ObjectAnimator f94590b;

                static {
                    Covode.recordClassIndex(60037);
                }

                public final void onAnimationStart(Animator animator) {
                    dg.this.f94581h = true;
                    dg.this.f94578e.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    dg.this.f94578e.setVisibility(8);
                    dg.this.f94578e.setAlpha(1.0f);
                    dg.this.b(this.f94589a);
                    this.f94590b.start();
                }

                {
                    this.f94589a = r2;
                    this.f94590b = r3;
                }
            });
            ofFloat2.start();
            return;
        }
        dgVar.f94578e.setVisibility(8);
        dgVar.f94579f.setAlpha(1.0f);
        dgVar.b(i2);
    }
}
