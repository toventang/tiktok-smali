package com.lynx.component.svg.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.d.c;
import com.facebook.imagepipeline.e.k;
import com.lynx.component.svg.a.d;
import com.lynx.component.svg.a.f;
import com.lynx.component.svg.d;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public float f55359a;

    /* renamed from: b  reason: collision with root package name */
    public float f55360b;

    /* renamed from: c  reason: collision with root package name */
    b f55361c;

    /* renamed from: d  reason: collision with root package name */
    private Canvas f55362d;

    /* renamed from: e  reason: collision with root package name */
    private d f55363e;

    /* renamed from: f  reason: collision with root package name */
    private f f55364f;

    /* renamed from: g  reason: collision with root package name */
    private Stack<b> f55365g;

    /* renamed from: h  reason: collision with root package name */
    private Stack<f.ae> f55366h;

    /* renamed from: i  reason: collision with root package name */
    private Stack<Matrix> f55367i;

    static {
        Covode.recordClassIndex(34688);
    }

    private static int a(float f2) {
        int i2 = (int) (f2 * 256.0f);
        if (i2 < 0) {
            return 0;
        }
        if (i2 > 255) {
            return 255;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final f.a a() {
        if (this.f55361c.f55383g != null) {
            return this.f55361c.f55383g;
        }
        return this.f55361c.f55382f;
    }

    public final void a(f fVar, e eVar) {
        Objects.requireNonNull(eVar, "renderOptions shouldn't be null");
        this.f55364f = fVar;
        f.ac acVar = fVar.f55232a;
        if (acVar == null) {
            a("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        f.a aVar = acVar.r;
        d dVar = acVar.q;
        b();
        b((f.ai) acVar);
        c();
        a(acVar, new f.a(eVar.f55230b), aVar, dVar);
        d();
    }

    private void a(f.ai aiVar) {
        float a2;
        if (!(aiVar instanceof f.q)) {
            c();
            b(aiVar);
            if (aiVar instanceof f.ac) {
                f.ac acVar = (f.ac) aiVar;
                a(acVar, a(acVar.f55261a, acVar.f55262b, acVar.f55263c, acVar.f55264d), acVar.r, acVar.q);
            } else {
                float f2 = 0.0f;
                if (aiVar instanceof f.ao) {
                    f.ao aoVar = (f.ao) aiVar;
                    c("Use render", new Object[0]);
                    if ((aoVar.f55295e == null || !aoVar.f55295e.a()) && (aoVar.f55296f == null || !aoVar.f55296f.a())) {
                        a(this.f55361c, aoVar);
                        if (h()) {
                            f.ai b2 = aoVar.o.b(aoVar.f55292a);
                            if (b2 == null) {
                                b("Use reference '%s' not found", aoVar.f55292a);
                            } else {
                                if (aoVar.f55323b != null) {
                                    this.f55362d.concat(aoVar.f55323b);
                                }
                                float a3 = aoVar.f55293c != null ? aoVar.f55293c.a(this) : 0.0f;
                                if (aoVar.f55294d != null) {
                                    f2 = aoVar.f55294d.b(this);
                                }
                                this.f55362d.translate(a3, f2);
                                c((f.af) aoVar);
                                boolean f3 = f();
                                b((f.ae) aoVar);
                                if (b2 instanceof f.ac) {
                                    f.ac acVar2 = (f.ac) b2;
                                    f.a a4 = a((f.o) null, (f.o) null, aoVar.f55295e, aoVar.f55296f);
                                    c();
                                    a(acVar2, a4, acVar2.r, acVar2.q);
                                    d();
                                } else {
                                    a(b2);
                                }
                                e();
                                if (f3) {
                                    d();
                                }
                                a((f.af) aoVar);
                            }
                        }
                    }
                } else if (aiVar instanceof f.l) {
                    f.l lVar = (f.l) aiVar;
                    c(lVar.a() + " render", new Object[0]);
                    a(this.f55361c, lVar);
                    if (h()) {
                        if (lVar.f55323b != null) {
                            this.f55362d.concat(lVar.f55323b);
                        }
                        c((f.af) lVar);
                        boolean f4 = f();
                        a((f.ae) lVar);
                        if (f4) {
                            d();
                        }
                        a((f.af) lVar);
                    }
                } else if (aiVar instanceof f.n) {
                    final f.n nVar = (f.n) aiVar;
                    c("Image render", new Object[0]);
                    if (!(nVar.f55327d == null || nVar.f55327d.a() || nVar.f55328e == null || nVar.f55328e.a() || nVar.f55324a == null)) {
                        final d dVar = nVar.q != null ? nVar.q : d.f55218e;
                        Bitmap a5 = a(nVar.f55324a);
                        if (a5 == null) {
                            d dVar2 = this.f55363e;
                            String str = nVar.f55324a;
                            AnonymousClass1 r4 = new d.a() {
                                /* class com.lynx.component.svg.a.g.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(34689);
                                }

                                @Override // com.lynx.component.svg.d.a
                                public final void a(Bitmap bitmap) {
                                    g.this.a(nVar, dVar, bitmap);
                                }
                            };
                            c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> a6 = k.a().e().a(com.facebook.imagepipeline.o.c.a(Uri.parse(com.lynx.tasm.behavior.ui.image.a.a(dVar2.f55425a, str))).a(), "lynx_SvgResourceManager");
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            a6.a(new com.facebook.imagepipeline.f.b(a6, r4, countDownLatch) {
                                /* class com.lynx.component.svg.d.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ com.facebook.d.c f55428a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ a f55429b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ CountDownLatch f55430c;

                                static {
                                    Covode.recordClassIndex(34705);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.d.c] */
                                @Override // com.facebook.d.b
                                public final void onFailureImpl(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                                    if (cVar != null) {
                                        cVar.g();
                                    }
                                    this.f55430c.countDown();
                                }

                                @Override // com.facebook.imagepipeline.f.b
                                public final void a(Bitmap bitmap) {
                                    MethodCollector.i(5408);
                                    if (this.f55428a.b() && bitmap != null) {
                                        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                                        d.this.f55426b.add(createBitmap);
                                        this.f55429b.a(createBitmap);
                                        this.f55428a.g();
                                        this.f55430c.countDown();
                                    }
                                    MethodCollector.o(5408);
                                }

                                {
                                    this.f55428a = r2;
                                    this.f55429b = r3;
                                    this.f55430c = r4;
                                }
                            }, com.facebook.common.b.a.f47054a);
                            try {
                                countDownLatch.await(3, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                            }
                        } else {
                            a(nVar, dVar, a5);
                        }
                    }
                } else if (aiVar instanceof f.s) {
                    f.s sVar = (f.s) aiVar;
                    c("Path render", new Object[0]);
                    if (sVar.f55338a != null) {
                        a(this.f55361c, sVar);
                        if (h() && i() && (this.f55361c.f55379c || this.f55361c.f55378b)) {
                            if (sVar.f55322e != null) {
                                this.f55362d.concat(sVar.f55322e);
                            }
                            Path path = new a(sVar.f55338a).f55374a;
                            if (sVar.f55267j == null) {
                                sVar.f55267j = b(path);
                            }
                            a((f.af) sVar);
                            b((f.af) sVar);
                            c((f.af) sVar);
                            boolean f5 = f();
                            if (this.f55361c.f55378b) {
                                path.setFillType(j());
                                a(sVar, path);
                            }
                            if (this.f55361c.f55379c) {
                                a(path);
                            }
                            if (f5) {
                                d();
                            }
                        }
                    }
                } else if (aiVar instanceof f.y) {
                    f.y yVar = (f.y) aiVar;
                    c("Rect render", new Object[0]);
                    if (yVar.f55355c != null && yVar.f55356d != null && !yVar.f55355c.a() && !yVar.f55356d.a()) {
                        a(this.f55361c, yVar);
                        if (h() && i()) {
                            if (yVar.f55322e != null) {
                                this.f55362d.concat(yVar.f55322e);
                            }
                            Path a7 = a(yVar);
                            a((f.af) yVar);
                            b((f.af) yVar);
                            c((f.af) yVar);
                            boolean f6 = f();
                            if (this.f55361c.f55378b) {
                                a(yVar, a7);
                            }
                            if (this.f55361c.f55379c) {
                                a(a7);
                            }
                            if (f6) {
                                d();
                            }
                        }
                    }
                } else if (aiVar instanceof f.c) {
                    f.c cVar = (f.c) aiVar;
                    c("Circle render", new Object[0]);
                    if (cVar.f55303c != null && !cVar.f55303c.a()) {
                        a(this.f55361c, cVar);
                        if (h() && i()) {
                            if (cVar.f55322e != null) {
                                this.f55362d.concat(cVar.f55322e);
                            }
                            Path a8 = a(cVar);
                            a((f.af) cVar);
                            b((f.af) cVar);
                            c((f.af) cVar);
                            boolean f7 = f();
                            if (this.f55361c.f55378b) {
                                a(cVar, a8);
                            }
                            if (this.f55361c.f55379c) {
                                a(a8);
                            }
                            if (f7) {
                                d();
                            }
                        }
                    }
                } else if (aiVar instanceof f.h) {
                    f.h hVar = (f.h) aiVar;
                    c("Ellipse render", new Object[0]);
                    if (hVar.f55311c != null && hVar.f55312d != null && !hVar.f55311c.a() && !hVar.f55312d.a()) {
                        a(this.f55361c, hVar);
                        if (h() && i()) {
                            if (hVar.f55322e != null) {
                                this.f55362d.concat(hVar.f55322e);
                            }
                            Path a9 = a(hVar);
                            a((f.af) hVar);
                            b((f.af) hVar);
                            c((f.af) hVar);
                            boolean f8 = f();
                            if (this.f55361c.f55378b) {
                                a(hVar, a9);
                            }
                            if (this.f55361c.f55379c) {
                                a(a9);
                            }
                            if (f8) {
                                d();
                            }
                        }
                    }
                } else if (aiVar instanceof f.p) {
                    f.p pVar = (f.p) aiVar;
                    c("Line render", new Object[0]);
                    a(this.f55361c, pVar);
                    if (h() && i() && this.f55361c.f55379c) {
                        if (pVar.f55322e != null) {
                            this.f55362d.concat(pVar.f55322e);
                        }
                        if (pVar.f55332a == null) {
                            a2 = 0.0f;
                        } else {
                            a2 = pVar.f55332a.a(this);
                        }
                        float b3 = pVar.f55333b == null ? 0.0f : pVar.f55333b.b(this);
                        float a10 = pVar.f55334c == null ? 0.0f : pVar.f55334c.a(this);
                        if (pVar.f55335d != null) {
                            f2 = pVar.f55335d.b(this);
                        }
                        if (pVar.f55267j == null) {
                            pVar.f55267j = new f.a(Math.min(a2, a10), Math.min(b3, f2), Math.abs(a10 - a2), Math.abs(f2 - b3));
                        }
                        Path path2 = new Path();
                        path2.moveTo(a2, b3);
                        path2.lineTo(a10, f2);
                        a((f.af) pVar);
                        b((f.af) pVar);
                        c((f.af) pVar);
                        boolean f9 = f();
                        a(path2);
                        if (f9) {
                            d();
                        }
                    }
                } else if (aiVar instanceof f.x) {
                    f.x xVar = (f.x) aiVar;
                    c("Polygon render", new Object[0]);
                    a(this.f55361c, xVar);
                    if (h() && i() && (this.f55361c.f55379c || this.f55361c.f55378b)) {
                        if (xVar.f55322e != null) {
                            this.f55362d.concat(xVar.f55322e);
                        }
                        if (xVar.f55352a.length >= 2) {
                            Path a11 = a((f.w) xVar);
                            a((f.af) xVar);
                            b((f.af) xVar);
                            c((f.af) xVar);
                            boolean f10 = f();
                            if (this.f55361c.f55378b) {
                                a(xVar, a11);
                            }
                            if (this.f55361c.f55379c) {
                                a(a11);
                            }
                            if (f10) {
                                d();
                            }
                        }
                    }
                } else if (aiVar instanceof f.w) {
                    f.w wVar = (f.w) aiVar;
                    c("PolyLine render", new Object[0]);
                    a(this.f55361c, wVar);
                    if (h() && i() && (this.f55361c.f55379c || this.f55361c.f55378b)) {
                        if (wVar.f55322e != null) {
                            this.f55362d.concat(wVar.f55322e);
                        }
                        if (wVar.f55352a.length >= 2) {
                            Path a12 = a(wVar);
                            a((f.af) wVar);
                            a12.setFillType(j());
                            b((f.af) wVar);
                            c((f.af) wVar);
                            boolean f11 = f();
                            if (this.f55361c.f55378b) {
                                a(wVar, a12);
                            }
                            if (this.f55361c.f55379c) {
                                a(a12);
                            }
                            if (f11) {
                                d();
                            }
                        }
                    }
                }
            }
            d();
        }
    }

    private void a(f.ae aeVar) {
        b(aeVar);
        for (f.ai aiVar : aeVar.b()) {
            a(aiVar);
        }
        e();
    }

    private void a(b bVar, f.ag agVar) {
        bVar.f55377a.a(agVar.p == null);
        if (agVar.f55270m != null) {
            a(bVar, agVar.f55270m);
        }
        if (agVar.n != null) {
            a(bVar, agVar.n);
        }
    }

    private void a(f.af afVar, Path path) {
        if (this.f55361c.f55377a.f55244b instanceof f.r) {
            f.ai b2 = this.f55364f.b(((f.r) this.f55361c.f55377a.f55244b).f55336a);
            if (b2 instanceof f.v) {
                a(afVar, path, (f.v) b2);
                return;
            }
        }
        this.f55362d.drawPath(path, this.f55361c.f55380d);
    }

    private void a(Path path) {
        if (this.f55361c.f55377a.A == f.ab.e.NonScalingStroke) {
            Matrix matrix = this.f55362d.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f55362d.setMatrix(new Matrix());
            Shader shader = this.f55361c.f55381e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f55362d.drawPath(path2, this.f55361c.f55381e);
            this.f55362d.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f55362d.drawPath(path, this.f55361c.f55381e);
    }

    private static void a(String str, Object... objArr) {
        LLog.a(5, "SVGAndroidRenderer", com.a.a(str, objArr));
    }

    private void a(f.ac acVar, f.a aVar, f.a aVar2, d dVar) {
        c("Svg render", new Object[0]);
        if (aVar.f55240c != 0.0f && aVar.f55241d != 0.0f) {
            if (dVar == null) {
                dVar = acVar.q != null ? acVar.q : new d(d.a.none, d.b.meet);
            }
            a(this.f55361c, acVar);
            if (h()) {
                this.f55361c.f55382f = aVar;
                if (!this.f55361c.f55377a.o.booleanValue()) {
                    a(this.f55361c.f55382f.f55238a, this.f55361c.f55382f.f55239b, this.f55361c.f55382f.f55240c, this.f55361c.f55382f.f55241d);
                }
                a(acVar, this.f55361c.f55382f);
                if (aVar2 != null) {
                    this.f55362d.concat(a(this.f55361c.f55382f, aVar2, dVar));
                    this.f55361c.f55383g = acVar.r;
                } else {
                    this.f55362d.translate(this.f55361c.f55382f.f55238a, this.f55361c.f55382f.f55239b);
                }
                boolean f2 = f();
                k();
                a((f.ae) acVar);
                if (f2) {
                    d();
                }
                a((f.af) acVar);
            }
        }
    }

    private f.a a(f.o oVar, f.o oVar2, f.o oVar3, f.o oVar4) {
        float f2 = 0.0f;
        float a2 = oVar != null ? oVar.a(this) : 0.0f;
        if (oVar2 != null) {
            f2 = oVar2.b(this);
        }
        f.a a3 = a();
        return new f.a(a2, f2, oVar3 != null ? oVar3.a(this) : a3.f55240c, oVar4 != null ? oVar4.b(this) : a3.f55241d);
    }

    private void a(f.af afVar) {
        if (afVar.p != null && afVar.f55267j != null) {
            Matrix matrix = new Matrix();
            if (this.f55367i.peek().invert(matrix)) {
                int i2 = 2;
                float[] fArr = {afVar.f55267j.f55238a, afVar.f55267j.f55239b, afVar.f55267j.a(), afVar.f55267j.f55239b, afVar.f55267j.a(), afVar.f55267j.b(), afVar.f55267j.f55238a, afVar.f55267j.b()};
                matrix.preConcat(this.f55362d.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                do {
                    if (fArr[i2] < rectF.left) {
                        rectF.left = fArr[i2];
                    }
                    if (fArr[i2] > rectF.right) {
                        rectF.right = fArr[i2];
                    }
                    int i3 = i2 + 1;
                    if (fArr[i3] < rectF.top) {
                        rectF.top = fArr[i3];
                    }
                    if (fArr[i3] > rectF.bottom) {
                        rectF.bottom = fArr[i3];
                    }
                    i2 += 2;
                } while (i2 <= 6);
                f.af afVar2 = (f.af) this.f55366h.peek();
                if (afVar2.f55267j == null) {
                    afVar2.f55267j = f.a.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    afVar2.f55267j.a(f.a.a(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    public final void a(f.n nVar, d dVar, Bitmap bitmap) {
        int i2 = 0;
        if (bitmap == null) {
            b("Could not locate image '%s'", nVar.f55324a);
            return;
        }
        f.a aVar = new f.a(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        a(this.f55361c, nVar);
        if (h() && i()) {
            if (nVar.f55329f != null) {
                this.f55362d.concat(nVar.f55329f);
            }
            this.f55361c.f55382f = new f.a(nVar.f55325b != null ? nVar.f55325b.a(this) : 0.0f, nVar.f55326c != null ? nVar.f55326c.b(this) : 0.0f, nVar.f55327d.a(this), nVar.f55328e.a(this));
            if (!this.f55361c.f55377a.o.booleanValue()) {
                a(this.f55361c.f55382f.f55238a, this.f55361c.f55382f.f55239b, this.f55361c.f55382f.f55240c, this.f55361c.f55382f.f55241d);
            }
            nVar.f55267j = this.f55361c.f55382f;
            a((f.af) nVar);
            c((f.af) nVar);
            boolean f2 = f();
            k();
            this.f55362d.save();
            this.f55362d.concat(a(this.f55361c.f55382f, aVar, dVar));
            if (this.f55361c.f55377a.B != f.ab.d.optimizeSpeed) {
                i2 = 2;
            }
            this.f55362d.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(i2));
            this.f55362d.restore();
            if (f2) {
                d();
            }
        }
    }

    private static boolean a(f.ab abVar, long j2) {
        return (j2 & abVar.f55243a) != 0;
    }

    private void a(b bVar, f.ab abVar) {
        if (a(abVar, 4096)) {
            bVar.f55377a.n = abVar.n;
        }
        if (a(abVar, 2048)) {
            bVar.f55377a.f55255m = abVar.f55255m;
        }
        if (a(abVar, 1)) {
            bVar.f55377a.f55244b = abVar.f55244b;
            bVar.f55378b = (abVar.f55244b == null || abVar.f55244b == f.e.f55306c) ? false : true;
        }
        if (a(abVar, 4)) {
            bVar.f55377a.f55246d = abVar.f55246d;
        }
        if (a(abVar, 6149)) {
            a(bVar, true, bVar.f55377a.f55244b);
        }
        if (a(abVar, 2)) {
            bVar.f55377a.f55245c = abVar.f55245c;
        }
        if (a(abVar, 8)) {
            bVar.f55377a.f55247e = abVar.f55247e;
            bVar.f55379c = (abVar.f55247e == null || abVar.f55247e == f.e.f55306c) ? false : true;
        }
        if (a(abVar, 16)) {
            bVar.f55377a.f55248f = abVar.f55248f;
        }
        if (a(abVar, 6168)) {
            a(bVar, false, bVar.f55377a.f55247e);
        }
        if (a(abVar, 34359738368L)) {
            bVar.f55377a.A = abVar.A;
        }
        if (a(abVar, 32)) {
            bVar.f55377a.f55249g = abVar.f55249g;
            bVar.f55381e.setStrokeWidth(bVar.f55377a.f55249g.c(this));
        }
        if (a(abVar, 64)) {
            bVar.f55377a.f55250h = abVar.f55250h;
            int i2 = AnonymousClass2.f55372b[abVar.f55250h.ordinal()];
            if (i2 == 1) {
                bVar.f55381e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 2) {
                bVar.f55381e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 3) {
                bVar.f55381e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (a(abVar, 128)) {
            bVar.f55377a.f55251i = abVar.f55251i;
            int i3 = AnonymousClass2.f55373c[abVar.f55251i.ordinal()];
            if (i3 == 1) {
                bVar.f55381e.setStrokeJoin(Paint.Join.MITER);
            } else if (i3 == 2) {
                bVar.f55381e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i3 == 3) {
                bVar.f55381e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (a(abVar, 256)) {
            bVar.f55377a.f55252j = abVar.f55252j;
            bVar.f55381e.setStrokeMiter(abVar.f55252j.floatValue());
        }
        if (a(abVar, 512)) {
            bVar.f55377a.f55253k = abVar.f55253k;
        }
        if (a(abVar, 1024)) {
            bVar.f55377a.f55254l = abVar.f55254l;
        }
        if (a(abVar, 1536)) {
            if (bVar.f55377a.f55253k == null) {
                bVar.f55381e.setPathEffect(null);
            } else {
                int length = bVar.f55377a.f55253k.length;
                int i4 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i4];
                float f2 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fArr[i5] = bVar.f55377a.f55253k[i5 % length].c(this);
                    f2 += fArr[i5];
                }
                if (f2 == 0.0f) {
                    bVar.f55381e.setPathEffect(null);
                } else {
                    float c2 = bVar.f55377a.f55254l.c(this);
                    if (c2 < 0.0f) {
                        c2 = (c2 % f2) + f2;
                    }
                    bVar.f55381e.setPathEffect(new DashPathEffect(fArr, c2));
                }
            }
        }
        if (a(abVar, 524288)) {
            bVar.f55377a.o = abVar.o;
        }
        if (a(abVar, 16777216)) {
            bVar.f55377a.q = abVar.q;
        }
        if (a(abVar, 33554432)) {
            bVar.f55377a.r = abVar.r;
        }
        if (a(abVar, 1048576)) {
            bVar.f55377a.p = abVar.p;
        }
        if (a(abVar, 268435456)) {
            bVar.f55377a.u = abVar.u;
        }
        if (a(abVar, 536870912)) {
            bVar.f55377a.v = abVar.v;
        }
        if (a(abVar, 67108864)) {
            bVar.f55377a.s = abVar.s;
        }
        if (a(abVar, 134217728)) {
            bVar.f55377a.t = abVar.t;
        }
        if (a(abVar, 8589934592L)) {
            bVar.f55377a.y = abVar.y;
        }
        if (a(abVar, 17179869184L)) {
            bVar.f55377a.z = abVar.z;
        }
        if (a(abVar, 137438953472L)) {
            bVar.f55377a.B = abVar.B;
        }
    }

    private static void a(b bVar, boolean z, f.aj ajVar) {
        int i2;
        f.ab abVar = bVar.f55377a;
        float floatValue = (z ? abVar.f55246d : abVar.f55248f).floatValue();
        if (ajVar instanceof f.e) {
            i2 = ((f.e) ajVar).f55307a;
        } else if (ajVar instanceof f.C1255f) {
            i2 = bVar.f55377a.n.f55307a;
        } else {
            return;
        }
        int a2 = a(i2, floatValue);
        if (z) {
            bVar.f55380d.setColor(a2);
        } else {
            bVar.f55381e.setColor(a2);
        }
    }

    private void a(float f2, float f3, float f4, float f5) {
        float f6 = f4 + f2;
        float f7 = f5 + f3;
        if (this.f55361c.f55377a.p != null) {
            f2 += this.f55361c.f55377a.p.f55300d.a(this);
            f3 += this.f55361c.f55377a.p.f55297a.b(this);
            f6 -= this.f55361c.f55377a.p.f55298b.a(this);
            f7 -= this.f55361c.f55377a.p.f55299c.b(this);
        }
        this.f55362d.clipRect(f2, f3, f6, f7);
    }

    private b a(f.ai aiVar, b bVar) {
        ArrayList<f.ag> arrayList = new ArrayList();
        while (true) {
            if (aiVar instanceof f.ag) {
                arrayList.add(0, aiVar);
            }
            if (aiVar.p == null) {
                break;
            }
            aiVar = (f.ai) aiVar.p;
        }
        for (f.ag agVar : arrayList) {
            a(bVar, agVar);
        }
        bVar.f55383g = this.f55361c.f55383g;
        bVar.f55382f = this.f55361c.f55382f;
        return bVar;
    }

    private void a(boolean z, f.a aVar, f.r rVar) {
        f.ai b2 = this.f55364f.b(rVar.f55336a);
        if (b2 == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = rVar.f55336a;
            b("%s reference '%s' not found", objArr);
            if (rVar.f55337b != null) {
                a(this.f55361c, z, rVar.f55337b);
            } else if (z) {
                this.f55361c.f55378b = false;
            } else {
                this.f55361c.f55379c = false;
            }
        } else if (b2 instanceof f.ah) {
            a(z, aVar, (f.ah) b2);
        } else if (b2 instanceof f.al) {
            a(z, aVar, (f.al) b2);
        } else if (b2 instanceof f.z) {
            a(z, (f.z) b2);
        }
    }

    private void a(boolean z, f.a aVar, f.ah ahVar) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (ahVar.f55317e != null) {
            a(ahVar, ahVar.f55317e);
        }
        int i2 = 0;
        boolean z2 = ahVar.f55314b != null && ahVar.f55314b.booleanValue();
        b bVar = this.f55361c;
        Paint paint = z ? bVar.f55380d : bVar.f55381e;
        if (z2) {
            f.a a2 = a();
            f3 = ahVar.f55271f != null ? ahVar.f55271f.a(this) : 0.0f;
            f2 = ahVar.f55272g != null ? ahVar.f55272g.b(this) : 0.0f;
            f4 = ahVar.f55273h != null ? ahVar.f55273h.a(this) : a2.f55240c;
            if (ahVar.f55274i != null) {
                f5 = ahVar.f55274i.b(this);
            }
            f5 = 0.0f;
        } else {
            f3 = ahVar.f55271f != null ? ahVar.f55271f.d(this) : 0.0f;
            f2 = ahVar.f55272g != null ? ahVar.f55272g.d(this) : 0.0f;
            f4 = ahVar.f55273h != null ? ahVar.f55273h.d(this) : 1.0f;
            if (ahVar.f55274i != null) {
                f5 = ahVar.f55274i.d(this);
            }
            f5 = 0.0f;
        }
        c();
        this.f55361c = c(ahVar);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(aVar.f55238a, aVar.f55239b);
            matrix.preScale(aVar.f55240c, aVar.f55241d);
        }
        if (ahVar.f55315c != null) {
            matrix.preConcat(ahVar.f55315c);
        }
        int size = ahVar.f55313a.size();
        if (size == 0) {
            d();
            if (z) {
                this.f55361c.f55378b = false;
            } else {
                this.f55361c.f55379c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f6 = -1.0f;
            for (f.ai aiVar : ahVar.f55313a) {
                f.aa aaVar = (f.aa) aiVar;
                float floatValue = aaVar.f55242a != null ? aaVar.f55242a.floatValue() : 0.0f;
                if (i2 == 0 || floatValue >= f6) {
                    fArr[i2] = floatValue;
                    f6 = floatValue;
                } else {
                    fArr[i2] = f6;
                }
                c();
                a(this.f55361c, aaVar);
                f.e eVar = (f.e) this.f55361c.f55377a.s;
                if (eVar == null) {
                    eVar = f.e.f55305b;
                }
                iArr[i2] = a(eVar.f55307a, this.f55361c.f55377a.t.floatValue());
                i2++;
                d();
            }
            if ((f3 == f4 && f2 == f5) || size == 1) {
                d();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (ahVar.f55316d != null) {
                if (ahVar.f55316d == f.j.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (ahVar.f55316d == f.j.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            d();
            LinearGradient linearGradient = new LinearGradient(f3, f2, f4, f5, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(a(this.f55361c.f55377a.f55246d.floatValue()));
        }
    }

    private void a(boolean z, f.a aVar, f.al alVar) {
        float f2;
        float d2;
        float d3;
        if (alVar.f55317e != null) {
            a(alVar, alVar.f55317e);
        }
        int i2 = 0;
        boolean z2 = alVar.f55314b != null && alVar.f55314b.booleanValue();
        b bVar = this.f55361c;
        Paint paint = z ? bVar.f55380d : bVar.f55381e;
        if (z2) {
            f.o oVar = new f.o(50.0f, f.an.percent);
            d2 = alVar.f55275f != null ? alVar.f55275f.a(this) : oVar.a(this);
            d3 = alVar.f55276g != null ? alVar.f55276g.b(this) : oVar.b(this);
            if (alVar.f55277h != null) {
                oVar = alVar.f55277h;
            }
            f2 = oVar.c(this);
        } else {
            f2 = 0.5f;
            d2 = alVar.f55275f != null ? alVar.f55275f.d(this) : 0.5f;
            d3 = alVar.f55276g != null ? alVar.f55276g.d(this) : 0.5f;
            if (alVar.f55277h != null) {
                f2 = alVar.f55277h.d(this);
            }
        }
        c();
        this.f55361c = c(alVar);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(aVar.f55238a, aVar.f55239b);
            matrix.preScale(aVar.f55240c, aVar.f55241d);
        }
        if (alVar.f55315c != null) {
            matrix.preConcat(alVar.f55315c);
        }
        int size = alVar.f55313a.size();
        if (size == 0) {
            d();
            if (z) {
                this.f55361c.f55378b = false;
            } else {
                this.f55361c.f55379c = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f3 = -1.0f;
            Iterator it = alVar.f55313a.iterator();
            while (true) {
                float f4 = 0.0f;
                if (!it.hasNext()) {
                    break;
                }
                f.aa aaVar = (f.aa) ((f.ai) it.next());
                if (aaVar.f55242a != null) {
                    f4 = aaVar.f55242a.floatValue();
                }
                if (i2 == 0 || f4 >= f3) {
                    fArr[i2] = f4;
                    f3 = f4;
                } else {
                    fArr[i2] = f3;
                }
                c();
                a(this.f55361c, aaVar);
                f.e eVar = (f.e) this.f55361c.f55377a.s;
                if (eVar == null) {
                    eVar = f.e.f55305b;
                }
                iArr[i2] = a(eVar.f55307a, this.f55361c.f55377a.t.floatValue());
                i2++;
                d();
            }
            if (f2 == 0.0f || size == 1) {
                d();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            if (alVar.f55316d != null) {
                if (alVar.f55316d == f.j.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (alVar.f55316d == f.j.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            d();
            RadialGradient radialGradient = new RadialGradient(d2, d3, f2, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(a(this.f55361c.f55377a.f55246d.floatValue()));
        }
    }

    private static void a(f.i iVar, String str) {
        while (true) {
            f.ai b2 = iVar.o.b(str);
            if (b2 == null) {
                a("Gradient reference '%s' not found", str);
                return;
            } else if (!(b2 instanceof f.i)) {
                b("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            } else if (b2 == iVar) {
                b("Circular reference in gradient href attribute '%s'", str);
                return;
            } else {
                f.i iVar2 = (f.i) b2;
                if (iVar.f55314b == null) {
                    iVar.f55314b = iVar2.f55314b;
                }
                if (iVar.f55315c == null) {
                    iVar.f55315c = iVar2.f55315c;
                }
                if (iVar.f55316d == null) {
                    iVar.f55316d = iVar2.f55316d;
                }
                if (iVar.f55313a.isEmpty()) {
                    iVar.f55313a = iVar2.f55313a;
                }
                try {
                    if (iVar instanceof f.ah) {
                        a((f.ah) iVar, (f.ah) b2);
                    } else {
                        a((f.al) iVar, (f.al) b2);
                    }
                } catch (ClassCastException unused) {
                }
                if (iVar2.f55317e != null) {
                    str = iVar2.f55317e;
                } else {
                    return;
                }
            }
        }
    }

    private static void a(f.ah ahVar, f.ah ahVar2) {
        if (ahVar.f55271f == null) {
            ahVar.f55271f = ahVar2.f55271f;
        }
        if (ahVar.f55272g == null) {
            ahVar.f55272g = ahVar2.f55272g;
        }
        if (ahVar.f55273h == null) {
            ahVar.f55273h = ahVar2.f55273h;
        }
        if (ahVar.f55274i == null) {
            ahVar.f55274i = ahVar2.f55274i;
        }
    }

    private static void a(f.al alVar, f.al alVar2) {
        if (alVar.f55275f == null) {
            alVar.f55275f = alVar2.f55275f;
        }
        if (alVar.f55276g == null) {
            alVar.f55276g = alVar2.f55276g;
        }
        if (alVar.f55277h == null) {
            alVar.f55277h = alVar2.f55277h;
        }
        if (alVar.f55278i == null) {
            alVar.f55278i = alVar2.f55278i;
        }
        if (alVar.f55279j == null) {
            alVar.f55279j = alVar2.f55279j;
        }
    }

    private void a(boolean z, f.z zVar) {
        boolean z2 = true;
        if (z) {
            if (a(zVar.f55270m, 2147483648L)) {
                this.f55361c.f55377a.f55244b = zVar.f55270m.w;
                b bVar = this.f55361c;
                if (zVar.f55270m.w == null) {
                    z2 = false;
                }
                bVar.f55378b = z2;
            }
            if (a(zVar.f55270m, 4294967296L)) {
                this.f55361c.f55377a.f55246d = zVar.f55270m.x;
            }
            if (a(zVar.f55270m, 6442450944L)) {
                b bVar2 = this.f55361c;
                a(bVar2, z, bVar2.f55377a.f55244b);
                return;
            }
            return;
        }
        if (a(zVar.f55270m, 2147483648L)) {
            this.f55361c.f55377a.f55247e = zVar.f55270m.w;
            b bVar3 = this.f55361c;
            if (zVar.f55270m.w == null) {
                z2 = false;
            }
            bVar3.f55379c = z2;
        }
        if (a(zVar.f55270m, 4294967296L)) {
            this.f55361c.f55377a.f55248f = zVar.f55270m.x;
        }
        if (a(zVar.f55270m, 6442450944L)) {
            b bVar4 = this.f55361c;
            a(bVar4, z, bVar4.f55377a.f55247e);
        }
    }

    private void a(f.af afVar, f.a aVar) {
        if (this.f55361c.f55377a.u != null) {
            int i2 = Build.VERSION.SDK_INT;
            Path b2 = b(afVar, aVar);
            if (b2 != null) {
                this.f55362d.clipPath(b2);
            }
        }
    }

    private void a(f.ai aiVar, boolean z, Path path, Matrix matrix) {
        if (h()) {
            l();
            if (aiVar instanceof f.ao) {
                if (z) {
                    a((f.ao) aiVar, path, matrix);
                } else {
                    b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (aiVar instanceof f.s) {
                a((f.s) aiVar, path, matrix);
            } else if (aiVar instanceof f.k) {
                a((f.k) aiVar, path, matrix);
            } else {
                b("Invalid %s element found in clipPath definition", aiVar.toString());
            }
            m();
        }
    }

    private void a(f.s sVar, Path path, Matrix matrix) {
        a(this.f55361c, sVar);
        if (h() && i()) {
            if (sVar.f55322e != null) {
                matrix.preConcat(sVar.f55322e);
            }
            Path path2 = new a(sVar.f55338a).f55374a;
            if (sVar.f55267j == null) {
                sVar.f55267j = b(path2);
            }
            c((f.af) sVar);
            path.setFillType(n());
            path.addPath(path2, matrix);
        }
    }

    private void a(f.k kVar, Path path, Matrix matrix) {
        Path a2;
        a(this.f55361c, kVar);
        if (h() && i()) {
            if (kVar.f55322e != null) {
                matrix.preConcat(kVar.f55322e);
            }
            if (kVar instanceof f.y) {
                a2 = a((f.y) kVar);
            } else if (kVar instanceof f.c) {
                a2 = a((f.c) kVar);
            } else if (kVar instanceof f.h) {
                a2 = a((f.h) kVar);
            } else if (kVar instanceof f.w) {
                a2 = a((f.w) kVar);
            } else {
                return;
            }
            c((f.af) kVar);
            path.setFillType(n());
            path.addPath(a2, matrix);
        }
    }

    private void a(f.ao aoVar, Path path, Matrix matrix) {
        a(this.f55361c, aoVar);
        if (h() && i()) {
            if (aoVar.f55323b != null) {
                matrix.preConcat(aoVar.f55323b);
            }
            f.ai b2 = aoVar.o.b(aoVar.f55292a);
            if (b2 == null) {
                b("Use reference '%s' not found", aoVar.f55292a);
                return;
            }
            c((f.af) aoVar);
            a(b2, false, path, matrix);
        }
    }

    private Path a(f.y yVar) {
        float a2;
        float b2;
        if (yVar.f55357f == null && yVar.f55358g == null) {
            a2 = 0.0f;
            b2 = 0.0f;
        } else {
            if (yVar.f55357f == null) {
                a2 = yVar.f55358g.b(this);
            } else if (yVar.f55358g == null) {
                a2 = yVar.f55357f.a(this);
            } else {
                a2 = yVar.f55357f.a(this);
                b2 = yVar.f55358g.b(this);
            }
            b2 = a2;
        }
        float min = Math.min(a2, yVar.f55355c.a(this) / 2.0f);
        float min2 = Math.min(b2, yVar.f55356d.b(this) / 2.0f);
        float a3 = yVar.f55353a != null ? yVar.f55353a.a(this) : 0.0f;
        float b3 = yVar.f55354b != null ? yVar.f55354b.b(this) : 0.0f;
        float a4 = yVar.f55355c.a(this);
        float b4 = yVar.f55356d.b(this);
        if (yVar.f55267j == null) {
            yVar.f55267j = new f.a(a3, b3, a4, b4);
        }
        float f2 = a3 + a4;
        float f3 = b3 + b4;
        Path path = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path.addRect(a3, b3, f2, f3, Path.Direction.CW);
            return path;
        }
        float f4 = min * 0.5522848f;
        float f5 = 0.5522848f * min2;
        float f6 = b3 + min2;
        path.moveTo(a3, f6);
        float f7 = f6 - f5;
        float f8 = a3 + min;
        float f9 = f8 - f4;
        path.cubicTo(a3, f7, f9, b3, f8, b3);
        float f10 = f2 - min;
        path.lineTo(f10, b3);
        float f11 = f10 + f4;
        path.cubicTo(f11, b3, f2, f7, f2, f6);
        float f12 = f3 - min2;
        path.lineTo(f2, f12);
        float f13 = f12 + f5;
        path.cubicTo(f2, f13, f11, f3, f10, f3);
        path.lineTo(f8, f3);
        path.cubicTo(f9, f3, a3, f13, a3, f12);
        path.lineTo(a3, f6);
        path.close();
        return path;
    }

    private void a(f.af afVar, Path path, f.v vVar) {
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z = vVar.f55344a != null && vVar.f55344a.booleanValue();
        if (vVar.f55351h != null) {
            a(vVar, vVar.f55351h);
        }
        if (z) {
            f2 = vVar.f55347d != null ? vVar.f55347d.a(this) : 0.0f;
            f3 = vVar.f55348e != null ? vVar.f55348e.b(this) : 0.0f;
            f4 = vVar.f55349f != null ? vVar.f55349f.a(this) : 0.0f;
            f5 = vVar.f55350g != null ? vVar.f55350g.b(this) : 0.0f;
        } else {
            float d2 = vVar.f55347d != null ? vVar.f55347d.d(this) : 0.0f;
            float d3 = vVar.f55348e != null ? vVar.f55348e.d(this) : 0.0f;
            float d4 = vVar.f55349f != null ? vVar.f55349f.d(this) : 0.0f;
            float d5 = vVar.f55350g != null ? vVar.f55350g.d(this) : 0.0f;
            f2 = (d2 * afVar.f55267j.f55240c) + afVar.f55267j.f55238a;
            f3 = (d3 * afVar.f55267j.f55241d) + afVar.f55267j.f55239b;
            f4 = d4 * afVar.f55267j.f55240c;
            f5 = d5 * afVar.f55267j.f55241d;
        }
        if (!(f4 == 0.0f || f5 == 0.0f)) {
            d dVar = vVar.q != null ? vVar.q : d.f55218e;
            c();
            this.f55362d.clipPath(path);
            b bVar = new b();
            a(bVar, f.ab.a());
            bVar.f55377a.o = false;
            this.f55361c = a(vVar, bVar);
            f.a aVar = afVar.f55267j;
            if (vVar.f55346c != null) {
                this.f55362d.concat(vVar.f55346c);
                Matrix matrix = new Matrix();
                if (vVar.f55346c.invert(matrix)) {
                    float[] fArr = {afVar.f55267j.f55238a, afVar.f55267j.f55239b, afVar.f55267j.a(), afVar.f55267j.f55239b, afVar.f55267j.a(), afVar.f55267j.b(), afVar.f55267j.f55238a, afVar.f55267j.b()};
                    matrix.mapPoints(fArr);
                    RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                    int i2 = 2;
                    do {
                        if (fArr[i2] < rectF.left) {
                            rectF.left = fArr[i2];
                        }
                        if (fArr[i2] > rectF.right) {
                            rectF.right = fArr[i2];
                        }
                        int i3 = i2 + 1;
                        if (fArr[i3] < rectF.top) {
                            rectF.top = fArr[i3];
                        }
                        if (fArr[i3] > rectF.bottom) {
                            rectF.bottom = fArr[i3];
                        }
                        i2 += 2;
                    } while (i2 <= 6);
                    aVar = new f.a(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                }
            }
            float floor = f2 + (((float) Math.floor((double) ((aVar.f55238a - f2) / f4))) * f4);
            float a2 = aVar.a();
            float b2 = aVar.b();
            f.a aVar2 = new f.a(0.0f, 0.0f, f4, f5);
            boolean f6 = f();
            for (float floor2 = f3 + (((float) Math.floor((double) ((aVar.f55239b - f3) / f5))) * f5); floor2 < b2; floor2 += f5) {
                for (float f7 = floor; f7 < a2; f7 += f4) {
                    aVar2.f55238a = f7;
                    aVar2.f55239b = floor2;
                    c();
                    if (!this.f55361c.f55377a.o.booleanValue()) {
                        a(aVar2.f55238a, aVar2.f55239b, aVar2.f55240c, aVar2.f55241d);
                    }
                    if (vVar.r != null) {
                        this.f55362d.concat(a(aVar2, vVar.r, dVar));
                    } else {
                        boolean z2 = vVar.f55345b == null || vVar.f55345b.booleanValue();
                        this.f55362d.translate(f7, floor2);
                        if (!z2) {
                            this.f55362d.scale(afVar.f55267j.f55240c, afVar.f55267j.f55241d);
                        }
                    }
                    for (f.ai aiVar : vVar.f55266i) {
                        a(aiVar);
                    }
                    d();
                }
            }
            if (f6) {
                d();
            }
            d();
        }
    }

    private static void a(f.v vVar, String str) {
        while (true) {
            f.ai b2 = vVar.o.b(str);
            if (b2 == null) {
                a("Pattern reference '%s' not found", str);
                return;
            } else if (!(b2 instanceof f.v)) {
                b("Pattern href attributes must point to other pattern elements", new Object[0]);
                return;
            } else if (b2 == vVar) {
                b("Circular reference in pattern href attribute '%s'", str);
                return;
            } else {
                f.v vVar2 = (f.v) b2;
                if (vVar.f55344a == null) {
                    vVar.f55344a = vVar2.f55344a;
                }
                if (vVar.f55345b == null) {
                    vVar.f55345b = vVar2.f55345b;
                }
                if (vVar.f55346c == null) {
                    vVar.f55346c = vVar2.f55346c;
                }
                if (vVar.f55347d == null) {
                    vVar.f55347d = vVar2.f55347d;
                }
                if (vVar.f55348e == null) {
                    vVar.f55348e = vVar2.f55348e;
                }
                if (vVar.f55349f == null) {
                    vVar.f55349f = vVar2.f55349f;
                }
                if (vVar.f55350g == null) {
                    vVar.f55350g = vVar2.f55350g;
                }
                if (vVar.f55266i.isEmpty()) {
                    vVar.f55266i = vVar2.f55266i;
                }
                if (vVar.r == null) {
                    vVar.r = vVar2.r;
                }
                if (vVar.q == null) {
                    vVar.q = vVar2.q;
                }
                if (vVar2.f55351h != null) {
                    str = vVar2.f55351h;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public static class a implements f.u {

        /* renamed from: a  reason: collision with root package name */
        public Path f55374a = new Path();

        /* renamed from: b  reason: collision with root package name */
        float f55375b;

        /* renamed from: c  reason: collision with root package name */
        float f55376c;

        static {
            Covode.recordClassIndex(34691);
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a() {
            this.f55374a.close();
        }

        a(f.t tVar) {
            if (tVar != null) {
                tVar.a(this);
            }
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3) {
            this.f55374a.moveTo(f2, f3);
            this.f55375b = f2;
            this.f55376c = f3;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void b(float f2, float f3) {
            this.f55374a.lineTo(f2, f3);
            this.f55375b = f2;
            this.f55376c = f3;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3, float f4, float f5) {
            this.f55374a.quadTo(f2, f3, f4, f5);
            this.f55375b = f4;
            this.f55376c = f5;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3, float f4, float f5, float f6, float f7) {
            this.f55374a.cubicTo(f2, f3, f4, f5, f6, f7);
            this.f55375b = f6;
            this.f55376c = f7;
        }

        @Override // com.lynx.component.svg.a.f.u
        public final void a(float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
            double d2;
            double d3;
            double d4;
            double acos;
            a aVar = this;
            float f7 = aVar.f55375b;
            float f8 = aVar.f55376c;
            if (!(f7 == f5 && f8 == f6)) {
                if (f2 == 0.0f) {
                    aVar = this;
                } else if (f3 != 0.0f) {
                    float abs = Math.abs(f2);
                    float abs2 = Math.abs(f3);
                    double d5 = (double) f4;
                    Double.isNaN(d5);
                    double radians = Math.toRadians(d5 % 360.0d);
                    double cos = Math.cos(radians);
                    double sin = Math.sin(radians);
                    double d6 = (double) (f7 - f5);
                    Double.isNaN(d6);
                    double d7 = d6 / 2.0d;
                    double d8 = (double) (f8 - f6);
                    Double.isNaN(d8);
                    double d9 = d8 / 2.0d;
                    double d10 = (cos * d7) + (sin * d9);
                    double d11 = ((-sin) * d7) + (d9 * cos);
                    double d12 = (double) (abs * abs);
                    double d13 = (double) (abs2 * abs2);
                    double d14 = d10 * d10;
                    double d15 = d11 * d11;
                    Double.isNaN(d12);
                    Double.isNaN(d13);
                    double d16 = (d14 / d12) + (d15 / d13);
                    if (d16 > 0.99999d) {
                        double sqrt = Math.sqrt(d16) * 1.00001d;
                        double d17 = (double) abs;
                        Double.isNaN(d17);
                        abs = (float) (d17 * sqrt);
                        double d18 = (double) abs2;
                        Double.isNaN(d18);
                        abs2 = (float) (sqrt * d18);
                        d12 = (double) (abs * abs);
                        d13 = (double) (abs2 * abs2);
                    }
                    if (z == z2) {
                        d2 = -1.0d;
                    } else {
                        d2 = 1.0d;
                    }
                    double d19 = d12 * d13;
                    double d20 = d12 * d15;
                    double d21 = d13 * d14;
                    double d22 = ((d19 - d20) - d21) / (d20 + d21);
                    if (d22 < 0.0d) {
                        d22 = 0.0d;
                    }
                    double sqrt2 = d2 * Math.sqrt(d22);
                    double d23 = (double) abs;
                    Double.isNaN(d23);
                    double d24 = (double) abs2;
                    Double.isNaN(d24);
                    double d25 = ((d23 * d11) / d24) * sqrt2;
                    Double.isNaN(d24);
                    Double.isNaN(d23);
                    double d26 = sqrt2 * (-((d24 * d10) / d23));
                    double d27 = (double) (f7 + f5);
                    Double.isNaN(d27);
                    double d28 = d27 / 2.0d;
                    double d29 = (double) (f8 + f6);
                    Double.isNaN(d29);
                    double d30 = d28 + ((cos * d25) - (sin * d26));
                    double d31 = (d29 / 2.0d) + (sin * d25) + (cos * d26);
                    Double.isNaN(d23);
                    double d32 = (d10 - d25) / d23;
                    Double.isNaN(d24);
                    double d33 = (d11 - d26) / d24;
                    Double.isNaN(d23);
                    double d34 = ((-d10) - d25) / d23;
                    Double.isNaN(d24);
                    double d35 = ((-d11) - d26) / d24;
                    double d36 = (d32 * d32) + (d33 * d33);
                    double sqrt3 = Math.sqrt(d36);
                    if (d33 < 0.0d) {
                        d3 = -1.0d;
                    } else {
                        d3 = 1.0d;
                    }
                    double acos2 = d3 * Math.acos(d32 / sqrt3);
                    double sqrt4 = Math.sqrt(d36 * ((d34 * d34) + (d35 * d35)));
                    double d37 = (d32 * d34) + (d33 * d35);
                    if ((d32 * d35) - (d33 * d34) < 0.0d) {
                        d4 = -1.0d;
                    } else {
                        d4 = 1.0d;
                    }
                    double d38 = d37 / sqrt4;
                    if (d38 < -1.0d) {
                        acos = 3.141592653589793d;
                    } else if (d38 > 1.0d) {
                        acos = 0.0d;
                    } else {
                        acos = Math.acos(d38);
                    }
                    double d39 = d4 * acos;
                    if (d39 == 0.0d) {
                        aVar = this;
                        aVar.b(f5, f6);
                    } else {
                        if (!z2) {
                            if (d39 > 0.0d) {
                                d39 -= 6.283185307179586d;
                            }
                        } else if (d39 < 0.0d) {
                            d39 += 6.283185307179586d;
                        }
                        double d40 = d39 % 6.283185307179586d;
                        double d41 = acos2 % 6.283185307179586d;
                        int ceil = (int) Math.ceil((Math.abs(d40) * 2.0d) / 3.141592653589793d);
                        double d42 = (double) ceil;
                        Double.isNaN(d42);
                        double d43 = d40 / d42;
                        double d44 = d43 / 2.0d;
                        double sin2 = (Math.sin(d44) * 1.3333333333333333d) / (Math.cos(d44) + 1.0d);
                        int i2 = ceil * 6;
                        float[] fArr = new float[i2];
                        int i3 = 0;
                        for (int i4 = 0; i4 < ceil; i4++) {
                            double d45 = (double) i4;
                            Double.isNaN(d45);
                            double d46 = d41 + (d45 * d43);
                            double cos2 = Math.cos(d46);
                            double sin3 = Math.sin(d46);
                            int i5 = i3 + 1;
                            fArr[i3] = (float) (cos2 - (sin2 * sin3));
                            int i6 = i5 + 1;
                            fArr[i5] = (float) (sin3 + (cos2 * sin2));
                            double d47 = d46 + d43;
                            double cos3 = Math.cos(d47);
                            double sin4 = Math.sin(d47);
                            int i7 = i6 + 1;
                            fArr[i6] = (float) (cos3 + (sin2 * sin4));
                            int i8 = i7 + 1;
                            fArr[i7] = (float) (sin4 - (sin2 * cos3));
                            int i9 = i8 + 1;
                            fArr[i8] = (float) cos3;
                            i3 = i9 + 1;
                            fArr[i9] = (float) sin4;
                        }
                        Matrix matrix = new Matrix();
                        matrix.postScale(abs, abs2);
                        matrix.postRotate(f4);
                        matrix.postTranslate((float) d30, (float) d31);
                        matrix.mapPoints(fArr);
                        fArr[i2 - 2] = f5;
                        fArr[i2 - 1] = f6;
                        for (int i10 = 0; i10 < i2; i10 += 6) {
                            a(fArr[i10], fArr[i10 + 1], fArr[i10 + 2], fArr[i10 + 3], fArr[i10 + 4], fArr[i10 + 5]);
                        }
                        aVar = this;
                    }
                }
                aVar.b(f5, f6);
            }
            aVar.f55375b = f5;
            aVar.f55376c = f6;
        }
    }

    private void d() {
        this.f55362d.restore();
        this.f55361c = this.f55365g.pop();
    }

    private void e() {
        this.f55366h.pop();
        this.f55367i.pop();
    }

    private void m() {
        this.f55362d.restore();
        this.f55361c = this.f55365g.pop();
    }

    private boolean g() {
        if (this.f55361c.f55377a.f55255m.floatValue() < 1.0f) {
            return true;
        }
        return false;
    }

    private boolean h() {
        if (this.f55361c.f55377a.q != null) {
            return this.f55361c.f55377a.q.booleanValue();
        }
        return true;
    }

    private boolean i() {
        if (this.f55361c.f55377a.r != null) {
            return this.f55361c.f55377a.r.booleanValue();
        }
        return true;
    }

    private Path.FillType j() {
        if (this.f55361c.f55377a.f55245c == null || this.f55361c.f55377a.f55245c != f.ab.a.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    private void l() {
        b.a(this.f55362d, b.f55211a);
        this.f55365g.push(this.f55361c);
        this.f55361c = new b(this.f55361c);
    }

    private Path.FillType n() {
        if (this.f55361c.f55377a.v == null || this.f55361c.f55377a.v != f.ab.a.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    private void b() {
        this.f55361c = new b();
        this.f55365g = new Stack<>();
        a(this.f55361c, f.ab.a());
        this.f55361c.f55382f = null;
        this.f55361c.f55384h = false;
        this.f55365g.push(new b(this.f55361c));
        this.f55367i = new Stack<>();
        this.f55366h = new Stack<>();
    }

    private void c() {
        this.f55362d.save();
        this.f55365g.push(this.f55361c);
        this.f55361c = new b(this.f55361c);
    }

    private boolean f() {
        if (!g()) {
            return false;
        }
        this.f55362d.saveLayerAlpha(null, a(this.f55361c.f55377a.f55255m.floatValue()), 31);
        this.f55365g.push(this.f55361c);
        this.f55361c = new b(this.f55361c);
        return true;
    }

    private void k() {
        int i2;
        if (this.f55361c.f55377a.y instanceof f.e) {
            i2 = ((f.e) this.f55361c.f55377a.y).f55307a;
        } else if (this.f55361c.f55377a.y instanceof f.C1255f) {
            i2 = this.f55361c.f55377a.n.f55307a;
        } else {
            return;
        }
        if (this.f55361c.f55377a.z != null) {
            i2 = a(i2, this.f55361c.f55377a.z.floatValue());
        }
        this.f55362d.drawColor(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.component.svg.a.g$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55371a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f55372b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f55373c;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a4 */
        static {
            /*
            // Method dump skipped, instructions count: 177
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.g.AnonymousClass2.<clinit>():void");
        }
    }

    private void c(f.af afVar) {
        a(afVar, afVar.f55267j);
    }

    private static f.a b(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new f.a(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private b c(f.ai aiVar) {
        b bVar = new b();
        a(bVar, f.ab.a());
        return a(aiVar, bVar);
    }

    private static Path a(f.w wVar) {
        Path path = new Path();
        path.moveTo(wVar.f55352a[0], wVar.f55352a[1]);
        for (int i2 = 2; i2 < wVar.f55352a.length; i2 += 2) {
            path.lineTo(wVar.f55352a[i2], wVar.f55352a[i2 + 1]);
        }
        if (wVar instanceof f.x) {
            path.close();
        }
        if (wVar.f55267j == null) {
            wVar.f55267j = b(path);
        }
        return path;
    }

    /* access modifiers changed from: package-private */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        f.ab f55377a;

        /* renamed from: b  reason: collision with root package name */
        boolean f55378b;

        /* renamed from: c  reason: collision with root package name */
        boolean f55379c;

        /* renamed from: d  reason: collision with root package name */
        Paint f55380d;

        /* renamed from: e  reason: collision with root package name */
        Paint f55381e;

        /* renamed from: f  reason: collision with root package name */
        f.a f55382f;

        /* renamed from: g  reason: collision with root package name */
        f.a f55383g;

        /* renamed from: h  reason: collision with root package name */
        boolean f55384h;

        static {
            Covode.recordClassIndex(34692);
        }

        b() {
            Paint paint = new Paint();
            this.f55380d = paint;
            paint.setFlags(193);
            int i2 = Build.VERSION.SDK_INT;
            this.f55380d.setHinting(0);
            this.f55380d.setStyle(Paint.Style.FILL);
            this.f55380d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f55381e = paint2;
            paint2.setFlags(193);
            int i3 = Build.VERSION.SDK_INT;
            this.f55381e.setHinting(0);
            this.f55381e.setStyle(Paint.Style.STROKE);
            this.f55381e.setTypeface(Typeface.DEFAULT);
            this.f55377a = f.ab.a();
        }

        b(b bVar) {
            this.f55378b = bVar.f55378b;
            this.f55379c = bVar.f55379c;
            this.f55380d = new Paint(bVar.f55380d);
            this.f55381e = new Paint(bVar.f55381e);
            if (bVar.f55382f != null) {
                this.f55382f = new f.a(bVar.f55382f);
            }
            if (bVar.f55383g != null) {
                this.f55383g = new f.a(bVar.f55383g);
            }
            this.f55384h = bVar.f55384h;
            try {
                this.f55377a = (f.ab) bVar.f55377a.clone();
            } catch (CloneNotSupportedException unused) {
                this.f55377a = f.ab.a();
            }
        }
    }

    private static Bitmap a(String str) {
        MethodCollector.i(8244);
        if (!str.startsWith("data:")) {
            MethodCollector.o(8244);
            return null;
        } else if (str.length() < 14) {
            MethodCollector.o(8244);
            return null;
        } else {
            int indexOf = str.indexOf(44);
            if (indexOf < 12) {
                MethodCollector.o(8244);
                return null;
            } else if (!";base64".equals(str.substring(indexOf - 7, indexOf))) {
                MethodCollector.o(8244);
                return null;
            } else {
                try {
                    byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    MethodCollector.o(8244);
                    return decodeByteArray;
                } catch (Exception unused) {
                    MethodCollector.o(8244);
                    return null;
                }
            }
        }
    }

    private void b(f.ae aeVar) {
        this.f55366h.push(aeVar);
        this.f55367i.push(this.f55362d.getMatrix());
    }

    private void b(f.af afVar) {
        if (this.f55361c.f55377a.f55244b instanceof f.r) {
            a(true, afVar.f55267j, (f.r) this.f55361c.f55377a.f55244b);
        }
        if (this.f55361c.f55377a.f55247e instanceof f.r) {
            a(false, afVar.f55267j, (f.r) this.f55361c.f55377a.f55247e);
        }
    }

    private Path a(f.c cVar) {
        float f2;
        float f3 = 0.0f;
        if (cVar.f55301a != null) {
            f2 = cVar.f55301a.a(this);
        } else {
            f2 = 0.0f;
        }
        if (cVar.f55302b != null) {
            f3 = cVar.f55302b.b(this);
        }
        float c2 = cVar.f55303c.c(this);
        float f4 = f2 - c2;
        float f5 = f3 - c2;
        float f6 = f2 + c2;
        float f7 = f3 + c2;
        if (cVar.f55267j == null) {
            float f8 = 2.0f * c2;
            cVar.f55267j = new f.a(f4, f5, f8, f8);
        }
        float f9 = 0.5522848f * c2;
        Path path = new Path();
        path.moveTo(f2, f5);
        float f10 = f2 + f9;
        float f11 = f3 - f9;
        path.cubicTo(f10, f5, f6, f11, f6, f3);
        float f12 = f3 + f9;
        path.cubicTo(f6, f12, f10, f7, f2, f7);
        float f13 = f2 - f9;
        path.cubicTo(f13, f7, f4, f12, f4, f3);
        path.cubicTo(f4, f11, f13, f5, f2, f5);
        path.close();
        return path;
    }

    private void b(f.ai aiVar) {
        if (aiVar instanceof f.ag) {
            f.ag agVar = (f.ag) aiVar;
            if (agVar.f55269l != null) {
                this.f55361c.f55384h = agVar.f55269l.booleanValue();
            }
        }
    }

    private Path a(f.h hVar) {
        float f2;
        float f3 = 0.0f;
        if (hVar.f55309a != null) {
            f2 = hVar.f55309a.a(this);
        } else {
            f2 = 0.0f;
        }
        if (hVar.f55310b != null) {
            f3 = hVar.f55310b.b(this);
        }
        float a2 = hVar.f55311c.a(this);
        float b2 = hVar.f55312d.b(this);
        float f4 = f2 - a2;
        float f5 = f3 - b2;
        float f6 = f2 + a2;
        float f7 = f3 + b2;
        if (hVar.f55267j == null) {
            hVar.f55267j = new f.a(f4, f5, a2 * 2.0f, 2.0f * b2);
        }
        float f8 = a2 * 0.5522848f;
        float f9 = 0.5522848f * b2;
        Path path = new Path();
        path.moveTo(f2, f5);
        float f10 = f2 + f8;
        float f11 = f3 - f9;
        path.cubicTo(f10, f5, f6, f11, f6, f3);
        float f12 = f9 + f3;
        path.cubicTo(f6, f12, f10, f7, f2, f7);
        float f13 = f2 - f8;
        path.cubicTo(f13, f7, f4, f12, f4, f3);
        path.cubicTo(f4, f11, f13, f5, f2, f5);
        path.close();
        return path;
    }

    private static void b(String str, Object... objArr) {
        LLog.a(6, "SVGAndroidRenderer", com.a.a(str, objArr));
    }

    private static void c(String str, Object... objArr) {
        LLog.a(3, "SVGAndroidRenderer", com.a.a(str, objArr));
    }

    private static int a(int i2, float f2) {
        int i3 = 255;
        int round = Math.round(((float) ((i2 >> 24) & 255)) * f2);
        if (round < 0) {
            i3 = 0;
        } else if (round <= 255) {
            i3 = round;
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    private Path b(f.af afVar, f.a aVar) {
        Path a2;
        f.ai b2 = afVar.o.b(this.f55361c.f55377a.u);
        boolean z = false;
        if (b2 == null) {
            b("ClipPath reference '%s' not found", this.f55361c.f55377a.u);
            return null;
        }
        f.d dVar = (f.d) b2;
        this.f55365g.push(this.f55361c);
        this.f55361c = c((f.ai) dVar);
        if (dVar.f55304a == null || dVar.f55304a.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(aVar.f55238a, aVar.f55239b);
            matrix.preScale(aVar.f55240c, aVar.f55241d);
        }
        if (dVar.f55323b != null) {
            matrix.preConcat(dVar.f55323b);
        }
        Path path = new Path();
        for (f.ai aiVar : dVar.f55266i) {
            if ((aiVar instanceof f.af) && (a2 = a((f.af) aiVar, true)) != null) {
                path.op(a2, Path.Op.UNION);
            }
        }
        if (this.f55361c.f55377a.u != null) {
            if (dVar.f55267j == null) {
                dVar.f55267j = b(path);
            }
            Path b3 = b(dVar, dVar.f55267j);
            if (b3 != null) {
                path.op(b3, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f55361c = this.f55365g.pop();
        return path;
    }

    private void c(f.af afVar, f.a aVar) {
        boolean z;
        f.ai b2 = afVar.o.b(this.f55361c.f55377a.u);
        if (b2 == null) {
            b("ClipPath reference '%s' not found", this.f55361c.f55377a.u);
            return;
        }
        f.d dVar = (f.d) b2;
        if (dVar.f55266i.isEmpty()) {
            this.f55362d.clipRect(0, 0, 0, 0);
            return;
        }
        if (dVar.f55304a == null || dVar.f55304a.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (!(afVar instanceof f.l) || z) {
            l();
            if (!z) {
                Matrix matrix = new Matrix();
                matrix.preTranslate(aVar.f55238a, aVar.f55239b);
                matrix.preScale(aVar.f55240c, aVar.f55241d);
                this.f55362d.concat(matrix);
            }
            if (dVar.f55323b != null) {
                this.f55362d.concat(dVar.f55323b);
            }
            this.f55361c = c((f.ai) dVar);
            c((f.af) dVar);
            Path path = new Path();
            for (f.ai aiVar : dVar.f55266i) {
                a(aiVar, true, path, new Matrix());
            }
            this.f55362d.clipPath(path);
            m();
            return;
        }
        a("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", afVar.a());
    }

    private Path a(f.af afVar, boolean z) {
        Path path;
        Path b2;
        this.f55365g.push(this.f55361c);
        b bVar = new b(this.f55361c);
        this.f55361c = bVar;
        a(bVar, afVar);
        if (!h() || !i()) {
            this.f55361c = this.f55365g.pop();
            return null;
        }
        if (afVar instanceof f.ao) {
            if (!z) {
                b("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            f.ao aoVar = (f.ao) afVar;
            f.ai b3 = afVar.o.b(aoVar.f55292a);
            if (b3 == null) {
                b("Use reference '%s' not found", aoVar.f55292a);
                this.f55361c = this.f55365g.pop();
                return null;
            } else if (!(b3 instanceof f.af)) {
                this.f55361c = this.f55365g.pop();
                return null;
            } else {
                path = a((f.af) b3, false);
                if (path == null) {
                    return null;
                }
                if (aoVar.f55267j == null) {
                    aoVar.f55267j = b(path);
                }
                if (aoVar.f55323b != null) {
                    path.transform(aoVar.f55323b);
                }
            }
        } else if (afVar instanceof f.k) {
            f.k kVar = (f.k) afVar;
            if (afVar instanceof f.s) {
                path = new a(((f.s) afVar).f55338a).f55374a;
                if (afVar.f55267j == null) {
                    afVar.f55267j = b(path);
                }
            } else if (afVar instanceof f.y) {
                path = a((f.y) afVar);
            } else if (afVar instanceof f.c) {
                path = a((f.c) afVar);
            } else if (afVar instanceof f.h) {
                path = a((f.h) afVar);
            } else {
                if (afVar instanceof f.w) {
                    path = a((f.w) afVar);
                }
                return null;
            }
            if (path != null) {
                if (kVar.f55267j == null) {
                    kVar.f55267j = b(path);
                }
                if (kVar.f55322e != null) {
                    path.transform(kVar.f55322e);
                }
                path.setFillType(n());
            }
            return null;
        } else {
            b("Invalid %s element found in clipPath definition", afVar.a());
            return null;
        }
        if (!(this.f55361c.f55377a.u == null || (b2 = b(afVar, afVar.f55267j)) == null)) {
            path.op(b2, Path.Op.INTERSECT);
        }
        this.f55361c = this.f55365g.pop();
        return path;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r6 != 8) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Matrix a(com.lynx.component.svg.a.f.a r9, com.lynx.component.svg.a.f.a r10, com.lynx.component.svg.a.d r11) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.component.svg.a.g.a(com.lynx.component.svg.a.f$a, com.lynx.component.svg.a.f$a, com.lynx.component.svg.a.d):android.graphics.Matrix");
    }

    public g(Canvas canvas, float f2, float f3, com.lynx.component.svg.d dVar) {
        this.f55362d = canvas;
        this.f55359a = f2;
        this.f55360b = f3;
        this.f55363e = dVar;
    }
}
