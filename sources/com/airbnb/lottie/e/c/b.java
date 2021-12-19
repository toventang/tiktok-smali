package com.airbnb.lottie.e.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {

    /* renamed from: h  reason: collision with root package name */
    private a<Float, Float> f5479h;

    /* renamed from: i  reason: collision with root package name */
    private final List<a> f5480i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final RectF f5481j = new RectF();

    /* renamed from: k  reason: collision with root package name */
    private final RectF f5482k = new RectF();

    static {
        Covode.recordClassIndex(2286);
    }

    /* renamed from: com.airbnb.lottie.e.c.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5483a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 2287(0x8ef, float:3.205E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.e.c.d$b[] r0 = com.airbnb.lottie.e.c.d.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.e.c.b.AnonymousClass1.f5483a = r2
                com.airbnb.lottie.e.c.d$b r0 = com.airbnb.lottie.e.c.d.b.Add     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.e.c.b.AnonymousClass1.f5483a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.e.c.d$b r0 = com.airbnb.lottie.e.c.d.b.Invert     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.c.b.AnonymousClass1.<clinit>():void");
        }
    }

    private void a(RectF rectF) {
        if (d.a.f5625a) {
            for (int size = this.f5480i.size() - 1; size >= 0; size--) {
                this.f5481j.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f5480i.get(size).b(this.f5481j, this.f5463a);
                rectF.union(this.f5481j);
            }
            return;
        }
        this.f5481j.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size2 = this.f5480i.size() - 1; size2 >= 0; size2--) {
            this.f5480i.get(size2).a(this.f5481j, this.f5463a);
            if (rectF.isEmpty()) {
                rectF.set(this.f5481j);
            } else {
                rectF.set(Math.min(rectF.left, this.f5481j.left), Math.min(rectF.top, this.f5481j.top), Math.max(rectF.right, this.f5481j.right), Math.max(rectF.bottom, this.f5481j.bottom));
            }
        }
    }

    @Override // com.airbnb.lottie.e.c.a
    public final void a(float f2) {
        super.a(f2);
        if (d.a.f5625a) {
            if (this.f5479h != null) {
                f2 = ((this.f5479h.f().floatValue() * this.f5465c.f5490b.f5340k) - this.f5465c.f5490b.f5338i) / (this.f5464b.f5554a.b() + 0.01f);
            }
            if (this.f5479h == null) {
                f2 -= this.f5465c.a();
            }
            if (this.f5465c.f5501m != 0.0f) {
                f2 /= this.f5465c.f5501m;
            }
            for (int size = this.f5480i.size() - 1; size >= 0; size--) {
                this.f5480i.get(size).a(f2);
            }
            return;
        }
        if (this.f5479h != null) {
            f2 = ((float) ((long) (this.f5479h.f().floatValue() * 1000.0f))) / this.f5464b.f5554a.a();
        }
        if (this.f5465c.f5501m != 0.0f) {
            f2 /= this.f5465c.f5501m;
        }
        float a2 = f2 - this.f5465c.a();
        for (int size2 = this.f5480i.size() - 1; size2 >= 0; size2--) {
            this.f5480i.get(size2).a(a2);
        }
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        a(rectF);
    }

    @Override // com.airbnb.lottie.e.c.a
    public final void b(RectF rectF, Matrix matrix) {
        super.b(rectF, matrix);
        a(rectF);
    }

    @Override // com.airbnb.lottie.e.c.a, com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        super.a(t, cVar);
        if (t != k.A) {
            return;
        }
        if (cVar != null) {
            this.f5479h = new p(cVar);
            if (d.a.f5625a) {
                this.f5479h.a(this);
            }
            a(this.f5479h);
        } else if (d.a.f5625a) {
            a<Float, Float> aVar = this.f5479h;
            if (aVar != null) {
                aVar.a((c<Float>) null);
            }
        } else {
            this.f5479h = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.e.c.a
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.d.b("CompositionLayer#draw");
        canvas.save();
        this.f5482k.set(0.0f, 0.0f, (float) this.f5465c.n, (float) this.f5465c.o);
        matrix.mapRect(this.f5482k);
        for (int size = this.f5480i.size() - 1; size >= 0; size--) {
            if (this.f5482k.isEmpty() || canvas.clipRect(this.f5482k)) {
                this.f5480i.get(size).a(canvas, matrix, i2);
            }
        }
        canvas.restore();
        com.airbnb.lottie.d.c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.e.c.a
    public final void b(e eVar, int i2, List<e> list, e eVar2) {
        for (int i3 = 0; i3 < this.f5480i.size(); i3++) {
            this.f5480i.get(i3).a(eVar, i2, list, eVar2);
        }
    }

    public b(g gVar, d dVar, List<d> list, com.airbnb.lottie.e eVar) {
        super(gVar, dVar);
        int i2;
        a aVar;
        com.airbnb.lottie.e.a.b bVar = dVar.r;
        if (bVar != null) {
            a<Float, Float> a2 = bVar.a();
            this.f5479h = a2;
            a(a2);
            this.f5479h.a(this);
        } else {
            this.f5479h = null;
        }
        androidx.c.d dVar2 = new androidx.c.d(eVar.f5336g.size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            d dVar3 = list.get(size);
            a a3 = a.a(dVar3, gVar, eVar);
            if (a3 != null) {
                dVar2.b(a3.f5465c.f5492d, a3);
                if (aVar2 != null) {
                    aVar2.f5467e = a3;
                    aVar2 = null;
                } else {
                    this.f5480i.add(0, a3);
                    int i3 = AnonymousClass1.f5483a[dVar3.t.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        aVar2 = a3;
                    }
                }
            }
            size--;
        }
        for (i2 = 0; i2 < dVar2.b(); i2++) {
            a aVar3 = (a) dVar2.a(dVar2.b(i2));
            if (!(aVar3 == null || (aVar = (a) dVar2.a(aVar3.f5465c.f5494f)) == null)) {
                aVar3.f5468f = aVar;
            }
        }
    }
}
