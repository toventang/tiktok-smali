package com.bytedance.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.a.b;
import com.bytedance.lottie.a.a.d;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.g;
import com.bytedance.lottie.a.b.o;
import com.bytedance.lottie.c.b.g;
import com.bytedance.lottie.c.b.l;
import com.bytedance.lottie.c.c.d;
import com.bytedance.lottie.c.e;
import com.bytedance.lottie.c.f;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class a implements d, a.AbstractC0986a, f {

    /* renamed from: a  reason: collision with root package name */
    final Matrix f40587a;

    /* renamed from: b  reason: collision with root package name */
    final i f40588b;

    /* renamed from: c  reason: collision with root package name */
    public final d f40589c;

    /* renamed from: d  reason: collision with root package name */
    public a f40590d;

    /* renamed from: e  reason: collision with root package name */
    public a f40591e;

    /* renamed from: f  reason: collision with root package name */
    final o f40592f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f40593g = new Path();

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f40594h = new Matrix();

    /* renamed from: i  reason: collision with root package name */
    private final Paint f40595i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f40596j;

    /* renamed from: k  reason: collision with root package name */
    private final Paint f40597k;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f40598l;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f40599m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final String r;
    private g s;
    private List<a> t;
    private final List<com.bytedance.lottie.a.b.a<?, ?>> u;
    private boolean v;

    static {
        Covode.recordClassIndex(24914);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Canvas canvas, Matrix matrix, int i2);

    /* access modifiers changed from: package-private */
    public void b(e eVar, int i2, List<e> list, e eVar2) {
    }

    public final void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            this.f40588b.invalidateSelf();
        }
    }

    @Override // com.bytedance.lottie.c.f
    public <T> void a(T t2, c<T> cVar) {
        this.f40592f.a(t2, cVar);
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        if (eVar.a(this.f40589c.f40615c, i2)) {
            if (!"__container".equals(this.f40589c.f40615c)) {
                eVar2 = eVar2.a(this.f40589c.f40615c);
                if (eVar.c(this.f40589c.f40615c, i2)) {
                    list.add(eVar2.a(this));
                }
            }
            if (eVar.d(this.f40589c.f40615c, i2)) {
                b(eVar, i2 + eVar.b(this.f40589c.f40615c, i2), list, eVar2);
            }
        }
    }

    private boolean c() {
        if (this.f40590d != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40588b.invalidateSelf();
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40589c.f40615c;
    }

    private boolean d() {
        g gVar = this.s;
        if (gVar == null || gVar.f40432a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.c.c.a$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40602a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f40603b;

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
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.c.c.a.AnonymousClass2.<clinit>():void");
        }
    }

    private void b(float f2) {
        this.f40588b.f40763a.f40705a.a(this.f40589c.f40615c, f2);
    }

    private void a(Canvas canvas) {
        com.bytedance.lottie.e.b("Layer#clearLayer");
        canvas.drawRect(this.n.left - 1.0f, this.n.top - 1.0f, this.n.right + 1.0f, this.n.bottom + 1.0f, this.f40599m);
        com.bytedance.lottie.e.c("Layer#clearLayer");
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        o oVar = this.f40592f;
        oVar.f40446a.a(f2);
        oVar.f40447b.a(f2);
        oVar.f40448c.a(f2);
        oVar.f40449d.a(f2);
        oVar.f40450e.a(f2);
        if (oVar.f40451f != null) {
            oVar.f40451f.a(f2);
        }
        if (oVar.f40452g != null) {
            oVar.f40452g.a(f2);
        }
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.f40432a.size(); i2++) {
                this.s.f40432a.get(i2).a(f2);
            }
        }
        if (this.f40589c.f40625m != 0.0f) {
            f2 /= this.f40589c.f40625m;
        }
        a aVar = this.f40590d;
        if (aVar != null) {
            this.f40590d.a(aVar.f40589c.f40625m * f2);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            this.u.get(i3).a(f2);
        }
    }

    public final void a(com.bytedance.lottie.a.b.a<?, ?> aVar) {
        this.u.add(aVar);
    }

    @Override // com.bytedance.lottie.a.a.d
    public void a(RectF rectF, Matrix matrix) {
        this.f40587a.set(matrix);
        this.f40587a.preConcat(this.f40592f.a());
    }

    private void b(RectF rectF, Matrix matrix) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (d()) {
            int size = this.s.f40434c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f40593g.set(this.s.f40432a.get(i2).d());
                this.f40593g.transform(matrix);
                int i3 = AnonymousClass2.f40603b[this.s.f40434c.get(i2).f40526a.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    this.f40593g.computeBounds(this.q, false);
                    if (i2 == 0) {
                        this.o.set(this.q);
                    } else {
                        RectF rectF2 = this.o;
                        rectF2.set(Math.min(rectF2.left, this.q.left), Math.min(this.o.top, this.q.top), Math.max(this.o.right, this.q.right), Math.max(this.o.bottom, this.q.bottom));
                    }
                } else {
                    return;
                }
            }
            rectF.set(Math.max(rectF.left, this.o.left), Math.max(rectF.top, this.o.top), Math.min(rectF.right, this.o.right), Math.min(rectF.bottom, this.o.bottom));
        }
    }

    a(i iVar, d dVar) {
        boolean z = true;
        this.f40595i = new Paint(1);
        Paint paint = new Paint(1);
        this.f40596j = paint;
        Paint paint2 = new Paint(1);
        this.f40597k = paint2;
        Paint paint3 = new Paint(1);
        this.f40598l = paint3;
        Paint paint4 = new Paint();
        this.f40599m = paint4;
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.f40587a = new Matrix();
        this.u = new ArrayList();
        this.v = true;
        this.f40588b = iVar;
        this.f40589c = dVar;
        this.r = dVar.f40615c + "#draw";
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (dVar.u == d.b.Invert) {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        o a2 = dVar.f40621i.a();
        this.f40592f = a2;
        a2.a((a.AbstractC0986a) this);
        if (dVar.f40620h != null && !dVar.f40620h.isEmpty()) {
            g gVar = new g(dVar.f40620h);
            this.s = gVar;
            for (com.bytedance.lottie.a.b.a<l, Path> aVar : gVar.f40432a) {
                aVar.a(this);
            }
            for (com.bytedance.lottie.a.b.a<?, ?> aVar2 : this.s.f40433b) {
                a(aVar2);
                aVar2.a(this);
            }
        }
        if (!this.f40589c.t.isEmpty()) {
            final com.bytedance.lottie.a.b.c cVar = new com.bytedance.lottie.a.b.c(this.f40589c.t);
            cVar.f40417b = true;
            cVar.a(new a.AbstractC0986a() {
                /* class com.bytedance.lottie.c.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(24915);
                }

                @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
                public final void a() {
                    boolean z;
                    a aVar = a.this;
                    if (((Float) cVar.d()).floatValue() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.a(z);
                }
            });
            a(((Float) cVar.d()).floatValue() != 1.0f ? false : z);
            a(cVar);
            return;
        }
        a(true);
    }

    private static void a(Canvas canvas, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, 31);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    static a a(d dVar, i iVar, com.bytedance.lottie.g gVar) {
        switch (AnonymousClass2.f40602a[dVar.f40617e.ordinal()]) {
            case 1:
                return new f(iVar, dVar);
            case 2:
                return new b(iVar, dVar, gVar.f40706b.get(dVar.f40619g), gVar);
            case 3:
                return new g(iVar, dVar);
            case 4:
                return new c(iVar, dVar);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new e(iVar, dVar);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new h(iVar, dVar);
            default:
                com.bytedance.lottie.e.a("Unknown layer type " + dVar.f40617e);
                return null;
        }
    }

    private void a(Canvas canvas, Matrix matrix, g.a aVar) {
        Paint paint;
        if (AnonymousClass2.f40603b[aVar.ordinal()] != 1) {
            paint = this.f40596j;
        } else {
            paint = this.f40597k;
        }
        int size = this.s.f40434c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.s.f40434c.get(i2).f40526a == aVar) {
                com.bytedance.lottie.e.b("Layer#drawMask");
                com.bytedance.lottie.e.b("Layer#saveLayer");
                a(canvas, this.n, paint);
                com.bytedance.lottie.e.c("Layer#saveLayer");
                a(canvas);
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.s.f40434c.get(i3).f40526a == aVar) {
                        this.f40593g.set(this.s.f40432a.get(i3).d());
                        this.f40593g.transform(matrix);
                        int alpha = this.f40595i.getAlpha();
                        this.f40595i.setAlpha((int) (((float) this.s.f40433b.get(i3).d().intValue()) * 2.55f));
                        canvas.drawPath(this.f40593g, this.f40595i);
                        this.f40595i.setAlpha(alpha);
                    }
                }
                com.bytedance.lottie.e.b("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.lottie.e.c("Layer#restoreLayer");
                com.bytedance.lottie.e.c("Layer#drawMask");
                return;
            }
        }
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        com.bytedance.lottie.e.b(this.r);
        if (!this.v) {
            com.bytedance.lottie.e.c(this.r);
            return;
        }
        if (this.t == null) {
            if (this.f40591e == null) {
                this.t = Collections.emptyList();
            } else {
                this.t = new ArrayList();
                for (a aVar = this.f40591e; aVar != null; aVar = aVar.f40591e) {
                    this.t.add(aVar);
                }
            }
        }
        com.bytedance.lottie.e.b("Layer#parentMatrix");
        this.f40594h.reset();
        this.f40594h.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.f40594h.preConcat(this.t.get(size).f40592f.a());
        }
        com.bytedance.lottie.e.c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i2) / 255.0f) * ((float) this.f40592f.f40450e.d().intValue())) / 100.0f) * 255.0f);
        if (c() || d()) {
            com.bytedance.lottie.e.b("Layer#computeBounds");
            this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.n, this.f40594h);
            RectF rectF = this.n;
            Matrix matrix2 = this.f40594h;
            if (c() && this.f40589c.u != d.b.Invert) {
                this.f40590d.a(this.p, matrix2);
                rectF.set(Math.max(rectF.left, this.p.left), Math.max(rectF.top, this.p.top), Math.min(rectF.right, this.p.right), Math.min(rectF.bottom, this.p.bottom));
            }
            this.f40594h.preConcat(this.f40592f.a());
            b(this.n, this.f40594h);
            this.n.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            com.bytedance.lottie.e.c("Layer#computeBounds");
            com.bytedance.lottie.e.b("Layer#saveLayer");
            a(canvas, this.n, this.f40595i);
            com.bytedance.lottie.e.c("Layer#saveLayer");
            a(canvas);
            com.bytedance.lottie.e.b("Layer#drawLayer");
            b(canvas, this.f40594h, intValue);
            com.bytedance.lottie.e.c("Layer#drawLayer");
            if (d()) {
                Matrix matrix3 = this.f40594h;
                a(canvas, matrix3, g.a.MaskModeAdd);
                a(canvas, matrix3, g.a.MaskModeIntersect);
                a(canvas, matrix3, g.a.MaskModeSubtract);
            }
            if (c()) {
                com.bytedance.lottie.e.b("Layer#drawMatte");
                com.bytedance.lottie.e.b("Layer#saveLayer");
                a(canvas, this.n, this.f40598l);
                com.bytedance.lottie.e.c("Layer#saveLayer");
                a(canvas);
                this.f40590d.a(canvas, matrix, intValue);
                com.bytedance.lottie.e.b("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.lottie.e.c("Layer#restoreLayer");
                com.bytedance.lottie.e.c("Layer#drawMatte");
            }
            com.bytedance.lottie.e.b("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.lottie.e.c("Layer#restoreLayer");
            b(com.bytedance.lottie.e.c(this.r));
            return;
        }
        this.f40594h.preConcat(this.f40592f.a());
        com.bytedance.lottie.e.b("Layer#drawLayer");
        b(canvas, this.f40594h, intValue);
        com.bytedance.lottie.e.c("Layer#drawLayer");
        b(com.bytedance.lottie.e.c(this.r));
    }
}
