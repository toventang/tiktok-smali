package com.ss.ugc.effectplatform.util;

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

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f153950a = new ConcurrentHashMap();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f153951a;

        /* renamed from: b  reason: collision with root package name */
        public long f153952b;

        static {
            Covode.recordClassIndex(102669);
        }
    }

    static {
        Covode.recordClassIndex(102668);
    }

    public static String a() {
        Object obj = f153950a.get("cache_key_cpu_model");
        if (obj != null) {
            return (String) obj;
        }
        String b2 = b();
        f153950a.put("cache_key_cpu_model", b2);
        return b2;
    }

    private static synchronized String b() {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e2;
        synchronized (e.class) {
            MethodCollector.i(9013);
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
                                    a(bufferedReader);
                                    MethodCollector.o(9013);
                                    return str;
                                }
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            try {
                                e2.printStackTrace();
                                a(bufferedReader);
                                String str2 = Build.HARDWARE;
                                MethodCollector.o(9013);
                                return str2;
                            } catch (Throwable th2) {
                                th = th2;
                                a(bufferedReader);
                                MethodCollector.o(9013);
                                throw th;
                            }
                        }
                    }
                }
                a(bufferedReader2);
            } catch (Exception e4) {
                e2 = e4;
                bufferedReader = null;
                e2.printStackTrace();
                a(bufferedReader);
                String str22 = Build.HARDWARE;
                MethodCollector.o(9013);
                return str22;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                a(bufferedReader);
                MethodCollector.o(9013);
                throw th;
            }
            String str222 = Build.HARDWARE;
            MethodCollector.o(9013);
            return str222;
        }
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

    public static a a(Context context) {
        Object obj = f153950a.get("cache_key_memory_info");
        if (obj != null) {
            return (a) obj;
        }
        a aVar = new a();
        aVar.f153951a = b(context);
        aVar.f153952b = c(context);
        f153950a.put("cache_key_memory_info", aVar);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034 A[Catch:{ Exception -> 0x0048, all -> 0x004f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long b(android.content.Context r7) {
        /*
            r6 = 9009(0x2331, float:1.2624E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = -1
            r0 = 16
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x0024 }
            r1.<init>()     // Catch:{ Exception -> 0x0024 }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = a(r7, r0)     // Catch:{ Exception -> 0x0024 }
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
            int r0 = a(r0, r4)     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
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
            a(r5)
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r2
        L_0x004f:
            r0 = move-exception
            r4 = r5
        L_0x0051:
            a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.e.b(android.content.Context):long");
    }

    private static long c(Context context) {
        long j2;
        FileInputStream fileInputStream;
        Throwable th;
        MethodCollector.i(9011);
        int i2 = Build.VERSION.SDK_INT;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) a(context, "activity");
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                j2 = memoryInfo.availMem;
                if (j2 == -1) {
                    FileInputStream fileInputStream2 = null;
                    fileInputStream = new FileInputStream("/proc/meminfo");
                    j2 = 1024 * ((long) a("MemAvailable", fileInputStream));
                    a(fileInputStream);
                }
                MethodCollector.o(9011);
                return j2;
            }
        } catch (Exception unused) {
        }
        j2 = -1;
        FileInputStream fileInputStream22 = null;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
            try {
                j2 = 1024 * ((long) a("MemAvailable", fileInputStream));
                a(fileInputStream);
            } catch (Exception unused2) {
                fileInputStream22 = fileInputStream;
                a(fileInputStream22);
                MethodCollector.o(9011);
                return j2;
            } catch (Throwable th2) {
                th = th2;
                a(fileInputStream);
                MethodCollector.o(9011);
                throw th;
            }
        } catch (Exception unused3) {
            a(fileInputStream22);
            MethodCollector.o(9011);
            return j2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            a(fileInputStream);
            MethodCollector.o(9011);
            throw th;
        }
        MethodCollector.o(9011);
        return j2;
    }

    private static int a(String str, FileInputStream fileInputStream) {
        MethodCollector.i(9012);
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
                                    MethodCollector.o(9012);
                                    return parseInt;
                                }
                                i3++;
                            }
                            MethodCollector.o(9012);
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
        MethodCollector.o(9012);
        return -1;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9010);
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
                    MethodCollector.o(9010);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
