package com.ss.android.ugc.aweme.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.c.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cp {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Intent> f142787a = new ArrayList();

    static {
        Covode.recordClassIndex(93400);
    }

    private static boolean a() {
        try {
            String trim = c.a("ro.miui.ui.version.name").trim();
            if (trim == null || trim.isEmpty() || Integer.valueOf(trim.substring(1)).intValue() < 125) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public static void a(Context context) {
        if (context != null) {
            b(context);
            if ((a.a() || !c(context)) && !d(context)) {
                e(context);
            }
        }
    }

    private static boolean e(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
            intent.addFlags(268435456);
            a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean d(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void b(Context context) {
        List<Intent> list = f142787a;
        if (list.size() == 0) {
            String packageName = context.getPackageName();
            Intent component = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
            component.putExtra("pkg_name", packageName);
            component.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
            component.putExtra("class_name", cp.class.getName());
            list.add(component);
            Intent component2 = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionAppAllPermissionActivity"));
            component2.putExtra("packageName", packageName);
            list.add(component2);
            Intent component3 = new Intent().setComponent(new ComponentName("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
            component3.putExtra("android.intent.extra.PACKAGE_NAME", packageName);
            list.add(component3);
        }
    }

    private static boolean c(Context context) {
        Intent intent;
        try {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (TextUtils.equals(lowerCase, "oppo") && Build.VERSION.SDK_INT <= 23) {
                Iterator<Intent> it = f142787a.iterator();
                while (it.hasNext()) {
                    intent = it.next();
                    if (b(context, intent)) {
                        intent.addFlags(268435456);
                    }
                }
                return false;
            } else if (TextUtils.equals(lowerCase, "huawei")) {
                intent = new Intent();
                intent.setFlags(268435456);
                intent.putExtra("packageName", context.getPackageName());
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                if (a()) {
                    return false;
                }
                intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
                intent.putExtra("extra_pkgname", context.getPackageName());
            } else if (!TextUtils.equals(lowerCase, "meizu")) {
                return false;
            } else {
                intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("packageName", context.getPackageName());
            }
            if (!b(context, intent)) {
                return false;
            }
            a(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private static boolean b(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            try {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 1);
                if (resolveActivity == null) {
                    return false;
                }
                if (resolveActivity.activityInfo == null) {
                    return false;
                }
                return resolveActivity.activityInfo.exported;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
