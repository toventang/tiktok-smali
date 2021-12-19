package com.ss.android.ugc.aweme;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface PerformanceMainService {
    static {
        Covode.recordClassIndex(38396);
    }

    Activity newAddWikiActivity();

    void preloadPushSettingsManager();
}
