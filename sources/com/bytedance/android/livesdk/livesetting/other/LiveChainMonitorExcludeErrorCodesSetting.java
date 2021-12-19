package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import h.a.z;
import java.util.List;

public final class LiveChainMonitorExcludeErrorCodesSetting {
    @Group(isDefault = true, value = "default group")
    private static final List<Integer> DEFAULT = z.INSTANCE;
    public static final LiveChainMonitorExcludeErrorCodesSetting INSTANCE = new LiveChainMonitorExcludeErrorCodesSetting();

    private LiveChainMonitorExcludeErrorCodesSetting() {
    }

    public final List<Integer> getValue() {
        List<Integer> list = (List) SettingsManager.INSTANCE.getValueSafely(LiveChainMonitorExcludeErrorCodesSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }

    static {
        Covode.recordClassIndex(10822);
    }
}
