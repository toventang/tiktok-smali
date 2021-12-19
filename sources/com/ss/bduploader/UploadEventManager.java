package com.ss.bduploader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bduploader.logupload.AppLogEngineUploader;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public enum UploadEventManager {
    instance;
    
    private boolean mEnableUseEngineUploader = true;
    private VideoEventEngineUploader mEngineUploader;
    private JSONArray mJsonArray = new JSONArray();

    public static int com_ss_bduploader_UploadEventManager_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(100670);
    }

    public final JSONArray popAllEvents() {
        MethodCollector.i(2861);
        JSONArray jSONArray = this.mJsonArray;
        synchronized (UploadEventManager.class) {
            try {
                this.mJsonArray = new JSONArray();
            } finally {
                MethodCollector.o(2861);
            }
        }
        return jSONArray;
    }

    public final void setUseEngineUploader(boolean z) {
        this.mEnableUseEngineUploader = z;
    }

    public final synchronized void setEngineUploader(VideoEventEngineUploader videoEventEngineUploader) {
        MethodCollector.i(227);
        this.mEngineUploader = videoEventEngineUploader;
        MethodCollector.o(227);
    }

    public final void putEvent(JSONObject jSONObject) {
        MethodCollector.i(3713);
        synchronized (UploadEventManager.class) {
            try {
                com_ss_bduploader_UploadEventManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("ttmn", "putEvent");
                this.mJsonArray.put(jSONObject);
            } finally {
                MethodCollector.o(3713);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void addEvent(JSONObject jSONObject) {
        String string;
        MethodCollector.i(3315);
        synchronized (UploadEventManager.class) {
            if (jSONObject != null) {
                try {
                    if (this.mEngineUploader == null || !this.mEnableUseEngineUploader) {
                        this.mJsonArray.put(jSONObject);
                    } else {
                        try {
                            string = jSONObject.getString("event");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(string)) {
                            this.mEngineUploader.onEventV3(string, jSONObject);
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3315);
                    throw th;
                }
            }
        }
        MethodCollector.o(3315);
    }

    private UploadEventManager() {
        setEngineUploader(AppLogEngineUploader.getInstance());
    }
}
