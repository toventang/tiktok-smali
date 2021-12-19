package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class fr implements ij {

    /* renamed from: a  reason: collision with root package name */
    private final fq f50870a;

    /* renamed from: b  reason: collision with root package name */
    private int f50871b;

    /* renamed from: c  reason: collision with root package name */
    private int f50872c;

    /* renamed from: d  reason: collision with root package name */
    private int f50873d;

    static {
        Covode.recordClassIndex(31795);
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int b() {
        return this.f50871b;
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final float e() {
        a(5);
        return this.f50870a.c();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final long f() {
        a(0);
        return this.f50870a.d();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final long g() {
        a(0);
        return this.f50870a.e();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int h() {
        a(0);
        return this.f50870a.f();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final long i() {
        a(1);
        return this.f50870a.g();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int j() {
        a(5);
        return this.f50870a.h();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final boolean k() {
        a(0);
        return this.f50870a.i();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final String l() {
        a(2);
        return this.f50870a.j();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final String m() {
        a(2);
        return this.f50870a.k();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final fe n() {
        a(2);
        return this.f50870a.l();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int o() {
        a(0);
        return this.f50870a.m();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int p() {
        a(0);
        return this.f50870a.n();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int q() {
        a(5);
        return this.f50870a.o();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final long r() {
        a(1);
        return this.f50870a.p();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int s() {
        a(0);
        return this.f50870a.q();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final long t() {
        a(0);
        return this.f50870a.r();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final boolean c() {
        int i2;
        if (this.f50870a.t() || (i2 = this.f50871b) == this.f50872c) {
            return false;
        }
        return this.f50870a.b(i2);
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final double d() {
        a(1);
        return this.f50870a.b();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final int a() {
        int i2 = this.f50873d;
        if (i2 != 0) {
            this.f50871b = i2;
            this.f50873d = 0;
        } else {
            this.f50871b = this.f50870a.a();
        }
        int i3 = this.f50871b;
        if (i3 == 0 || i3 == this.f50872c) {
            return Integer.MAX_VALUE;
        }
        return i3 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void i(List<String> list) {
        a(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void j(List<String> list) {
        a(list, true);
    }

    fr(fq fqVar) {
        fq fqVar2 = (fq) gp.a((Object) fqVar, "input");
        this.f50870a = fqVar2;
        fqVar2.f50868c = this;
    }

    private final void a(int i2) {
        if ((this.f50871b & 7) != i2) {
            throw gu.f();
        }
    }

    private static void b(int i2) {
        if ((i2 & 7) != 0) {
            throw gu.g();
        }
    }

    private static void c(int i2) {
        if ((i2 & 3) != 0) {
            throw gu.g();
        }
    }

    private final void d(int i2) {
        if (this.f50870a.u() != i2) {
            throw gu.a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void k(List<fe> list) {
        int a2;
        if ((this.f50871b & 7) == 2) {
            do {
                list.add(n());
                if (!this.f50870a.t()) {
                    a2 = this.f50870a.a();
                } else {
                    return;
                }
            } while (a2 == this.f50871b);
            this.f50873d = a2;
            return;
        }
        throw gu.f();
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void b(List<Float> list) {
        int a2;
        int a3;
        if (list instanceof gh) {
            gh ghVar = (gh) list;
            int i2 = this.f50871b & 7;
            if (i2 == 2) {
                int m2 = this.f50870a.m();
                c(m2);
                int u = this.f50870a.u() + m2;
                do {
                    ghVar.a(this.f50870a.c());
                } while (this.f50870a.u() < u);
            } else if (i2 == 5) {
                do {
                    ghVar.a(this.f50870a.c());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 2) {
                int m3 = this.f50870a.m();
                c(m3);
                int u2 = this.f50870a.u() + m3;
                do {
                    list.add(Float.valueOf(this.f50870a.c()));
                } while (this.f50870a.u() < u2);
            } else if (i3 == 5) {
                do {
                    list.add(Float.valueOf(this.f50870a.c()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void c(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    hgVar.a(this.f50870a.d());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    hgVar.a(this.f50870a.d());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f50870a.d()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Long.valueOf(this.f50870a.d()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void d(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    hgVar.a(this.f50870a.e());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    hgVar.a(this.f50870a.e());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f50870a.e()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Long.valueOf(this.f50870a.e()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void e(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    gnVar.d(this.f50870a.f());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    gnVar.d(this.f50870a.f());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f50870a.f()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Integer.valueOf(this.f50870a.f()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void f(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            int i2 = this.f50871b & 7;
            if (i2 == 1) {
                do {
                    hgVar.a(this.f50870a.g());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int m2 = this.f50870a.m();
                b(m2);
                int u = this.f50870a.u() + m2;
                do {
                    hgVar.a(this.f50870a.g());
                } while (this.f50870a.u() < u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.f50870a.g()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int m3 = this.f50870a.m();
                b(m3);
                int u2 = this.f50870a.u() + m3;
                do {
                    list.add(Long.valueOf(this.f50870a.g()));
                } while (this.f50870a.u() < u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void g(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            int i2 = this.f50871b & 7;
            if (i2 == 2) {
                int m2 = this.f50870a.m();
                c(m2);
                int u = this.f50870a.u() + m2;
                do {
                    gnVar.d(this.f50870a.h());
                } while (this.f50870a.u() < u);
            } else if (i2 == 5) {
                do {
                    gnVar.d(this.f50870a.h());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 2) {
                int m3 = this.f50870a.m();
                c(m3);
                int u2 = this.f50870a.u() + m3;
                do {
                    list.add(Integer.valueOf(this.f50870a.h()));
                } while (this.f50870a.u() < u2);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f50870a.h()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void h(List<Boolean> list) {
        int a2;
        int a3;
        if (list instanceof fc) {
            fc fcVar = (fc) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    fcVar.a(this.f50870a.i());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    fcVar.a(this.f50870a.i());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f50870a.i()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Boolean.valueOf(this.f50870a.i()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void l(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    gnVar.d(this.f50870a.m());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    gnVar.d(this.f50870a.m());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f50870a.m()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Integer.valueOf(this.f50870a.m()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void m(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    gnVar.d(this.f50870a.n());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    gnVar.d(this.f50870a.n());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f50870a.n()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Integer.valueOf(this.f50870a.n()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void n(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            int i2 = this.f50871b & 7;
            if (i2 == 2) {
                int m2 = this.f50870a.m();
                c(m2);
                int u = this.f50870a.u() + m2;
                do {
                    gnVar.d(this.f50870a.o());
                } while (this.f50870a.u() < u);
            } else if (i2 == 5) {
                do {
                    gnVar.d(this.f50870a.o());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 2) {
                int m3 = this.f50870a.m();
                c(m3);
                int u2 = this.f50870a.u() + m3;
                do {
                    list.add(Integer.valueOf(this.f50870a.o()));
                } while (this.f50870a.u() < u2);
            } else if (i3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f50870a.o()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void o(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            int i2 = this.f50871b & 7;
            if (i2 == 1) {
                do {
                    hgVar.a(this.f50870a.p());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int m2 = this.f50870a.m();
                b(m2);
                int u = this.f50870a.u() + m2;
                do {
                    hgVar.a(this.f50870a.p());
                } while (this.f50870a.u() < u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 1) {
                do {
                    list.add(Long.valueOf(this.f50870a.p()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int m3 = this.f50870a.m();
                b(m3);
                int u2 = this.f50870a.u() + m3;
                do {
                    list.add(Long.valueOf(this.f50870a.p()));
                } while (this.f50870a.u() < u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void p(List<Integer> list) {
        int a2;
        int a3;
        if (list instanceof gn) {
            gn gnVar = (gn) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    gnVar.d(this.f50870a.q());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    gnVar.d(this.f50870a.q());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f50870a.q()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Integer.valueOf(this.f50870a.q()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void q(List<Long> list) {
        int a2;
        int a3;
        if (list instanceof hg) {
            hg hgVar = (hg) list;
            int i2 = this.f50871b & 7;
            if (i2 == 0) {
                do {
                    hgVar.a(this.f50870a.r());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int u = this.f50870a.u() + this.f50870a.m();
                do {
                    hgVar.a(this.f50870a.r());
                } while (this.f50870a.u() < u);
                d(u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 0) {
                do {
                    list.add(Long.valueOf(this.f50870a.r()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int u2 = this.f50870a.u() + this.f50870a.m();
                do {
                    list.add(Long.valueOf(this.f50870a.r()));
                } while (this.f50870a.u() < u2);
                d(u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final void a(List<Double> list) {
        int a2;
        int a3;
        if (list instanceof fx) {
            fx fxVar = (fx) list;
            int i2 = this.f50871b & 7;
            if (i2 == 1) {
                do {
                    fxVar.a(this.f50870a.b());
                    if (!this.f50870a.t()) {
                        a3 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f50871b);
                this.f50873d = a3;
            } else if (i2 == 2) {
                int m2 = this.f50870a.m();
                b(m2);
                int u = this.f50870a.u() + m2;
                do {
                    fxVar.a(this.f50870a.b());
                } while (this.f50870a.u() < u);
            } else {
                throw gu.f();
            }
        } else {
            int i3 = this.f50871b & 7;
            if (i3 == 1) {
                do {
                    list.add(Double.valueOf(this.f50870a.b()));
                    if (!this.f50870a.t()) {
                        a2 = this.f50870a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f50871b);
                this.f50873d = a2;
            } else if (i3 == 2) {
                int m3 = this.f50870a.m();
                b(m3);
                int u2 = this.f50870a.u() + m3;
                do {
                    list.add(Double.valueOf(this.f50870a.b()));
                } while (this.f50870a.u() < u2);
            } else {
                throw gu.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final <T> T a(in<T> inVar, fy fyVar) {
        a(2);
        return (T) c(inVar, fyVar);
    }

    @Override // com.google.android.gms.internal.measurement.ij
    public final <T> T b(in<T> inVar, fy fyVar) {
        a(3);
        return (T) d(inVar, fyVar);
    }

    private final <T> T d(in<T> inVar, fy fyVar) {
        int i2 = this.f50872c;
        this.f50872c = ((this.f50871b >>> 3) << 3) | 4;
        try {
            T a2 = inVar.a();
            inVar.a(a2, this, fyVar);
            inVar.c(a2);
            if (this.f50871b == this.f50872c) {
                return a2;
            }
            throw gu.g();
        } finally {
            this.f50872c = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.List<java.lang.String> r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.f50871b
            r1 = r0 & 7
            r0 = 2
            if (r1 != r0) goto L_0x0050
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.he
            if (r0 == 0) goto L_0x002c
            if (r4 != 0) goto L_0x002e
            com.google.android.gms.internal.measurement.he r3 = (com.google.android.gms.internal.measurement.he) r3
        L_0x000f:
            com.google.android.gms.internal.measurement.fe r0 = r2.n()
            r3.a(r0)
            com.google.android.gms.internal.measurement.fq r0 = r2.f50870a
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x001f
            return
        L_0x001f:
            com.google.android.gms.internal.measurement.fq r0 = r2.f50870a
            int r1 = r0.a()
            int r0 = r2.f50871b
            if (r1 == r0) goto L_0x000f
            r2.f50873d = r1
            return
        L_0x002c:
            if (r4 == 0) goto L_0x004b
        L_0x002e:
            java.lang.String r0 = r2.m()
        L_0x0032:
            r3.add(r0)
            com.google.android.gms.internal.measurement.fq r0 = r2.f50870a
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x003e
            return
        L_0x003e:
            com.google.android.gms.internal.measurement.fq r0 = r2.f50870a
            int r1 = r0.a()
            int r0 = r2.f50871b
            if (r1 == r0) goto L_0x002c
            r2.f50873d = r1
            return
        L_0x004b:
            java.lang.String r0 = r2.l()
            goto L_0x0032
        L_0x0050:
            com.google.android.gms.internal.measurement.gx r0 = com.google.android.gms.internal.measurement.gu.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.fr.a(java.util.List, boolean):void");
    }

    private final <T> T c(in<T> inVar, fy fyVar) {
        int m2 = this.f50870a.m();
        if (this.f50870a.f50866a < this.f50870a.f50867b) {
            int c2 = this.f50870a.c(m2);
            T a2 = inVar.a();
            this.f50870a.f50866a++;
            inVar.a(a2, this, fyVar);
            inVar.c(a2);
            this.f50870a.a(0);
            fq fqVar = this.f50870a;
            fqVar.f50866a--;
            this.f50870a.d(c2);
            return a2;
        }
        throw new gu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.ij
    public final <T> void b(List<T> list, in<T> inVar, fy fyVar) {
        int a2;
        int i2 = this.f50871b;
        if ((i2 & 7) == 3) {
            do {
                list.add(d(inVar, fyVar));
                if (!this.f50870a.t() && this.f50873d == 0) {
                    a2 = this.f50870a.a();
                } else {
                    return;
                }
            } while (a2 == i2);
            this.f50873d = a2;
            return;
        }
        throw gu.f();
    }

    private final Object a(jr jrVar, Class<?> cls, fy fyVar) {
        switch (fu.f50889a[jrVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(k());
            case 2:
                return n();
            case 3:
                return Double.valueOf(d());
            case 4:
                return Integer.valueOf(p());
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return Integer.valueOf(j());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return Long.valueOf(i());
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return Float.valueOf(e());
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return Integer.valueOf(h());
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return Long.valueOf(g());
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                a(2);
                return c(ii.f51018a.a((Class) cls), fyVar);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return Integer.valueOf(q());
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return Long.valueOf(r());
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return Integer.valueOf(s());
            case ABRConfig.ABR_SELECT_SCENE:
                return Long.valueOf(t());
            case 15:
                return m();
            case 16:
                return Integer.valueOf(o());
            case 17:
                return Long.valueOf(f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.ij
    public final <T> void a(List<T> list, in<T> inVar, fy fyVar) {
        int a2;
        int i2 = this.f50871b;
        if ((i2 & 7) == 2) {
            do {
                list.add(c(inVar, fyVar));
                if (!this.f50870a.t() && this.f50873d == 0) {
                    a2 = this.f50870a.a();
                } else {
                    return;
                }
            } while (a2 == i2);
            this.f50873d = a2;
            return;
        }
        throw gu.f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.ij
    public final <K, V> void a(Map<K, V> map, ho<K, V> hoVar, fy fyVar) {
        a(2);
        int c2 = this.f50870a.c(this.f50870a.m());
        Object obj = hoVar.f50985b;
        Object obj2 = hoVar.f50987d;
        while (true) {
            try {
                int a2 = a();
                if (a2 == Integer.MAX_VALUE || this.f50870a.t()) {
                    map.put(obj, obj2);
                } else if (a2 == 1) {
                    obj = a(hoVar.f50984a, (Class<?>) null, (fy) null);
                } else if (a2 != 2) {
                    try {
                        if (!c()) {
                            throw new gu("Unable to parse map entry.");
                        }
                    } catch (gx unused) {
                        if (!c()) {
                            throw new gu("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = a(hoVar.f50986c, hoVar.f50987d.getClass(), fyVar);
                }
            } finally {
                this.f50870a.d(c2);
            }
        }
        map.put(obj, obj2);
    }
}
