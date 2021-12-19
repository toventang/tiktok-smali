package com.kakao.auth.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.authorization.accesstoken.AccessTokenRequest;
import com.kakao.auth.network.AuthNetworkService;
import com.kakao.auth.network.request.AccessTokenInfoRequest;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.auth.network.response.AuthResponseError;
import com.kakao.common.KakaoContextService;
import com.kakao.network.NetworkService;

public class AuthApi {
    private static AuthApi instance = new AuthApi(AuthNetworkService.Factory.getInstance(), NetworkService.Factory.getInstance());
    private AuthNetworkService authNetworkService;
    private NetworkService networkService;

    public static AuthApi getInstance() {
        return instance;
    }

    public AccessTokenInfoResponse requestAccessTokenInfo() {
        return (AccessTokenInfoResponse) this.authNetworkService.request(new AccessTokenInfoRequest(), AccessTokenInfoResponse.CONVERTER);
    }

    static {
        Covode.recordClassIndex(34268);
    }

    public AuthApi(AuthNetworkService authNetworkService2, NetworkService networkService2) {
        this.authNetworkService = authNetworkService2;
        this.networkService = networkService2;
    }

    public AccessToken requestAccessToken(Context context, String str, String str2, String str3) {
        return (AccessToken) this.networkService.request(new AccessTokenRequest(KakaoContextService.getInstance().phaseInfo(), KakaoContextService.getInstance().getAppConfiguration(), str, str2, str3), AccessToken.Factory.CONVERTER, AuthResponseError.CONVERTER);
    }
}
