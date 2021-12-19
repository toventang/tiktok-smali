package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.bytedance.covode.number.Covode;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(2693);
    }

    public static String com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            try {
                String com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "referrer");
                if (!(com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null || AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", null) == null)) {
                    AppsFlyerLibCore.getInstance();
                    AppsFlyerLibCore.m39(context, com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    return;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
            }
            AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
            AppsFlyerLibCore.getInstance().m100(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
                String action = intent.getAction();
                if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                    AFLogger.afInfoLog(new StringBuilder("trigger onReceive: class: ").append(((PackageItemInfo) resolveInfo.activityInfo).name).toString());
                    try {
                        ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                    } catch (Throwable th2) {
                        AFLogger.afErrorLog(new StringBuilder("error in BroadcastReceiver ").append(((PackageItemInfo) resolveInfo.activityInfo).name).toString(), th2);
                    }
                }
            }
        }
    }
}
