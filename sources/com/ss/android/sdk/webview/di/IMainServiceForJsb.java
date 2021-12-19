package com.ss.android.sdk.webview.di;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IMainServiceForJsb {
    static {
        Covode.recordClassIndex(37175);
    }

    String getJSSDKConfigUrl();

    String getPlayNameMobile();

    String getSSLocalScheme();

    boolean hasPlatformBinded();

    boolean isApiSuccess(JSONObject jSONObject);

    boolean isPlatformBinded(String str);

    void startAdsAppActivity(Activity activity, String str);
}
