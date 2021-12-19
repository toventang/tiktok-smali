package com.ss.android.ugc.aweme.publish.core.uploader.engine.a;

import com.bytedance.covode.number.Covode;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import org.json.JSONObject;

public final class a implements VideoEventEngineUploader {
    static {
        Covode.recordClassIndex(77054);
    }

    @Override // com.ss.bduploader.logupload.VideoEventEngineUploader
    public final void onEventV3(String str, JSONObject jSONObject) {
        com.ss.android.common.c.a.a(str, jSONObject);
    }
}
