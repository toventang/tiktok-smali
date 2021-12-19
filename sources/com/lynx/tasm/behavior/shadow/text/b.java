package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

public class b extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f55995a;

    static {
        Covode.recordClassIndex(34994);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }

    public b(float f2) {
        this.f55995a = f2;
    }

    private void a(TextPaint textPaint) {
        if (!Float.isNaN(this.f55995a)) {
            textPaint.setLetterSpacing(this.f55995a / textPaint.getTextSize());
        }
    }
}
