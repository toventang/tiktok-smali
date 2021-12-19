package com.ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.miniapp_api.b.a;
import com.ss.android.ugc.aweme.miniapp_api.b.b;
import java.util.Locale;
import org.json.JSONObject;

public interface IMiniAppService {
    static {
        Covode.recordClassIndex(70225);
    }

    String addScene(String str, String str2);

    boolean checkMiniAppEnable(Context context);

    String getJsSdkVersion(Application application);

    a getMobClickCombinerIpcService();

    void getShareInfo(String str, b bVar);

    b getTTDownloaderIpcService();

    void handleActivityImageResult(int i2, int i3, Intent intent);

    void initMiniApp(a aVar);

    void initWebViewSuffix(ContextWrapper contextWrapper, String str);

    boolean isMinAppAvailable(Context context, String str);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logExcitingVideoAd(Context context, String str, long j2, String str2);

    void notifyFollowAwemeState(int i2);

    void notifyLocaleChange(Locale locale);

    void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr);

    boolean openMiniApp(Context context, com.ss.android.ugc.aweme.miniapp_api.model.b bVar, com.ss.android.ugc.aweme.miniapp_api.model.b.a aVar);

    boolean openMiniApp(Context context, String str, com.ss.android.ugc.aweme.miniapp_api.model.b.a aVar);

    boolean openShortcut(Context context, Intent intent);

    void preloadMiniApp(String str);

    void preloadMiniApp(String str, int i2);

    void remoteMobV3(String str, JSONObject jSONObject);

    String setLaunchModeHostTask(String str);

    void tryMoveMiniAppActivityToFront(String str);
}
