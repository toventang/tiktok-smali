package com.bytedance.ies.dmt.ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;

public final class b extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public a f33378a;

    public interface a {
        static {
            Covode.recordClassIndex(19926);
        }

        void a(int i2, int i3);
    }

    static {
        Covode.recordClassIndex(19925);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return 0;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        a aVar = this.f33378a;
        if (aVar != null) {
            aVar.a((int) f2, i4);
        }
    }
}
