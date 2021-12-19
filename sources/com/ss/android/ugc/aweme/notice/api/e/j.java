package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.NoticePushMessage;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.websocket.a.c.b;
import com.ss.android.websocket.internal.a;
import h.f.b.l;
import h.m.d;

public final class j implements b {
    static {
        Covode.recordClassIndex(72458);
    }

    @Override // com.ss.android.websocket.a.c.b
    public final Object a(a aVar) {
        return b(aVar);
    }

    private static NoticePushMessage b(a aVar) {
        if (aVar == null) {
            try {
                l.b();
            } catch (Throwable unused) {
                return null;
            }
        }
        byte[] payload = aVar.getPayload();
        l.b(payload, "");
        return (NoticePushMessage) dw.a(new String(payload, d.f158808a), NoticePushMessage.class);
    }
}
