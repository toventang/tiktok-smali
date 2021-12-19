package com.bytedance.geckox.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class a {
    static {
        Covode.recordClassIndex(17483);
    }

    public static float a() {
        long j2;
        if (Environment.getDataDirectory() != null) {
            j2 = a(Environment.getDataDirectory().getPath());
        } else {
            j2 = -1;
        }
        return ((float) j2) / 1048576.0f;
    }

    private static long a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static String b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            TextUtils.equals(packageName, d.a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable unused) {
            com.bytedance.geckox.i.a.a();
            return "";
        }
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            com.bytedance.geckox.i.a.a();
            return "null";
        }
    }
}
