package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class MultiLiveLinkPanelStyle {
    public static final MultiLiveLinkPanelStyle INSTANCE = new MultiLiveLinkPanelStyle();
    @Group(isDefault = true, value = "default group")
    public static final int USE_DEFAULT_PANEL = 0;
    @Group("new panel without video")
    public static final int USE_NEW_PANEL_WITHOUT_VIDEO = 1;
    @Group("new panel with video")
    public static final int USE_NEW_PANEL_WITH_VIDEO = 2;

    private MultiLiveLinkPanelStyle() {
    }

    static {
        Covode.recordClassIndex(10768);
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiLiveLinkPanelStyle.class);
    }
}
