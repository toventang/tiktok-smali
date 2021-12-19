package com.bytedance.android.livesdk.model.utils.adapter;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.s;
import java.lang.reflect.Type;

public class FeedItemTypeAdapter implements k<FeedItem>, s<FeedItem> {
    static {
        Covode.recordClassIndex(11722);
    }

    private static FeedItem a(l lVar) {
        try {
            FeedItem feedItem = (FeedItem) e.a.f9629c.a(lVar, FeedItem.class);
            feedItem.init();
            return feedItem;
        } catch (Exception unused) {
            throw new p("error type");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.s
    public final /* synthetic */ l a(FeedItem feedItem) {
        FeedItem feedItem2 = feedItem;
        o j2 = e.a.f9629c.a(feedItem2).j();
        j2.a("data", e.a.f9629c.a(feedItem2.getRoom(), Room.class));
        return j2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ FeedItem a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
