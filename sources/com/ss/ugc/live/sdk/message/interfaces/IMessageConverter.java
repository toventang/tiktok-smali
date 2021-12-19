package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;

public interface IMessageConverter {
    static {
        Covode.recordClassIndex(102781);
    }

    IMessage convert(String str, String str2, long j2);
}
