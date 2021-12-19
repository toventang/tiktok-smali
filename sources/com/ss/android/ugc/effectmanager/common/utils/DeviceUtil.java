package com.ss.android.ugc.effectmanager.common.utils;

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
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DeviceUtil {
    private static final Map<String, Object> cachedMap = new ConcurrentHashMap();

    public static class MemoryInfo {
        public long availableSize;
        public long totalSize;

        static {
            Covode.recordClassIndex(95329);
        }

        public long getAvailableSize() {
            return this.availableSize;
        }

        public long getTotalSize() {
            return this.totalSize;
        }
    }

    private DeviceUtil() {
    }

    static {
        Covode.recordClassIndex(95328);
    }

    public static String getCpuModel() {
        Map<String, Object> map = cachedMap;
        Object obj = map.get("cache_key_cpu_model");
        if (obj != null) {
            return (String) obj;
        }
        String cpuModelInternal = getCpuModelInternal();
        map.put("cache_key_cpu_model", cpuModelInternal);
        return cpuModelInternal;
    }

    private static synchronized String getCpuModelInternal() {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e2;
        synchronized (DeviceUtil.class) {
            MethodCollector.i(295);
            BufferedReader bufferedReader2 = null;
            try {
                if (new File("/proc/cpuinfo").exists()) {
                    bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                bufferedReader2 = bufferedReader;
                                break;
                            } else if (readLine.contains(":")) {
                                String[] split = readLine.split(":");
                                if (split[0].contains("Hardware")) {
                                    String str = split[1];
                                    closeSafety(bufferedReader);
                                    MethodCollector.o(295);
                                    return str;
                                }
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            try {
                                e2.printStackTrace();
                                closeSafety(bufferedReader);
                                String str2 = Build.HARDWARE;
                                MethodCollector.o(295);
                                return str2;
                            } catch (Throwable th2) {
                                th = th2;
                                closeSafety(bufferedReader);
                                MethodCollector.o(295);
                                throw th;
                            }
                        }
                    }
                }
                closeSafety(bufferedReader2);
            } catch (Exception e4) {
                e2 = e4;
                bufferedReader = null;
                e2.printStackTrace();
                closeSafety(bufferedReader);
                String str22 = Build.HARDWARE;
                MethodCollector.o(295);
                return str22;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                closeSafety(bufferedReader);
                MethodCollector.o(295);
                throw th;
            }
            String str222 = Build.HARDWARE;
            MethodCollector.o(295);
            return str222;
        }
    }

    private static void closeSafety(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static MemoryInfo getMemoryInfo(Context context) {
        Map<String, Object> map = cachedMap;
        Object obj = map.get("cache_key_memory_info");
        if (obj != null) {
            return (MemoryInfo) obj;
        }
        MemoryInfo memoryInfoInternal = getMemoryInfoInternal(context);
        map.put("cache_key_memory_info", memoryInfoInternal);
        return memoryInfoInternal;
    }

    private static MemoryInfo getMemoryInfoInternal(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        memoryInfo.totalSize = getTotalMemory(context);
        memoryInfo.availableSize = getAvailableMemory(context);
        return memoryInfo;
    }

    public static long getAvailableMemory(Context context) {
        long j2;
        FileInputStream fileInputStream;
        Throwable th;
        MethodCollector.i(292);
        int i2 = Build.VERSION.SDK_INT;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) com_ss_android_ugc_effectmanager_common_utils_DeviceUtil_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity");
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                j2 = memoryInfo.availMem;
                if (j2 == -1) {
                    FileInputStream fileInputStream2 = null;
                    fileInputStream = new FileInputStream("/proc/meminfo");
                    j2 = 1024 * ((long) parseFileForValue("MemAvailable", fileInputStream));
                    closeSafety(fileInputStream);
                }
                MethodCollector.o(292);
                return j2;
            }
        } catch (Exception unused) {
        }
        j2 = -1;
        FileInputStream fileInputStream22 = null;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            try {
                j2 = 1024 * ((long) parseFileForValue("MemAvailable", fileInputStream));
                closeSafety(fileInputStream);
            } catch (Exception unused2) {
                fileInputStream22 = fileInputStream;
                closeSafety(fileInputStream22);
                MethodCollector.o(292);
                return j2;
            } catch (Throwable th2) {
                th = th2;
                closeSafety(fileInputStream);
                MethodCollector.o(292);
                throw th;
            }
        } catch (Exception unused3) {
            closeSafety(fileInputStream22);
            MethodCollector.o(292);
            return j2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            closeSafety(fileInputStream);
            MethodCollector.o(292);
            throw th;
        }
        MethodCollector.o(292);
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[Catch:{ Exception -> 0x0048, all -> 0x004f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getTotalMemory(android.content.Context r7) {
        /*
            r6 = 283(0x11b, float:3.97E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = -1
            r0 = 16
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x0024 }
            r1.<init>()     // Catch:{ Exception -> 0x0024 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = com_ss_android_ugc_effectmanager_common_utils_DeviceUtil_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(r7, r0)     // Catch:{ Exception -> 0x0024 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ Exception -> 0x0024 }
            if (r0 == 0) goto L_0x0024
            r0.getMemoryInfo(r1)     // Catch:{ Exception -> 0x0024 }
            long r2 = r1.totalMem     // Catch:{ Exception -> 0x0024 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            goto L_0x0026
        L_0x0024:
            r2 = -1
        L_0x0026:
            r5 = 0
            java.lang.String r1 = "/proc/meminfo"
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            if (r0 == 0) goto L_0x0048
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0048, all -> 0x004f }
            java.lang.String r0 = "MemTotal"
            int r0 = parseFileForValue(r0, r4)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            r5 = r4
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            goto L_0x0051
        L_0x0047:
            r5 = r4
        L_0x0048:
            closeSafety(r5)
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r2
        L_0x004f:
            r0 = move-exception
            r4 = r5
        L_0x0051:
            closeSafety(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.DeviceUtil.getTotalMemory(android.content.Context):long");
    }

    private static int extractValue(byte[] bArr, int i2) {
        while (i2 < bArr.length && bArr[i2] != 10) {
            if (Character.isDigit(bArr[i2])) {
                int i3 = i2 + 1;
                while (i3 < bArr.length && Character.isDigit(bArr[i3])) {
                    i3++;
                }
                return Integer.parseInt(new String(bArr, 0, i2, i3 - i2));
            }
            i2++;
        }
        return -1;
    }

    public static Object com_ss_android_ugc_effectmanager_common_utils_DeviceUtil_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(290);
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
                    MethodCollector.o(290);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static int parseFileForValue(String str, FileInputStream fileInputStream) {
        MethodCollector.i(293);
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < read) {
                if (bArr[i2] == 10 || i2 == 0) {
                    if (bArr[i2] == 10) {
                        i2++;
                    }
                    for (int i3 = i2; i3 < read; i3++) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != str.charAt(i4)) {
                            continue;
                            break;
                        } else if (i4 == str.length() - 1) {
                            int extractValue = extractValue(bArr, i3);
                            MethodCollector.o(293);
                            return extractValue;
                        }
                    }
                    continue;
                }
                i2++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.o(293);
        return -1;
    }
}
