package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.RoomSlideUpGuide;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class LiveMtRoomSlideUpGuideSetting {
    @Group(isDefault = true, value = "default group")
    private static final RoomSlideUpGuide DEFAULT;
    public static final LiveMtRoomSlideUpGuideSetting INSTANCE = new LiveMtRoomSlideUpGuideSetting();

    private LiveMtRoomSlideUpGuideSetting() {
    }

    public final RoomSlideUpGuide getDEFAULT() {
        return DEFAULT;
    }

    public final RoomSlideUpGuide getValue() {
        RoomSlideUpGuide roomSlideUpGuide = (RoomSlideUpGuide) SettingsManager.INSTANCE.getValueSafely(LiveMtRoomSlideUpGuideSetting.class);
        if (roomSlideUpGuide == null) {
            return DEFAULT;
        }
        return roomSlideUpGuide;
    }

    static {
        Covode.recordClassIndex(11048);
        RoomSlideUpGuide defaultInstance = RoomSlideUpGuide.defaultInstance();
        l.b(defaultInstance, "");
        DEFAULT = defaultInstance;
    }
}
