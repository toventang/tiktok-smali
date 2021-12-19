package com.bytedance.bpea.core.checker.a;

import com.bytedance.bpea.basics.a;
import com.bytedance.bpea.basics.f;
import com.bytedance.bpea.basics.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class g extends a {
    static {
        Covode.recordClassIndex(15697);
    }

    @Override // com.bytedance.bpea.core.checker.a.a
    public final void a(JSONObject jSONObject) {
    }

    public g() {
        super(c.INVALID);
    }

    @Override // com.bytedance.bpea.core.checker.a.b
    public final h a(f fVar) {
        l.c(fVar, "");
        throw new a(-2000, "direct downgrade");
    }
}
