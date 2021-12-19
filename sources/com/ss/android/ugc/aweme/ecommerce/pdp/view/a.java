package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    float f86831a;

    /* renamed from: b  reason: collision with root package name */
    int f86832b = -16777216;

    /* renamed from: c  reason: collision with root package name */
    RectF f86833c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    RectF f86834d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    float f86835e;

    /* renamed from: f  reason: collision with root package name */
    float f86836f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f86837g = true;

    /* renamed from: h  reason: collision with root package name */
    private RectF f86838h = new RectF();

    /* renamed from: i  reason: collision with root package name */
    private float f86839i;

    /* renamed from: j  reason: collision with root package name */
    private float f86840j;

    /* renamed from: k  reason: collision with root package name */
    private float f86841k;

    static {
        Covode.recordClassIndex(54408);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        String str;
        l.d(paint, "");
        if (charSequence != null) {
            str = charSequence.subSequence(i2, i3).toString();
        } else {
            str = null;
        }
        float measureText = paint.measureText(str);
        this.f86841k = measureText;
        float f2 = measureText + this.f86833c.left + this.f86833c.right;
        this.f86840j = f2;
        float f3 = this.f86831a;
        if (f2 < f3) {
            this.f86840j = f3;
        }
        float f4 = this.f86840j + this.f86834d.left + this.f86834d.right;
        this.f86839i = f4;
        return h.g.a.a(f4);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        float max;
        l.d(canvas, "");
        l.d(paint, "");
        float f3 = this.f86836f;
        float f4 = 0.0f;
        if (f3 == 0.0f) {
            max = 0.0f;
        } else {
            max = Math.max(0.0f, ((((float) (i6 - i4)) - f3) - this.f86833c.top) - this.f86833c.bottom);
        }
        float f5 = max / 2.0f;
        this.f86838h.set(f2 + this.f86834d.left, ((float) i4) + f5, (f2 + this.f86839i) - this.f86834d.right, ((float) i6) - f5);
        if (Build.VERSION.SDK_INT >= 21) {
            canvas.saveLayer(this.f86838h, null);
        } else {
            canvas.saveLayer(this.f86838h, null, 31);
        }
        int color = paint.getColor();
        paint.setColor(this.f86832b);
        RectF rectF = this.f86838h;
        float f6 = this.f86835e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
        float max2 = Math.max(0.0f, ((this.f86840j - this.f86841k) - this.f86833c.left) - this.f86833c.right);
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        float f7 = f2 + this.f86833c.left + this.f86834d.left;
        if (this.f86837g) {
            f4 = max2 / 2.0f;
        }
        canvas.drawText(valueOf, i2, i3, f7 + f4, (float) i5, paint);
        paint.setXfermode(null);
        paint.setColor(color);
        canvas.restore();
    }
}
