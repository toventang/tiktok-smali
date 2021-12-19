package com.bytedance.crash.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.covode.number.Covode;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static long f27936a = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static long f27937a = -1;

        static {
            Covode.recordClassIndex(16348);
        }

        public static long a() {
            if (o.f27936a == -1) {
                o.f27936a = 1000 / b();
            }
            return o.f27936a;
        }

        private static long b() {
            long a2;
            long j2 = f27937a;
            if (j2 > 0) {
                return j2;
            }
            long j3 = 100;
            if (Build.VERSION.SDK_INT >= 21) {
                a2 = Os.sysconf(OsConstants._SC_CLK_TCK);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                a2 = a("_SC_CLK_TCK");
            }
            if (a2 > 0) {
                j3 = a2;
            }
            f27937a = j3;
            return j3;
        }

        private static long a(String str) {
            try {
                int i2 = Class.forName("libcore.io.OsConstants").getField(str).getInt(null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get(null);
                return ((Long) cls2.getMethod("sysconf", Integer.TYPE).invoke(obj, Integer.valueOf(i2))).longValue();
            } catch (Throwable unused) {
                return 100;
            }
        }
    }

    static {
        Covode.recordClassIndex(16347);
    }
}
