package com.ss.android.ugc.aweme.relation.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.ab;
import f.a.t;
import h.f.b.l;
import l.b.f;

public interface RelationApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120331a = a.f120332a;

    static {
        Covode.recordClassIndex(78282);
    }

    @f(a = "/tiktok/user/relation/matched_friends/check/v1")
    ab<CheckMatchedFriendsResponse> checkMatchedFriends();

    @f(a = "/tiktok/user/relation/matched_friends/get/v1")
    t<RecommendUserDialogList> fetchMatchedFriendsList(@l.b.t(a = "count") int i2, @l.b.t(a = "cursor") int i3, @l.b.t(a = "platforms") String str);

    @f(a = "/tiktok/v1/fyp/user/recommendations/")
    t<RecommendUserDialogList> fetchUserRecommendationsList(@l.b.t(a = "count") int i2, @l.b.t(a = "cursor") int i3, @l.b.t(a = "skip_platforms") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f120332a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(78283);
        }

        public static RelationApi a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(RelationApi.class);
            l.b(create, "");
            return (RelationApi) create;
        }
    }
}
