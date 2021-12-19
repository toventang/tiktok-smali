package com.bytedance.apm.q;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.c;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Locale;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequence f25273a = "amigo";

    /* renamed from: b  reason: collision with root package name */
    public static final CharSequence f25274b = "funtouch";

    /* renamed from: c  reason: collision with root package name */
    public static boolean f25275c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f25276d;

    /* renamed from: e  reason: collision with root package name */
    public static String f25277e;

    /* renamed from: f  reason: collision with root package name */
    private static final CharSequence f25278f = "sony";

    /* renamed from: g  reason: collision with root package name */
    private static Method f25279g;

    public static boolean d() {
        try {
            if (Class.forName("miui.os.Build") != null) {
                f25275c = true;
                return true;
            }
        } catch (Exception unused) {
        }
        return f25275c;
    }

    static {
        Covode.recordClassIndex(14716);
    }

    public static boolean a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    public static String c() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean b() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith("hua")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith("hua"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(String str) {
        String b2 = b(str);
        if (!TextUtils.isEmpty(b2)) {
            return b2;
        }
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            Process exec = Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str)));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
                c.a(bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                c.a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            c.a(bufferedReader);
            return str2;
        }
    }

    private static String b(String str) {
        try {
            if (f25279g == null) {
                f25279g = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            return (String) f25279g.invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
