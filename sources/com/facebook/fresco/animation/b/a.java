package com.facebook.fresco.animation.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.a.c;
import com.facebook.fresco.animation.a.d;
import com.facebook.fresco.animation.b.b.b;
import com.facebook.imagepipeline.c.f;

public class a implements com.facebook.fresco.animation.a.a, c.a {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f47519c = a.class;

    /* renamed from: a  reason: collision with root package name */
    public com.facebook.fresco.animation.b.b.a f47520a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap.Config f47521b = Bitmap.Config.ARGB_8888;

    /* renamed from: d  reason: collision with root package name */
    private final f f47522d;

    /* renamed from: e  reason: collision with root package name */
    private final b f47523e;

    /* renamed from: f  reason: collision with root package name */
    private final d f47524f;

    /* renamed from: g  reason: collision with root package name */
    private final c f47525g;

    /* renamed from: h  reason: collision with root package name */
    private final b f47526h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f47527i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f47528j;

    /* renamed from: k  reason: collision with root package name */
    private int f47529k;

    /* renamed from: l  reason: collision with root package name */
    private int f47530l;

    @Override // com.facebook.fresco.animation.a.a
    public final int b() {
        return this.f47529k;
    }

    @Override // com.facebook.fresco.animation.a.a
    public final int c() {
        return this.f47530l;
    }

    @Override // com.facebook.fresco.animation.a.c.a
    public final void f() {
        d();
    }

    @Override // com.facebook.fresco.animation.a.d
    public final int a() {
        return this.f47524f.a();
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void d() {
        this.f47523e.c();
    }

    @Override // com.facebook.fresco.animation.a.d
    public final int e() {
        return this.f47524f.e();
    }

    static {
        Covode.recordClassIndex(28828);
    }

    private void g() {
        int width;
        int a2 = this.f47525g.a();
        this.f47529k = a2;
        int i2 = -1;
        if (a2 == -1) {
            Rect rect = this.f47528j;
            if (rect == null) {
                width = -1;
            } else {
                width = rect.width();
            }
            this.f47529k = width;
        }
        int b2 = this.f47525g.b();
        this.f47530l = b2;
        if (b2 == -1) {
            Rect rect2 = this.f47528j;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.f47530l = i2;
        }
    }

    @Override // com.facebook.fresco.animation.a.a
    public final boolean b(int i2) {
        return this.f47523e.b(i2);
    }

    @Override // com.facebook.fresco.animation.a.d
    public final int c(int i2) {
        return this.f47524f.c(i2);
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void a(int i2) {
        this.f47527i.setAlpha(i2);
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void a(ColorFilter colorFilter) {
        this.f47527i.setColorFilter(colorFilter);
    }

    @Override // com.facebook.fresco.animation.a.a
    public final void a(Rect rect) {
        this.f47528j = rect;
        this.f47525g.a(rect);
        g();
    }

    private boolean a(int i2, com.facebook.common.h.a<Bitmap> aVar) {
        if (!com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar)) {
            return false;
        }
        boolean a2 = this.f47525g.a(i2, aVar.a());
        if (!a2) {
            com.facebook.common.h.a.c(aVar);
        }
        return a2;
    }

    private boolean a(Canvas canvas, int i2, int i3) {
        boolean z;
        while (true) {
            int i4 = 3;
            com.facebook.common.h.a<Bitmap> aVar = null;
            z = false;
            if (i3 == 0) {
                aVar = this.f47523e.a(i2);
                z = a(i2, aVar, canvas, 0);
                i4 = 1;
            } else if (i3 == 1) {
                aVar = this.f47523e.b();
                if (a(i2, aVar) && a(i2, aVar, canvas, 1)) {
                    z = true;
                }
                i4 = 2;
            } else if (i3 == 2) {
                try {
                    aVar = this.f47522d.a(this.f47529k, this.f47530l, this.f47521b);
                    if (a(i2, aVar) && a(i2, aVar, canvas, 2)) {
                        z = true;
                    }
                } catch (RuntimeException e2) {
                    com.facebook.common.e.a.a(f47519c, "Failed to create frame bitmap", (Throwable) e2);
                    com.facebook.common.h.a.c(null);
                    return false;
                }
            } else if (i3 != 3) {
                com.facebook.common.h.a.c(null);
                return false;
            } else {
                try {
                    aVar = this.f47523e.a();
                    z = a(i2, aVar, canvas, 3);
                    i4 = -1;
                } catch (Throwable th) {
                    com.facebook.common.h.a.c(aVar);
                    throw th;
                }
            }
            com.facebook.common.h.a.c(aVar);
            if (z || i4 == -1) {
                return z;
            }
            i3 = i4;
        }
        return z;
    }

    @Override // com.facebook.fresco.animation.a.a
    public final boolean a(Drawable drawable, Canvas canvas, int i2) {
        b bVar;
        boolean a2 = a(canvas, i2, 0);
        com.facebook.fresco.animation.b.b.a aVar = this.f47520a;
        if (!(aVar == null || (bVar = this.f47526h) == null)) {
            aVar.a(bVar, this.f47523e, this, i2);
        }
        return a2;
    }

    private boolean a(int i2, com.facebook.common.h.a<Bitmap> aVar, Canvas canvas, int i3) {
        if (!com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar)) {
            return false;
        }
        if (this.f47528j == null) {
            canvas.drawBitmap(aVar.a(), 0.0f, 0.0f, this.f47527i);
        } else {
            canvas.drawBitmap(aVar.a(), (Rect) null, this.f47528j, this.f47527i);
        }
        if (i3 == 3) {
            return true;
        }
        this.f47523e.a(i2, aVar);
        return true;
    }

    public a(f fVar, b bVar, d dVar, c cVar, com.facebook.fresco.animation.b.b.a aVar, b bVar2) {
        this.f47522d = fVar;
        this.f47523e = bVar;
        this.f47524f = dVar;
        this.f47525g = cVar;
        this.f47520a = aVar;
        this.f47526h = bVar2;
        this.f47527i = new Paint(6);
        g();
    }
}
