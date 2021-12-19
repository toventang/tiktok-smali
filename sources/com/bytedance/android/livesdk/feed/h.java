package com.bytedance.android.livesdk.feed;

import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.feed.e;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface h extends j {

    public interface a {
        static {
            Covode.recordClassIndex(9690);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(9689);
    }

    void a();

    void a(FeedDataKey feedDataKey, r rVar);

    void a(FeedDataKey feedDataKey, String str);

    void a(e eVar);

    void a(a aVar);

    void a(String str, List<FeedItem> list, com.bytedance.android.live.base.model.c.a aVar, boolean z);

    boolean a(FeedDataKey feedDataKey);

    void b(e eVar);

    void b(a aVar);
}
