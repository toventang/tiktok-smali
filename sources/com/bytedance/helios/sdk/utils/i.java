package com.bytedance.helios.sdk.utils;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.b.a;
import h.m.p;
import java.util.HashMap;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, Integer> f31017a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static SparseArray<a> f31018b;

    /* renamed from: c  reason: collision with root package name */
    public static final i f31019c = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(18013);
        f31018b = new SparseArray<>(0);
        SparseArray<a> sparseArray = new SparseArray<>(85);
        f31018b = sparseArray;
        sparseArray.append(100000, new a(100000, 1, 2, "android/location/LocationManager", "getLastKnownLocation", "", "[]", "", "", ""));
        f31018b.append(100001, new a(100001, 1, 2, "android/location/LocationManager", "requestLocationUpdates", "", "[]", "", "", ""));
        f31018b.append(100002, new a(100002, 1, 2, "android/location/LocationManager", "requestSingleUpdate", "", "[]", "", "", ""));
        f31018b.append(100003, new a(100003, 4, 3, "android/webkit/WebChromeClient", "onGeolocationPermissionsShowPrompt", "", "[]", "", "", ""));
        f31018b.append(100004, new a(100004, 1, 2, "android/location/LocationManager", "getCurrentLocation", "", "[]", "", "", ""));
        f31018b.append(100005, new a(100005, 1, 2, "android/location/LocationManager", "addGpsStatusListener", "", "[]", "", "", ""));
        f31018b.append(100006, new a(100006, 1, 2, "android/location/LocationManager", "addNmeaListener", "", "[]", "", "", ""));
        f31018b.append(100007, new a(100007, 1, 2, "android/location/LocationManager", "addProximityAlert", "", "[]", "", "", ""));
        f31018b.append(100008, new a(100008, 1, 2, "android/location/LocationManager", "registerAntennaInfoListener", "", "[]", "", "", ""));
        f31018b.append(100009, new a(100009, 1, 2, "android/location/LocationManager", "registerGnssMeasurementsCallback", "", "[]", "", "", ""));
        f31018b.append(100010, new a(100010, 1, 2, "android/location/LocationManager", "registerGnssNavigationMessageCallback", "", "[]", "", "", ""));
        f31018b.append(100011, new a(100011, 1, 2, "android/location/LocationManager", "registerGnssStatusCallback", "", "[]", "", "", ""));
        f31018b.append(100012, new a(100012, 1, 2, "android/webkit/GeolocationPermissions$Callback", "invoke", "", "[]", "", "", ""));
        f31018b.append(100013, new a(100013, 1, 2, "android/location/LocationManager", "getProviders", "", "[]", "", "", ""));
        f31018b.append(100100, new a(100100, 2, 2, "android/hardware/Camera", "open", "", "[]", "", "", ""));
        f31018b.append(100101, new a(100101, 2, 2, "android/hardware/Camera", "release", "", "[]", "", "", ""));
        f31018b.append(100106, new a(100106, 1, 2, "android/hardware/Camera", "release", "", "[]", "", "", ""));
        f31018b.append(100200, new a(100200, 4, 3, "android/hardware/camera2/CameraDevice$StateCallback", "onOpened", "", "[]", "", "", ""));
        f31018b.append(100201, new a(100201, 2, 2, "android/hardware/camera2/CameraDevice", "close", "", "[]", "", "", ""));
        f31018b.append(100205, new a(100205, 1, 2, "android/hardware/camera2/CameraDevice", "close", "", "[]", "", "", ""));
        f31018b.append(100400, new a(100400, 2, 2, "android/media/AudioRecord", "startRecording", "", "[]", "", "", ""));
        f31018b.append(100401, new a(100401, 2, 2, "android/media/AudioRecord", "stop", "", "[]", "", "", ""));
        f31018b.append(100403, new a(100403, 2, 2, "android/media/AudioRecord", "release", "", "[]", "", "", ""));
        f31018b.append(100404, new a(100404, 1, 2, "android/media/AudioRecord", "stop", "", "[]", "", "", ""));
        f31018b.append(100405, new a(100405, 1, 2, "android/media/AudioRecord", "release", "", "[]", "", "", ""));
        f31018b.append(100500, new a(100500, 2, 2, "android/media/MediaRecorder", "prepare", "", "[]", "", "", ""));
        f31018b.append(100501, new a(100501, 2, 2, "android/media/MediaRecorder", "release", "", "[]", "", "", ""));
        f31018b.append(100502, new a(100502, 2, 2, "android/media/MediaRecorder", "start", "", "[]", "", "", ""));
        f31018b.append(100503, new a(100503, 2, 2, "android/media/MediaRecorder", "stop", "", "[]", "", "", ""));
        f31018b.append(100900, new a(100900, 2, 2, "android/telephony/TelephonyManager", "getCellLocation", "", "[]", "", "", ""));
        f31018b.append(100901, new a(100901, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getBaseStationId", "", "[]", "", "", ""));
        f31018b.append(100902, new a(100902, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getBaseStationLatitude", "", "[]", "", "", ""));
        f31018b.append(100903, new a(100903, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getBaseStationLongitude", "", "[]", "", "", ""));
        f31018b.append(100904, new a(100904, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getSystemId", "", "[]", "", "", ""));
        f31018b.append(100905, new a(100905, 2, 2, "android/telephony/cdma/CdmaCellLocation", "getNetworkId", "", "[]", "", "", ""));
        f31018b.append(100906, new a(100906, 2, 2, "android/telephony/gsm/GsmCellLocation", "getCid", "", "[]", "", "", ""));
        f31018b.append(100907, new a(100907, 2, 2, "android/telephony/gsm/GsmCellLocation", "getLac", "", "[]", "", "", ""));
        f31018b.append(100908, new a(100908, 2, 2, "android/telephony/gsm/GsmCellLocation", "getPsc", "", "[]", "", "", ""));
        f31018b.append(100909, new a(100909, 2, 2, "android/telephony/TelephonyManager", "getAllCellInfo", "", "[]", "", "", ""));
        f31018b.append(100910, new a(100910, 2, 2, "android/telephony/TelephonyManager", "requestCellInfoUpdate", "", "[]", "", "", ""));
        f31018b.append(100911, new a(100911, 4, 3, "android/telephony/PhoneStateListener", "onCellLocationChanged", "", "[]", "", "", ""));
        f31018b.append(100912, new a(100912, 4, 3, "android/telephony/PhoneStateListener", "onCellInfoChanged", "", "[]", "", "", ""));
        f31018b.append(101000, new a(101000, 2, 2, "android/net/wifi/WifiInfo", "getSSID", "", "[]", "", "", ""));
        f31018b.append(101001, new a(101001, 2, 2, "android/net/wifi/WifiManager", "getConfiguredNetworks", "", "[]", "", "", ""));
        f31018b.append(101100, new a(101100, 2, 2, "android/net/wifi/WifiInfo", "getBSSID", "", "[]", "", "", ""));
        f31018b.append(101200, new a(101200, 2, 2, "android/os/Build", "getSerial", "", "[]", "", "", ""));
        f31018b.append(101300, new a(101300, 2, 2, "android/app/ActivityManager", "getRecentTasks", "", "[]", "", "", ""));
        f31018b.append(101301, new a(101301, 2, 2, "android/app/ActivityManager", "getRunningTasks", "", "[]", "", "", ""));
        f31018b.append(101304, new a(101304, 2, 2, "android/content/pm/PackageManager", "getInstalledApplications", "", "[]", "", "", ""));
        f31018b.append(101305, new a(101305, 2, 2, "android/content/pm/PackageManager", "getInstalledApplicationsAsUser", "", "[]", "", "", ""));
        f31018b.append(101306, new a(101306, 2, 2, "android/view/accessibility/AccessibilityManager", "getInstalledAccessibilityServiceList", "", "[]", "", "", ""));
        f31018b.append(101308, new a(101308, 2, 2, "android/content/pm/PackageManager", "getInstalledPackagesAsUser", "", "[]", "", "", ""));
        f31018b.append(101309, new a(101309, 2, 2, "android/content/pm/PackageManager", "getInstalledPackages", "", "[]", "", "", ""));
        f31018b.append(101310, new a(101310, 2, 2, "android/content/pm/PackageManager", "getPackagesForUid", "", "[]", "", "", ""));
        f31018b.append(101400, new a(101400, 2, 2, "android/telephony/TelephonyManager", "getSimSerialNumber", "", "[]", "", "", ""));
        f31018b.append(101500, new a(101500, 2, 2, "android/telephony/SubscriptionInfo", "getIccId", "", "[]", "", "", ""));
        f31018b.append(101600, new a(101600, 2, 2, "android/telephony/TelephonyManager", "getDeviceId", "", "[]", "", "", ""));
        f31018b.append(101601, new a(101601, 2, 2, "android/telephony/TelephonyManager", "getImei", "", "[]", "", "", ""));
        f31018b.append(101602, new a(101602, 2, 2, "android/telephony/TelephonyManager", "getMeid", "", "[]", "", "", ""));
        f31018b.append(101700, new a(101700, 2, 2, "android/net/wifi/WifiInfo", "getMacAddress", "", "[]", "", "", ""));
        f31018b.append(101701, new a(101701, 2, 2, "java/net/NetworkInterface", "getHardwareAddress", "", "[]", "", "", ""));
        f31018b.append(101800, new a(101800, 2, 2, "android/content/ClipboardManager", "clearPrimaryClip", "", "[]", "", "", ""));
        f31018b.append(101801, new a(101801, 2, 2, "android/content/ClipboardManager", "addPrimaryClipChangedListener", "", "[]", "", "", ""));
        f31018b.append(101802, new a(101802, 2, 2, "android/content/ClipboardManager", "removePrimaryClipChangedListener", "", "[]", "", "", ""));
        f31018b.append(101803, new a(101803, 2, 2, "android/content/ClipboardManager", "getPrimaryClip", "", "[]", "", "", ""));
        f31018b.append(101804, new a(101804, 2, 2, "android/content/ClipboardManager", "getText", "", "[]", "", "", ""));
        f31018b.append(101805, new a(101805, 2, 2, "android/content/ClipboardManager", "hasPrimaryClip", "", "[]", "", "", ""));
        f31018b.append(101806, new a(101806, 2, 2, "android/content/ClipboardManager", "hasText", "", "[]", "", "", ""));
        f31018b.append(101807, new a(101807, 2, 2, "android/content/ClipboardManager", "setPrimaryClip", "", "[]", "", "", ""));
        f31018b.append(101808, new a(101808, 2, 2, "android/content/ClipboardManager", "setText", "", "[]", "", "", ""));
        f31018b.append(101809, new a(101809, 2, 2, "android/content/ClipboardManager", "getPrimaryClipDescription", "", "[]", "", "", ""));
        f31018b.append(101900, new a(101900, 2, 2, "android/telephony/TelephonyManager", "getSubscriberId", "", "[]", "", "", ""));
        f31018b.append(102000, new a(102000, 2, 2, "android/telephony/TelephonyManager", "getLine1Number", "", "[]", "", "", ""));
        f31018b.append(102001, new a(102001, 2, 2, "android/telephony/TelephonyManager", "getVoiceMailNumber", "", "[]", "", "", ""));
        f31018b.append(102100, new a(102100, 2, 2, "android/media/projection/MediaProjectionManager", "createScreenCaptureIntent", "", "[]", "", "", ""));
        f31018b.append(102101, new a(102101, 2, 2, "android/media/projection/MediaProjectionManager", "getMediaProjection", "", "[]", "", "", ""));
        f31018b.append(102102, new a(102102, 2, 2, "android/media/projection/MediaProjection", "stop", "", "[]", "", "", ""));
        f31018b.append(102300, new a(102300, 2, 2, "android/net/wifi/WifiManager", "getScanResults", "", "[]", "", "", ""));
        f31018b.append(102500, new a(102500, 2, 2, "android/accounts/AccountManager", "getAccounts", "", "[]", "", "", ""));
        f31018b.append(102501, new a(102501, 2, 2, "android/accounts/AccountManager", "getAccountsByType", "", "[]", "", "", ""));
        f31018b.append(102502, new a(102502, 2, 2, "android/accounts/AccountManager", "getAccountsByTypeAndFeatures", "", "[]", "", "", ""));
        f31018b.append(102600, new a(102600, 1, 2, "android/app/Activity", "requestPermissions", "", "[]", "", "", ""));
        f31018b.append(102800, new a(102800, 2, 2, "android/view/WindowManager", "addView", "", "[]", "", "", ""));
        f31018b.append(102801, new a(102801, 2, 2, "android/view/WindowManager", "removeView", "", "[]", "", "", ""));
        f31018b.append(110000, new a(110000, 2, 2, "java/lang/reflect/Method", "invoke", "", "[]", "", "", ""));
        a();
    }

    private static void a() {
        f31017a = new HashMap<>(f31018b.size());
        int size = f31018b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a valueAt = f31018b.valueAt(i2);
            f31017a.put(p.a(valueAt.f30792d, "/", ".") + '.' + valueAt.f30793e, Integer.valueOf(valueAt.f30789a));
        }
    }
}
