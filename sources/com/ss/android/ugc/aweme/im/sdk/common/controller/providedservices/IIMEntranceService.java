package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.IIMService;

public interface IIMEntranceService {
    static {
        Covode.recordClassIndex(65494);
    }

    void init(IIMService iIMService);
}
