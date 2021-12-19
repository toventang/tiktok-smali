package com.ss.android.ugc.aweme.editSticker.text.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.f.b;
import com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.tools.utils.o;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c {
    public float A;
    public TextPaint B = new TextPaint();
    public Paint C = new Paint();
    public Path D;
    public q E;
    public boolean F = false;
    public float G;
    public Paint H;
    public List<PointF> I = new ArrayList();
    public boolean J = false;
    private RectF K = new RectF();
    private RectF L = new RectF();
    private boolean M = true;
    private List<TextStickerTextWrap> N;
    private TextStickerString[] O;
    private float P;
    private Paint Q = new Paint(2);
    private float R;
    private float S;
    private float T;
    private Paint.FontMetrics U = new Paint.FontMetrics();

    /* renamed from: a  reason: collision with root package name */
    public Context f88371a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f88372b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public RectF f88373c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public Rect f88374d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f88375e;

    /* renamed from: f  reason: collision with root package name */
    public Path f88376f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f88377g;

    /* renamed from: h  reason: collision with root package name */
    public Rect f88378h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public RectF f88379i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    public Paint f88380j;

    /* renamed from: k  reason: collision with root package name */
    public int f88381k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f88382l = 0;

    /* renamed from: m  reason: collision with root package name */
    public float f88383m = 0.0f;
    public float n = 0.0f;
    public boolean o = false;
    public Paint p;
    public int q = 0;
    public float r = 60.0f;
    public int s = 20;
    public int t = 20;
    public int u;
    public int v;
    public int w = 20;
    public int x = 30;
    public int y = 10;
    public int z;

    static {
        Covode.recordClassIndex(55586);
    }

    public final void a(List<TextStickerTextWrap> list) {
        this.N = list;
        if (t.a(list)) {
            if (this.q == -1) {
                this.B.setColor(-16777216);
            } else {
                this.B.setColor(this.E.getResources().getColor(R.color.a_));
            }
        }
        this.O = t.b(list);
    }

    public final RectF a() {
        RectF rectF = new RectF();
        rectF.set(this.f88372b);
        rectF.set(rectF.left - ((float) this.w), rectF.top - ((float) this.w), rectF.right + ((float) this.w), rectF.bottom + ((float) this.w));
        return rectF;
    }

    private int a(List<InteractTextStructWrap> list, String str) {
        if (!t.a(list, str.length())) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            InteractTextStructWrap interactTextStructWrap = list.get(i3);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                int start = interactTextStructWrap.getRange().getStart();
                if (start < str.length() && str.charAt(start) == ' ') {
                    start++;
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    i2 = (int) (((float) (i2 - t.a(this.B, str, start, start + 1))) + this.L.width() + this.A);
                }
            }
        }
        return i2;
    }

    public final void a(Canvas canvas, b bVar) {
        char c2;
        char c3;
        while (true) {
            this.R = bVar.f88365c.x;
            this.S = bVar.f88365c.y;
            this.B.setTextSize(((float) bVar.f88367e) * bVar.f88363a);
            this.T = f.a(this.f88371a, this.B.getTextSize());
            this.B.getFontMetrics(this.U);
            this.S += this.U.bottom * 2.0f;
            this.G = bVar.f88364b;
            if (this.O != null) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    TextStickerString[] textStickerStringArr = this.O;
                    if (i2 >= textStickerStringArr.length) {
                        break;
                    }
                    int a2 = t.a(this.B, textStickerStringArr[i2].getStr(), 0, this.O[i2].getStr().length());
                    if (a2 > i3) {
                        i3 = a2;
                    }
                    i2++;
                }
                if (bVar.f88366d == 1) {
                    this.R -= (float) (i3 / 2);
                }
                if (bVar.f88366d == 3) {
                    this.R += (float) (i3 / 2);
                }
            }
            float f2 = this.R;
            float f3 = this.S;
            float f4 = bVar.f88363a;
            int i4 = bVar.f88366d;
            boolean z2 = this.o;
            TextStickerString[] textStickerStringArr2 = this.O;
            if (!(textStickerStringArr2 == null || textStickerStringArr2.length == 0)) {
                Paint.FontMetrics fontMetrics = this.B.getFontMetrics();
                float f5 = fontMetrics.ascent;
                float f6 = fontMetrics.descent;
                int length = this.O.length;
                int i5 = length - 1;
                float f7 = ((float) i5) * (fontMetrics.descent - fontMetrics.ascent);
                PointF[][] pointFArr = new PointF[length][];
                int i6 = (int) (f6 - f5);
                int i7 = this.u;
                int i8 = (int) (((float) i7) * f4);
                this.s = i8;
                int i9 = this.v;
                int i10 = (int) (((float) i9) * f4);
                this.t = i10;
                if (i10 >= i9) {
                    this.t = i9;
                }
                if (i8 >= i7) {
                    this.s = i7;
                }
                int i11 = (int) (f3 - (f7 / 2.0f));
                float f8 = (this.r * f4) / 4.0f;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                float f9 = 0.0f;
                float f10 = 0.0f;
                int i16 = -1;
                int i17 = -1;
                while (i12 < length) {
                    int measureText = (int) this.B.measureText(this.O[i12].getStr());
                    float f11 = (float) (measureText / 2);
                    int i18 = this.s;
                    float f12 = (f2 - f11) - ((float) i18);
                    float f13 = f11 + f2 + ((float) i18);
                    if (i4 == 1) {
                        f12 = f2 - ((float) i18);
                        f13 = ((float) i18) + ((float) measureText) + f2;
                    } else if (i4 == 3) {
                        f12 = (f2 - ((float) measureText)) - ((float) i18);
                        f13 = f2 + ((float) i18);
                    }
                    if (this.O[i12].getStr().trim().length() == 0) {
                        if (i4 == 1) {
                            f13 = ((float) this.s) + f2;
                        } else {
                            f13 = f2;
                            if (i4 == 3) {
                                f13 = f2 - ((float) this.s);
                            }
                        }
                        f12 = f13;
                    }
                    if (((float) Math.abs(measureText - i13)) >= f8 || (i4 != 1 ? i4 != 3 ? i4 != 2 || f10 <= 0.0f : f10 <= 0.0f : f9 <= 0.0f)) {
                        f10 = f12;
                    } else {
                        f13 = f9;
                    }
                    if (i12 == 0) {
                        i15 = i11 - i6;
                    }
                    int i19 = i15 + i6;
                    if (length > 1) {
                        if (i12 > 0) {
                            i16 = (int) this.B.measureText(this.O[i12 - 1].getStr());
                        }
                        if (i12 < i5) {
                            i17 = (int) this.B.measureText(this.O[i12 + 1].getStr());
                        }
                    }
                    if (i16 > 0 && measureText >= i16) {
                        i19 += this.t;
                    }
                    if (i17 > 0 && measureText > i17) {
                        i19 += this.t;
                    }
                    if (i12 == 0) {
                        i15 -= this.t;
                    }
                    if (i12 == i5) {
                        i19 += this.t;
                    }
                    float f14 = (float) i15;
                    float f15 = (float) i19;
                    pointFArr[i12] = new PointF[]{new PointF(f10, f14), new PointF(f13, f14), new PointF(f13, f15), new PointF(f10, f15)};
                    if (measureText > i14) {
                        i14 = measureText;
                    }
                    i12++;
                    i13 = measureText;
                    f9 = f13;
                    i15 = i19;
                }
                this.D.reset();
                this.I.clear();
                for (int i20 = 0; i20 < length; i20++) {
                    if (i20 == 0) {
                        this.D.moveTo(pointFArr[i20][0].x, pointFArr[i20][0].y);
                    }
                    this.D.lineTo(pointFArr[i20][1].x, pointFArr[i20][1].y);
                    if (pointFArr[i20][0].x == pointFArr[i20][1].x) {
                        this.D.lineTo(pointFArr[i20][1].x, pointFArr[i20][1].y);
                        c3 = 2;
                        this.D.lineTo(pointFArr[i20][2].x, pointFArr[i20][2].y);
                    } else {
                        c3 = 2;
                    }
                    this.D.lineTo(pointFArr[i20][c3].x, pointFArr[i20][c3].y);
                    this.I.add(pointFArr[i20][0]);
                    this.I.add(pointFArr[i20][1]);
                    this.I.add(pointFArr[i20][2]);
                    this.I.add(pointFArr[i20][3]);
                }
                for (int i21 = i5; i21 >= 0; i21--) {
                    if (pointFArr[i21][0].x == pointFArr[i21][1].x) {
                        c2 = 3;
                        this.D.lineTo(pointFArr[i21][3].x, pointFArr[i21][3].y);
                    } else {
                        c2 = 3;
                    }
                    this.D.lineTo(pointFArr[i21][c2].x, pointFArr[i21][c2].y);
                    if (pointFArr[i21][0].x == pointFArr[i21][1].x) {
                        this.D.lineTo(pointFArr[i21][0].x, pointFArr[i21][0].y);
                    }
                    this.D.lineTo(pointFArr[i21][0].x, pointFArr[i21][0].y);
                }
                this.D.lineTo(pointFArr[0][1].x, pointFArr[0][1].y);
                this.B.getTextBounds(this.O[0].getStr(), 0, this.O[0].getStr().length(), new Rect());
                int i22 = i14 >> 1;
                if (i4 == 1) {
                    this.f88372b = new RectF(f2 - ((float) this.s), pointFArr[0][0].y, ((float) i14) + f2 + ((float) this.s), pointFArr[i5][2].y);
                } else if (i4 == 3) {
                    this.f88372b = new RectF((f2 - ((float) i14)) - ((float) this.s), pointFArr[0][0].y, ((float) this.s) + f2, pointFArr[i5][2].y);
                } else if (i4 == 2) {
                    float f16 = (float) i22;
                    this.f88372b = new RectF((f2 - f16) - ((float) this.s), pointFArr[0][0].y, f2 + f16 + ((float) this.s), pointFArr[i5][2].y);
                }
                this.f88373c.set(this.f88372b);
                RectF rectF = this.f88373c;
                rectF.set(rectF.left - ((float) this.w), this.f88373c.top - ((float) this.w), this.f88373c.right + ((float) this.w), this.f88373c.bottom + ((float) this.w));
                if (z2) {
                    float f17 = this.f88372b.left - ((float) this.f88381k);
                    float f18 = this.f88372b.right + ((float) this.f88381k);
                    float f19 = this.f88372b.top - ((float) this.f88381k);
                    float f20 = this.f88372b.bottom + ((float) this.f88381k);
                    this.f88376f.reset();
                    this.f88376f.moveTo(f17, f19);
                    this.f88376f.lineTo(f18, f19);
                    this.f88376f.lineTo(f18, f20);
                    this.f88376f.lineTo(f17, f20);
                    this.f88376f.lineTo(f17, f19);
                    Context context = this.E.getContext();
                    if (context != null) {
                        int i23 = Build.VERSION.SDK_INT;
                        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                            RectF rectF2 = this.f88379i;
                            int i24 = this.f88382l;
                            rectF2.set(f18 - ((float) i24), f19 - ((float) i24), f18 + ((float) i24), f19 + ((float) i24));
                        }
                    }
                    RectF rectF3 = this.f88379i;
                    int i25 = this.f88382l;
                    rectF3.set(f17 - ((float) i25), f19 - ((float) i25), f17 + ((float) i25), f19 + ((float) i25));
                }
            }
            if (!(this.o && this.M)) {
                break;
            }
            this.M = false;
            float a3 = ((float) b.a(this.E.getContext())) - (com.ss.android.ttve.utils.b.b(this.E.getContext(), 54.0f) * 2.0f);
            if (this.f88372b.width() <= a3) {
                break;
            }
            float width = (bVar.f88363a * a3) / this.f88372b.width();
            this.E.b(width);
            bVar.f88363a = width;
        }
        float f21 = bVar.f88364b;
        if (bVar.f88369g) {
            canvas.save();
            canvas.rotate(f21, this.f88373c.centerX(), this.f88373c.centerY());
            this.C.setColor(-1);
            RectF rectF4 = this.f88373c;
            int i26 = this.y;
            canvas.drawRoundRect(rectF4, (float) i26, (float) i26, this.C);
            canvas.restore();
        }
        a(canvas, this.R, this.S, bVar.f88364b, bVar.f88363a, bVar.f88366d);
        float f22 = bVar.f88364b;
        boolean z3 = bVar.f88368f;
        if (!this.F && z3) {
            canvas.save();
            canvas.rotate(f22, this.f88373c.centerX(), this.f88373c.centerY());
            this.p.setColor(this.q);
            canvas.drawPath(this.D, this.p);
            canvas.restore();
        }
        float f23 = bVar.f88364b;
        if (this.o) {
            canvas.save();
            canvas.rotate(f23, this.f88373c.centerX(), this.f88373c.centerY());
            canvas.drawPath(this.f88376f, this.f88380j);
            canvas.drawBitmap(this.f88377g, this.f88378h, this.f88379i, this.f88380j);
            canvas.restore();
        }
    }

    private void a(Canvas canvas, List<InteractTextStructWrap> list, String str, float f2, float f3) {
        char c2;
        float f4 = f2;
        if (!t.a(list, str.length())) {
            a(canvas, str, 0, str.length(), f4, f3, this.B);
            canvas.drawText(str, f4, f3, this.B);
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            InteractTextStructWrap interactTextStructWrap = list.get(i3);
            if (interactTextStructWrap.getRange().isValid(str.length())) {
                if (i2 < interactTextStructWrap.getRange().getStart()) {
                    a(canvas, str, i2, interactTextStructWrap.getRange().getStart(), f4, f3, this.B);
                    canvas.drawText(str, i2, interactTextStructWrap.getRange().getStart(), f4, f3, (Paint) this.B);
                    f4 += (float) t.a(this.B, str, i2, interactTextStructWrap.getRange().getStart());
                }
                int start = interactTextStructWrap.getRange().getStart();
                int end = interactTextStructWrap.getRange().getEnd();
                if (start >= str.length() || str.charAt(start) != ' ') {
                    c2 = ' ';
                } else {
                    int i4 = start + 1;
                    c2 = ' ';
                    canvas.drawText(str, start, i4, f4, f3, (Paint) this.B);
                    f4 += (float) t.a(this.B, str, start, i4);
                    start = i4;
                }
                if (start < str.length() && str.charAt(start) == '_') {
                    this.L.offsetTo(f4, ((((((float) this.B.getFontMetricsInt().descent) + f3) + f3) + ((float) this.B.getFontMetricsInt().ascent)) / 2.0f) - (this.L.height() / 2.0f));
                    canvas.drawBitmap(this.f88375e, this.f88374d, this.L, this.Q);
                    f4 += this.L.width() + this.A;
                    start++;
                }
                if (str.charAt(end - 1) == c2) {
                    end--;
                }
                if (start < end) {
                    a(canvas, str, start, end, f4, f3, this.B);
                    this.B.setUnderlineText(true);
                    canvas.drawText(str, start, end, f4, f3, (Paint) this.B);
                    this.B.setUnderlineText(false);
                    f4 += (float) t.a(this.B, str, start, end);
                }
                if (end < interactTextStructWrap.getRange().getEnd()) {
                    int i5 = end + 1;
                    canvas.drawText(str, end, i5, f4, f3, (Paint) this.B);
                    f4 += (float) t.a(this.B, str, end, i5);
                }
                i2 = interactTextStructWrap.getRange().getEnd();
            }
        }
        if (i2 < str.length()) {
            a(canvas, str, i2, str.length(), f4, f3, this.B);
            canvas.drawText(str, i2, str.length(), f4, f3, (Paint) this.B);
        }
    }

    private void a(Canvas canvas, float f2, float f3, float f4, float f5, int i2) {
        Object obj;
        List<InteractTextStructWrap> arrayList;
        TextStickerString[] textStickerStringArr = this.O;
        if (!(textStickerStringArr == null || textStickerStringArr.length == 0)) {
            Paint.FontMetrics fontMetrics = this.B.getFontMetrics();
            float f6 = fontMetrics.ascent;
            float f7 = fontMetrics.descent;
            int length = this.O.length;
            float f8 = ((((float) (length - 1)) * (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) - f7;
            canvas.save();
            canvas.rotate(f4, this.f88373c.centerX(), this.f88373c.centerY());
            float f9 = this.r * 0.7f;
            this.P = f9;
            this.K.set(0.0f, 0.0f, f9, f9);
            this.L.set(this.K);
            o.a(this.L, f5);
            o.a(this.L, f2, f3, f4);
            for (int i3 = 0; i3 < length; i3++) {
                float f10 = (((float) (-((length - i3) - 1))) * (f7 - f6)) + f8;
                String str = this.O[i3].getStr();
                List<TextStickerTextWrap> list = this.N;
                TextStickerString textStickerString = this.O[i3];
                l.d(textStickerString, "");
                if (list == null) {
                    arrayList = new ArrayList<>();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        n.a((Collection) arrayList2, (Iterable) it.next().getStrMap().entrySet());
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (l.a(((Map.Entry) obj).getKey(), textStickerString)) {
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    if (entry != null) {
                        arrayList = (List) entry.getValue();
                    } else {
                        arrayList = new ArrayList<>();
                    }
                }
                int a2 = t.a(this.B, str, 0, str.length()) + a(arrayList, str);
                if (i2 == 2) {
                    a(canvas, arrayList, str, f2 - ((float) (a2 / 2)), f10 + f3 + ((float) (this.t * i3)));
                } else if (i2 == 1) {
                    a(canvas, arrayList, str, f2, f10 + f3 + ((float) (this.t * i3)));
                } else if (i2 == 3) {
                    a(canvas, arrayList, str, f2 - ((float) a2), f10 + f3 + ((float) (this.t * i3)));
                }
            }
            canvas.restore();
        }
    }

    private void a(Canvas canvas, String str, int i2, int i3, float f2, float f3, Paint paint) {
        if (this.J) {
            for (TextStickerTextWrap textStickerTextWrap : this.E.getTextWrapList()) {
                if (!(textStickerTextWrap == null || TextUtils.isEmpty(textStickerTextWrap.getText()))) {
                    int color = paint.getColor();
                    paint.setColor(f.a(color));
                    Paint.Style style = paint.getStyle();
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    Paint.Cap strokeCap = paint.getStrokeCap();
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    Paint.Join strokeJoin = paint.getStrokeJoin();
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    float strokeWidth = paint.getStrokeWidth();
                    paint.setStrokeWidth(this.T);
                    canvas.drawText(str, i2, i3, f2, f3, (Paint) this.B);
                    paint.setColor(color);
                    paint.setStyle(style);
                    paint.setStrokeCap(strokeCap);
                    paint.setStrokeJoin(strokeJoin);
                    paint.setStrokeWidth(strokeWidth);
                    return;
                }
            }
        }
    }
}
