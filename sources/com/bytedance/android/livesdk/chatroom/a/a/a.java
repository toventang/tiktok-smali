package com.bytedance.android.livesdk.chatroom.a.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.barrage.a.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends com.ss.ugc.live.barrage.a.b {

    /* renamed from: e  reason: collision with root package name */
    public static final C0318a f14877e = new C0318a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f14878a = 204;

    /* renamed from: b  reason: collision with root package name */
    public float f14879b = 1.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f14880c;

    /* renamed from: d  reason: collision with root package name */
    public double f14881d;

    /* renamed from: l  reason: collision with root package name */
    private final h f14882l = i.a((h.f.a.a) b.f14883a);

    static {
        Covode.recordClassIndex(8249);
    }

    private final Matrix e() {
        return (Matrix) this.f14882l.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$a  reason: collision with other inner class name */
    public static final class C0318a {
        static {
            Covode.recordClassIndex(8250);
        }

        private C0318a() {
        }

        public /* synthetic */ C0318a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Matrix> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14883a = new b();

        static {
            Covode.recordClassIndex(8251);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Matrix invoke() {
            return new Matrix();
        }
    }

    @Override // com.ss.ugc.live.barrage.a.a
    public final void a(Canvas canvas) {
        Bitmap b2;
        l.d(canvas, "");
        a().setAlpha(this.f14878a);
        RectF rectF = this.f154067j;
        float width = rectF.width();
        float height = rectF.height();
        float f2 = width / 2.0f;
        float f3 = height / 2.0f;
        e().setRotate(this.f14880c, f2, f3);
        Matrix e2 = e();
        float f4 = this.f14879b;
        e2.postScale(f4, f4);
        e().postTranslate((rectF.left + ((width * 0.5f) * (1.0f - this.f14879b))) - f2, (rectF.top + ((height * 0.5f) * (1.0f - this.f14879b))) - f3);
        Matrix e3 = e();
        l.c(canvas, "");
        l.c(e3, "");
        if (!(!l.a(this.f154068k, a.AbstractC4098a.d.f154072a)) && (b2 = b()) != null && !b2.isRecycled()) {
            canvas.drawBitmap(b(), e3, a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Bitmap bitmap, double d2) {
        super(bitmap);
        l.d(bitmap, "");
        this.f14881d = d2;
    }
}
