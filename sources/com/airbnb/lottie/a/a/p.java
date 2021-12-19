package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class p implements e, j, k, m, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f5231a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f5232b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final g f5233c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.e.c.a f5234d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5235e;

    /* renamed from: f  reason: collision with root package name */
    private final a<Float, Float> f5236f;

    /* renamed from: g  reason: collision with root package name */
    private final a<Float, Float> f5237g;

    /* renamed from: h  reason: collision with root package name */
    private final o f5238h;

    /* renamed from: i  reason: collision with root package name */
    private d f5239i;

    static {
        Covode.recordClassIndex(2203);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5235e;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5233c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.a.a.m
    public final Path e() {
        Path e2 = this.f5239i.e();
        this.f5232b.reset();
        float floatValue = this.f5236f.f().floatValue();
        float floatValue2 = this.f5237g.f().floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f5231a.set(this.f5238h.a(((float) i2) + floatValue2));
            this.f5232b.addPath(e2, this.f5231a);
        }
        return this.f5232b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // com.airbnb.lottie.a.a.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ListIterator<com.airbnb.lottie.a.a.c> r7) {
        /*
            r6 = this;
            com.airbnb.lottie.a.a.d r0 = r6.f5239i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r7.previous()
            if (r0 != r6) goto L_0x0005
        L_0x0011:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0016:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r7.previous()
            r4.add(r0)
            r7.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r4)
            com.airbnb.lottie.a.a.d r0 = new com.airbnb.lottie.a.a.d
            com.airbnb.lottie.g r1 = r6.f5233c
            com.airbnb.lottie.e.c.a r2 = r6.f5234d
            r5 = 0
            java.lang.String r3 = "Repeater"
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f5239i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.p.a(java.util.ListIterator):void");
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        this.f5239i.a(rectF, matrix);
    }

    @Override // com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        if (!this.f5238h.a(t, cVar)) {
            if (t == k.q) {
                this.f5236f.a(cVar);
            } else if (t == k.r) {
                this.f5237g.a(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        this.f5239i.a(list, list2);
    }

    public p(g gVar, com.airbnb.lottie.e.c.a aVar, com.airbnb.lottie.e.b.k kVar) {
        this.f5233c = gVar;
        this.f5234d = aVar;
        this.f5235e = kVar.f5423a;
        a<Float, Float> a2 = kVar.f5424b.a();
        this.f5236f = a2;
        aVar.a(a2);
        a2.a(this);
        a<Float, Float> a3 = kVar.f5425c.a();
        this.f5237g = a3;
        aVar.a(a3);
        a3.a(this);
        o a4 = kVar.f5426d.a();
        this.f5238h = a4;
        a4.a(aVar);
        a4.a(this);
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = this.f5236f.f().floatValue();
        float floatValue2 = this.f5237g.f().floatValue();
        float floatValue3 = this.f5238h.f5295f.f().floatValue() / 100.0f;
        float floatValue4 = this.f5238h.f5296g.f().floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.f5231a.set(matrix);
            float f2 = (float) i3;
            this.f5231a.preConcat(this.f5238h.a(f2 + floatValue2));
            this.f5239i.a(canvas, this.f5231a, (int) (((float) i2) * (((f2 / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
        }
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
