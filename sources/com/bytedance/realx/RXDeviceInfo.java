package com.bytedance.realx;

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
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class RXDeviceInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        /* class com.bytedance.realx.RXDeviceInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25926);
        }

        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i2 = 3; i2 < name.length(); i2++) {
                if (!Character.isDigit(name.charAt(i2))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static int com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    static {
        Covode.recordClassIndex(25925);
    }

    public static String GetDeviceBrand() {
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER;
    }

    public static String GetDeviceModel() {
        if (Build.MODEL == null) {
            return "";
        }
        return Build.MODEL;
    }

    public static int getNumberOfCPUCores() {
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
            }
            return coresFromFileInfo;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static int getCPUMaxFreqKHz() {
        MethodCollector.i(6967);
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < getNumberOfCPUCores(); i4++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i5 = 0;
                        while (Character.isDigit(bArr[i5]) && i5 < 128) {
                            i5++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i5)));
                        if (valueOf.intValue() > i3) {
                            i3 = valueOf.intValue();
                        }
                    } catch (NumberFormatException e2) {
                        com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_LogLancet_e("DeviceInfo", "getCPUMaxFreqKHz failed!", e2);
                    } catch (Throwable th) {
                        fileInputStream.close();
                        MethodCollector.o(6967);
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused) {
            }
        }
        if (i3 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (parseFileForValue > i3) {
                    i3 = parseFileForValue;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                MethodCollector.o(6967);
                throw th2;
            }
        }
        i2 = i3;
        MethodCollector.o(6967);
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[SYNTHETIC, Splitter:B:33:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9 A[SYNTHETIC, Splitter:B:38:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d6 A[SYNTHETIC, Splitter:B:46:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1 A[SYNTHETIC, Splitter:B:51:0x00f1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String GetCpuModel() {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.GetCpuModel():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A[SYNTHETIC, Splitter:B:33:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[SYNTHETIC, Splitter:B:38:0x00c2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int GetTotalMemSize() {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.GetTotalMemSize():int");
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getTotalMemory(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity")).getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / 1024);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (0 == 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCoresFromFileInfo(java.lang.String r4) {
        /*
            r3 = 7039(0x1b7f, float:9.864E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0033, all -> 0x002e }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            int r0 = getCoresFromFileString(r0)     // Catch:{ IOException -> 0x002c, all -> 0x0027 }
            r2.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r0
        L_0x0027:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x002f
        L_0x002c:
            r0 = r2
            goto L_0x0035
        L_0x002e:
            r0 = move-exception
        L_0x002f:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        L_0x0033:
            if (r0 == 0) goto L_0x0038
        L_0x0035:
            r0.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            r0 = -1
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.RXDeviceInfo.getCoresFromFileInfo(java.lang.String):int");
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

    public static Object com_bytedance_realx_RXDeviceInfo_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(6811);
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
                    MethodCollector.o(6811);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        MethodCollector.i(6980);
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
                            MethodCollector.o(6980);
                            return extractValue;
                        }
                    }
                    continue;
                }
                i2++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.o(6980);
        return -1;
    }
}
