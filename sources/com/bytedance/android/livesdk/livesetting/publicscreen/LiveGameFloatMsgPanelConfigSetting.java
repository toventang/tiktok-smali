package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.config.a;
import com.bytedance.covode.number.Covode;

public final class LiveGameFloatMsgPanelConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT = new a();
    public static final LiveGameFloatMsgPanelConfigSetting INSTANCE = new LiveGameFloatMsgPanelConfigSetting();

    private LiveGameFloatMsgPanelConfigSetting() {
    }

    public final a getValue() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(LiveGameFloatMsgPanelConfigSetting.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10923);
    }
}
