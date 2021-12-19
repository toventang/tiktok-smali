package com.kakao.usermgmt.response;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthService;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.util.OptionalBoolean;

public class AgeAuthResponse extends JSONObjectResponse {
    public static final ResponseStringConverter<AgeAuthResponse> CONVERTER = new ResponseStringConverter<AgeAuthResponse>() {
        /* class com.kakao.usermgmt.response.AgeAuthResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34443);
        }

        public final AgeAuthResponse convert(String str) {
            return new AgeAuthResponse(str);
        }
    };
    private final AgeAuthLimitStatus ageAuthLimitStatus;
    private final AuthService.AgeAuthLevel authLevel = AuthService.AgeAuthLevel.convertByName(getBody().optString("auth_level", ""));
    private final int authLevelCode = getBody().optInt("auth_level_code", 0);
    private final String authenticatedAt = getBody().optString("authenticated_at", null);
    private final String ci;
    private final OptionalBoolean ciNeedsAgreement;
    private final OptionalBoolean hasCi;
    private final long userId = getBody().getLong("id");

    public OptionalBoolean ciNeedsAgreement() {
        return this.ciNeedsAgreement;
    }

    public AgeAuthLimitStatus getAgeAuthLimitStatus() {
        return this.ageAuthLimitStatus;
    }

    public AuthService.AgeAuthLevel getAuthLevel() {
        return this.authLevel;
    }

    public int getAuthLevelCode() {
        return this.authLevelCode;
    }

    public String getAuthenticatedAt() {
        return this.authenticatedAt;
    }

    public String getCI() {
        return this.ci;
    }

    public long getUserId() {
        return this.userId;
    }

    public OptionalBoolean hasCI() {
        return this.hasCi;
    }

    static {
        Covode.recordClassIndex(34442);
    }

    public enum AgeAuthLimitStatus {
        DONT_KNOW,
        BYPASS_AGE_LIMIT,
        DONT_BYPASS_AGE_LIMIT;

        static {
            Covode.recordClassIndex(34444);
        }
    }

    public String toString() {
        return "AgeAuthResponse{userId=" + this.userId + ", authenticatedAt='" + this.authenticatedAt + '\'' + ", hasCi=" + this.hasCi + '\'' + ", ci='" + this.ci + '\'' + ", authLevel=" + this.authLevel + ", authLevelCode=" + this.authLevelCode + ", ageAuthLimitStatus=" + this.ageAuthLimitStatus + '}';
    }

    public AgeAuthResponse(String str) {
        super(str);
        OptionalBoolean optionalBoolean;
        OptionalBoolean optionalBoolean2;
        AgeAuthLimitStatus ageAuthLimitStatus2;
        if (getBody().has("has_ci")) {
            optionalBoolean = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(getBody().getBoolean("has_ci")));
        } else {
            optionalBoolean = OptionalBoolean.NONE;
        }
        this.hasCi = optionalBoolean;
        if (getBody().has("ci_needs_agreement")) {
            optionalBoolean2 = OptionalBoolean.getOptionalBoolean(Boolean.valueOf(getBody().getBoolean("ci_needs_agreement")));
        } else {
            optionalBoolean2 = OptionalBoolean.NONE;
        }
        this.ciNeedsAgreement = optionalBoolean2;
        this.ci = getBody().optString("ci", null);
        if (getBody().has("bypass_age_limit")) {
            if (getBody().getBoolean("bypass_age_limit")) {
                ageAuthLimitStatus2 = AgeAuthLimitStatus.BYPASS_AGE_LIMIT;
            } else {
                ageAuthLimitStatus2 = AgeAuthLimitStatus.DONT_BYPASS_AGE_LIMIT;
            }
            this.ageAuthLimitStatus = ageAuthLimitStatus2;
            return;
        }
        this.ageAuthLimitStatus = AgeAuthLimitStatus.DONT_KNOW;
    }
}
