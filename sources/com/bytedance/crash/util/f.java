package com.bytedance.crash.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.regex.Pattern;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27992a;

    /* renamed from: b  reason: collision with root package name */
    private static int f27993b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f27994c = Pattern.compile("^0-([\\d]+)$");

    static {
        Covode.recordClassIndex(16380);
    }

    public static boolean b() {
        if (!f27992a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    com.bytedance.crash.j.f.f27672a = true;
                    f27992a = true;
                    return com.bytedance.crash.j.f.f27672a;
                }
            } catch (Exception unused) {
            }
            f27992a = true;
        }
        return com.bytedance.crash.j.f.f27672a;
    }

    public static boolean c() {
        if (Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    public static boolean a() {
        try {
            if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase(Locale.getDefault()).startsWith("hua")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase(Locale.getDefault()).startsWith("hua"))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
