package com.ss.b;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static int f151634a = 3;

    /* renamed from: b  reason: collision with root package name */
    private static int f151635b = 3;

    /* renamed from: c  reason: collision with root package name */
    private static int f151636c = 3;

    static {
        Covode.recordClassIndex(100628);
    }

    public static boolean a() {
        int i2;
        int i3 = f151634a;
        if (i3 == 3) {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("oppo")) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            f151634a = i2;
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
        int i3 = f151635b;
        if (i3 == 3) {
            String str = Build.HARDWARE;
            if (TextUtils.isEmpty(str) || (!str.toLowerCase().contains("hi") && !str.toLowerCase().contains("kirin"))) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            f151635b = i2;
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
        int i3 = f151636c;
        if (i3 == 3) {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains("samsung")) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            f151636c = i2;
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
