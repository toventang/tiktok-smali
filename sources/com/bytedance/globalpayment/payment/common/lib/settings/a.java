package com.bytedance.globalpayment.payment.common.lib.settings;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    static {
        Covode.recordClassIndex(17761);
    }

    public static JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
