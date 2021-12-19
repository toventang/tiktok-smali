package com.ss.android.ugc.playerkit.simapicommon.reporter;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IALog {
    static {
        Covode.recordClassIndex(98037);
    }

    void d(String str);

    void d(String str, JSONObject jSONObject);

    void e(String str, String str2);

    void e(String str, JSONObject jSONObject);

    void i(String str, JSONObject jSONObject);

    boolean isEnabled();

    void w(String str, JSONObject jSONObject);
}
