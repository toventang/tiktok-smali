package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static FamiliarApi f103120a;

    static {
        Covode.recordClassIndex(66121);
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin != null) {
            f103120a = (FamiliarApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102220b).create(FamiliarApi.class);
        }
    }
}
