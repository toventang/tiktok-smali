package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.LiveMessage;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.websocket.a.c.b;
import com.ss.android.websocket.internal.a;

public final class g implements b {
    static {
        Covode.recordClassIndex(72455);
    }

    @Override // com.ss.android.websocket.a.c.b
    public final Object a(a aVar) {
        try {
            return dw.a(new String(aVar.getPayload()), LiveMessage.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
