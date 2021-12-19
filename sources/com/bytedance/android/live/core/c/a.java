package com.bytedance.android.live.core.c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(4560);
    }

    public static void a(String str) {
        a(3, "ALogger", str);
    }

    public static void b(String str) {
        a(6, "ALogger", str);
    }

    public static void a(String str, Throwable th) {
        a(6, str, null, th);
    }

    public static void a(int i2, String str, StackTraceElement[] stackTraceElementArr) {
        if (LiveEnableALogSetting.INSTANCE.isEnable()) {
            com.ss.a.a.a.a(i2, str, stackTraceElementArr);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        a(6, str, str2, th);
    }

    public static void a(String str, String str2, Throwable th) {
        a(5, str, str2, th);
    }

    public static void a(int i2, String str, String str2) {
        if (!LiveEnableALogSetting.INSTANCE.isDisable()) {
            if (i2 == 2) {
                com.ss.a.a.a.a(str, str2);
            } else if (i2 == 3) {
                com.ss.a.a.a.b(str, str2);
            } else if (i2 == 4) {
                com.ss.a.a.a.c(str, str2);
            } else if (i2 == 5) {
                com.ss.a.a.a.d(str, str2);
            } else if (i2 == 6) {
                com.ss.a.a.a.e(str, str2);
            }
        }
    }

    public static void a(int i2, String str, String str2, Throwable th) {
        if (!LiveEnableALogSetting.INSTANCE.isDisable()) {
            boolean isEmpty = TextUtils.isEmpty(str2);
            if (i2 != 5) {
                if (i2 == 6) {
                    if (isEmpty) {
                        com.ss.a.a.a.b(str, th);
                    } else {
                        com.ss.a.a.a.b(str, str2, th);
                    }
                }
            } else if (isEmpty) {
                com.ss.a.a.a.a(str, th);
            } else {
                com.ss.a.a.a.a(str, str2, th);
            }
        }
    }
}
