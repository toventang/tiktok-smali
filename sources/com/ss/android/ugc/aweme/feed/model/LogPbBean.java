package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class LogPbBean implements Serializable {
    @c(a = "impr_id")
    public String imprId;

    static {
        Covode.recordClassIndex(59416);
    }

    public String getImprId() {
        return this.imprId;
    }

    public String toJsonString() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(this.imprId)) {
                str = "";
            } else {
                str = this.imprId;
            }
            jSONObject.put("impr_id", str);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public void setImprId(String str) {
        this.imprId = str;
    }
}
