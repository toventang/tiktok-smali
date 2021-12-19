package com.ss.android.ugc.aweme.contentlanguage.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;

public abstract /* synthetic */ class b {
    static {
        Covode.recordClassIndex(48462);
    }

    public static LanguageApi a() {
        return (LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(LanguageApi.class);
    }
}
