package com.ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONException;
import org.json.JSONObject;

public final class ai {
    static {
        Covode.recordClassIndex(74786);
    }

    public static void a(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", exc.toString());
            jSONObject.put("success", 1);
            jSONObject.put("errorResponse", jSONObject2.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        n.a("aweme_profile_recyclerview_crash_log", jSONObject);
    }
}
