package com.ss.android.ugc.aweme.follow.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import l.b.f;
import l.b.t;

public interface FollowFeedApiV2 {
    static {
        Covode.recordClassIndex(60944);
    }

    @f(a = "/aweme/v2/follow/feed/")
    q<FollowFeedList> getFollowFeedListNew(@t(a = "follow_req_index") int i2, @t(a = "cursor") long j2, @t(a = "level") int i3, @t(a = "count") int i4, @t(a = "pull_type") int i5, @t(a = "feed_style") int i6, @t(a = "enter_time") long j3, @t(a = "rec_impr_users") String str, @t(a = "aweme_id") String str2, @t(a = "aweme_ids") String str3, @t(a = "push_params") String str4, @t(a = "last_follow_uid") String str5, @t(a = "address_book_access") int i7, @t(a = "filter_strategy") int i8, @t(a = "notice_count_log_id") String str6, @t(a = "notice_item_count") Integer num, @t(a = "notice_live_count") Integer num2, @t(a = "notice_count_type") Integer num3, @t(a = "notice_link_author_id") Long l2, @t(a = "notice_link_item_id") Long l3, @t(a = "notice_is_display_live") Integer num4, @t(a = "user_avatar_shrink") String str7);
}
