package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public abstract class AVMDLNetClient {

    public interface CompletionListener {
        static {
            Covode.recordClassIndex(101146);
        }

        void onCompletion(JSONObject jSONObject, Error error);
    }

    static {
        Covode.recordClassIndex(101145);
    }

    public void cancel() {
    }

    public void startTask(String str, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, CompletionListener completionListener) {
    }

    public void startTask(String str, Map<String, String> map, JSONObject jSONObject, int i2, CompletionListener completionListener) {
    }
}
