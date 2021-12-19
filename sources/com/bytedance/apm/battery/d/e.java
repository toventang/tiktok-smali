package com.bytedance.apm.battery.d;

import com.bytedance.apm.e.a;
import com.bytedance.apm.q.b;
import com.bytedance.covode.number.Covode;

public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    private long f24538c;

    static {
        Covode.recordClassIndex(14449);
    }

    public e() {
        super("cpu_active_time");
    }

    @Override // com.bytedance.apm.battery.d.b, com.bytedance.apm.battery.d.g
    public final void b() {
        a(this.f24523a);
        super.b();
    }

    @Override // com.bytedance.apm.battery.d.b, com.bytedance.apm.battery.d.g
    public final void c() {
        a(this.f24523a);
        super.c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.d.b
    public final void b(boolean z) {
        long d2 = b.d();
        long j2 = d2 - this.f24538c;
        if (j2 > 0) {
            a(z, j2);
            this.f24538c = d2;
        }
    }

    @Override // com.bytedance.apm.battery.d.g
    public final void a(com.bytedance.apm.battery.c.b bVar, a aVar) {
        if (aVar.f24905b) {
            double d2 = (double) aVar.f24910g;
            double g2 = (double) b.g();
            Double.isNaN(d2);
            Double.isNaN(g2);
            bVar.f24488c += (long) ((d2 / g2) * 1000.0d);
            return;
        }
        double d3 = (double) aVar.f24910g;
        double g3 = (double) b.g();
        Double.isNaN(d3);
        Double.isNaN(g3);
        bVar.f24493h += (long) ((d3 / g3) * 1000.0d);
    }
}
