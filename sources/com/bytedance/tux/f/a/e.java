package com.bytedance.tux.f.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import h.f.b.l;

public class e<T extends View> extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public int f45045a;

    /* renamed from: b  reason: collision with root package name */
    public int f45046b;

    /* renamed from: c  reason: collision with root package name */
    public final T f45047c;

    static {
        Covode.recordClassIndex(27484);
    }

    public e(T t) {
        l.c(t, "");
        this.f45047c = t;
        t.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i2 = Build.VERSION.SDK_INT;
        Context context = t.getContext();
        l.a((Object) context, "");
        t.setLayoutDirection(i.a(context) ? 1 : 0);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        l.c(paint, "");
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(10000, Integer.MIN_VALUE);
        this.f45047c.measure(makeMeasureSpec, makeMeasureSpec);
        T t = this.f45047c;
        t.layout(0, 0, t.getMeasuredWidth(), this.f45047c.getMeasuredHeight());
        return this.f45047c.getMeasuredWidth() + this.f45045a + this.f45046b;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int i7;
        l.c(canvas, "");
        l.c(paint, "");
        if (i.a(this.f45047c)) {
            i7 = this.f45046b;
        } else {
            i7 = this.f45045a;
        }
        float f3 = f2 + ((float) i7);
        float measuredHeight = ((float) i4) + (((float) ((i6 - i4) - this.f45047c.getMeasuredHeight())) / 2.0f);
        canvas.translate(f3, measuredHeight);
        this.f45047c.draw(canvas);
        canvas.translate(-f3, -measuredHeight);
    }
}
