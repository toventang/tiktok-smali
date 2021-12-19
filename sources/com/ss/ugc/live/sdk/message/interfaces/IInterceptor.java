package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;

public interface IInterceptor {
    static {
        Covode.recordClassIndex(102777);
    }

    boolean onMessage(IMessage iMessage);
}
