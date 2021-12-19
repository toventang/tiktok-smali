package com.kakao.usermgmt.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseStringConverter;

public class UserResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<Long> CONVERTER = new ResponseStringConverter<Long>() {
        /* class com.kakao.usermgmt.response.UserResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34452);
        }

        public final Long convert(String str) {
            return Long.valueOf(new UserResponse(str).getUserId());
        }
    };
    private final long userId;

    public long getUserId() {
        return this.userId;
    }

    static {
        Covode.recordClassIndex(34451);
    }

    UserResponse(String str) {
        super(str);
        long j2 = getBody().getLong("id");
        this.userId = j2;
        if (j2 <= 0) {
            throw new ResponseBody.ResponseBodyException("User is called but the result user is null.");
        }
    }
}
