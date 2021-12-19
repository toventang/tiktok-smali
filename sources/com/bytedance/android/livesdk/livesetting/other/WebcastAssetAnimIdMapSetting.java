package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.f;
import com.bytedance.covode.number.Covode;

public final class WebcastAssetAnimIdMapSetting {
    @Group(isDefault = true, value = "default group")
    private static final f DEFAULT = new f();
    public static final WebcastAssetAnimIdMapSetting INSTANCE = new WebcastAssetAnimIdMapSetting();

    private WebcastAssetAnimIdMapSetting() {
    }

    public final f getValue() {
        f fVar = (f) SettingsManager.INSTANCE.getValueSafely(WebcastAssetAnimIdMapSetting.class);
        if (fVar == null) {
            return DEFAULT;
        }
        return fVar;
    }

    static {
        Covode.recordClassIndex(10881);
    }
}
