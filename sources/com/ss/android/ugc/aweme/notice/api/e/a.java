package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.websocket.a.c.b;
import h.f.b.l;
import h.m.d;

public final class a implements b {
    static {
        Covode.recordClassIndex(72442);
    }

    @Override // com.ss.android.websocket.a.c.b
    public final Object a(com.ss.android.websocket.internal.a aVar) {
        return b(aVar);
    }

    private static com.ss.android.ugc.aweme.notice.api.bean.a b(com.ss.android.websocket.internal.a aVar) {
        if (aVar == null) {
            try {
                l.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        byte[] payload = aVar.getPayload();
        l.b(payload, "");
        return (com.ss.android.ugc.aweme.notice.api.bean.a) dw.a(new String(payload, d.f158808a), com.ss.android.ugc.aweme.notice.api.bean.a.class);
    }
}
