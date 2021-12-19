package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;

public final class c {
    static {
        Covode.recordClassIndex(724);
    }

    public static int a(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    private static int a(Context context, String str, int i2, int i3, String str2) {
        String str3;
        String[] packagesForUid;
        String str4 = str2;
        if (context.checkPermission(str, i2, i3) == -1) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            str3 = AppOpsManager.permissionToOp(str);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            return 0;
        }
        if (str4 == null) {
            PackageManager packageManager = context.getPackageManager();
            Pair<Boolean, Object> a2 = a.a(packageManager, new Object[]{Integer.valueOf(i3)}, 101310, "java.lang.String[]", false, null);
            if (((Boolean) a2.first).booleanValue()) {
                packagesForUid = (String[]) a2.second;
            } else {
                packagesForUid = packageManager.getPackagesForUid(i3);
                a.a(packagesForUid, packageManager, new Object[]{Integer.valueOf(i3)}, 101310, "androidx_core_content_PermissionChecker_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
            }
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str4 = packagesForUid[0];
        }
        if (Build.VERSION.SDK_INT < 23 || ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str3, str4) != 0) {
            return -2;
        }
        return 0;
    }
}
