package com.google.android.gms.common;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.gms.common.c.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.k;
import com.google.android.gms.common.util.q;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f50298a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f50299b = 12451000;

    /* renamed from: c  reason: collision with root package name */
    static final AtomicBoolean f50300c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f50301d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f50302e = new AtomicBoolean();

    g() {
    }

    static {
        Covode.recordClassIndex(31357);
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static boolean b(Context context) {
        if (!f50301d) {
            try {
                PackageInfo b2 = c.f50295a.a(context).b("com.google.android.gms", 64);
                h.a(context);
                if (b2 == null || h.a(b2, false) || !h.a(b2, true)) {
                    f50298a = false;
                } else {
                    f50298a = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f50301d = true;
            }
        }
        if (f50298a || !"user".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return b(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (com.google.android.gms.common.util.h.f50508a.booleanValue() == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r5, int r6) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.g.a(android.content.Context, int):int");
    }

    static boolean b(Context context, String str) {
        Bundle applicationRestrictions;
        boolean equals = str.equals("com.google.android.gms");
        if (k.c()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo a2 = a(context.getPackageManager(), str, 8192);
            if (equals) {
                return a2.enabled;
            }
            if (a2.enabled) {
                if (!k.a() || (applicationRestrictions = ((UserManager) a(context, "user")).getApplicationRestrictions(context.getPackageName())) == null || !"true".equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11549);
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
                    MethodCollector.o(11549);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static ApplicationInfo a(PackageManager packageManager, String str, int i2) {
        if (!TextUtils.equals(str, com.bytedance.ies.ugc.appcontext.d.a().getPackageName()) || i2 != 128) {
            return packageManager.getApplicationInfo(str, i2);
        }
        if (com.ss.android.ugc.aweme.lancet.c.b.f107191a == null) {
            com.ss.android.ugc.aweme.lancet.c.b.f107191a = packageManager.getApplicationInfo(str, i2);
        }
        return com.ss.android.ugc.aweme.lancet.c.b.f107191a;
    }

    private static int a(Context context, boolean z, int i2) {
        boolean z2;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        r.b(z2);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.a(context);
            if (!h.a(packageInfo2, true)) {
                return 9;
            }
            if (z && (!h.a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                return 9;
            }
            if (q.a(packageInfo2.versionCode) < q.a(i2)) {
                int i3 = packageInfo2.versionCode;
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = a(packageManager, "com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            if (!applicationInfo.enabled) {
                return 3;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused2) {
            return 1;
        }
    }
}
