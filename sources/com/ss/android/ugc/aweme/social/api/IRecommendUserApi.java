package com.ss.android.ugc.aweme.social.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import f.a.t;
import h.z;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public interface IRecommendUserApi {
    static {
        Covode.recordClassIndex(87435);
    }

    @f(a = "/aweme/v1/recommend/user/dislike/")
    t<z> dislikeRecommend(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "scene") Integer num);

    @f(a = "/tiktok/v1/ffp/user/recommendations/")
    t<NewRecommendList> fetchRecommendList4FindFriends(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str);

    @f(a = "/tiktok/v1/fyp/user/recommendations/")
    i<RecommendUserDialogList> fetchRecommendUserDialoList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str);

    @f(a = "/tiktok/v1/dmp/user/recommendations/")
    t<RecommendUserInDMBean> fetchRecommendUserForDMPage();

    @o(a = "/aweme/v1/multi/commit/follow/user/")
    @e
    i<BaseResponse> followUsers(@c(a = "user_ids") String str, @c(a = "sec_user_ids") String str2, @c(a = "type") int i2);

    @f(a = "/tiktok/user/relation/maf/list/v1")
    t<com.ss.android.ugc.aweme.social.c.c> getMAFList(@l.b.t(a = "scene") int i2, @l.b.t(a = "count") int i3);

    @o(a = "/aweme/v1/commit/user/extra/")
    @e
    i<BaseResponse> modifyUser(@c(a = "need_recommend") int i2);

    @f(a = "/aweme/v2/user/recommend/")
    i<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") Integer num3, @l.b.t(a = "yellow_point_count") Integer num4, @l.b.t(a = "address_book_access") Integer num5, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "sec_target_user_id") String str3);

    @f(a = "/aweme/v2/user/recommend/")
    i<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") Integer num3, @l.b.t(a = "yellow_point_count") Integer num4, @l.b.t(a = "address_book_access") Integer num5, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "sec_target_user_id") String str3, @l.b.t(a = "show_super_account_when_follow_empty") int i2);

    @f(a = "/aweme/v2/user/recommend/")
    i<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") Integer num3, @l.b.t(a = "yellow_point_count") Integer num4, @l.b.t(a = "address_book_access") Integer num5, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "push_user_id") String str3, @l.b.t(a = "sec_target_user_id") String str4, @l.b.t(a = "sec_push_user_id") String str5);

    @f(a = "/aweme/v2/user/recommend/")
    t<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") int i2, @l.b.t(a = "yellow_point_count") Integer num3, @l.b.t(a = "address_book_access") Integer num4, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "push_user_id") String str3, @l.b.t(a = "sec_target_user_id") String str4);

    @f(a = "/tiktok/v1/ffp/user/recommendations/")
    i<NewRecommendList> recommendList4NewFindFriends(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str);

    @f(a = "/aweme/v1/profile/user/recommend/")
    i<RecommendList> recommendListMT(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str, @l.b.t(a = "sec_target_user_id") String str2, @l.b.t(a = "scenario") Integer num3, @l.b.t(a = "with_inviter") boolean z);

    @f(a = "/aweme/v1/profile/user/recommend/")
    t<RecommendList> recommendListMT(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str, @l.b.t(a = "sec_target_user_id") String str2, @l.b.t(a = "scenario") Integer num3, @l.b.t(a = "filters") String str3, @l.b.t(a = "with_inviter") boolean z);

    @f(a = "/aweme/v1/profile/user/recommend/")
    i<RecommendList> recommendListTask(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str, @l.b.t(a = "sec_target_user_id") String str2, @l.b.t(a = "scenario") Integer num3, @l.b.t(a = "filters") String str3, @l.b.t(a = "with_inviter") boolean z);

    @f(a = "/aweme/v1/following/page/user/recommend/")
    i<SuperAccountList> recommendSuperAccount();

    public static final class a {
        static {
            Covode.recordClassIndex(87436);
        }

        public static /* synthetic */ t a(IRecommendUserApi iRecommendUserApi, Integer num, Integer num2, String str, String str2, Integer num3, String str3, int i2) {
            if ((i2 & 32) != 0) {
                str3 = "";
            }
            return iRecommendUserApi.recommendListMT(num, num2, str, str2, num3, str3, false);
        }
    }
}
