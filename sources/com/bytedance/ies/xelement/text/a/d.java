package com.bytedance.ies.xelement.text.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d extends ImageSpan {

    /* renamed from: a  reason: collision with root package name */
    public int f37437a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f37438b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f37439c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37440d;

    static {
        Covode.recordClassIndex(22511);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Drawable drawable, Integer num, CharSequence charSequence) {
        super(drawable);
        l.c(drawable, "");
        this.f37439c = num;
        this.f37438b = charSequence;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        l.c(paint, "");
        Integer num = this.f37439c;
        if (num != null && num.intValue() != i3 - i2 && this.f37440d) {
            return 0;
        }
        Drawable drawable = getDrawable();
        l.a((Object) drawable, "");
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i4 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i5 = (bounds.bottom - bounds.top) / 2;
            int i6 = i4 / 4;
            int i7 = i5 - i6;
            int i8 = -(i5 + i6);
            fontMetricsInt.ascent = i8;
            fontMetricsInt.top = i8;
            fontMetricsInt.bottom = i7;
            fontMetricsInt.descent = i7;
        }
        return bounds.right;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        l.c(canvas, "");
        l.c(paint, "");
        Integer num = this.f37439c;
        if (num == null || num.intValue() == i3 - i2 || !this.f37440d) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            l.a((Object) drawable, "");
            int i7 = ((((fontMetricsInt.descent + i5) + i5) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f2 + ((float) this.f37437a), (float) i7);
            drawable.draw(canvas);
            canvas.restore();
            Integer num2 = this.f37439c;
            if (num2 != null && num2.intValue() != i3 - i2) {
                this.f37440d = true;
                return;
            }
            return;
        }
        this.f37440d = false;
    }
}
