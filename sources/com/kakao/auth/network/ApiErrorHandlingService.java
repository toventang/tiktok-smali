package com.kakao.auth.network;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.Session;
import com.kakao.auth.ageauth.DefaultAgeAuthService;
import com.kakao.auth.helper.CurrentActivityProvider;
import com.kakao.network.response.ApiResponseStatusError;

public interface ApiErrorHandlingService {
    static {
        Covode.recordClassIndex(34323);
    }

    boolean shouldRetryAfterTryingRefreshToken();

    boolean shouldRetryWithApiError(ApiResponseStatusError apiResponseStatusError);

    public static class Factory {
        private static ApiErrorHandlingService instance;

        public static ApiErrorHandlingService getInstance() {
            return instance;
        }

        static {
            Covode.recordClassIndex(34324);
            DefaultApiErrorHandlingService defaultApiErrorHandlingService = new DefaultApiErrorHandlingService();
            defaultApiErrorHandlingService.setSession(Session.getCurrentSession());
            defaultApiErrorHandlingService.setAgeAuthService(DefaultAgeAuthService.getInstance());
            defaultApiErrorHandlingService.setActivityProvider(CurrentActivityProvider.Factory.getInstance());
            instance = defaultApiErrorHandlingService;
        }
    }
}
