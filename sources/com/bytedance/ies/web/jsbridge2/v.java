package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f35688a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(21316);
    }

    v() {
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f35688a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final v a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f35688a.put(str, obj);
        }
        return this;
    }
}
