package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ax extends ImageSpan {
    static {
        Covode.recordClassIndex(59910);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ax(Context context) {
        super(context, 2131231742);
        l.d(context, "");
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        l.d(canvas, "");
        l.d(charSequence, "");
        l.d(paint, "");
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        l.b(drawable, "");
        canvas.translate(f2, (float) (((((fontMetricsInt.descent + i5) + i5) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }
}
