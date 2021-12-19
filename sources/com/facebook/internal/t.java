package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.m;
import com.ss.android.ugc.aweme.bf.d;

public class t {

    public interface a {
        static {
            Covode.recordClassIndex(29352);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(29350);
    }

    private t() {
    }

    public static boolean a() {
        if (com.facebook.internal.a.b.a.a(t.class)) {
            return false;
        }
        try {
            ae.a();
            return d.a(m.f48921g, "com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, t.class);
            return false;
        }
    }

    static /* synthetic */ void b() {
        if (!com.facebook.internal.a.b.a.a(t.class)) {
            try {
                if (!com.facebook.internal.a.b.a.a(t.class)) {
                    try {
                        ae.a();
                        d.a(m.f48921g, "com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                    } catch (Throwable th) {
                        com.facebook.internal.a.b.a.a(th, t.class);
                    }
                }
            } catch (Throwable th2) {
                com.facebook.internal.a.b.a.a(th2, t.class);
            }
        }
    }
}
