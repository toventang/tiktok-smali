package com.ss.android.ugc.aweme.utils.d;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f142797a = 3;

    /* renamed from: b  reason: collision with root package name */
    private static int f142798b = 3;

    /* renamed from: c  reason: collision with root package name */
    private static int f142799c = 3;

    /* renamed from: d  reason: collision with root package name */
    private static int f142800d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static int f142801e = 3;

    /* renamed from: f  reason: collision with root package name */
    private static int f142802f = 3;

    /* renamed from: g  reason: collision with root package name */
    private static int f142803g = 3;

    /* renamed from: h  reason: collision with root package name */
    private static int f142804h = 3;

    /* renamed from: i  reason: collision with root package name */
    private static int f142805i = 3;

    static {
        Covode.recordClassIndex(93419);
    }

    public static boolean a() {
        int i2;
        int i3 = f142798b;
        if (i3 == 3) {
            String str = Build.MANUFACTURER;
            if (TextUtils.isEmpty(str) || !str.contains("HUAWEI")) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            f142798b = i2;
            if (i2 == 1) {
                return true;
            }
            return false;
        } else if (i3 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean b() {
        int i2;
        int i3 = f142803g;
        if (i3 == 3) {
            String a2 = a.a().a("ro.vivo.os.name");
            if (TextUtils.isEmpty(a2) || !a2.toLowerCase().contains("funtouch")) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            f142803g = i2;
            if (i2 == 1) {
                return true;
            }
            return false;
        } else if (i3 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean c() {
        int i2;
        int i3 = f142805i;
        if (i3 == 3) {
            if (!TextUtils.isEmpty(a.a().a("ro.smartisan.version"))) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            f142805i = i2;
            if (i2 == 1) {
                return true;
            }
            return false;
        } else if (i3 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
