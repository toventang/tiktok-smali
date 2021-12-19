package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class gb {

    /* renamed from: a  reason: collision with root package name */
    public static String f142966a = "⁦";

    /* renamed from: b  reason: collision with root package name */
    public static String f142967b = "⁧";

    /* renamed from: c  reason: collision with root package name */
    public static String f142968c = "⁨";

    /* renamed from: d  reason: collision with root package name */
    public static String f142969d = "⁩";

    /* renamed from: e  reason: collision with root package name */
    public static String f142970e = "‬";

    /* renamed from: f  reason: collision with root package name */
    public static String f142971f = "‎";

    /* renamed from: g  reason: collision with root package name */
    public static String f142972g = "‏";

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(93561);
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return f142968c + str + f142969d;
    }

    public static boolean a(Context context) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                return true;
            }
        }
        return false;
    }
}
