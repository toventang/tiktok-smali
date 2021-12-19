package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface ev {
    static {
        Covode.recordClassIndex(93500);
    }

    boolean a(String str, Map<String, String> map);

    boolean a(String str, JSONObject jSONObject);
}
