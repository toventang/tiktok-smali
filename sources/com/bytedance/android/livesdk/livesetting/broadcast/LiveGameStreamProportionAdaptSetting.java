package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveGameStreamProportionAdaptSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveGameStreamProportionAdaptSetting INSTANCE = new LiveGameStreamProportionAdaptSetting();

    private LiveGameStreamProportionAdaptSetting() {
    }

    static {
        Covode.recordClassIndex(10550);
    }

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGameStreamProportionAdaptSetting.class);
    }
}
