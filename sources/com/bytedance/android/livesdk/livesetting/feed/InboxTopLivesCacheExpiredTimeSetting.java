package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InboxTopLivesCacheExpiredTimeSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 300;
    public static final InboxTopLivesCacheExpiredTimeSetting INSTANCE = new InboxTopLivesCacheExpiredTimeSetting();

    private InboxTopLivesCacheExpiredTimeSetting() {
    }

    static {
        Covode.recordClassIndex(10621);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(InboxTopLivesCacheExpiredTimeSetting.class);
    }
}
