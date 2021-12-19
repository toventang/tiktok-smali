package com.bytedance.android.livesdk.wallet.b;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(13226);
    }

    public static void a(long j2, Map<String, Object> map) {
        c.a(d.b("ttlive_charge_current_diamond_status"), 1, j2, map);
    }

    public static void a(int i2, long j2, Map<String, Object> map) {
        c.a(d.a("ttlive_charge_current_diamond_status"), i2, j2, map);
    }
}
