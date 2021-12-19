package com.bytedance.globalpayment.service.manager.iap.google;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface PayloadPreferencesService {
    static {
        Covode.recordClassIndex(17784);
    }

    void addQueryOrderParam(Context context, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2);

    void removePayload(Context context, String str);

    void removeQueryOrderParam(Context context, String str);
}
