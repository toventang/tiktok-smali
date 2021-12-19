package com.ss.android.ugc.aweme.feed.cache;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public final class a {
    static {
        Covode.recordClassIndex(58785);
    }

    public static void a(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null && !TextUtils.isEmpty(feedItemList.getRequestId())) {
            try {
                ac.a.f91473a.a(feedItemList.getRequestId(), feedItemList.logPb);
            } catch (Throwable unused) {
                com.ss.android.ugc.aweme.framework.a.a.a(2, "CacheDataProcessor", "putAwemeLogPbData error");
            }
        }
    }
}
