package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.websocket.a.c.b;
import com.ss.android.websocket.internal.a;

public final class d implements b {
    static {
        Covode.recordClassIndex(72452);
    }

    @Override // com.ss.android.websocket.a.c.b
    public final Object a(a aVar) {
        return b(aVar);
    }

    private static com.ss.android.ugc.aweme.cj.a b(a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            com.ss.android.ugc.aweme.cj.a aVar2 = new com.ss.android.ugc.aweme.cj.a();
            aVar2.f71087a = aVar.getMethod();
            aVar2.f71088b = aVar.getService();
            aVar2.f71089c = aVar.getPayload();
            aVar2.f71090d = aVar.getPayloadType();
            aVar2.f71091e = aVar.getPayloadEncoding();
            return aVar2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
