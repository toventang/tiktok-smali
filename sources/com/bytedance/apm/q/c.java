package com.bytedance.apm.q;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.apm.h;
import com.bytedance.apm.internal.b;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25231a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25232b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25233c;

    /* renamed from: d  reason: collision with root package name */
    private String f25234d;

    /* renamed from: e  reason: collision with root package name */
    private int f25235e;

    /* renamed from: f  reason: collision with root package name */
    private String f25236f;

    /* renamed from: g  reason: collision with root package name */
    private int f25237g;

    /* renamed from: h  reason: collision with root package name */
    private long f25238h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f25239i;

    /* renamed from: j  reason: collision with root package name */
    private long f25240j;

    /* renamed from: k  reason: collision with root package name */
    private long f25241k;

    /* renamed from: l  reason: collision with root package name */
    private String f25242l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f25243m;
    private long n;
    private long o;
    private double p;
    private long q;
    private long r;
    private double s;
    private long t;
    private long u;
    private double v;
    private boolean w;
    private boolean x;

    static {
        Covode.recordClassIndex(14697);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25246a = new c((byte) 0);

        static {
            Covode.recordClassIndex(14699);
        }
    }

    private static String d() {
        boolean a2;
        File file = new File("/system/lib/libc.so");
        if (!file.exists()) {
            return "unknown";
        }
        try {
            o oVar = new o(file);
            if (Math.max(oVar.f25258a, oVar.f25259b) <= 200000) {
                a2 = oVar.b("je_malloc");
            } else {
                a2 = oVar.a("je_malloc");
            }
            oVar.a();
            if (a2) {
                return "jemalloc";
            }
            return "dlmalloc";
        } catch (IOException unused) {
            return "unknown";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r7 = this;
            r4 = 0
            r6 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r5 = 0
        L_0x000f:
            java.lang.String r1 = r3.readLine()     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r1.split(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            int r1 = r2.length     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            r0 = 2
            if (r1 != r0) goto L_0x000f
            r1 = r2[r6]     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            if (r0 == 0) goto L_0x0031
            r0 = 1
            r0 = r2[r0]     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            java.lang.String r4 = r0.trim()     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            goto L_0x000f
        L_0x0031:
            r1 = r2[r6]     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            java.lang.String r0 = "processor"
            boolean r0 = r1.startsWith(r0)     // Catch:{ Exception -> 0x0042, all -> 0x0046 }
            if (r0 == 0) goto L_0x000f
            int r5 = r5 + 1
            goto L_0x000f
        L_0x003e:
            r3.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x004e
        L_0x0042:
            r3.close()     // Catch:{ Exception -> 0x004e }
            goto L_0x004e
        L_0x0046:
            r0 = move-exception
            r3.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            throw r0
        L_0x004d:
            r5 = 0
        L_0x004e:
            r7.f25234d = r4
            r7.f25235e = r5
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0062
            boolean r0 = com.bytedance.apm.q.p.b()
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = android.os.Build.HARDWARE
            r7.f25234d = r0
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.q.c.b():void");
    }

    private static String c() {
        String str = null;
        Process exec = Runtime.getRuntime().exec("mount");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        try {
            a(exec, TimeUnit.SECONDS);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains("/data ")) {
                    String[] split = readLine.split(" ");
                    int length = split.length;
                    for (int i2 = 0; i2 < length - 1; i2++) {
                        if (split[i2].equals("/data")) {
                            int i3 = i2 + 1;
                            if (split[i3].equals(StringSet.type)) {
                                int i4 = i2 + 2;
                                if (i4 < length) {
                                    str = split[i4];
                                }
                            } else {
                                str = split[i3];
                            }
                        }
                    }
                }
            }
            exec.destroy();
            try {
                bufferedReader.close();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
                throw th;
            } catch (IOException unused3) {
                throw th;
            }
        }
        return str;
    }

    private void a() {
        String str = com.bytedance.apm.c.f24685a.getApplicationInfo().nativeLibraryDir;
        if (!TextUtils.isEmpty(str) && str.endsWith("arm64")) {
            this.f25232b = true;
        }
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
            sb = new StringBuilder(Build.CPU_ABI);
        } else {
            for (int i2 = 0; i2 < Build.SUPPORTED_ABIS.length; i2++) {
                sb.append(Build.SUPPORTED_ABIS[i2]);
                if (i2 != Build.SUPPORTED_ABIS.length - 1) {
                    sb.append(", ");
                }
            }
        }
        String sb2 = sb.toString();
        if (sb2 != null && sb2.contains("64")) {
            this.f25233c = true;
        }
        b bVar = b.a.f25049a;
        String a2 = bVar.a("sp_cpu_model");
        int i3 = bVar.f25048a.getInt("sp_cpu_core_num", -1);
        if (!TextUtils.isEmpty(a2)) {
            this.f25234d = a2;
            this.f25235e = i3;
            return;
        }
        b();
        if (TextUtils.isEmpty(this.f25234d)) {
            this.f25234d = "unknown";
        }
        bVar.a("sp_cpu_model", this.f25234d);
        bVar.f25048a.edit().putInt("sp_cpu_core_num", this.f25235e).apply();
    }

    private c() {
        File file;
        if (s.a()) {
            final Throwable th = new Throwable("Don't use DeviceInfoUtil on main thread.");
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.q.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14698);
                }

                public final void run() {
                    h.b.f24998a.b(th, "apm_error");
                }
            });
        }
        boolean z = com.bytedance.apm.c.n;
        this.f25231a = z;
        if (z) {
            try {
                a();
                com.bytedance.apm.internal.b bVar = b.a.f25049a;
                String a2 = bVar.a("sp_fs_type");
                long b2 = bVar.b("sp_fs_check_time");
                long currentTimeMillis = System.currentTimeMillis();
                if (TextUtils.isEmpty(a2) || currentTimeMillis - b2 >= 604800000) {
                    String c2 = c();
                    this.f25236f = c2;
                    if (TextUtils.isEmpty(c2)) {
                        this.f25236f = "unknown";
                    }
                    bVar.a("sp_fs_type", this.f25236f);
                    bVar.a("sp_fs_check_time", currentTimeMillis);
                } else {
                    this.f25236f = a2;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) a(com.bytedance.apm.c.f24685a, "activity")).getMemoryInfo(memoryInfo);
                int i2 = Build.VERSION.SDK_INT;
                this.f25237g = (int) (memoryInfo.totalMem / 536870912);
                if (Build.VERSION.SDK_INT < 21) {
                    this.f25242l = "dlmalloc";
                } else if (Build.VERSION.SDK_INT >= 24) {
                    this.f25242l = "jemalloc";
                } else {
                    String a3 = b.a.f25049a.a("sp_malloc_impl");
                    if (a3 == null) {
                        a3 = d();
                        b.a.f25049a.a("sp_malloc_impl", a3);
                    }
                    this.f25242l = a3;
                }
                int i3 = Build.VERSION.SDK_INT;
                this.f25243m = true;
                StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                if (this.f25243m) {
                    this.o = statFs.getAvailableBytes();
                    this.n = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
                } else {
                    this.o = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
                    this.n = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
                }
                this.p = a(this.o, this.n);
                try {
                    Context context = com.bytedance.apm.c.f24685a;
                    if (d.f107195c == null || !d.f107197e) {
                        file = context.getFilesDir();
                        d.f107195c = file;
                    } else {
                        file = d.f107195c;
                    }
                    StatFs statFs2 = new StatFs(file.getAbsolutePath());
                    if (this.f25243m) {
                        this.r = statFs2.getAvailableBytes();
                        this.q = statFs2.getBlockSizeLong() * statFs2.getBlockCountLong();
                    } else {
                        this.r = ((long) statFs2.getBlockSize()) * ((long) statFs2.getAvailableBlocks());
                        this.q = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
                    }
                    this.s = a(this.r, this.q);
                } catch (Throwable unused) {
                }
                String str = null;
                try {
                    str = Environment.getExternalStorageState();
                } catch (Exception unused2) {
                }
                boolean equals = TextUtils.equals(str, "mounted");
                this.w = equals;
                if (equals) {
                    try {
                        StatFs statFs3 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                        if (this.f25243m) {
                            this.u = statFs3.getAvailableBytes();
                            this.t = statFs3.getBlockSizeLong() * statFs3.getBlockCountLong();
                        } else {
                            this.u = ((long) statFs3.getBlockSize()) * ((long) statFs3.getAvailableBlocks());
                            this.t = ((long) statFs3.getBlockSize()) * ((long) statFs3.getBlockCount());
                        }
                        this.v = a(this.u, this.t);
                    } catch (Throwable unused3) {
                    }
                } else {
                    this.t = 0;
                }
                this.x = Environment.isExternalStorageRemovable();
            } catch (Throwable unused4) {
            }
        }
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    private void b(JSONObject jSONObject) {
        if (jSONObject != null && this.f25231a) {
            jSONObject.put("apm_fs_type", this.f25236f);
        }
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject != null && this.f25231a) {
            jSONObject.put("apm_physical_mem", this.f25237g);
            jSONObject.put("apm_malloc_impl", this.f25242l);
        }
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject != null && this.f25231a) {
            jSONObject.put("apm_is_app_64", this.f25232b);
            jSONObject.put("apm_is_device_64", this.f25233c);
            jSONObject.put("apm_cpu_model", this.f25234d);
            int i2 = this.f25235e;
            if (i2 > 0) {
                jSONObject.put("apm_cpu_core_num", i2);
            }
        }
    }

    private void d(JSONObject jSONObject) {
        boolean z;
        if (jSONObject != null && this.f25231a) {
            this.f25238h = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.freeMemory();
            long j2 = runtime.totalMemory();
            this.f25240j = maxMemory / 1048576;
            long j3 = j2 - freeMemory;
            this.f25241k = j3 / 1048576;
            if (((float) j3) > ((float) maxMemory) * 0.95f) {
                z = true;
            } else {
                z = false;
            }
            this.f25239i = z;
            jSONObject.put("apm_native_heap_size", this.f25238h);
            jSONObject.put("apm_java_heap_leak", this.f25239i);
            jSONObject.put("apm_java_heap_used", this.f25241k);
            jSONObject.put("apm_java_heap_max", this.f25240j);
        }
    }

    private void e(JSONObject jSONObject) {
        if (jSONObject != null && this.f25231a) {
            if (this.n != 0) {
                jSONObject.put("apm_sys_avail_size", this.o / 1048576);
                jSONObject.put("apm_sys_avail_ratio", this.p);
            }
            if (this.q != 0) {
                jSONObject.put("apm_data_avail_size", this.r / 1073741824);
                jSONObject.put("apm_data_avail_ratio", this.s);
            }
            if (this.t != 0) {
                jSONObject.put("apm_sd_avail_size", this.u / 1073741824);
                jSONObject.put("apm_sd_avail_ratio", this.v);
            }
            if (this.w) {
                jSONObject.put("apm_external_removable", this.x);
            }
        }
    }

    public final void a(JSONObject jSONObject, boolean z) {
        if (this.f25231a || z) {
            try {
                a.f25246a.d(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private static double a(long j2, long j3) {
        if (j3 == 0) {
            return 0.0d;
        }
        double d2 = (double) j2;
        double d3 = (double) j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double round = (double) Math.round((d2 / d3) * 100.0d);
        Double.isNaN(round);
        return round / 100.0d;
    }

    public final void b(JSONObject jSONObject, boolean z) {
        if (this.f25231a || z) {
            try {
                a.f25246a.a(jSONObject);
                a.f25246a.c(jSONObject);
                a.f25246a.b(jSONObject);
                a.f25246a.e(jSONObject);
            } catch (JSONException unused) {
            }
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

    private static boolean a(Process process, TimeUnit timeUnit) {
        if (Build.VERSION.SDK_INT >= 26) {
            return process.waitFor(2, timeUnit);
        }
        long nanoTime = System.nanoTime();
        long nanos = timeUnit.toNanos(2);
        do {
            try {
                process.exitValue();
                return true;
            } catch (IllegalThreadStateException unused) {
                if (nanos > 0) {
                    Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 100L));
                }
                nanos = timeUnit.toNanos(2) - (System.nanoTime() - nanoTime);
                if (nanos <= 0) {
                    return false;
                }
            }
        } while (nanos <= 0);
        return false;
    }
}
