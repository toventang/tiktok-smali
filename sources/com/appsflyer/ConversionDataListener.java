package com.appsflyer;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface ConversionDataListener {
    static {
        Covode.recordClassIndex(2682);
    }

    void onConversionDataLoaded(Map<String, Object> map);

    void onConversionFailure(String str);
}
