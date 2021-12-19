package com.kakao.auth.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.ApiResponseStatusError;

public abstract class AuthorizedApiResponse {
    static {
        Covode.recordClassIndex(34340);
    }

    public static class SessionClosedException extends ApiResponseStatusError {
        static {
            Covode.recordClassIndex(34341);
        }

        public SessionClosedException(String str) {
            this(-401, str, 401);
        }

        public SessionClosedException(int i2, String str, int i3) {
            super(i2, str, i3);
        }
    }
}
