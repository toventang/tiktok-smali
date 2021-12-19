package com.bytedance.ies.dmt.ui.widget.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import com.bytedance.covode.number.Covode;

public class FontSpan extends TypefaceSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Typeface f33778a;

    static {
        Covode.recordClassIndex(20060);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.f33778a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.f33778a);
    }

    public FontSpan(String str) {
        super(str);
        this.f33778a = b.a().a(str);
    }

    private void a(Paint paint) {
        int style;
        String family = getFamily();
        Typeface typeface = paint.getTypeface();
        if (typeface == null) {
            style = 0;
        } else {
            style = typeface.getStyle();
        }
        Typeface create = Typeface.create(family, style);
        int style2 = style & (create.getStyle() ^ -1);
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(create);
    }

    private void a(Paint paint, Typeface typeface) {
        int style;
        if (typeface == null) {
            a(paint);
            return;
        }
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            style = 0;
        } else {
            style = typeface2.getStyle();
        }
        int style2 = style & (typeface.getStyle() ^ -1);
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if (d.f33796b.equals(getFamily())) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
