package com.ss.android.ugc.aweme.discover.m;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    public Typeface f81609a;

    static {
        Covode.recordClassIndex(50710);
    }

    public a(Typeface typeface) {
        this.f81609a = typeface;
    }

    private final void a(Paint paint) {
        Typeface typeface = this.f81609a;
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        l.d(textPaint, "");
        a(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        l.d(textPaint, "");
        a(textPaint);
    }
}
