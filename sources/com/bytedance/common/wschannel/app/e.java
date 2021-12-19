package com.bytedance.common.wschannel.app;

import com.bytedance.common.wschannel.b.b;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface e {
    static {
        Covode.recordClassIndex(15945);
    }

    void a(b bVar, JSONObject jSONObject);

    void a(WsChannelMsg wsChannelMsg);
}
