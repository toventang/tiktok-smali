package com.bytedance.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.b.k;
import com.bytedance.lottie.c.e;
import com.bytedance.lottie.f.f;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;
import java.util.List;

public final class o implements d, i, j, l, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f40391a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f40392b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final i f40393c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.lottie.c.c.a f40394d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40395e;

    /* renamed from: f  reason: collision with root package name */
    private final a<Float, Float> f40396f;

    /* renamed from: g  reason: collision with root package name */
    private final a<Float, Float> f40397g;

    /* renamed from: h  reason: collision with root package name */
    private final com.bytedance.lottie.a.b.o f40398h;

    /* renamed from: i  reason: collision with root package name */
    private c f40399i;

    static {
        Covode.recordClassIndex(24847);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40395e;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40393c.invalidateSelf();
    }

    @Override // com.bytedance.lottie.a.a.l
    public final Path e() {
        Path e2 = this.f40399i.e();
        this.f40392b.reset();
        float floatValue = this.f40396f.d().floatValue();
        float floatValue2 = this.f40397g.d().floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f40391a.set(this.f40398h.a(((float) i2) + floatValue2));
            this.f40392b.addPath(e2, this.f40391a);
        }
        return this.f40392b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // com.bytedance.lottie.a.a.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ListIterator<com.bytedance.lottie.a.a.b> r7) {
        /*
            r6 = this;
            com.bytedance.lottie.a.a.c r0 = r6.f40399i
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
            com.bytedance.lottie.a.a.c r0 = new com.bytedance.lottie.a.a.c
            com.bytedance.lottie.i r1 = r6.f40393c
            com.bytedance.lottie.c.c.a r2 = r6.f40394d
            r5 = 0
            java.lang.String r3 = "Repeater"
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f40399i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.a.a.o.a(java.util.ListIterator):void");
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(RectF rectF, Matrix matrix) {
        this.f40399i.a(rectF, matrix);
    }

    @Override // com.bytedance.lottie.c.f
    public final <T> void a(T t, c<T> cVar) {
        if (!this.f40398h.a(t, cVar)) {
            if (t == m.f40814m) {
                this.f40396f.a(cVar);
            } else if (t == m.n) {
                this.f40397g.a(cVar);
            }
        }
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        this.f40399i.a(list, list2);
    }

    public o(i iVar, com.bytedance.lottie.c.c.a aVar, k kVar) {
        this.f40393c = iVar;
        this.f40394d = aVar;
        this.f40395e = kVar.f40547a;
        a<Float, Float> a2 = kVar.f40548b.a();
        this.f40396f = a2;
        aVar.a(a2);
        a2.a(this);
        a<Float, Float> a3 = kVar.f40549c.a();
        this.f40397g = a3;
        aVar.a(a3);
        a3.a(this);
        com.bytedance.lottie.a.b.o a4 = kVar.f40550d.a();
        this.f40398h = a4;
        a4.a(aVar);
        a4.a(this);
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = this.f40396f.d().floatValue();
        float floatValue2 = this.f40397g.d().floatValue();
        float floatValue3 = this.f40398h.f40451f.d().floatValue() / 100.0f;
        float floatValue4 = this.f40398h.f40452g.d().floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.f40391a.set(matrix);
            float f2 = (float) i3;
            this.f40391a.preConcat(this.f40398h.a(f2 + floatValue2));
            this.f40399i.a(canvas, this.f40391a, (int) (((float) i2) * (((f2 / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
        }
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }
}
