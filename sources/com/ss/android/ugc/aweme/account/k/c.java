package com.ss.android.ugc.aweme.account.k;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(38876);
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("log_pb");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    public static JSONObject a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", str)) {
                        jSONObject.put(str, new JSONObject(map.get(str)));
                    } else {
                        jSONObject.put(str, map.get(str));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }
}
