package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(66982);
    }

    public static final void a(String str, boolean z, long j2, String str2, f fVar, int i2, String str3) {
        int i3;
        l.d(fVar, "");
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_success", i3);
            jSONObject.put("live_role", fVar.getRoleStr());
            if (str == null) {
                str = "not valid";
            }
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("cost", j2);
            jSONObject.put("error_msg", str3);
            jSONObject.put("ec_code", String.valueOf(i2));
            r.a("rd_tiktokec_get_products_count", jSONObject);
        } catch (Exception unused) {
        }
    }
}
