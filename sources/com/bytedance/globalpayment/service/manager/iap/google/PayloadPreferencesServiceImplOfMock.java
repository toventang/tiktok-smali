package com.bytedance.globalpayment.service.manager.iap.google;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class PayloadPreferencesServiceImplOfMock implements PayloadPreferencesService {
    static {
        Covode.recordClassIndex(17785);
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void addQueryOrderParam(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removePayload(Context context, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.PayloadPreferencesService
    public void removeQueryOrderParam(Context context, String str) {
    }
}
