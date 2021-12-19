package com.bytedance.crash.util;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.crash.runtime.a.a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f27978a;

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f27979b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f27980c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f27981d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f27982e;

    static {
        Covode.recordClassIndex(16373);
    }

    private static long a(int i2) {
        if (i2 < 0) {
            return 0;
        }
        return ((long) i2) * 1024;
    }

    public static String a() {
        String str = f27978a;
        if (str != null) {
            return str;
        }
        return "";
    }

    private static String b() {
        BufferedReader bufferedReader;
        MethodCollector.i(8335);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        m.a(bufferedReader);
                        MethodCollector.o(8335);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                m.a(bufferedReader);
                MethodCollector.o(8335);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            m.a(bufferedReader);
            MethodCollector.o(8335);
            return null;
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            if (!a.a().v) {
                return true;
            }
            return false;
        } else if (a.a().v || f(context)) {
            return false;
        } else {
            return true;
        }
    }

    public static String d(Context context) {
        Class<?> g2 = g(context);
        if (f27980c == null && g2 != null) {
            try {
                f27980c = g2.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f27980c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get(null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static int e(Context context) {
        Class<?> g2 = g(context);
        if (f27981d == null && g2 != null) {
            try {
                f27981d = g2.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f27981d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get(null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    private static Class<?> g(Context context) {
        if (f27979b == null && !f27982e) {
            try {
                f27979b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f27982e = true;
        }
        return f27979b;
    }

    public static String c(Context context) {
        if (!TextUtils.isEmpty(f27978a)) {
            return f27978a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) a(context, "activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        f27978a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String b2 = b();
        f27978a = b2;
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    private static void a(JSONObject jSONObject) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", e.f27991a.a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", e.f27991a.b(memoryInfo));
        jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", a(e.f27991a.c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    public static boolean b(Context context) {
        String c2 = c(context);
        if (c2 == null || c2.contains(":") || c2 == null || (!c2.equals(context.getPackageName()) && !c2.equals(context.getApplicationInfo().processName))) {
            return false;
        }
        return true;
    }

    private static boolean f(Context context) {
        List<ActivityManager.RunningTaskInfo> list;
        ComponentName componentName;
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) a(context, "activity");
            if (activityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 21) {
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(activityManager, new Object[]{1}, 101301, "java.util.List", false, null);
                if (((Boolean) a2.first).booleanValue()) {
                    list = (List) a2.second;
                } else {
                    list = activityManager.getRunningTasks(1);
                    com.bytedance.helios.sdk.a.a(list, activityManager, new Object[]{1}, 101301, "com_bytedance_crash_util_App_android_app_ActivityManager_getRunningTasks(Landroid/app/ActivityManager;I)Ljava/util/List;");
                }
                if (list == null || list.isEmpty() || (componentName = list.get(0).topActivity) == null || !packageName.equals(componentName.getPackageName())) {
                    return false;
                }
                return true;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100) {
                        return packageName.equals(runningAppProcessInfo.pkgList[0]);
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            a(jSONObject);
            ActivityManager activityManager = (ActivityManager) a(context, "activity");
            if (activityManager != null) {
                b(jSONObject, activityManager);
            }
            a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    public static boolean b(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (!str.equals(context.getPackageName()) && !str.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    private static void b(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", p.f28012a.a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8322);
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
                    MethodCollector.o(8322);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static void a(JSONObject jSONObject, ActivityManager activityManager) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        JSONObject jSONObject2 = new JSONObject();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / 1048576;
        boolean z5 = true;
        if (nativeHeapAllocatedSize > 200) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.crash.entity.b.a(jSONObject, "filters", "native_heap_leak", String.valueOf(z));
        if (nativeHeapAllocatedSize > 300) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.bytedance.crash.entity.b.a(jSONObject, "filters", "native_heap_leak_300M", String.valueOf(z2));
        if (nativeHeapAllocatedSize > 500) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.bytedance.crash.entity.b.a(jSONObject, "filters", "native_heap_leak_500M", String.valueOf(z3));
        if (nativeHeapAllocatedSize > 800) {
            z4 = true;
        } else {
            z4 = false;
        }
        com.bytedance.crash.entity.b.a(jSONObject, "filters", "native_heap_leak_800M", String.valueOf(z4));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j2 = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j2);
        if (((float) (j2 - freeMemory)) <= ((float) maxMemory) * 0.95f) {
            z5 = false;
        }
        com.bytedance.crash.entity.b.a(jSONObject, "filters", "java_heap_leak", String.valueOf(z5));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }
}
