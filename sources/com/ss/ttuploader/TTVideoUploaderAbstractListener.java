package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public abstract class TTVideoUploaderAbstractListener {
    static {
        Covode.recordClassIndex(101410);
    }

    public void onEventLog(JSONObject jSONObject) {
    }

    public void onEventLogMap(Map<String, String> map) {
    }

    public void onSpeedVidContext(int i2, int i3, String str) {
    }

    public void onVidContext(String str) {
    }

    public boolean switchNetType(int i2) {
        return false;
    }
}
