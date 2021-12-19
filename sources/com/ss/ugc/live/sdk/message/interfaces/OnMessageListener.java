package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;

public interface OnMessageListener {
    static {
        Covode.recordClassIndex(102788);
    }

    void onMessage(IMessage iMessage);
}
