package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveStreamSizeSetting {
    @Group(isDefault = true, value = "default group")
    private static final int[] DEFAULT = new int[0];
    public static final LiveStreamSizeSetting INSTANCE = new LiveStreamSizeSetting();

    private LiveStreamSizeSetting() {
    }

    public final int[] getValue() {
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely(LiveStreamSizeSetting.class);
        if (iArr == null) {
            return DEFAULT;
        }
        return iArr;
    }

    static {
        Covode.recordClassIndex(10580);
    }
}
