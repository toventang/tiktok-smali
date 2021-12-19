package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface IFeedItemList {
    static {
        Covode.recordClassIndex(59401);
    }

    List<Aweme> getItems();
}
