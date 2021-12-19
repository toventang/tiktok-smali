package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.internal.g;
import java.util.Iterator;
import java.util.LinkedList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f108562a;

    /* renamed from: b  reason: collision with root package name */
    float f108563b;

    /* renamed from: c  reason: collision with root package name */
    LinkedList<View> f108564c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    public ViewGroup f108565d;

    /* renamed from: e  reason: collision with root package name */
    public g.a f108566e;

    /* renamed from: f  reason: collision with root package name */
    private ValueAnimator f108567f;

    static {
        Covode.recordClassIndex(69584);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f108567f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f108567f = null;
        }
        if (this.f108562a == 2) {
            this.f108567f = ValueAnimator.ofFloat(1.0f, 0.5f);
        } else {
            this.f108567f = ValueAnimator.ofFloat(0.5f, 1.0f);
        }
        this.f108567f.setDuration(300L);
        this.f108567f.setInterpolator(new LinearInterpolator());
        this.f108567f.addUpdateListener(new c(this));
        this.f108567f.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.ugc.aweme.live.sdk.chatroom.ui.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69585);
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                int i2 = b.this.f108562a;
                if (i2 == 1) {
                    b.this.a(0.0f);
                } else if (i2 == 2) {
                    b.this.a(1.0f);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                b.this.f108565d.setEnabled(true);
                if (b.this.f108562a == 2) {
                    b.this.f108565d.setVisibility(8);
                    if (b.this.f108566e != null) {
                        b.this.f108566e.a();
                    }
                }
                int i2 = b.this.f108562a;
                if (i2 == 1) {
                    b.this.a(0.0f);
                } else if (i2 == 2) {
                    b.this.a(1.0f);
                }
            }

            public final void onAnimationStart(Animator animator) {
                b.this.f108565d.setEnabled(false);
                b.this.f108565d.setVisibility(0);
                if (b.this.f108562a == 1 && b.this.f108566e != null) {
                    b.this.f108566e.b();
                }
            }
        });
        this.f108567f.start();
    }

    public b(ViewGroup viewGroup) {
        this.f108565d = viewGroup;
    }

    public final void a(float f2) {
        Iterator<View> it = this.f108564c.iterator();
        while (it.hasNext()) {
            View next = it.next();
            next.setAlpha(f2);
            if (f2 == 0.0f) {
                next.setEnabled(false);
            }
            if (f2 == 1.0f) {
                next.setEnabled(true);
            }
        }
    }
}
