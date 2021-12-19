package com.ss.ttm.a;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f151884a;

    /* renamed from: b  reason: collision with root package name */
    public static int[] f151885b = new int[3];

    private static boolean b() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    static {
        Covode.recordClassIndex(101278);
    }

    public static int[] a() {
        MethodCollector.i(2059);
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/cpuinfo");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.replaceAll("\t", "").toLowerCase(Locale.US).split(":");
                    if (split.length == 2) {
                        String trim = split[0].trim();
                        String trim2 = split[1].trim();
                        if (!(trim2 == null || trim == null)) {
                            if (trim.compareTo("processor") == 0) {
                                if (trim2.contains("armv") || trim2.contains("aarch64")) {
                                    f151885b[0] = 1;
                                } else if (trim2.contains("intel")) {
                                    f151885b[0] = 2;
                                    break;
                                }
                            } else if (trim.compareToIgnoreCase("features") == 0) {
                                if (trim2.contains("neon") || trim2.contains("thumb") || trim2.contains("vfpv") || trim2.contains("asimd") || trim2.contains("simd")) {
                                    f151885b[0] = 1;
                                }
                            } else if (trim.compareToIgnoreCase("model name") != 0) {
                                continue;
                            } else if (trim2.contains("intel")) {
                                f151885b[0] = 2;
                                break;
                            } else if (trim2.contains("arm")) {
                                f151885b[0] = 1;
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    MethodCollector.o(2059);
                    throw th;
                }
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        int[] iArr = f151885b;
        MethodCollector.o(2059);
        return iArr;
    }

    public static long[] a(Context context) {
        long[] jArr = new long[2];
        if ("mounted".equals(Environment.getExternalStorageState())) {
            long d2 = d(context);
            jArr[0] = b(context);
            jArr[1] = d2;
        }
        return jArr;
    }

    private static long b(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return b(c(context).getParent());
    }

    private static File c(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static long d(Context context) {
        if (context == null || Environment.getDataDirectory() == null) {
            return -1;
        }
        return a(c(context).getParent());
    }

    private static long a(String str) {
        long j2;
        long j3;
        try {
            StatFs statFs = new StatFs(str);
            if (b()) {
                j2 = statFs.getBlockSizeLong();
                j3 = statFs.getAvailableBlocksLong();
            } else {
                j2 = (long) statFs.getBlockSize();
                j3 = (long) statFs.getAvailableBlocks();
            }
            return j2 * j3;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    private static long b(String str) {
        long j2;
        long j3;
        try {
            StatFs statFs = new StatFs(str);
            if (b()) {
                j2 = statFs.getBlockSizeLong();
                j3 = statFs.getBlockCountLong();
            } else {
                j2 = (long) statFs.getBlockSize();
                j3 = (long) statFs.getBlockCount();
            }
            return j2 * j3;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }
}
