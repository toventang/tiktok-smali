package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdkapi.depend.model.live.al;
import com.bytedance.covode.number.Covode;

public final class br implements b<FeedItem> {
    static {
        Covode.recordClassIndex(11349);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ FeedItem a(f fVar) {
        FeedItem feedItem = new FeedItem();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                feedItem.init();
                return feedItem;
            } else if (b2 == 1) {
                feedItem.type = (int) fVar.f();
            } else if (b2 == 2) {
                feedItem.resId = fVar.d();
            } else if (b2 == 3) {
                feedItem.room = al.b(fVar);
            } else if (b2 == 6) {
                feedItem.bannerContainer = bp.b(fVar);
            } else if (b2 == 9) {
                feedItem.isRecommendCard = g.a(fVar);
            } else if (b2 == 13) {
                feedItem.liveReason = fVar.d();
            } else if (b2 != 16) {
                g.c(fVar);
            } else {
                feedItem.debugInfo = fVar.d();
            }
        }
    }
}
