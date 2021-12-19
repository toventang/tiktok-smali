package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class PipModeBrandListSetting {
    @Group(isDefault = true, value = "default group")
    private static final String[] DEFAULT = new String[0];
    public static final PipModeBrandListSetting INSTANCE = new PipModeBrandListSetting();

    private PipModeBrandListSetting() {
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(PipModeBrandListSetting.class);
    }

    static {
        Covode.recordClassIndex(11070);
    }
}
