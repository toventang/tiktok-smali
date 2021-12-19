package com.ss.android.ugc.aweme.secapi;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.secapi.a.a;

public interface ISecApi {
    static {
        Covode.recordClassIndex(79333);
    }

    void dismissCaptcha();

    void initSec(Context context, String str, int i2, String str2, String str3, boolean z, b bVar);

    void initTask();

    boolean isCaptchaUrl(String str);

    boolean needVerifyImage(int i2);

    String onEvent();

    void popCaptcha(Activity activity, int i2, a aVar);

    void popCaptchaV2(Activity activity, String str, a aVar);

    void reportData(String str);

    void setParams();

    void updateCollectMode(a aVar);

    void updateDeviceIdAndInstallId(String str, String str2);
}
