package com.bytedance.android.live.broadcast.stream;

import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;

public final class f {
    static {
        Covode.recordClassIndex(4398);
    }

    private static final long a() {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 != null) {
            return b2.c();
        }
        return 0;
    }

    public static final void a(String str) {
        c.a.a("ttlive_broadcast_action_all").b("action", str).b("user_id", Long.valueOf(a())).a();
    }
}
