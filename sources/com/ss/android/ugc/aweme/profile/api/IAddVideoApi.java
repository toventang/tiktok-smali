package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import f.a.t;

public interface IAddVideoApi {
    static {
        Covode.recordClassIndex(74798);
    }

    @h(a = "/aweme/v1/aweme/post/")
    t<FeedItemList> getMyPublishVideos(@z(a = "source") int i2, @z(a = "user_avatar_shrink") String str, @z(a = "video_cover_shrink") String str2, @z(a = "filter_private") int i3, @z(a = "max_cursor") long j2, @z(a = "sec_user_id") String str3, @z(a = "count") int i4);
}
