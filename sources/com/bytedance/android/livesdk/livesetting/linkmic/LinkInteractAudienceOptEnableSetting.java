package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LinkInteractAudienceOptEnableSetting {
    @Group(isDefault = true, value = "default group")
    private static final boolean DEFAULT = true;
    public static final LinkInteractAudienceOptEnableSetting INSTANCE = new LinkInteractAudienceOptEnableSetting();

    private LinkInteractAudienceOptEnableSetting() {
    }

    static {
        Covode.recordClassIndex(10725);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkInteractAudienceOptEnableSetting.class);
    }
}
