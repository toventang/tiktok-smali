package com.ss.android.ugc.aweme.commercialize.live.business.links.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.live.business.links.f.d;
import f.a.ab;

public interface BusinessLinksLiveApi {
    static {
        Covode.recordClassIndex(45978);
    }

    @t(a = "/aweme/v1/ad/ba/business/link/active/clear/")
    ab<BaseResponse> clearBusinessLinksCards();

    @h(a = "/aweme/v1/ad/ba/business/link/active/count/")
    f.a.t<d> getActiveLinksCount();
}
