package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class TTliveGeckoFileInfoReportEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final TTliveGeckoFileInfoReportEnableSetting INSTANCE = new TTliveGeckoFileInfoReportEnableSetting();

    private TTliveGeckoFileInfoReportEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10874);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TTliveGeckoFileInfoReportEnableSetting.class);
    }
}
