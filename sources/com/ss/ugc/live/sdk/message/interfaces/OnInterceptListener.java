package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;

public interface OnInterceptListener {
    static {
        Covode.recordClassIndex(102787);
    }

    void onIntercept(IMessage iMessage);
}
