package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LynxCardConfig {
    @Group(isDefault = true, value = "default")
    private static final a DEFAULT = new a();
    public static final LynxCardConfig INSTANCE = new LynxCardConfig();

    private LynxCardConfig() {
    }

    public final a getDEFAULT() {
        return DEFAULT;
    }

    public final int getItemHeight() {
        return getConfig().f18720g;
    }

    public final int getItemSpacing() {
        return getConfig().f18721h;
    }

    public final int getItemWidth() {
        return getConfig().f18719f;
    }

    public final int getPreviewHeight() {
        return getConfig().f18723j;
    }

    public final int getPreviewStartMargin() {
        return getConfig().f18725l;
    }

    public final int getPreviewTopMargin() {
        return getConfig().f18724k;
    }

    public final int getPreviewWidth() {
        return getConfig().f18722i;
    }

    public final int getWidgetEndMargin() {
        return getConfig().f18718e;
    }

    public final int getWidgetHeight() {
        return getConfig().f18715b;
    }

    public final int getWidgetStartMargin() {
        return getConfig().f18717d;
    }

    public final int getWidgetTopMargin() {
        return getConfig().f18716c;
    }

    public final int getWidgetWidth() {
        return getConfig().f18714a;
    }

    private final a getConfig() {
        a aVar = (a) SettingsManager.INSTANCE.getValueSafely(LynxCardConfig.class);
        if (aVar == null) {
            return DEFAULT;
        }
        return aVar;
    }

    static {
        Covode.recordClassIndex(10703);
    }
}
