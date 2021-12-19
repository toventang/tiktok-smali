package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveMuteCommentsListSetting {
    @Group(isDefault = true, value = "default group")
    private static final double[] DEFAULT = {5.0d, 30.0d, 60.0d, 300.0d, -1.0d};
    public static final LiveMuteCommentsListSetting INSTANCE = new LiveMuteCommentsListSetting();

    private LiveMuteCommentsListSetting() {
    }

    public final double[] getValue() {
        double[] dArr = (double[]) SettingsManager.INSTANCE.getValueSafely(LiveMuteCommentsListSetting.class);
        if (dArr == null) {
            return DEFAULT;
        }
        return dArr;
    }

    static {
        Covode.recordClassIndex(10977);
    }
}
