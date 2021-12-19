package com.d.a.a.a.h;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.h.a.b;
import com.d.a.a.a.h.a.d;
import org.json.JSONObject;

public final class c implements b.AbstractC1155b {

    /* renamed from: a  reason: collision with root package name */
    final com.d.a.a.a.h.a.c f46448a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f46449b;

    static {
        Covode.recordClassIndex(28352);
    }

    public c(com.d.a.a.a.h.a.c cVar) {
        this.f46448a = cVar;
    }

    @Override // com.d.a.a.a.h.a.b.AbstractC1155b
    public final JSONObject a() {
        return this.f46449b;
    }

    @Override // com.d.a.a.a.h.a.b.AbstractC1155b
    public final void a(JSONObject jSONObject) {
        this.f46449b = jSONObject;
    }

    public final void b() {
        this.f46448a.a(new d(this));
    }
}
