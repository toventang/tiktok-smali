package com.ss.android.ugc.aweme.ay;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.lighten.a.c.o;
import com.ss.android.ugc.aweme.ay.a.a;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class n implements o {

    /* renamed from: a  reason: collision with root package name */
    static final o f67825a = new n();

    static {
        Covode.recordClassIndex(41747);
    }

    private n() {
    }

    @Override // com.bytedance.lighten.a.c.o
    public final void a(boolean z, JSONObject jSONObject) {
        int optInt;
        int optInt2;
        if (z || !(41 == (optInt2 = jSONObject.optInt("err_code")) || 40 == optInt2)) {
            j.f67820a.a(z, jSONObject);
        }
        if (!ApmDelegate.a.f25042a.a("image_monitor_v2")) {
            return;
        }
        if (z || !(41 == (optInt = jSONObject.optInt("err_code")) || 40 == optInt)) {
            a aVar = null;
            boolean z2 = true;
            try {
                aVar = (a) b.a().a(true, "image_crop_config_v3", a.class);
            } catch (Throwable unused) {
            }
            if (aVar == null) {
                z2 = false;
            }
            try {
                jSONObject.put("url_convert", z2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.ss.android.ugc.aweme.base.o.a("image_monitor_v2", jSONObject);
        }
    }
}
