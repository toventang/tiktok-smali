package com.bytedance.router.net;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.ss.android.ugc.aweme.lancet.c.b;
import java.util.HashMap;
import java.util.Map;

public class SmartRouterApi {
    private static Map<String, String> sCommonParams;

    public static class ApiResult<T> {
        public int errorCode = -1;
        public T result;

        static {
            Covode.recordClassIndex(26190);
        }
    }

    static {
        Covode.recordClassIndex(26189);
    }

    public static boolean reportRouterConfig(Context context, ServerParam serverParam, RouterConfig routerConfig) {
        return false;
    }

    private static Map<String, String> getCommonParams(Context context) {
        Map<String, String> map = sCommonParams;
        if (map != null) {
            return map;
        }
        sCommonParams = new HashMap();
        try {
            sCommonParams.put("version_code", String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode));
            Bundle bundle = com_bytedance_router_net_SmartRouterApi_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(context.getPackageManager(), context.getPackageName(), 128).metaData;
            if (bundle != null) {
                sCommonParams.put("update_version_code", String.valueOf(bundle.getInt("UPDATE_VERSION_CODE")));
            }
            sCommonParams.put("device_platform", "android");
            sCommonParams.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        } catch (Exception e2) {
            sCommonParams = null;
            e2.printStackTrace();
        }
        return sCommonParams;
    }

    private static String getRouterConfigTag(Context context) {
        Map<String, String> commonParams = getCommonParams(context);
        String str = "";
        if (commonParams == null) {
            return str;
        }
        String str2 = sCommonParams.get("version_code");
        String str3 = sCommonParams.get("update_version_code");
        if (!TextUtils.isEmpty(str2)) {
            str = str + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            return str + "_" + str2;
        }
        return str;
    }

    public static ApiResult<RouterConfig> requestConfig(Context context, ServerParam serverParam) {
        return new ApiResult<>();
    }

    public static ApplicationInfo com_bytedance_router_net_SmartRouterApi_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getApplicationInfo(PackageManager packageManager, String str, int i2) {
        if (!TextUtils.equals(str, d.a().getPackageName()) || i2 != 128) {
            return packageManager.getApplicationInfo(str, i2);
        }
        if (b.f107191a == null) {
            b.f107191a = packageManager.getApplicationInfo(str, i2);
        }
        return b.f107191a;
    }
}
