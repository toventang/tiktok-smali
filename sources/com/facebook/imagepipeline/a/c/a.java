package com.facebook.imagepipeline.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.a.a.b;
import com.facebook.imagepipeline.a.a.c;
import com.facebook.imagepipeline.a.a.d;
import com.facebook.imagepipeline.a.a.e;
import com.facebook.imagepipeline.a.b.f;

public final class a implements com.facebook.imagepipeline.a.a.a {

    /* renamed from: a  reason: collision with root package name */
    public int f47668a = 2;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.a.d.a f47669b;

    /* renamed from: c  reason: collision with root package name */
    private final e f47670c;

    /* renamed from: d  reason: collision with root package name */
    private final c f47671d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f47672e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f47673f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f47674g;

    /* renamed from: h  reason: collision with root package name */
    private final int f47675h;

    /* renamed from: i  reason: collision with root package name */
    private final b[] f47676i;

    /* renamed from: j  reason: collision with root package name */
    private final Rect f47677j = new Rect();

    /* renamed from: k  reason: collision with root package name */
    private final Rect f47678k = new Rect();

    /* renamed from: l  reason: collision with root package name */
    private Bitmap f47679l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f47680m;

    static {
        Covode.recordClassIndex(28898);
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final int a() {
        return this.f47671d.getFrameCount();
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final int b() {
        return this.f47671d.getLoopCount();
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final int c() {
        return this.f47671d.getWidth();
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final int d() {
        return this.f47671d.getHeight();
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final int e() {
        return this.f47672e.width();
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final int f() {
        return this.f47672e.height();
    }

    private synchronized void g() {
        MethodCollector.i(5309);
        Bitmap bitmap = this.f47679l;
        if (bitmap != null) {
            if (!this.f47680m) {
                bitmap.recycle();
            }
            this.f47679l = null;
        }
        MethodCollector.o(5309);
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final b a(int i2) {
        return this.f47676i[i2];
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final int b(int i2) {
        return this.f47673f[i2];
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final com.facebook.imagepipeline.a.a.a a(Rect rect) {
        if (a(this.f47671d, rect).equals(this.f47672e)) {
            return this;
        }
        return new a(this.f47669b, this.f47670c, rect);
    }

    private static Rect a(c cVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, cVar.getWidth(), cVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private synchronized void a(int i2, int i3) {
        Bitmap a2;
        MethodCollector.i(5306);
        Bitmap bitmap = this.f47679l;
        if (bitmap != null && (bitmap.getWidth() < i2 || this.f47679l.getHeight() < i3)) {
            g();
        }
        if (this.f47679l == null) {
            f fVar = com.facebook.imagepipeline.a.b.b.f47657a;
            if (fVar == null || (a2 = fVar.a()) == null) {
                this.f47679l = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f47680m = false;
            } else {
                this.f47679l = a2;
                this.f47680m = true;
                MethodCollector.o(5306);
                return;
            }
        }
        MethodCollector.o(5306);
    }

    @Override // com.facebook.imagepipeline.a.a.a
    public final void a(int i2, Canvas canvas) {
        MethodCollector.i(5298);
        d frame = this.f47671d.getFrame(i2);
        try {
            if (this.f47671d.doesRenderSupportScaling()) {
                double width = (double) this.f47672e.width();
                double width2 = (double) this.f47671d.getWidth();
                Double.isNaN(width);
                Double.isNaN(width2);
                double d2 = width / width2;
                double height = (double) this.f47672e.height();
                double height2 = (double) this.f47671d.getHeight();
                Double.isNaN(height);
                Double.isNaN(height2);
                double d3 = height / height2;
                double b2 = (double) frame.b();
                Double.isNaN(b2);
                int round = (int) Math.round(b2 * d2);
                double c2 = (double) frame.c();
                Double.isNaN(c2);
                int round2 = (int) Math.round(c2 * d3);
                double d4 = (double) frame.d();
                Double.isNaN(d4);
                int i3 = (int) (d4 * d2);
                double e2 = (double) frame.e();
                Double.isNaN(e2);
                int i4 = (int) (e2 * d3);
                synchronized (this) {
                    try {
                        int width3 = this.f47672e.width();
                        int height3 = this.f47672e.height();
                        a(width3, height3);
                        synchronized (this.f47679l) {
                            try {
                                this.f47679l.eraseColor(0);
                                try {
                                    frame.a(round, round2, this.f47679l);
                                    this.f47677j.set(0, 0, width3, height3);
                                    this.f47678k.set(i3, i4, width3 + i3, height3 + i4);
                                    canvas.drawBitmap(this.f47679l, this.f47677j, this.f47678k, (Paint) null);
                                } catch (IllegalStateException e3) {
                                    IllegalStateException illegalStateException = new IllegalStateException(e3.getMessage() + a(this.f47679l, round, round2, this.f47672e, this.f47668a));
                                    MethodCollector.o(5298);
                                    throw illegalStateException;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } finally {
                        MethodCollector.o(5298);
                    }
                }
            } else {
                int b3 = frame.b();
                int c3 = frame.c();
                int d5 = frame.d();
                int e4 = frame.e();
                synchronized (this) {
                    try {
                        a(b3, c3);
                        synchronized (this.f47679l) {
                            try {
                                this.f47679l.eraseColor(0);
                                try {
                                    frame.a(b3, c3, this.f47679l);
                                    this.f47677j.set(0, 0, b3, c3);
                                    this.f47678k.set(0, 0, b3, c3);
                                    canvas.save();
                                    canvas.translate((float) d5, (float) e4);
                                    canvas.drawBitmap(this.f47679l, this.f47677j, this.f47678k, (Paint) null);
                                    canvas.restore();
                                } catch (IllegalStateException e5) {
                                    IllegalStateException illegalStateException2 = new IllegalStateException(e5.getMessage() + a(this.f47679l, b3, c3, null, this.f47668a));
                                    MethodCollector.o(5298);
                                    throw illegalStateException2;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } finally {
                        MethodCollector.o(5298);
                    }
                }
            }
        } finally {
            frame.a();
            MethodCollector.o(5298);
        }
    }

    public a(com.facebook.imagepipeline.a.d.a aVar, e eVar, Rect rect) {
        this.f47669b = aVar;
        this.f47670c = eVar;
        c cVar = eVar.f47649a;
        this.f47671d = cVar;
        int[] frameDurations = cVar.getFrameDurations();
        this.f47673f = frameDurations;
        com.facebook.imagepipeline.a.d.a.a(frameDurations);
        this.f47675h = com.facebook.imagepipeline.a.d.a.b(frameDurations);
        this.f47674g = com.facebook.imagepipeline.a.d.a.c(frameDurations);
        this.f47672e = a(cVar, rect);
        this.f47676i = new b[cVar.getFrameCount()];
        for (int i2 = 0; i2 < this.f47671d.getFrameCount(); i2++) {
            this.f47676i[i2] = this.f47671d.getFrameInfo(i2);
        }
    }

    private static String a(Bitmap bitmap, int i2, int i3, Rect rect, int i4) {
        StringBuilder append = new StringBuilder(", mTempBitmap:").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).append(", frame:").append(i2).append("x").append(i3);
        if (rect != null) {
            append.append(", renderedBounds:").append(rect.width()).append("x").append(rect.height());
        }
        append.append(", decodeType:").append(i4);
        return append.toString();
    }
}
