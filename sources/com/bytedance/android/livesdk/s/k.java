package com.bytedance.android.livesdk.s;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import com.bytedance.android.live.core.f.ad;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f21158a = k.class.getCanonicalName();

    private k() {
    }

    static {
        Covode.recordClassIndex(12480);
    }

    private static String a() {
        return ((IHostContext) a.a(IHostContext.class)).getPackageName();
    }

    private static void h(Context context) {
        b(context, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
    }

    private static void i(Context context) {
        b(context, "android.settings.PICTURE_IN_PICTURE_SETTINGS");
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            h(context);
        } else {
            e(context);
        }
    }

    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            i(context);
        } else {
            e(context);
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return g(context);
    }

    private static void f(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (b(context, intent)) {
                a(context, intent);
            }
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.b(e2.getMessage());
        }
    }

    public static boolean d(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a(context, "appops");
            if (((Integer) appOpsManager.getClass().getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, 10021, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.b(f21158a, "not support", e2);
            return true;
        }
    }

    private static boolean g(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a(context, "appops");
            Method method = AppOpsManager.class.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class);
            Object[] objArr = new Object[3];
            objArr[0] = 24;
            objArr[1] = Integer.valueOf(Binder.getCallingUid());
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            objArr[2] = applicationContext.getPackageName();
            if (((Integer) method.invoke(appOpsManager, objArr)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private static void e(Context context) {
        String str = Build.MANUFACTURER;
        com.bytedance.android.live.core.c.a.a(6, k.class.getCanonicalName(), "jumpPermissionPage --- name : ".concat(String.valueOf(str)));
        str.hashCode();
        switch (str.hashCode()) {
            case -1678088054:
                if (str.equals("Coolpad")) {
                    a("com.yulong.android.security:remote", context);
                    return;
                }
                break;
            case -1675632421:
                if (str.equals("Xiaomi")) {
                    String a2 = ad.a("ro.miui.ui.version.name");
                    com.bytedance.android.live.core.c.a.a(6, f21158a, "goMiaoMiMainager --- rom : ".concat(String.valueOf(a2)));
                    Intent intent = new Intent();
                    if ("V6".equals(a2) || "V7".equals(a2)) {
                        intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                        intent.putExtra("extra_pkgname", a());
                    } else if ("V8".equals(a2) || "V9".equals(a2) || "V10".equals(a2)) {
                        intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                        intent.putExtra("extra_pkgname", a());
                    } else {
                        f(context);
                        return;
                    }
                    if (b(context, intent)) {
                        a(context, intent);
                        return;
                    }
                    return;
                }
                break;
            case 2427:
                if (str.equals("LG")) {
                    try {
                        Intent intent2 = new Intent(a());
                        intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
                        if (b(context, intent2)) {
                            a(context, intent2);
                            return;
                        } else {
                            f(context);
                            return;
                        }
                    } catch (Exception unused) {
                        f(context);
                        return;
                    }
                }
                break;
            case 2432928:
                if (str.equals("OPPO")) {
                    a("com.coloros.safecenter", context);
                    return;
                }
                break;
            case 2582855:
                if (str.equals("Sony")) {
                    try {
                        Intent intent3 = new Intent(a());
                        intent3.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
                        if (b(context, intent3)) {
                            a(context, intent3);
                            return;
                        } else {
                            f(context);
                            return;
                        }
                    } catch (Exception e2) {
                        com.bytedance.android.live.core.c.a.b(f21158a, "goSonyMainager: ", e2);
                        f(context);
                        return;
                    }
                }
                break;
            case 3620012:
                if (str.equals("vivo")) {
                    a("com.bairenkeji.icaller", context);
                    return;
                }
                break;
            case 74224812:
                if (str.equals("Meizu")) {
                    try {
                        Intent intent4 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                        intent4.addCategory("android.intent.category.DEFAULT");
                        intent4.putExtra("packageName", a());
                        if (b(context, intent4)) {
                            a(context, intent4);
                            return;
                        } else {
                            f(context);
                            return;
                        }
                    } catch (ActivityNotFoundException e3) {
                        com.bytedance.android.live.core.c.a.b(e3.getMessage());
                        f(context);
                        return;
                    }
                }
                break;
            case 1864941562:
                if (str.equals("samsung")) {
                    f(context);
                    return;
                }
                break;
            case 2141820391:
                if (str.equals("HUAWEI")) {
                    try {
                        Intent intent5 = new Intent(a());
                        intent5.setFlags(268435456);
                        intent5.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                        if (b(context, intent5)) {
                            a(context, intent5);
                            return;
                        } else {
                            f(context);
                            return;
                        }
                    } catch (Exception unused2) {
                        f(context);
                        return;
                    }
                }
                break;
        }
        f(context);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static boolean b(Context context, Intent intent) {
        if (context != null) {
            try {
                if (context.getPackageManager().resolveActivity(intent, 0) != null) {
                    return true;
                }
                return false;
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.b(e2.getMessage());
            }
        }
        return false;
    }

    private static void b(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (b(context, intent)) {
                a(context, intent);
            }
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.b(e2.getMessage());
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9189);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                    MethodCollector.o(9189);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void a(String str, Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                f(context);
                return;
            }
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(packageInfo.packageName);
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            com.bytedance.android.live.core.c.a.a(6, "PermissionPageManager", "resolveinfoList" + queryIntentActivities.size());
            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                com.bytedance.android.live.core.c.a.a(6, "PermissionPageManager", queryIntentActivities.get(i2).activityInfo.packageName + queryIntentActivities.get(i2).activityInfo.name);
            }
            try {
                ResolveInfo next = queryIntentActivities.iterator().next();
                if (next != null) {
                    String str2 = next.activityInfo.packageName;
                    String str3 = next.activityInfo.name;
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    intent2.setComponent(new ComponentName(str2, str3));
                    a(context, intent2);
                }
            } catch (Exception e2) {
                f(context);
                com.bytedance.android.live.core.c.a.b(f21158a, "doStartApplicationWithPackageName: ", e2);
            }
        } catch (PackageManager.NameNotFoundException e3) {
            com.bytedance.android.live.core.c.a.b(f21158a, "doStartApplicationWithPackageName: ", e3);
        }
    }
}
