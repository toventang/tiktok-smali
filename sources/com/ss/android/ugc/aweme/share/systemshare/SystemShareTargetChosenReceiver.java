package com.ss.android.ugc.aweme.share.systemshare;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.c.a.a.a.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.r;

public class SystemShareTargetChosenReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(81663);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String a(Context context, ComponentName componentName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = componentName.getPackageName();
            TextUtils.equals(packageName, d.a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            b.a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && context != null && Build.VERSION.SDK_INT >= 22) {
            try {
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                if (componentName != null) {
                    String str = null;
                    String a2 = a(intent, "extra_type");
                    if (!m.a(a2)) {
                        str = a(context, componentName, a2);
                    }
                    if (m.a(str)) {
                        str = a(context, componentName);
                    }
                    r.a("share_video_more_track", new com.ss.android.ugc.aweme.app.f.d().a("platform", str).a("package_name", componentName.getPackageName()).a("component_name", componentName.getClassName()).f66730a);
                }
            } catch (Exception unused) {
            }
        }
    }

    private static String a(Context context, ComponentName componentName, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
                if (resolveInfo.activityInfo != null && m.a(resolveInfo.activityInfo.name, componentName.getClassName()) && m.a(resolveInfo.activityInfo.packageName, componentName.getPackageName())) {
                    return resolveInfo.loadLabel(packageManager).toString();
                }
            }
            return "";
        } catch (Throwable th) {
            b.a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }
}
