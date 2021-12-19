package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveInputDialogAnimationSetting {
    @Group(isDefault = true, value = "default group")
    public static final int DISABLE = 0;
    public static final LiveInputDialogAnimationSetting INSTANCE = new LiveInputDialogAnimationSetting();
    private static boolean disable;

    private LiveInputDialogAnimationSetting() {
    }

    public final boolean getDisable() {
        return disable;
    }

    static {
        Covode.recordClassIndex(10603);
    }

    public final boolean hasAnimation() {
        if (getMode() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isALL() {
        if (4 == getMode()) {
            return true;
        }
        return false;
    }

    public final boolean isAt() {
        if (3 == getMode()) {
            return true;
        }
        return false;
    }

    public final boolean isClick() {
        if (2 == getMode()) {
            return true;
        }
        return false;
    }

    private final int getMode() {
        int intValue;
        if (disable || (intValue = SettingsManager.INSTANCE.getIntValue(LiveInputDialogAnimationSetting.class)) < 0 || 4 < intValue) {
            return 0;
        }
        return intValue;
    }

    public final void setDisable(boolean z) {
        disable = z;
    }
}
