package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.c.d;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.e.b.c;
import com.airbnb.lottie.e.b.e;
import com.airbnb.lottie.e.b.f;
import com.airbnb.lottie.g;
import com.bytedance.covode.number.Covode;

public final class i extends a {

    /* renamed from: c  reason: collision with root package name */
    private final String f5191c;

    /* renamed from: d  reason: collision with root package name */
    private final d<LinearGradient> f5192d = new d<>();

    /* renamed from: e  reason: collision with root package name */
    private final d<RadialGradient> f5193e = new d<>();

    /* renamed from: f  reason: collision with root package name */
    private final RectF f5194f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final f f5195g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5196h;

    /* renamed from: i  reason: collision with root package name */
    private final a<c, c> f5197i;

    /* renamed from: j  reason: collision with root package name */
    private final a<PointF, PointF> f5198j;

    /* renamed from: k  reason: collision with root package name */
    private final a<PointF, PointF> f5199k;

    static {
        Covode.recordClassIndex(2194);
    }

    @Override // com.airbnb.lottie.a.a.c
    public final String b() {
        return this.f5191c;
    }

    private int c() {
        int i2;
        int round = Math.round(this.f5198j.f5259c * ((float) this.f5196h));
        int round2 = Math.round(this.f5199k.f5259c * ((float) this.f5196h));
        int round3 = Math.round(this.f5197i.f5259c * ((float) this.f5196h));
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

    public i(g gVar, com.airbnb.lottie.e.c.a aVar, e eVar) {
        super(gVar, aVar, eVar.f5396h.toPaintCap(), eVar.f5397i.toPaintJoin(), eVar.f5398j, eVar.f5392d, eVar.f5395g, eVar.f5399k, eVar.f5400l);
        this.f5191c = eVar.f5389a;
        this.f5195g = eVar.f5390b;
        this.f5196h = (int) (gVar.f5554a.a() / 32.0f);
        a<c, c> a2 = eVar.f5391c.a();
        this.f5197i = a2;
        a2.a(this);
        aVar.a(a2);
        a<PointF, PointF> a3 = eVar.f5393e.a();
        this.f5198j = a3;
        a3.a(this);
        aVar.a(a3);
        a<PointF, PointF> a4 = eVar.f5394f.a();
        this.f5199k = a4;
        a4.a(this);
        aVar.a(a4);
    }

    @Override // com.airbnb.lottie.a.a.a, com.airbnb.lottie.a.a.e
    public final void a(Canvas canvas, Matrix matrix, int i2) {
        a(this.f5194f, matrix);
        if (this.f5195g == f.Linear) {
            Paint paint = this.f5137b;
            long c2 = (long) c();
            LinearGradient a2 = this.f5192d.a(c2, null);
            if (a2 == null) {
                PointF f2 = this.f5198j.f();
                PointF f3 = this.f5199k.f();
                c f4 = this.f5197i.f();
                a2 = new LinearGradient((float) ((int) (this.f5194f.left + (this.f5194f.width() / 2.0f) + f2.x)), (float) ((int) (this.f5194f.top + (this.f5194f.height() / 2.0f) + f2.y)), (float) ((int) (this.f5194f.left + (this.f5194f.width() / 2.0f) + f3.x)), (float) ((int) (this.f5194f.top + (this.f5194f.height() / 2.0f) + f3.y)), f4.f5379b, f4.f5378a, Shader.TileMode.CLAMP);
                this.f5192d.b(c2, a2);
            }
            paint.setShader(a2);
        } else {
            Paint paint2 = this.f5137b;
            long c3 = (long) c();
            RadialGradient a3 = this.f5193e.a(c3);
            if (a3 == null) {
                PointF f5 = this.f5198j.f();
                PointF f6 = this.f5199k.f();
                c f7 = this.f5197i.f();
                int[] iArr = f7.f5379b;
                float[] fArr = f7.f5378a;
                int width = (int) (this.f5194f.left + (this.f5194f.width() / 2.0f) + f5.x);
                int height = (int) (this.f5194f.top + (this.f5194f.height() / 2.0f) + f5.y);
                a3 = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (((int) ((this.f5194f.left + (this.f5194f.width() / 2.0f)) + f6.x)) - width), (double) (((int) ((this.f5194f.top + (this.f5194f.height() / 2.0f)) + f6.y)) - height)), iArr, fArr, Shader.TileMode.CLAMP);
                this.f5193e.b(c3, a3);
            }
            paint2.setShader(a3);
        }
        super.a(canvas, matrix, i2);
    }
}
