package com.ss.android.ugc.aweme.aabplugin.core.base.a;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import h.f.b.l;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f62475a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(38442);
    }

    public static void a(n nVar) {
        l.d(nVar, "");
        try {
            b.a("df_install_start", new JSONObject(nVar.c()), (JSONObject) null, (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    public static void a(n nVar, int i2) {
        l.d(nVar, "");
        long currentTimeMillis = System.currentTimeMillis() - nVar.f62516j;
        try {
            JSONObject jSONObject = new JSONObject(nVar.c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("reason", i2);
            jSONObject2.put("duration", currentTimeMillis);
            b.a("df_install_failed", jSONObject, jSONObject2, (JSONObject) null);
        } catch (Exception unused) {
        }
    }
}
