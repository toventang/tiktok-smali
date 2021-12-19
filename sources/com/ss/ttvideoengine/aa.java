package com.ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aa implements ab {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<af> f152165a = new ArrayList<>();

    static {
        Covode.recordClassIndex(101443);
    }

    @Override // com.ss.ttvideoengine.ab
    public final int a() {
        return this.f152165a.size();
    }

    @Override // com.ss.ttvideoengine.ab
    public final String toString() {
        if (this.f152165a.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < this.f152165a.size(); i2++) {
                JSONObject a2 = this.f152165a.get(i2).a();
                if (a2.has("url") && a2.has("language_id") && a2.has("format") && a2.has("sub_id")) {
                    jSONArray.put(a2);
                }
            }
            try {
                jSONObject.putOpt("list", jSONArray);
                return jSONObject.toString();
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public aa(JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject.has("list") && (optJSONArray = jSONObject.optJSONArray("list")) != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null && optJSONObject.has("language_id") && optJSONObject.has("format") && optJSONObject.has("url") && optJSONObject.has("sub_id")) {
                    this.f152165a.add(new ae(optJSONObject));
                }
            }
        }
    }
}
