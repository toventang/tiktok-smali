package com.ss.android.ugc.aweme.utils;

import android.util.Log;
import com.bytedance.covode.number.Covode;

public final class eo {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f142880a;

    static {
        Covode.recordClassIndex(93489);
    }

    public static void a(String str) {
        if (f142880a && ((long) str.length()) > 4096) {
            while (str.length() > 4096) {
                str = str.replace(str.substring(0, 4096), "");
            }
        }
    }

    private static void b(String str) {
        if (f142880a && ((long) str.length()) > 4096) {
            while (str.length() > 4096) {
                str = str.replace(str.substring(0, 4096), "");
            }
        }
    }

    public static void a(Throwable th, String str) {
        if (f142880a) {
            b(str + "  " + Log.getStackTraceString(th));
        }
    }
}
