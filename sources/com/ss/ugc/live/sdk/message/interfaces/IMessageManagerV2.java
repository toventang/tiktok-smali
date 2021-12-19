package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.b.c;
import com.ss.ugc.live.sdk.msg.b.e;

public interface IMessageManagerV2 extends IMessageManager {
    static {
        Covode.recordClassIndex(102783);
    }

    boolean isWsConnected();

    void sendRequest(long j2, e eVar, c cVar);
}
