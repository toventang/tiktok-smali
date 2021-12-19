package com.ss.android.ugc.aweme.setting.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f123039a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(80795);
    }

    public static void a(String str) {
        l.d(str, "");
        r.a("unblock_account", new d().a("enter_from", "blocked_accounts").a("to_use_id", str).f66730a);
    }
}
