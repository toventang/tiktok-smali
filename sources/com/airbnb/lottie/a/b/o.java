package com.airbnb.lottie.a.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.e.a.l;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.j.d;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final a<PointF, PointF> f5290a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?, PointF> f5291b;

    /* renamed from: c  reason: collision with root package name */
    public final a<d, d> f5292c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Float, Float> f5293d;

    /* renamed from: e  reason: collision with root package name */
    public final a<Integer, Integer> f5294e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f5295f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, Float> f5296g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f5297h = new Matrix();

    static {
        Covode.recordClassIndex(2226);
    }

    public final Matrix a() {
        this.f5297h.reset();
        PointF f2 = this.f5291b.f();
        if (!(f2.x == 0.0f && f2.y == 0.0f)) {
            this.f5297h.preTranslate(f2.x, f2.y);
        }
        float floatValue = this.f5293d.f().floatValue();
        if (floatValue != 0.0f) {
            this.f5297h.preRotate(floatValue);
        }
        d f3 = this.f5292c.f();
        if (!(f3.f5733a == 1.0f && f3.f5734b == 1.0f)) {
            this.f5297h.preScale(f3.f5733a, f3.f5734b);
        }
        PointF f4 = this.f5290a.f();
        if (!(f4.x == 0.0f && f4.y == 0.0f)) {
            this.f5297h.preTranslate(-f4.x, -f4.y);
        }
        return this.f5297h;
    }

    public final void a(a.AbstractC0073a aVar) {
        this.f5290a.a(aVar);
        this.f5291b.a(aVar);
        this.f5292c.a(aVar);
        this.f5293d.a(aVar);
        this.f5294e.a(aVar);
        a<?, Float> aVar2 = this.f5295f;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        a<?, Float> aVar3 = this.f5296g;
        if (aVar3 != null) {
            aVar3.a(aVar);
        }
    }

    public o(l lVar) {
        this.f5290a = lVar.f5355a.a();
        this.f5291b = lVar.f5356b.a();
        this.f5292c = lVar.f5357c.a();
        this.f5293d = lVar.f5358d.a();
        this.f5294e = lVar.f5359e.a();
        if (lVar.f5360f != null) {
            this.f5295f = lVar.f5360f.a();
        } else {
            this.f5295f = null;
        }
        if (lVar.f5361g != null) {
            this.f5296g = lVar.f5361g.a();
        } else {
            this.f5296g = null;
        }
    }

    public final Matrix a(float f2) {
        PointF f3 = this.f5291b.f();
        PointF f4 = this.f5290a.f();
        d f5 = this.f5292c.f();
        float floatValue = this.f5293d.f().floatValue();
        this.f5297h.reset();
        this.f5297h.preTranslate(f3.x * f2, f3.y * f2);
        double d2 = (double) f2;
        this.f5297h.preScale((float) Math.pow((double) f5.f5733a, d2), (float) Math.pow((double) f5.f5734b, d2));
        this.f5297h.preRotate(floatValue * f2, f4.x, f4.y);
        return this.f5297h;
    }

    public final void a(com.airbnb.lottie.e.c.a aVar) {
        aVar.a(this.f5290a);
        aVar.a(this.f5291b);
        aVar.a(this.f5292c);
        aVar.a(this.f5293d);
        aVar.a(this.f5294e);
        a<?, Float> aVar2 = this.f5295f;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
        a<?, Float> aVar3 = this.f5296g;
        if (aVar3 != null) {
            aVar.a(aVar3);
        }
    }

    public final <T> boolean a(T t, c<T> cVar) {
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t == k.f5739e) {
            this.f5290a.a(cVar);
            return true;
        } else if (t == k.f5740f) {
            this.f5291b.a(cVar);
            return true;
        } else if (t == k.f5745k) {
            this.f5292c.a(cVar);
            return true;
        } else if (t == k.f5746l) {
            this.f5293d.a(cVar);
            return true;
        } else if (t == k.f5737c) {
            this.f5294e.a(cVar);
            return true;
        } else if (t == k.y && (aVar2 = this.f5295f) != null) {
            aVar2.a(cVar);
            return true;
        } else if (t != k.z || (aVar = this.f5296g) == null) {
            return false;
        } else {
            aVar.a(cVar);
            return true;
        }
    }
}
