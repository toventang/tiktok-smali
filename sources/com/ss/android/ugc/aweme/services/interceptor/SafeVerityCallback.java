package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;

public interface SafeVerityCallback {
    static {
        Covode.recordClassIndex(79727);
    }

    void onComplete(SafeVerityResponse safeVerityResponse);
}
