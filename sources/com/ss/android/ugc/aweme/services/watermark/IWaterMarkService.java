package com.ss.android.ugc.aweme.services.watermark;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.watermark.p;

public interface IWaterMarkService {
    static {
        Covode.recordClassIndex(79880);
    }

    void cancelWaterMark();

    void prepareDataForI18n(p pVar);

    void waterMark(p pVar);
}
