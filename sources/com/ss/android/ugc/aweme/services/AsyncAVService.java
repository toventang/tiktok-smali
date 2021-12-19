package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.external.IUIService;

public interface AsyncAVService {
    static {
        Covode.recordClassIndex(79422);
    }

    IUIService uiService();
}
