package com.bytedance.android.livesdk.ac;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

public interface b extends IInterceptor {
    static {
        Covode.recordClassIndex(7534);
    }

    void a(IMessageManager iMessageManager);
}
