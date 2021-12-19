package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.e;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.e.a.b;
import com.airbnb.lottie.e.b.q;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.i.f;
import com.airbnb.lottie.j.c;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements e, k, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    protected final com.airbnb.lottie.e.c.a f5136a;

    /* renamed from: b  reason: collision with root package name */
    final Paint f5137b;

    /* renamed from: c  reason: collision with root package name */
    private final PathMeasure f5138c = new PathMeasure();

    /* renamed from: d  reason: collision with root package name */
    private final Path f5139d = new Path();

    /* renamed from: e  reason: collision with root package name */
    private final Path f5140e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final RectF f5141f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final g f5142g;

    /* renamed from: h  reason: collision with root package name */
    private final List<C0072a> f5143h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final float[] f5144i;

    /* renamed from: j  reason: collision with root package name */
    private final com.airbnb.lottie.a.b.a<?, Float> f5145j;

    /* renamed from: k  reason: collision with root package name */
    private final com.airbnb.lottie.a.b.a<?, Integer> f5146k;

    /* renamed from: l  reason: collision with root package name */
    private final List<com.airbnb.lottie.a.b.a<?, Float>> f5147l;

    /* renamed from: m  reason: collision with root package name */
    private final com.airbnb.lottie.a.b.a<?, Float> f5148m;
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> n;

    static {
        Covode.recordClassIndex(2185);
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5142g.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.a.a.a$a  reason: collision with other inner class name */
    public static final class C0072a {

        /* renamed from: a  reason: collision with root package name */
        public final List<m> f5149a;

        /* renamed from: b  reason: collision with root package name */
        public final s f5150b;

        static {
            Covode.recordClassIndex(2186);
        }

        private C0072a(s sVar) {
            this.f5149a = new ArrayList();
            this.f5150b = sVar;
        }

        /* synthetic */ C0072a(s sVar, byte b2) {
            this(sVar);
        }
    }

    @Override // com.airbnb.lottie.e.f
    public <T> void a(T t, c<T> cVar) {
        com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> aVar;
        if (t == k.f5738d) {
            this.f5146k.a(cVar);
        } else if (t == k.o) {
            this.f5145j.a(cVar);
        } else if (t == k.C) {
            if (d.a.f5625a && (aVar = this.n) != null) {
                this.f5136a.b(aVar);
            }
            if (cVar == null) {
                this.n = null;
                return;
            }
            p pVar = new p(cVar);
            this.n = pVar;
            pVar.a(this);
            this.f5136a.a(this.n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        C0072a aVar = null;
        s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.f5251a == q.a.Individually) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.f5251a == q.a.Individually) {
                    if (aVar != null) {
                        this.f5143h.add(aVar);
                    }
                    aVar = new C0072a(sVar3, (byte) 0);
                    sVar3.a(this);
                }
            }
            if (cVar2 instanceof m) {
                if (aVar == null) {
                    aVar = new C0072a(sVar, (byte) 0);
                }
                aVar.f5149a.add(cVar2);
            }
        }
        if (aVar != null) {
            this.f5143h.add(aVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        float floatValue;
        com.airbnb.lottie.d.b("StrokeContent#getBounds");
        this.f5139d.reset();
        for (int i2 = 0; i2 < this.f5143h.size(); i2++) {
            C0072a aVar = this.f5143h.get(i2);
            for (int i3 = 0; i3 < aVar.f5149a.size(); i3++) {
                this.f5139d.addPath(aVar.f5149a.get(i3).e(), matrix);
            }
        }
        this.f5139d.computeBounds(this.f5141f, false);
        if (d.a.f5625a) {
            floatValue = ((com.airbnb.lottie.a.b.c) this.f5145j).g();
        } else {
            floatValue = this.f5145j.f().floatValue();
        }
        RectF rectF2 = this.f5141f;
        float f2 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f2, this.f5141f.top - f2, this.f5141f.right + f2, this.f5141f.bottom + f2);
        rectF.set(this.f5141f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.d.c("StrokeContent#getBounds");
    }

    private void a(Canvas canvas, C0072a aVar, Matrix matrix) {
        float f2;
        com.airbnb.lottie.d.b("StrokeContent#applyTrimPath");
        if (aVar.f5150b == null) {
            com.airbnb.lottie.d.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f5139d.reset();
        for (int size = aVar.f5149a.size() - 1; size >= 0; size--) {
            this.f5139d.addPath(aVar.f5149a.get(size).e(), matrix);
        }
        this.f5138c.setPath(this.f5139d, false);
        float length = this.f5138c.getLength();
        while (this.f5138c.nextContour()) {
            length += this.f5138c.getLength();
        }
        float floatValue = (aVar.f5150b.f5254d.f().floatValue() * length) / 360.0f;
        float floatValue2 = ((aVar.f5150b.f5252b.f().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((aVar.f5150b.f5253c.f().floatValue() * length) / 100.0f) + floatValue;
        float f3 = 0.0f;
        for (int size2 = aVar.f5149a.size() - 1; size2 >= 0; size2--) {
            this.f5140e.set(aVar.f5149a.get(size2).e());
            this.f5140e.transform(matrix);
            this.f5138c.setPath(this.f5140e, false);
            float length2 = this.f5138c.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    if (floatValue2 > length) {
                        f2 = (floatValue2 - length) / length2;
                    } else {
                        f2 = 0.0f;
                    }
                    f4 = Math.min(f5 / length2, 1.0f);
                    com.airbnb.lottie.i.g.a(this.f5140e, f2, f4, 0.0f);
                    canvas.drawPath(this.f5140e, this.f5137b);
                    f3 += length2;
                }
            }
            float f6 = f3 + length2;
            if (f6 >= floatValue2 && f3 <= floatValue3) {
                if (f6 > floatValue3 || floatValue2 >= f3) {
                    if (floatValue2 < f3) {
                        f2 = 0.0f;
                    } else {
                        f2 = (floatValue2 - f3) / length2;
                    }
                    if (floatValue3 <= f6) {
                        f4 = (floatValue3 - f3) / length2;
                    }
                    com.airbnb.lottie.i.g.a(this.f5140e, f2, f4, 0.0f);
                    canvas.drawPath(this.f5140e, this.f5137b);
                } else {
                    canvas.drawPath(this.f5140e, this.f5137b);
                }
            }
            f3 += length2;
        }
        com.airbnb.lottie.d.c("StrokeContent#applyTrimPath");
    }

    @Override // com.airbnb.lottie.a.a.e
    public void a(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.d.b("StrokeContent#draw");
        float f2 = 0.0f;
        if (d.a.f5625a) {
            float[] fArr = com.airbnb.lottie.i.g.f5695a.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 37394.73f;
            fArr[3] = 39575.234f;
            matrix.mapPoints(fArr);
            if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
                com.airbnb.lottie.d.c("StrokeContent#draw");
                return;
            }
            this.f5137b.setAlpha(f.a((int) ((((((float) i2) / 255.0f) * ((float) ((e) this.f5146k).g())) / 100.0f) * 255.0f)));
            this.f5137b.setStrokeWidth(((com.airbnb.lottie.a.b.c) this.f5145j).g() * com.airbnb.lottie.i.g.a(matrix));
        } else {
            this.f5137b.setAlpha(f.a((int) ((((((float) i2) / 255.0f) * ((float) this.f5146k.f().intValue())) / 100.0f) * 255.0f)));
            this.f5137b.setStrokeWidth(this.f5145j.f().floatValue() * com.airbnb.lottie.i.g.a(matrix));
        }
        if (this.f5137b.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.d.c("StrokeContent#draw");
            return;
        }
        com.airbnb.lottie.d.b("StrokeContent#applyDashPattern");
        if (this.f5147l.isEmpty()) {
            com.airbnb.lottie.d.c("StrokeContent#applyDashPattern");
        } else {
            float a2 = com.airbnb.lottie.i.g.a(matrix);
            for (int i3 = 0; i3 < this.f5147l.size(); i3++) {
                this.f5144i[i3] = this.f5147l.get(i3).f().floatValue();
                if (i3 % 2 == 0) {
                    float[] fArr2 = this.f5144i;
                    if (fArr2[i3] < 1.0f) {
                        fArr2[i3] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f5144i;
                    if (fArr3[i3] < 0.1f) {
                        fArr3[i3] = 0.1f;
                    }
                }
                float[] fArr4 = this.f5144i;
                fArr4[i3] = fArr4[i3] * a2;
            }
            if (d.a.f5625a) {
                com.airbnb.lottie.a.b.a<?, Float> aVar = this.f5148m;
                if (aVar != null) {
                    f2 = aVar.f().floatValue() * a2;
                }
            } else {
                com.airbnb.lottie.a.b.a<?, Float> aVar2 = this.f5148m;
                if (aVar2 != null) {
                    f2 = aVar2.f().floatValue();
                }
            }
            this.f5137b.setPathEffect(new DashPathEffect(this.f5144i, f2));
            com.airbnb.lottie.d.c("StrokeContent#applyDashPattern");
        }
        com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> aVar3 = this.n;
        if (aVar3 != null) {
            this.f5137b.setColorFilter(aVar3.f());
        }
        for (int i4 = 0; i4 < this.f5143h.size(); i4++) {
            C0072a aVar4 = this.f5143h.get(i4);
            if (aVar4.f5150b != null) {
                a(canvas, aVar4, matrix);
            } else {
                com.airbnb.lottie.d.b("StrokeContent#buildPath");
                this.f5139d.reset();
                for (int size = aVar4.f5149a.size() - 1; size >= 0; size--) {
                    this.f5139d.addPath(aVar4.f5149a.get(size).e(), matrix);
                }
                com.airbnb.lottie.d.c("StrokeContent#buildPath");
                com.airbnb.lottie.d.b("StrokeContent#drawPath");
                canvas.drawPath(this.f5139d, this.f5137b);
                com.airbnb.lottie.d.c("StrokeContent#drawPath");
            }
        }
        com.airbnb.lottie.d.c("StrokeContent#draw");
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(com.airbnb.lottie.e.e eVar, int i2, List<com.airbnb.lottie.e.e> list, com.airbnb.lottie.e.e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }

    a(g gVar, com.airbnb.lottie.e.c.a aVar, Paint.Cap cap, Paint.Join join, float f2, com.airbnb.lottie.e.a.d dVar, b bVar, List<b> list, b bVar2) {
        if (d.a.f5625a) {
            this.f5137b = new com.airbnb.lottie.a.a(1);
        } else {
            this.f5137b = new Paint(1);
        }
        this.f5142g = gVar;
        this.f5136a = aVar;
        this.f5137b.setStyle(Paint.Style.STROKE);
        this.f5137b.setStrokeCap(cap);
        this.f5137b.setStrokeJoin(join);
        this.f5137b.setStrokeMiter(f2);
        this.f5146k = dVar.a();
        this.f5145j = bVar.a();
        if (bVar2 == null) {
            this.f5148m = null;
        } else {
            this.f5148m = bVar2.a();
        }
        this.f5147l = new ArrayList(list.size());
        this.f5144i = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f5147l.add(list.get(i2).a());
        }
        aVar.a(this.f5146k);
        aVar.a(this.f5145j);
        for (int i3 = 0; i3 < this.f5147l.size(); i3++) {
            aVar.a(this.f5147l.get(i3));
        }
        com.airbnb.lottie.a.b.a<?, Float> aVar2 = this.f5148m;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
        this.f5146k.a(this);
        this.f5145j.a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f5147l.get(i4).a(this);
        }
        com.airbnb.lottie.a.b.a<?, Float> aVar3 = this.f5148m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }
}
