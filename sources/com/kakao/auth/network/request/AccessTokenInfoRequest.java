package com.kakao.auth.network.request;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.network.AuthorizedApiRequest;

public class AccessTokenInfoRequest extends AuthorizedApiRequest {
    static {
        Covode.recordClassIndex(34334);
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        return super.getUriBuilder().path("v1/user/access_token_info");
    }
}
