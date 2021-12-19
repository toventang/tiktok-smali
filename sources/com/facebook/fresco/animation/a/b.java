package com.facebook.fresco.animation.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.a.a;

public class b<T extends a> implements a {

    /* renamed from: a  reason: collision with root package name */
    public T f47506a;

    /* renamed from: b  reason: collision with root package name */
    private int f47507b = -1;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f47508c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f47509d;

    static {
        Covode.recordClassIndex(28823);
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void d() {
        T t = this.f47506a;
        if (t != null) {
            t.d();
        }
    }

    @Override // com.facebook.fresco.animation.a.d
    public int a() {
        T t = this.f47506a;
        if (t == null) {
            return 0;
        }
        return t.a();
    }

    @Override // com.facebook.fresco.animation.a.a
    public final int b() {
        T t = this.f47506a;
        if (t == null) {
            return -1;
        }
        return t.b();
    }

    @Override // com.facebook.fresco.animation.a.a
    public final int c() {
        T t = this.f47506a;
        if (t == null) {
            return -1;
        }
        return t.c();
    }

    @Override // com.facebook.fresco.animation.a.d
    public final int e() {
        T t = this.f47506a;
        if (t == null) {
            return 0;
        }
        return t.e();
    }

    public b(T t) {
        this.f47506a = t;
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void a(int i2) {
        T t = this.f47506a;
        if (t != null) {
            t.a(i2);
        }
        this.f47507b = i2;
    }

    @Override // com.facebook.fresco.animation.a.a
    public final boolean b(int i2) {
        T t = this.f47506a;
        if (t != null) {
            return t.b(i2);
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.a.d
    public final int c(int i2) {
        T t = this.f47506a;
        if (t == null) {
            return 0;
        }
        return t.c(i2);
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void a(ColorFilter colorFilter) {
        T t = this.f47506a;
        if (t != null) {
            t.a(colorFilter);
        }
        this.f47508c = colorFilter;
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void a(Rect rect) {
        T t = this.f47506a;
        if (t != null) {
            t.a(rect);
        }
        this.f47509d = rect;
    }

    @Override // com.facebook.fresco.animation.a.a
    public boolean a(Drawable drawable, Canvas canvas, int i2) {
        T t = this.f47506a;
        if (t == null || !t.a(drawable, canvas, i2)) {
            return false;
        }
        return true;
    }
}
