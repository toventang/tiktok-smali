package com.ss.android.ugc.aweme.follow.statistics;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public interface IFollowStatisticsService {
    static {
        Covode.recordClassIndex(60972);
    }

    void a(Aweme aweme, String str, String str2, String str3);
}
