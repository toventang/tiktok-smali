package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.al;
import androidx.core.f.f;
import androidx.core.h.e;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class b {
    private static final Paint A = null;
    private static final boolean z = false;
    private final View B;
    private final RectF C;
    private float D;
    private float E;
    private float F;
    private float G;
    private Typeface H;
    private boolean I;
    private float J;
    private float K;
    private final TextPaint L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private int Q;
    private float R;
    private float S;
    private float T;
    private int U;

    /* renamed from: a  reason: collision with root package name */
    public boolean f52510a;

    /* renamed from: b  reason: collision with root package name */
    public float f52511b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f52512c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f52513d;

    /* renamed from: e  reason: collision with root package name */
    public int f52514e = 16;

    /* renamed from: f  reason: collision with root package name */
    public int f52515f = 16;

    /* renamed from: g  reason: collision with root package name */
    public float f52516g = 15.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f52517h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f52518i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f52519j;

    /* renamed from: k  reason: collision with root package name */
    public float f52520k;

    /* renamed from: l  reason: collision with root package name */
    public float f52521l;

    /* renamed from: m  reason: collision with root package name */
    public Typeface f52522m;
    public Typeface n;
    public CharSequence o;
    public CharSequence p;
    public boolean q;
    public Bitmap r;
    public Paint s;
    public float t;
    public float u;
    public int[] v;
    public boolean w;
    public final TextPaint x;
    public TimeInterpolator y;

    public final void b() {
        a(this.f52511b);
    }

    static {
        Covode.recordClassIndex(32541);
        int i2 = Build.VERSION.SDK_INT;
    }

    public final void d() {
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            bitmap.recycle();
            this.r = null;
        }
    }

    private int e() {
        int[] iArr = this.v;
        if (iArr != null) {
            return this.f52518i.getColorForState(iArr, 0);
        }
        return this.f52518i.getDefaultColor();
    }

    private int f() {
        int[] iArr = this.v;
        if (iArr != null) {
            return this.f52519j.getColorForState(iArr, 0);
        }
        return this.f52519j.getDefaultColor();
    }

    public final void c() {
        if (this.B.getHeight() > 0 && this.B.getWidth() > 0) {
            g();
            b();
        }
    }

    private void h() {
        MethodCollector.i(2548);
        if (this.r != null || this.f52512c.isEmpty() || TextUtils.isEmpty(this.p)) {
            MethodCollector.o(2548);
            return;
        }
        a(0.0f);
        this.t = this.x.ascent();
        this.J = this.x.descent();
        TextPaint textPaint = this.x;
        CharSequence charSequence = this.p;
        int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
        int round2 = Math.round(this.J - this.t);
        if (round <= 0 || round2 <= 0) {
            MethodCollector.o(2548);
            return;
        }
        this.r = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.r);
        CharSequence charSequence2 = this.p;
        canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.x.descent(), this.x);
        if (this.s == null) {
            this.s = new Paint(3);
        }
        MethodCollector.o(2548);
    }

    private void g() {
        float f2;
        float f3 = this.K;
        d(this.f52517h);
        CharSequence charSequence = this.p;
        float f4 = 0.0f;
        if (charSequence != null) {
            f2 = this.x.measureText(charSequence, 0, charSequence.length());
        } else {
            f2 = 0.0f;
        }
        int a2 = e.a(this.f52515f, this.I ? 1 : 0);
        int i2 = a2 & 112;
        if (i2 == 48) {
            this.E = ((float) this.f52513d.top) - this.x.ascent();
        } else if (i2 != 80) {
            this.E = ((float) this.f52513d.centerY()) + (((this.x.descent() - this.x.ascent()) / 2.0f) - this.x.descent());
        } else {
            this.E = (float) this.f52513d.bottom;
        }
        int i3 = a2 & 8388615;
        if (i3 == 1) {
            this.G = ((float) this.f52513d.centerX()) - (f2 / 2.0f);
        } else if (i3 != 5) {
            this.G = (float) this.f52513d.left;
        } else {
            this.G = ((float) this.f52513d.right) - f2;
        }
        d(this.f52516g);
        CharSequence charSequence2 = this.p;
        if (charSequence2 != null) {
            f4 = this.x.measureText(charSequence2, 0, charSequence2.length());
        }
        int a3 = e.a(this.f52514e, this.I ? 1 : 0);
        int i4 = a3 & 112;
        if (i4 == 48) {
            this.D = ((float) this.f52512c.top) - this.x.ascent();
        } else if (i4 != 80) {
            this.D = ((float) this.f52512c.centerY()) + (((this.x.descent() - this.x.ascent()) / 2.0f) - this.x.descent());
        } else {
            this.D = (float) this.f52512c.bottom;
        }
        int i5 = a3 & 8388615;
        if (i5 == 1) {
            this.F = ((float) this.f52512c.centerX()) - (f4 / 2.0f);
        } else if (i5 != 5) {
            this.F = (float) this.f52512c.left;
        } else {
            this.F = ((float) this.f52512c.right) - f4;
        }
        d();
        c(f3);
    }

    public final void a() {
        boolean z2;
        if (this.f52513d.width() <= 0 || this.f52513d.height() <= 0 || this.f52512c.width() <= 0 || this.f52512c.height() <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f52510a = z2;
    }

    public final void b(int i2) {
        if (this.f52515f != i2) {
            this.f52515f = i2;
            c();
        }
    }

    private void c(float f2) {
        boolean z2;
        d(f2);
        if (!z || this.u == 1.0f) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.q = z2;
        if (z2) {
            h();
        }
        v.c(this.B);
    }

    public b(View view) {
        this.B = view;
        TextPaint textPaint = new TextPaint(129);
        this.x = textPaint;
        this.L = new TextPaint(textPaint);
        this.f52513d = new Rect();
        this.f52512c = new Rect();
        this.C = new RectF();
    }

    private Typeface e(int i2) {
        TypedArray obtainStyledAttributes = this.B.getContext().obtainStyledAttributes(i2, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void a(float f2) {
        b(f2);
        this.f52520k = a(this.F, this.G, f2, this.M);
        this.f52521l = a(this.D, this.E, f2, this.M);
        c(a(this.f52516g, this.f52517h, f2, this.y));
        if (this.f52519j != this.f52518i) {
            this.x.setColor(a(e(), f(), f2));
        } else {
            this.x.setColor(f());
        }
        this.x.setShadowLayer(a(this.R, this.N, f2, null), a(this.S, this.O, f2, null), a(this.T, this.P, f2, null), a(this.U, this.Q, f2));
        v.c(this.B);
    }

    private void b(float f2) {
        this.C.left = a((float) this.f52512c.left, (float) this.f52513d.left, f2, this.M);
        this.C.top = a(this.D, this.E, f2, this.M);
        this.C.right = a((float) this.f52512c.right, (float) this.f52513d.right, f2, this.M);
        this.C.bottom = a((float) this.f52512c.bottom, (float) this.f52513d.bottom, f2, this.M);
    }

    public final void c(int i2) {
        al a2 = al.a(this.B.getContext(), i2, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
        if (a2.f(3)) {
            this.f52519j = a2.e(3);
        }
        if (a2.f(0)) {
            this.f52517h = (float) a2.e(0, (int) this.f52517h);
        }
        this.Q = a2.a(6, 0);
        this.O = a2.a(7, 0.0f);
        this.P = a2.a(8, 0.0f);
        this.N = a2.a(9, 0.0f);
        a2.f1549a.recycle();
        int i3 = Build.VERSION.SDK_INT;
        this.f52522m = e(i2);
        c();
    }

    public final void d(int i2) {
        al a2 = al.a(this.B.getContext(), i2, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
        if (a2.f(3)) {
            this.f52518i = a2.e(3);
        }
        if (a2.f(0)) {
            this.f52516g = (float) a2.e(0, (int) this.f52516g);
        }
        this.U = a2.a(6, 0);
        this.S = a2.a(7, 0.0f);
        this.T = a2.a(8, 0.0f);
        this.R = a2.a(9, 0.0f);
        a2.f1549a.recycle();
        int i3 = Build.VERSION.SDK_INT;
        this.n = e(i2);
        c();
    }

    private void d(float f2) {
        float f3;
        boolean z2;
        if (this.o != null) {
            float width = (float) this.f52513d.width();
            float width2 = (float) this.f52512c.width();
            boolean z3 = true;
            if (a(f2, this.f52517h)) {
                f3 = this.f52517h;
                this.u = 1.0f;
                Typeface typeface = this.H;
                Typeface typeface2 = this.f52522m;
                if (typeface != typeface2) {
                    this.H = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                f3 = this.f52516g;
                Typeface typeface3 = this.H;
                Typeface typeface4 = this.n;
                if (typeface3 != typeface4) {
                    this.H = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (a(f2, f3)) {
                    this.u = 1.0f;
                } else {
                    this.u = f2 / this.f52516g;
                }
                float f4 = this.f52517h / this.f52516g;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                if (this.K != f3 || this.w || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.K = f3;
                this.w = false;
            }
            if (this.p == null || z2) {
                this.x.setTextSize(this.K);
                this.x.setTypeface(this.H);
                TextPaint textPaint = this.x;
                if (this.u == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.o, this.x, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.p)) {
                    this.p = ellipsize;
                    this.I = a(ellipsize);
                }
            }
        }
    }

    private boolean a(CharSequence charSequence) {
        androidx.core.f.e eVar;
        if (v.e(this.B) == 1) {
            eVar = f.f2385d;
        } else {
            eVar = f.f2384c;
        }
        return eVar.a(charSequence, charSequence.length());
    }

    public final void a(int i2) {
        if (this.f52514e != i2) {
            this.f52514e = i2;
            c();
        }
    }

    private static boolean a(float f2, float f3) {
        if (Math.abs(f2 - f3) < 0.001f) {
            return true;
        }
        return false;
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f3) + (((float) Color.alpha(i3)) * f2)), (int) ((((float) Color.red(i2)) * f3) + (((float) Color.red(i3)) * f2)), (int) ((((float) Color.green(i2)) * f3) + (((float) Color.green(i3)) * f2)), (int) ((((float) Color.blue(i2)) * f3) + (((float) Color.blue(i3)) * f2)));
    }

    private static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return f2 + (f4 * (f3 - f2));
    }

    public static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        if (rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5) {
            return true;
        }
        return false;
    }
}
