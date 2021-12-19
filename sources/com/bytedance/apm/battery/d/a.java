package com.bytedance.apm.battery.d;

import com.bytedance.apm.battery.c.a;
import com.bytedance.apm.battery.d.a.b;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;

public abstract class a<T extends b> extends c<T> {

    /* renamed from: e  reason: collision with root package name */
    private volatile int f24507e;

    /* renamed from: f  reason: collision with root package name */
    private long f24508f;

    /* renamed from: g  reason: collision with root package name */
    private int f24509g;

    /* renamed from: h  reason: collision with root package name */
    private long f24510h;

    static {
        Covode.recordClassIndex(14440);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(double d2, double d3);

    /* access modifiers changed from: protected */
    public abstract void a(T t, long j2);

    @Override // com.bytedance.apm.battery.d.g, com.bytedance.apm.battery.d.c
    public final void b() {
        if (this.f24507e > 0 && this.f24510h > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            a(currentTimeMillis - this.f24510h, this.f24530c);
            this.f24510h = currentTimeMillis;
        }
        super.b();
    }

    @Override // com.bytedance.apm.battery.d.g, com.bytedance.apm.battery.d.c
    public final void c() {
        if (this.f24507e > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            a(currentTimeMillis - this.f24510h, this.f24530c);
            this.f24510h = currentTimeMillis;
        }
        super.c();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        this.f24507e++;
        if (this.f24507e == 1) {
            this.f24510h = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void e() {
        this.f24507e--;
        if (this.f24507e == 0) {
            a(System.currentTimeMillis() - this.f24510h, this.f24530c);
            this.f24510h = -1;
        }
    }

    a(String str) {
        super(str);
    }

    private void a(final long j2, final boolean z) {
        b.a.f25210a.a(new Runnable() {
            /* class com.bytedance.apm.battery.d.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14441);
            }

            public final void run() {
                a.C0525a.f24485a.a(new com.bytedance.apm.e.a(z, System.currentTimeMillis(), a.this.f24528a, j2));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.d.c
    public final void a(long j2, long j3) {
        this.f24509g = 0;
        this.f24508f = 0;
        if (this.f24507e > 0 && this.f24510h > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            a(currentTimeMillis - this.f24510h, this.f24530c);
            this.f24510h = currentTimeMillis;
        }
        super.a(j2, j3);
        long currentTimeMillis2 = System.currentTimeMillis();
        double d2 = (double) this.f24508f;
        double d3 = (double) (currentTimeMillis2 - this.f24529b);
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = (double) this.f24509g;
        double d5 = (double) (currentTimeMillis2 - this.f24529b);
        Double.isNaN(d4);
        Double.isNaN(d5);
        a((d2 / d3) * 60000.0d * 10.0d, (d4 / d5) * 60000.0d * 10.0d);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.d.c
    public final void a(T t, long j2, long j3) {
        this.f24509g++;
        long j4 = t.f24517d;
        if (j4 >= j2) {
            j2 = j4;
        }
        long j5 = t.f24518e;
        if (j5 > 0 && j3 >= j5) {
            j3 = j5;
        }
        a(t, j3 - t.f24517d);
        long j6 = j3 - j2;
        if (j6 > 0) {
            this.f24508f += j6;
        }
    }
}
