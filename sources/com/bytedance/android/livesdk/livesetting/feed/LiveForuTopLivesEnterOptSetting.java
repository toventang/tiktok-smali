package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveForuTopLivesEnterOptSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveForuTopLivesEnterOptSetting INSTANCE = new LiveForuTopLivesEnterOptSetting();

    private LiveForuTopLivesEnterOptSetting() {
    }

    static {
        Covode.recordClassIndex(10628);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveForuTopLivesEnterOptSetting.class);
    }
}
