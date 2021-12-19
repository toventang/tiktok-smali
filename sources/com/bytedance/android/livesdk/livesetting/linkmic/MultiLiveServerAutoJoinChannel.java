package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MultiLiveServerAutoJoinChannel {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final MultiLiveServerAutoJoinChannel INSTANCE = new MultiLiveServerAutoJoinChannel();

    private MultiLiveServerAutoJoinChannel() {
    }

    static {
        Covode.recordClassIndex(10769);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiLiveServerAutoJoinChannel.class);
    }
}
