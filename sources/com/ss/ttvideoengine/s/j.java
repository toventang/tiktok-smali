package com.ss.ttvideoengine.s;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.o.a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static int f153283a = 112;

    /* renamed from: b  reason: collision with root package name */
    public static k f153284b;

    /* renamed from: c  reason: collision with root package name */
    public static int f153285c = 116;

    static {
        Covode.recordClassIndex(101786);
    }

    public static boolean a() {
        if (((f153283a >> 1) & 1) == 1 || ((f153285c >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (((f153283a >> 6) & 1) == 1 || ((f153285c >> 6) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static void b(int i2) {
        int i3 = f153285c & -5;
        f153285c = i3;
        f153285c = (i2 << 2) | i3;
    }

    public static void a(int i2) {
        int i3 = f153283a & -3;
        f153283a = i3;
        int i4 = i3 | (i2 << 1);
        f153283a = i4;
        if (i2 == 1) {
            int i5 = i4 & -5;
            f153283a = i5;
            f153283a = i5 | 4;
            ABRConfig.setLoglevel(1);
            a.a().f153138k = true;
        } else {
            a.a().f153138k = false;
            if (i2 <= 0) {
                d.e(6);
                return;
            }
        }
        d.e(1);
    }

    public static void a(String str, String str2) {
        if (((f153285c >> 2) & 1) == 1) {
            f(str, str2);
        }
        if (((f153283a >> 2) & 1) == 1) {
            com.a.a("<%s>%s", new Object[]{str, str2});
        }
    }

    public static void b(String str, String str2) {
        if (((f153285c >> 1) & 1) == 1) {
            f(str, str2);
        }
        if (((f153283a >> 1) & 1) == 1) {
            com.a.a("<%s>%s", new Object[]{str, str2});
        }
    }

    public static void c(String str, String str2) {
        if (((f153285c >> 5) & 1) == 1) {
            f(str, str2);
        }
        if (((f153283a >> 5) & 1) == 1) {
            com.a.a("<%s>%s", new Object[]{str, str2});
        }
    }

    public static void d(String str, String str2) {
        if (((f153285c >> 3) & 1) == 1) {
            f(str, str2);
        }
        if (((f153283a >> 3) & 1) == 1) {
            com.a.a("<%s>%s", new Object[]{str, str2});
        }
    }

    public static void e(String str, String str2) {
        if (((f153285c >> 6) & 1) == 1) {
            f(str, str2);
        }
        if (((f153283a >> 6) & 1) == 1) {
            com.a.a("<%s>%s", new Object[]{str, str2});
        }
    }

    private static void f(String str, String str2) {
        if (f153284b != null && !TextUtils.isEmpty(str2)) {
            k kVar = f153284b;
            if (!TextUtils.isEmpty(str)) {
                str2 = "TTVideoEngine: tag = " + str + ";  " + str2 + "\n";
            }
            kVar.a(str2);
        }
    }
}
