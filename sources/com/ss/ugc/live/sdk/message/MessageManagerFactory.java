package com.ss.ugc.live.sdk.message;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.Configuration;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

public class MessageManagerFactory {
    static {
        Covode.recordClassIndex(102763);
    }

    public static IMessageManager get(Configuration configuration) {
        return new MessageManager(configuration);
    }

    public static IMessageManager getV2(Configuration configuration) {
        return new MessageManagerV2(configuration);
    }
}
