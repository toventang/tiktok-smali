package com.ss.android.ugc.aweme.views;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f144626a;

    static {
        Covode.recordClassIndex(94631);
    }

    public j(int i2) {
        this.f144626a = i2;
    }

    public final void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        l.d(charSequence, "");
        l.d(fontMetricsInt, "");
        int i6 = fontMetricsInt.descent;
        int i7 = this.f144626a;
        if (i6 > i7) {
            fontMetricsInt.descent = Math.min(i7, fontMetricsInt.descent);
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f144626a) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            fontMetricsInt.ascent = (-this.f144626a) + fontMetricsInt.descent;
            fontMetricsInt.top = fontMetricsInt.ascent;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f144626a) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f144626a;
        } else {
            int i8 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            int i9 = this.f144626a;
            if (i8 > i9) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.f144626a;
                return;
            }
            double d2 = (double) (((float) (i9 - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            fontMetricsInt.top -= (int) ((float) Math.ceil(d2));
            fontMetricsInt.bottom += (int) ((float) Math.floor(d2));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
