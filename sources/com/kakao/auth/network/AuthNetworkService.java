package com.kakao.auth.network;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.ApiErrorHandlingService;
import com.kakao.common.KakaoContextService;
import com.kakao.network.NetworkService;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.network.tasks.KakaoTaskQueue;
import java.util.List;
import java.util.concurrent.Future;

public interface AuthNetworkService {
    static {
        Covode.recordClassIndex(34325);
    }

    <T> T request(AuthorizedRequest authorizedRequest, ResponseStringConverter<T> responseStringConverter);

    <T> Future<T> request(AuthorizedRequest authorizedRequest, ResponseStringConverter<T> responseStringConverter, ResponseCallback<T> responseCallback);

    <T> List<T> requestList(AuthorizedRequest authorizedRequest, ResponseStringConverter<T> responseStringConverter);

    <T> Future<List<T>> requestList(AuthorizedRequest authorizedRequest, ResponseStringConverter<T> responseStringConverter, ResponseCallback<List<T>> responseCallback);

    public static class Factory {
        private static AuthNetworkService instance;

        public static AuthNetworkService getInstance() {
            return instance;
        }

        static {
            Covode.recordClassIndex(34326);
            DefaultAuthNetworkService defaultAuthNetworkService = new DefaultAuthNetworkService(NetworkService.Factory.getInstance(), KakaoTaskQueue.getInstance());
            defaultAuthNetworkService.setTokenInfo(AccessToken.Factory.getInstance());
            defaultAuthNetworkService.setErrorHandlingService(ApiErrorHandlingService.Factory.getInstance());
            defaultAuthNetworkService.setConfService(KakaoContextService.getInstance());
            instance = defaultAuthNetworkService;
        }
    }
}
