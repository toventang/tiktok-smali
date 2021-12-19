package com.ss.android.ugc.aweme.lego.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.e.d;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.n;
import com.ss.android.ugc.aweme.lego.w;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class m extends v {
    static {
        Covode.recordClassIndex(68702);
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v
    public final ae c() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.a.a.v, com.ss.android.ugc.e.a
    public final void a(List<? extends n> list) {
        l.d(list, "");
        super.a(list);
        for (n nVar : f.f107537b.a(ae.MAIN, list)) {
            d dVar = f.f107537b;
            Objects.requireNonNull(nVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
            dVar.b((w) nVar);
        }
    }
}
