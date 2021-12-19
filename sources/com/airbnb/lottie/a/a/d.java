package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.e.a.l;
import com.airbnb.lottie.e.b.b;
import com.airbnb.lottie.e.b.n;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.e.f;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.j.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d implements e, m, a.AbstractC0073a, f {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f5152a;

    /* renamed from: b  reason: collision with root package name */
    private final Path f5153b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f5154c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5155d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f5156e;

    /* renamed from: f  reason: collision with root package name */
    private final g f5157f;

    /* renamed from: g  reason: collision with root package name */
    private List<m> f5158g;

    /* renamed from: h  reason: collision with root package name */
    private o f5159h;

    static {
        Covode.recordClassIndex(2189);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5155d;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5157f.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public final Matrix d() {
        o oVar = this.f5159h;
        if (oVar != null) {
            return oVar.a();
        }
        this.f5152a.reset();
        return this.f5152a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final List<m> c() {
        if (this.f5158g == null) {
            this.f5158g = new ArrayList();
            for (int i2 = 0; i2 < this.f5156e.size(); i2++) {
                c cVar = this.f5156e.get(i2);
                if (cVar instanceof m) {
                    this.f5158g.add(cVar);
                }
            }
        }
        return this.f5158g;
    }

    @Override // com.airbnb.lottie.a.a.m
    public final Path e() {
        this.f5152a.reset();
        o oVar = this.f5159h;
        if (oVar != null) {
            this.f5152a.set(oVar.a());
        }
        this.f5153b.reset();
        for (int size = this.f5156e.size() - 1; size >= 0; size--) {
            c cVar = this.f5156e.get(size);
            if (cVar instanceof m) {
                this.f5153b.addPath(((m) cVar).e(), this.f5152a);
            }
        }
        return this.f5153b;
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

    @Override // com.airbnb.lottie.e.f
    public final <T> void a(T t, c<T> cVar) {
        o oVar = this.f5159h;
        if (oVar != null) {
            oVar.a(t, cVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        this.f5152a.set(matrix);
        o oVar = this.f5159h;
        if (oVar != null) {
            this.f5152a.preConcat(oVar.a());
        }
        this.f5154c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f5156e.size() - 1; size >= 0; size--) {
            c cVar = this.f5156e.get(size);
            if (cVar instanceof e) {
                e eVar = (e) cVar;
                eVar.a(this.f5154c, this.f5152a);
                if (d.a.f5625a) {
                    eVar.a(this.f5154c, this.f5152a);
                    rectF.union(this.f5154c);
                } else if (rectF.isEmpty()) {
                    rectF.set(this.f5154c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f5154c.left), Math.min(rectF.top, this.f5154c.top), Math.max(rectF.right, this.f5154c.right), Math.max(rectF.bottom, this.f5154c.bottom));
                }
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f5156e.size());
        arrayList.addAll(list);
        for (int size = this.f5156e.size() - 1; size >= 0; size--) {
            c cVar = this.f5156e.get(size);
            cVar.a(arrayList, this.f5156e.subList(0, size));
            arrayList.add(cVar);
        }
    }

    public d(g gVar, com.airbnb.lottie.e.c.a aVar, n nVar) {
        this(gVar, aVar, nVar.f5435a, a(gVar, aVar, nVar.f5436b), a(nVar.f5436b));
    }

    private static List<c> a(g gVar, com.airbnb.lottie.e.c.a aVar, List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            c a2 = list.get(i2).a(gVar, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        this.f5152a.set(matrix);
        o oVar = this.f5159h;
        if (oVar != null) {
            this.f5152a.preConcat(oVar.a());
            i2 = (int) ((((((float) this.f5159h.f5294e.f().intValue()) / 100.0f) * ((float) i2)) / 255.0f) * 255.0f);
        }
        for (int size = this.f5156e.size() - 1; size >= 0; size--) {
            c cVar = this.f5156e.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(canvas, this.f5152a, i2);
            }
        }
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        if (eVar.a(this.f5155d, i2)) {
            if (!"__container".equals(this.f5155d)) {
                eVar2 = eVar2.a(this.f5155d);
                if (eVar.c(this.f5155d, i2)) {
                    list.add(eVar2.a(this));
                }
            }
            if (eVar.d(this.f5155d, i2)) {
                int b2 = i2 + eVar.b(this.f5155d, i2);
                for (int i3 = 0; i3 < this.f5156e.size(); i3++) {
                    c cVar = this.f5156e.get(i3);
                    if (cVar instanceof f) {
                        ((f) cVar).a(eVar, b2, list, eVar2);
                    }
                }
            }
        }
    }

    d(g gVar, com.airbnb.lottie.e.c.a aVar, String str, List<c> list, l lVar) {
        this.f5152a = new Matrix();
        this.f5153b = new Path();
        this.f5154c = new RectF();
        this.f5155d = str;
        this.f5157f = gVar;
        this.f5156e = list;
        if (lVar != null) {
            o a2 = lVar.a();
            this.f5159h = a2;
            a2.a(aVar);
            this.f5159h.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add(cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }
}
