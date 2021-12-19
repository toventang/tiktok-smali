package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InboxTopLivesCheckFinishTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60000;
    public static final InboxTopLivesCheckFinishTimeSetting INSTANCE = new InboxTopLivesCheckFinishTimeSetting();

    private InboxTopLivesCheckFinishTimeSetting() {
    }

    static {
        Covode.recordClassIndex(11026);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(InboxTopLivesCheckFinishTimeSetting.class);
    }
}
