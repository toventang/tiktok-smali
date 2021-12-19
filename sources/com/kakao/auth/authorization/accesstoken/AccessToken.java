package com.kakao.auth.authorization.accesstoken;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.ISessionConfig;
import com.kakao.auth.helper.Encryptor;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.util.helper.PersistentKVStore;
import java.util.Date;

public interface AccessToken {
    static {
        Covode.recordClassIndex(34271);
    }

    Date accessTokenExpiresAt();

    void clearAccessToken();

    void clearRefreshToken();

    String getAccessToken();

    String getRefreshToken();

    int getRemainingExpireTime();

    boolean hasRefreshToken();

    boolean hasValidAccessToken();

    boolean hasValidRefreshToken();

    Date refreshTokenExpiresAt();

    void updateAccessToken(AccessToken accessToken);

    public static class Factory {
        private static final Date ALREADY_EXPIRED_EXPIRATION_TIME;
        public static ResponseStringConverter<AccessToken> CONVERTER = new ResponseStringConverter<AccessToken>() {
            /* class com.kakao.auth.authorization.accesstoken.AccessToken.Factory.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34273);
            }

            public final AccessToken convert(String str) {
                return Factory.createFromResponse(str);
            }
        };
        private static final Date MIN_DATE;
        private static AccessToken instance;

        public static AccessToken getInstance() {
            return instance;
        }

        public static AccessToken createEmptyToken() {
            Date date = ALREADY_EXPIRED_EXPIRATION_TIME;
            return new AccessTokenImpl("", "", date, date);
        }

        static {
            Covode.recordClassIndex(34272);
            Date date = new Date(Long.MIN_VALUE);
            MIN_DATE = date;
            ALREADY_EXPIRED_EXPIRATION_TIME = date;
        }

        public static AccessToken createFromResponse(String str) {
            return new AccessTokenImpl(str);
        }

        public static AccessToken createFromCache(ISessionConfig iSessionConfig, PersistentKVStore persistentKVStore) {
            PersistentAccessToken persistentAccessToken = new PersistentAccessToken(null, persistentKVStore);
            boolean isSecureMode = iSessionConfig.isSecureMode();
            EncryptedAccessToken encryptedAccessToken = new EncryptedAccessToken(persistentAccessToken, null, isSecureMode, persistentKVStore);
            if ((isSecureMode || encryptedAccessToken.getLastSecureMode()) && Encryptor.Factory.getInstnace() != null) {
                encryptedAccessToken.setEncryptor(Encryptor.Factory.getInstnace());
                instance = new AccessTokenImpl(encryptedAccessToken);
            } else {
                instance = new AccessTokenImpl(persistentAccessToken);
            }
            return instance;
        }
    }
}
