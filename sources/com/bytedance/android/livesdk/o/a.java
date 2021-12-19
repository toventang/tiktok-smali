package com.bytedance.android.livesdk.o;

import com.bytedance.android.livesdk.ao.e;
import com.bytedance.covode.number.Covode;
import com.ss.optimizer.live.sdk.dns.d;
import h.f.b.l;

public final class a implements d {
    static {
        Covode.recordClassIndex(11807);
    }

    @Override // com.ss.optimizer.live.sdk.dns.d
    public final <T> T a(String str, T t) {
        l.d(t, "");
        if (l.a((Object) str, (Object) "TTNet_NQE_INFO")) {
            T t2 = (T) com.bytedance.android.live.network.b.a.a().toString();
            if ((t2 instanceof Object) && t2 != null) {
                return t2;
            }
            return t;
        }
        T t3 = (T) e.a(str, t);
        l.b(t3, "");
        return t3;
    }
}
