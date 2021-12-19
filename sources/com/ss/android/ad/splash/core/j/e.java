package com.ss.android.ad.splash.core.j;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

public final class e extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private int f58654a;

    static {
        Covode.recordClassIndex(36361);
    }

    public e(int i2) {
        this.f58654a = i2;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += this.f58654a;
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += this.f58654a;
    }
}
