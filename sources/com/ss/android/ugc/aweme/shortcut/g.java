package com.ss.android.ugc.aweme.shortcut;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class g {
    static {
        Covode.recordClassIndex(81944);
    }

    public static boolean a(Context context, String str) {
        Context createPackageContext;
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(2097152);
        intent.addFlags(1048576);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 1);
        int i2 = 0;
        while (true) {
            if (i2 >= queryIntentActivities.size()) {
                break;
            }
            ResolveInfo resolveInfo = queryIntentActivities.get(i2);
            if (resolveInfo.activityInfo.packageName.equals(str)) {
                String charSequence = resolveInfo.loadLabel(packageManager).toString();
                String str2 = resolveInfo.activityInfo.name;
                int i3 = resolveInfo.activityInfo.applicationInfo.icon;
                if (str2 != null) {
                    Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                    intent2.putExtra("android.intent.extra.shortcut.NAME", charSequence);
                    intent2.putExtra("duplicate", false);
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", intent.setComponent(new ComponentName(str, str2)));
                    if (context.getPackageName().equals(str)) {
                        createPackageContext = context;
                    } else {
                        try {
                            createPackageContext = context.createPackageContext(str, 3);
                            if (createPackageContext != null) {
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        context.sendBroadcast(intent2);
                        return true;
                    }
                    intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, i3));
                    context.sendBroadcast(intent2);
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }
}
