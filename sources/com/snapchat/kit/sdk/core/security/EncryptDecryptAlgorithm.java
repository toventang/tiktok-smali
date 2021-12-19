package com.snapchat.kit.sdk.core.security;

import com.bytedance.covode.number.Covode;

public interface EncryptDecryptAlgorithm {
    static {
        Covode.recordClassIndex(35804);
    }

    String decrypt(String str);

    String encrypt(String str);
}
