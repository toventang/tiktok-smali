package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveSlotSettings;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import com.bytedance.covode.number.Covode;
import h.a.ag;
import java.util.Map;

public final class LiveSlotExperiment {
    @Group(isDefault = true, value = "default group")
    private static final LiveSlotSettings DEFAULT = new LiveSlotSettings(null, 1, null);
    public static final LiveSlotExperiment INSTANCE = new LiveSlotExperiment();

    private LiveSlotExperiment() {
    }

    public final LiveSlotSettings getDEFAULT() {
        return DEFAULT;
    }

    public final Map<String, SlotBizTypeDisallow> getBizTypeDisallow() {
        Map<String, SlotBizTypeDisallow> bizTypeDisallow = getValue().getBizTypeDisallow();
        if (bizTypeDisallow == null) {
            return ag.a();
        }
        return bizTypeDisallow;
    }

    public final LiveSlotSettings getValue() {
        LiveSlotSettings liveSlotSettings = (LiveSlotSettings) SettingsManager.INSTANCE.getValueSafely(LiveSlotExperiment.class);
        if (liveSlotSettings == null) {
            return DEFAULT;
        }
        return liveSlotSettings;
    }

    static {
        Covode.recordClassIndex(10573);
    }
}
