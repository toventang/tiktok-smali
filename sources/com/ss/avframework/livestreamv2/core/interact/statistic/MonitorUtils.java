package com.ss.avframework.livestreamv2.core.interact.statistic;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class MonitorUtils {
    static {
        Covode.recordClassIndex(100295);
    }

    public static boolean isProcStatCanRead() {
        File file = new File("/proc/stat");
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    public static long getTotalCPUTime() {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.i(14156);
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                close(bufferedReader);
                MethodCollector.o(14156);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                MethodCollector.o(14156);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                MethodCollector.o(14156);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            MethodCollector.o(14156);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            close(bufferedReader);
            MethodCollector.o(14156);
            throw th;
        }
    }

    public static long getUsedCPUTime() {
        BufferedReader bufferedReader;
        Throwable th;
        MethodCollector.i(14226);
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                close(bufferedReader);
                MethodCollector.o(14226);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader2 = bufferedReader;
                close(bufferedReader2);
                MethodCollector.o(14226);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                close(bufferedReader);
                MethodCollector.o(14226);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader2);
            MethodCollector.o(14226);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            close(bufferedReader);
            MethodCollector.o(14226);
            throw th;
        }
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static long getSysUsedMemory(Context context) {
        if (context == null) {
            return -1;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) com_ss_avframework_livestreamv2_core_interact_statistic_MonitorUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity");
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }

    public static long getAppCPUTime(int i2) {
        Throwable th;
        MethodCollector.i(14258);
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i2 + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                close(bufferedReader2);
                MethodCollector.o(14258);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                MethodCollector.o(14258);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                MethodCollector.o(14258);
                throw th;
            }
        } catch (Exception unused2) {
            close(bufferedReader);
            MethodCollector.o(14258);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            close(bufferedReader);
            MethodCollector.o(14258);
            throw th;
        }
    }

    public static int getPidMemorySize(int i2, Context context) {
        if (context == null) {
            return -1;
        }
        try {
            ActivityManager activityManager = (ActivityManager) com_ss_avframework_livestreamv2_core_interact_statistic_MonitorUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity");
            if (activityManager == null) {
                return -1;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i2})[0].getTotalPss();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Object com_ss_avframework_livestreamv2_core_interact_statistic_MonitorUtils_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(14284);
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
                    MethodCollector.o(14284);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
