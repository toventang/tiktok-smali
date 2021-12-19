package com.ss.android.ugc.aweme.feed.cache;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public interface IFeedApi {
    static {
        Covode.recordClassIndex(58784);
    }

    FeedItemList fetchFeedList(int i2, long j2, long j3, int i3, Integer num, String str, int i4, int i5, String str2, String str3, String str4, long j4, j jVar, Bundle bundle, Boolean bool);
}
