package com.ss.android.ugc.aweme.feed.widget;

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
import com.ss.android.ugc.aweme.base.ui.a.b;
import com.ss.android.ugc.aweme.base.ui.a.c;
import com.ss.android.ugc.aweme.performance.h;
import com.ss.android.ugc.aweme.performance.i;
import com.ss.android.ugc.aweme.utils.af;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    int f95228a;

    /* renamed from: b  reason: collision with root package name */
    int f95229b;

    /* renamed from: c  reason: collision with root package name */
    FrameLayout.LayoutParams f95230c;

    /* renamed from: d  reason: collision with root package name */
    Drawable[] f95231d;

    /* renamed from: e  reason: collision with root package name */
    public Random f95232e = new Random();

    /* renamed from: f  reason: collision with root package name */
    Queue<ImageView> f95233f;

    /* renamed from: g  reason: collision with root package name */
    int f95234g;

    /* renamed from: h  reason: collision with root package name */
    int f95235h;

    /* renamed from: i  reason: collision with root package name */
    int f95236i;

    /* renamed from: j  reason: collision with root package name */
    public int f95237j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f95238k = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    Runnable f95239l = new Runnable() {
        /* class com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout.AnonymousClass1 */

        static {
            Covode.recordClassIndex(60336);
        }

        public final void run() {
            ImageView imageView;
            float b2;
            float f2;
            MethodCollector.i(8365);
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (periscopeLayout.f95233f.isEmpty()) {
                ImageView imageView2 = new ImageView(periscopeLayout.getContext());
                imageView2.setLayoutParams(periscopeLayout.f95230c);
                periscopeLayout.addView(imageView2);
                imageView = imageView2;
            } else {
                imageView = periscopeLayout.f95233f.poll();
            }
            Drawable[] drawableArr = periscopeLayout.f95231d;
            int i2 = periscopeLayout.n;
            periscopeLayout.n = i2 + 1;
            imageView.setImageDrawable(drawableArr[i2 & 1]);
            if (periscopeLayout.t == -1.0f) {
                periscopeLayout.t = periscopeLayout.p;
                float f3 = periscopeLayout.q;
                periscopeLayout.u = periscopeLayout.q;
                if (periscopeLayout.f95240m) {
                    periscopeLayout.t = (((float) periscopeLayout.f95229b) - periscopeLayout.t) - periscopeLayout.u;
                    f3 = (((float) periscopeLayout.f95229b) - f3) - periscopeLayout.u;
                }
                periscopeLayout.v = new PointF(periscopeLayout.t, ((float) (periscopeLayout.f95228a - periscopeLayout.f95234g)) - periscopeLayout.r);
                periscopeLayout.w = new PointF(f3, periscopeLayout.o);
                if (periscopeLayout.f95240m) {
                    f2 = ((float) periscopeLayout.f95235h) - periscopeLayout.u;
                } else {
                    f2 = (float) (periscopeLayout.f95229b - periscopeLayout.f95235h);
                }
                periscopeLayout.x = new PointF(f2, ((float) (periscopeLayout.f95228a - periscopeLayout.f95234g)) - periscopeLayout.s);
            }
            af afVar = new af(periscopeLayout.v, periscopeLayout.w);
            Object[] objArr = new Object[2];
            objArr[0] = periscopeLayout.x;
            if (periscopeLayout.f95240m) {
                b2 = (((float) periscopeLayout.f95229b) - periscopeLayout.u) - n.b(periscopeLayout.getContext(), (float) (periscopeLayout.f95232e.nextInt(30) + 12));
            } else {
                b2 = n.b(periscopeLayout.getContext(), (float) (periscopeLayout.f95232e.nextInt(30) + 12));
            }
            objArr[1] = new PointF(b2, 0.0f);
            ValueAnimator ofObject = ValueAnimator.ofObject(afVar, objArr);
            a aVar = new a(imageView);
            ofObject.addUpdateListener(aVar);
            ofObject.setTarget(imageView);
            imageView.setTag(R.id.ehs, aVar);
            ofObject.setDuration((long) periscopeLayout.f95237j);
            imageView.setTag(ofObject);
            int i3 = c.f68346b;
            l.d(ofObject, "");
            l.d(imageView, "");
            if (!b.b(i3)) {
                imageView.setVisibility(8);
            } else if (b.a(i3)) {
                ofObject.start();
            }
            if (PeriscopeLayout.this.f95238k != null) {
                PeriscopeLayout.this.f95238k.postDelayed(this, (long) PeriscopeLayout.this.f95236i);
            }
            MethodCollector.o(8365);
        }
    };

    /* renamed from: m  reason: collision with root package name */
    boolean f95240m;
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
        Covode.recordClassIndex(60335);
    }

    private void f() {
        this.f95238k.removeCallbacksAndMessages(null);
    }

    public final void a() {
        i.a(new h() {
            /* class com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f95242a = 3000;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f95243b = 800;

            static {
                Covode.recordClassIndex(60337);
            }

            @Override // com.ss.android.ugc.aweme.performance.h
            public final void a() {
                PeriscopeLayout.this.f95237j = this.f95242a;
                PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
                periscopeLayout.f95236i = this.f95243b;
                periscopeLayout.f95238k.removeCallbacksAndMessages(null);
                periscopeLayout.f95238k.postDelayed(periscopeLayout.f95239l, (long) (periscopeLayout.f95232e.nextInt(4) * 100));
            }
        });
    }

    public final void b() {
        f();
        this.f95238k.removeCallbacks(this.f95239l);
        e();
    }

    public final void c() {
        e();
        f();
        this.f95238k.removeCallbacks(this.f95239l);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f95238k.removeCallbacksAndMessages(null);
    }

    private void e() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            a(getChildAt(i2));
        }
    }

    private void d() {
        this.f95233f = new LinkedList();
        this.f95231d = new Drawable[2];
        Drawable drawable = getResources().getDrawable(2131233110);
        Drawable drawable2 = getResources().getDrawable(2131233111);
        Drawable[] drawableArr = this.f95231d;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.f95234g = drawable.getIntrinsicHeight();
        this.f95235h = drawable.getIntrinsicWidth();
        this.f95230c = new FrameLayout.LayoutParams(this.f95235h, this.f95234g);
        this.o = n.b(getContext(), 51.0f);
        this.p = n.b(getContext(), 48.0f);
        this.q = n.b(getContext(), 20.0f);
        this.r = n.b(getContext(), 8.0f);
        this.s = n.b(getContext(), 2.0f);
    }

    public PeriscopeLayout(Context context) {
        super(context);
        MethodCollector.i(8635);
        d();
        MethodCollector.o(8635);
    }

    public final void a(View view) {
        a aVar;
        if (view.getTag() != null) {
            this.f95233f.add(view);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if ((view.getTag(R.id.ehs) instanceof a) && (aVar = (a) view.getTag(R.id.ehs)) != null) {
                aVar.f95245a = null;
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
        public View f95245a;

        /* renamed from: c  reason: collision with root package name */
        private int f95247c;

        /* renamed from: d  reason: collision with root package name */
        private int f95248d;

        static {
            Covode.recordClassIndex(60338);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f95245a;
            if (view != null && view.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f95245a.setX(pointF.x);
                this.f95245a.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f2 = animatedFraction / 0.7f;
                    this.f95245a.setAlpha(0.7f * f2);
                    float f3 = (f2 * 0.3f) + 0.3f;
                    this.f95245a.setScaleX(f3);
                    this.f95245a.setScaleY(f3);
                } else if (((double) animatedFraction) <= 0.8d) {
                    this.f95245a.setAlpha(0.7f);
                    this.f95245a.setScaleX(0.6f);
                    this.f95245a.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f4 = (animatedFraction - 0.8f) / 0.2f;
                    this.f95245a.setAlpha((1.0f - f4) * 0.7f);
                    float f5 = (f4 * 0.1f) + 0.6f;
                    this.f95245a.setScaleX(f5);
                    this.f95245a.setScaleY(f5);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.a(this.f95245a);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f95245a.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.f95247c));
                } else {
                    this.f95245a.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.f95248d)) + ((float) (this.f95247c * 20)));
                }
            }
        }

        public a(View view) {
            int i2;
            this.f95245a = view;
            int i3 = 1;
            if (PeriscopeLayout.this.f95232e.nextBoolean()) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            this.f95247c = i2;
            this.f95248d = !PeriscopeLayout.this.f95232e.nextBoolean() ? -1 : i3;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        MethodCollector.i(8649);
        super.onMeasure(i2, i3);
        this.f95229b = getMeasuredWidth();
        this.f95228a = getMeasuredHeight();
        boolean z = true;
        if (v.e(this) != 1) {
            z = false;
        }
        this.f95240m = z;
        this.t = -1.0f;
        MethodCollector.o(8649);
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(8641);
        d();
        MethodCollector.o(8641);
    }
}
