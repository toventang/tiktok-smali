package com.bytedance.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.b.j;
import com.bytedance.lottie.c.b.q;
import com.bytedance.lottie.c.e;
import com.bytedance.lottie.f.f;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import java.util.List;

public final class n implements j, l, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f40382a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f40383b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private final String f40384c;

    /* renamed from: d  reason: collision with root package name */
    private final i f40385d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, PointF> f40386e;

    /* renamed from: f  reason: collision with root package name */
    private final a<?, PointF> f40387f;

    /* renamed from: g  reason: collision with root package name */
    private final a<?, Float> f40388g;

    /* renamed from: h  reason: collision with root package name */
    private r f40389h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40390i;

    static {
        Covode.recordClassIndex(24846);
    }

    @Override // com.bytedance.lottie.c.f
    public final <T> void a(T t, c<T> cVar) {
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40384c;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40390i = false;
        this.f40385d.invalidateSelf();
    }

    @Override // com.bytedance.lottie.a.a.l
    public final Path e() {
        float floatValue;
        if (this.f40390i) {
            return this.f40382a;
        }
        this.f40382a.reset();
        PointF d2 = this.f40387f.d();
        float f2 = d2.x / 2.0f;
        float f3 = d2.y / 2.0f;
        a<?, Float> aVar = this.f40388g;
        if (aVar == null) {
            floatValue = 0.0f;
        } else {
            floatValue = aVar.d().floatValue();
        }
        float min = Math.min(f2, f3);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF d3 = this.f40386e.d();
        this.f40382a.moveTo(d3.x + f2, (d3.y - f3) + floatValue);
        this.f40382a.lineTo(d3.x + f2, (d3.y + f3) - floatValue);
        if (floatValue > 0.0f) {
            float f4 = floatValue * 2.0f;
            this.f40383b.set((d3.x + f2) - f4, (d3.y + f3) - f4, d3.x + f2, d3.y + f3);
            this.f40382a.arcTo(this.f40383b, 0.0f, 90.0f, false);
        }
        this.f40382a.lineTo((d3.x - f2) + floatValue, d3.y + f3);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.f40383b.set(d3.x - f2, (d3.y + f3) - f5, (d3.x - f2) + f5, d3.y + f3);
            this.f40382a.arcTo(this.f40383b, 90.0f, 90.0f, false);
        }
        this.f40382a.lineTo(d3.x - f2, (d3.y - f3) + floatValue);
        if (floatValue > 0.0f) {
            float f6 = floatValue * 2.0f;
            this.f40383b.set(d3.x - f2, d3.y - f3, (d3.x - f2) + f6, (d3.y - f3) + f6);
            this.f40382a.arcTo(this.f40383b, 180.0f, 90.0f, false);
        }
        this.f40382a.lineTo((d3.x + f2) - floatValue, d3.y - f3);
        if (floatValue > 0.0f) {
            float f7 = floatValue * 2.0f;
            this.f40383b.set((d3.x + f2) - f7, d3.y - f3, d3.x + f2, (d3.y - f3) + f7);
            this.f40382a.arcTo(this.f40383b, 270.0f, 90.0f, false);
        }
        this.f40382a.close();
        h.a(this.f40382a, this.f40389h);
        this.f40390i = true;
        return this.f40382a;
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f40410a == q.a.Simultaneously) {
                    this.f40389h = rVar;
                    rVar.a(this);
                }
            }
        }
    }

    public n(i iVar, com.bytedance.lottie.c.c.a aVar, j jVar) {
        this.f40384c = jVar.f40543a;
        this.f40385d = iVar;
        a<PointF, PointF> a2 = jVar.f40544b.a();
        this.f40386e = a2;
        a<PointF, PointF> a3 = jVar.f40545c.a();
        this.f40387f = a3;
        a<Float, Float> a4 = jVar.f40546d.a();
        this.f40388g = a4;
        aVar.a(a2);
        aVar.a(a3);
        aVar.a(a4);
        a2.a(this);
        a3.a(this);
        a4.a(this);
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
