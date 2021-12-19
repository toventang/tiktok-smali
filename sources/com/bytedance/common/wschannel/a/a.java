package com.bytedance.common.wschannel.a;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(15937);
    }

    WsChannelMsg a(byte[] bArr);

    byte[] a(WsChannelMsg wsChannelMsg);
}
