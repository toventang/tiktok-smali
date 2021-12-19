package com.ss.android.ugc.aweme.player.sdk;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f115103a;

    /* renamed from: b  reason: collision with root package name */
    public static AbstractC2946a f115104b;

    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a$a  reason: collision with other inner class name */
    public interface AbstractC2946a {
        static {
            Covode.recordClassIndex(73984);
        }

        void a(String str, String str2);

        void a(Throwable th, String str);
    }

    static {
        Covode.recordClassIndex(73983);
    }

    public static void a(String str) {
        AbstractC2946a aVar = f115104b;
        if (aVar != null) {
            aVar.a("PlayerLog", str);
        }
    }

    private static void b(String str) {
        AbstractC2946a aVar = f115104b;
        if (aVar != null) {
            aVar.a("PlayerLog", str);
        }
    }

    public static void a(Throwable th, String str) {
        AbstractC2946a aVar = f115104b;
        if (aVar != null) {
            aVar.a(th, str);
        }
    }

    public static void a(String str, String str2) {
        if (f115103a) {
            a(str + ", " + str2);
        }
    }

    public static void b(String str, String str2) {
        if (f115103a) {
            b(str + ", " + str2);
        }
    }

    public static void a(String str, Throwable th) {
        while (f115103a) {
            if (th != null) {
                str = "PlayerLog" + ", " + str;
            } else {
                b("PlayerLog" + ", " + str);
                return;
            }
        }
    }
}
