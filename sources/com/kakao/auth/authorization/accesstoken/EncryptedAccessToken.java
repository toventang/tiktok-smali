package com.kakao.auth.authorization.accesstoken;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.kakao.auth.helper.Encryptor;
import com.kakao.util.helper.PersistentKVStore;
import java.util.Date;

/* access modifiers changed from: package-private */
public class EncryptedAccessToken implements AccessToken {
    private PersistentKVStore cache;
    private boolean currentSecureMode;
    private Encryptor encryptor;
    private AccessToken tokenInfo;

    static {
        Covode.recordClassIndex(34280);
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public Date accessTokenExpiresAt() {
        return this.tokenInfo.accessTokenExpiresAt();
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void clearAccessToken() {
        this.tokenInfo.clearAccessToken();
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void clearRefreshToken() {
        this.tokenInfo.clearRefreshToken();
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public int getRemainingExpireTime() {
        return this.tokenInfo.getRemainingExpireTime();
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public Date refreshTokenExpiresAt() {
        return this.tokenInfo.refreshTokenExpiresAt();
    }

    /* access modifiers changed from: package-private */
    public boolean needsDecryption() {
        if (!getLastSecureMode() || this.currentSecureMode) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean needsEncryption() {
        if (getLastSecureMode() || !this.currentSecureMode) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public String getAccessToken() {
        String accessToken = this.tokenInfo.getAccessToken();
        if (accessToken == null) {
            return null;
        }
        try {
            if (this.currentSecureMode) {
                accessToken = decryptToken(accessToken);
            }
            return accessToken;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean getLastSecureMode() {
        String string = this.cache.getString("com.kakao.token.KakaoSecureMode");
        if (string == null || !string.equals("true")) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public String getRefreshToken() {
        String refreshToken = this.tokenInfo.getRefreshToken();
        if (refreshToken == null) {
            return null;
        }
        try {
            if (this.currentSecureMode) {
                refreshToken = decryptToken(refreshToken);
            }
            return refreshToken;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasRefreshToken() {
        if (!this.tokenInfo.hasRefreshToken() || getRefreshToken() == null) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasValidAccessToken() {
        if (!this.tokenInfo.hasValidAccessToken() || getAccessToken() == null) {
            return false;
        }
        return true;
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public boolean hasValidRefreshToken() {
        if (!this.tokenInfo.hasValidRefreshToken() || getRefreshToken() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void initAccessToken() {
        AccessToken processAccessToken;
        if (this.tokenInfo != null) {
            if (needsEncryption()) {
                processAccessToken = processAccessToken(true, this.tokenInfo);
            } else if (needsDecryption()) {
                processAccessToken = processAccessToken(false, this.tokenInfo);
            }
            if (processAccessToken != null) {
                this.tokenInfo.updateAccessToken(processAccessToken);
            }
        }
        setLastSecureMode(this.currentSecureMode);
    }

    /* access modifiers changed from: package-private */
    public void setEncryptor(Encryptor encryptor2) {
        this.encryptor = encryptor2;
        initAccessToken();
    }

    public String decryptToken(String str) {
        try {
            return this.encryptor.decrypt(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String encryptToken(String str) {
        try {
            return this.encryptor.encrypt(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setLastSecureMode(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("com.kakao.token.KakaoSecureMode", String.valueOf(z));
        this.cache.save(bundle);
    }

    @Override // com.kakao.auth.authorization.accesstoken.AccessToken
    public void updateAccessToken(AccessToken accessToken) {
        if (this.currentSecureMode) {
            accessToken = processAccessToken(true, accessToken);
        }
        AccessToken accessToken2 = this.tokenInfo;
        if (accessToken2 != null) {
            accessToken2.updateAccessToken(accessToken);
        }
        setLastSecureMode(this.currentSecureMode);
    }

    private AccessToken processAccessToken(final boolean z, final AccessToken accessToken) {
        return new AccessToken() {
            /* class com.kakao.auth.authorization.accesstoken.EncryptedAccessToken.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34281);
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public void clearAccessToken() {
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public void clearRefreshToken() {
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public int getRemainingExpireTime() {
                return 0;
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public boolean hasRefreshToken() {
                return false;
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public boolean hasValidAccessToken() {
                return false;
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public boolean hasValidRefreshToken() {
                return false;
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public void updateAccessToken(AccessToken accessToken) {
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public Date accessTokenExpiresAt() {
                return accessToken.accessTokenExpiresAt();
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public Date refreshTokenExpiresAt() {
                return accessToken.refreshTokenExpiresAt();
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public String getAccessToken() {
                if (z) {
                    return EncryptedAccessToken.this.encryptToken(accessToken.getAccessToken());
                }
                return EncryptedAccessToken.this.decryptToken(accessToken.getAccessToken());
            }

            @Override // com.kakao.auth.authorization.accesstoken.AccessToken
            public String getRefreshToken() {
                if (z) {
                    return EncryptedAccessToken.this.encryptToken(accessToken.getRefreshToken());
                }
                return EncryptedAccessToken.this.decryptToken(accessToken.getRefreshToken());
            }
        };
    }

    EncryptedAccessToken(AccessToken accessToken, Encryptor encryptor2, boolean z, PersistentKVStore persistentKVStore) {
        this.tokenInfo = accessToken;
        this.encryptor = encryptor2;
        this.currentSecureMode = z;
        this.cache = persistentKVStore;
        if (encryptor2 != null) {
            initAccessToken();
        }
    }
}
