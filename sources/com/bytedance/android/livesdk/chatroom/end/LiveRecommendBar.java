package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LiveRecommendBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f15387a = -1;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f15388b;

    /* renamed from: c  reason: collision with root package name */
    private a f15389c;

    public interface b {
        static {
            Covode.recordClassIndex(8508);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(8505);
    }

    public final void a() {
        removeCallbacks(this.f15389c);
        ValueAnimator valueAnimator = this.f15388b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f15388b.removeAllListeners();
            this.f15388b.cancel();
            n.a(this, this.f15387a, -3);
            this.f15388b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public b f15390a;

        static {
            Covode.recordClassIndex(8506);
        }

        public final void run() {
            if (LiveRecommendBar.this.f15387a <= 0) {
                LiveRecommendBar liveRecommendBar = LiveRecommendBar.this;
                liveRecommendBar.f15387a = liveRecommendBar.getMeasuredWidth();
            }
            LiveRecommendBar.this.a();
            LiveRecommendBar.this.f15388b = ValueAnimator.ofFloat(1.0f, 0.0f);
            LiveRecommendBar.this.f15388b.setDuration(5000L);
            LiveRecommendBar.this.f15388b.setInterpolator(new LinearInterpolator());
            LiveRecommendBar.this.f15388b.addUpdateListener(new i(this));
            LiveRecommendBar.this.f15388b.addListener(new Animator.AnimatorListener() {
                /* class com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8507);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (a.this.f15390a != null) {
                        a.this.f15390a.a();
                    }
                }
            });
            LiveRecommendBar.this.f15388b.start();
        }

        public a(b bVar) {
            this.f15390a = bVar;
        }
    }

    public final void a(b bVar) {
        removeCallbacks(this.f15389c);
        a aVar = new a(bVar);
        this.f15389c = aVar;
        post(aVar);
    }

    public LiveRecommendBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3039);
        MethodCollector.o(3039);
    }
}
