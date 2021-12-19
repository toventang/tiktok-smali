package com.benchmark;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IBTCHApplog {
    static {
        Covode.recordClassIndex(2929);
    }

    void onEvent(String str, JSONObject jSONObject);
}
