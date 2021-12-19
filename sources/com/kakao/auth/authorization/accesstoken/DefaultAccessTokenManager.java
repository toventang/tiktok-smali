package com.kakao.auth.authorization.accesstoken;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.auth.AccessTokenCallback;
import com.kakao.auth.ApprovalType;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.response.AuthResponseError;
import com.kakao.common.KakaoContextService;
import com.kakao.network.NetworkService;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public class DefaultAccessTokenManager implements AccessTokenManager {
    private ApprovalType approvalType;
    private KakaoContextService contextService;
    private NetworkService networkService;

    static {
        Covode.recordClassIndex(34279);
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenManager
    public synchronized Future<AccessToken> refreshAccessToken(String str, AccessTokenCallback accessTokenCallback) {
        Future<AccessToken> request;
        MethodCollector.i(7040);
        request = this.networkService.request(new AccessTokenRequest(this.contextService.phaseInfo(), this.contextService.getAppConfiguration(), null, str, this.approvalType.toString()), AccessToken.Factory.CONVERTER, AuthResponseError.CONVERTER, accessTokenCallback);
        MethodCollector.o(7040);
        return request;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessTokenManager
    public Future<AccessToken> requestAccessTokenByAuthCode(String str, AccessTokenCallback accessTokenCallback) {
        return this.networkService.request(new AccessTokenRequest(this.contextService.phaseInfo(), this.contextService.getAppConfiguration(), str, null, this.approvalType.toString()), AccessToken.Factory.CONVERTER, AuthResponseError.CONVERTER, accessTokenCallback);
    }

    DefaultAccessTokenManager(KakaoContextService kakaoContextService, NetworkService networkService2, ApprovalType approvalType2) {
        this.contextService = kakaoContextService;
        this.networkService = networkService2;
        this.approvalType = approvalType2;
    }
}
