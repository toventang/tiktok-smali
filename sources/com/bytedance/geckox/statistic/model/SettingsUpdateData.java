package com.bytedance.geckox.statistic.model;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Map;

public class SettingsUpdateData {
    @c(a = "ac")
    public String ac;
    @c(a = "aid")
    public long aid;
    @c(a = "api_version")
    public String apiVersion;
    @c(a = "app_version")
    public String appVersion;
    @c(a = "device_id")
    public String deviceId;
    @c(a = "device_model")
    private String deviceModel = Build.MODEL;
    @c(a = "err_code")
    public int errCode;
    @c(a = "err_msg")
    public String errorMsg;
    @c(a = "http_status")
    public int httpStatus;
    @c(a = "x_tt_logid")
    public String logId;
    @c(a = "os")
    private int os;
    @c(a = "os_version")
    public String osVersion = String.valueOf(Build.VERSION.SDK_INT);
    @c(a = "params_for_special")
    private String paramsForSpecial = "gecko";
    @c(a = "region")
    public String region;
    @c(a = "req_type")
    public int reqType = 1;
    @c(a = "sdk_version")
    private String sdkVersion = "3.0.0-rc.4-mt";
    @c(a = "settings_info")
    public String settingsInfo;

    static {
        Covode.recordClassIndex(17474);
    }

    public static String getLogId(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("x-tt-logid");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = map.get("X-Tt-Logid");
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String str3 = map.get("X-TT-LOGID");
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }
}
