package com.ss.android.ugc.awemepushapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public interface IPushApi {
    static {
        Covode.recordClassIndex(95037);
    }

    boolean checkChannelStatus(Context context, String str);

    void clearAll(Context context);

    void clearNotificationId(String str, Context context, int i2);

    Object getCancelNotiTask();

    List<String> getFromNotificationIds();

    String getRealChannelId(String str);

    void init(Context context, a aVar);

    void initImmediately(Context context, a aVar);

    void initMessageDepend();

    void initNotificationChannel();

    void initPushAccountService(boolean z);

    boolean isNotificationIdContains(String str);

    boolean isPushProcess(Context context);

    int isPushVideoPreload(long j2);

    boolean isSswoAct(Activity activity);

    void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri);

    void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i2, String str, int i3, String str2);

    void removeRedBadge(Context context);

    void setAutoDisappear(int i2);

    void startPushProcess(Context context);
}
