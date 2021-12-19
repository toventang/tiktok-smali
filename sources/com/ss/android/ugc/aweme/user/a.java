package com.ss.android.ugc.aweme.user;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import h.m.p;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f142312a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(93088);
    }

    public static final int a(String str) {
        boolean z;
        Integer a2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (a2 = a(str, "save_login")) != null) {
            return a2.intValue();
        }
        return -1;
    }

    private static Keva b(String str) {
        l.d(str, "");
        String concat = "aweme_user_config_".concat(String.valueOf(b.f142323a.replace(p.b((CharSequence) str).toString(), "")));
        l.b(concat, "");
        Keva repo = Keva.getRepo(concat);
        l.b(repo, "");
        return repo;
    }

    public static Integer a(String str, String str2) {
        boolean z;
        l.d(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        return Integer.valueOf(b(str).getInt(str2, -1));
    }

    public static final void a(String str, boolean z) {
        int i2;
        l.d(str, "");
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        a(str, "save_login", i2);
    }

    public static void a(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        b(str).storeInt(str2, i2);
    }
}
