package com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public abstract class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    final RectF f129260a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    final Path f129261b = new Path();

    /* renamed from: c  reason: collision with root package name */
    final RectF f129262c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    boolean f129263d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f129264e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f129265f = false;

    /* renamed from: g  reason: collision with root package name */
    Rect f129266g;

    /* renamed from: h  reason: collision with root package name */
    Rect f129267h;

    /* renamed from: i  reason: collision with root package name */
    float f129268i;

    /* renamed from: j  reason: collision with root package name */
    final Rect f129269j = new Rect();

    /* renamed from: k  reason: collision with root package name */
    final h f129270k = new h(new Rect());

    /* renamed from: l  reason: collision with root package name */
    final h f129271l = new h(new Rect());

    static {
        Covode.recordClassIndex(84846);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        boolean a2;
        if (this.f129265f) {
            canvas.save();
            canvas.clipRect(this.f129262c);
            if (this.f129264e) {
                canvas.save();
                canvas.clipPath(this.f129261b);
                a2 = a(canvas, view, j2);
                canvas.restore();
            } else if (this.f129263d) {
                canvas.save();
                canvas.clipRect(this.f129260a);
                a2 = a(canvas, view, j2);
                canvas.restore();
            } else {
                a2 = a(canvas, view, j2);
            }
            canvas.restore();
            return a2;
        } else if (this.f129264e) {
            canvas.save();
            canvas.clipPath(this.f129261b);
            boolean a3 = a(canvas, view, j2);
            canvas.restore();
            return a3;
        } else if (!this.f129263d) {
            return a(canvas, view, j2);
        } else {
            canvas.save();
            canvas.clipRect(this.f129260a);
            boolean a4 = a(canvas, view, j2);
            canvas.restore();
            return a4;
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f129269j.set(0, 0, getWidth(), getHeight());
    }

    public final Animator a(Rect rect, Rect rect2, float f2, final boolean z) {
        this.f129266g = new Rect(rect);
        this.f129267h = new Rect(rect2);
        this.f129268i = f2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(84847);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b bVar = b.this;
                if (z) {
                    floatValue = 1.0f - floatValue;
                }
                if (bVar.f129266g != null && bVar.f129267h != null && !bVar.f129269j.isEmpty()) {
                    Rect a2 = bVar.f129270k.evaluate(floatValue, bVar.f129266g, bVar.f129269j);
                    Rect a3 = bVar.f129271l.evaluate(floatValue, bVar.f129267h, bVar.f129269j);
                    float f2 = bVar.f129268i * (1.0f - floatValue);
                    if (!a2.equals(bVar.f129269j) || !a3.equals(bVar.f129269j) || f2 != 0.0f) {
                        bVar.f129260a.set(a2);
                        int i2 = Build.VERSION.SDK_INT;
                        if (f2 > 0.0f) {
                            bVar.f129261b.rewind();
                            bVar.f129261b.addRoundRect(bVar.f129260a, f2, f2, Path.Direction.CCW);
                            bVar.f129264e = true;
                        } else {
                            bVar.f129263d = true;
                        }
                        bVar.f129262c.set(a3);
                        bVar.f129265f = !bVar.f129262c.equals(bVar.f129260a);
                        bVar.invalidate();
                        return;
                    }
                    bVar.f129263d = false;
                    bVar.f129264e = false;
                    bVar.f129265f = false;
                }
            }
        });
        return ofFloat;
    }
}
