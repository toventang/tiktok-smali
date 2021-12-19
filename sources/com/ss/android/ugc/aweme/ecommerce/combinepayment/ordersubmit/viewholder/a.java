package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends ImageSpan {
    static {
        Covode.recordClassIndex(53217);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Drawable drawable) {
        super(drawable);
        l.d(drawable, "");
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        l.d(canvas, "");
        l.d(paint, "");
        canvas.save();
        Drawable drawable = getDrawable();
        l.b(drawable, "");
        canvas.translate(f2, (float) (((i6 - i4) / 2) - (drawable.getBounds().height() / 2)));
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
