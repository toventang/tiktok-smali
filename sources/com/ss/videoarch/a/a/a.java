package com.ss.videoarch.a.a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends Error {
    public int code;
    public Map info;
    public long timeStamp = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(102837);
    }

    public static int com_ss_videoarch_liveplayer_log_LiveError_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public final String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException e2) {
            com_ss_videoarch_liveplayer_log_LiveError_com_ss_android_ugc_aweme_lancet_LogLancet_d("Live Error", e2.toString());
        }
        return jSONObject.toString();
    }

    public final String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
        } catch (JSONException e2) {
            com_ss_videoarch_liveplayer_log_LiveError_com_ss_android_ugc_aweme_lancet_LogLancet_d("Live Error", e2.toString());
        }
        return jSONObject.toString();
    }

    public a(int i2, String str, Map<String, String> map) {
        super(str);
        this.code = i2;
        this.info = map;
    }
}
