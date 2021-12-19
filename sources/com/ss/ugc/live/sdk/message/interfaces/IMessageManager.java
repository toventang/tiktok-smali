package com.ss.ugc.live.sdk.message.interfaces;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.data.IMessage;

public interface IMessageManager {
    static {
        Covode.recordClassIndex(102782);
    }

    void addInterceptor(IInterceptor iInterceptor);

    void addMessageListener(int i2, OnMessageListener onMessageListener);

    void addOnInterceptListener(OnInterceptListener onInterceptListener);

    void insertMessage(IMessage iMessage);

    void insertMessage(IMessage iMessage, boolean z);

    void refresh(Configuration configuration);

    void release();

    void removeInterceptor(IInterceptor iInterceptor);

    void removeMessageListener(int i2, OnMessageListener onMessageListener);

    void removeMessageListener(OnMessageListener onMessageListener);

    void removeOnInterceptListener(OnInterceptListener onInterceptListener);

    void reset();

    void startMessage();

    void stopMessage(boolean z);
}
