package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveReplaceObjUnicodeSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = false;
    public static final LiveReplaceObjUnicodeSetting INSTANCE = new LiveReplaceObjUnicodeSetting();

    private LiveReplaceObjUnicodeSetting() {
    }

    static {
        Covode.recordClassIndex(10979);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveReplaceObjUnicodeSetting.class);
    }
}
