package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AndroidUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.c;
import com.bytedance.covode.number.Covode;

public final class af {
    static {
        Covode.recordClassIndex(2713);
    }

    af() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m129(Context context) {
        if (AppsFlyerLib.getInstance().isTrackingStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            if (AndroidUtils.m33(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
                return true;
            }
            AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
            return false;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m128(Context context, String str) {
        if (str != null) {
            AFLogger.afInfoLog("updateServerUninstallToken called with: ".concat(String.valueOf(str)));
            c.a.C0078c r3 = c.a.C0078c.m175(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            SharedPreferences sharedPreferences = AppsFlyerLibCore.getSharedPreferences(context);
            if (!sharedPreferences.getBoolean("sentRegisterRequestToAF", false) || r3.f236 == null || !r3.f236.equals(str)) {
                AppsFlyerProperties.getInstance().set("afUninstallToken", str);
                if (AppsFlyerLibCore.m46(sharedPreferences)) {
                    AppsFlyerLibCore.getInstance().m103(context, str);
                }
            }
        }
    }
}
