package com.appsflyer;

import com.bytedance.covode.number.Covode;

public interface AppsFlyerInAppPurchaseValidatorListener {
    static {
        Covode.recordClassIndex(2662);
    }

    void onValidateInApp();

    void onValidateInAppFailure(String str);
}
