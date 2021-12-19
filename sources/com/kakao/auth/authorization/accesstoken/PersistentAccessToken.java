package com.kakao.auth.authorization.accesstoken;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.PersistentKVStore;
import com.kakao.util.helper.Utility;
import java.util.ArrayList;
import java.util.Date;

/* access modifiers changed from: package-private */
public class PersistentAccessToken implements AccessToken {
    private PersistentKVStore cache;
    private AccessToken tokenInfo;

    static {
        Covode.recordClassIndex(34282);
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public Date accessTokenExpiresAt() {
        return this.cache.getDate("com.kakao.token.AccessToken.ExpiresAt");
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public String getAccessToken() {
        return this.cache.getString("com.kakao.token.AccessToken");
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public String getRefreshToken() {
        return this.cache.getString("com.kakao.token.RefreshToken");
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasRefreshToken() {
        if (!Utility.isNullOrEmpty(getRefreshToken())) {
            return true;
        }
        return false;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public Date refreshTokenExpiresAt() {
        return this.cache.getDate("com.kakao.token.RefreshToken.ExpiresAt");
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void clearAccessToken() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.kakao.token.AccessToken");
        arrayList.add("com.kakao.token.AccessToken.ExpiresAt");
        this.cache.clear(arrayList);
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void clearRefreshToken() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.kakao.token.RefreshToken");
        arrayList.add("com.kakao.token.RefreshToken.ExpiresAt");
        this.cache.clear(arrayList);
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasValidAccessToken() {
        if (Utility.isNullOrEmpty(getAccessToken()) || new Date().after(accessTokenExpiresAt())) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasValidRefreshToken() {
        if (Utility.isNullOrEmpty(getRefreshToken()) || new Date().after(refreshTokenExpiresAt())) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public int getRemainingExpireTime() {
        if (accessTokenExpiresAt() == null || !hasValidAccessToken()) {
            return 0;
        }
        return (int) (accessTokenExpiresAt().getTime() - new Date().getTime());
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void updateAccessToken(AccessToken accessToken) {
        AccessToken accessToken2 = this.tokenInfo;
        if (accessToken2 != null) {
            accessToken2.updateAccessToken(accessToken);
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.kakao.token.AccessToken", accessToken.getAccessToken());
        bundle.putString("com.kakao.token.RefreshToken", accessToken.getRefreshToken());
        if (accessToken.accessTokenExpiresAt() != null) {
            bundle.putLong("com.kakao.token.AccessToken.ExpiresAt", accessToken.accessTokenExpiresAt().getTime());
        }
        if (accessToken.refreshTokenExpiresAt() != null) {
            bundle.putLong("com.kakao.token.RefreshToken.ExpiresAt", accessToken.refreshTokenExpiresAt().getTime());
        }
        this.cache.save(bundle);
    }

    PersistentAccessToken(AccessToken accessToken, PersistentKVStore persistentKVStore) {
        this.tokenInfo = accessToken;
        this.cache = persistentKVStore;
    }
}
