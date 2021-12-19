package com.kakao.auth.network.response;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseStringConverter;

public class AccessTokenInfoResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<AccessTokenInfoResponse> CONVERTER = new ResponseStringConverter<AccessTokenInfoResponse>() {
        /* class com.kakao.auth.network.response.AccessTokenInfoResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34337);
        }

        public final AccessTokenInfoResponse convert(String str) {
            return new AccessTokenInfoResponse(str);
        }
    };
    private final long expiresIn = getBody().getLong("expires_in");
    private final long expiresInMillis = getBody().getLong("expiresInMillis");
    private final long userId = getBody().getLong("id");

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public long getExpiresInMillis() {
        return this.expiresInMillis;
    }

    public long getUserId() {
        return this.userId;
    }

    static {
        Covode.recordClassIndex(34336);
    }

    public String toString() {
        return "AccessTokenInfoResponse{userId=" + this.userId + ", expiresIn=" + this.expiresIn + '}';
    }

    public AccessTokenInfoResponse(String str) {
        super(str);
    }
}
