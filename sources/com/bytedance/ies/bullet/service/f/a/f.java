package com.bytedance.ies.bullet.service.f.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.h;
import com.bytedance.ies.bullet.service.f.a.b.m;
import com.bytedance.ies.bullet.service.f.a.b.o;
import com.bytedance.ies.bullet.service.f.a.c.a;
import com.bytedance.ies.bullet.service.f.a.c.c;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.Collection;
import java.util.List;

public final class f extends b {
    public final d<String> Q = new a((byte) 0);
    public final d<String> R = new c((byte) 0);
    public d<String> S = new com.bytedance.ies.bullet.service.f.a.c.d((byte) 0);
    public final d<Boolean> T = new com.bytedance.ies.bullet.service.f.a.b.a("force_h5");
    public final d<Boolean> U = new com.bytedance.ies.bullet.service.f.a.b.a("dev");
    public final d<String> V = new m("rn_bundle_url", o.f32721f);
    public final h W = new h("dynamic", 0);
    public final d<String> X = new m("a_surl", o.f32721f);

    static {
        Covode.recordClassIndex(19571);
    }

    @Override // com.bytedance.ies.bullet.service.f.a.b.q, com.bytedance.ies.bullet.service.f.a.b, com.bytedance.ies.bullet.service.f.a.c
    public final List<d<?>> a() {
        return n.d((Collection) super.a(), (Iterable) n.b(this.Q, this.S, this.R, this.T, this.U, this.V, this.W, this.X));
    }

    public final boolean b() {
        String b2;
        if (!l.a((Object) this.U.b(), (Object) true) || (b2 = this.V.b()) == null || p.a((CharSequence) b2)) {
            return false;
        }
        return true;
    }
}
