package com.ss.android.ugc.aweme.promote;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import l.b.f;
import l.b.t;

public final class PromoteProgramRequestApiManager {

    /* renamed from: a  reason: collision with root package name */
    static final String f118126a;

    /* renamed from: b  reason: collision with root package name */
    static PromoteProgramRequestApi f118127b;

    interface PromoteProgramRequestApi {
        static {
            Covode.recordClassIndex(76723);
        }

        @f(a = "/aweme/v1/creatorlicense/cancel/")
        q<BaseResponse> cancelPromoteProgram();

        @f(a = "/aweme/v1/creatorlicense/confirm/")
        q<PromoteProgramResponse> confirmPromoteProgram(@t(a = "license_version") String str);
    }

    static {
        Covode.recordClassIndex(76720);
        String str = Api.f66569d;
        f118126a = str;
        f118127b = (PromoteProgramRequestApi) a.a(str, PromoteProgramRequestApi.class);
    }
}
