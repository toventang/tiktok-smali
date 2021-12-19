package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveNewAudienceEndModel;
import com.bytedance.covode.number.Covode;

public final class LiveNewAudienceFinishPageSetting {
    @Group(isDefault = true, value = "default group")
    private static final LiveNewAudienceEndModel DEFAULT = new LiveNewAudienceEndModel();
    public static final LiveNewAudienceFinishPageSetting INSTANCE = new LiveNewAudienceFinishPageSetting();

    private LiveNewAudienceFinishPageSetting() {
    }

    public final LiveNewAudienceEndModel getDEFAULT() {
        return DEFAULT;
    }

    public final LiveNewAudienceEndModel getValue() {
        LiveNewAudienceEndModel liveNewAudienceEndModel = (LiveNewAudienceEndModel) SettingsManager.INSTANCE.getValueSafely(LiveNewAudienceFinishPageSetting.class);
        if (liveNewAudienceEndModel == null) {
            return DEFAULT;
        }
        return liveNewAudienceEndModel;
    }

    static {
        Covode.recordClassIndex(11049);
    }
}
