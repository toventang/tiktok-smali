package com.bytedance.common.wschannel.channel;

import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface a {
    static {
        Covode.recordClassIndex(15967);
    }

    void a();

    void a(int i2, byte[] bArr);

    void a(IWsChannelClient iWsChannelClient, int i2, JSONObject jSONObject);

    void a(SocketState socketState);

    void a(WsChannelMsg wsChannelMsg, boolean z);

    void a(String str, JSONObject jSONObject);

    void b();
}
