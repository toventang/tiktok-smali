package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class EnableParsePushSlimroomSetting {
    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableParsePushSlimroomSetting INSTANCE = new EnableParsePushSlimroomSetting();

    private EnableParsePushSlimroomSetting() {
    }

    static {
        Covode.recordClassIndex(10812);
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableParsePushSlimroomSetting.class);
    }
}
