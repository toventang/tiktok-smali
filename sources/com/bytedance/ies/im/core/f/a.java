package com.bytedance.ies.im.core.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.e.m;
import com.bytedance.im.core.c.c;
import h.f.b.l;
import org.json.JSONObject;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34131a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(20319);
    }

    @Override // com.bytedance.im.core.c.c
    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        m.a(str, jSONObject);
        com.bytedance.ies.im.core.api.a.b().b(str, jSONObject);
    }

    @Override // com.bytedance.im.core.c.c
    public final void a(String str, String str2, Throwable th) {
        l.d(str, "");
        l.d(str2, "");
        com.bytedance.ies.im.core.api.a.b().b(str, str2);
        if (th != null) {
            com.bytedance.ies.im.core.api.a.b().a(th);
        }
    }

    @Override // com.bytedance.im.core.c.c
    public final void b(String str, String str2, Throwable th) {
        l.d(str, "");
        l.d(str2, "");
        com.bytedance.ies.im.core.api.a.b().b(str, str2);
        if (th != null) {
            com.bytedance.ies.im.core.api.a.b().a(th);
        }
    }
}
