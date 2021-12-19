package com.bytedance.tux.badge;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.b.b;
import com.bytedance.tux.b.f;
import com.bytedance.tux.b.g;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c extends Drawable {

    /* renamed from: j  reason: collision with root package name */
    public static final a f44722j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f44723a;

    /* renamed from: b  reason: collision with root package name */
    public int f44724b;

    /* renamed from: c  reason: collision with root package name */
    public int f44725c;

    /* renamed from: d  reason: collision with root package name */
    public String f44726d = "";

    /* renamed from: e  reason: collision with root package name */
    public float f44727e;

    /* renamed from: f  reason: collision with root package name */
    public float f44728f;

    /* renamed from: g  reason: collision with root package name */
    public int f44729g;

    /* renamed from: h  reason: collision with root package name */
    public int f44730h;

    /* renamed from: i  reason: collision with root package name */
    public int f44731i;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f44732k;

    /* renamed from: l  reason: collision with root package name */
    private final Path f44733l;

    /* renamed from: m  reason: collision with root package name */
    private final RectF f44734m;
    private final Matrix n;
    private float o;

    static {
        Covode.recordClassIndex(27334);
    }

    public final int getOpacity() {
        return -1;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27335);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getIntrinsicHeight() {
        return this.f44724b;
    }

    public final int getIntrinsicWidth() {
        return this.f44725c;
    }

    public final int getMinimumHeight() {
        return this.f44724b;
    }

    public final int getMinimumWidth() {
        return this.f44725c;
    }

    public final int getAlpha() {
        return this.f44732k.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.f44732k.getColorFilter();
    }

    public final void a() {
        int length = this.f44726d.length();
        if (length == 0) {
            int i2 = this.f44731i;
            this.f44725c = i2;
            this.f44724b = i2;
        } else if (length != 1) {
            this.f44724b = (int) ((float) Math.ceil((double) this.o));
            float measureText = this.f44732k.measureText(this.f44726d);
            double d2 = (double) this.o;
            Double.isNaN(d2);
            double d3 = (double) measureText;
            Double.isNaN(d3);
            this.f44725c = (int) Math.ceil((d2 * 0.6666666666666666d) + d3);
        } else {
            this.f44725c = (int) ((float) Math.ceil((double) this.o));
            this.f44724b = (int) ((float) Math.ceil((double) this.o));
        }
    }

    private final void b() {
        Map<Integer, Object> map;
        Paint paint = this.f44732k;
        int i2 = this.f44723a;
        l.c(paint, "");
        b a2 = f.a((int) R.attr.ap4, i2);
        if (a2 == null || (map = a2.f44666a) == null) {
            ag.a();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Object> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                if (intValue == g.h().f44668a) {
                    g.h();
                    Object value = entry.getValue();
                    l.c(value, "");
                    float floatValue = ((Number) value).floatValue();
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    paint.setTextSize(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
                } else if (intValue == g.j().f44668a) {
                    g.j();
                    Object value2 = entry.getValue();
                    l.c(value2, "");
                    Typeface a3 = com.bytedance.tux.d.a.a((String) value2);
                    if (a3 != null) {
                        paint.setTypeface(a3);
                    }
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        float f2 = this.f44732k.getFontMetrics().descent - this.f44732k.getFontMetrics().ascent;
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        this.o = f2 + TypedValue.applyDimension(1, 3.0f, system2.getDisplayMetrics());
    }

    public final void a(String str) {
        l.c(str, "");
        this.f44726d = str;
    }

    public final void setAlpha(int i2) {
        this.f44732k.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44732k.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        l.c(canvas, "");
        canvas.translate(this.f44727e, this.f44728f);
        int length = this.f44726d.length();
        if (length == 0) {
            float f2 = ((float) this.f44731i) / 2.0f;
            this.f44732k.setColor(this.f44730h);
            canvas.drawCircle(f2, f2, f2, this.f44732k);
        } else if (length != 1) {
            float measureText = this.f44732k.measureText(this.f44726d);
            float f3 = this.o;
            double d2 = (double) f3;
            Double.isNaN(d2);
            double d3 = (double) measureText;
            Double.isNaN(d3);
            float f4 = (float) ((d2 * 0.6666666666666666d) + d3);
            float f5 = f3 / 2.0f;
            this.f44732k.setColor(this.f44730h);
            RectF rectF = this.f44734m;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            float f6 = f5 * 2.0f;
            rectF.right = f6;
            rectF.bottom = f6;
            canvas.drawArc(this.f44734m, 90.0f, 180.0f, true, this.f44732k);
            canvas.drawRect(f5, 0.0f, f4 - f5, this.o, this.f44732k);
            RectF rectF2 = this.f44734m;
            rectF2.left = f4 - f6;
            rectF2.top = 0.0f;
            rectF2.right = f4;
            rectF2.bottom = f6;
            canvas.drawArc(this.f44734m, -90.0f, 180.0f, true, this.f44732k);
            this.f44732k.setColor(this.f44729g);
            Paint paint = this.f44732k;
            String str = this.f44726d;
            paint.getTextPath(str, 0, str.length(), 0.0f, 0.0f, this.f44733l);
            this.f44733l.computeBounds(this.f44734m, true);
            this.n.reset();
            this.n.setTranslate(((f4 - this.f44734m.width()) / 2.0f) - this.f44734m.left, ((this.o - this.f44734m.height()) / 2.0f) - this.f44734m.top);
            this.f44733l.transform(this.n);
            canvas.drawPath(this.f44733l, this.f44732k);
        } else {
            float f7 = this.o / 2.0f;
            this.f44732k.setColor(this.f44730h);
            canvas.drawCircle(f7, f7, f7, this.f44732k);
            this.f44732k.setColor(this.f44729g);
            Paint paint2 = this.f44732k;
            String str2 = this.f44726d;
            paint2.getTextPath(str2, 0, str2.length(), 0.0f, 0.0f, this.f44733l);
            this.f44733l.computeBounds(this.f44734m, true);
            float height = (this.o - this.f44734m.height()) / 2.0f;
            float width = (this.o - this.f44734m.width()) / 2.0f;
            if (l.a((Object) this.f44726d, (Object) "1")) {
                width *= 0.9f;
            }
            this.n.reset();
            this.n.setTranslate(width - this.f44734m.left, height - this.f44734m.top);
            this.f44733l.transform(this.n);
            this.f44732k.setColor(this.f44729g);
            canvas.drawPath(this.f44733l, this.f44732k);
        }
        canvas.translate(-this.f44727e, -this.f44728f);
    }

    public c(int i2, int i3, int i4, int i5) {
        this.f44729g = i3;
        this.f44730h = i4;
        this.f44731i = i5;
        this.f44723a = i2;
        Paint paint = new Paint();
        this.f44732k = paint;
        this.f44733l = new Path();
        this.f44734m = new RectF();
        this.n = new Matrix();
        paint.setAntiAlias(true);
        b();
    }
}
