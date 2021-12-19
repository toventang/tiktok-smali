package com.bytedance.android.livesdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;

public class f extends ImageSpan {
    static {
        Covode.recordClassIndex(13356);
    }

    public f(Drawable drawable) {
        super(drawable);
    }

    protected static int a(int i2, Paint.FontMetricsInt fontMetricsInt, Drawable drawable) {
        return ((((fontMetricsInt.descent + i2) + i2) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
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
        return bounds.right;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                int a2 = a(i5, paint.getFontMetricsInt(), drawable);
                canvas.save();
                canvas.translate(f2, (float) a2);
                drawable.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        int a3 = a(i5, paint.getFontMetricsInt(), drawable);
        canvas.save();
        canvas.translate(f2, (float) a3);
        drawable.draw(canvas);
        canvas.restore();
    }
}
