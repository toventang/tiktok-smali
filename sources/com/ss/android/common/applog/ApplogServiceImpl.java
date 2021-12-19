package com.ss.android.common.applog;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.service.middleware.applog.ApplogService;
import com.service.middleware.applog.a;
import org.json.JSONObject;

public class ApplogServiceImpl implements ApplogService {
    public static final String TAG = ApplogServiceImpl.class.getSimpleName();
    public static volatile a cachedHeaderCustomTimelyCallback = null;
    public static volatile boolean isServicePrepared = false;

    public static int com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static void handleCachedData() {
        if (isServicePrepared && cachedHeaderCustomTimelyCallback != null) {
            AppLog.registerHeaderCustomCallback(cachedHeaderCustomTimelyCallback);
        }
    }

    static {
        Covode.recordClassIndex(36592);
    }

    @Override // com.service.middleware.applog.ApplogService
    public void registerHeaderCustomCallback(a aVar) {
        if (isServicePrepared) {
            AppLog.registerHeaderCustomCallback(aVar);
        } else {
            cachedHeaderCustomTimelyCallback = aVar;
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str) {
        if (isServicePrepared) {
            s.a(context, "event_v1", str, null, 0, 0, false, null);
        } else {
            com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2) {
        if (isServicePrepared) {
            s.a(context, "event_v1", str, str2, 0, 0, false, null);
        } else {
            com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j2, long j3) {
        if (isServicePrepared) {
            s.a(context, str, str2, str3, j2, j3, false, null);
        } else {
            com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        if (isServicePrepared) {
            s.a(context, str, str2, str3, j2, j3, false, jSONObject);
        } else {
            com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j2, long j3, boolean z) {
        if (isServicePrepared) {
            s.a(context, str, str2, str3, j2, j3, z, null);
        } else {
            com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "ApplogService not prepared!");
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
        if (isServicePrepared) {
            s.a(context, str, str2, str3, j2, j3, z, jSONObject);
        } else {
            com_ss_android_common_applog_ApplogServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(TAG, "ApplogService not prepared!");
        }
    }
}
