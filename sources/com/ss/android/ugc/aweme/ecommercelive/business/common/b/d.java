package com.ss.android.ugc.aweme.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(55312);
    }

    public static final void a(String str, String str2, String str3, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("image_url", str3);
            jSONObject.put("message_id", str4);
            jSONObject.put("from", str5);
            r.a("rd_tiktokec_pin_image_show_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void a(String str, String str2, String str3, boolean z, long j2) {
        int i2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("schema", str3);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_success", i2);
            jSONObject.put("show_cost", j2);
            r.a("rd_tiktokec_pin_card_lynx_load_result", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void a(String str, String str2, String str3, String str4, String str5, Long l2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("image_url", str3);
            jSONObject.put("message_id", str4);
            jSONObject.put("from", str5);
            jSONObject.put("show_cost", l2);
            r.a("rd_tiktokec_pin_image_show", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void a(String str, String str2, boolean z, long j2, int i2, String str3) {
        int i3;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_success", i3);
            jSONObject.put("anchor_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("cost", j2);
            jSONObject.put("error_msg", str3);
            jSONObject.put("ec_code", String.valueOf(i2));
            r.a("rd_tiktokec_get_introduce_products", jSONObject);
        } catch (Exception unused) {
        }
    }

    public static final void a(String str, String str2, String str3, long j2, long j3, long j4, long j5, long j6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", str);
            jSONObject.put("room_id", str2);
            jSONObject.put("message_id", str3);
            jSONObject.put("total_duration", j2);
            jSONObject.put("introduce_duration", j3);
            jSONObject.put("introduce_server_duration", j4);
            jSONObject.put("live_msg_duration", j5);
            jSONObject.put("client_show_pin_duration", j6);
            r.a("rd_tiktokec_pin_duration", jSONObject);
        } catch (Exception unused) {
        }
    }
}
