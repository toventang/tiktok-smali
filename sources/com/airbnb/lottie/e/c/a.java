package com.airbnb.lottie.e.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.c;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.d;
import com.airbnb.lottie.e.b.g;
import com.airbnb.lottie.e.b.l;
import com.airbnb.lottie.e.c.d;
import com.airbnb.lottie.e.f;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class a implements e, a.AbstractC0073a, f {

    /* renamed from: a  reason: collision with root package name */
    final Matrix f5463a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    final g f5464b;

    /* renamed from: c  reason: collision with root package name */
    public final d f5465c;

    /* renamed from: d  reason: collision with root package name */
    public c f5466d;

    /* renamed from: e  reason: collision with root package name */
    public a f5467e;

    /* renamed from: f  reason: collision with root package name */
    public a f5468f;

    /* renamed from: g  reason: collision with root package name */
    final o f5469g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f5470h = new Path();

    /* renamed from: i  reason: collision with root package name */
    private final Matrix f5471i = new Matrix();

    /* renamed from: j  reason: collision with root package name */
    private final Paint f5472j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f5473k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f5474l;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f5475m;
    private final Paint n;
    private final RectF o = new RectF();
    private final RectF p = new RectF();
    private final RectF q = new RectF();
    private final RectF r = new RectF();
    private final String s;
    private com.airbnb.lottie.a.b.g t;
    private List<a> u;
    private final List<com.airbnb.lottie.a.b.a<?, ?>> v = new ArrayList();
    private boolean w;

    static {
        Covode.recordClassIndex(2283);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<com.airbnb.lottie.a.a.c> list, List<com.airbnb.lottie.a.a.c> list2) {
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Canvas canvas, Matrix matrix, int i2);

    /* access modifiers changed from: package-private */
    public void b(com.airbnb.lottie.e.e eVar, int i2, List<com.airbnb.lottie.e.e> list, com.airbnb.lottie.e.e eVar2) {
    }

    public final void a(boolean z) {
        if (z != this.w) {
            this.w = z;
            this.f5464b.invalidateSelf();
        }
    }

    @Override // com.airbnb.lottie.e.f
    public <T> void a(T t2, com.airbnb.lottie.j.c<T> cVar) {
        this.f5469g.a(t2, cVar);
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(com.airbnb.lottie.e.e eVar, int i2, List<com.airbnb.lottie.e.e> list, com.airbnb.lottie.e.e eVar2) {
        if (eVar.a(this.f5465c.f5491c, i2)) {
            if (!"__container".equals(this.f5465c.f5491c)) {
                eVar2 = eVar2.a(this.f5465c.f5491c);
                if (eVar.c(this.f5465c.f5491c, i2)) {
                    list.add(eVar2.a(this));
                }
            }
            if (eVar.d(this.f5465c.f5491c, i2)) {
                b(eVar, i2 + eVar.b(this.f5465c.f5491c, i2), list, eVar2);
            }
        }
    }

    private boolean e() {
        if (this.f5467e != null) {
            return true;
        }
        return false;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.f5464b.invalidateSelf();
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5465c.f5491c;
    }

    private boolean f() {
        com.airbnb.lottie.a.b.g gVar = this.t;
        if (gVar == null || gVar.f5274a.isEmpty()) {
            return false;
        }
        return true;
    }

    public final int c() {
        d dVar = this.f5465c;
        if (dVar == null) {
            return 0;
        }
        return dVar.n;
    }

    public final int d() {
        d dVar = this.f5465c;
        if (dVar == null) {
            return 0;
        }
        return dVar.o;
    }

    private void g() {
        if (this.u == null) {
            if (this.f5468f == null) {
                this.u = Collections.emptyList();
                return;
            }
            this.u = new ArrayList();
            for (a aVar = this.f5468f; aVar != null; aVar = aVar.f5468f) {
                this.u.add(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.e.c.a$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5477a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5478b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0073 */
        static {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.e.c.a.AnonymousClass2.<clinit>():void");
        }
    }

    private void b(float f2) {
        this.f5464b.f5554a.f5330a.a(this.f5465c.f5491c, f2);
    }

    public final void a(com.airbnb.lottie.a.b.a<?, ?> aVar) {
        if (aVar != null) {
            this.v.add(aVar);
        }
    }

    public final void b(com.airbnb.lottie.a.b.a<?, ?> aVar) {
        this.v.remove(aVar);
    }

    private void a(Canvas canvas) {
        d.b("Layer#clearLayer");
        canvas.drawRect(this.o.left - 1.0f, this.o.top - 1.0f, this.o.right + 1.0f, this.o.bottom + 1.0f, this.n);
        d.c("Layer#clearLayer");
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        c cVar;
        o oVar = this.f5469g;
        oVar.f5290a.a(f2);
        oVar.f5291b.a(f2);
        oVar.f5292c.a(f2);
        oVar.f5293d.a(f2);
        oVar.f5294e.a(f2);
        if (oVar.f5295f != null) {
            oVar.f5295f.a(f2);
        }
        if (oVar.f5296g != null) {
            oVar.f5296g.a(f2);
        }
        if (this.t != null) {
            for (int i2 = 0; i2 < this.t.f5274a.size(); i2++) {
                this.t.f5274a.get(i2).a(f2);
            }
        }
        if (this.f5465c.f5501m != 0.0f) {
            f2 /= this.f5465c.f5501m;
        }
        if (d.a.f5625a && (cVar = this.f5466d) != null) {
            cVar.a(f2 / this.f5465c.f5501m);
        }
        a aVar = this.f5467e;
        if (aVar != null) {
            this.f5467e.a(aVar.f5465c.f5501m * f2);
        }
        for (int i3 = 0; i3 < this.v.size(); i3++) {
            this.v.get(i3).a(f2);
        }
    }

    private void c(RectF rectF, Matrix matrix) {
        if (!e() || this.f5465c.t == d.b.Invert) {
            return;
        }
        if (d.a.f5625a) {
            this.q.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f5467e.b(this.q, matrix);
            if (!rectF.intersect(this.q)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            return;
        }
        this.f5467e.a(this.q, matrix);
        rectF.set(Math.max(rectF.left, this.q.left), Math.max(rectF.top, this.q.top), Math.min(rectF.right, this.q.right), Math.min(rectF.bottom, this.q.bottom));
    }

    public void b(RectF rectF, Matrix matrix) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        g();
        this.f5463a.set(matrix);
        List<a> list = this.u;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f5463a.preConcat(this.u.get(size).f5469g.a());
            }
        } else {
            a aVar = this.f5468f;
            if (aVar != null) {
                this.f5463a.preConcat(aVar.f5469g.a());
            }
        }
        this.f5463a.preConcat(this.f5469g.a());
    }

    a(g gVar, d dVar) {
        boolean z = true;
        this.w = true;
        if (d.a.f5625a) {
            this.f5472j = new com.airbnb.lottie.a.a(1);
            this.f5473k = new com.airbnb.lottie.a.a(PorterDuff.Mode.DST_IN, (byte) 0);
            this.f5474l = new com.airbnb.lottie.a.a(PorterDuff.Mode.DST_OUT, (byte) 0);
            this.f5475m = new com.airbnb.lottie.a.a(1);
            this.n = new com.airbnb.lottie.a.a(PorterDuff.Mode.CLEAR);
        } else {
            this.f5472j = new Paint(1);
            Paint paint = new Paint(1);
            this.f5473k = paint;
            Paint paint2 = new Paint(1);
            this.f5474l = paint2;
            this.f5475m = new Paint(1);
            Paint paint3 = new Paint();
            this.n = paint3;
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        this.f5464b = gVar;
        this.f5465c = dVar;
        this.s = dVar.f5491c + "#draw";
        if (dVar.t == d.b.Invert) {
            this.f5475m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f5475m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        o a2 = dVar.f5497i.a();
        this.f5469g = a2;
        a2.a((a.AbstractC0073a) this);
        if (dVar.f5496h != null && !dVar.f5496h.isEmpty()) {
            com.airbnb.lottie.a.b.g gVar2 = new com.airbnb.lottie.a.b.g(dVar.f5496h);
            this.t = gVar2;
            for (com.airbnb.lottie.a.b.a<l, Path> aVar : gVar2.f5274a) {
                aVar.a(this);
            }
            for (com.airbnb.lottie.a.b.a<Integer, Integer> aVar2 : this.t.f5275b) {
                a(aVar2);
                aVar2.a(this);
            }
        }
        if (!this.f5465c.s.isEmpty()) {
            c cVar = new c(this.f5465c.s);
            this.f5466d = cVar;
            cVar.f5258b = true;
            this.f5466d.a(new a.AbstractC0073a() {
                /* class com.airbnb.lottie.e.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(2284);
                }

                @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
                public final void a() {
                    boolean z = true;
                    if (d.a.f5625a) {
                        a aVar = a.this;
                        if (aVar.f5466d.g() != 1.0f) {
                            z = false;
                        }
                        aVar.a(z);
                        return;
                    }
                    a aVar2 = a.this;
                    if (((Float) aVar2.f5466d.f()).floatValue() != 1.0f) {
                        z = false;
                    }
                    aVar2.a(z);
                }
            });
            a(((Float) this.f5466d.f()).floatValue() != 1.0f ? false : z);
            a(this.f5466d);
            return;
        }
        a(true);
    }

    @Override // com.airbnb.lottie.a.a.e
    public void a(RectF rectF, Matrix matrix) {
        if (d.a.f5625a) {
            this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
            g();
        }
        this.f5463a.set(matrix);
        this.f5463a.preConcat(this.f5469g.a());
    }

    static a a(d dVar, g gVar, com.airbnb.lottie.e eVar) {
        switch (AnonymousClass2.f5477a[dVar.f5493e.ordinal()]) {
            case 1:
                return new f(gVar, dVar);
            case 2:
                return new b(gVar, dVar, eVar.f5331b.get(dVar.f5495g), eVar);
            case 3:
                return new g(gVar, dVar);
            case 4:
                return new c(gVar, dVar);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new e(gVar, dVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new h(gVar, dVar);
            default:
                com.airbnb.lottie.d.a("Unknown layer type " + dVar.f5493e);
                return null;
        }
    }

    private void a(Canvas canvas, Matrix matrix, g.a aVar) {
        Paint paint;
        if (AnonymousClass2.f5478b[aVar.ordinal()] != 1) {
            paint = this.f5473k;
        } else {
            paint = this.f5474l;
        }
        int size = this.t.f5276c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.t.f5276c.get(i2).f5402a == aVar) {
                com.airbnb.lottie.d.b("Layer#drawMask");
                com.airbnb.lottie.d.b("Layer#saveLayer");
                a(canvas, this.o, paint, false);
                com.airbnb.lottie.d.c("Layer#saveLayer");
                a(canvas);
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.t.f5276c.get(i3).f5402a == aVar) {
                        this.f5470h.set(this.t.f5274a.get(i3).f());
                        this.f5470h.transform(matrix);
                        int alpha = this.f5472j.getAlpha();
                        this.f5472j.setAlpha((int) (((float) this.t.f5275b.get(i3).f().intValue()) * 2.55f));
                        canvas.drawPath(this.f5470h, this.f5472j);
                        this.f5472j.setAlpha(alpha);
                    }
                }
                com.airbnb.lottie.d.b("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.d.c("Layer#restoreLayer");
                com.airbnb.lottie.d.c("Layer#drawMask");
                return;
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.d.b(this.s);
        if (!this.w) {
            com.airbnb.lottie.d.c(this.s);
            return;
        }
        g();
        com.airbnb.lottie.d.b("Layer#parentMatrix");
        this.f5471i.reset();
        this.f5471i.set(matrix);
        int i3 = 1;
        for (int size = this.u.size() - 1; size >= 0; size--) {
            this.f5471i.preConcat(this.u.get(size).f5469g.a());
        }
        com.airbnb.lottie.d.c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i2) / 255.0f) * ((float) this.f5469g.f5294e.f().intValue())) / 100.0f) * 255.0f);
        if (e() || f()) {
            com.airbnb.lottie.d.b("Layer#computeBounds");
            this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.o, this.f5471i);
            if (d.a.f5625a) {
                c(this.o, matrix);
            } else {
                c(this.o, this.f5471i);
            }
            this.f5471i.preConcat(this.f5469g.a());
            RectF rectF = this.o;
            Matrix matrix2 = this.f5471i;
            this.p.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean z = false;
            if (f()) {
                int size2 = this.t.f5276c.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        this.f5470h.set(this.t.f5274a.get(i4).f());
                        this.f5470h.transform(matrix2);
                        int i5 = AnonymousClass2.f5478b[this.t.f5276c.get(i4).f5402a.ordinal()];
                        if (i5 == i3 || i5 == 2) {
                            break;
                        }
                        this.f5470h.computeBounds(this.r, z);
                        if (i4 == 0) {
                            this.p.set(this.r);
                        } else {
                            RectF rectF2 = this.p;
                            rectF2.set(Math.min(rectF2.left, this.r.left), Math.min(this.p.top, this.r.top), Math.max(this.p.right, this.r.right), Math.max(this.p.bottom, this.r.bottom));
                        }
                        i4++;
                        i3 = 1;
                        z = false;
                    } else if (!d.a.f5625a) {
                        rectF.set(Math.max(rectF.left, this.p.left), Math.max(rectF.top, this.p.top), Math.min(rectF.right, this.p.right), Math.min(rectF.bottom, this.p.bottom));
                    } else if (!rectF.intersect(this.p)) {
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
            }
            if (!d.a.f5625a) {
                this.o.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            } else if (!this.o.intersect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.airbnb.lottie.d.c("Layer#computeBounds");
            if (d.a.f5625a) {
                if (this.o.width() < 1.0f || this.o.height() < 1.0f) {
                    b(com.airbnb.lottie.d.c(this.s));
                    return;
                }
                this.f5472j.setAlpha(255);
            }
            com.airbnb.lottie.d.b("Layer#saveLayer");
            a(canvas, this.o, this.f5472j, true);
            com.airbnb.lottie.d.c("Layer#saveLayer");
            a(canvas);
            com.airbnb.lottie.d.b("Layer#drawLayer");
            b(canvas, this.f5471i, intValue);
            com.airbnb.lottie.d.c("Layer#drawLayer");
            if (f()) {
                Matrix matrix3 = this.f5471i;
                a(canvas, matrix3, g.a.MaskModeAdd);
                a(canvas, matrix3, g.a.MaskModeIntersect);
                a(canvas, matrix3, g.a.MaskModeSubtract);
            }
            if (e()) {
                com.airbnb.lottie.d.b("Layer#drawMatte");
                com.airbnb.lottie.d.b("Layer#saveLayer");
                a(canvas, this.o, this.f5475m, false);
                com.airbnb.lottie.d.c("Layer#saveLayer");
                a(canvas);
                this.f5467e.a(canvas, matrix, intValue);
                com.airbnb.lottie.d.b("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.d.c("Layer#restoreLayer");
                com.airbnb.lottie.d.c("Layer#drawMatte");
            }
            com.airbnb.lottie.d.b("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.d.c("Layer#restoreLayer");
            b(com.airbnb.lottie.d.c(this.s));
            return;
        }
        this.f5471i.preConcat(this.f5469g.a());
        com.airbnb.lottie.d.b("Layer#drawLayer");
        b(canvas, this.f5471i, intValue);
        com.airbnb.lottie.d.c("Layer#drawLayer");
        b(com.airbnb.lottie.d.c(this.s));
    }

    private static void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        int i2;
        if (Build.VERSION.SDK_INT < 23) {
            if (z) {
                i2 = 31;
            } else {
                i2 = 19;
            }
            canvas.saveLayer(rectF, paint, i2);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }
}
