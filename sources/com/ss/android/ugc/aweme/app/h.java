package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.services.RetrofitService;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f66751a = (Api.f66569d + "/aweme/v1/check/in/");

    /* renamed from: b  reason: collision with root package name */
    public static final String f66752b = (Api.f66569d + "/aweme/v1/check/out/");

    /* renamed from: c  reason: collision with root package name */
    public static final CommonApi f66753c = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(CommonApi.class));

    /* renamed from: d  reason: collision with root package name */
    private static final String f66754d = (Api.f66569d + "/aweme/v1/device/update/");

    static {
        Covode.recordClassIndex(41085);
    }
}
