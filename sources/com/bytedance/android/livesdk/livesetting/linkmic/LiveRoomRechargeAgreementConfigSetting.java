package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.covode.number.Covode;

public final class LiveRoomRechargeAgreementConfigSetting {
    @Group(isDefault = true, value = "default group")
    private static final LiveRechargeAgreementConfig DEFAULT = new LiveRechargeAgreementConfig();
    public static final LiveRoomRechargeAgreementConfigSetting INSTANCE = new LiveRoomRechargeAgreementConfigSetting();

    private LiveRoomRechargeAgreementConfigSetting() {
    }

    public final LiveRechargeAgreementConfig getDEFAULT() {
        return DEFAULT;
    }

    public final LiveRechargeAgreementConfig getValue() {
        return (LiveRechargeAgreementConfig) SettingsManager.INSTANCE.getValueSafely(LiveRoomRechargeAgreementConfigSetting.class);
    }

    static {
        Covode.recordClassIndex(10759);
    }
}
