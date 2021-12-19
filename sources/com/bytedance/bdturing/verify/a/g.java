package com.bytedance.bdturing.verify.a;

import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g extends a {
    static {
        Covode.recordClassIndex(15620);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 10;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final String c() {
        return "twice_verify";
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int d() {
        return 6000;
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final void a(StringBuilder sb) {
        l.c(sb, "");
        b.a(sb, "decision_config", "block-info_verify");
        b.a(sb, "use_turing_bridge", 1);
    }
}
