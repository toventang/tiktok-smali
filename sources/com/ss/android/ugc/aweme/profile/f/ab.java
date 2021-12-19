package com.ss.android.ugc.aweme.profile.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class ab {

    /* renamed from: d  reason: collision with root package name */
    public static final a f116385d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ah f116386a;

    /* renamed from: b  reason: collision with root package name */
    public final String f116387b;

    /* renamed from: c  reason: collision with root package name */
    public final aa f116388c;

    static {
        Covode.recordClassIndex(75141);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75142);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final long e() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            return ahVar.d();
        }
        return -1;
    }

    private final long f() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            return ahVar.a();
        }
        return -1;
    }

    private final long g() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            return ahVar.b();
        }
        return -1;
    }

    private final long h() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            return ahVar.c();
        }
        return -1;
    }

    private final long i() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            return System.currentTimeMillis() - ahVar.f116398c;
        }
        return -1;
    }

    public final void b() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            ahVar.f116400e = System.currentTimeMillis();
        }
    }

    public final void a() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            ahVar.f116399d = System.currentTimeMillis();
        }
        ah ahVar2 = this.f116386a;
        if (ahVar2 != null) {
            ahVar2.f116402g = true;
        }
    }

    public final void c() {
        ah ahVar = this.f116386a;
        if (ahVar != null) {
            ahVar.f116400e = System.currentTimeMillis();
        }
        aa aaVar = this.f116388c;
        ah ahVar2 = this.f116386a;
        if (ahVar2 != null) {
            ahVar2.d();
        }
        aaVar.a(false);
        this.f116386a = null;
    }

    public final void d() {
        ah ahVar;
        ah ahVar2;
        ah ahVar3 = this.f116386a;
        if (ahVar3 != null) {
            ahVar3.f116401f = System.currentTimeMillis();
        }
        ah ahVar4 = this.f116386a;
        if (ahVar4 != null && ahVar4.b() >= 0 && (ahVar = this.f116386a) != null && ahVar.a() >= 0 && (ahVar2 = this.f116386a) != null && ahVar2.c() >= 0) {
            aa aaVar = this.f116388c;
            ah ahVar5 = this.f116386a;
            if (ahVar5 != null) {
                ahVar5.d();
            }
            aaVar.a(true);
            this.f116386a = null;
        }
    }

    public ab(ah ahVar, String str, aa aaVar) {
        l.d(aaVar, "");
        this.f116386a = ahVar;
        this.f116387b = str;
        this.f116388c = aaVar;
    }

    public final void a(String str, int i2, boolean z) {
        long i3;
        long j2;
        l.d(str, "");
        ah ahVar = this.f116386a;
        if (ahVar != null && ahVar.f116402g) {
            ah ahVar2 = this.f116386a;
            if (ahVar2 != null) {
                ahVar2.f116402g = false;
            }
            d a2 = new d().a("page_type", str).a("result", i2).a("enter_from", this.f116387b);
            if (!z) {
                i3 = e();
            } else {
                i3 = i();
            }
            d a3 = a2.a("duration", i3).a("duration_before_network", f());
            long j3 = -1;
            if (!z) {
                j2 = g();
            } else {
                j2 = -1;
            }
            d a4 = a3.a("duration_network", j2);
            if (!z) {
                j3 = h();
            }
            r.a("page_load_time", a4.a("duration_after_network", j3).f66730a);
        }
    }
}
