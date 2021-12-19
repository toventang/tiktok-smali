package com.bytedance.ies.android.base.runtime.depend;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IHostContextDepend {
    static {
        Covode.recordClassIndex(18658);
    }

    int getAppId();

    String getAppName();

    Application getApplication();

    Context getApplicationContext();

    String getBoeChannel();

    String getChannel();

    String getCurrentTelcomCarrier();

    String getDeviceId();

    String getLanguage();

    String getPPEChannel();

    String getPackageName();

    String getRegion();

    String getSkinName();

    String getSkinType();

    String getUpdateVersion();

    String getUserAgent();

    long getVersionCode();

    String getVersionName();

    boolean isBoeEnable();

    boolean isDebuggable();

    boolean isMiniAppEnable();

    boolean isPPEEnable();

    boolean isTeenMode();
}
