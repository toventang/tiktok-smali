package com.bytedance.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.o;
import com.bytedance.lottie.c.a.l;
import com.bytedance.lottie.c.b.b;
import com.bytedance.lottie.c.b.n;
import com.bytedance.lottie.c.e;
import com.bytedance.lottie.c.f;
import com.bytedance.lottie.i;
import java.util.ArrayList;
import java.util.List;

public final class c implements d, l, a.AbstractC0986a, f {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f40314a;

    /* renamed from: b  reason: collision with root package name */
    private final Path f40315b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f40316c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40317d;

    /* renamed from: e  reason: collision with root package name */
    private final List<b> f40318e;

    /* renamed from: f  reason: collision with root package name */
    private final i f40319f;

    /* renamed from: g  reason: collision with root package name */
    private List<l> f40320g;

    /* renamed from: h  reason: collision with root package name */
    private o f40321h;

    static {
        Covode.recordClassIndex(24833);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40317d;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40319f.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public final Matrix d() {
        o oVar = this.f40321h;
        if (oVar != null) {
            return oVar.a();
        }
        this.f40314a.reset();
        return this.f40314a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final List<l> c() {
        if (this.f40320g == null) {
            this.f40320g = new ArrayList();
            for (int i2 = 0; i2 < this.f40318e.size(); i2++) {
                b bVar = this.f40318e.get(i2);
                if (bVar instanceof l) {
                    this.f40320g.add(bVar);
                }
            }
        }
        return this.f40320g;
    }

    @Override // com.bytedance.lottie.a.a.l
    public final Path e() {
        this.f40314a.reset();
        o oVar = this.f40321h;
        if (oVar != null) {
            this.f40314a.set(oVar.a());
        }
        this.f40315b.reset();
        for (int size = this.f40318e.size() - 1; size >= 0; size--) {
            b bVar = this.f40318e.get(size);
            if (bVar instanceof l) {
                this.f40315b.addPath(((l) bVar).e(), this.f40314a);
            }
        }
        return this.f40315b;
    }

    private static l a(List<b> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof l) {
                return (l) bVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.lottie.c.f
    public final <T> void a(T t, com.bytedance.lottie.g.c<T> cVar) {
        o oVar = this.f40321h;
        if (oVar != null) {
            oVar.a(t, cVar);
        }
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(RectF rectF, Matrix matrix) {
        this.f40314a.set(matrix);
        o oVar = this.f40321h;
        if (oVar != null) {
            this.f40314a.preConcat(oVar.a());
        }
        this.f40316c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f40318e.size() - 1; size >= 0; size--) {
            b bVar = this.f40318e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).a(this.f40316c, this.f40314a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f40316c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f40316c.left), Math.min(rectF.top, this.f40316c.top), Math.max(rectF.right, this.f40316c.right), Math.max(rectF.bottom, this.f40316c.bottom));
                }
            }
        }
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f40318e.size());
        arrayList.addAll(list);
        for (int size = this.f40318e.size() - 1; size >= 0; size--) {
            b bVar = this.f40318e.get(size);
            bVar.a(arrayList, this.f40318e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    public c(i iVar, com.bytedance.lottie.c.c.a aVar, n nVar) {
        this(iVar, aVar, nVar.f40559a, a(iVar, aVar, nVar.f40560b), a(nVar.f40560b));
    }

    private static List<b> a(i iVar, com.bytedance.lottie.c.c.a aVar, List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            b a2 = list.get(i2).a(iVar, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        this.f40314a.set(matrix);
        o oVar = this.f40321h;
        if (oVar != null) {
            this.f40314a.preConcat(oVar.a());
            i2 = (int) ((((((float) this.f40321h.f40450e.d().intValue()) / 100.0f) * ((float) i2)) / 255.0f) * 255.0f);
        }
        for (int size = this.f40318e.size() - 1; size >= 0; size--) {
            b bVar = this.f40318e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).a(canvas, this.f40314a, i2);
            }
        }
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        if (eVar.a(this.f40317d, i2)) {
            if (!"__container".equals(this.f40317d)) {
                eVar2 = eVar2.a(this.f40317d);
                if (eVar.c(this.f40317d, i2)) {
                    list.add(eVar2.a(this));
                }
            }
            if (eVar.d(this.f40317d, i2)) {
                int b2 = i2 + eVar.b(this.f40317d, i2);
                for (int i3 = 0; i3 < this.f40318e.size(); i3++) {
                    b bVar = this.f40318e.get(i3);
                    if (bVar instanceof f) {
                        ((f) bVar).a(eVar, b2, list, eVar2);
                    }
                }
            }
        }
    }

    c(i iVar, com.bytedance.lottie.c.c.a aVar, String str, List<b> list, l lVar) {
        this.f40314a = new Matrix();
        this.f40315b = new Path();
        this.f40316c = new RectF();
        this.f40317d = str;
        this.f40319f = iVar;
        this.f40318e = list;
        if (lVar != null) {
            o a2 = lVar.a();
            this.f40321h = a2;
            a2.a(aVar);
            this.f40321h.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof i) {
                arrayList.add(bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((i) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }
}
