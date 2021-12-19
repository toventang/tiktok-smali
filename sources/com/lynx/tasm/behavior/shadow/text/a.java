package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;

public final class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    int f55993a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55994b;

    static {
        Covode.recordClassIndex(34993);
    }

    public a(int i2) {
        this.f55994b = i2;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt();
        int round = Math.round(paint.measureText(charSequence, i2, i3));
        this.f55993a = round;
        return round;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int i7;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int i8 = this.f55994b;
        if (i8 == 0) {
            i7 = -Math.round(fontMetrics.top);
        } else if (i8 == 2) {
            i7 = i6 - Math.round(fontMetrics.leading);
        } else if (i8 == 1) {
            i7 = (int) (((float) (Math.round(Math.abs(fontMetrics.ascent)) + i4)) + ((((float) (i6 - i4)) - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f));
            if (fontMetrics.leading == 0.0f) {
                i7 = (int) (((float) i7) + ((fontMetrics.descent / 2.0f) - paint.getStrokeMiter()));
            }
        } else {
            i7 = i5;
        }
        canvas.drawText(charSequence, i2, i3, f2, (float) i7, paint);
    }
}
