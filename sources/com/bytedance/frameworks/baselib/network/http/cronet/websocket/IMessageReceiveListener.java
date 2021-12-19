package com.bytedance.frameworks.baselib.network.http.cronet.websocket;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMessageReceiveListener {
    static {
        Covode.recordClassIndex(17032);
    }

    void onConnection(int i2, String str, JSONObject jSONObject);

    void onFeedBackLog(String str);

    void onMessage(byte[] bArr, int i2);
}
