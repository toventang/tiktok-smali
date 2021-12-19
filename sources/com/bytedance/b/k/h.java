package com.bytedance.b.k;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Locale;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequence f26332a = "amigo";

    /* renamed from: b  reason: collision with root package name */
    public static final CharSequence f26333b = "funtouch";

    /* renamed from: c  reason: collision with root package name */
    public static boolean f26334c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f26335d;

    /* renamed from: e  reason: collision with root package name */
    public static String f26336e;

    /* renamed from: f  reason: collision with root package name */
    private static final CharSequence f26337f = "sony";

    /* renamed from: g  reason: collision with root package name */
    private static Method f26338g;

    public static boolean c() {
        try {
            if (Class.forName("miui.os.Build") != null) {
                f26334c = true;
                return true;
            }
        } catch (Exception unused) {
        }
        return f26334c;
    }

    static {
        Covode.recordClassIndex(15297);
    }

    public static boolean a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    public static String b() {
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
                d.a(bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                d.a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            d.a(bufferedReader);
            return str2;
        }
    }

    private static String b(String str) {
        try {
            if (f26338g == null) {
                f26338g = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            return (String) f26338g.invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
