package com.ss.android.ugc.aweme.friends.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;

public abstract /* synthetic */ class a {
    static {
        Covode.recordClassIndex(61430);
    }

    public static FriendApi a() {
        return (FriendApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(FriendApi.class);
    }
}
