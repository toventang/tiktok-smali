package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.bytedance.covode.number.Covode;

public class c implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f55996a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55997b;

    static {
        Covode.recordClassIndex(34995);
    }

    public int hashCode() {
        return this.f55996a + 31;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c) || this.f55996a != ((c) obj).f55996a) {
            return false;
        }
        return true;
    }

    public c(float f2, boolean z) {
        this.f55996a = (int) Math.ceil((double) f2);
        this.f55997b = z;
    }

    public void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        if (this.f55997b) {
            int i6 = fontMetricsInt.descent - fontMetricsInt.ascent;
            int i7 = this.f55996a;
            int i8 = (i7 - i6) / 2;
            fontMetricsInt.ascent -= i8;
            fontMetricsInt.descent += (i7 - i8) - i6;
            return;
        }
        int i9 = fontMetricsInt.descent;
        int i10 = this.f55996a;
        if (i9 > i10) {
            int min = Math.min(i10, fontMetricsInt.descent);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.descent > this.f55996a) {
            fontMetricsInt.bottom = fontMetricsInt.descent;
            int i11 = (-this.f55996a) + fontMetricsInt.descent;
            fontMetricsInt.ascent = i11;
            fontMetricsInt.top = i11;
        } else if ((-fontMetricsInt.ascent) + fontMetricsInt.bottom > this.f55996a) {
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.ascent + this.f55996a;
        } else {
            int i12 = (-fontMetricsInt.top) + fontMetricsInt.bottom;
            int i13 = this.f55996a;
            if (i12 > i13) {
                fontMetricsInt.top = fontMetricsInt.bottom - this.f55996a;
                return;
            }
            int round = Math.round(((float) (i13 - ((-fontMetricsInt.top) + fontMetricsInt.bottom))) / 2.0f);
            int round2 = Math.round(((float) (this.f55996a - (fontMetricsInt.descent - fontMetricsInt.ascent))) / 2.0f);
            fontMetricsInt.top -= round;
            fontMetricsInt.bottom += round;
            fontMetricsInt.ascent -= round2;
            fontMetricsInt.descent += round2;
        }
    }
}
