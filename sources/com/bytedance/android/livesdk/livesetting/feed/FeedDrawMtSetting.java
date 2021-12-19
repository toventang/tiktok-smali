package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.covode.number.Covode;

public final class FeedDrawMtSetting {
    @Group(isDefault = true, value = "default group")
    private static final LiveFeedDraw DEFAULT = new LiveFeedDraw();
    public static final FeedDrawMtSetting INSTANCE = new FeedDrawMtSetting();

    private FeedDrawMtSetting() {
    }

    public final LiveFeedDraw getDEFAULT() {
        return DEFAULT;
    }

    public final LiveFeedDraw getValue() {
        LiveFeedDraw liveFeedDraw = (LiveFeedDraw) SettingsManager.INSTANCE.getValueSafely(FeedDrawMtSetting.class);
        if (liveFeedDraw == null) {
            return DEFAULT;
        }
        return liveFeedDraw;
    }

    static {
        Covode.recordClassIndex(10615);
    }
}
