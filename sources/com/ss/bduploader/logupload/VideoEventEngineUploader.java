package com.ss.bduploader.logupload;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface VideoEventEngineUploader {
    static {
        Covode.recordClassIndex(100674);
    }

    void onEventV3(String str, JSONObject jSONObject);
}
