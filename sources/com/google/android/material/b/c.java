package com.google.android.material.b;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.a;
import com.bytedance.covode.number.Covode;

final class c {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f52226a;

    /* renamed from: b  reason: collision with root package name */
    final a f52227b;

    /* renamed from: c  reason: collision with root package name */
    int f52228c;

    /* renamed from: d  reason: collision with root package name */
    int f52229d;

    /* renamed from: e  reason: collision with root package name */
    int f52230e;

    /* renamed from: f  reason: collision with root package name */
    int f52231f;

    /* renamed from: g  reason: collision with root package name */
    public int f52232g;

    /* renamed from: h  reason: collision with root package name */
    public int f52233h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f52234i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f52235j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f52236k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f52237l;

    /* renamed from: m  reason: collision with root package name */
    final Paint f52238m = new Paint(1);
    final Rect n = new Rect();
    final RectF o = new RectF();
    GradientDrawable p;
    Drawable q;
    GradientDrawable r;
    Drawable s;
    GradientDrawable t;
    GradientDrawable u;
    GradientDrawable v;
    public boolean w = false;

    static {
        boolean z;
        Covode.recordClassIndex(32445);
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f52226a = z;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        GradientDrawable gradientDrawable = this.t;
        if (gradientDrawable != null) {
            a.a(gradientDrawable, this.f52235j);
            PorterDuff.Mode mode = this.f52234i;
            if (mode != null) {
                a.a(this.t, mode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!f52226a) {
            this.f52227b.invalidate();
        } else if (this.u != null) {
            this.f52227b.setInternalBackground(b());
        }
    }

    /* access modifiers changed from: package-private */
    public final Drawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.t = gradientDrawable;
        gradientDrawable.setCornerRadius(((float) this.f52232g) + 1.0E-5f);
        this.t.setColor(-1);
        a();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.u = gradientDrawable2;
        gradientDrawable2.setCornerRadius(((float) this.f52232g) + 1.0E-5f);
        this.u.setColor(0);
        this.u.setStroke(this.f52233h, this.f52236k);
        InsetDrawable a2 = a(new LayerDrawable(new Drawable[]{this.t, this.u}));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.v = gradientDrawable3;
        gradientDrawable3.setCornerRadius(((float) this.f52232g) + 1.0E-5f);
        this.v.setColor(-1);
        return new b(com.google.android.material.g.a.a(this.f52237l), a2, this.v);
    }

    /* access modifiers changed from: package-private */
    public final InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f52228c, this.f52230e, this.f52229d, this.f52231f);
    }

    public c(a aVar) {
        this.f52227b = aVar;
    }
}
