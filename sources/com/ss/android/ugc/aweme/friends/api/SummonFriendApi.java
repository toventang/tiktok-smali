package com.ss.android.ugc.aweme.friends.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.bq.a.c;
import com.ss.android.ugc.aweme.bq.a.d;
import com.ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import f.a.t;

public final class SummonFriendApi {

    /* renamed from: a  reason: collision with root package name */
    public static final SummonFriendService f96818a = ((SummonFriendService) RetrofitFactory.a().a(b.f59141e).a(SummonFriendService.class));

    public interface SummonFriendService {
        static {
            Covode.recordClassIndex(61427);
        }

        @h(a = "/tiktok/interaction/mention/general/check/v1")
        com.bytedance.retrofit2.b<c> batchCheckMentionPrivacy(@z(a = "uids") String str, @z(a = "mention_type") String str2, @z(a = "is_check_aweme") boolean z, @z(a = "aweme_id") long j2);

        @h(a = "/aweme/v1/user/following/list/")
        com.bytedance.retrofit2.b<FollowUserListModel> queryFollowFriends(@z(a = "count") int i2, @z(a = "user_id") String str, @z(a = "sec_user_id") String str2, @z(a = "max_time") long j2, @z(a = "min_time") long j3, @z(a = "address_book_access") int i3);

        @h(a = "/aweme/v1/at/default/list/")
        t<RecentFriendModel> queryFollowFriends4At(@z(a = "count") int i2, @z(a = "cursor") int i3);

        @h(a = "/aweme/v1/user/recent/contact/")
        com.bytedance.retrofit2.b<RecentFriendModel> queryRecentFriends();

        @h(a = "/aweme/v1/user/recent/contact/")
        t<RecentFriendModel> queryRecentFriends4At();

        @h(a = "/tiktok/interaction/mention/recent/contact/query/v1")
        t<d> queryRecentFriends4AtV2(@z(a = "mention_type") long j2);

        @h(a = "/tiktok/interaction/mention/recent/contact/query/v1")
        com.bytedance.retrofit2.b<d> queryRecentFriendsV2(@z(a = "mention_type") long j2);

        @h(a = "/aweme/v1/discover/search/")
        com.bytedance.retrofit2.b<SummonFriendList> searchFriends(@z(a = "keyword") String str, @z(a = "count") long j2, @z(a = "cursor") long j3, @z(a = "type") int i2, @z(a = "search_source") String str2, @z(a = "filter_block") int i3);
    }

    static {
        Covode.recordClassIndex(61426);
    }

    public static d a(long j2) {
        return f96818a.queryRecentFriendsV2(j2).execute().f42630b;
    }

    public static t<RecentFriendModel> a(int i2, int i3) {
        return com.ss.android.ugc.aweme.friends.b.a(f96818a, 20, i3);
    }

    public static SummonFriendList a(String str, long j2, long j3, String str2) {
        return f96818a.searchFriends(str, j3, j2, 1, str2, 1).execute().f42630b;
    }

    public static FollowUserListModel a(int i2, long j2, String str, String str2, int i3) {
        return f96818a.queryFollowFriends(i2, str, str2, j2, 0, i3).execute().f42630b;
    }
}
