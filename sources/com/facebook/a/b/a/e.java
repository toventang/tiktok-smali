package com.facebook.a.b.a;

import com.bytedance.covode.number.Covode;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46633a = e.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private static Class<?> f46634b;

    static {
        Covode.recordClassIndex(28428);
    }

    public static void a(String str) {
        a("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static void a(String str, String str2, String str3) {
        try {
            if (f46634b == null) {
                f46634b = Class.forName("com.unity3d.player.UnityPlayer");
            }
            f46634b.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(f46634b, str, str2, str3);
        } catch (Exception unused) {
        }
    }
}
