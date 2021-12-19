package com.ss.android.ugc.aweme.autoplay.player.live;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import h.f.a.a;
import h.f.b.l;

public final class i implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public d f67538a;

    /* renamed from: b  reason: collision with root package name */
    public b.c f67539b;

    static {
        Covode.recordClassIndex(41577);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void i() {
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void e() {
        b.c cVar = this.f67539b;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void f() {
        b.c cVar = this.f67539b;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void g() {
        b.c cVar = this.f67539b;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final boolean h() {
        b.c cVar = this.f67539b;
        if (cVar != null) {
            return cVar.h();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.c
    public final void a(long j2) {
        b.c cVar = this.f67539b;
        if (cVar != null) {
            cVar.a(j2);
        }
    }

    public final void a(a<d> aVar) {
        l.d(aVar, "");
        d invoke = aVar.invoke();
        this.f67538a = invoke;
        this.f67539b = new j(this.f67538a, invoke.getDataProvider());
    }
}
