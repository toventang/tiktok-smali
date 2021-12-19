package com.appsflyer;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface AppsFlyerConversionListener {
    static {
        Covode.recordClassIndex(2661);
    }

    void onAppOpenAttribution(Map<String, String> map);

    void onAttributionFailure(String str);

    void onConversionDataFail(String str);

    void onConversionDataSuccess(Map<String, Object> map);
}
