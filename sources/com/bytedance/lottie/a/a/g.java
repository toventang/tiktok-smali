package com.bytedance.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.c.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.p;
import com.bytedance.lottie.c.b.c;
import com.bytedance.lottie.c.b.f;
import com.bytedance.lottie.e;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;
import java.util.ArrayList;
import java.util.List;

public final class g implements d, j, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    private final String f40339a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.lottie.c.c.a f40340b;

    /* renamed from: c  reason: collision with root package name */
    private final d<LinearGradient> f40341c = new d<>();

    /* renamed from: d  reason: collision with root package name */
    private final d<RadialGradient> f40342d = new d<>();

    /* renamed from: e  reason: collision with root package name */
    private final Matrix f40343e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    private final Path f40344f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f40345g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f40346h;

    /* renamed from: i  reason: collision with root package name */
    private final List<l> f40347i;

    /* renamed from: j  reason: collision with root package name */
    private final f f40348j;

    /* renamed from: k  reason: collision with root package name */
    private final a<c, c> f40349k;

    /* renamed from: l  reason: collision with root package name */
    private final a<Integer, Integer> f40350l;

    /* renamed from: m  reason: collision with root package name */
    private final a<PointF, PointF> f40351m;
    private final a<PointF, PointF> n;
    private a<ColorFilter, ColorFilter> o;
    private final i p;
    private final int q;

    static {
        Covode.recordClassIndex(24837);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40339a;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.p.invalidateSelf();
    }

    private int c() {
        int i2;
        int round = Math.round(this.f40351m.f40418c * ((float) this.q));
        int round2 = Math.round(this.n.f40418c * ((float) this.q));
        int round3 = Math.round(this.f40349k.f40418c * ((float) this.q));
        if (round != 0) {
            i2 = round * 527;
        } else {
            i2 = 17;
        }
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        if (round3 != 0) {
            return i2 * 31 * round3;
        }
        return i2;
    }

    @Override // com.bytedance.lottie.c.f
    public final <T> void a(T t, com.bytedance.lottie.g.c<T> cVar) {
        if (t != m.x) {
            return;
        }
        if (cVar == null) {
            this.o = null;
            return;
        }
        p pVar = new p(cVar);
        this.o = pVar;
        pVar.a(this);
        this.f40340b.a(this.o);
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(RectF rectF, Matrix matrix) {
        this.f40344f.reset();
        for (int i2 = 0; i2 < this.f40347i.size(); i2++) {
            this.f40344f.addPath(this.f40347i.get(i2).e(), matrix);
        }
        this.f40344f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b bVar = list2.get(i2);
            if (bVar instanceof l) {
                this.f40347i.add(bVar);
            }
        }
    }

    public g(i iVar, com.bytedance.lottie.c.c.a aVar, com.bytedance.lottie.c.b.d dVar) {
        Path path = new Path();
        this.f40344f = path;
        this.f40345g = new Paint(1);
        this.f40346h = new RectF();
        this.f40347i = new ArrayList();
        this.f40340b = aVar;
        this.f40339a = dVar.f40510g;
        this.p = iVar;
        this.f40348j = dVar.f40504a;
        path.setFillType(dVar.f40505b);
        this.q = (int) (iVar.f40763a.a() / 32.0f);
        a<c, c> a2 = dVar.f40506c.a();
        this.f40349k = a2;
        a2.a(this);
        aVar.a(a2);
        a<Integer, Integer> a3 = dVar.f40507d.a();
        this.f40350l = a3;
        a3.a(this);
        aVar.a(a3);
        a<PointF, PointF> a4 = dVar.f40508e.a();
        this.f40351m = a4;
        a4.a(this);
        aVar.a(a4);
        a<PointF, PointF> a5 = dVar.f40509f.a();
        this.n = a5;
        a5.a(this);
        aVar.a(a5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: androidx.c.d<android.graphics.RadialGradient> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: androidx.c.d<android.graphics.LinearGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.a.a.d
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        RadialGradient a2;
        e.b("GradientFillContent#draw");
        this.f40344f.reset();
        for (int i3 = 0; i3 < this.f40347i.size(); i3++) {
            this.f40344f.addPath(this.f40347i.get(i3).e(), matrix);
        }
        this.f40344f.computeBounds(this.f40346h, false);
        if (this.f40348j == f.Linear) {
            long c2 = (long) c();
            a2 = this.f40341c.a(c2, null);
            if (a2 == null) {
                PointF d2 = this.f40351m.d();
                PointF d3 = this.n.d();
                c d4 = this.f40349k.d();
                a2 = new LinearGradient(d2.x, d2.y, d3.x, d3.y, d4.f40503b, d4.f40502a, Shader.TileMode.CLAMP);
                this.f40341c.b(c2, a2);
            }
        } else {
            long c3 = (long) c();
            a2 = this.f40342d.a(c3);
            if (a2 == null) {
                PointF d5 = this.f40351m.d();
                PointF d6 = this.n.d();
                c d7 = this.f40349k.d();
                int[] iArr = d7.f40503b;
                float[] fArr = d7.f40502a;
                float f2 = d5.x;
                float f3 = d5.y;
                a2 = new RadialGradient(f2, f3, (float) Math.hypot((double) (d6.x - f2), (double) (d6.y - f3)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f40342d.b(c3, a2);
            }
        }
        this.f40343e.set(matrix);
        a2.setLocalMatrix(this.f40343e);
        this.f40345g.setShader(a2);
        a<ColorFilter, ColorFilter> aVar = this.o;
        if (aVar != null) {
            this.f40345g.setColorFilter(aVar.d());
        }
        this.f40345g.setAlpha(com.bytedance.lottie.f.f.a((int) ((((((float) i2) / 255.0f) * ((float) this.f40350l.d().intValue())) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f40344f, this.f40345g);
        e.c("GradientFillContent#draw");
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(com.bytedance.lottie.c.e eVar, int i2, List<com.bytedance.lottie.c.e> list, com.bytedance.lottie.c.e eVar2) {
        com.bytedance.lottie.f.f.a(eVar, i2, list, eVar2, this);
    }
}
