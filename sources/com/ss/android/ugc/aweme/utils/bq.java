package com.ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public final class bq {

    /* renamed from: a  reason: collision with root package name */
    private static final FileFilter f142689a = new FileFilter() {
        /* class com.ss.android.ugc.aweme.utils.bq.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93351);
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

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f142690a;

        /* renamed from: b  reason: collision with root package name */
        public int f142691b;

        /* renamed from: c  reason: collision with root package name */
        public int f142692c;

        static {
            Covode.recordClassIndex(93352);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f142693a;

        /* renamed from: b  reason: collision with root package name */
        public long f142694b;

        static {
            Covode.recordClassIndex(93353);
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f142695a;

        /* renamed from: b  reason: collision with root package name */
        public int f142696b;

        /* renamed from: c  reason: collision with root package name */
        public int f142697c;

        static {
            Covode.recordClassIndex(93354);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f142698a;

        /* renamed from: b  reason: collision with root package name */
        public int f142699b;

        /* renamed from: c  reason: collision with root package name */
        public int f142700c;

        /* renamed from: d  reason: collision with root package name */
        public float f142701d;

        /* renamed from: e  reason: collision with root package name */
        public float f142702e;

        /* renamed from: f  reason: collision with root package name */
        public float f142703f;

        static {
            Covode.recordClassIndex(93355);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public long f142704a;

        /* renamed from: b  reason: collision with root package name */
        public long f142705b;

        /* renamed from: c  reason: collision with root package name */
        public long f142706c;

        /* renamed from: d  reason: collision with root package name */
        public long f142707d;

        /* renamed from: e  reason: collision with root package name */
        public long f142708e;

        /* renamed from: f  reason: collision with root package name */
        public int f142709f;

        static {
            Covode.recordClassIndex(93356);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142710a;

        public static class a {
            static {
                Covode.recordClassIndex(93358);
            }

            private a() {
            }

            public String a() {
                return Build.CPU_ABI + "_" + Build.CPU_ABI2;
            }

            /* synthetic */ a(byte b2) {
                this();
            }
        }

        static class b extends a {
            static {
                Covode.recordClassIndex(93359);
            }

            private b() {
                super((byte) 0);
            }

            @Override // com.ss.android.ugc.aweme.utils.bq.f.a
            public final String a() {
                String str = "";
                if (Build.VERSION.SDK_INT >= 21) {
                    if (Build.SUPPORTED_ABIS == null) {
                        return str;
                    }
                    String[] strArr = Build.SUPPORTED_ABIS;
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        str = str + strArr[i2] + "_";
                    }
                }
                return str;
            }

            /* synthetic */ b(byte b2) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(93357);
            if (Build.VERSION.SDK_INT >= 21) {
                f142710a = new b((byte) 0);
            } else {
                f142710a = new a((byte) 0);
            }
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public long f142711a = -1;

        /* renamed from: b  reason: collision with root package name */
        public long f142712b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f142713c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f142714d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f142715e = -1;

        static {
            Covode.recordClassIndex(93360);
        }
    }

    static {
        Covode.recordClassIndex(93350);
    }

    public static int a() {
        int i2 = Build.VERSION.SDK_INT;
        try {
            int c2 = c("/sys/devices/system/cpu/possible");
            if (c2 == -1) {
                c2 = c("/sys/devices/system/cpu/present");
            }
            if (c2 == -1) {
                return new File("/sys/devices/system/cpu/").listFiles(f142689a).length;
            }
            return c2;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static boolean e() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (d("/system/xbin/which su") || d("/system/bin/which su") || d("which su") || d("busybox which su")) {
            return true;
        }
        return false;
    }

    public static g d() {
        File[] listFiles;
        g gVar = new g();
        try {
            gVar.f142711a = (long) f();
            gVar.f142712b = (long) g();
            File file = new File("/proc/" + Process.myPid() + "/fd");
            int i2 = -1;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                i2 = listFiles.length;
            }
            gVar.f142714d = (long) i2;
            gVar.f142715e = h();
            gVar.f142713c = (long) i();
            return gVar;
        } catch (Exception unused) {
            return null;
        }
    }

    private static int f() {
        FileInputStream fileInputStream;
        Throwable th;
        int i2;
        Exception e2;
        MethodCollector.i(9591);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i2 = a("VmPeak", fileInputStream);
                a(fileInputStream);
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    a(fileInputStream);
                    i2 = -1;
                    MethodCollector.o(9591);
                    return i2;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileInputStream);
                    MethodCollector.o(9591);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = null;
            e2.printStackTrace();
            a(fileInputStream);
            i2 = -1;
            MethodCollector.o(9591);
            return i2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            a(fileInputStream);
            MethodCollector.o(9591);
            throw th;
        }
        MethodCollector.o(9591);
        return i2;
    }

    private static int g() {
        FileInputStream fileInputStream;
        Throwable th;
        int i2;
        Exception e2;
        MethodCollector.i(9753);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i2 = a("VmSize", fileInputStream);
                a(fileInputStream);
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    a(fileInputStream);
                    i2 = -1;
                    MethodCollector.o(9753);
                    return i2;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileInputStream);
                    MethodCollector.o(9753);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = null;
            e2.printStackTrace();
            a(fileInputStream);
            i2 = -1;
            MethodCollector.o(9753);
            return i2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            a(fileInputStream);
            MethodCollector.o(9753);
            throw th;
        }
        MethodCollector.o(9753);
        return i2;
    }

    private static int h() {
        FileInputStream fileInputStream;
        Throwable th;
        int i2;
        Exception e2;
        MethodCollector.i(9907);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            try {
                i2 = a("Threads", fileInputStream);
                a(fileInputStream);
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    a(fileInputStream);
                    i2 = -1;
                    MethodCollector.o(9907);
                    return i2;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileInputStream);
                    MethodCollector.o(9907);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = null;
            e2.printStackTrace();
            a(fileInputStream);
            i2 = -1;
            MethodCollector.o(9907);
            return i2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            a(fileInputStream);
            MethodCollector.o(9907);
            throw th;
        }
        MethodCollector.o(9907);
        return i2;
    }

    private static int i() {
        FileInputStream fileInputStream;
        Throwable th;
        int i2;
        Exception e2;
        MethodCollector.i(9909);
        try {
            fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/limits");
            try {
                i2 = a("Max open files", fileInputStream);
                a(fileInputStream);
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    a(fileInputStream);
                    i2 = -1;
                    MethodCollector.o(9909);
                    return i2;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileInputStream);
                    MethodCollector.o(9909);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = null;
            e2.printStackTrace();
            a(fileInputStream);
            i2 = -1;
            MethodCollector.o(9909);
            return i2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            a(fileInputStream);
            MethodCollector.o(9909);
            throw th;
        }
        MethodCollector.o(9909);
        return i2;
    }

    public static int b() {
        MethodCollector.i(9657);
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < a(); i4++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
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
                        MethodCollector.o(9657);
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
                int a2 = a("cpu MHz", fileInputStream2) * 1000;
                if (a2 > i3) {
                    i3 = a2;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                MethodCollector.o(9657);
                throw th2;
            }
        }
        i2 = i3;
        if (String.valueOf(i2).length() >= 6) {
            int i6 = i2 / 1000;
            MethodCollector.o(9657);
            return i6;
        }
        MethodCollector.o(9657);
        return i2;
    }

    public static String c() {
        Throwable th;
        IOException e2;
        MethodCollector.i(9588);
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        a(bufferedReader2);
                        break;
                    } else if (readLine.contains(":")) {
                        String[] split = readLine.split(":");
                        if (split[0].contains("Hardware")) {
                            String str = split[1];
                            a(bufferedReader2);
                            MethodCollector.o(9588);
                            return str;
                        }
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    bufferedReader = bufferedReader2;
                    try {
                        e2.printStackTrace();
                        a(bufferedReader);
                        String str2 = Build.HARDWARE;
                        MethodCollector.o(9588);
                        return str2;
                    } catch (Throwable th2) {
                        th = th2;
                        a(bufferedReader);
                        MethodCollector.o(9588);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    a(bufferedReader);
                    MethodCollector.o(9588);
                    throw th;
                }
            }
        } catch (IOException e4) {
            e2 = e4;
            e2.printStackTrace();
            a(bufferedReader);
            String str22 = Build.HARDWARE;
            MethodCollector.o(9588);
            return str22;
        }
        String str222 = Build.HARDWARE;
        MethodCollector.o(9588);
        return str222;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static long d(Context context) {
        long b2 = c.b.d.b(context);
        if (b2 == -1) {
            return -1;
        }
        return b2;
    }

    public static long a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static long b(String str) {
        try {
            StatFs statFs = new StatFs(str);
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static int c(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 262144) == 262144) {
                return 1;
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int f(Context context) {
        try {
            return ((ActivityManager) a(context, "activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static boolean d(String str) {
        MethodCollector.i(9911);
        boolean z = false;
        Process process = null;
        try {
            Process exec = Runtime.getRuntime().exec(str);
            if (new BufferedReader(new InputStreamReader(exec.getInputStream())).readLine() != null) {
                z = true;
            }
            exec.destroy();
            MethodCollector.o(9911);
            return z;
        } catch (Exception unused) {
            if (0 != 0) {
                process.destroy();
            }
            MethodCollector.o(9911);
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                process.destroy();
            }
            MethodCollector.o(9911);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r0 == -1) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long b(android.content.Context r6) {
        /*
            r5 = 8501(0x2135, float:1.1912E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = -1
            r0 = 16
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            java.lang.String r0 = "activity"
            java.lang.Object r0 = a(r6, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0025
            r0.getMemoryInfo(r1)
            long r0 = r1.availMem
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004c
        L_0x0023:
            r3 = 0
            goto L_0x0028
        L_0x0025:
            r0 = -1
            goto L_0x0023
        L_0x0028:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "/proc/meminfo"
            r4.<init>(r2)     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "MemAvailable"
            int r0 = a(r2, r4)     // Catch:{ Exception -> 0x0048, all -> 0x003d }
            long r2 = (long) r0
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            a(r4)
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            r4 = r3
        L_0x0041:
            a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0048:
            r3 = r4
        L_0x0049:
            a(r3)
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.bq.b(android.content.Context):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (0 == 0) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(java.lang.String r5) {
        /*
            r4 = 9505(0x2521, float:1.332E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = -1
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            java.lang.String r1 = r1.readLine()     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = "0-[\\d]+$"
            boolean r0 = r1.matches(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            if (r0 != 0) goto L_0x0025
            goto L_0x0034
        L_0x0025:
            r0 = 2
            java.lang.String r0 = r1.substring(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x004a, all -> 0x0040 }
            int r3 = r0 + 1
        L_0x0034:
            r2.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003c:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x0040:
            r1 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x004d
        L_0x004a:
            r0 = r2
            goto L_0x0053
        L_0x004c:
            r1 = move-exception
        L_0x004d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        L_0x0051:
            if (r0 == 0) goto L_0x005b
        L_0x0053:
            r0.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005b
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.bq.c(java.lang.String):int");
    }

    public static long e(Context context) {
        long j2;
        if (context == null) {
            return -1;
        }
        try {
            if (TextUtils.isEmpty(context.getPackageName())) {
                return -1;
            }
            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107194b = context.getCacheDir();
            }
            String parent = com.ss.android.ugc.aweme.lancet.d.f107194b.getParent();
            long j3 = 0;
            if (parent != null) {
                File file = new File(parent);
                if (!file.exists()) {
                    return -1;
                }
                j2 = a(file);
            } else {
                j2 = 0;
            }
            File file2 = new File(c.b.d.a(context));
            if (file2.exists()) {
                j3 = a(file2);
            }
            return j2 + j3;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r0 == -1) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long a(android.content.Context r6) {
        /*
            r5 = 8263(0x2047, float:1.1579E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = -1
            r0 = 16
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            java.lang.String r0 = "activity"
            java.lang.Object r0 = a(r6, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x0025
            r0.getMemoryInfo(r1)
            long r0 = r1.totalMem
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004c
        L_0x0023:
            r3 = 0
            goto L_0x0028
        L_0x0025:
            r0 = -1
            goto L_0x0023
        L_0x0028:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "/proc/meminfo"
            r4.<init>(r2)     // Catch:{ Exception -> 0x0049, all -> 0x003f }
            java.lang.String r2 = "MemTotal"
            int r0 = a(r2, r4)     // Catch:{ Exception -> 0x0048, all -> 0x003d }
            long r2 = (long) r0
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r2
            a(r4)
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            goto L_0x0041
        L_0x003f:
            r0 = move-exception
            r4 = r3
        L_0x0041:
            a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0048:
            r3 = r4
        L_0x0049:
            a(r3)
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.bq.a(android.content.Context):long");
    }

    private static long a(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                length = a(file2);
            } else {
                length = file2.length();
            }
            j2 += length;
        }
        return j2;
    }

    private static int a(String str, FileInputStream fileInputStream) {
        MethodCollector.i(8799);
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < read) {
                if (bArr[i2] == 10 || i2 == 0) {
                    if (bArr[i2] == 10) {
                        i2++;
                    }
                    int i3 = i2;
                    while (i3 < read) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != str.charAt(i4)) {
                            continue;
                            break;
                        } else if (i4 == str.length() - 1) {
                            while (i3 < 1024 && bArr[i3] != 10) {
                                if (Character.isDigit(bArr[i3])) {
                                    int i5 = i3 + 1;
                                    while (i5 < 1024 && Character.isDigit(bArr[i5])) {
                                        i5++;
                                    }
                                    int parseInt = Integer.parseInt(new String(bArr, 0, i3, i5 - i3));
                                    MethodCollector.o(8799);
                                    return parseInt;
                                }
                                i3++;
                            }
                            MethodCollector.o(8799);
                            return -1;
                        } else {
                            i3++;
                        }
                    }
                    continue;
                }
                i2++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        MethodCollector.o(8799);
        return -1;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8497);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(8497);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
