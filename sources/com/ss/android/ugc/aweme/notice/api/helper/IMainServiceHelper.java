package com.ss.android.ugc.aweme.notice.api.helper;

import com.bytedance.covode.number.Covode;

public interface IMainServiceHelper {
    static {
        Covode.recordClassIndex(72480);
    }

    void goToTipsPage();

    boolean isChatFunOfflineUnder16();

    boolean shouldRedictToTipsPage();
}
