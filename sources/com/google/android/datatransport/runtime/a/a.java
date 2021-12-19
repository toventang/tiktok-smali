package com.google.android.datatransport.runtime.a;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(30903);
    }

    public static String a(String str) {
        return "TransportRuntime.".concat(String.valueOf(str));
    }

    public static void a(String str, String str2, Object... objArr) {
        a(str);
        com.a.a(str2, objArr);
    }

    public static void a(String str, String str2, Object obj) {
        a(str);
        com.a.a(str2, new Object[]{obj});
    }
}
