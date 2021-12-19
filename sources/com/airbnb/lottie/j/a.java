package com.airbnb.lottie.j;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.e;
import com.bytedance.covode.number.Covode;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e f5709a;

    /* renamed from: b  reason: collision with root package name */
    public final T f5710b;

    /* renamed from: c  reason: collision with root package name */
    public T f5711c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f5712d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5713e;

    /* renamed from: f  reason: collision with root package name */
    public Float f5714f;

    /* renamed from: g  reason: collision with root package name */
    public float f5715g = -3987645.8f;

    /* renamed from: h  reason: collision with root package name */
    public float f5716h = -3987645.8f;

    /* renamed from: i  reason: collision with root package name */
    public int f5717i = 784923401;

    /* renamed from: j  reason: collision with root package name */
    public int f5718j = 784923401;

    /* renamed from: k  reason: collision with root package name */
    public PointF f5719k;

    /* renamed from: l  reason: collision with root package name */
    public PointF f5720l;

    /* renamed from: m  reason: collision with root package name */
    private float f5721m = Float.MIN_VALUE;
    private float n = Float.MIN_VALUE;

    static {
        Covode.recordClassIndex(2397);
    }

    public final boolean d() {
        if (this.f5712d == null) {
            return true;
        }
        return false;
    }

    public final float b() {
        e eVar = this.f5709a;
        if (eVar == null) {
            return 0.0f;
        }
        if (this.f5721m == Float.MIN_VALUE) {
            this.f5721m = (this.f5713e - eVar.f5338i) / this.f5709a.b();
        }
        return this.f5721m;
    }

    public final float c() {
        if (this.f5709a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.f5714f == null) {
                this.n = 1.0f;
            } else {
                this.n = b() + ((this.f5714f.floatValue() - this.f5713e) / this.f5709a.b());
            }
        }
        return this.n;
    }

    public String toString() {
        return "Keyframe{startValue=" + ((Object) this.f5710b) + ", endValue=" + ((Object) this.f5711c) + ", startFrame=" + this.f5713e + ", endFrame=" + this.f5714f + ", interpolator=" + this.f5712d + '}';
    }

    public final boolean a(float f2) {
        if (f2 < b() || f2 >= c()) {
            return false;
        }
        return true;
    }

    public a(T t) {
        this.f5710b = t;
        this.f5711c = t;
        this.f5713e = Float.MIN_VALUE;
        this.f5714f = Float.valueOf(Float.MAX_VALUE);
    }

    public a(e eVar, T t, T t2, Interpolator interpolator, float f2, Float f3) {
        this.f5709a = eVar;
        this.f5710b = t;
        this.f5711c = t2;
        this.f5712d = interpolator;
        this.f5713e = f2;
        this.f5714f = f3;
    }
}
