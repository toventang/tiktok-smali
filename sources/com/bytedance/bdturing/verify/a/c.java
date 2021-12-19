package com.bytedance.bdturing.verify.a;

import com.bytedance.bdturing.f.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c extends a {
    static {
        Covode.recordClassIndex(15616);
    }

    @Override // com.bytedance.bdturing.verify.a.a
    public final int b() {
        return 9;
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
        b.a(sb, "decision_config", "block-face");
        b.a(sb, "use_turing_bridge", 1);
    }
}
