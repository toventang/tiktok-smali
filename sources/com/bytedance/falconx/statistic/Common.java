package com.bytedance.falconx.statistic;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class Common {
    @c(a = "app_version")
    public String appVersion;
    @c(a = "device_id")
    public String deviceId;
    @c(a = "device_model")
    public String deviceModel = Build.MODEL;
    @c(a = "os")
    public int os;
    @c(a = "region")
    public String region;
    @c(a = "sdk_version")
    public String sdkVersion = "3.0.0-rc.4-mt";

    static {
        Covode.recordClassIndex(16930);
    }
}
