package com.bytedance.io.prefetcher;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class IoPrefetcher {
    private static String A = "produce_step";
    private static int B = 10;
    private static String C = "skip_threshhold";
    private static String D = "threshhold";
    private static String E = "step_size";
    private static String F = "step_sleep_duration";
    private static long G = 524288;
    private static long H = 15000;

    /* renamed from: a  reason: collision with root package name */
    public static String f38914a = "IoPrefetcher";

    /* renamed from: b  reason: collision with root package name */
    public static Handler f38915b;

    /* renamed from: c  reason: collision with root package name */
    public static int f38916c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static int f38917d = -2;

    /* renamed from: e  reason: collision with root package name */
    public static int f38918e = -3;

    /* renamed from: f  reason: collision with root package name */
    public static String f38919f = "prefetcher";

    /* renamed from: g  reason: collision with root package name */
    public static String f38920g = "dex";

    /* renamed from: h  reason: collision with root package name */
    public static String f38921h = "aot";

    /* renamed from: i  reason: collision with root package name */
    public static String f38922i = "aot_7";

    /* renamed from: j  reason: collision with root package name */
    public static String f38923j = "smaps.txt";

    /* renamed from: k  reason: collision with root package name */
    public static String f38924k = "file_open_record";

    /* renamed from: l  reason: collision with root package name */
    public static boolean f38925l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f38926m = true;
    public static int n = 50;
    public static int o;
    public static long p = 1572864;
    public static long q;
    public static long r;
    public static long s;
    private static volatile IoPrefetcher t;
    private static String u = "art_debug";
    private static String v = "hook";
    private static String w = "/data/local/tmp/profile";
    private static int x = 1;
    private static int y = 2;
    private static String z = "io_preference";

    public static native int closePagemap();

    public static native byte[] hasPhysicalPage(long j2, int i2);

    public static native int hookMethod(String str, int i2);

    public static native int openPagemap(String str);

    public static native int unhookMethod(int i2);

    public native int prefetch(String str, String str2, long j2, long j3, long j4, long j5);

    private IoPrefetcher() {
    }

    public static IoPrefetcher a() {
        MethodCollector.i(10581);
        if (t == null) {
            synchronized (IoPrefetcher.class) {
                try {
                    if (t == null) {
                        t = new IoPrefetcher();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10581);
                    throw th;
                }
            }
        }
        IoPrefetcher ioPrefetcher = t;
        MethodCollector.o(10581);
        return ioPrefetcher;
    }

    static {
        Covode.recordClassIndex(23846);
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private static String b(Context context) {
        try {
            return context.getPackageName() + "_" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.Boolean>> */
    /* JADX WARN: Multi-variable type inference failed */
    public static long a(a[] aVarArr) {
        long j2 = 0;
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            ArrayList<Pair<Long, Long>> arrayList = aVarArr[i2].f38934a;
            ArrayList<Long> arrayList2 = aVarArr[i2].f38935b;
            if (arrayList != null) {
                HashMap<Long, ArrayList<Boolean>> hashMap = aVarArr[i2].f38936c;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    int longValue = (int) ((((Long) arrayList.get(i3).second).longValue() - ((Long) arrayList.get(i3).first).longValue()) / 4096);
                    if (hashMap.get(arrayList.get(i3).first) == null) {
                        ArrayList arrayList3 = new ArrayList(longValue);
                        hashMap.put(arrayList.get(i3).first, arrayList3);
                        for (int i4 = 0; i4 < longValue; i4++) {
                            arrayList3.add(i4, false);
                        }
                    }
                    new StringBuilder("path:").append(aVarArr[i2].f38937d).append(" vmaStart:").append(arrayList.get(i3).first).append(" vmaEnd:").append(arrayList.get(i3).second).append(" vmafileoffset:").append(arrayList2.get(i3));
                    long a2 = a(i2, arrayList2.get(i3).longValue(), ((Long) arrayList.get(i3).first).longValue(), ((Long) arrayList.get(i3).second).longValue(), hashMap);
                    if (a2 == -1) {
                        return -1;
                    }
                    j2 += a2;
                }
                continue;
            }
        }
        return j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004c, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0058 A[SYNTHETIC, Splitter:B:40:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0068 A[SYNTHETIC, Splitter:B:48:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r6, java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.io.prefetcher.IoPrefetcher.a(java.io.File, java.io.File):void");
    }

    public final int a(final Context context, String str) {
        File file;
        MethodCollector.i(10588);
        if (TextUtils.isEmpty(str)) {
            file = new File(a(context), f38919f);
        } else {
            file = new File(str);
            if (!file.exists()) {
                file = new File(a(context), f38919f);
            }
        }
        if (file.exists() || file.mkdirs()) {
            String packageCodePath = context.getPackageCodePath();
            int indexOf = packageCodePath.indexOf("base.apk");
            if (indexOf < 0) {
                int i2 = f38916c;
                MethodCollector.o(10588);
                return i2;
            }
            String b2 = b(context);
            final File file2 = new File(file, f38920g + "_" + b2 + "_" + Build.CPU_ABI);
            String substring = packageCodePath.substring(0, indexOf);
            File file3 = new File(substring + "oat/arm/");
            if (!file3.exists() || "armeabi-v7a".equals(Build.CPU_ABI)) {
                if (!file3.exists()) {
                    file3 = new File(substring + "oat/arm64/");
                }
                if (new File(file3, "base.vdex").exists()) {
                    file2 = new File(file, f38921h + "_" + b2 + "_" + Build.CPU_ABI);
                } else if (Build.VERSION.SDK_INT < 26 && new File(file3, "base.odex").exists()) {
                    file2 = new File(file, f38922i + "_" + b2 + "_" + Build.CPU_ABI);
                }
                if (!file2.exists() || !file2.canRead()) {
                    if (new File(w).exists()) {
                        String absolutePath = file2.getAbsolutePath();
                        if (!TextUtils.isEmpty(absolutePath) && !absolutePath.contains(f38920g)) {
                            file2.getAbsolutePath();
                            final a[] a2 = a.a(file3, packageCodePath);
                            if (a2 != null) {
                                IoProfileFile.a(a2, file, file2);
                                openPagemap("/proc/" + Process.myPid() + "/pagemap");
                                final long currentTimeMillis = System.currentTimeMillis();
                                final int i3 = com.ss.android.ugc.aweme.bf.d.a(context, z, 0).getInt(A, B);
                                f38915b.postDelayed(new Runnable() {
                                    /* class com.bytedance.io.prefetcher.IoPrefetcher.AnonymousClass2 */

                                    static {
                                        Covode.recordClassIndex(23848);
                                    }

                                    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
                                        if (r2 == null) goto L_0x00e2;
                                     */
                                    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4 A[SYNTHETIC, Splitter:B:53:0x00f4] */
                                    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fe  */
                                    /* JADX WARNING: Removed duplicated region for block: B:64:0x011d  */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void run() {
                                        /*
                                        // Method dump skipped, instructions count: 365
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.io.prefetcher.IoPrefetcher.AnonymousClass2.run():void");
                                    }
                                }, 0);
                            }
                        }
                    }
                    file2.getAbsolutePath();
                    int i4 = f38917d;
                    MethodCollector.o(10588);
                    return i4;
                }
                file2.getAbsolutePath();
                int i5 = f38916c;
                try {
                    i5 = prefetch(file2.getAbsolutePath(), packageCodePath, 524288, q, r, s);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                MethodCollector.o(10588);
                return i5;
            }
            int i6 = f38918e;
            MethodCollector.o(10588);
            return i6;
        }
        int i7 = f38916c;
        MethodCollector.o(10588);
        return i7;
    }

    private static long a(int i2, long j2, long j3, long j4, HashMap<Long, ArrayList<Boolean>> hashMap) {
        byte[] hasPhysicalPage;
        MethodCollector.i(10744);
        long j5 = 4096;
        int i3 = (int) ((j4 - j3) / 4096);
        if (i3 >= 4096) {
            i3 = 4096;
        }
        int i4 = i3 * 4096;
        ArrayList<Boolean> arrayList = hashMap.get(Long.valueOf(j3));
        long j6 = -1;
        if (arrayList == null) {
            MethodCollector.o(10744);
            return -1;
        }
        long j7 = j3;
        long j8 = -1;
        long j9 = 0;
        long j10 = 0;
        while (j7 < j4 && (hasPhysicalPage = hasPhysicalPage(j7, i3)) != null) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = (int) (((j7 - j3) / j5) + ((long) i5));
                if (i6 >= arrayList.size() || !arrayList.get(i6).booleanValue()) {
                    if (hasPhysicalPage[i5] == x) {
                        if (i6 >= arrayList.size()) {
                            arrayList.add(true);
                        } else {
                            arrayList.set(i6, true);
                        }
                        if (j8 == -1) {
                            j8 = j2 + ((long) (i6 * 4096));
                            j10 = 4096;
                        } else {
                            j5 = 4096;
                            j10 += 4096;
                        }
                    } else {
                        j5 = 4096;
                        if (hasPhysicalPage[i5] == y) {
                            MethodCollector.o(10744);
                            return -1;
                        } else if (j8 != -1) {
                            if (!f38926m) {
                                IoProfileFile.addFileOffsetToPathmap(i2, j8, j10);
                            }
                            j9 += j10;
                            j10 = 0;
                            j8 = -1;
                        }
                    }
                    i5++;
                    j6 = -1;
                } else if (j8 != j6) {
                    if (!f38926m) {
                        IoProfileFile.addFileOffsetToPathmap(i2, j8, j10);
                    }
                    j9 += j10;
                    j8 = -1;
                    j10 = 0;
                }
                j5 = 4096;
                i5++;
                j6 = -1;
            }
            if (j8 != j6) {
                if (!f38926m) {
                    IoProfileFile.addFileOffsetToPathmap(i2, j8, j10);
                }
                j9 += j10;
                j8 = -1;
                j10 = 0;
            }
            j7 += (long) i4;
            j5 = 4096;
        }
        MethodCollector.o(10744);
        return j9;
    }
}
