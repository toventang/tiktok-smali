package com.ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f62829a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(38699);
    }

    public static void a(String str) {
        l.d(str, "");
        r.a("age_gate_logout", new a().a("action", str).f62575a);
    }

    public static void b(String str) {
        l.d(str, "");
        r.a("age_gate_download_videos", new a().a("action", str).f62575a);
    }

    public static void c(String str) {
        l.d(str, "");
        r.a("age_gate_confirm_not_download", new a().a("action", str).f62575a);
    }
}
