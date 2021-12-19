package com.ss.android.ugc.aweme.notice.api.ab;

import com.bytedance.covode.number.Covode;

public interface NoticeABService {
    static {
        Covode.recordClassIndex(72396);
    }

    int getEnablePushGuide();

    int getShowRedDotType();

    boolean isEnableMultiAccountLogin();

    boolean isFtcBindEnable();
}
