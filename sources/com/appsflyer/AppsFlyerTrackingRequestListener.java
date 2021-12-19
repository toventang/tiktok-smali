package com.appsflyer;

import com.bytedance.covode.number.Covode;

public interface AppsFlyerTrackingRequestListener {
    static {
        Covode.recordClassIndex(2680);
    }

    void onTrackingRequestFailure(String str);

    void onTrackingRequestSuccess();
}
