package com.bytedance.bae.webrtc;

import android.os.Build;
import com.bytedance.covode.number.Covode;

public final class BuildInfo {
    static {
        Covode.recordClassIndex(15402);
    }

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getSdkVersion() {
        return Build.VERSION.SDK_INT;
    }
}
