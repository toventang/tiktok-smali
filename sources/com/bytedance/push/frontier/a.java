package com.bytedance.push.frontier;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements com.bytedance.push.frontier.a.a {
    static {
        Covode.recordClassIndex(25748);
    }

    @Override // com.bytedance.push.frontier.a.a
    public final void a(long j2) {
        a(new JSONObject(), "status", 0);
        a(new JSONObject(), "time_consuming", j2);
    }

    private static void a(JSONObject jSONObject, String str, long j2) {
        try {
            jSONObject.put(str, j2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.push.frontier.a.a
    public final void a(int i2, String str, long j2) {
        a(new JSONObject(), "status", (long) i2);
        try {
            new JSONObject().put("log", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        a(new JSONObject(), "time_consuming", j2);
    }
}
