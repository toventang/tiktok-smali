package com.google.android.gms.common.c;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.google.android.gms.common.util.k;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f50294a;

    static {
        Covode.recordClassIndex(31352);
    }

    public static String[] a(PackageManager packageManager, int i2) {
        Pair<Boolean, Object> a2 = a.a(packageManager, new Object[]{Integer.valueOf(i2)}, 101310, "java.lang.String[]", false, null);
        if (((Boolean) a2.first).booleanValue()) {
            return (String[]) a2.second;
        }
        String[] packagesForUid = packageManager.getPackagesForUid(i2);
        a.a(packagesForUid, packageManager, new Object[]{Integer.valueOf(i2)}, 101310, "com_google_android_gms_common_wrappers_PackageManagerWrapper_android_content_pm_PackageManager_getPackagesForUid(Landroid/content/pm/PackageManager;I)[Ljava/lang/String;");
        return packagesForUid;
    }

    public final boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f50294a);
        }
        if (!k.e() || (nameForUid = this.f50294a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f50294a.getPackageManager().isInstantApp(nameForUid);
    }

    public b(Context context) {
        this.f50294a = context;
    }

    public final int a(String str) {
        return this.f50294a.checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo a(String str, int i2) {
        return a(this.f50294a.getPackageManager(), str, i2);
    }

    public final PackageInfo b(String str, int i2) {
        return this.f50294a.getPackageManager().getPackageInfo(str, i2);
    }

    public final boolean a(int i2, String str) {
        int i3 = Build.VERSION.SDK_INT;
        try {
            ((AppOpsManager) a(this.f50294a, "appops")).checkPackage(i2, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9818);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9818);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static ApplicationInfo a(PackageManager packageManager, String str, int i2) {
        if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName()) || i2 != 128) {
            return packageManager.getApplicationInfo(str, i2);
        }
        if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
            com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, i2);
        }
        return com.ss.android.ugc.aweme.lancet.c.b.f107191a;
    }
}
