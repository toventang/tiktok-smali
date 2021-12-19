package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ShowHuoliBuyDiamondSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final ShowHuoliBuyDiamondSetting INSTANCE = new ShowHuoliBuyDiamondSetting();

    private ShowHuoliBuyDiamondSetting() {
    }

    static {
        Covode.recordClassIndex(11010);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(ShowHuoliBuyDiamondSetting.class);
    }
}
