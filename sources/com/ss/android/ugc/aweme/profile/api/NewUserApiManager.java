package com.ss.android.ugc.aweme.profile.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.friends.model.NewRecommendList;
import com.ss.android.ugc.aweme.profile.model.NewUserCount;
import com.ss.android.ugc.aweme.services.RetrofitService;
import l.b.f;
import l.b.t;

public final class NewUserApiManager {

    /* renamed from: a  reason: collision with root package name */
    private static NewUserApi f115984a = ((NewUserApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(NewUserApi.class));

    interface NewUserApi {
        static {
            Covode.recordClassIndex(74800);
        }

        @f(a = "/aweme/v2/new/recommend/user/count/")
        i<NewUserCount> getNewUserCount();

        @f(a = "/tiktok/v1/ffp/user/recommendations/")
        i<NewRecommendList> recommendList4NewFindFriends(@t(a = "count") Integer num, @t(a = "cursor") Integer num2, @t(a = "rec_impr_users") String str);
    }

    static {
        Covode.recordClassIndex(74799);
    }
}
