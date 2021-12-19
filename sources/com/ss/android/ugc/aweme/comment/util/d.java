package com.ss.android.ugc.aweme.comment.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gb;

public final class d {
    static {
        Covode.recordClassIndex(44862);
    }

    public static class a extends ReplacementSpan {

        /* renamed from: a  reason: collision with root package name */
        private int f72830a;

        /* renamed from: b  reason: collision with root package name */
        private int f72831b;

        static {
            Covode.recordClassIndex(44863);
        }

        private TextPaint a(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f72830a);
            textPaint.setColor(this.f72831b);
            return textPaint;
        }

        public a(int i2, int i3) {
            this.f72830a = i2;
            this.f72831b = i3;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
            float measureText;
            if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71353b) {
                measureText = a(paint).measureText(charSequence.toString().substring(i2, i3));
            } else {
                measureText = a(paint).measureText(charSequence.subSequence(i2, i3).toString());
            }
            return (int) measureText;
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
            String str;
            if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71353b) {
                str = charSequence.toString().substring(i2, i3);
            } else {
                charSequence = charSequence.subSequence(i2, i3);
                str = "";
            }
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a2 = a(paint);
            Paint.FontMetricsInt fontMetricsInt2 = a2.getFontMetricsInt();
            if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71353b) {
                canvas.drawText(str, f2, (float) (i5 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a2);
            } else {
                canvas.drawText(charSequence.toString(), f2, (float) (i5 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a2);
            }
        }
    }

    public static class b extends ReplacementSpan {

        /* renamed from: a  reason: collision with root package name */
        private int f72832a;

        /* renamed from: b  reason: collision with root package name */
        private int f72833b;

        /* renamed from: c  reason: collision with root package name */
        private Typeface f72834c;

        /* renamed from: d  reason: collision with root package name */
        private int f72835d = -1;

        /* renamed from: e  reason: collision with root package name */
        private int f72836e = -1;

        static {
            Covode.recordClassIndex(44864);
        }

        private TextPaint a(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f72832a);
            textPaint.setColor(this.f72833b);
            return textPaint;
        }

        private TextPaint b(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f72832a);
            textPaint.setColor(this.f72833b);
            textPaint.setTypeface(this.f72834c);
            return textPaint;
        }

        public b(int i2, int i3, Typeface typeface, int i4, int i5) {
            this.f72832a = i2;
            this.f72833b = i3;
            this.f72834c = typeface;
            this.f72835d = i4;
            this.f72836e = i5;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
            float measureText;
            if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71353b) {
                measureText = a(paint).measureText(charSequence.toString().substring(i2, i3));
            } else {
                measureText = a(paint).measureText(charSequence.subSequence(i2, i3).toString());
            }
            return (int) measureText;
        }

        private void a(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, Paint paint, boolean z) {
            String str;
            TextPaint a2;
            if (i2 >= 0 && i3 <= charSequence.length() && i3 - i2 >= 0) {
                if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71353b) {
                    str = charSequence.toString().substring(i2, i3);
                } else {
                    charSequence = charSequence.subSequence(i2, i3);
                    str = "";
                }
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                if (z) {
                    a2 = b(paint);
                } else {
                    a2 = a(paint);
                }
                Paint.FontMetricsInt fontMetricsInt2 = a2.getFontMetricsInt();
                if (com.ss.android.ugc.aweme.comment.adapter.d.a().f71353b) {
                    canvas.drawText(str, f2, (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a2);
                } else {
                    canvas.drawText(charSequence.toString(), f2, (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a2);
                }
            }
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = i2;
            int i14 = i3;
            boolean a2 = gb.a();
            if (a2) {
                String charSequence2 = charSequence.toString();
                int i15 = this.f72836e;
                if ((i14 - i15) - 1 >= i13) {
                    i11 = (i14 - i15) - 1;
                } else {
                    i11 = i13;
                }
                int measureText = (int) b(paint).measureText(charSequence2.substring(i11, i14));
                int i16 = this.f72836e;
                if ((i14 - i16) - 1 >= i13) {
                    i12 = (i14 - i16) - 1;
                } else {
                    i12 = i14;
                }
                a(canvas, charSequence, i13, i12, f2 + ((float) measureText), i5, paint, false);
            } else {
                int i17 = this.f72835d;
                if (i17 <= 0 || i17 + i13 > charSequence.length()) {
                    i7 = i14;
                } else {
                    i7 = this.f72835d + i13;
                }
                a(canvas, charSequence, i13, i7, f2, i5, paint, false);
            }
            if (this.f72835d >= 0 && (i8 = this.f72836e) >= 0) {
                if (a2) {
                    if ((i14 - i8) - 1 >= i13) {
                        i13 = (i14 - i8) - 1;
                    }
                    a(canvas, charSequence, i13, i14, f2, i5, paint, true);
                    return;
                }
                String charSequence3 = charSequence.toString();
                int i18 = this.f72835d;
                if (i13 + i18 <= i14) {
                    i9 = i18 + i13;
                } else {
                    i9 = i14;
                }
                int measureText2 = (int) a(paint).measureText(charSequence3.substring(i13, i9));
                int i19 = this.f72835d;
                if (i19 <= 0 || i19 + i13 > charSequence.length()) {
                    i10 = i13;
                } else {
                    i10 = this.f72835d + i13;
                }
                if (this.f72835d + i13 + this.f72836e <= charSequence.length()) {
                    i14 = this.f72835d + i13 + this.f72836e;
                }
                a(canvas, charSequence, i10, i14, f2 + ((float) measureText2), i5, paint, true);
            }
        }
    }
}
