package com.kakao.auth.authorization.accesstoken;

import com.bytedance.covode.number.Covode;
import com.kakao.network.response.JSONObjectResponse;
import com.kakao.network.response.ResponseBody;
import com.kakao.util.helper.Utility;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class AccessTokenImpl extends JSONObjectResponse implements AccessToken {
    private static final Date DEFAULT_EXPIRATION_TIME;
    private static final Date MAX_DATE;
    private String accessToken;
    private Date accessTokenExpiresAt;
    private String refreshToken;
    private Date refreshTokenExpiresAt;
    private AccessToken tokenInfo;

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public Date accessTokenExpiresAt() {
        return this.accessTokenExpiresAt;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public String getAccessToken() {
        return this.accessToken;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public Date refreshTokenExpiresAt() {
        return this.refreshTokenExpiresAt;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void clearAccessToken() {
        this.accessToken = null;
        this.accessTokenExpiresAt = DEFAULT_EXPIRATION_TIME;
        AccessToken accessToken2 = this.tokenInfo;
        if (accessToken2 != null) {
            accessToken2.clearAccessToken();
        }
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void clearRefreshToken() {
        this.refreshToken = null;
        this.refreshTokenExpiresAt = DEFAULT_EXPIRATION_TIME;
        AccessToken accessToken2 = this.tokenInfo;
        if (accessToken2 != null) {
            accessToken2.clearRefreshToken();
        }
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasRefreshToken() {
        if (!Utility.isNullOrEmpty(this.refreshToken)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(34274);
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
    }

    public int getRemainedExpiresInAccessTokenTime() {
        if (this.accessTokenExpiresAt == null || !hasValidAccessToken()) {
            return 0;
        }
        return (int) (this.accessTokenExpiresAt.getTime() - new Date().getTime());
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public int getRemainingExpireTime() {
        if (this.accessTokenExpiresAt == null || !hasValidAccessToken()) {
            return 0;
        }
        return (int) (this.accessTokenExpiresAt.getTime() - new Date().getTime());
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasValidAccessToken() {
        if (Utility.isNullOrEmpty(this.accessToken) || new Date().after(this.accessTokenExpiresAt)) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasValidRefreshToken() {
        if (Utility.isNullOrEmpty(this.refreshToken)) {
            return false;
        }
        if (this.refreshTokenExpiresAt == null || !new Date().after(this.refreshTokenExpiresAt)) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (getBody() != null) {
            return getBody().toString();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("access_token", this.accessToken).put("refresh_token", (Object) null);
            Date date = this.accessTokenExpiresAt;
            if (date != null) {
                jSONObject.put("expires_in", (date.getTime() - new Date().getTime()) / 1000);
            }
            Date date2 = this.refreshTokenExpiresAt;
            if (date2 != null) {
                jSONObject.put("refresh_token_expires_in", (date2.getTime() - new Date().getTime()) / 1000);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return jSONObject.toString();
        }
    }

    public AccessTokenImpl(ResponseBody responseBody) {
        this(responseBody.toString());
    }

    public AccessTokenImpl(AccessToken accessToken2) {
        this(accessToken2.getAccessToken(), accessToken2.getRefreshToken(), accessToken2.accessTokenExpiresAt(), accessToken2.refreshTokenExpiresAt());
        this.tokenInfo = accessToken2;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void updateAccessToken(AccessToken accessToken2) {
        String refreshToken2 = accessToken2.getRefreshToken();
        if (refreshToken2 == null || refreshToken2.length() == 0) {
            this.accessToken = accessToken2.getAccessToken();
            this.accessTokenExpiresAt = accessToken2.accessTokenExpiresAt();
        } else {
            this.accessToken = accessToken2.getAccessToken();
            this.refreshToken = accessToken2.getRefreshToken();
            this.accessTokenExpiresAt = accessToken2.accessTokenExpiresAt();
            this.refreshTokenExpiresAt = accessToken2.refreshTokenExpiresAt();
        }
        AccessToken accessToken3 = this.tokenInfo;
        if (accessToken3 != null) {
            accessToken3.updateAccessToken(this);
        }
    }

    public AccessTokenImpl(String str) {
        super(str);
        if (getBody().has("access_token")) {
            this.accessToken = getBody().getString("access_token");
            this.accessTokenExpiresAt = new Date(new Date().getTime() + (getBody().getLong("expires_in") * 1000));
            if (getBody().has("refresh_token")) {
                this.refreshToken = getBody().getString("refresh_token");
            }
            if (getBody().has("refresh_token_expires_in")) {
                this.refreshTokenExpiresAt = new Date(new Date().getTime() + (getBody().getLong("refresh_token_expires_in") * 1000));
            } else {
                this.refreshTokenExpiresAt = MAX_DATE;
            }
        } else {
            throw new ResponseBody.ResponseBodyException("No Search Element : access_token");
        }
    }

    public AccessTokenImpl(String str, String str2, Date date, Date date2) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.accessTokenExpiresAt = date;
        this.refreshTokenExpiresAt = date2;
    }
}
