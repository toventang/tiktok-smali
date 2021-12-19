package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class ThreadPoolOptExperiment {
    @Group("replace all")
    private static final int ALL = 3;
    @Group(isDefault = true, value = "default group")
    private static final int DEFAULT = 0;
    public static final ThreadPoolOptExperiment INSTANCE = new ThreadPoolOptExperiment();
    @Group("replace player")
    private static final int PLAYER = 1;
    @Group("replace log.")
    private static final int PLAYER_AND_LOG = 2;

    private ThreadPoolOptExperiment() {
    }

    public final int getALL() {
        return ALL;
    }

    public final int getPLAYER() {
        return PLAYER;
    }

    public final int getPLAYER_AND_LOG() {
        return PLAYER_AND_LOG;
    }

    public final boolean isEnableAll() {
        if (SettingsManager.INSTANCE.getIntValue(ThreadPoolOptExperiment.class) == ALL) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(10916);
    }

    public final boolean isEnableLog() {
        if (SettingsManager.INSTANCE.getIntValue(ThreadPoolOptExperiment.class) == PLAYER_AND_LOG || SettingsManager.INSTANCE.getIntValue(ThreadPoolOptExperiment.class) == ALL) {
            return true;
        }
        return false;
    }

    public final boolean isEnablePlayer() {
        if (SettingsManager.INSTANCE.getIntValue(ThreadPoolOptExperiment.class) == PLAYER || SettingsManager.INSTANCE.getIntValue(ThreadPoolOptExperiment.class) == PLAYER_AND_LOG || SettingsManager.INSTANCE.getIntValue(ThreadPoolOptExperiment.class) == ALL) {
            return true;
        }
        return false;
    }
}
