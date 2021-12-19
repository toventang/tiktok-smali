package com.bytedance.lottie.a.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.a.l;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.g.d;
import com.bytedance.lottie.m;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final a<PointF, PointF> f40446a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?, PointF> f40447b;

    /* renamed from: c  reason: collision with root package name */
    public final a<d, d> f40448c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Float, Float> f40449d;

    /* renamed from: e  reason: collision with root package name */
    public final a<Integer, Integer> f40450e;

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f40451f;

    /* renamed from: g  reason: collision with root package name */
    public final a<?, Float> f40452g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f40453h = new Matrix();

    static {
        Covode.recordClassIndex(24866);
    }

    public final Matrix a() {
        this.f40453h.reset();
        PointF d2 = this.f40447b.d();
        if (!(d2.x == 0.0f && d2.y == 0.0f)) {
            this.f40453h.preTranslate(d2.x, d2.y);
        }
        float floatValue = this.f40449d.d().floatValue();
        if (floatValue != 0.0f) {
            this.f40453h.preRotate(floatValue);
        }
        d d3 = this.f40448c.d();
        if (!(d3.f40738a == 1.0f && d3.f40739b == 1.0f)) {
            this.f40453h.preScale(d3.f40738a, d3.f40739b);
        }
        d.a.f40740a.a(d3);
        PointF d4 = this.f40446a.d();
        if (!(d4.x == 0.0f && d4.y == 0.0f)) {
            this.f40453h.preTranslate(-d4.x, -d4.y);
        }
        return this.f40453h;
    }

    public final void a(a.AbstractC0986a aVar) {
        this.f40446a.a(aVar);
        this.f40447b.a(aVar);
        this.f40448c.a(aVar);
        this.f40449d.a(aVar);
        this.f40450e.a(aVar);
        a<?, Float> aVar2 = this.f40451f;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
        a<?, Float> aVar3 = this.f40452g;
        if (aVar3 != null) {
            aVar3.a(aVar);
        }
    }

    public o(l lVar) {
        this.f40446a = lVar.f40479a.a();
        this.f40447b = lVar.f40480b.a();
        this.f40448c = lVar.f40481c.a();
        this.f40449d = lVar.f40482d.a();
        this.f40450e = lVar.f40483e.a();
        if (lVar.f40484f != null) {
            this.f40451f = lVar.f40484f.a();
        } else {
            this.f40451f = null;
        }
        if (lVar.f40485g != null) {
            this.f40452g = lVar.f40485g.a();
        } else {
            this.f40452g = null;
        }
    }

    public final Matrix a(float f2) {
        PointF d2 = this.f40447b.d();
        PointF d3 = this.f40446a.d();
        d d4 = this.f40448c.d();
        float floatValue = this.f40449d.d().floatValue();
        this.f40453h.reset();
        this.f40453h.preTranslate(d2.x * f2, d2.y * f2);
        double d5 = (double) f2;
        this.f40453h.preScale((float) Math.pow((double) d4.f40738a, d5), (float) Math.pow((double) d4.f40739b, d5));
        this.f40453h.preRotate(floatValue * f2, d3.x, d3.y);
        return this.f40453h;
    }

    public final void a(com.bytedance.lottie.c.c.a aVar) {
        aVar.a(this.f40446a);
        aVar.a(this.f40447b);
        aVar.a(this.f40448c);
        aVar.a(this.f40449d);
        aVar.a(this.f40450e);
        a<?, Float> aVar2 = this.f40451f;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
        a<?, Float> aVar3 = this.f40452g;
        if (aVar3 != null) {
            aVar.a(aVar3);
        }
    }

    public final <T> boolean a(T t, c<T> cVar) {
        a<?, Float> aVar;
        a<?, Float> aVar2;
        if (t == m.f40806e) {
            this.f40446a.a(cVar);
            return true;
        } else if (t == m.f40807f) {
            this.f40447b.a(cVar);
            return true;
        } else if (t == m.f40810i) {
            this.f40448c.a(cVar);
            return true;
        } else if (t == m.f40811j) {
            this.f40449d.a(cVar);
            return true;
        } else if (t == m.f40804c) {
            this.f40450e.a(cVar);
            return true;
        } else if (t == m.u && (aVar2 = this.f40451f) != null) {
            aVar2.a(cVar);
            return true;
        } else if (t != m.v || (aVar = this.f40452g) == null) {
            return false;
        } else {
            aVar.a(cVar);
            return true;
        }
    }
}
