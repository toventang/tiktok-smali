package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.e.b.q;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class f implements k, m, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f5160a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f5161b;

    /* renamed from: c  reason: collision with root package name */
    private final g f5162c;

    /* renamed from: d  reason: collision with root package name */
    private final a<?, PointF> f5163d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, PointF> f5164e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.e.b.a f5165f;

    /* renamed from: g  reason: collision with root package name */
    private s f5166g;

    /* renamed from: h  reason: collision with root package name */
    private b f5167h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5168i;

    static {
        Covode.recordClassIndex(2191);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5161b;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5168i = false;
        this.f5162c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.a.a.m
    public final Path e() {
        b bVar;
        if (this.f5168i) {
            return this.f5160a;
        }
        this.f5160a.reset();
        PointF f2 = this.f5163d.f();
        float f3 = f2.x / 2.0f;
        float f4 = f2.y / 2.0f;
        float f5 = f3 * 0.55228f;
        float f6 = 0.55228f * f4;
        this.f5160a.reset();
        if (this.f5165f.f5377d) {
            float f7 = -f4;
            this.f5160a.moveTo(0.0f, f7);
            float f8 = 0.0f - f5;
            float f9 = -f3;
            float f10 = 0.0f - f6;
            this.f5160a.cubicTo(f8, f7, f9, f10, f9, 0.0f);
            float f11 = f6 + 0.0f;
            this.f5160a.cubicTo(f9, f11, f8, f4, 0.0f, f4);
            float f12 = f5 + 0.0f;
            this.f5160a.cubicTo(f12, f4, f3, f11, f3, 0.0f);
            this.f5160a.cubicTo(f3, f10, f12, f7, 0.0f, f7);
        } else {
            float f13 = -f4;
            this.f5160a.moveTo(0.0f, f13);
            float f14 = f5 + 0.0f;
            float f15 = 0.0f - f6;
            this.f5160a.cubicTo(f14, f13, f3, f15, f3, 0.0f);
            float f16 = f6 + 0.0f;
            this.f5160a.cubicTo(f3, f16, f14, f4, 0.0f, f4);
            float f17 = 0.0f - f5;
            float f18 = -f3;
            this.f5160a.cubicTo(f17, f4, f18, f16, f18, 0.0f);
            this.f5160a.cubicTo(f18, f15, f17, f13, 0.0f, f13);
        }
        PointF f19 = this.f5164e.f();
        this.f5160a.offset(f19.x, f19.y);
        this.f5160a.close();
        if (!d.a.f5625a || (bVar = this.f5167h) == null) {
            com.airbnb.lottie.i.g.a(this.f5160a, this.f5166g);
        } else {
            bVar.a(this.f5160a);
        }
        this.f5168i = true;
        return this.f5160a;
    }

    @Override // com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        if (t == k.f5741g) {
            this.f5163d.a(cVar);
        } else if (t == k.f5744j) {
            this.f5164e.a(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        b bVar;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f5251a == q.a.Simultaneously) {
                    if (!d.a.f5625a || (bVar = this.f5167h) == null) {
                        this.f5166g = sVar;
                        sVar.a(this);
                    } else {
                        bVar.a(sVar);
                        sVar.a(this);
                    }
                }
            }
        }
    }

    public f(g gVar, com.airbnb.lottie.e.c.a aVar, com.airbnb.lottie.e.b.a aVar2) {
        if (d.a.f5625a) {
            this.f5167h = new b();
        }
        this.f5161b = aVar2.f5374a;
        this.f5162c = gVar;
        a<PointF, PointF> a2 = aVar2.f5376c.a();
        this.f5163d = a2;
        a<PointF, PointF> a3 = aVar2.f5375b.a();
        this.f5164e = a3;
        this.f5165f = aVar2;
        aVar.a(a2);
        aVar.a(a3);
        a2.a(this);
        a3.a(this);
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        com.airbnb.lottie.i.f.a(eVar, i2, list, eVar2, this);
    }
}
