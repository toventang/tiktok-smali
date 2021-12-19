package com.ss.android.ugc.aweme.shortvideo.aa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private int f124809a;

    /* renamed from: b  reason: collision with root package name */
    private final float f124810b = 22.0f;

    /* renamed from: c  reason: collision with root package name */
    private final float f124811c = 15.0f;

    /* renamed from: d  reason: collision with root package name */
    private final float f124812d = 17.0f;

    /* renamed from: e  reason: collision with root package name */
    private final float f124813e = 10.0f;

    /* renamed from: f  reason: collision with root package name */
    private final float f124814f = 5.0f;

    /* renamed from: g  reason: collision with root package name */
    private String f124815g = "";

    /* renamed from: h  reason: collision with root package name */
    private final Context f124816h;

    /* renamed from: i  reason: collision with root package name */
    private final View f124817i;

    static {
        Covode.recordClassIndex(82007);
    }

    public a(Context context, View view) {
        l.d(context, "");
        l.d(view, "");
        this.f124816h = context;
        this.f124817i = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        String str = "";
        l.d(paint, str);
        l.d(charSequence, str);
        int i4 = i2 + 1;
        if (i4 >= i3) {
            return 0;
        }
        paint.setTextSize(n.b(this.f124816h, this.f124811c - 2.0f));
        int measureText = (int) (paint.measureText(charSequence, i4, i3) + n.b(this.f124816h, this.f124810b));
        this.f124809a = measureText;
        View view = this.f124817i;
        if ((view instanceof b) && measureText >= ((b) view).getHookAtMaxWidth()) {
            int hookAtMaxWidth = ((b) this.f124817i).getHookAtMaxWidth();
            float b2 = n.b(this.f124816h, this.f124810b + 2.0f);
            l.d(charSequence, str);
            l.d(paint, str);
            String obj = charSequence.subSequence(i4, i3).toString();
            int measureText2 = (int) (paint.measureText(obj) + b2);
            if (hookAtMaxWidth != 0 && measureText2 > hookAtMaxWidth) {
                while (true) {
                    if (obj.length() != 1) {
                        int length = obj.length();
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                        obj = p.a(obj, obj.length() - 1, length).toString();
                        if (((int) (paint.measureText(obj + "…") + b2)) <= hookAtMaxWidth && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                            str = obj + "…";
                            break;
                        }
                    } else {
                        str = "…";
                        break;
                    }
                }
            }
            this.f124815g = str;
            this.f124809a = (int) (paint.measureText(str) + n.b(this.f124816h, this.f124810b));
        }
        return this.f124809a;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        l.d(canvas, "");
        l.d(charSequence, "");
        l.d(paint, "");
        int i7 = i2 + 1;
        if (i7 < i3) {
            if (((float) this.f124809a) + f2 > ((float) this.f124817i.getWidth())) {
                canvas.drawText("…", f2, (float) i5, paint);
            } else if (charSequence.length() <= i2 || charSequence.charAt(i2) != 8230) {
                paint.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint.setTextSize(n.b(this.f124816h, this.f124811c));
                paint.setColor(Color.parseColor("#0B161823"));
                paint.setPathEffect(new CornerPathEffect(n.b(this.f124816h, 2.0f)));
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                float f3 = fontMetrics.top;
                float f4 = fontMetrics.bottom;
                float f5 = (float) i5;
                float f6 = f5 + f3;
                canvas.drawRect(new RectF(f2, f6, ((float) this.f124809a) + f2, f5 + f4), paint);
                paint.setColor(color);
                float f7 = f4 - f3;
                float b2 = n.b(this.f124816h, this.f124813e);
                float b3 = n.b(this.f124816h, this.f124814f);
                Path path = new Path();
                float f8 = b3 + f2;
                float f9 = f6 + ((f7 - b2) / 2.0f);
                path.moveTo(f8, f9);
                path.lineTo(f8, f9 + b2);
                path.lineTo(f8 + (0.86f * b2), f9 + (b2 / 2.0f));
                path.close();
                canvas.drawPath(path, paint);
                paint.setPathEffect(pathEffect);
                paint.setFakeBoldText(true);
                paint.setTextSize(n.b(this.f124816h, this.f124811c - 2.0f));
                if (TextUtils.isEmpty(this.f124815g)) {
                    canvas.drawText(charSequence, i7, i3, f2 + n.b(this.f124816h, this.f124812d), f5 - n.b(this.f124816h, 1.0f), paint);
                } else {
                    canvas.drawText(this.f124815g, f2 + n.b(this.f124816h, this.f124812d), f5 - n.b(this.f124816h, 1.0f), paint);
                }
            } else {
                canvas.drawText("…", f2, (float) i5, paint);
            }
        }
    }
}
