package com.ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public abstract class BDVNetClient {

    public interface CompletionListener {
        static {
            Covode.recordClassIndex(100686);
        }

        void onCompletion(JSONObject jSONObject, Error error);
    }

    static {
        Covode.recordClassIndex(100685);
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
