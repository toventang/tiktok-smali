package com.ss.android.ugc.aweme.services.performance;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface LagDataCallback {
    static {
        Covode.recordClassIndex(79755);
    }

    void onDataAvailable(JSONObject jSONObject);
}
