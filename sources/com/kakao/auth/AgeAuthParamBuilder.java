package com.kakao.auth;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthService;

public class AgeAuthParamBuilder {
    private Boolean adultsOnly;
    private AuthService.AgeLimit ageLimit;
    private String authFrom;
    private AuthService.AgeAuthLevel authLevel;
    private boolean isSkipTerms;
    private boolean isWesternAge;

    static {
        Covode.recordClassIndex(34224);
    }

    /* access modifiers changed from: package-private */
    public String getAgeAuthRedirectUrl() {
        return "kakao" + Session.getCurrentSession().getAppKey() + "://ageauth";
    }

    public Bundle build() {
        Bundle bundle = new Bundle();
        bundle.putString("token_type", "api");
        bundle.putString("access_token", Session.getCurrentSession().getTokenInfo().getAccessToken());
        bundle.putString("return_url", getAgeAuthRedirectUrl());
        AuthService.AgeAuthLevel ageAuthLevel = this.authLevel;
        if (ageAuthLevel != null) {
            bundle.putString("ageauth_level", ageAuthLevel.getValue());
        }
        AuthService.AgeLimit ageLimit2 = this.ageLimit;
        if (ageLimit2 != null) {
            bundle.putString("age_limit", ageLimit2.getValue());
        }
        boolean z = this.isWesternAge;
        if (z) {
            bundle.putString("is_western_age", String.valueOf(z));
        }
        Boolean bool = this.adultsOnly;
        if (bool != null) {
            bundle.putString("adults_only", String.valueOf(bool));
        }
        boolean z2 = this.isSkipTerms;
        if (z2) {
            bundle.putString("skip_term", String.valueOf(z2));
        }
        if (!TextUtils.isEmpty(this.authFrom)) {
            bundle.putString("auth_from", this.authFrom);
        }
        return bundle;
    }

    public AgeAuthParamBuilder setAdultsOnly(Boolean bool) {
        this.adultsOnly = bool;
        return this;
    }

    public AgeAuthParamBuilder setAgeLimit(AuthService.AgeLimit ageLimit2) {
        this.ageLimit = ageLimit2;
        return this;
    }

    public AgeAuthParamBuilder setAuthFrom(String str) {
        this.authFrom = str;
        return this;
    }

    public AgeAuthParamBuilder setAuthLevel(AuthService.AgeAuthLevel ageAuthLevel) {
        this.authLevel = ageAuthLevel;
        return this;
    }

    public AgeAuthParamBuilder setIsWesternAge(boolean z) {
        this.isWesternAge = z;
        return this;
    }

    public AgeAuthParamBuilder setSkipTerm(boolean z) {
        this.isSkipTerms = z;
        return this;
    }
}
