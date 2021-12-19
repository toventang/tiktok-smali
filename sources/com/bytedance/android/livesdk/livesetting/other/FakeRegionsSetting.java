package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class FakeRegionsSetting {
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final FakeRegionsSetting INSTANCE = new FakeRegionsSetting();

    private FakeRegionsSetting() {
    }

    static {
        Covode.recordClassIndex(10815);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FakeRegionsSetting.class);
    }
}
