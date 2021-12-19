package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;

public interface ISmartCommonPreloadService {
    static {
        Covode.recordClassIndex(70962);
    }

    void checkAndInit();
}
