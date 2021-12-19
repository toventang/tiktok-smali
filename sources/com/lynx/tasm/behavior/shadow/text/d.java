package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class d extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f55998a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55999b;

    static {
        Covode.recordClassIndex(34996);
    }

    private int a() {
        int i2 = this.f55999b;
        if (i2 == 1) {
            return 700;
        }
        if (i2 == 0) {
            return 400;
        }
        return (i2 - 1) * 100;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f55998a), Integer.valueOf(this.f55999b));
    }

    public final void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }

    private void a(TextPaint textPaint) {
        boolean z;
        Typeface typeface = textPaint.getTypeface();
        int a2 = a();
        if (this.f55998a == 2) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setTypeface(Typeface.create(typeface, a2, z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55998a == dVar.f55998a && this.f55999b == dVar.f55999b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public d(int i2, int i3) {
        this.f55998a = i2;
        this.f55999b = i3;
    }
}
