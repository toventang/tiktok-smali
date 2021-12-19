package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface AVMDLTaskEventListener {
    static {
        Covode.recordClassIndex(101125);
    }

    void onTaskEventNotify(int i2, String str, int i3, int i4, JSONObject jSONObject);
}
