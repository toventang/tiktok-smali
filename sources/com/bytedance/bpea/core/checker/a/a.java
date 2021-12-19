package com.bytedance.bpea.core.checker.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    JSONObject f26651a;

    /* renamed from: b  reason: collision with root package name */
    public final c f26652b;

    static {
        Covode.recordClassIndex(15691);
    }

    public abstract void a(JSONObject jSONObject);

    public String toString() {
        return getClass().getSimpleName() + ' ' + this.f26651a;
    }

    public a(c cVar) {
        l.c(cVar, "");
        this.f26652b = cVar;
    }
}
