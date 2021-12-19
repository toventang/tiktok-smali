package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.feed.model.PrivateUrlModel;

public interface FeedStatsApi {
    static {
        Covode.recordClassIndex(57877);
    }

    @h(a = "/aweme/v1/aweme/modify/visibility/")
    q<PrivateUrlModel> feedStats(@z(a = "aweme_id") String str, @z(a = "type") int i2);

    @h(a = "/aweme/v1/aweme/modify/visibility/")
    q<PrivateUrlModel> feedStats(@z(a = "aweme_id") String str, @z(a = "type") int i2, @z(a = "video_hide_search") Integer num, @z(a = "dont_share") Integer num2, @z(a = "dont_share_list") String str2);
}
