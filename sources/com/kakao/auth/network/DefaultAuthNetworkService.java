package com.kakao.auth.network;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.authorization.accesstoken.AccessToken;
import com.kakao.auth.network.response.AuthorizedApiResponse;
import com.kakao.common.KakaoContextService;
import com.kakao.network.NetworkService;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.network.tasks.ITaskQueue;
import com.kakao.network.tasks.KakaoResultTask;
import java.util.List;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public class DefaultAuthNetworkService implements AuthNetworkService {
    private KakaoContextService contextService;
    private ApiErrorHandlingService errorHandlingService;
    private final NetworkService networkService;
    private final ITaskQueue taskQueue;
    private AccessToken tokenInfo;

    static {
        Covode.recordClassIndex(34331);
    }

    public void setConfService(KakaoContextService kakaoContextService) {
        this.contextService = kakaoContextService;
    }

    public void setErrorHandlingService(ApiErrorHandlingService apiErrorHandlingService) {
        this.errorHandlingService = apiErrorHandlingService;
    }

    public void setTokenInfo(AccessToken accessToken) {
        this.tokenInfo = accessToken;
    }

    DefaultAuthNetworkService(NetworkService networkService2, ITaskQueue iTaskQueue) {
        this.networkService = networkService2;
        this.taskQueue = iTaskQueue;
    }

    @Override // com.kakao.auth.network.AuthNetworkService
    public <T> T request(AuthorizedRequest authorizedRequest, ResponseStringConverter<T> responseStringConverter) {
        if (this.tokenInfo.hasValidAccessToken() || this.errorHandlingService.shouldRetryAfterTryingRefreshToken()) {
            authorizedRequest.setConfiguration(this.contextService.phaseInfo(), this.contextService.getAppConfiguration());
            authorizedRequest.setAccessToken(this.tokenInfo.getAccessToken());
            try {
                return (T) this.networkService.request(authorizedRequest, responseStringConverter);
            } catch (ApiResponseStatusError e2) {
                if (this.errorHandlingService.shouldRetryWithApiError(e2)) {
                    return (T) request(authorizedRequest, responseStringConverter);
                }
                throw e2;
            }
        } else {
            throw new AuthorizedApiResponse.SessionClosedException("Could not refresh access token.");
        }
    }

    @Override // com.kakao.auth.network.AuthNetworkService
    public <T> List<T> requestList(AuthorizedRequest authorizedRequest, ResponseStringConverter<T> responseStringConverter) {
        if (this.tokenInfo.hasValidAccessToken() || this.errorHandlingService.shouldRetryAfterTryingRefreshToken()) {
            authorizedRequest.setAccessToken(this.tokenInfo.getAccessToken());
            authorizedRequest.setConfiguration(this.contextService.phaseInfo(), this.contextService.getAppConfiguration());
            try {
                return this.networkService.requestList(authorizedRequest, responseStringConverter);
            } catch (ApiResponseStatusError e2) {
                if (this.errorHandlingService.shouldRetryWithApiError(e2)) {
                    return requestList(authorizedRequest, responseStringConverter);
                }
                throw e2;
            }
        } else {
            throw new AuthorizedApiResponse.SessionClosedException("Could not refresh access token.");
        }
    }

    @Override // com.kakao.auth.network.AuthNetworkService
    public <T> Future<T> request(final AuthorizedRequest authorizedRequest, final ResponseStringConverter<T> responseStringConverter, ResponseCallback<T> responseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<T>(responseCallback) {
            /* class com.kakao.auth.network.DefaultAuthNetworkService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34332);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public T call() {
                return (T) DefaultAuthNetworkService.this.request(authorizedRequest, responseStringConverter);
            }
        });
    }

    @Override // com.kakao.auth.network.AuthNetworkService
    public <T> Future<List<T>> requestList(final AuthorizedRequest authorizedRequest, final ResponseStringConverter<T> responseStringConverter, ResponseCallback<List<T>> responseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<List<T>>(responseCallback) {
            /* class com.kakao.auth.network.DefaultAuthNetworkService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34333);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public List<T> call() {
                return DefaultAuthNetworkService.this.requestList(authorizedRequest, responseStringConverter);
            }
        });
    }
}
