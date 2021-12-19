package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class DnsOptMethodSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final DnsOptMethodSetting INSTANCE = new DnsOptMethodSetting();

    private DnsOptMethodSetting() {
    }

    static {
        Covode.recordClassIndex(10930);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(DnsOptMethodSetting.class);
    }
}
