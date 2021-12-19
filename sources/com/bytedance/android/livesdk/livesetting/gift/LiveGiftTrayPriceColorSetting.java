package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import java.util.List;
import java.util.Map;

public final class LiveGiftTrayPriceColorSetting {
    @Group(isDefault = true, value = "default group")
    private static final Map<String, List<String>> DEFAULT = ag.a();
    public static final LiveGiftTrayPriceColorSetting INSTANCE = new LiveGiftTrayPriceColorSetting();

    private LiveGiftTrayPriceColorSetting() {
    }

    public final Map<String, List<String>> getDEFAULT() {
        return DEFAULT;
    }

    public final Map<String, List<String>> getValue() {
        Map<String, List<String>> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveGiftTrayPriceColorSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    static {
        Covode.recordClassIndex(10665);
    }
}
