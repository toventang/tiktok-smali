package com.ss.android.ugc.aweme.ug.guide;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class PlayView extends View {

    /* renamed from: a  reason: collision with root package name */
    Paint f141863a;

    /* renamed from: b  reason: collision with root package name */
    int f141864b;

    /* renamed from: c  reason: collision with root package name */
    int f141865c;

    /* renamed from: d  reason: collision with root package name */
    Path f141866d;

    /* renamed from: e  reason: collision with root package name */
    float f141867e;

    /* renamed from: f  reason: collision with root package name */
    float f141868f;

    /* renamed from: g  reason: collision with root package name */
    float f141869g;

    /* renamed from: h  reason: collision with root package name */
    float f141870h;

    /* renamed from: i  reason: collision with root package name */
    float f141871i;

    /* renamed from: j  reason: collision with root package name */
    float f141872j;

    /* renamed from: k  reason: collision with root package name */
    float f141873k;

    /* renamed from: l  reason: collision with root package name */
    float f141874l;

    /* renamed from: m  reason: collision with root package name */
    ValueAnimator f141875m;
    float n;

    static {
        Covode.recordClassIndex(92711);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.i(9483);
        super.onDraw(canvas);
        this.f141863a.setColor(this.f141864b);
        canvas.translate(this.f141872j, 0.0f);
        a(canvas);
        canvas.translate(0.0f, this.f141868f);
        a(canvas);
        canvas.translate(-this.f141872j, -this.f141868f);
        this.f141863a.setColor(this.f141865c);
        this.f141863a.setStrokeWidth(this.f141873k);
        float f2 = this.n;
        float f3 = this.f141868f;
        if (f2 > (-f3)) {
            float f4 = this.f141874l;
            if (f2 > (-f3) + f4) {
                canvas.drawLine(0.0f, f3 + f2, this.f141867e, f3 + f2, this.f141863a);
                MethodCollector.o(9483);
                return;
            }
            canvas.drawLine(f4, f3 + f2, this.f141867e - f4, f3 + f2, this.f141863a);
        }
        MethodCollector.o(9483);
    }

    private void a(Canvas canvas) {
        this.f141866d.reset();
        Path path = this.f141866d;
        float f2 = this.f141870h;
        path.moveTo((this.f141867e / 2.0f) - ((this.f141871i * f2) / 2.0f), (((this.f141868f / 2.0f) + f2) - this.f141869g) + this.n);
        Path path2 = this.f141866d;
        float f3 = this.f141867e;
        float f4 = this.f141870h;
        float f5 = this.f141871i;
        float f6 = this.f141868f;
        float f7 = this.n;
        float f8 = this.f141869g;
        path2.quadTo((f3 / 2.0f) - ((f4 * f5) / 2.0f), (f6 / 2.0f) + f4 + f7, ((f3 / 2.0f) - ((f4 * f5) / 2.0f)) + (f5 * f8), (((f6 / 2.0f) + f4) - f8) + f7);
        Path path3 = this.f141866d;
        float f9 = this.f141870h;
        float f10 = this.f141871i;
        float f11 = (this.f141867e / 2.0f) + ((f9 * f10) / 2.0f);
        float f12 = this.f141869g;
        path3.lineTo(f11 - ((f10 * f12) / 2.0f), (this.f141868f / 2.0f) + (f12 / 2.0f) + this.n);
        Path path4 = this.f141866d;
        float f13 = this.f141867e;
        float f14 = this.f141870h;
        float f15 = this.f141871i;
        float f16 = this.f141868f;
        float f17 = this.n;
        float f18 = this.f141869g;
        path4.quadTo((f13 / 2.0f) + ((f14 * f15) / 2.0f), (f16 / 2.0f) + f17, ((f13 / 2.0f) + ((f14 * f15) / 2.0f)) - ((f15 * f18) / 2.0f), ((f16 / 2.0f) - (f18 / 2.0f)) + f17);
        Path path5 = this.f141866d;
        float f19 = this.f141870h;
        float f20 = this.f141871i;
        float f21 = (this.f141867e / 2.0f) - ((f19 * f20) / 2.0f);
        float f22 = this.f141869g;
        path5.lineTo(f21 + (f20 * f22), ((this.f141868f / 2.0f) - f19) + f22 + this.n);
        Path path6 = this.f141866d;
        float f23 = this.f141867e;
        float f24 = this.f141870h;
        float f25 = this.f141871i;
        float f26 = this.f141868f;
        float f27 = this.n;
        path6.quadTo((f23 / 2.0f) - ((f24 * f25) / 2.0f), ((f26 / 2.0f) - f24) + f27, (f23 / 2.0f) - ((f25 * f24) / 2.0f), ((f26 / 2.0f) - f24) + this.f141869g + f27);
        canvas.drawPath(this.f141866d, this.f141863a);
    }

    public PlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static int a(Context context, float f2) {
        return (int) TypedValue.applyDimension(1, f2, context.getResources().getDisplayMetrics());
    }

    private PlayView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9111);
        this.f141871i = 1.5f;
        this.f141863a = new Paint();
        this.f141864b = Color.argb(191, 255, 255, 255);
        this.f141865c = Color.argb(30, 100, 100, 100);
        this.f141866d = new Path();
        this.f141873k = (float) a(context, 1.0f);
        this.f141870h = (float) a(context, 25.0f);
        float f2 = this.f141873k;
        this.f141874l = 3.0f * f2;
        this.f141869g = 10.0f * f2;
        this.f141872j = f2 * 8.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f141875m = ofFloat;
        ofFloat.setDuration(1000L);
        this.f141875m.setInterpolator(new DecelerateInterpolator(1.5f));
        this.f141875m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.ug.guide.PlayView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(92712);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PlayView playView = PlayView.this;
                playView.n = (-playView.f141868f) * floatValue;
                PlayView.this.invalidate();
            }
        });
        MethodCollector.o(9111);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f141867e = (float) i2;
        this.f141868f = (float) i3;
    }
}
