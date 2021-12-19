package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.uikit.c.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class BarrageView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    View f22448a = findViewById(R.id.aia);

    /* renamed from: b  reason: collision with root package name */
    View f22449b = findViewById(R.id.ai9);

    /* renamed from: c  reason: collision with root package name */
    public boolean f22450c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22451d;

    static {
        Covode.recordClassIndex(13256);
    }

    public View getDanmuContainer() {
        return this.f22448a;
    }

    public View getDanmuInput() {
        return this.f22449b;
    }

    private int getLayoutId() {
        if (a.a(getContext())) {
            return R.layout.bef;
        }
        return R.layout.bee;
    }

    public final void a() {
        if (!this.f22450c && !this.f22451d) {
            if (a.a(getContext())) {
                c();
            } else {
                b();
            }
        }
    }

    private void b() {
        this.f22449b.setSelected(false);
        ((TransitionDrawable) this.f22448a.getBackground()).reverseTransition(100);
        ((TransitionDrawable) this.f22449b.getBackground()).reverseTransition(100);
        this.f22449b.animate().translationXBy(-n.b(getContext(), 22.0f)).setDuration(100).start();
    }

    private void c() {
        this.f22449b.setSelected(false);
        ((TransitionDrawable) this.f22448a.getBackground()).reverseTransition(100);
        ((TransitionDrawable) this.f22449b.getBackground()).reverseTransition(100);
        this.f22449b.animate().setListener(new Animator.AnimatorListener() {
            /* class com.bytedance.android.livesdk.widget.BarrageView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(13258);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                BarrageView.this.f22451d = true;
            }

            public final void onAnimationEnd(Animator animator) {
                BarrageView.this.f22451d = false;
                BarrageView.this.f22449b.setTranslationX(0.0f);
            }
        }).translationXBy(n.b(getContext(), 22.0f)).setDuration(100).start();
    }

    public final void a(boolean z) {
        if (!this.f22450c && !this.f22451d) {
            if (a.a(getContext())) {
                c(z);
            } else {
                b(z);
            }
        }
    }

    private void b(boolean z) {
        this.f22449b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f22448a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f22449b.getBackground()).startTransition(100);
            this.f22449b.animate().translationXBy(n.b(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f22448a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f22449b.getBackground()).startTransition(0);
        this.f22449b.setTranslationX(n.b(getContext(), 22.0f));
    }

    private void c(boolean z) {
        this.f22449b.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f22448a.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f22449b.getBackground()).startTransition(100);
            this.f22449b.animate().setListener(new Animator.AnimatorListener() {
                /* class com.bytedance.android.livesdk.widget.BarrageView.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(13257);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    BarrageView.this.f22450c = false;
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f22450c = true;
                }
            }).translationXBy(n.b(getContext(), -22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f22448a.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f22449b.getBackground()).startTransition(0);
        this.f22449b.setTranslationX(n.b(getContext(), -22.0f));
    }

    public BarrageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1332);
        inflate(getContext(), getLayoutId(), this);
        MethodCollector.o(1332);
    }
}
