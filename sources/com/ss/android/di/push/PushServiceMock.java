package com.ss.android.di.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class PushServiceMock implements IPushApi {
    static {
        Covode.recordClassIndex(36722);
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean checkChannelStatus(Context context, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearAll(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void clearNotificationId(String str, Context context, int i2) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public w getCancelNotiTask() {
        return null;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public String getRealChannelId(String str) {
        return "";
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void init(Context context, a aVar) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initImmediately(Context context, a aVar) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initMessageDepend() {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initNotificationChannel() {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void initPushAccountService(boolean z) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotificationIdContains(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isPushProcess(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public int isPushVideoPreload(long j2) {
        return 0;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public boolean isSswoAct(Activity activity) {
        return false;
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i2, String str, int i3, String str2) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void removeRedBadge(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void setAutoDisappear(int i2) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public void startPushProcess(Context context) {
    }

    @Override // com.ss.android.ugc.awemepushapi.IPushApi
    public List<String> getFromNotificationIds() {
        return new ArrayList();
    }
}
