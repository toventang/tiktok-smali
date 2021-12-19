package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InboxTopLivesCollectUnreadSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final InboxTopLivesCollectUnreadSetting INSTANCE = new InboxTopLivesCollectUnreadSetting();

    private InboxTopLivesCollectUnreadSetting() {
    }

    static {
        Covode.recordClassIndex(11027);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(InboxTopLivesCollectUnreadSetting.class);
    }
}
