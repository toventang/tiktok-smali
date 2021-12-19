package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;

public class h extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f56005a;

    static {
        Covode.recordClassIndex(35000);
    }

    public void updateMeasureState(TextPaint textPaint) {
    }

    public int hashCode() {
        return this.f56005a + 31;
    }

    public h(int i2) {
        this.f56005a = i2;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f56005a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h) || this.f56005a != ((h) obj).f56005a) {
            return false;
        }
        return true;
    }
}
