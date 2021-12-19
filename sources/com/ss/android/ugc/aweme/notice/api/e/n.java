package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.bean.PushChallengeInfoMsg;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.websocket.a.c.b;
import com.ss.android.websocket.internal.a;

public final class n implements b {
    static {
        Covode.recordClassIndex(72462);
    }

    @Override // com.ss.android.websocket.a.c.b
    public final /* synthetic */ Object a(a aVar) {
        return b(aVar);
    }

    private static PushChallengeInfoMsg b(a aVar) {
        try {
            return (PushChallengeInfoMsg) dw.a(new String(aVar.getPayload()), PushChallengeInfoMsg.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
