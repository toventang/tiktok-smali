package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class ShareInviteHelper {
    static {
        Covode.recordClassIndex(2784);
    }

    public static LinkGenerator generateInviteUrl(Context context) {
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        LinkGenerator addParameter = new LinkGenerator("af_app_invites").setBaseURL(string, string2, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(AppsFlyerProperties.getInstance().getString("AppUserId")).addParameter("af_siteid", context.getPackageName());
        String string3 = AppsFlyerProperties.getInstance().getString("onelinkScheme");
        if (string3 != null && string3.length() > 3) {
            addParameter.setBaseDeeplink(string3);
        }
        return addParameter;
    }

    public static void trackInvite(Context context, String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            AFLogger.afWarnLog("[Invite] Cannot track App-Invite with null/empty channel");
        } else if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track Invite is disabled", true);
        } else {
            LinkGenerator generateInviteUrl = generateInviteUrl(context);
            generateInviteUrl.addParameters(map);
            AFLogger.afDebugLog("[Invite] Tracking App-Invite via channel: ".concat(String.valueOf(str)));
            AFLogger.afDebugLog(new StringBuilder("[Invite] Generated URL: ").append(generateInviteUrl.generateLink()).toString());
            String mediaSource = generateInviteUrl.getMediaSource();
            if ("af_app_invites".equals(mediaSource)) {
                mediaSource = "af_invite";
            } else if ("af_user_share".equals(mediaSource)) {
                mediaSource = "af_share";
            }
            HashMap hashMap = new HashMap();
            if (generateInviteUrl.getParameters() != null) {
                hashMap.putAll(generateInviteUrl.getParameters());
            }
            hashMap.put("af_channel", str);
            AppsFlyerLib.getInstance().trackEvent(context, mediaSource, hashMap);
        }
    }

    public static void generateUserInviteLink(Context context, String str, Map<String, String> map, CreateOneLinkHttpTask.ResponseListener responseListener) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(str, map, AppsFlyerLibCore.getInstance(), context, AppsFlyerLib.getInstance().isTrackingStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }
}
