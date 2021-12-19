package com.bytedance.apm.q;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.a;
import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f25227a;

    /* renamed from: b  reason: collision with root package name */
    private static int f25228b;

    /* renamed from: c  reason: collision with root package name */
    private static long f25229c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static long f25230d = -1;

    static {
        Covode.recordClassIndex(14696);
    }

    public static long f() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return a(e.a(c.f24685a));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long g() {
        long i2;
        if (f25229c == -1) {
            long j2 = 100;
            if (Build.VERSION.SDK_INT >= 21) {
                i2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else {
                int i3 = Build.VERSION.SDK_INT;
                i2 = i();
            }
            if (i2 > 0) {
                j2 = i2;
            }
            f25229c = j2;
        }
        return f25229c;
    }

    /* JADX INFO: finally extract failed */
    private static synchronized int h() {
        synchronized (b.class) {
            int i2 = f25228b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = 0;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 50);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    } else if (readLine.startsWith("processor")) {
                        i3++;
                    }
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            }
            bufferedReader.close();
            f25228b = i3;
            return f25228b;
        }
    }

    public static long a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                com.bytedance.monitor.a.c.a(bufferedReader);
                return parseLong;
            } catch (Throwable unused) {
                com.bytedance.monitor.a.c.a(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            com.bytedance.monitor.a.c.a(bufferedReader);
            return -1;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r4 >= r5) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long b() {
        /*
            int r5 = h()
            r6 = -1
            if (r5 > 0) goto L_0x0009
            return r6
        L_0x0009:
            r4 = 0
        L_0x000a:
            r0 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0055 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "/sys/devices/system/cpu/cpu"
            r1.<init>(r0)     // Catch:{ all -> 0x0055 }
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "/cpufreq/stats/time_in_state"
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0055 }
            r2.<init>(r0)     // Catch:{ all -> 0x0055 }
            r0 = 50
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0055 }
        L_0x002c:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x004b
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "\\s+"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ all -> 0x0053 }
            int r1 = r2.length     // Catch:{ all -> 0x0053 }
            r0 = 2
            if (r1 != r0) goto L_0x002c
            r0 = 1
            r0 = r2[r0]     // Catch:{ all -> 0x0053 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0053 }
            long r6 = r6 + r0
            goto L_0x002c
        L_0x004b:
            r3.close()     // Catch:{ all -> 0x005b }
            int r4 = r4 + 1
            if (r4 >= r5) goto L_0x005b
            goto L_0x000a
        L_0x0053:
            r0 = move-exception
            goto L_0x0057
        L_0x0055:
            r0 = move-exception
            goto L_0x005a
        L_0x0057:
            r3.close()
        L_0x005a:
            throw r0
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.q.b.b():long");
    }

    public static long c() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                com.bytedance.monitor.a.c.a(bufferedReader);
                return parseLong;
            } catch (Throwable unused) {
                com.bytedance.monitor.a.c.a(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            com.bytedance.monitor.a.c.a(bufferedReader);
            return -1;
        }
    }

    public static long d() {
        Throwable th;
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                com.bytedance.monitor.a.c.a(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                com.bytedance.monitor.a.c.a(bufferedReader);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = bufferedReader2;
                com.bytedance.monitor.a.c.a(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            com.bytedance.monitor.a.c.a(bufferedReader);
            return -1;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.monitor.a.c.a(bufferedReader);
            throw th;
        }
    }

    public static long e() {
        try {
            String[] split = a(a.a("/proc/%s/status", new Object[]{Integer.valueOf(Process.myPid())})).trim().split("\n");
            for (String str : split) {
                if (str.startsWith("VmSize")) {
                    Matcher matcher = Pattern.compile("\\d+").matcher(str);
                    if (matcher.find()) {
                        return Long.parseLong(matcher.group());
                    }
                }
            }
            if (split.length > 12) {
                Matcher matcher2 = Pattern.compile("\\d+").matcher(split[12]);
                if (matcher2.find()) {
                    return Long.parseLong(matcher2.group());
                }
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    private static long i() {
        try {
            int i2 = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt(null);
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Object obj = cls.getField("os").get(null);
            return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i2))).longValue();
        } catch (Exception unused) {
            return 100;
        }
    }

    public static long a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getTotalBytes();
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static long b(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                length = b(file2);
            } else {
                length = file2.length();
            }
            j2 += length;
        }
        return j2;
    }

    public static long a(Context context) {
        File file;
        if (context == null) {
            return -1;
        }
        try {
            if (d.f107195c == null || !d.f107197e) {
                d.f107195c = context.getFilesDir();
            }
            File file2 = new File(d.f107195c.getParent());
            if (!file2.exists()) {
                return -1;
            }
            long b2 = b(file2);
            if (!TextUtils.isEmpty(null)) {
                file = context.getExternalFilesDir(null);
            } else {
                if (d.f107196d == null || !d.f107197e) {
                    d.f107196d = context.getExternalFilesDir(null);
                }
                file = d.f107196d;
            }
            if (file != null) {
                File parentFile = file.getParentFile();
                long j2 = 0;
                if (parentFile.exists()) {
                    j2 = b(parentFile);
                }
                return b2 + j2;
            }
            return -1;
        } catch (Throwable unused) {
        }
    }

    public static long b(Context context) {
        long j2;
        if (context == null) {
            return -1;
        }
        try {
            if (TextUtils.isEmpty(context.getPackageName())) {
                return -1;
            }
            if (d.f107194b == null || !d.f107197e) {
                d.f107194b = context.getCacheDir();
            }
            File file = d.f107194b;
            long j3 = 0;
            if (file.exists()) {
                j2 = b(file);
            } else {
                j2 = 0;
            }
            Context context2 = c.f24685a;
            if (d.f107193a == null || !d.f107197e) {
                d.f107193a = context2.getExternalCacheDir();
            }
            File file2 = d.f107193a;
            if (file2.exists()) {
                j3 = b(file2);
            }
            return j2 + j3;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.InputStream r4) {
        /*
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x002b }
            r0.<init>(r4)     // Catch:{ all -> 0x002b }
            r2.<init>(r0)     // Catch:{ all -> 0x002b }
        L_0x0010:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = r3.append(r0)     // Catch:{ all -> 0x0028 }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0020:
            r2.close()
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0028:
            r0 = move-exception
            r1 = r2
            goto L_0x002c
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.q.b.a(java.io.InputStream):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r2) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0015 }
            r1.<init>(r0)     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = a(r1)     // Catch:{ all -> 0x0013 }
            r1.close()
            return r0
        L_0x0013:
            r0 = move-exception
            goto L_0x0017
        L_0x0015:
            r0 = move-exception
            r1 = r2
        L_0x0017:
            if (r1 == 0) goto L_0x001c
            r1.close()
        L_0x001c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.q.b.a(java.lang.String):java.lang.String");
    }

    public static Debug.MemoryInfo a(int i2, Context context) {
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) a(context, "activity");
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i2})[0];
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!i.f107219a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                    } catch (Exception e2) {
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                i.f107219a = false;
            }
            return systemService;
        }
    }
}
