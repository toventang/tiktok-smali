package com.airbnb.lottie.a.a;

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
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.e.b.c;
import com.airbnb.lottie.e.b.f;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.k;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class h implements e, k, a.AbstractC0073a {

    /* renamed from: a  reason: collision with root package name */
    private final String f5178a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.e.c.a f5179b;

    /* renamed from: c  reason: collision with root package name */
    private final d<LinearGradient> f5180c = new d<>();

    /* renamed from: d  reason: collision with root package name */
    private final d<RadialGradient> f5181d = new d<>();

    /* renamed from: e  reason: collision with root package name */
    private final Matrix f5182e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    private final Path f5183f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f5184g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f5185h;

    /* renamed from: i  reason: collision with root package name */
    private final List<m> f5186i;

    /* renamed from: j  reason: collision with root package name */
    private final f f5187j;

    /* renamed from: k  reason: collision with root package name */
    private final a<c, c> f5188k;

    /* renamed from: l  reason: collision with root package name */
    private final a<Integer, Integer> f5189l;

    /* renamed from: m  reason: collision with root package name */
    private final a<PointF, PointF> f5190m;
    private final a<PointF, PointF> n;
    private a<ColorFilter, ColorFilter> o;
    private final g p;
    private final int q;

    static {
        Covode.recordClassIndex(2193);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5178a;
    }

    @Override // com.airbnb.lottie.a.b.a.AbstractC0073a
    public final void a() {
        this.p.invalidateSelf();
    }

    private int c() {
        int i2;
        int round = Math.round(this.f5190m.f5259c * ((float) this.q));
        int round2 = Math.round(this.n.f5259c * ((float) this.q));
        int round3 = Math.round(this.f5188k.f5259c * ((float) this.q));
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.airbnb.lottie.a.a.m> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.a.a.c
    public final void a(List<c> list, List<c> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            c cVar = list2.get(i2);
            if (cVar instanceof m) {
                this.f5186i.add(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.e
    public final void a(RectF rectF, Matrix matrix) {
        this.f5183f.reset();
        for (int i2 = 0; i2 < this.f5186i.size(); i2++) {
            this.f5183f.addPath(this.f5186i.get(i2).e(), matrix);
        }
        this.f5183f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.e.f
    public final <T> void a(T t, com.airbnb.lottie.j.c<T> cVar) {
        a<ColorFilter, ColorFilter> aVar;
        if (t == k.C) {
            if (d.a.f5625a && (aVar = this.o) != null) {
                this.f5179b.b(aVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            p pVar = new p(cVar);
            this.o = pVar;
            pVar.a(this);
            this.f5179b.a(this.o);
        }
    }

    public h(g gVar, com.airbnb.lottie.e.c.a aVar, com.airbnb.lottie.e.b.d dVar) {
        Path path = new Path();
        this.f5183f = path;
        this.f5185h = new RectF();
        this.f5186i = new ArrayList();
        if (d.a.f5625a) {
            this.f5184g = new com.airbnb.lottie.a.a(1);
        } else {
            this.f5184g = new Paint(1);
        }
        this.f5179b = aVar;
        this.f5178a = dVar.f5386g;
        this.p = gVar;
        this.f5187j = dVar.f5380a;
        path.setFillType(dVar.f5381b);
        this.q = (int) (gVar.f5554a.a() / 32.0f);
        a<c, c> a2 = dVar.f5382c.a();
        this.f5188k = a2;
        a2.a(this);
        aVar.a(a2);
        a<Integer, Integer> a3 = dVar.f5383d.a();
        this.f5189l = a3;
        a3.a(this);
        aVar.a(a3);
        a<PointF, PointF> a4 = dVar.f5384e.a();
        this.f5190m = a4;
        a4.a(this);
        aVar.a(a4);
        a<PointF, PointF> a5 = dVar.f5385f.a();
        this.n = a5;
        a5.a(this);
        aVar.a(a5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: androidx.c.d<android.graphics.RadialGradient> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: androidx.c.d<android.graphics.LinearGradient> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.a.a.e
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        RadialGradient a2;
        com.airbnb.lottie.d.b("GradientFillContent#draw");
        this.f5183f.reset();
        for (int i3 = 0; i3 < this.f5186i.size(); i3++) {
            this.f5183f.addPath(this.f5186i.get(i3).e(), matrix);
        }
        this.f5183f.computeBounds(this.f5185h, false);
        if (this.f5187j == f.Linear) {
            long c2 = (long) c();
            a2 = this.f5180c.a(c2, null);
            if (a2 == null) {
                PointF f2 = this.f5190m.f();
                PointF f3 = this.n.f();
                c f4 = this.f5188k.f();
                a2 = new LinearGradient(f2.x, f2.y, f3.x, f3.y, f4.f5379b, f4.f5378a, Shader.TileMode.CLAMP);
                this.f5180c.b(c2, a2);
            }
        } else {
            long c3 = (long) c();
            a2 = this.f5181d.a(c3);
            if (a2 == null) {
                PointF f5 = this.f5190m.f();
                PointF f6 = this.n.f();
                c f7 = this.f5188k.f();
                int[] iArr = f7.f5379b;
                float[] fArr = f7.f5378a;
                float f8 = f5.x;
                float f9 = f5.y;
                a2 = new RadialGradient(f8, f9, (float) Math.hypot((double) (f6.x - f8), (double) (f6.y - f9)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f5181d.b(c3, a2);
            }
        }
        this.f5182e.set(matrix);
        a2.setLocalMatrix(this.f5182e);
        this.f5184g.setShader(a2);
        a<ColorFilter, ColorFilter> aVar = this.o;
        if (aVar != null) {
            this.f5184g.setColorFilter(aVar.f());
        }
        this.f5184g.setAlpha(com.airbnb.lottie.i.f.a((int) ((((((float) i2) / 255.0f) * ((float) this.f5189l.f().intValue())) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f5183f, this.f5184g);
        com.airbnb.lottie.d.c("GradientFillContent#draw");
    }

    @Override // com.airbnb.lottie.e.f
    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        com.airbnb.lottie.i.f.a(eVar, i2, list, eVar2, this);
    }
}
