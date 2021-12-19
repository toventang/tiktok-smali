package com.kakao.auth;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.ageauth.DefaultAgeAuthService;
import com.kakao.auth.api.AuthApi;
import com.kakao.auth.callback.AccountResponseCallback;
import com.kakao.auth.network.response.AccessTokenInfoResponse;
import com.kakao.network.tasks.ITaskQueue;
import com.kakao.network.tasks.KakaoResultTask;
import com.kakao.network.tasks.KakaoTaskQueue;
import java.util.concurrent.Future;

public class AuthService {
    private static AuthService instance = new AuthService(AuthApi.getInstance(), KakaoTaskQueue.getInstance());
    public AuthApi api;
    private ITaskQueue taskQueue;

    public enum AgeAuthLevel {
        LEVEL_1("10", "AUTH_LEVEL1"),
        LEVEL_2("20", "AUTH_LEVEL2");
        
        private final String name;
        private final String value;

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(34232);
        }

        public static AgeAuthLevel convertByName(String str) {
            AgeAuthLevel[] values = values();
            for (AgeAuthLevel ageAuthLevel : values) {
                if (ageAuthLevel.getName().equals(str)) {
                    return ageAuthLevel;
                }
            }
            return null;
        }

        private AgeAuthLevel(String str, String str2) {
            this.value = str;
            this.name = str2;
        }
    }

    public enum AgeAuthStatus {
        SUCCESS(0),
        CLIENT_ERROR(-777),
        CANCELED_OPERATION(-778),
        UNAUTHORIZED(-401),
        BAD_PARAMETERS(-440),
        NOT_AUTHORIZED_AGE(-450),
        LOWER_AGE_LIMIT(-451),
        ALREADY_AGE_AUTHORIZED(-452),
        EXCEED_AGE_CHECK_LIMIT(-453),
        AGE_AUTH_RESULT_MISMATCH(-480),
        CI_RESULT_MISMATCH(-481),
        ERROR(-500),
        UNKOWN(-999);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(34233);
        }

        public static AgeAuthStatus valueOf(int i2) {
            AgeAuthStatus[] values = values();
            for (AgeAuthStatus ageAuthStatus : values) {
                if (ageAuthStatus.getValue() == i2) {
                    return ageAuthStatus;
                }
            }
            return UNKOWN;
        }

        private AgeAuthStatus(int i2) {
            this.value = i2;
        }
    }

    public enum AgeLimit {
        LIMIT_12("12"),
        LIMIT_15("15"),
        LIMIT_18("18"),
        LIMIT_19("19");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(34234);
        }

        private AgeLimit(String str) {
            this.value = str;
        }
    }

    public static AuthService getInstance() {
        return instance;
    }

    static {
        Covode.recordClassIndex(34229);
    }

    public void requestAccessTokenInfo(ApiResponseCallback<AccessTokenInfoResponse> apiResponseCallback) {
        this.taskQueue.addTask(new KakaoResultTask<AccessTokenInfoResponse>(apiResponseCallback) {
            /* class com.kakao.auth.AuthService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34231);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public AccessTokenInfoResponse call() {
                return AuthService.this.api.requestAccessTokenInfo();
            }
        });
    }

    AuthService(AuthApi authApi, ITaskQueue iTaskQueue) {
        this.api = authApi;
        this.taskQueue = iTaskQueue;
    }

    public Future<Integer> requestShowAgeAuthDialog(AccountResponseCallback accountResponseCallback, final Bundle bundle, final Context context) {
        return KakaoTaskQueue.getInstance().addTask(new KakaoResultTask<Integer>(accountResponseCallback) {
            /* class com.kakao.auth.AuthService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34230);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public Integer call() {
                return Integer.valueOf(DefaultAgeAuthService.getInstance().requestAgeAuth(bundle, context));
            }
        });
    }
}
