package com.ss.android.ugc.aweme.shortcut;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final Keva f124691a;

    /* renamed from: b  reason: collision with root package name */
    static long f124692b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f124693c = new d();

    /* renamed from: d  reason: collision with root package name */
    private static long f124694d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f124695e;

    private d() {
    }

    public static long a() {
        return f124691a.getLong("key_withdrawal_num", 0);
    }

    static {
        Covode.recordClassIndex(81937);
        Keva repo = Keva.getRepo("shortcut_keva");
        l.b(repo, "");
        f124691a = repo;
    }

    public static void a(long j2) {
        f124694d = j2;
        f124691a.storeLong("key_withdrawal_num", j2);
    }

    public static void a(boolean z) {
        f124695e = z;
        f124691a.storeBoolean("key_last_login_state", z);
    }
}
