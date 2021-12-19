package com.bytedance.android.livesdk.feed.drawerfeed.a;

import android.view.View;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.i.k;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import f.a.l.c;

public abstract class i extends k {
    static {
        Covode.recordClassIndex(9636);
    }

    @Override // com.bytedance.android.livesdk.feed.i.a
    public final boolean a(FeedItem feedItem, EnterRoomConfig enterRoomConfig) {
        boolean a2 = super.a(feedItem, enterRoomConfig);
        if (a2) {
            a.a().a(new com.bytedance.android.livesdk.feed.e.a(0));
            com.bytedance.android.b.a.a.f6785g.f6789c = "transfer";
        }
        return a2;
    }

    public i(View view, com.bytedance.android.livesdk.feed.dislike.a aVar, h hVar, FeedDataKey feedDataKey, m mVar, g gVar, c<FeedItem> cVar, c<Boolean> cVar2, c<Object> cVar3, c<Object> cVar4) {
        super(view, aVar, hVar, feedDataKey, mVar, gVar, cVar, cVar2, cVar3, cVar4);
        this.f17501h = true;
    }
}
