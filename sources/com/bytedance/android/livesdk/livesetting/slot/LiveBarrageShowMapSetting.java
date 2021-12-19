package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import java.util.Map;

public final class LiveBarrageShowMapSetting {
    @Group(isDefault = true, value = "default group")
    private static final Map<String, Boolean> DEFAULT = ag.a();
    public static final LiveBarrageShowMapSetting INSTANCE = new LiveBarrageShowMapSetting();

    private LiveBarrageShowMapSetting() {
    }

    public final Map<String, Boolean> getValue() {
        Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveBarrageShowMapSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    static {
        Covode.recordClassIndex(10992);
    }
}
