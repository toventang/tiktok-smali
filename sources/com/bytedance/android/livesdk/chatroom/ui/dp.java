package com.bytedance.android.livesdk.chatroom.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;

public final class dp extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private int f16155a;

    /* renamed from: b  reason: collision with root package name */
    private int f16156b;

    /* renamed from: c  reason: collision with root package name */
    private int f16157c;

    /* renamed from: d  reason: collision with root package name */
    private int f16158d;

    /* renamed from: e  reason: collision with root package name */
    private String f16159e;

    /* renamed from: f  reason: collision with root package name */
    private int f16160f = y.a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    private int f16161g = y.a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    private int f16162h = y.a(6.0f);

    /* renamed from: i  reason: collision with root package name */
    private int f16163i = y.a(6.0f);

    /* renamed from: j  reason: collision with root package name */
    private int f16164j = y.a(0.0f);

    /* renamed from: k  reason: collision with root package name */
    private int f16165k = y.a(0.0f);

    static {
        Covode.recordClassIndex(8944);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        paint.setTextSize((float) this.f16155a);
        return ((int) paint.measureText(this.f16159e)) + this.f16160f + this.f16161g + this.f16162h + this.f16163i;
    }

    public dp(String str, int i2, int i3, int i4, int i5) {
        this.f16159e = str;
        this.f16156b = i2;
        this.f16155a = i3;
        this.f16158d = i4;
        this.f16157c = i5;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int a2 = y.a(1.0f);
        paint.setTextSize((float) this.f16155a);
        paint.setAntiAlias(true);
        RectF rectF = new RectF();
        rectF.left = (float) (((int) f2) + this.f16160f);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i7 = (((i6 - i4) - fontMetricsInt.descent) + fontMetricsInt.top) / 2;
        rectF.top = (float) ((i4 + i7) - this.f16164j);
        rectF.bottom = (float) ((i6 - i7) + this.f16165k);
        rectF.right = rectF.left + ((float) ((int) paint.measureText(this.f16159e))) + ((float) this.f16162h) + ((float) this.f16163i);
        paint.setColor(this.f16158d);
        int i8 = this.f16157c;
        canvas.drawRoundRect(rectF, (float) i8, (float) i8, paint);
        paint.setColor(this.f16156b);
        canvas.drawText(this.f16159e, f2 + ((float) this.f16160f) + ((float) this.f16162h), ((float) i5) + ((float) (((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) + fontMetricsInt.ascent) / 2) + a2)), paint);
    }
}
