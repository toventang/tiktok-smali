package com.bytedance.globalpayment.iap.common.ability.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.j.c;
import com.ss.android.ugc.aweme.bf.d;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30334a = a.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences f30335b;

    static {
        Covode.recordClassIndex(17595);
    }

    public static SharedPreferences a(Context context) {
        if (f30335b == null) {
            f30335b = d.a(context, "payload_prefs", 0);
        }
        return f30335b;
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.decode(str, 0));
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new String(Base64.encode(str.getBytes(), 0));
    }

    public static Pair<String, Pair<String, String>> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Pair.create("", Pair.create("", ""));
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return Pair.create(jSONObject.optString("userId"), Pair.create(jSONObject.optString("orderId"), jSONObject.optString("merchantId")));
        } catch (JSONException e2) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            e2.getLocalizedMessage();
            return Pair.create("", Pair.create("", ""));
        }
    }

    public static JSONObject a(String str) {
        SharedPreferences a2 = a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b());
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        String string = a2.getString(c.a("key_google_pay_".concat(String.valueOf(str))), "");
        if (string == null) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            String optString = jSONObject.optString(c.a("order_id"));
            String optString2 = jSONObject.optString(c.a("merchant_id"));
            String optString3 = jSONObject.optString(c.a("user_id"));
            String optString4 = jSONObject.optString(c.a("extra_payload"));
            String c2 = c(optString);
            String c3 = c(optString2);
            String c4 = c(optString3);
            String c5 = c(optString4);
            jSONObject.put("order_id", c2);
            jSONObject.put("merchant_id", c3);
            jSONObject.put("user_id", c4);
            jSONObject.put("extra_payload", c5);
            return jSONObject;
        } catch (JSONException unused) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            return null;
        }
    }

    public static void a(Context context, String str) {
        a(context).edit().remove(c.a(str)).apply();
    }

    public static String a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(c.a("order_id"), d(str));
            jSONObject.put(c.a("merchant_id"), d(str2));
            jSONObject.put(c.a("user_id"), d(str3));
            jSONObject.put(c.a("extra_payload"), d(str4));
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String a(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sku_id", str);
            jSONObject.put("merchant_id", str2);
            jSONObject.put("user_id", str3);
            jSONObject.put("is_subscription", z);
            jSONObject.put("is_new_subscription", z2);
            jSONObject.put("extra_payload", str4);
            return jSONObject.toString();
        } catch (JSONException e2) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
            e2.getLocalizedMessage();
            return null;
        }
    }
}
