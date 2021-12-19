package com.ss.bytertc.engine.utils;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.bytertc.base.utils.RtcContextUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;

public final class RTCBuildInfo {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        /* class com.ss.bytertc.engine.utils.RTCBuildInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(101053);
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

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static String getCpuName() {
        return Build.HARDWARE;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static int getCpuThreads() {
        return getCpuCores();
    }

    public static String getGpuName() {
        return GetDeviceHelper.getGpuName();
    }

    static {
        Covode.recordClassIndex(101052);
    }

    public static String getAppRootPath() {
        try {
            Context applicationContext = RtcContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return "";
            }
            return com_ss_bytertc_engine_utils_RTCBuildInfo_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(applicationContext).getAbsolutePath();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int getMemSize() {
        try {
            Context applicationContext = RtcContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return 0;
            }
            return GetDeviceHelper.getTotalMemory(applicationContext);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int getCpuCores() {
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

    public static int getCpuFrequency() {
        MethodCollector.i(7429);
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < getCpuCores(); i4++) {
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
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        MethodCollector.o(7429);
                        throw th;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
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
                MethodCollector.o(7429);
                throw th2;
            }
        }
        i2 = i3;
        int i6 = i2 / 1000000;
        MethodCollector.o(7429);
        return i6;
    }

    public static File com_ss_bytertc_engine_utils_RTCBuildInfo_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        if (0 == 0) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCoresFromFileInfo(java.lang.String r4) {
        /*
            r3 = 7447(0x1d17, float:1.0435E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.utils.RTCBuildInfo.getCoresFromFileInfo(java.lang.String):int");
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

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        MethodCollector.i(7434);
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
                            MethodCollector.o(7434);
                            return extractValue;
                        }
                    }
                    continue;
                }
                i2++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.o(7434);
        return -1;
    }
}
