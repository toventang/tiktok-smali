package com.bytedance.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.c.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.a.b.a;
import com.bytedance.lottie.c.b.c;
import com.bytedance.lottie.c.b.e;
import com.bytedance.lottie.c.b.f;
import com.bytedance.lottie.i;

public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    private final String f40352b;

    /* renamed from: c  reason: collision with root package name */
    private final d<LinearGradient> f40353c = new d<>();

    /* renamed from: d  reason: collision with root package name */
    private final d<RadialGradient> f40354d = new d<>();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f40355e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final f f40356f;

    /* renamed from: g  reason: collision with root package name */
    private final int f40357g;

    /* renamed from: h  reason: collision with root package name */
    private final a<c, c> f40358h;

    /* renamed from: i  reason: collision with root package name */
    private final a<PointF, PointF> f40359i;

    /* renamed from: j  reason: collision with root package name */
    private final a<PointF, PointF> f40360j;

    static {
        Covode.recordClassIndex(24838);
    }

    @Override // com.bytedance.lottie.a.a.b
    public final String b() {
        return this.f40352b;
    }

    private int c() {
        int i2;
        int round = Math.round(this.f40359i.f40418c * ((float) this.f40357g));
        int round2 = Math.round(this.f40360j.f40418c * ((float) this.f40357g));
        int round3 = Math.round(this.f40358h.f40418c * ((float) this.f40357g));
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

    public h(i iVar, com.bytedance.lottie.c.c.a aVar, e eVar) {
        super(iVar, aVar, eVar.f40520h.toPaintCap(), eVar.f40521i.toPaintJoin(), eVar.f40522j, eVar.f40516d, eVar.f40519g, eVar.f40523k, eVar.f40524l);
        this.f40352b = eVar.f40513a;
        this.f40356f = eVar.f40514b;
        this.f40357g = (int) (iVar.f40763a.a() / 32.0f);
        a<c, c> a2 = eVar.f40515c.a();
        this.f40358h = a2;
        a2.a(this);
        aVar.a(a2);
        a<PointF, PointF> a3 = eVar.f40517e.a();
        this.f40359i = a3;
        a3.a(this);
        aVar.a(a3);
        a<PointF, PointF> a4 = eVar.f40518f.a();
        this.f40360j = a4;
        a4.a(this);
        aVar.a(a4);
    }

    @Override // com.bytedance.lottie.a.a.a, com.bytedance.lottie.a.a.d
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        a(this.f40355e, matrix);
        if (this.f40356f == f.Linear) {
            Paint paint = this.f40299a;
            long c2 = (long) c();
            LinearGradient a2 = this.f40353c.a(c2, null);
            if (a2 == null) {
                PointF d2 = this.f40359i.d();
                PointF d3 = this.f40360j.d();
                c d4 = this.f40358h.d();
                a2 = new LinearGradient((float) ((int) (this.f40355e.left + (this.f40355e.width() / 2.0f) + d2.x)), (float) ((int) (this.f40355e.top + (this.f40355e.height() / 2.0f) + d2.y)), (float) ((int) (this.f40355e.left + (this.f40355e.width() / 2.0f) + d3.x)), (float) ((int) (this.f40355e.top + (this.f40355e.height() / 2.0f) + d3.y)), d4.f40503b, d4.f40502a, Shader.TileMode.CLAMP);
                this.f40353c.b(c2, a2);
            }
            paint.setShader(a2);
        } else {
            Paint paint2 = this.f40299a;
            long c3 = (long) c();
            RadialGradient a3 = this.f40354d.a(c3);
            if (a3 == null) {
                PointF d5 = this.f40359i.d();
                PointF d6 = this.f40360j.d();
                c d7 = this.f40358h.d();
                int[] iArr = d7.f40503b;
                float[] fArr = d7.f40502a;
                int width = (int) (this.f40355e.left + (this.f40355e.width() / 2.0f) + d5.x);
                int height = (int) (this.f40355e.top + (this.f40355e.height() / 2.0f) + d5.y);
                a3 = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (((int) ((this.f40355e.left + (this.f40355e.width() / 2.0f)) + d6.x)) - width), (double) (((int) ((this.f40355e.top + (this.f40355e.height() / 2.0f)) + d6.y)) - height)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f40354d.b(c3, a3);
            }
            paint2.setShader(a3);
        }
        super.a(canvas, matrix, i2);
    }
}
