package com.bytedance.android.live.core.performance;

import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.android.live.core.performance.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f9232a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static com.bytedance.android.live.core.performance.a.a f9233b;

    static {
        Covode.recordClassIndex(4724);
    }

    public static boolean b() {
        File file = new File("/proc/stat");
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    private static long e() {
        long f2;
        if (f9232a == -1) {
            long j2 = 100;
            if (Build.VERSION.SDK_INT >= 21) {
                f2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                f2 = f();
            }
            if (f2 > 0) {
                j2 = f2;
            }
            f9232a = j2;
        }
        return f9232a;
    }

    private static long c() {
        BufferedReader bufferedReader;
        MethodCollector.i(11182);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                c.a(bufferedReader);
                MethodCollector.o(11182);
                return parseLong;
            } catch (Throwable unused) {
                c.a(bufferedReader);
                MethodCollector.o(11182);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            c.a(bufferedReader);
            MethodCollector.o(11182);
            return -1;
        }
    }

    private static long d() {
        BufferedReader bufferedReader;
        MethodCollector.i(11342);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                c.a(bufferedReader);
                MethodCollector.o(11342);
                return parseLong;
            } catch (Throwable unused) {
                c.a(bufferedReader);
                MethodCollector.o(11342);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            c.a(bufferedReader);
            MethodCollector.o(11342);
            return -1;
        }
    }

    private static long f() {
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

    public static double a() {
        long j2;
        double d2;
        double d3;
        MethodCollector.i(11340);
        if (f9233b == null) {
            f9233b = new com.bytedance.android.live.core.performance.a.a();
        }
        com.bytedance.android.live.core.performance.a.a aVar = f9233b;
        long currentTimeMillis = System.currentTimeMillis();
        long c2 = c();
        if (aVar.f9243j) {
            j2 = d();
        } else {
            j2 = 0;
        }
        double d4 = 0.0d;
        if (aVar.f9237d == 1) {
            try {
                Thread.sleep(360);
            } catch (InterruptedException unused) {
            }
            long c3 = c();
            if (aVar.f9243j) {
                long d5 = d() - j2;
                if (d5 > 0) {
                    d3 = (double) ((((float) c3) - ((float) c2)) / ((float) d5));
                    double d6 = (double) c3;
                    double d7 = (double) c2;
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    double currentTimeMillis2 = (double) (System.currentTimeMillis() - currentTimeMillis);
                    Double.isNaN(currentTimeMillis2);
                    double d8 = ((d6 - d7) * 1000.0d) / currentTimeMillis2;
                    double e2 = (double) e();
                    Double.isNaN(e2);
                    aVar.a(currentTimeMillis, d3, d8 / e2, c2, j2);
                }
            }
            d3 = 0.0d;
            double d62 = (double) c3;
            double d72 = (double) c2;
            Double.isNaN(d62);
            Double.isNaN(d72);
            double currentTimeMillis22 = (double) (System.currentTimeMillis() - currentTimeMillis);
            Double.isNaN(currentTimeMillis22);
            double d82 = ((d62 - d72) * 1000.0d) / currentTimeMillis22;
            double e22 = (double) e();
            Double.isNaN(e22);
            aVar.a(currentTimeMillis, d3, d82 / e22, c2, j2);
        } else {
            if (aVar.f9241h > -1) {
                if (aVar.f9243j) {
                    double d9 = (double) (c2 - aVar.f9240g);
                    Double.isNaN(d9);
                    double d10 = (double) (j2 - aVar.f9239f);
                    Double.isNaN(d10);
                    d4 = (d9 * 1.0d) / d10;
                }
                double d11 = (double) c2;
                double d12 = (double) aVar.f9240g;
                Double.isNaN(d11);
                Double.isNaN(d12);
                double d13 = (double) (currentTimeMillis - aVar.f9241h);
                Double.isNaN(d13);
                double d14 = ((d11 - d12) * 1000.0d) / d13;
                double e3 = (double) e();
                Double.isNaN(e3);
                d2 = d14 / e3;
            } else {
                d4 = 0.0d;
                d2 = 0.0d;
            }
            aVar.a(currentTimeMillis, d4, d2, c2, j2);
        }
        com.bytedance.android.live.core.c.a.a(3, "CommonMonitorUtil", "cpu Rate: " + f9233b.f9238e + ", cpu speed" + f9233b.f9242i);
        double d15 = f9233b.f9238e;
        MethodCollector.o(11340);
        return d15;
    }
}
