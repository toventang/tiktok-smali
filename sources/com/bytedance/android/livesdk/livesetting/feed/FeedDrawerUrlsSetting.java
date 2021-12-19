package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.a;
import com.bytedance.covode.number.Covode;
import h.a.z;
import java.util.List;

public final class FeedDrawerUrlsSetting {
    @Group(isDefault = true, value = "default group")
    private static final List<a> DEFAULT = z.INSTANCE;
    public static final FeedDrawerUrlsSetting INSTANCE = new FeedDrawerUrlsSetting();

    private FeedDrawerUrlsSetting() {
    }

    public final List<a> getDEFAULT() {
        return DEFAULT;
    }

    public final List<a> getValue() {
        List<a> list = (List) SettingsManager.INSTANCE.getValueSafely(FeedDrawerUrlsSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }

    static {
        Covode.recordClassIndex(10616);
    }
}
