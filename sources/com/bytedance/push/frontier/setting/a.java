package com.bytedance.push.frontier.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f42156a;

    /* renamed from: b  reason: collision with root package name */
    public int f42157b;

    /* renamed from: c  reason: collision with root package name */
    public String f42158c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f42159d;

    static {
        Covode.recordClassIndex(25760);
    }

    public final boolean b() {
        List<String> list;
        if (this.f42156a == 0 || this.f42157b == 0 || TextUtils.isEmpty(this.f42158c) || (list = this.f42159d) == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aid", this.f42156a);
            jSONObject.put("pid", this.f42157b);
            jSONObject.put("app_key", this.f42158c);
            JSONArray jSONArray = new JSONArray();
            List<String> list = this.f42159d;
            if (list != null) {
                for (String str : list) {
                    jSONArray.put(str);
                }
            }
            jSONObject.put("urls", jSONArray);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null) {
            aVar.f42159d = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    if (!optString.endsWith("/ws/v2")) {
                        optString = optString.endsWith("/") ? optString + "ws/v2" : optString + "/ws/v2";
                    }
                    aVar.f42159d.add(optString);
                }
            }
        }
        aVar.f42156a = jSONObject.optInt("aid");
        aVar.f42157b = jSONObject.optInt("pid");
        aVar.f42158c = jSONObject.optString("app_key");
        return aVar;
    }
}
