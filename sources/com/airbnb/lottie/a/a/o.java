package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.e.b.j;
import com.airbnb.lottie.e.b.q;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.c;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class o implements k, m, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f5221a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f5222b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private final String f5223c;

    /* renamed from: d  reason: collision with root package name */
    private final g f5224d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, PointF> f5225e;

    /* renamed from: f  reason: collision with root package name */
    private final a<?, PointF> f5226f;

    /* renamed from: g  reason: collision with root package name */
    private final a<?, Float> f5227g;

    /* renamed from: h  reason: collision with root package name */
    private s f5228h;

    /* renamed from: i  reason: collision with root package name */
    private b f5229i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5230j;

    static {
        Covode.recordClassIndex(2202);
    }

    @Override // com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5223c;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5230j = false;
        this.f5224d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.a.a.m
    public final Path e() {
        float floatValue;
        b bVar;
        if (this.f5230j) {
            return this.f5221a;
        }
        this.f5221a.reset();
        PointF f2 = this.f5226f.f();
        float f3 = f2.x / 2.0f;
        float f4 = f2.y / 2.0f;
        a<?, Float> aVar = this.f5227g;
        if (aVar == null) {
            floatValue = 0.0f;
        } else {
            floatValue = aVar.f().floatValue();
        }
        float min = Math.min(f3, f4);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF f5 = this.f5225e.f();
        this.f5221a.moveTo(f5.x + f3, (f5.y - f4) + floatValue);
        this.f5221a.lineTo(f5.x + f3, (f5.y + f4) - floatValue);
        if (floatValue > 0.0f) {
            float f6 = floatValue * 2.0f;
            this.f5222b.set((f5.x + f3) - f6, (f5.y + f4) - f6, f5.x + f3, f5.y + f4);
            this.f5221a.arcTo(this.f5222b, 0.0f, 90.0f, false);
        }
        this.f5221a.lineTo((f5.x - f3) + floatValue, f5.y + f4);
        if (floatValue > 0.0f) {
            float f7 = floatValue * 2.0f;
            this.f5222b.set(f5.x - f3, (f5.y + f4) - f7, (f5.x - f3) + f7, f5.y + f4);
            this.f5221a.arcTo(this.f5222b, 90.0f, 90.0f, false);
        }
        this.f5221a.lineTo(f5.x - f3, (f5.y - f4) + floatValue);
        if (floatValue > 0.0f) {
            float f8 = floatValue * 2.0f;
            this.f5222b.set(f5.x - f3, f5.y - f4, (f5.x - f3) + f8, (f5.y - f4) + f8);
            this.f5221a.arcTo(this.f5222b, 180.0f, 90.0f, false);
        }
        this.f5221a.lineTo((f5.x + f3) - floatValue, f5.y - f4);
        if (floatValue > 0.0f) {
            float f9 = floatValue * 2.0f;
            this.f5222b.set((f5.x + f3) - f9, f5.y - f4, f5.x + f3, (f5.y - f4) + f9);
            this.f5221a.arcTo(this.f5222b, 270.0f, 90.0f, false);
        }
        this.f5221a.close();
        if (!d.a.f5625a || (bVar = this.f5229i) == null) {
            com.airbnb.lottie.i.g.a(this.f5221a, this.f5228h);
        } else {
            bVar.a(this.f5221a);
        }
        this.f5230j = true;
        return this.f5221a;
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        b bVar;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f5251a == q.a.Simultaneously) {
                    if (!d.a.f5625a || (bVar = this.f5229i) == null) {
                        this.f5228h = sVar;
                        sVar.a(this);
                    } else {
                        bVar.a(sVar);
                        sVar.a(this);
                    }
                }
            }
        }
    }

    public o(g gVar, com.airbnb.lottie.e.c.a aVar, j jVar) {
        if (d.a.f5625a) {
            this.f5229i = new b();
        }
        this.f5223c = jVar.f5419a;
        this.f5224d = gVar;
        a<PointF, PointF> a2 = jVar.f5420b.a();
        this.f5225e = a2;
        a<PointF, PointF> a3 = jVar.f5421c.a();
        this.f5226f = a3;
        a<Float, Float> a4 = jVar.f5422d.a();
        this.f5227g = a4;
        aVar.a(a2);
        aVar.a(a3);
        aVar.a(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
