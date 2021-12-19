package com.ss.android.ugc.aweme.net.cache;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.bw;
import h.q;
import h.r;
import h.z;

public final class i {
    static {
        Covode.recordClassIndex(72150);
    }

    public static final z a(bw.a aVar) {
        Object obj;
        try {
            aVar.b();
            obj = q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        return (z) obj;
    }
}
