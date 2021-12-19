package com.bytedance.tux.extension.player.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Runnable f44950a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f44951b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final h f44952c = i.a((h.f.a.a) b.f44956a);

    public static Handler a() {
        return (Handler) f44952c.getValue();
    }

    private d() {
    }

    static final class b extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44956a = new b();

        static {
            Covode.recordClassIndex(27435);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(27432);
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f44953a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Animator.AnimatorListener f44954b;

        static {
            Covode.recordClassIndex(27433);
        }

        public a(View view, Animator.AnimatorListener animatorListener) {
            this.f44953a = view;
            this.f44954b = animatorListener;
        }

        public final void run() {
            float f2;
            View view = this.f44953a;
            if (view != null) {
                f2 = view.getAlpha();
            } else {
                f2 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f44953a, "alpha", f2, 0.0f);
            l.a((Object) ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.tux.extension.player.a.d.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f44955a;

                static {
                    Covode.recordClassIndex(27434);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f44955a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44955a.f44954b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationCancel(animator);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44955a.f44954b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                }

                public final void onAnimationRepeat(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44955a.f44954b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationRepeat(animator);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44955a.f44954b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationStart(animator);
                    }
                }
            });
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f44957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Animator.AnimatorListener f44958b;

        static {
            Covode.recordClassIndex(27436);
        }

        c(View view, Animator.AnimatorListener animatorListener) {
            this.f44957a = view;
            this.f44958b = animatorListener;
        }

        public final void run() {
            float f2;
            View view = this.f44957a;
            if (view != null) {
                f2 = view.getAlpha();
            } else {
                f2 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f44957a, "alpha", f2, 1.0f);
            l.a((Object) ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addListener(new Animator.AnimatorListener(this) {
                /* class com.bytedance.tux.extension.player.a.d.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f44959a;

                static {
                    Covode.recordClassIndex(27437);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f44959a = r1;
                }

                public final void onAnimationCancel(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44959a.f44958b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationCancel(animator);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44959a.f44958b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationEnd(animator);
                    }
                }

                public final void onAnimationRepeat(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44959a.f44958b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationRepeat(animator);
                    }
                }

                public final void onAnimationStart(Animator animator) {
                    Animator.AnimatorListener animatorListener = this.f44959a.f44958b;
                    if (animatorListener != null) {
                        animatorListener.onAnimationStart(animator);
                    }
                }
            });
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }

    public static Rect a(View view) {
        l.c(view, "");
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    public static /* synthetic */ void a(View view, Animator.AnimatorListener animatorListener, int i2) {
        if ((i2 & 4) != 0) {
            animatorListener = null;
        }
        c cVar = new c(view, animatorListener);
        f44950a = cVar;
        a().removeCallbacksAndMessages(null);
        a().postDelayed(cVar, 0);
    }
}
