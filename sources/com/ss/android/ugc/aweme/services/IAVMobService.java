package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface IAVMobService {
    static {
        Covode.recordClassIndex(79453);
    }

    void onEventV3(String str, Map<String, String> map);

    void onEventV3(String str, JSONObject jSONObject);
}
