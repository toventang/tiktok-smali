package com.bytedance.ies.dmt.ui.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

public class a extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    public int f33344a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f33345b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33346c;

    static {
        Covode.recordClassIndex(19909);
    }

    public a(Drawable drawable) {
        this(drawable, (byte) 0);
    }

    public a(Context context, int i2) {
        super(context, i2);
    }

    private a(Drawable drawable, byte b2) {
        super(drawable);
        this.f33345b = null;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        Integer num = this.f33345b;
        if ((num != null && num.intValue() != i3 - i2 && this.f33346c) || (drawable = getDrawable()) == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i4 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i5 = (bounds.bottom - bounds.top) / 2;
            int i6 = i4 / 4;
            int i7 = i5 - i6;
            int i8 = -(i5 + i6);
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            fontMetricsInt.bottom = i7;
            fontMetricsInt.descent = i7;
        }
        return bounds.right + this.f33344a;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Integer num = this.f33345b;
        if (num == null || num.intValue() == i3 - i2 || !this.f33346c) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i7 = ((((fontMetricsInt.descent + i5) + i5) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f2 + ((float) this.f33344a), (float) i7);
            drawable.draw(canvas);
            canvas.restore();
            Integer num2 = this.f33345b;
            if (num2 != null && num2.intValue() != i3 - i2) {
                this.f33346c = true;
                return;
            }
            return;
        }
        this.f33346c = false;
    }
}
