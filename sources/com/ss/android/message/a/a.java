package com.ss.android.message.a;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.l;
import com.bytedance.common.utility.m;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f59819a;

    /* renamed from: b  reason: collision with root package name */
    public static String f59820b = ":push";

    /* renamed from: c  reason: collision with root package name */
    public static String f59821c = ":pushservice";

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f59822d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f59823e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f59824f;

    static {
        Covode.recordClassIndex(36974);
    }

    private static String c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return com.ss.android.ugc.aweme.net.a.a.a().a("ro.build.version.emui");
        }
        return d();
    }

    private static boolean e() {
        if (!f59824f) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f59823e = true;
                    f59824f = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f59824f = true;
        }
        return f59823e;
    }

    private static boolean b() {
        try {
            if ((m.a(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("huawei")) && (m.a(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("huawei"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String d() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0067 A[Catch:{ all -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[Catch:{ all -> 0x00aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.a.a():java.lang.String");
    }

    public static String c(Context context) {
        try {
            ComponentName resolveActivity = f.a(context, context.getPackageName()).resolveActivity(context.getPackageManager());
            if (resolveActivity != null) {
                return resolveActivity.getClassName();
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static int b(Context context) {
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (((Boolean) Reflect.on((NotificationManager) b(context, "notification")).call("areNotificationsEnabled").get()).booleanValue()) {
                    return 1;
                }
                return 0;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) b(context, "appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            String packageName = applicationContext.getPackageName();
            int i2 = applicationInfo.uid;
            Reflect on = Reflect.on(appOpsManager);
            int intValue = ((Integer) on.field("OP_POST_NOTIFICATION", Integer.TYPE).get()).intValue();
            if (((Integer) on.call("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(intValue), Integer.valueOf(i2), packageName).get()).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean a(Context context) {
        Boolean bool = f59822d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String b2 = f.b(context);
        boolean z = false;
        if (b2 != null) {
            if (b2.contains(":")) {
                return false;
            }
            if (b2.equals(context.getPackageName())) {
                z = true;
            }
        }
        Boolean valueOf = Boolean.valueOf(z);
        f59822d = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean a(Context context, String str) {
        if (context == null || m.a(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String a(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(l.a(list, "UTF-8"));
        return sb.toString();
    }

    public static String a(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return a(str, arrayList);
    }

    private static Object b(Context context, String str) {
        Object obj;
        MethodCollector.i(13591);
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
                    MethodCollector.o(13591);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
