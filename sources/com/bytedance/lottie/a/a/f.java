package com.bytedance.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.a.b.p;
import com.bytedance.lottie.e;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.i;
import com.bytedance.lottie.m;
import java.util.ArrayList;
import java.util.List;

public final class f implements d, j, a.AbstractC0986a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f40330a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f40331b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.lottie.c.c.a f40332c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40333d;

    /* renamed from: e  reason: collision with root package name */
    private final List<l> f40334e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final a<Integer, Integer> f40335f;

    /* renamed from: g  reason: collision with root package name */
    private final a<Integer, Integer> f40336g;

    /* renamed from: h  reason: collision with root package name */
    private a<ColorFilter, ColorFilter> f40337h;

    /* renamed from: i  reason: collision with root package name */
    private final i f40338i;

    static {
        Covode.recordClassIndex(24836);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40333d;
    }

    @Override // com.bytedance.lottie.a.b.a.AbstractC0986a
    public final void a() {
        this.f40338i.invalidateSelf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.List<com.bytedance.lottie.a.a.l> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lottie.a.a.b
    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b bVar = list2.get(i2);
            if (bVar instanceof l) {
                this.f40334e.add(bVar);
            }
        }
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(RectF rectF, Matrix matrix) {
        this.f40330a.reset();
        for (int i2 = 0; i2 < this.f40334e.size(); i2++) {
            this.f40330a.addPath(this.f40334e.get(i2).e(), matrix);
        }
        this.f40330a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.bytedance.lottie.c.f
    public final <T> void a(T t, c<T> cVar) {
        if (t == m.f40802a) {
            this.f40335f.a(cVar);
        } else if (t == m.f40805d) {
            this.f40336g.a(cVar);
        } else if (t != m.x) {
        } else {
            if (cVar == null) {
                this.f40337h = null;
                return;
            }
            p pVar = new p(cVar);
            this.f40337h = pVar;
            pVar.a(this);
            this.f40332c.a(this.f40337h);
        }
    }

    public f(i iVar, com.bytedance.lottie.c.c.a aVar, com.bytedance.lottie.c.b.m mVar) {
        Path path = new Path();
        this.f40330a = path;
        this.f40332c = aVar;
        this.f40333d = mVar.f40555b;
        this.f40338i = iVar;
        if (mVar.f40556c == null || mVar.f40557d == null) {
            this.f40335f = null;
            this.f40336g = null;
            return;
        }
        path.setFillType(mVar.f40554a);
        a<Integer, Integer> a2 = mVar.f40556c.a();
        this.f40335f = a2;
        a2.a(this);
        aVar.a(a2);
        a<Integer, Integer> a3 = mVar.f40557d.a();
        this.f40336g = a3;
        a3.a(this);
        aVar.a(a3);
    }

    @Override // com.bytedance.lottie.a.a.d
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        e.b("FillContent#draw");
        this.f40331b.setColor(this.f40335f.d().intValue());
        this.f40331b.setAlpha(com.bytedance.lottie.f.f.a((int) ((((((float) i2) / 255.0f) * ((float) this.f40336g.d().intValue())) / 100.0f) * 255.0f)));
        a<ColorFilter, ColorFilter> aVar = this.f40337h;
        if (aVar != null) {
            this.f40331b.setColorFilter(aVar.d());
        }
        this.f40330a.reset();
        for (int i3 = 0; i3 < this.f40334e.size(); i3++) {
            this.f40330a.addPath(this.f40334e.get(i3).e(), matrix);
        }
        canvas.drawPath(this.f40330a, this.f40331b);
        e.c("FillContent#draw");
    }

    @Override // com.bytedance.lottie.c.f
    public final void a(com.bytedance.lottie.c.e eVar, int i2, List<com.bytedance.lottie.c.e> list, com.bytedance.lottie.c.e eVar2) {
        com.bytedance.lottie.f.f.a(eVar, i2, list, eVar2, this);
    }
}
