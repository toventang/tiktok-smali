package com.ss.android.ugc.aweme.effectplatform;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.effectmanager.algorithm.FetchResourcesListener;

public interface g {
    static {
        Covode.recordClassIndex(56001);
    }

    void a(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener);

    void a(String[] strArr, FetchResourcesListener fetchResourcesListener);
}
