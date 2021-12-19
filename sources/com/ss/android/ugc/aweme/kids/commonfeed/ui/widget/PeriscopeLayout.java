package com.ss.android.ugc.aweme.kids.commonfeed.ui.widget;

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
import com.ss.android.ugc.aweme.utils.af;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    int f106314a;

    /* renamed from: b  reason: collision with root package name */
    int f106315b;

    /* renamed from: c  reason: collision with root package name */
    FrameLayout.LayoutParams f106316c;

    /* renamed from: d  reason: collision with root package name */
    Drawable[] f106317d = new Drawable[2];

    /* renamed from: e  reason: collision with root package name */
    public Random f106318e = new Random();

    /* renamed from: f  reason: collision with root package name */
    Queue<ImageView> f106319f = new LinkedList();

    /* renamed from: g  reason: collision with root package name */
    int f106320g;

    /* renamed from: h  reason: collision with root package name */
    int f106321h;

    /* renamed from: i  reason: collision with root package name */
    int f106322i;

    /* renamed from: j  reason: collision with root package name */
    public int f106323j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f106324k = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    public Runnable f106325l = new Runnable() {
        /* class com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.PeriscopeLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(67958);
        }

        public final void run() {
            ImageView imageView;
            float b2;
            float f2;
            MethodCollector.i(6286);
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (periscopeLayout.f106319f.isEmpty()) {
                ImageView imageView2 = new ImageView(periscopeLayout.getContext());
                imageView2.setLayoutParams(periscopeLayout.f106316c);
                periscopeLayout.addView(imageView2);
                imageView = imageView2;
            } else {
                imageView = periscopeLayout.f106319f.poll();
            }
            Drawable[] drawableArr = periscopeLayout.f106317d;
            int i2 = periscopeLayout.n;
            periscopeLayout.n = i2 + 1;
            imageView.setImageDrawable(drawableArr[i2 & 1]);
            if (periscopeLayout.t == -1.0f) {
                periscopeLayout.t = periscopeLayout.p;
                float f3 = periscopeLayout.q;
                periscopeLayout.u = periscopeLayout.q;
                if (periscopeLayout.f106326m) {
                    periscopeLayout.t = (((float) periscopeLayout.f106315b) - periscopeLayout.t) - periscopeLayout.u;
                    f3 = (((float) periscopeLayout.f106315b) - f3) - periscopeLayout.u;
                }
                periscopeLayout.v = new PointF(periscopeLayout.t, ((float) (periscopeLayout.f106314a - periscopeLayout.f106320g)) - periscopeLayout.r);
                periscopeLayout.w = new PointF(f3, periscopeLayout.o);
                if (periscopeLayout.f106326m) {
                    f2 = ((float) periscopeLayout.f106321h) - periscopeLayout.u;
                } else {
                    f2 = (float) (periscopeLayout.f106315b - periscopeLayout.f106321h);
                }
                periscopeLayout.x = new PointF(f2, ((float) (periscopeLayout.f106314a - periscopeLayout.f106320g)) - periscopeLayout.s);
            }
            af afVar = new af(periscopeLayout.v, periscopeLayout.w);
            Object[] objArr = new Object[2];
            objArr[0] = periscopeLayout.x;
            if (periscopeLayout.f106326m) {
                b2 = (((float) periscopeLayout.f106315b) - periscopeLayout.u) - n.b(periscopeLayout.getContext(), (float) (periscopeLayout.f106318e.nextInt(30) + 12));
            } else {
                b2 = n.b(periscopeLayout.getContext(), (float) (periscopeLayout.f106318e.nextInt(30) + 12));
            }
            objArr[1] = new PointF(b2, 0.0f);
            ValueAnimator ofObject = ValueAnimator.ofObject(afVar, objArr);
            a aVar = new a(imageView);
            ofObject.addUpdateListener(aVar);
            ofObject.setTarget(imageView);
            imageView.setTag(R.id.ehs, aVar);
            ofObject.setDuration((long) periscopeLayout.f106323j);
            imageView.setTag(ofObject);
            ofObject.start();
            if (PeriscopeLayout.this.f106324k != null) {
                PeriscopeLayout.this.f106324k.postDelayed(this, (long) PeriscopeLayout.this.f106322i);
            }
            MethodCollector.o(6286);
        }
    };

    /* renamed from: m  reason: collision with root package name */
    boolean f106326m;
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
        Covode.recordClassIndex(67957);
    }

    public final void c() {
        this.f106324k.removeCallbacksAndMessages(null);
    }

    public final void b() {
        a();
        c();
        this.f106324k.removeCallbacks(this.f106325l);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f106324k.removeCallbacksAndMessages(null);
    }

    public final void a() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            a(getChildAt(i2));
        }
    }

    public final void a(View view) {
        a aVar;
        if (view.getTag() != null) {
            this.f106319f.add(view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if ((view.getTag(R.id.ehs) instanceof a) && (aVar = (a) view.getTag(R.id.ehs)) != null) {
                aVar.f106331a = null;
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
        public View f106331a;

        /* renamed from: c  reason: collision with root package name */
        private int f106333c;

        /* renamed from: d  reason: collision with root package name */
        private int f106334d;

        static {
            Covode.recordClassIndex(67960);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f106331a;
            if (view != null && view.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f106331a.setX(pointF.x);
                this.f106331a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f2 = animatedFraction / 0.7f;
                    this.f106331a.setAlpha(0.7f * f2);
                    float f3 = (f2 * 0.3f) + 0.3f;
                    this.f106331a.setScaleX(f3);
                    this.f106331a.setScaleY(f3);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f106331a.setAlpha(0.7f);
                    this.f106331a.setScaleX(0.6f);
                    this.f106331a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f4 = (animatedFraction - 0.8f) / 0.2f;
                    this.f106331a.setAlpha((1.0f - f4) * 0.7f);
                    float f5 = (f4 * 0.1f) + 0.6f;
                    this.f106331a.setScaleX(f5);
                    this.f106331a.setScaleY(f5);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.a(this.f106331a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f106331a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f106333c));
                } else {
                    this.f106331a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f106334d)) + ((float) (this.f106333c * 20)));
                }
            }
        }

        public a(View view) {
            int i2;
            this.f106331a = view;
            int i3 = 1;
            if (PeriscopeLayout.this.f106318e.nextBoolean()) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            this.f106333c = i2;
            this.f106334d = !PeriscopeLayout.this.f106318e.nextBoolean() ? -1 : i3;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(6319);
        super.onMeasure(i2, i3);
        this.f106315b = getMeasuredWidth();
        this.f106314a = getMeasuredHeight();
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        this.f106326m = z;
        this.t = -1.0f;
        MethodCollector.o(6319);
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(6316);
        Drawable drawable = getResources().getDrawable(2131232985);
        Drawable drawable2 = getResources().getDrawable(2131232986);
        Drawable[] drawableArr = this.f106317d;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.f106320g = drawable.getIntrinsicHeight();
        this.f106321h = drawable.getIntrinsicWidth();
        this.f106316c = new FrameLayout.LayoutParams(this.f106321h, this.f106320g);
        this.o = n.b(getContext(), 51.0f);
        this.p = n.b(getContext(), 48.0f);
        this.q = n.b(getContext(), 20.0f);
        this.r = n.b(getContext(), 8.0f);
        this.s = n.b(getContext(), 2.0f);
        MethodCollector.o(6316);
    }
}
