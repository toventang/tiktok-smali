package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import h.f.b.l;
import h.m.p;
import java.util.Objects;

public final class d extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public float f73654a;

    /* renamed from: b  reason: collision with root package name */
    public float f73655b;

    /* renamed from: c  reason: collision with root package name */
    public float f73656c;

    /* renamed from: d  reason: collision with root package name */
    public int f73657d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f73658e;

    /* renamed from: f  reason: collision with root package name */
    private final TextExtraStruct f73659f;

    /* renamed from: g  reason: collision with root package name */
    private final int f73660g;

    /* renamed from: h  reason: collision with root package name */
    private final int f73661h;

    /* renamed from: i  reason: collision with root package name */
    private float f73662i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f73663j;

    /* renamed from: k  reason: collision with root package name */
    private String f73664k;

    /* renamed from: l  reason: collision with root package name */
    private float f73665l;

    /* renamed from: m  reason: collision with root package name */
    private int f73666m;
    private Bitmap n;
    private Rect o;

    static {
        Covode.recordClassIndex(45324);
    }

    private final String a(String str, Paint paint, float f2, float f3) {
        int measureText = (int) (paint.measureText(str) + f3);
        if (f2 == 0.0f || ((float) measureText) <= f2) {
            return str;
        }
        if (f2 > n.b(this.f73663j, 5.0f)) {
            f2 -= n.b(this.f73663j, 5.0f);
        }
        while (true) {
            int length = str.length();
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            str = p.a(str, str.length() - 1, length).toString();
            if (((float) ((int) (paint.measureText(str + "…") + f3))) <= f2 && !Character.isHighSurrogate(str.charAt(str.length() - 1))) {
                return str + "…";
            }
        }
    }

    public /* synthetic */ d(Context context, float f2, int i2, int i3, TextExtraStruct textExtraStruct) {
        this(context, f2, i2, i3, textExtraStruct, false);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        l.d(paint, "");
        if (i2 + 1 >= i3) {
            return 0;
        }
        float f2 = this.f73654a;
        if (f2 != -1.0f) {
            paint.setTextSize(f2);
        }
        String valueOf = String.valueOf(charSequence);
        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
        String substring = valueOf.substring(i2, i3);
        l.b(substring, "");
        String a2 = a(substring, paint, this.f73662i, this.f73655b);
        this.f73664k = a2;
        int measureText = (int) (paint.measureText(a2) + this.f73655b);
        this.f73657d = measureText;
        return measureText;
    }

    public d(Context context, float f2, int i2, int i3, TextExtraStruct textExtraStruct, boolean z) {
        int i4;
        l.d(context, "");
        l.d(textExtraStruct, "");
        MethodCollector.i(9026);
        this.f73658e = z;
        this.f73659f = textExtraStruct;
        this.f73660g = i2;
        this.f73661h = i3;
        this.f73662i = f2;
        this.f73663j = context;
        this.f73654a = -1.0f;
        this.f73664k = "";
        this.f73666m = -1;
        this.o = new Rect();
        int subtype = textExtraStruct.getSubtype();
        if (subtype != 2) {
            if (subtype != 3) {
                if (subtype == 4) {
                    i4 = 2131232269;
                } else if (!(subtype == 5 || subtype == 7)) {
                    i4 = -1;
                }
            }
            if (z) {
                i4 = 2131232408;
            } else {
                i4 = 2131232407;
            }
        } else if (z) {
            i4 = 2131232225;
        } else {
            i4 = 2131232224;
        }
        this.f73666m = i4;
        if (i4 != -1) {
            this.n = BitmapFactory.decodeResource(context.getResources(), this.f73666m);
        }
        MethodCollector.o(9026);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        l.d(canvas, "");
        l.d(paint, "");
        if (i2 + 1 < i3) {
            if (((float) this.f73657d) + f2 > this.f73662i) {
                this.f73659f.setClickable(false);
                canvas.drawText("…", f2, (float) i5, paint);
            } else if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i2 || charSequence.charAt(i2) != 8230) {
                this.f73659f.setClickable(true);
                Typeface a2 = b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
                if (a2 != null) {
                    try {
                        paint.setTypeface(a2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                float f3 = this.f73654a;
                if (f3 != -1.0f) {
                    paint.setTextSize(f3);
                }
                Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                paint.setColor(this.f73660g);
                float f4 = (float) i5;
                float f5 = fontMetrics.top + f4;
                float f6 = fontMetrics.bottom + f4;
                RectF rectF = new RectF(f2, f5, ((float) this.f73657d) + f2, f6);
                float f7 = this.f73656c;
                canvas.drawRoundRect(rectF, f7, f7, paint);
                if (this.f73664k.charAt(0) == '@') {
                    this.f73665l = paint.measureText(String.valueOf(this.f73664k.charAt(0)));
                    String str = this.f73664k;
                    int length = str.length();
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring = str.substring(1, length);
                    l.b(substring, "");
                    this.f73664k = substring;
                }
                paint.setColor(this.f73661h);
                canvas.drawText(this.f73664k, (this.f73655b / 2.0f) + f2 + this.f73665l, f4 - n.b(this.f73663j, 1.0f), paint);
                if (this.f73666m != -1) {
                    int i7 = (int) f5;
                    int i8 = (int) f6;
                    Bitmap bitmap = this.n;
                    if (bitmap != null) {
                        int i9 = i8 - i7;
                        int i10 = i9 / 4;
                        int i11 = i9 / 5;
                        int i12 = i7 + i11;
                        int i13 = i8 - i11;
                        int i14 = (int) (f2 + ((float) i10));
                        this.o.set(i14, i12, (i14 + i13) - i12, i13);
                        canvas.drawBitmap(bitmap, (Rect) null, this.o, paint);
                    }
                } else if (!TextUtils.isEmpty(this.f73659f.getAwemeId())) {
                    int i15 = (int) f5;
                    int i16 = (int) f6;
                    if (l.a((Object) Boolean.valueOf(this.f73658e), (Object) true)) {
                        paint.setColor(-16777216);
                    } else {
                        paint.setColor(-1);
                    }
                    paint.setPathEffect(new CornerPathEffect(n.b(this.f73663j, 2.0f)));
                    Path path = new Path();
                    float b2 = n.b(this.f73663j, 10.0f);
                    float f8 = ((float) (i16 + i15)) / 2.0f;
                    float sqrt = (float) Math.sqrt((Math.pow((double) b2, 2.0d) * 3.0d) / 4.0d);
                    float f9 = b2 / 2.0f;
                    path.moveTo((this.f73655b / 2.0f) + f2, f8 + f9);
                    path.lineTo((this.f73655b / 2.0f) + f2 + sqrt, f8);
                    path.lineTo(f2 + (this.f73655b / 2.0f), f8 - f9);
                    path.close();
                    canvas.drawPath(path, paint);
                }
            } else {
                this.f73659f.setClickable(false);
                canvas.drawText("…", f2, (float) i5, paint);
            }
        }
    }
}
