package com.bytedance.tux.f.a;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.f;
import com.bytedance.tux.b.g;
import com.bytedance.tux.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;

public final class b extends MetricAffectingSpan {

    /* renamed from: a  reason: collision with root package name */
    private Typeface f45025a;

    /* renamed from: b  reason: collision with root package name */
    private Float f45026b;

    static {
        Covode.recordClassIndex(27475);
    }

    public b() {
    }

    public /* synthetic */ b(int i2) {
        this(i2, false);
    }

    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            updateMeasureState(textPaint);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        l.c(textPaint, "");
        Typeface typeface = textPaint.getTypeface();
        Typeface typeface2 = this.f45025a;
        if (typeface2 != null && (!l.a(typeface, typeface2))) {
            textPaint.setTypeface(this.f45025a);
        }
        float textSize = textPaint.getTextSize();
        Float f2 = this.f45026b;
        if (f2 != null && (!l.a(textSize, f2))) {
            textPaint.setTextSize(f2.floatValue());
        }
    }

    public b(Typeface typeface, Float f2) {
        this();
        this.f45025a = typeface;
        this.f45026b = f2;
    }

    public b(int i2, boolean z) {
        this();
        Map<Integer, Object> map;
        com.bytedance.tux.b.b a2 = f.a((int) R.attr.ap4, i2);
        if (!(a2 == null || (map = a2.f44666a) == null)) {
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == g.h().f44668a) {
                    if (!z) {
                        g.h();
                        Object value = entry.getValue();
                        l.c(value, "");
                        float floatValue = ((Number) value).floatValue();
                        Resources system = Resources.getSystem();
                        l.a((Object) system, "");
                        this.f45026b = Float.valueOf(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
                    }
                } else if (intValue == g.j().f44668a) {
                    g.j();
                    Object value2 = entry.getValue();
                    l.c(value2, "");
                    this.f45025a = a.a((String) value2);
                }
            }
        }
    }
}
