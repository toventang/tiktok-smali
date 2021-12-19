package com.snapchat.kit.sdk.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import java.io.File;

public final class b {
    static {
        Covode.recordClassIndex(35561);
    }

    private static String a(Context context) {
        return context.getPackageName() + ".fileprovider";
    }

    public static Uri a(Context context, File file) {
        if (file == null) {
            return null;
        }
        return FileProvider.getUriForFile(context, a(context), file);
    }

    public static boolean a(PackageManager packageManager, String str) {
        try {
            TextUtils.equals(str, d.a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (!applicationInfo.enabled || packageInfo.versionCode < 1729) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
