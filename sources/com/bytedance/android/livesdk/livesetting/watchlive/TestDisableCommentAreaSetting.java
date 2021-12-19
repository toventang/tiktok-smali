package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.covode.number.Covode;

public final class TestDisableCommentAreaSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisableCommentAreaSetting INSTANCE = new TestDisableCommentAreaSetting();

    private TestDisableCommentAreaSetting() {
    }

    static {
        Covode.recordClassIndex(11078);
    }

    public final boolean getValue() {
        if (e.f13999c) {
            return SettingsManager.INSTANCE.getBooleanValue(TestDisableCommentAreaSetting.class);
        }
        return false;
    }
}
