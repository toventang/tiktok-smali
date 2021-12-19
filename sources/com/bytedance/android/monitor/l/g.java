package com.bytedance.android.monitor.l;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;

public final class g {
    static {
        Covode.recordClassIndex(13982);
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0;
        }
    }
}
