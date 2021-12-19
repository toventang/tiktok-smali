package com.kakao.auth.network;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.network.ApiRequest;
import com.kakao.network.ServerProtocol;
import com.kakao.network.multipart.Part;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class AuthorizedApiRequest extends ApiRequest implements AuthorizedRequest {
    private String accessToken;

    static {
        Covode.recordClassIndex(34327);
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public String getBodyEncoding() {
        return "UTF-8";
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public abstract String getMethod();

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public List<Part> getMultiPartList() {
        return Collections.emptyList();
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public Map<String, String> getParams() {
        return super.getParams();
    }

    @Override // com.kakao.network.ApiRequest
    public Uri.Builder getUriBuilder() {
        return super.getUriBuilder().authority(ServerProtocol.apiAuthority());
    }

    @Override // com.kakao.network.ApiRequest, com.kakao.network.IRequest
    public Map<String, String> getHeaders() {
        Map<String, String> headers = super.getHeaders();
        headers.put("Authorization", "Bearer " + this.accessToken);
        return headers;
    }

    @Override // com.kakao.auth.network.AuthorizedRequest
    public void setAccessToken(String str) {
        this.accessToken = str;
    }
}
