package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveRechargeDialogTypeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveRechargeDialogTypeSetting INSTANCE = new LiveRechargeDialogTypeSetting();

    private LiveRechargeDialogTypeSetting() {
    }

    static {
        Covode.recordClassIndex(11004);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRechargeDialogTypeSetting.class);
    }
}
