package com.bytedance.globalpayment.payment.common.lib;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    static {
        Covode.recordClassIndex(17705);
    }

    public void add(JSONObject jSONObject, String str, float f2) {
        try {
            jSONObject.put(str, (double) f2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void add(JSONObject jSONObject, String str, long j2) {
        try {
            jSONObject.put(str, j2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void add(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void add(JSONObject jSONObject, String str, boolean z) {
        try {
            jSONObject.put(str, z);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
