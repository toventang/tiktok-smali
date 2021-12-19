package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.bytedance.android.live.base.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.io.File;
import java.util.Locale;

public interface IHostContext extends a {
    static {
        Covode.recordClassIndex(13785);
    }

    int appId();

    String appName();

    Context context();

    Locale currentLocale();

    void enterRecorderActivity(Activity activity);

    String getBoeLane();

    String getChannel();

    EffectManager getEffectManager();

    Pair<String, String> getFreeFlowModel();

    String getIapKey();

    int getLastVersionCode();

    String getPackageName();

    String getPpeLane();

    Object getResourceFinder(Context context, String str);

    String getServerDeviceId();

    String getTTLiveGeckoCdnUrl(String str, String str2);

    File getTTLiveGeckoResourceFile(String str, String str2);

    String getTTLiveGeckoResourcePath(String str, String str2);

    String getTTLiveGeckoResourcePathAndUrl(String str, String str2);

    int getUpdateVersionCode();

    String getVersionCode();

    boolean isBoe();

    boolean isLocalTest();

    boolean isNeedProtectMinor();

    boolean isOffline();

    boolean isPpe();

    int liveId();

    void refreshClientABTestValues();
}
