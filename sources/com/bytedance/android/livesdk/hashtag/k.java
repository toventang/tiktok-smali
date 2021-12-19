package com.bytedance.android.livesdk.hashtag;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k {
    static {
        Covode.recordClassIndex(10098);
    }

    public static final void a(String str) {
        l.d(str, "");
        b.a.a("livesdk_hashtag_anchor_live_take_button").a("action_type", str).b();
    }
}
