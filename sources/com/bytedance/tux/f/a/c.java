package com.bytedance.tux.f.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static final a f45027a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f45028b;

    /* renamed from: c  reason: collision with root package name */
    private int f45029c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f45030d;

    /* renamed from: e  reason: collision with root package name */
    private int f45031e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint.FontMetricsInt f45032f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f45033g;

    /* renamed from: h  reason: collision with root package name */
    private int f45034h;

    /* renamed from: i  reason: collision with root package name */
    private int f45035i;

    static {
        Covode.recordClassIndex(27476);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(27477);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void a() {
        Rect rect;
        int i2;
        Drawable drawable = this.f45033g;
        if (drawable != null) {
            rect = drawable.getBounds();
        } else {
            rect = null;
        }
        this.f45030d = rect;
        int i3 = 0;
        if (rect != null) {
            i2 = rect.width();
        } else {
            i2 = 0;
        }
        this.f45028b = i2;
        Rect rect2 = this.f45030d;
        if (rect2 != null) {
            i3 = rect2.height();
        }
        this.f45029c = i3;
    }

    public /* synthetic */ c(Drawable drawable) {
        this(drawable, 2);
    }

    public final void a(int i2) {
        Drawable drawable = this.f45033g;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
    }

    private final int a(Paint.FontMetricsInt fontMetricsInt) {
        int i2 = this.f45031e;
        if (i2 == 0) {
            return fontMetricsInt.descent - this.f45029c;
        }
        if (i2 == 1) {
            return -this.f45029c;
        }
        if (i2 != 2) {
            return -this.f45029c;
        }
        return fontMetricsInt.ascent + (((fontMetricsInt.descent - fontMetricsInt.ascent) - this.f45029c) / 2);
    }

    public final void a(boolean z, int i2) {
        if (z) {
            this.f45034h = i2;
            this.f45035i = 0;
            return;
        }
        this.f45034h = 0;
        this.f45035i = i2;
    }

    public c(Drawable drawable, int i2) {
        this.f45032f = new Paint.FontMetricsInt();
        this.f45033g = drawable;
        this.f45031e = 2;
        a();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        int i4;
        l.c(paint, "");
        int i5 = this.f45034h + this.f45035i;
        a();
        if (fontMetricsInt == null) {
            i4 = this.f45028b;
        } else {
            int a2 = a(fontMetricsInt);
            int i6 = this.f45029c + a2;
            if (a2 < fontMetricsInt.ascent) {
                fontMetricsInt.ascent = a2;
            }
            if (a2 < fontMetricsInt.top) {
                fontMetricsInt.top = a2;
            }
            if (i6 > fontMetricsInt.descent) {
                fontMetricsInt.descent = i6;
            }
            if (i6 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i6;
            }
            i4 = this.f45028b;
        }
        return i4 + i5;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        int a2;
        l.c(canvas, "");
        l.c(paint, "");
        paint.getFontMetricsInt(this.f45032f);
        if (this.f45031e == 2) {
            a2 = ((i6 + i4) - this.f45029c) / 2;
        } else {
            a2 = i5 + a(this.f45032f);
        }
        float f3 = f2 + ((float) this.f45034h);
        float f4 = (float) a2;
        canvas.translate(f3, f4);
        Drawable drawable = this.f45033g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.translate(-f3, -f4);
    }
}
