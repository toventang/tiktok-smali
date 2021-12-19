package com.ss.ugc.live.sdk.message.data;

import com.bytedance.covode.number.Covode;

public interface IMessage {
    static {
        Covode.recordClassIndex(102771);
    }

    int getGeneralMessageType();

    int getIntType();

    int getMessageFrom();

    long getMessageId();

    int getPriority();

    boolean needMonitor();
}
