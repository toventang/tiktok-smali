package com.bytedance.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.b.q;
import com.bytedance.lottie.f.f;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;
import java.util.List;

public final class e implements j, l, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f40322a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f40323b;

    /* renamed from: c  reason: collision with root package name */
    private final i f40324c;

    /* renamed from: d  reason: collision with root package name */
    private final a<?, PointF> f40325d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, PointF> f40326e;

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.lottie.c.b.a f40327f;

    /* renamed from: g  reason: collision with root package name */
    private r f40328g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f40329h;

    static {
        Covode.recordClassIndex(24835);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40323b;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40329h = false;
        this.f40324c.invalidateSelf();
    }

    @Override // com.bytedance.lottie.a.a.l
    public final Path e() {
        if (this.f40329h) {
            return this.f40322a;
        }
        this.f40322a.reset();
        PointF d2 = this.f40325d.d();
        float f2 = d2.x / 2.0f;
        float f3 = d2.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.f40322a.reset();
        if (this.f40327f.f40501d) {
            float f6 = -f3;
            this.f40322a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.f40322a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.f40322a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.f40322a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.f40322a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.f40322a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.f40322a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.f40322a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.f40322a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.f40322a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF d3 = this.f40326e.d();
        this.f40322a.offset(d3.x, d3.y);
        this.f40322a.close();
        h.a(this.f40322a, this.f40328g);
        this.f40329h = true;
        return this.f40322a;
    }

    @Override // com.bytedance.lottie.c.f
    public final <T> void a(T t, c<T> cVar) {
        if (t == m.f40808g) {
            this.f40325d.a(cVar);
        } else if (t == m.f40809h) {
            this.f40326e.a(cVar);
        }
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f40410a == q.a.Simultaneously) {
                    this.f40328g = rVar;
                    rVar.a(this);
                }
            }
        }
    }

    public e(i iVar, com.bytedance.lottie.c.c.a aVar, com.bytedance.lottie.c.b.a aVar2) {
        this.f40323b = aVar2.f40498a;
        this.f40324c = iVar;
        a<PointF, PointF> a2 = aVar2.f40500c.a();
        this.f40325d = a2;
        a<PointF, PointF> a3 = aVar2.f40499b.a();
        this.f40326e = a3;
        this.f40327f = aVar2;
        aVar.a(a2);
        aVar.a(a3);
        a2.a(this);
        a3.a(this);
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(com.bytedance.lottie.c.e eVar, int i2, List<com.bytedance.lottie.c.e> list, com.bytedance.lottie.c.e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
