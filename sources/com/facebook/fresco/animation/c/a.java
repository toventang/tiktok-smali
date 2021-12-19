package com.facebook.fresco.animation.c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.d;
import com.facebook.fresco.animation.d.b;
import com.facebook.fresco.animation.d.c;

public class a extends Drawable implements Animatable, com.facebook.f.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static c f47559c;

    /* renamed from: j  reason: collision with root package name */
    private static final Class<?> f47560j = a.class;

    /* renamed from: k  reason: collision with root package name */
    private static final b f47561k = new c();

    /* renamed from: a  reason: collision with root package name */
    public int f47562a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47563b;

    /* renamed from: d  reason: collision with root package name */
    public com.facebook.fresco.animation.a.a f47564d;

    /* renamed from: e  reason: collision with root package name */
    public long f47565e;

    /* renamed from: f  reason: collision with root package name */
    public long f47566f;

    /* renamed from: g  reason: collision with root package name */
    public long f47567g;

    /* renamed from: h  reason: collision with root package name */
    public volatile AbstractC1176a f47568h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f47569i;

    /* renamed from: l  reason: collision with root package name */
    private b f47570l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f47571m;
    private long n;
    private long o;
    private int p;
    private int q;
    private volatile b r;
    private d s;

    /* renamed from: com.facebook.fresco.animation.c.a$a  reason: collision with other inner class name */
    public interface AbstractC1176a {
        static {
            Covode.recordClassIndex(28844);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f47571m;
    }

    public a() {
        this(null, null);
    }

    @Override // com.facebook.f.a.a
    public final void a() {
        com.facebook.fresco.animation.a.a aVar = this.f47564d;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final int c() {
        com.facebook.fresco.animation.a.a aVar = this.f47564d;
        if (aVar == null) {
            return 0;
        }
        return aVar.e();
    }

    public int getIntrinsicHeight() {
        com.facebook.fresco.animation.a.a aVar = this.f47564d;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        return aVar.c();
    }

    public int getIntrinsicWidth() {
        com.facebook.fresco.animation.a.a aVar = this.f47564d;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        return aVar.b();
    }

    static {
        Covode.recordClassIndex(28842);
    }

    public void stop() {
        if (this.f47571m) {
            this.f47571m = false;
            this.f47565e = 0;
            this.o = 0;
            this.n = -1;
            this.p = -1;
            unscheduleSelf(this.f47569i);
            this.r.b(this);
        }
    }

    public final long b() {
        if (this.f47564d == null) {
            return 0;
        }
        b bVar = this.f47570l;
        if (bVar != null) {
            return bVar.a();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f47564d.e(); i3++) {
            i2 += this.f47564d.c(i3);
        }
        return (long) i2;
    }

    public void start() {
        com.facebook.fresco.animation.a.a aVar;
        if (!this.f47571m && (aVar = this.f47564d) != null && aVar.e() > 1) {
            this.f47571m = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f47565e = uptimeMillis;
            this.o = uptimeMillis;
            this.n = -1;
            this.p = -1;
            invalidateSelf();
            this.r.a(this);
        }
    }

    public final void a(b bVar) {
        if (bVar == null) {
            bVar = f47561k;
        }
        this.r = bVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        com.facebook.fresco.animation.a.a aVar = this.f47564d;
        if (aVar != null) {
            aVar.a(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        if (this.f47571m) {
            return false;
        }
        long j2 = (long) i2;
        if (this.n == j2) {
            return false;
        }
        this.n = j2;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i2) {
        if (this.s == null) {
            this.s = new d();
        }
        this.s.f47364a = i2;
        com.facebook.fresco.animation.a.a aVar = this.f47564d;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.s == null) {
            this.s = new d();
        }
        this.s.a(colorFilter);
        com.facebook.fresco.animation.a.a aVar = this.f47564d;
        if (aVar != null) {
            aVar.a(colorFilter);
        }
    }

    public final void a(int i2) {
        b bVar;
        if (this.f47564d != null && (bVar = this.f47570l) != null) {
            this.n = bVar.a(i2);
            long uptimeMillis = SystemClock.uptimeMillis() - this.n;
            this.f47565e = uptimeMillis;
            this.o = uptimeMillis;
            invalidateSelf();
        }
    }

    public final void a(com.facebook.fresco.animation.a.a aVar) {
        this.f47564d = aVar;
        if (aVar != null) {
            this.f47570l = new com.facebook.fresco.animation.d.d(this.f47564d);
            this.f47564d.a(getBounds());
            d dVar = this.s;
            if (dVar != null) {
                dVar.a(this);
            }
        }
        this.f47570l = a(this.f47564d, null);
        stop();
    }

    public void draw(Canvas canvas) {
        long max;
        if (this.f47564d != null && this.f47570l != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.f47571m) {
                max = (uptimeMillis - this.f47565e) + this.f47567g;
            } else {
                max = Math.max(this.n, 0L);
            }
            int a2 = this.f47570l.a(max, this.n);
            if (a2 == -1) {
                a2 = this.f47564d.e() - 1;
                this.r.b(this);
                this.f47571m = false;
            } else if (a2 == 0 && this.p != -1 && uptimeMillis >= this.o) {
                this.r.c(this);
            }
            if (this.f47564d.a(this, canvas, a2)) {
                this.r.a(this, a2);
                this.p = a2;
            } else {
                this.q++;
                if (com.facebook.common.e.a.a(2)) {
                    com.facebook.common.e.a.a(f47560j, "Dropped a frame. Count: %s", Integer.valueOf(this.q));
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (this.f47571m) {
                long a3 = this.f47570l.a(uptimeMillis2 - this.f47565e);
                if (a3 != -1) {
                    long j2 = this.f47565e + a3 + this.f47566f;
                    this.o = j2;
                    scheduleSelf(this.f47569i, j2);
                }
            }
            AbstractC1176a aVar = this.f47568h;
            this.n = max;
        }
    }

    public a(com.facebook.fresco.animation.a.a aVar, Object obj) {
        this.f47562a = -1000;
        this.f47566f = 8;
        this.r = f47561k;
        this.f47569i = new Runnable() {
            /* class com.facebook.fresco.animation.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28843);
            }

            public final void run() {
                a aVar = a.this;
                aVar.unscheduleSelf(aVar.f47569i);
                a.this.invalidateSelf();
            }
        };
        this.f47564d = aVar;
        this.f47570l = a(aVar, obj);
    }

    private static b a(com.facebook.fresco.animation.a.a aVar, Object obj) {
        b a2;
        if (aVar == null) {
            return null;
        }
        c cVar = f47559c;
        if (cVar == null || (a2 = cVar.a(aVar, obj)) == null) {
            return new com.facebook.fresco.animation.d.d(aVar);
        }
        return a2;
    }
}
