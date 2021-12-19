package com.ss.android.ugc.aweme.notice.api.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.websocket.a.c.b;
import com.ss.android.websocket.internal.a;

public final class c implements b {
    static {
        Covode.recordClassIndex(72451);
    }

    @Override // com.ss.android.websocket.a.c.b
    public final Object a(a aVar) {
        try {
            return dw.a(new String(aVar.getPayload()), CouponMessage.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
