package com.bytedance.common.utility.c;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f26925a = true;

    /* renamed from: b  reason: collision with root package name */
    private static b f26926b = new b();

    static {
        Covode.recordClassIndex(15888);
    }

    public static String a(String str) {
        if (f26925a) {
            try {
                return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            } catch (Throwable unused) {
            }
        }
        return a.a(str);
    }
}
