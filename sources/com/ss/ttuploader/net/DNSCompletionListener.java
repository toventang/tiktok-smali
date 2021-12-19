package com.ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface DNSCompletionListener {
    static {
        Covode.recordClassIndex(101414);
    }

    void onCancelled();

    void onCompletion(JSONObject jSONObject, Error error);

    void onRetry(Error error);
}
