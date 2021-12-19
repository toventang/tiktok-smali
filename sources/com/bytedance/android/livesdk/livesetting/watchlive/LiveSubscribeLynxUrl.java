package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.covode.number.Covode;

public final class LiveSubscribeLynxUrl {
    @Group(isDefault = true, value = "default group")
    private static final LiveSubscribeLynxMap DEFAULT = new LiveSubscribeLynxMap(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    public static final LiveSubscribeLynxUrl INSTANCE = new LiveSubscribeLynxUrl();

    private LiveSubscribeLynxUrl() {
    }

    public final LiveSubscribeLynxMap getDEFAULT() {
        return DEFAULT;
    }

    public final LiveSubscribeLynxMap getValue() {
        LiveSubscribeLynxMap liveSubscribeLynxMap = (LiveSubscribeLynxMap) SettingsManager.INSTANCE.getValueSafely(LiveSubscribeLynxUrl.class);
        if (liveSubscribeLynxMap == null) {
            return DEFAULT;
        }
        return liveSubscribeLynxMap;
    }

    static {
        Covode.recordClassIndex(11063);
    }
}
