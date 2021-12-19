package com.bytedance.android.live.base.model.user;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.covode.number.Covode;

public final class g implements b<SubscribeInfo> {
    static {
        Covode.recordClassIndex(3639);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ SubscribeInfo a(f fVar) {
        return b(fVar);
    }

    public static SubscribeInfo b(f fVar) {
        SubscribeInfo subscribeInfo = new SubscribeInfo();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return subscribeInfo;
            } else if (b2 == 1) {
                subscribeInfo.isAnchorQualified = com.bytedance.android.e.a.a.g.a(fVar);
            } else if (b2 == 2) {
                subscribeInfo.isSubscribed = com.bytedance.android.e.a.a.g.a(fVar);
            } else if (b2 == 3) {
                subscribeInfo.subscribeBadge = f.b(fVar);
            } else if (b2 == 4) {
                subscribeInfo.anchorEnableSubscription = com.bytedance.android.e.a.a.g.a(fVar);
            } else if (b2 != 5) {
                com.bytedance.android.e.a.a.g.c(fVar);
            } else {
                subscribeInfo.subscriberCount = (int) fVar.f();
            }
        }
    }
}
