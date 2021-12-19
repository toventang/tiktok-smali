package com.kakao.usermgmt.request;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.network.AuthorizedApiRequest;

public class UnlinkRequest extends AuthorizedApiRequest {
    static {
        Covode.recordClassIndex(34440);
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getMethod() {
        return "POST";
    }

    @Override // com.kakao.auth.network.AuthorizedApiRequest, com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        return super.getUriBuilder().path("v1/user/unlink");
    }
}
