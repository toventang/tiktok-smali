package com.bytedance.android.livesdk.feed;

import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.List;

public interface l extends r<FeedItem> {

    public interface a {
        static {
            Covode.recordClassIndex(9736);
        }

        FeedDataKey a();

        int b();

        int c();
    }

    static {
        Covode.recordClassIndex(9735);
    }

    com.bytedance.android.livesdk.feed.feed.a<b<FeedItem>, com.bytedance.android.livesdk.feed.feed.b> a(String str);

    t<String> a();

    void a(m mVar);

    void a(a aVar);

    void a(String str, String str2);

    t<List<ImageModel>> b();

    void b(String str);

    void c();

    h d();
}
