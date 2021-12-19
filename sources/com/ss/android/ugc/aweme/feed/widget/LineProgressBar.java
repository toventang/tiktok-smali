package com.ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.Collection;

public class LineProgressBar extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public View f95171a;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f95172b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f95173c;

    /* renamed from: d  reason: collision with root package name */
    private View f95174d;

    /* renamed from: e  reason: collision with root package name */
    private View f95175e;

    /* renamed from: f  reason: collision with root package name */
    private float f95176f;

    /* renamed from: g  reason: collision with root package name */
    private ObjectAnimator f95177g;

    /* renamed from: h  reason: collision with root package name */
    private ObjectAnimator f95178h;

    static {
        Covode.recordClassIndex(60315);
    }

    private void d() {
        this.f95173c = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.feed.widget.LineProgressBar.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60316);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float intValue = (float) ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (intValue > 0.0f && intValue <= 100.0f) {
                    float f2 = intValue / 100.0f;
                    LineProgressBar.this.f95171a.setAlpha(f2);
                    LineProgressBar.this.f95171a.setScaleX(f2 * 0.8f);
                } else if (intValue > 100.0f && intValue <= 200.0f) {
                    float f3 = (intValue - 100.0f) / 100.0f;
                    LineProgressBar.this.f95171a.setAlpha(1.0f - f3);
                    LineProgressBar.this.f95171a.setScaleX((f3 * 0.2f) + 0.8f);
                }
            }
        };
    }

    private void f() {
        e();
        this.f95177g.start();
    }

    private void e() {
        if (b.a((Collection) this.f95177g.getListeners())) {
            this.f95177g.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.ugc.aweme.feed.widget.LineProgressBar.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(60317);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (b.a((Collection) LineProgressBar.this.f95172b.getListeners())) {
                        LineProgressBar.this.f95172b.addUpdateListener(LineProgressBar.this.f95173c);
                    }
                    LineProgressBar.this.f95172b.start();
                }
            });
        }
    }

    public final void b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.f95178h = ofFloat;
        ofFloat.setDuration(300L);
        this.f95178h.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.feed.widget.LineProgressBar.AnonymousClass3 */

            static {
                Covode.recordClassIndex(60318);
            }

            public final void onAnimationEnd(Animator animator) {
                if (LineProgressBar.this.f95172b != null) {
                    LineProgressBar.this.f95172b.cancel();
                }
                LineProgressBar.this.setAlpha(1.0f);
                LineProgressBar.this.setVisibility(4);
            }
        });
        this.f95178h.start();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f95172b;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f95172b.cancel();
        }
        ObjectAnimator objectAnimator = this.f95177g;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f95177g.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f95178h;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
            this.f95178h.cancel();
        }
    }

    public final void a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (this.f95172b == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
            this.f95172b = ofInt;
            ofInt.setDuration(600L);
            this.f95172b.setRepeatCount(-1);
            this.f95172b.addUpdateListener(this.f95173c);
        }
        if (this.f95177g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f95174d, "alpha", 0.0f, 1.0f);
            this.f95177g = ofFloat;
            ofFloat.setDuration(300L);
            e();
        }
        ObjectAnimator objectAnimator = this.f95178h;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f95178h.cancel();
            f();
        } else if (!this.f95177g.isRunning() && !this.f95172b.isRunning()) {
            f();
        }
    }

    public LineProgressBar(Context context) {
        super(context);
        MethodCollector.i(4919);
        a(context);
        MethodCollector.o(4919);
    }

    private void a(Context context) {
        MethodCollector.i(1018);
        View inflate = LayoutInflater.from(context).inflate(R.layout.bjk, this);
        this.f95175e = inflate;
        this.f95171a = inflate.findViewById(R.id.cak);
        this.f95174d = this.f95175e.findViewById(R.id.cac);
        this.f95171a.setAlpha(0.0f);
        this.f95174d.setAlpha(0.0f);
        this.f95176f = ((float) n.a(getContext())) - n.b(getContext(), 30.0f);
        d();
        MethodCollector.o(1018);
    }

    public LineProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1012);
        a(context);
        MethodCollector.o(1012);
    }
}
