package com.ss.bytertc.engine.utils;

import com.bytedance.covode.number.Covode;
import org.webrtc.EglBase;

public interface EglContextCarrier {
    static {
        Covode.recordClassIndex(101040);
    }

    EglBase.Context getEglBaseContext();

    void setEglBaseContext(EglBase.Context context);
}
