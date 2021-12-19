package com.ss.android.ugc.aweme.themechange.base;

import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.tools.view.style.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final int f138713a = Color.parseColor("#FFFFFFFF");

    /* renamed from: b  reason: collision with root package name */
    static final int f138714b = Color.parseColor("#26FFFFFF");

    /* renamed from: c  reason: collision with root package name */
    static final int f138715c = Color.parseColor("#26000000");

    /* renamed from: d  reason: collision with root package name */
    public static final c f138716d = new c();

    /* renamed from: e  reason: collision with root package name */
    private static final Context f138717e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f138718f = Color.parseColor("#D8000000");

    /* renamed from: g  reason: collision with root package name */
    private static final int f138719g = Color.parseColor("#80000000");

    /* renamed from: h  reason: collision with root package name */
    private static final int f138720h = Color.parseColor("#99000000");

    private c() {
    }

    public static int a() {
        return (f138713a & 16777215) | Integer.MIN_VALUE;
    }

    private static int b() {
        return b.c(f138717e, R.color.f159919c);
    }

    private static int c() {
        return b.c(f138717e, R.color.f159920d);
    }

    static {
        Covode.recordClassIndex(90735);
        Application application = i.f115645a;
        l.b(application, "");
        f138717e = application;
    }

    public static Drawable a(Drawable drawable) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        l.b(mutate, "");
        mutate.setColorFilter(new PorterDuffColorFilter(f138713a, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static Drawable a(Drawable drawable, int i2) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        l.b(mutate, "");
        mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public final Drawable a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kg, R.attr.kr, R.attr.nt, R.attr.sg, R.attr.u3, R.attr.v1, R.attr.x8, R.attr.x9, R.attr.x_, R.attr.xa, R.attr.xd, R.attr.xe, R.attr.xf, R.attr.xg, R.attr.xh, R.attr.xi, R.attr.xj, R.attr.xk, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y4, R.attr.z_, R.attr.a2k, R.attr.a3q, R.attr.a61, R.attr.a6b, R.attr.a6k, R.attr.a6p, R.attr.a7e, R.attr.a7f, R.attr.a_v, R.attr.ab4, R.attr.ab8, R.attr.abt, R.attr.abu, R.attr.afv, R.attr.ai9, R.attr.aif, R.attr.aij, R.attr.aio, R.attr.ais, R.attr.aj7, R.attr.ajr, R.attr.asi, R.attr.asq, R.attr.ass});
        l.b(obtainStyledAttributes, "");
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        boolean z2 = obtainStyledAttributes.getBoolean(43, false);
        int dimension = (int) obtainStyledAttributes.getDimension(31, 0.0f);
        boolean z3 = obtainStyledAttributes.getBoolean(5, false);
        boolean z4 = obtainStyledAttributes.getBoolean(32, false);
        boolean z5 = obtainStyledAttributes.getBoolean(3, false);
        boolean z6 = obtainStyledAttributes.getBoolean(36, false);
        boolean z7 = obtainStyledAttributes.getBoolean(46, false);
        int a2 = a(z3, z4, z5, z6);
        if (z7) {
            a2 = f138713a;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            a2 = obtainStyledAttributes.getColor(0, a2);
        }
        obtainStyledAttributes.recycle();
        com.ss.android.ugc.tools.view.style.b a3 = b.a.a().b(a2).a(a2, 0);
        if (z) {
            a3.a(1);
        } else {
            a3.a(0);
            if (z2) {
                float f2 = (float) dimension;
                a3.a(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
            } else {
                a3.a((float) dimension);
            }
        }
        return a3.a();
    }

    public static int a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return f138714b;
        }
        if (z) {
            if (z2) {
                return c();
            }
            return b();
        } else if (z2) {
            if (z3) {
                return f138715c;
            }
            return f138719g;
        } else if (z3) {
            return f138720h;
        } else {
            return f138718f;
        }
    }
}
