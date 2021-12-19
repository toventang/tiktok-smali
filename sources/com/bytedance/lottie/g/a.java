package com.bytedance.lottie.g;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.g;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private float f40718a = Float.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public final g f40719b;

    /* renamed from: c  reason: collision with root package name */
    public final T f40720c;

    /* renamed from: d  reason: collision with root package name */
    public final T f40721d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f40722e;

    /* renamed from: f  reason: collision with root package name */
    public final float f40723f;

    /* renamed from: g  reason: collision with root package name */
    public Float f40724g;

    /* renamed from: h  reason: collision with root package name */
    public PointF f40725h;

    /* renamed from: i  reason: collision with root package name */
    public PointF f40726i;

    /* renamed from: j  reason: collision with root package name */
    private float f40727j = Float.MIN_VALUE;

    static {
        Covode.recordClassIndex(24986);
    }

    public final boolean c() {
        if (this.f40722e == null) {
            return true;
        }
        return false;
    }

    public final float a() {
        g gVar = this.f40719b;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.f40718a == Float.MIN_VALUE) {
            this.f40718a = (this.f40723f - gVar.f40713i) / this.f40719b.b();
        }
        return this.f40718a;
    }

    public final float b() {
        if (this.f40719b == null) {
            return 1.0f;
        }
        if (this.f40727j == Float.MIN_VALUE) {
            if (this.f40724g == null) {
                this.f40727j = 1.0f;
            } else {
                this.f40727j = a() + ((this.f40724g.floatValue() - this.f40723f) / this.f40719b.b());
            }
        }
        return this.f40727j;
    }

    public String toString() {
        return "Keyframe{startValue=" + ((Object) this.f40720c) + ", endValue=" + ((Object) this.f40721d) + ", startFrame=" + this.f40723f + ", endFrame=" + this.f40724g + ", interpolator=" + this.f40722e + '}';
    }

    public a(T t) {
        this.f40720c = t;
        this.f40721d = t;
        this.f40723f = Float.MIN_VALUE;
        this.f40724g = Float.valueOf(Float.MAX_VALUE);
    }

    public final boolean a(float f2) {
        if (f2 < a() || f2 >= b()) {
            return false;
        }
        return true;
    }

    public a(g gVar, T t, T t2, Interpolator interpolator, float f2, Float f3) {
        this.f40719b = gVar;
        this.f40720c = t;
        this.f40721d = t2;
        this.f40722e = interpolator;
        this.f40723f = f2;
        this.f40724g = f3;
    }
}
