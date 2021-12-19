package com.ss.android.ugc.aweme.policy;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class PolicyApi {

    /* renamed from: a  reason: collision with root package name */
    static final PolicyService f115556a = ((PolicyService) a.a(Api.f66569d, PolicyService.class));

    public interface PolicyService {
        static {
            Covode.recordClassIndex(74480);
        }

        @t(a = "/aweme/v1/accept-private-policy/")
        f.a.t<BaseResponse> acceptPrivacyPolicy();
    }

    static {
        Covode.recordClassIndex(74479);
    }
}
