package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends ImageSpan {
    static {
        Covode.recordClassIndex(45321);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, int i2) {
        super(context, i2);
        l.d(context, "");
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        l.d(paint, "");
        l.d(charSequence, "");
        Drawable drawable = getDrawable();
        l.b(drawable, "");
        Rect bounds = drawable.getBounds();
        l.b(bounds, "");
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
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        l.d(canvas, "");
        l.d(charSequence, "");
        l.d(paint, "");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        l.b(drawable, "");
        canvas.translate(f2, (float) (i5 + (((fontMetricsInt.descent + fontMetricsInt.ascent) - drawable.getBounds().bottom) / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
