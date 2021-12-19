package com.lynx.tasm.behavior.ui.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public abstract class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public int f56357a;

    /* renamed from: b  reason: collision with root package name */
    public int f56358b;

    /* renamed from: c  reason: collision with root package name */
    public int f56359c;

    /* renamed from: d  reason: collision with root package name */
    public float f56360d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable.Callback f56361e;

    /* renamed from: f  reason: collision with root package name */
    private int f56362f;

    /* renamed from: g  reason: collision with root package name */
    private int f56363g;

    /* renamed from: h  reason: collision with root package name */
    private int f56364h;

    /* renamed from: i  reason: collision with root package name */
    private int f56365i;

    static {
        Covode.recordClassIndex(35179);
    }

    public abstract Drawable a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public void a(Drawable.Callback callback) {
        this.f56361e = callback;
    }

    private int a(Paint.FontMetricsInt fontMetricsInt) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i7 = this.f56357a + this.f56365i;
        switch (this.f56359c) {
            case 1:
                return -i7;
            case 2:
                i2 = fontMetricsInt.descent - i7;
                i3 = (int) (((float) i6) * 0.1f);
                return i2 - i3;
            case 3:
                i4 = fontMetricsInt.ascent;
                i5 = (int) (((float) i6) * 0.1f);
                return i4 + i5;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return fontMetricsInt.ascent;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            default:
                i4 = fontMetricsInt.ascent;
                i5 = (i6 - i7) / 2;
                return i4 + i5;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return fontMetricsInt.descent - i7;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i2 = -i7;
                i3 = (int) (this.f56360d * ((float) i6));
                return i2 - i3;
        }
    }

    public static void a(Spanned spanned, Drawable.Callback callback) {
        a[] aVarArr = (a[]) spanned.getSpans(0, spanned.length(), a.class);
        for (a aVar : aVarArr) {
            aVar.d();
            aVar.a(callback);
        }
    }

    public a(int i2, int i3, int[] iArr) {
        this.f56358b = i2;
        this.f56357a = i3;
        this.f56362f = iArr[0];
        this.f56363g = iArr[1];
        this.f56364h = iArr[0] + iArr[2];
        this.f56365i = iArr[1] + iArr[3];
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            if (fontMetricsInt.descent == fontMetricsInt.ascent) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            int a2 = a(fontMetricsInt);
            if (fontMetricsInt.ascent > a2) {
                fontMetricsInt.ascent = a2;
            }
            int i4 = fontMetricsInt.descent;
            int i5 = this.f56357a;
            int i6 = this.f56365i;
            if (i4 < a2 + i5 + i6) {
                fontMetricsInt.descent = a2 + i5 + i6;
            }
            if (fontMetricsInt.top > fontMetricsInt.ascent) {
                fontMetricsInt.top = fontMetricsInt.ascent;
            }
            if (fontMetricsInt.bottom < fontMetricsInt.descent) {
                fontMetricsInt.bottom = fontMetricsInt.descent;
            }
        }
        return this.f56358b + this.f56364h;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        if (a() != null) {
            Drawable a2 = a();
            canvas.save();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i7 = this.f56359c;
            if (i7 == 0) {
                i4 = i5 + ((((fontMetricsInt.ascent + fontMetricsInt.descent) - this.f56357a) - this.f56365i) / 2);
            } else if (i7 != 4) {
                if (i7 == 6) {
                    i4 = (((i6 + i4) - this.f56357a) - this.f56365i) / 2;
                } else if (i7 != 7) {
                    i4 = i5 + a(fontMetricsInt);
                } else {
                    i4 = (i6 - this.f56357a) - this.f56365i;
                }
            }
            canvas.translate(f2 + ((float) this.f56362f), (float) (i4 + this.f56363g));
            a2.draw(canvas);
            canvas.restore();
        }
    }
}
