package com.snapchat.kit.sdk.core.security;

import com.bytedance.covode.number.Covode;
import javax.crypto.SecretKey;

public class SecretGenerationResult {
    private final boolean mIsNewSecret;
    private final SecretKey mSecretKey;

    static {
        Covode.recordClassIndex(35812);
    }

    public SecretKey getSecretKey() {
        return this.mSecretKey;
    }

    public boolean isNewSecret() {
        return this.mIsNewSecret;
    }

    public SecretGenerationResult(SecretKey secretKey, boolean z) {
        this.mSecretKey = secretKey;
        this.mIsNewSecret = z;
    }
}
