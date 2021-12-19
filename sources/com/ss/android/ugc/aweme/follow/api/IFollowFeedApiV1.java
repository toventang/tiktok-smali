package com.ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import l.b.c;
import l.b.e;
import l.b.o;

public interface IFollowFeedApiV1 {
    static {
        Covode.recordClassIndex(60945);
    }

    @o(a = "/aweme/v1/friend/feed/")
    @e
    q<FollowFeedList> getFriendList(@c(a = "max_cursor") long j2, @c(a = "min_cursor") long j3, @c(a = "count") int i2, @c(a = "pull_type") int i3, @c(a = "feed_style") int i4, @c(a = "enter_time") long j4, @c(a = "fetch_recommend") int i5, @c(a = "impression_ids") String str, @c(a = "is_up_phone") int i6, @c(a = "is_recommend") int i7, @c(a = "push_params") String str2, @c(a = "address_book_access") int i8, @c(a = "notice_count_log_id") String str3, @c(a = "notice_item_count") Integer num, @c(a = "notice_count_type") Integer num2, @c(a = "notice_link_author_id") Long l2, @c(a = "notice_link_item_id") Long l3);

    @o(a = "/aweme/v1/follow/feed/recommend/")
    @e
    q<FollowFeedList> getRecommendList(@c(a = "count") int i2, @c(a = "pull_type") int i3, @c(a = "feed_style") int i4, @c(a = "enter_time") long j2, @c(a = "impression_ids") String str, @c(a = "last_feed_ids") String str2);
}
