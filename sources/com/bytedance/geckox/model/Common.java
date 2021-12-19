package com.bytedance.geckox.model;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class Common {
    @c(a = "ac")
    public String ac;
    @c(a = "aid")
    public long aid;
    @c(a = "app_name")
    public String appName;
    @c(a = "app_version")
    public String appVersion;
    @c(a = "device_id")
    public String deviceId;
    @c(a = "device_model")
    public String deviceModel = Build.MODEL;
    @c(a = "device_platform")
    public String devicePlatform = "android";
    @c(a = "os")
    public int os;
    @c(a = "os_version")
    public String osVersion = new StringBuilder().append(Build.VERSION.SDK_INT).toString();
    @c(a = "region")
    public String region;
    @c(a = "sdk_version")
    public String sdkVersion = "3.0.0-rc.4-mt";

    static {
        Covode.recordClassIndex(17373);
    }

    public Common(long j2, String str, String str2, String str3) {
        this.aid = j2;
        this.appVersion = str;
        this.deviceId = str2;
        this.region = str3;
    }

    public Common(long j2, String str, String str2, String str3, String str4) {
        this.aid = j2;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
    }
}
