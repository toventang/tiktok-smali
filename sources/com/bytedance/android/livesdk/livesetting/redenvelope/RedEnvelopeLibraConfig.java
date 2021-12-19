package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class RedEnvelopeLibraConfig {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final RedEnvelopeLibraConfig INSTANCE = new RedEnvelopeLibraConfig();

    private RedEnvelopeLibraConfig() {
    }

    static {
        Covode.recordClassIndex(10965);
    }

    public final boolean enableEnvelopeFunc() {
        return SettingsManager.INSTANCE.getBooleanValue(RedEnvelopeLibraConfig.class);
    }
}
