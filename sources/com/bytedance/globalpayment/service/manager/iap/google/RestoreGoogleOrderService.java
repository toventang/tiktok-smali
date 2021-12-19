package com.bytedance.globalpayment.service.manager.iap.google;

import com.bytedance.covode.number.Covode;

public interface RestoreGoogleOrderService {
    static {
        Covode.recordClassIndex(17786);
    }

    boolean isEnableRestoreOrder();

    void onFailedFinishedTokenUpload(String str);

    void onSuccessFinishedTokenUpload(String str);
}
