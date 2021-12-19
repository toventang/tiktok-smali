package com.bytedance.bdturing.e;

import android.os.Looper;
import com.bytedance.bdturing.d.a;
import com.bytedance.bdturing.g;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a f26467a;

    static {
        Covode.recordClassIndex(15559);
    }

    @Override // com.bytedance.bdturing.e.a
    public final a a() {
        return this.f26467a.a();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String b() {
        return this.f26467a.b();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String c() {
        return this.f26467a.c();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String d() {
        return this.f26467a.d();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String e() {
        return this.f26467a.e();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String f() {
        return this.f26467a.f();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String g() {
        return this.f26467a.g();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String h() {
        return this.f26467a.h();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String i() {
        return this.f26467a.i();
    }

    @Override // com.bytedance.bdturing.e.a
    public final Looper k() {
        return this.f26467a.k();
    }

    @Override // com.bytedance.bdturing.e.a
    public final String j() {
        String j2 = this.f26467a.j();
        if (l.a((Object) j2, (Object) e.CN.getValue()) || l.a((Object) j2, (Object) e.SINGAPOER.getValue()) || l.a((Object) j2, (Object) e.USA_EAST.getValue()) || l.a((Object) j2, (Object) e.INDIA.getValue()) || l.a((Object) j2, (Object) e.BOE.getValue()) || !g.a()) {
            return j2;
        }
        throw new RuntimeException("not support this region");
    }

    public b(a aVar) {
        l.c(aVar, "");
        this.f26467a = aVar;
    }
}
