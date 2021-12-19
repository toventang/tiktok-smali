package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class bw implements b<GiftTrayInfo> {
    static {
        Covode.recordClassIndex(11354);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ GiftTrayInfo a(f fVar) {
        return b(fVar);
    }

    public static GiftTrayInfo b(f fVar) {
        GiftTrayInfo giftTrayInfo = new GiftTrayInfo();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return giftTrayInfo;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                giftTrayInfo.mDynamicImg = com.bytedance.android.live.base.model.f.b(fVar);
            }
        }
    }
}
