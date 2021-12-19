package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LinkServerAutoJoinChannel {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LinkServerAutoJoinChannel INSTANCE = new LinkServerAutoJoinChannel();

    private LinkServerAutoJoinChannel() {
    }

    static {
        Covode.recordClassIndex(10780);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkServerAutoJoinChannel.class);
    }
}
