package com.bytedance.im.core.a;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class m implements Serializable {
    @c(a = "callback_too_long_ms")
    public long callbackTooLongMs = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    @c(a = "enable")
    public int enable;
    @c(a = "execute_too_long_ms")
    public long executeTooLongMs = 8000;
    @c(a = "timeout_duration_ms")
    public long timeoutDurationMs = 8000;

    static {
        Covode.recordClassIndex(22624);
    }
}
