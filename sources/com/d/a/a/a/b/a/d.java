package com.d.a.a.a.b.a;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.e.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f46328a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Float f46329b = null;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f46330c = true;

    /* renamed from: d  reason: collision with root package name */
    public final c f46331d;

    static {
        Covode.recordClassIndex(28298);
    }

    private d(c cVar) {
        this.f46331d = cVar;
    }

    public static d a(c cVar) {
        com.d.a.a.a.e.d.a(cVar, "Position is null");
        return new d(cVar);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f46328a);
            if (this.f46328a) {
                jSONObject.put("skipOffset", this.f46329b);
            }
            jSONObject.put("autoPlay", this.f46330c);
            jSONObject.put("position", this.f46331d);
        } catch (JSONException unused) {
            c.b("VastProperties: JSON error");
        }
        return jSONObject;
    }
}
