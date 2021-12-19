package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.e;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.websocket.a.c.b;
import com.ss.android.websocket.internal.a;
import h.f.b.l;
import h.m.d;

public final class f implements b {
    static {
        Covode.recordClassIndex(72454);
    }

    @Override // com.ss.android.websocket.a.c.b
    public final Object a(a aVar) {
        return b(aVar);
    }

    private static e b(a aVar) {
        if (aVar == null) {
            try {
                l.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        byte[] payload = aVar.getPayload();
        l.b(payload, "");
        return (e) dw.a(new String(payload, d.f158808a), e.class);
    }
}
