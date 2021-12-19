package com.bytedance.push.frontier.setting;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    static {
        Covode.recordClassIndex(25761);
    }

    public static a a(String str) {
        a aVar = new a();
        try {
            aVar = a.a(new JSONObject(str));
            return aVar;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return aVar;
        }
    }
}
