package com.bytedance.ies.dmt.ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;

public final class c extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private String f33379a;

    static {
        Covode.recordClassIndex(19927);
    }

    public c(String str) {
        this.f33379a = str;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(this.f33379a);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        canvas.drawText(this.f33379a, f2, (float) (i5 - 10), paint);
    }
}
