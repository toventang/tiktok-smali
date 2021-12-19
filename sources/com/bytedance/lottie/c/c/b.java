package com.bytedance.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.c.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.p;
import com.bytedance.lottie.e;
import com.bytedance.lottie.g;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {

    /* renamed from: g  reason: collision with root package name */
    private a<Float, Float> f40604g;

    /* renamed from: h  reason: collision with root package name */
    private final List<a> f40605h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final RectF f40606i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    private final RectF f40607j = new RectF();

    static {
        Covode.recordClassIndex(24917);
    }

    /* renamed from: com.bytedance.lottie.c.c.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40608a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 24918(0x6156, float:3.4918E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.c.c.d$b[] r0 = com.bytedance.lottie.c.c.d.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.c.c.b.AnonymousClass1.f40608a = r2
                com.bytedance.lottie.c.c.d$b r0 = com.bytedance.lottie.c.c.d.b.Add     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.c.c.b.AnonymousClass1.f40608a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.c.c.d$b r0 = com.bytedance.lottie.c.c.d.b.Invert     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.c.c.b.AnonymousClass1.<clinit>():void");
        }
    }

    @Override // com.bytedance.lottie.c.c.a
    public final void a(float f2) {
        super.a(f2);
        if (this.f40604g != null) {
            f2 = ((float) ((long) (this.f40604g.d().floatValue() * 1000.0f))) / this.f40588b.f40763a.a();
        }
        if (this.f40589c.f40625m != 0.0f) {
            f2 /= this.f40589c.f40625m;
        }
        d dVar = this.f40589c;
        float b2 = f2 - (dVar.n / dVar.f40614b.b());
        for (int size = this.f40605h.size() - 1; size >= 0; size--) {
            this.f40605h.get(size).a(b2);
        }
    }

    @Override // com.bytedance.lottie.c.f, com.bytedance.lottie.c.c.a
    public final <T> void a(T t, c<T> cVar) {
        super.a(t, cVar);
        if (t != m.w) {
            return;
        }
        if (cVar == null) {
            this.f40604g = null;
            return;
        }
        p pVar = new p(cVar);
        this.f40604g = pVar;
        a(pVar);
    }

    @Override // com.bytedance.lottie.a.a.d, com.bytedance.lottie.c.c.a
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.f40606i.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f40605h.size() - 1; size >= 0; size--) {
            this.f40605h.get(size).a(this.f40606i, this.f40587a);
            if (rectF.isEmpty()) {
                rectF.set(this.f40606i);
            } else {
                rectF.set(Math.min(rectF.left, this.f40606i.left), Math.min(rectF.top, this.f40606i.top), Math.max(rectF.right, this.f40606i.right), Math.max(rectF.bottom, this.f40606i.bottom));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.c.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        e.b("CompositionLayer#draw");
        canvas.save();
        this.f40607j.set(0.0f, 0.0f, (float) this.f40589c.o, (float) this.f40589c.p);
        matrix.mapRect(this.f40607j);
        for (int size = this.f40605h.size() - 1; size >= 0; size--) {
            if (this.f40607j.isEmpty() || canvas.clipRect(this.f40607j)) {
                this.f40605h.get(size).a(canvas, matrix, i2);
            }
        }
        canvas.restore();
        e.c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.lottie.c.c.a
    public final void b(com.bytedance.lottie.c.e eVar, int i2, List<com.bytedance.lottie.c.e> list, com.bytedance.lottie.c.e eVar2) {
        for (int i3 = 0; i3 < this.f40605h.size(); i3++) {
            this.f40605h.get(i3).a(eVar, i2, list, eVar2);
        }
    }

    public b(i iVar, d dVar, List<d> list, g gVar) {
        super(iVar, dVar);
        int i2;
        a aVar;
        com.bytedance.lottie.c.a.b bVar = dVar.s;
        if (bVar != null) {
            a<Float, Float> a2 = bVar.a();
            this.f40604g = a2;
            a(a2);
            this.f40604g.a(this);
        } else {
            this.f40604g = null;
        }
        d dVar2 = new d(gVar.f40711g.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            d dVar3 = list.get(size);
            a a3 = a.a(dVar3, iVar, gVar);
            if (a3 != null) {
                dVar2.b(a3.f40589c.f40616d, a3);
                if (aVar2 != null) {
                    aVar2.f40590d = a3;
                    aVar2 = null;
                } else {
                    this.f40605h.add(0, a3);
                    int i3 = AnonymousClass1.f40608a[dVar3.u.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        aVar2 = a3;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < dVar2.b(); i2++) {
            a aVar3 = (a) dVar2.a(dVar2.b(i2));
            if (!(aVar3 == null || (aVar = (a) dVar2.a(aVar3.f40589c.f40618f)) == null)) {
                aVar3.f40591e = aVar;
            }
        }
    }
}
