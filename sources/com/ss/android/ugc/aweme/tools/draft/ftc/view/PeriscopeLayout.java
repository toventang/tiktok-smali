package com.ss.android.ugc.aweme.tools.draft.ftc.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.h.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.performance.h;
import com.ss.android.ugc.aweme.performance.i;
import com.ss.android.ugc.aweme.utils.af;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    int f139697a;

    /* renamed from: b  reason: collision with root package name */
    int f139698b;

    /* renamed from: c  reason: collision with root package name */
    FrameLayout.LayoutParams f139699c;

    /* renamed from: d  reason: collision with root package name */
    Drawable[] f139700d = new Drawable[2];

    /* renamed from: e  reason: collision with root package name */
    public Random f139701e = new Random();

    /* renamed from: f  reason: collision with root package name */
    Queue<ImageView> f139702f = new LinkedList();

    /* renamed from: g  reason: collision with root package name */
    int f139703g;

    /* renamed from: h  reason: collision with root package name */
    int f139704h;

    /* renamed from: i  reason: collision with root package name */
    int f139705i;

    /* renamed from: j  reason: collision with root package name */
    public int f139706j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f139707k = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    public Runnable f139708l = new Runnable() {
        /* class com.ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(91331);
        }

        public final void run() {
            ImageView imageView;
            float b2;
            float f2;
            MethodCollector.i(1529);
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (periscopeLayout.f139702f.isEmpty()) {
                ImageView imageView2 = new ImageView(periscopeLayout.getContext());
                imageView2.setLayoutParams(periscopeLayout.f139699c);
                periscopeLayout.addView(imageView2);
                imageView = imageView2;
            } else {
                imageView = periscopeLayout.f139702f.poll();
            }
            Drawable[] drawableArr = periscopeLayout.f139700d;
            int i2 = periscopeLayout.n;
            periscopeLayout.n = i2 + 1;
            imageView.setImageDrawable(drawableArr[i2 & 1]);
            if (periscopeLayout.t == -1.0f) {
                periscopeLayout.t = periscopeLayout.p;
                float f3 = periscopeLayout.q;
                periscopeLayout.u = periscopeLayout.q;
                if (periscopeLayout.f139709m) {
                    periscopeLayout.t = (((float) periscopeLayout.f139698b) - periscopeLayout.t) - periscopeLayout.u;
                    f3 = (((float) periscopeLayout.f139698b) - f3) - periscopeLayout.u;
                }
                periscopeLayout.v = new PointF(periscopeLayout.t, ((float) (periscopeLayout.f139697a - periscopeLayout.f139703g)) - periscopeLayout.r);
                periscopeLayout.w = new PointF(f3, periscopeLayout.o);
                if (periscopeLayout.f139709m) {
                    f2 = ((float) periscopeLayout.f139704h) - periscopeLayout.u;
                } else {
                    f2 = (float) (periscopeLayout.f139698b - periscopeLayout.f139704h);
                }
                periscopeLayout.x = new PointF(f2, ((float) (periscopeLayout.f139697a - periscopeLayout.f139703g)) - periscopeLayout.s);
            }
            af afVar = new af(periscopeLayout.v, periscopeLayout.w);
            Object[] objArr = new Object[2];
            objArr[0] = periscopeLayout.x;
            if (periscopeLayout.f139709m) {
                b2 = (((float) periscopeLayout.f139698b) - periscopeLayout.u) - n.b(periscopeLayout.getContext(), (float) (periscopeLayout.f139701e.nextInt(30) + 12));
            } else {
                b2 = n.b(periscopeLayout.getContext(), (float) (periscopeLayout.f139701e.nextInt(30) + 12));
            }
            objArr[1] = new PointF(b2, 0.0f);
            ValueAnimator ofObject = ValueAnimator.ofObject(afVar, objArr);
            a aVar = new a(imageView);
            ofObject.addUpdateListener(aVar);
            ofObject.setTarget(imageView);
            imageView.setTag(R.id.enc, aVar);
            ofObject.setDuration((long) periscopeLayout.f139706j);
            imageView.setTag(ofObject);
            ofObject.start();
            if (PeriscopeLayout.this.f139707k != null) {
                PeriscopeLayout.this.f139707k.postDelayed(this, (long) PeriscopeLayout.this.f139705i);
            }
            MethodCollector.o(1529);
        }
    };

    /* renamed from: m  reason: collision with root package name */
    boolean f139709m;
    int n = 0;
    float o;
    float p;
    float q;
    float r;
    float s;
    float t = -1.0f;
    float u = -1.0f;
    PointF v;
    PointF w;
    PointF x;

    static {
        Covode.recordClassIndex(91330);
    }

    public final void a() {
        i.a(new h() {
            /* class com.ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f139711a = 3000;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f139712b = 800;

            static {
                Covode.recordClassIndex(91332);
            }

            @Override // com.ss.android.ugc.aweme.performance.h
            public final void a() {
                PeriscopeLayout.this.f139706j = this.f139711a;
                PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
                periscopeLayout.f139705i = this.f139712b;
                periscopeLayout.f139707k.removeCallbacksAndMessages(null);
                periscopeLayout.f139707k.postDelayed(periscopeLayout.f139708l, (long) (periscopeLayout.f139701e.nextInt(4) * 100));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f139707k.removeCallbacksAndMessages(null);
    }

    public final void a(View view) {
        a aVar;
        if (view.getTag() != null) {
            this.f139702f.add(view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if ((view.getTag(R.id.enc) instanceof a) && (aVar = (a) view.getTag(R.id.enc)) != null) {
                aVar.f139714a = null;
            }
            view.setAlpha(0.0f);
            view.setScaleX(0.3f);
            view.setScaleY(0.3f);
            view.setRotation(0.0f);
            view.setTag(null);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public View f139714a;

        /* renamed from: c  reason: collision with root package name */
        private int f139716c;

        /* renamed from: d  reason: collision with root package name */
        private int f139717d;

        static {
            Covode.recordClassIndex(91333);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f139714a;
            if (view != null && view.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f139714a.setX(pointF.x);
                this.f139714a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f2 = animatedFraction / 0.7f;
                    this.f139714a.setAlpha(0.7f * f2);
                    float f3 = (f2 * 0.3f) + 0.3f;
                    this.f139714a.setScaleX(f3);
                    this.f139714a.setScaleY(f3);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f139714a.setAlpha(0.7f);
                    this.f139714a.setScaleX(0.6f);
                    this.f139714a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f4 = (animatedFraction - 0.8f) / 0.2f;
                    this.f139714a.setAlpha((1.0f - f4) * 0.7f);
                    float f5 = (f4 * 0.1f) + 0.6f;
                    this.f139714a.setScaleX(f5);
                    this.f139714a.setScaleY(f5);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.a(this.f139714a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f139714a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f139716c));
                } else {
                    this.f139714a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f139717d)) + ((float) (this.f139716c * 20)));
                }
            }
        }

        public a(View view) {
            int i2;
            this.f139714a = view;
            int i3 = 1;
            if (PeriscopeLayout.this.f139701e.nextBoolean()) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            this.f139716c = i2;
            this.f139717d = !PeriscopeLayout.this.f139701e.nextBoolean() ? -1 : i3;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(1546);
        super.onMeasure(i2, i3);
        this.f139698b = getMeasuredWidth();
        this.f139697a = getMeasuredHeight();
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        this.f139709m = z;
        this.t = -1.0f;
        MethodCollector.o(1546);
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1545);
        Drawable drawable = getResources().getDrawable(2131232985);
        Drawable drawable2 = getResources().getDrawable(2131232986);
        Drawable[] drawableArr = this.f139700d;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.f139703g = drawable.getIntrinsicHeight();
        this.f139704h = drawable.getIntrinsicWidth();
        this.f139699c = new FrameLayout.LayoutParams(this.f139704h, this.f139703g);
        this.o = n.b(getContext(), 51.0f);
        this.p = n.b(getContext(), 48.0f);
        this.q = n.b(getContext(), 20.0f);
        this.r = n.b(getContext(), 8.0f);
        this.s = n.b(getContext(), 2.0f);
        MethodCollector.o(1545);
    }
}
