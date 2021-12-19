package com.bytedance.bpea.core.checker.a;

import com.bytedance.bpea.basics.f;
import com.bytedance.bpea.basics.h;
import com.bytedance.bpea.core.d.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f26656c;

    static {
        Covode.recordClassIndex(15695);
    }

    public e() {
        super(c.CONFIG);
    }

    @Override // com.bytedance.bpea.core.checker.a.a
    public final void a(JSONObject jSONObject) {
        this.f26656c = jSONObject;
    }

    @Override // com.bytedance.bpea.core.checker.a.b
    public final h a(f fVar) {
        l.c(fVar, "");
        return a.C0566a.a(this.f26656c);
    }
}
