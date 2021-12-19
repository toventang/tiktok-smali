package com.ss.avframework.livestreamv2.log;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface ILogUploader {
    static {
        Covode.recordClassIndex(100412);
    }

    void uploadLog(JSONObject jSONObject);
}
