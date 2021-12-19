package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;

public abstract class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f68249b = d.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public boolean f68250a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f68251c = true;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f68252d;

    public final void b() {
        a(false);
    }

    public final void c() {
        a(false);
    }

    static {
        Covode.recordClassIndex(42031);
    }

    private void d() {
        Boolean bool = this.f68252d;
        if (bool != null) {
            b(bool.booleanValue());
            this.f68252d = null;
        }
    }

    public final void a() {
        a(true);
    }

    public final Animation.AnimationListener a(final Animation.AnimationListener animationListener) {
        return new Animation.AnimationListener() {
            /* class com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(42032);
            }

            public final void onAnimationRepeat(Animation animation) {
                Animation.AnimationListener animationListener = animationListener;
                if (animationListener != null) {
                    animationListener.onAnimationRepeat(animation);
                }
            }

            public final void onAnimationStart(Animation animation) {
                Animation.AnimationListener animationListener = animationListener;
                if (animationListener != null) {
                    animationListener.onAnimationStart(animation);
                }
            }

            public final void onAnimationEnd(Animation animation) {
                Animation.AnimationListener animationListener = animationListener;
                if (animationListener != null) {
                    animationListener.onAnimationEnd(animation);
                }
                d.this.a(true);
            }
        };
    }

    private void b(boolean z) {
        if (this.f68250a != z) {
            if (!this.f68251c) {
                this.f68252d = Boolean.valueOf(z);
            } else {
                this.f68250a = z;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (this.f68251c != z) {
            this.f68251c = z;
            if (z) {
                d();
            }
        }
    }

    public final void a(int i2, Animation.AnimationListener animationListener) {
        new StringBuilder("animateOffsetToCorrectPosition() called with: from = [").append(i2).append("], listener = [").append(animationListener).append("]");
        a(false);
    }

    public final void b(int i2, Animation.AnimationListener animationListener) {
        new StringBuilder("animateOffsetToStartPosition() called with: from = [").append(i2).append("], listener = [").append(animationListener).append("]");
        a(false);
    }
}
