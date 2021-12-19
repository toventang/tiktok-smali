package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class b extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private Context f144595a;

    /* renamed from: b  reason: collision with root package name */
    private String f144596b;

    /* renamed from: c  reason: collision with root package name */
    private float f144597c;

    /* renamed from: d  reason: collision with root package name */
    private float f144598d;

    /* renamed from: e  reason: collision with root package name */
    private float f144599e;

    /* renamed from: f  reason: collision with root package name */
    private float f144600f;

    /* renamed from: g  reason: collision with root package name */
    private float f144601g;

    /* renamed from: h  reason: collision with root package name */
    private float f144602h;

    /* renamed from: i  reason: collision with root package name */
    private int f144603i;

    /* renamed from: j  reason: collision with root package name */
    private int f144604j;

    static {
        Covode.recordClassIndex(94621);
    }

    public b(Context context, int i2, String str, int i3) {
        float f2;
        if (!TextUtils.isEmpty(str)) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            this.f144595a = applicationContext;
            this.f144603i = i2;
            this.f144596b = str;
            float applyDimension = TypedValue.applyDimension(1, 1.0f, applicationContext.getResources().getDisplayMetrics());
            this.f144602h = applyDimension;
            this.f144597c = 16.0f * applyDimension;
            this.f144599e = applyDimension * 4.0f;
            this.f144601g = 10.0f * applyDimension;
            this.f144604j = i3;
            this.f144600f = applyDimension * 3.0f;
            if (str.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.f144601g);
                paint.getTextBounds(str, 0, str.length(), rect);
                f2 = ((float) rect.width()) + (this.f144602h * 4.0f * 2.0f);
            } else {
                f2 = this.f144597c;
            }
            this.f144598d = f2;
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (this.f144598d + this.f144600f);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        float f3;
        Paint paint2 = new Paint();
        paint2.setColor(this.f144603i);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f4 = ((float) i5) + (((fontMetrics.descent - fontMetrics.ascent) - this.f144597c) / 2.0f) + fontMetrics.ascent;
        if (f2 != 0.0f) {
            f3 = this.f144600f + f2;
        } else {
            f3 = f2;
        }
        RectF rectF = new RectF(f3, f4, this.f144598d + f3, this.f144597c + f4);
        float f5 = this.f144599e;
        canvas.drawRoundRect(rectF, f5, f5, paint2);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f144601g);
        textPaint.setColor(this.f144604j);
        textPaint.setFakeBoldText(true);
        textPaint.setAntiAlias(true);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        if (f2 != 0.0f) {
            f2 += this.f144600f;
        }
        RectF rectF2 = new RectF(f2, f4, this.f144598d + f2, this.f144597c + f4);
        String str = this.f144596b;
        float f6 = this.f144602h;
        canvas.drawText(str, (f2 + (4.0f * f6)) - (f6 * 0.5f), ((float) ((int) ((((rectF2.bottom + rectF2.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f))) - (f6 * 0.5f), textPaint);
    }
}
