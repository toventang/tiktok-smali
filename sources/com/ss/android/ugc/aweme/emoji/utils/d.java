package com.ss.android.ugc.aweme.emoji.utils;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static d f89450c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile long f89451d;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f89452a = com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme_emoji_" + f89451d, 0);

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f89453b = com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme_emoji", 0);

    static {
        Covode.recordClassIndex(56212);
    }

    public final boolean c() {
        return this.f89452a.getBoolean("hint_weshine_search", true);
    }

    public final String d() {
        return this.f89453b.getString("key_im_sys_small_emoji_md5", "");
    }

    public final int e() {
        return this.f89453b.getInt("key_im_sys_small_emoji_version", 0);
    }

    public final String g() {
        return this.f89453b.getString("last_login_user_id", "");
    }

    public final void b() {
        this.f89452a.edit().putBoolean("hint_weshine_search", false).commit();
    }

    public final void f() {
        this.f89453b.edit().putString("last_login_user_id", a.b().toString()).commit();
    }

    private d() {
        f89451d = a.c();
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            MethodCollector.i(1648);
            long c2 = a.c();
            if (f89450c == null || c2 != f89451d) {
                synchronized (d.class) {
                    try {
                        if (f89450c == null || c2 != f89451d) {
                            f89450c = new d();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(1648);
                        throw th;
                    }
                }
            }
            dVar = f89450c;
            MethodCollector.o(1648);
        }
        return dVar;
    }
}
