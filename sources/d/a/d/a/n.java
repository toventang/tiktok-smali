package d.a.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n extends g {

    /* renamed from: b  reason: collision with root package name */
    public long f156637b;

    /* renamed from: c  reason: collision with root package name */
    public final g f156638c;

    static {
        Covode.recordClassIndex(104001);
    }

    @Override // d.a.d.a.k, d.a.d.a.g
    public final void a() {
        this.f156638c.a();
    }

    @Override // d.a.d.a.g
    public final void c() {
        this.f156638c.c();
    }

    public n(g gVar) {
        l.c(gVar, "");
        this.f156638c = gVar;
    }

    @Override // d.a.d.a.g
    public final void a(byte[] bArr, int i2, int i3) {
        l.c(bArr, "");
        this.f156638c.a(bArr, i2, i3);
        this.f156637b += (long) i3;
    }
}
