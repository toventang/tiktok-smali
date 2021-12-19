package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(2698);
    }

    public static String com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                String com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "referrer");
                if (!(com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null || AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", null) == null)) {
                    AppsFlyerLibCore.getInstance();
                    AppsFlyerLibCore.m39(context, com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    return;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
            }
            String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
            long currentTimeMillis = System.currentTimeMillis();
            if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
                AppsFlyerLibCore.getInstance().m100(context, intent);
                AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
