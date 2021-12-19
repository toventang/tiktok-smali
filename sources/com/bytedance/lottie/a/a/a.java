package com.bytedance.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.p;
import com.bytedance.lottie.c.a.b;
import com.bytedance.lottie.c.a.d;
import com.bytedance.lottie.c.b.q;
import com.bytedance.lottie.e;
import com.bytedance.lottie.f.f;
import com.bytedance.lottie.f.h;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements d, j, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    final Paint f40299a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f40300b = new PathMeasure();

    /* renamed from: c  reason: collision with root package name */
    private final Path f40301c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final Path f40302d = new Path();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f40303e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final i f40304f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.lottie.c.c.a f40305g;

    /* renamed from: h  reason: collision with root package name */
    private final List<C0985a> f40306h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final float[] f40307i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.lottie.a.b.a<?, Float> f40308j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.lottie.a.b.a<?, Integer> f40309k;

    /* renamed from: l  reason: collision with root package name */
    private final List<com.bytedance.lottie.a.b.a<?, Float>> f40310l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.lottie.a.b.a<?, Float> f40311m;
    private com.bytedance.lottie.a.b.a<ColorFilter, ColorFilter> n;

    static {
        Covode.recordClassIndex(24830);
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40304f.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.a.a.a$a  reason: collision with other inner class name */
    public static final class C0985a {

        /* renamed from: a  reason: collision with root package name */
        public final List<l> f40312a;

        /* renamed from: b  reason: collision with root package name */
        public final r f40313b;

        static {
            Covode.recordClassIndex(24831);
        }

        private C0985a(r rVar) {
            this.f40312a = new ArrayList();
            this.f40313b = rVar;
        }

        /* synthetic */ C0985a(r rVar, byte b2) {
            this(rVar);
        }
    }

    @Override // com.bytedance.lottie.c.f
    public <T> void a(T t, c<T> cVar) {
        if (t == m.f40805d) {
            this.f40309k.a(cVar);
        } else if (t == m.f40812k) {
            this.f40308j.a(cVar);
        } else if (t != m.x) {
        } else {
            if (cVar == null) {
                this.n = null;
                return;
            }
            p pVar = new p(cVar);
            this.n = pVar;
            pVar.a(this);
            this.f40305g.a(this.n);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        C0985a aVar = null;
        r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof r) {
                r rVar2 = (r) bVar;
                if (rVar2.f40410a == q.a.Individually) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof r) {
                r rVar3 = (r) bVar2;
                if (rVar3.f40410a == q.a.Individually) {
                    if (aVar != null) {
                        this.f40306h.add(aVar);
                    }
                    aVar = new C0985a(rVar3, (byte) 0);
                    rVar3.a(this);
                }
            }
            if (bVar2 instanceof l) {
                if (aVar == null) {
                    aVar = new C0985a(rVar, (byte) 0);
                }
                aVar.f40312a.add(bVar2);
            }
        }
        if (aVar != null) {
            this.f40306h.add(aVar);
        }
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(RectF rectF, Matrix matrix) {
        e.b("StrokeContent#getBounds");
        this.f40301c.reset();
        for (int i2 = 0; i2 < this.f40306h.size(); i2++) {
            C0985a aVar = this.f40306h.get(i2);
            for (int i3 = 0; i3 < aVar.f40312a.size(); i3++) {
                this.f40301c.addPath(aVar.f40312a.get(i3).e(), matrix);
            }
        }
        this.f40301c.computeBounds(this.f40303e, false);
        float floatValue = this.f40308j.d().floatValue();
        RectF rectF2 = this.f40303e;
        float f2 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f2, this.f40303e.top - f2, this.f40303e.right + f2, this.f40303e.bottom + f2);
        rectF.set(this.f40303e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        e.c("StrokeContent#getBounds");
    }

    private void a(Canvas canvas, C0985a aVar, Matrix matrix) {
        float f2;
        e.b("StrokeContent#applyTrimPath");
        if (aVar.f40313b == null) {
            e.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f40301c.reset();
        for (int size = aVar.f40312a.size() - 1; size >= 0; size--) {
            this.f40301c.addPath(aVar.f40312a.get(size).e(), matrix);
        }
        this.f40300b.setPath(this.f40301c, false);
        float length = this.f40300b.getLength();
        while (this.f40300b.nextContour()) {
            length += this.f40300b.getLength();
        }
        float floatValue = (aVar.f40313b.f40413d.d().floatValue() * length) / 360.0f;
        float floatValue2 = ((aVar.f40313b.f40411b.d().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((aVar.f40313b.f40412c.d().floatValue() * length) / 100.0f) + floatValue;
        float f3 = 0.0f;
        for (int size2 = aVar.f40312a.size() - 1; size2 >= 0; size2--) {
            this.f40302d.set(aVar.f40312a.get(size2).e());
            this.f40302d.transform(matrix);
            this.f40300b.setPath(this.f40302d, false);
            float length2 = this.f40300b.getLength();
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
                    h.a(this.f40302d, f2, f4, 0.0f);
                    canvas.drawPath(this.f40302d, this.f40299a);
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
                    h.a(this.f40302d, f2, f4, 0.0f);
                    canvas.drawPath(this.f40302d, this.f40299a);
                } else {
                    canvas.drawPath(this.f40302d, this.f40299a);
                }
            }
            f3 += length2;
        }
        e.c("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.lottie.a.a.d
    public void a(Canvas canvas, Matrix matrix, int i2) {
        e.b("StrokeContent#draw");
        this.f40299a.setAlpha(f.a((int) ((((((float) i2) / 255.0f) * ((float) this.f40309k.d().intValue())) / 100.0f) * 255.0f)));
        this.f40299a.setStrokeWidth(this.f40308j.d().floatValue() * h.a(matrix));
        float f2 = 0.0f;
        if (this.f40299a.getStrokeWidth() <= 0.0f) {
            e.c("StrokeContent#draw");
            return;
        }
        e.b("StrokeContent#applyDashPattern");
        if (this.f40310l.isEmpty()) {
            e.c("StrokeContent#applyDashPattern");
        } else {
            float a2 = h.a(matrix);
            for (int i3 = 0; i3 < this.f40310l.size(); i3++) {
                this.f40307i[i3] = this.f40310l.get(i3).d().floatValue();
                if (i3 % 2 == 0) {
                    float[] fArr = this.f40307i;
                    if (fArr[i3] < 1.0f) {
                        fArr[i3] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.f40307i;
                    if (fArr2[i3] < 0.1f) {
                        fArr2[i3] = 0.1f;
                    }
                }
                float[] fArr3 = this.f40307i;
                fArr3[i3] = fArr3[i3] * a2;
            }
            com.bytedance.lottie.a.b.a<?, Float> aVar = this.f40311m;
            if (aVar != null) {
                f2 = aVar.d().floatValue();
            }
            this.f40299a.setPathEffect(new DashPathEffect(this.f40307i, f2));
            e.c("StrokeContent#applyDashPattern");
        }
        com.bytedance.lottie.a.b.a<ColorFilter, ColorFilter> aVar2 = this.n;
        if (aVar2 != null) {
            this.f40299a.setColorFilter(aVar2.d());
        }
        for (int i4 = 0; i4 < this.f40306h.size(); i4++) {
            C0985a aVar3 = this.f40306h.get(i4);
            if (aVar3.f40313b != null) {
                a(canvas, aVar3, matrix);
            } else {
                e.b("StrokeContent#buildPath");
                this.f40301c.reset();
                for (int size = aVar3.f40312a.size() - 1; size >= 0; size--) {
                    this.f40301c.addPath(aVar3.f40312a.get(size).e(), matrix);
                }
                e.c("StrokeContent#buildPath");
                e.b("StrokeContent#drawPath");
                canvas.drawPath(this.f40301c, this.f40299a);
                e.c("StrokeContent#drawPath");
            }
        }
        e.c("StrokeContent#draw");
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(com.bytedance.lottie.c.e eVar, int i2, List<com.bytedance.lottie.c.e> list, com.bytedance.lottie.c.e eVar2) {
        f.a(eVar, i2, list, eVar2, this);
    }

    a(i iVar, com.bytedance.lottie.c.c.a aVar, Paint.Cap cap, Paint.Join join, float f2, d dVar, b bVar, List<b> list, b bVar2) {
        Paint paint = new Paint(1);
        this.f40299a = paint;
        this.f40304f = iVar;
        this.f40305g = aVar;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f2);
        this.f40309k = dVar.a();
        this.f40308j = bVar.a();
        if (bVar2 == null) {
            this.f40311m = null;
        } else {
            this.f40311m = bVar2.a();
        }
        this.f40310l = new ArrayList(list.size());
        this.f40307i = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f40310l.add(list.get(i2).a());
        }
        aVar.a(this.f40309k);
        aVar.a(this.f40308j);
        for (int i3 = 0; i3 < this.f40310l.size(); i3++) {
            aVar.a(this.f40310l.get(i3));
        }
        com.bytedance.lottie.a.b.a<?, Float> aVar2 = this.f40311m;
        if (aVar2 != null) {
            aVar.a(aVar2);
        }
        this.f40309k.a(this);
        this.f40308j.a(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f40310l.get(i4).a(this);
        }
        com.bytedance.lottie.a.b.a<?, Float> aVar3 = this.f40311m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
    }
}
