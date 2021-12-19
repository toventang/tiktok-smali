package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

public class g extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private Typeface f56004a;

    static {
        Covode.recordClassIndex(34999);
    }

    public void updateMeasureState(TextPaint textPaint) {
    }

    public g(Typeface typeface) {
        this.f56004a = typeface;
    }

    public void updateDrawState(TextPaint textPaint) {
        Typeface typeface = this.f56004a;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
