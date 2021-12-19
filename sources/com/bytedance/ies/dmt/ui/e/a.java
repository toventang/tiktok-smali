package com.bytedance.ies.dmt.ui.e;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private int f33456a = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f33457b;

    /* renamed from: c  reason: collision with root package name */
    private int f33458c;

    /* renamed from: d  reason: collision with root package name */
    private long f33459d;

    /* renamed from: e  reason: collision with root package name */
    private int f33460e;

    /* renamed from: f  reason: collision with root package name */
    private int f33461f;

    /* renamed from: g  reason: collision with root package name */
    private String f33462g;

    /* renamed from: h  reason: collision with root package name */
    private Context f33463h;

    static {
        Covode.recordClassIndex(19964);
    }

    public static int b() {
        if (com.bytedance.ies.dmt.ui.f.a.f33482a) {
            return 2;
        }
        return 1;
    }

    public final void a() {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "start to show toast!");
        try {
            if (this.f33463h != null) {
                com.ss.android.ugc.aweme.framework.a.a.a(3, null, "context check!");
                if (!TextUtils.isEmpty(this.f33462g)) {
                    com.ss.android.ugc.aweme.framework.a.a.a(3, null, "content check!");
                    Context context = this.f33463h;
                    String packageName = context.getPackageName();
                    if (!m.a(packageName)) {
                        ActivityManager activityManager = (ActivityManager) a(context, "activity");
                        if (Build.VERSION.SDK_INT < 21) {
                            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(activityManager, new Object[]{1}, 101301, "java.util.List", false, null);
                            if (((Boolean) a2.first).booleanValue()) {
                                runningTasks = (List) a2.second;
                            } else {
                                runningTasks = activityManager.getRunningTasks(1);
                                com.bytedance.helios.sdk.a.a(runningTasks, activityManager, new Object[]{1}, 101301, "com_bytedance_ies_dmt_ui_toast_DmtToast_android_app_ActivityManager_getRunningTasks(Landroid/app/ActivityManager;I)Ljava/util/List;");
                            }
                            if (runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null || !packageName.equals(componentName.getPackageName())) {
                                return;
                            }
                        } else {
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                            if (runningAppProcesses != null) {
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                    if (runningAppProcessInfo == null || runningAppProcessInfo.processName == null || !runningAppProcessInfo.processName.startsWith(packageName) || runningAppProcessInfo.importance != 100) {
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "foreground check!");
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "actually show toast in i18n!");
                        b.a(this.f33463h).a(this.f33462g, this.f33456a, this.f33457b, this.f33458c, this.f33460e, this.f33459d);
                    }
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "show toast fail " + e2.getMessage());
            e2.printStackTrace();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9536);
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
                    MethodCollector.o(9536);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public a(Context context, String str, int i2, int i3) {
        this.f33462g = str;
        this.f33461f = i2;
        this.f33463h = context;
        this.f33457b = i3;
        this.f33458c = 0;
        this.f33460e = 2;
    }
}
