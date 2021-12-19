package com.bytedance.crash.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static String f28013a;

    /* renamed from: b  reason: collision with root package name */
    private static File f28014b;

    /* renamed from: c  reason: collision with root package name */
    private static File f28015c;

    /* renamed from: d  reason: collision with root package name */
    private static File f28016d;

    /* renamed from: e  reason: collision with root package name */
    private static File f28017e;

    /* renamed from: f  reason: collision with root package name */
    private static File f28018f;

    static {
        Covode.recordClassIndex(16398);
    }

    public static File a() {
        File file = f28015c;
        if (file == null) {
            return f(m.f27724a);
        }
        return file;
    }

    public static File b() {
        if (f28018f == null) {
            File file = new File(new File(h(m.f27724a), c()), "trace");
            f28018f = file;
            file.getParentFile().mkdirs();
        }
        return f28018f;
    }

    private static String c() {
        return "anr_" + m.d();
    }

    public static File a(File file) {
        return new File(file, "tombstone.txt");
    }

    public static File b(File file) {
        return new File(file, "header.bin");
    }

    public static File c(File file) {
        return new File(file, "malloc.txt");
    }

    public static File d(File file) {
        return new File(file, "pthreads.txt");
    }

    public static File b(Context context) {
        if (context == null) {
            context = m.f27724a;
        }
        return new File(j(context), "npth/GwpReport");
    }

    public static File c(Context context) {
        return new File(j(context), "npth/availableCheck");
    }

    public static File d(Context context) {
        return new File(j(context), "npth");
    }

    public static File e(String str) {
        return new File(a(m.f27724a, str), "pthreads.txt");
    }

    public static File f(String str) {
        return new File(a(m.f27724a, str), "rountines.txt");
    }

    public static File g(String str) {
        return new File(a(m.f27724a, str), "leakd_threads.txt");
    }

    public static File h(Context context) {
        return new File(j(context), "npth/CrashCommonLog");
    }

    public static File a(Context context) {
        return new File(j(context), "npth/CrashLogJava");
    }

    public static File b(String str) {
        return new File(a(m.f27724a, str), "fds.txt");
    }

    public static File c(String str) {
        return new File(a(m.f27724a, str), "threads.txt");
    }

    public static File d(String str) {
        return new File(a(m.f27724a, str), "meminfo.txt");
    }

    public static File e(Context context) {
        if (f28014b == null) {
            if (context == null) {
                context = m.f27724a;
            }
            f28014b = new File(j(context), "npth/asan");
        }
        return f28014b;
    }

    public static File f(Context context) {
        if (f28015c == null) {
            if (context == null) {
                context = m.f27724a;
            }
            f28015c = new File(j(context), "npth/CrashLogNative");
        }
        return f28015c;
    }

    private static File k(Context context) {
        if (f28017e == null) {
            f28017e = new File(h(context), "asdawd");
        }
        return f28017e;
    }

    public static File g(Context context) {
        if (f28016d == null) {
            f28016d = new File(j(context) + '/' + "npth/CrashCommonLog/" + m.e());
        }
        return f28016d;
    }

    public static File i(Context context) {
        return new File(j(context) + '/' + "issueCrashTimes/current.times");
    }

    public static String j(Context context) {
        if (context == null) {
            m.f27730g.isDebugMode();
            return "";
        }
        if (TextUtils.isEmpty(f28013a)) {
            try {
                if (d.f107195c == null || !d.f107197e) {
                    d.f107195c = context.getFilesDir();
                }
                f28013a = d.f107195c.getAbsolutePath();
            } catch (Exception e2) {
                f28013a = "";
                e2.printStackTrace();
            }
        }
        return f28013a;
    }

    public static File a(String str) {
        return new File(k(m.f27724a), str);
    }

    public static File a(Context context, String str) {
        return new File(j(context) + '/' + "npth/CrashCommonLog/" + str);
    }
}
