package com.ss.android.ugc.tools.view.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

public class i extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    private Integer f150443a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f150444b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f150445c;

    static {
        Covode.recordClassIndex(98927);
    }

    public i(Drawable drawable) {
        super(drawable);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        Integer num = this.f150443a;
        if (num != null && num.intValue() != i3 - i2 && this.f150445c) {
            return 0;
        }
        Rect bounds = getDrawable().getBounds();
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
        return bounds.right + this.f150444b;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Integer num = this.f150443a;
        if (num == null || num.intValue() == i3 - i2 || !this.f150445c) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i7 = ((((fontMetricsInt.descent + i5) + i5) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f2 + ((float) this.f150444b), (float) i7);
            drawable.draw(canvas);
            canvas.restore();
            Integer num2 = this.f150443a;
            if (num2 != null && num2.intValue() != i3 - i2) {
                this.f150445c = true;
                return;
            }
            return;
        }
        this.f150445c = false;
    }
}
