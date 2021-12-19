package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class FeedAppLogParams {
    public FeedItemList mData;
    public List<Aweme> mItems;
    public FeedItemList mLastFeedItemList;

    static {
        Covode.recordClassIndex(59378);
    }

    public FeedAppLogParams(FeedItemList feedItemList, FeedItemList feedItemList2, List<Aweme> list) {
        this.mData = feedItemList;
        this.mLastFeedItemList = feedItemList2;
        this.mItems = list;
    }
}
