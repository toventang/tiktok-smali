package com.bef.effectsdk.message;

import android.os.Message;
import com.bytedance.covode.number.Covode;

public interface MessageInterceptor {
    static {
        Covode.recordClassIndex(2891);
    }

    void destroy();

    boolean intercept(Message message);
}
