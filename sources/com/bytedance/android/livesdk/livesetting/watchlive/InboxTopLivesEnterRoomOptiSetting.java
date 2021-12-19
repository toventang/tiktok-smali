package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class InboxTopLivesEnterRoomOptiSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final InboxTopLivesEnterRoomOptiSetting INSTANCE = new InboxTopLivesEnterRoomOptiSetting();

    private InboxTopLivesEnterRoomOptiSetting() {
    }

    static {
        Covode.recordClassIndex(11028);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(InboxTopLivesEnterRoomOptiSetting.class);
    }
}
