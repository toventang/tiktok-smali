package com.benchmark;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class BHApplogDowngrade implements IBTCHApplog {
    static {
        Covode.recordClassIndex(2924);
    }

    @Override // com.benchmark.IBTCHApplog
    public void onEvent(String str, JSONObject jSONObject) {
    }
}
