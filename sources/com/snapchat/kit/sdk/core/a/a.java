package com.snapchat.kit.sdk.core.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class a implements Serializable {
    @com.google.gson.a.a
    @c(a = "access_token")
    private String mAccessToken;
    @com.google.gson.a.a
    @c(a = "expires_in")
    private long mExpiresIn;
    @com.google.gson.a.a
    @c(a = "last_updated")
    private long mLastUpdated;
    @com.google.gson.a.a
    @c(a = "refresh_token")
    private String mRefreshToken;
    @com.google.gson.a.a
    @c(a = "scope")
    private String mScope;
    @com.google.gson.a.a
    @c(a = "token_type")
    private String mTokenType;

    static {
        Covode.recordClassIndex(35565);
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public long getExpiresIn() {
        return this.mExpiresIn;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getScope() {
        return this.mScope;
    }

    public String getTokenType() {
        return this.mTokenType;
    }

    public long getExpiresInMillis() {
        return this.mExpiresIn * 1000;
    }

    public String toString() {
        return toJson();
    }

    public String toJson() {
        return new f().b(this);
    }

    public boolean isExpired() {
        if (System.currentTimeMillis() >= getLastUpdated() + getExpiresInMillis()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.mAccessToken, this.mTokenType, this.mRefreshToken, Long.valueOf(this.mExpiresIn), Long.valueOf(this.mLastUpdated));
    }

    public boolean isComplete() {
        if (TextUtils.isEmpty(getAccessToken()) || TextUtils.isEmpty(getRefreshToken()) || !TextUtils.equals(getTokenType(), "Bearer") || getExpiresIn() <= 0 || getLastUpdated() <= 0 || TextUtils.isEmpty(getScope())) {
            return false;
        }
        return true;
    }

    public void setLastUpdated(long j2) {
        this.mLastUpdated = j2;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public boolean hasAccessToScope(String str) {
        if (TextUtils.isEmpty(getScope())) {
            return false;
        }
        return Arrays.asList(getScope().split(" ")).contains(str);
    }

    public boolean willBeExpiredAfter(Long l2) {
        if ((getLastUpdated() + getExpiresInMillis()) - System.currentTimeMillis() <= l2.longValue()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!Objects.equals(this.mAccessToken, aVar.mAccessToken) || !Objects.equals(this.mTokenType, aVar.mTokenType) || !Objects.equals(this.mRefreshToken, aVar.mRefreshToken) || !Objects.equals(Long.valueOf(this.mExpiresIn), Long.valueOf(aVar.mExpiresIn)) || !Objects.equals(Long.valueOf(this.mLastUpdated), Long.valueOf(aVar.mLastUpdated))) {
            return false;
        }
        return true;
    }

    public a(String str, String str2, String str3, long j2, long j3, String str4) {
        this.mAccessToken = str;
        this.mTokenType = str2;
        this.mRefreshToken = str3;
        this.mExpiresIn = j2;
        this.mLastUpdated = j3;
        this.mScope = str4;
    }
}
