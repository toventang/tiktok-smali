package com.bytedance.ies.im.core.api.j;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.bd;

public interface a {
    static {
        Covode.recordClassIndex(20233);
    }

    void a(WsChannelMsg wsChannelMsg, bd bdVar);

    void a(b bVar);

    void a(String str);
}
