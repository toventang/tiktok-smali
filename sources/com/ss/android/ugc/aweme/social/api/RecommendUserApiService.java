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
import h.f.b.l;
import h.z;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;

public final class RecommendUserApiService implements IRecommendUserApi {

    /* renamed from: a  reason: collision with root package name */
    public static final RecommendUserApiService f133669a = new RecommendUserApiService();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IRecommendUserApi f133670b = ((IRecommendUserApi) a.f133671a.a(IRecommendUserApi.class));

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v1/recommend/user/dislike/")
    public final t<z> dislikeRecommend(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "scene") Integer num) {
        l.d(str, "");
        return this.f133670b.dislikeRecommend(str, str2, num);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/tiktok/v1/ffp/user/recommendations/")
    public final t<NewRecommendList> fetchRecommendList4FindFriends(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str) {
        return this.f133670b.fetchRecommendList4FindFriends(num, num2, str);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/tiktok/v1/fyp/user/recommendations/")
    public final i<RecommendUserDialogList> fetchRecommendUserDialoList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str) {
        return this.f133670b.fetchRecommendUserDialoList(num, num2, str);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/tiktok/v1/dmp/user/recommendations/")
    public final t<RecommendUserInDMBean> fetchRecommendUserForDMPage() {
        return this.f133670b.fetchRecommendUserForDMPage();
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @o(a = "/aweme/v1/multi/commit/follow/user/")
    @e
    public final i<BaseResponse> followUsers(@c(a = "user_ids") String str, @c(a = "sec_user_ids") String str2, @c(a = "type") int i2) {
        return this.f133670b.followUsers(str, str2, i2);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/tiktok/user/relation/maf/list/v1")
    public final t<com.ss.android.ugc.aweme.social.c.c> getMAFList(@l.b.t(a = "scene") int i2, @l.b.t(a = "count") int i3) {
        return this.f133670b.getMAFList(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @o(a = "/aweme/v1/commit/user/extra/")
    @e
    public final i<BaseResponse> modifyUser(@c(a = "need_recommend") int i2) {
        return this.f133670b.modifyUser(i2);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v2/user/recommend/")
    public final i<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") Integer num3, @l.b.t(a = "yellow_point_count") Integer num4, @l.b.t(a = "address_book_access") Integer num5, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "sec_target_user_id") String str3) {
        return this.f133670b.recommendList(num, num2, str, num3, num4, num5, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v2/user/recommend/")
    public final i<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") Integer num3, @l.b.t(a = "yellow_point_count") Integer num4, @l.b.t(a = "address_book_access") Integer num5, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "sec_target_user_id") String str3, @l.b.t(a = "show_super_account_when_follow_empty") int i2) {
        return this.f133670b.recommendList(num, num2, str, num3, num4, num5, str2, str3, i2);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v2/user/recommend/")
    public final i<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") Integer num3, @l.b.t(a = "yellow_point_count") Integer num4, @l.b.t(a = "address_book_access") Integer num5, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "push_user_id") String str3, @l.b.t(a = "sec_target_user_id") String str4, @l.b.t(a = "sec_push_user_id") String str5) {
        return this.f133670b.recommendList(num, num2, str, num3, num4, num5, str2, str3, str4, str5);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v2/user/recommend/")
    public final t<RecommendList> recommendList(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "target_user_id") String str, @l.b.t(a = "recommend_type") int i2, @l.b.t(a = "yellow_point_count") Integer num3, @l.b.t(a = "address_book_access") Integer num4, @l.b.t(a = "rec_impr_users") String str2, @l.b.t(a = "push_user_id") String str3, @l.b.t(a = "sec_target_user_id") String str4) {
        return this.f133670b.recommendList(num, num2, str, i2, num3, num4, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/tiktok/v1/ffp/user/recommendations/")
    public final i<NewRecommendList> recommendList4NewFindFriends(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str) {
        return this.f133670b.recommendList4NewFindFriends(num, num2, str);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v1/profile/user/recommend/")
    public final i<RecommendList> recommendListMT(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str, @l.b.t(a = "sec_target_user_id") String str2, @l.b.t(a = "scenario") Integer num3, @l.b.t(a = "with_inviter") boolean z) {
        return this.f133670b.recommendListMT(num, num2, str, str2, num3, z);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v1/profile/user/recommend/")
    public final t<RecommendList> recommendListMT(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str, @l.b.t(a = "sec_target_user_id") String str2, @l.b.t(a = "scenario") Integer num3, @l.b.t(a = "filters") String str3, @l.b.t(a = "with_inviter") boolean z) {
        l.d(str3, "");
        return this.f133670b.recommendListMT(num, num2, str, str2, num3, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v1/profile/user/recommend/")
    public final i<RecommendList> recommendListTask(@l.b.t(a = "count") Integer num, @l.b.t(a = "cursor") Integer num2, @l.b.t(a = "rec_impr_users") String str, @l.b.t(a = "sec_target_user_id") String str2, @l.b.t(a = "scenario") Integer num3, @l.b.t(a = "filters") String str3, @l.b.t(a = "with_inviter") boolean z) {
        l.d(str3, "");
        return this.f133670b.recommendListTask(num, num2, str, str2, num3, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.social.api.IRecommendUserApi
    @f(a = "/aweme/v1/following/page/user/recommend/")
    public final i<SuperAccountList> recommendSuperAccount() {
        return this.f133670b.recommendSuperAccount();
    }

    static {
        Covode.recordClassIndex(87437);
    }

    private RecommendUserApiService() {
    }
}
