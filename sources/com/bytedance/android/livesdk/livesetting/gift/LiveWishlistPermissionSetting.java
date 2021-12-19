package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.gift.model.v;
import com.bytedance.covode.number.Covode;

public final class LiveWishlistPermissionSetting {
    @Group(isDefault = true, value = "default group")
    private static final v DEFAULT = new v((byte) 0);
    public static final LiveWishlistPermissionSetting INSTANCE = new LiveWishlistPermissionSetting();

    private LiveWishlistPermissionSetting() {
    }

    public final v getValue() {
        v vVar = (v) SettingsManager.INSTANCE.getValueSafely(LiveWishlistPermissionSetting.class);
        if (vVar == null) {
            return DEFAULT;
        }
        return vVar;
    }

    static {
        Covode.recordClassIndex(10675);
    }
}
