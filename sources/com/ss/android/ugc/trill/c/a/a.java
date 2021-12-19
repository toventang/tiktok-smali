package com.ss.android.ugc.trill.c.a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f150473a = false;

    static {
        Covode.recordClassIndex(98957);
    }

    public static SharedPreferences a() {
        return d.a(com.bytedance.ies.ugc.appcontext.d.a(), "aweme_friends", 0);
    }

    public static String b(String str, String str2) {
        return a().getString(str, str2);
    }

    public static void c(String str, String str2) {
        a("twitter_access_token", str);
        a("twitter_access_token_secret", str2);
    }

    public static void a(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }
}
