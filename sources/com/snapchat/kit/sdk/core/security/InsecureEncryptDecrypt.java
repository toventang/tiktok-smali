package com.snapchat.kit.sdk.core.security;

import android.util.Base64;
import com.bytedance.covode.number.Covode;

public class InsecureEncryptDecrypt implements EncryptDecryptAlgorithm {
    static {
        Covode.recordClassIndex(35807);
    }

    @Override // com.snapchat.kit.sdk.core.security.EncryptDecryptAlgorithm
    public String decrypt(String str) {
        if (str == null) {
            return null;
        }
        return new String(Base64.decode(str, 0));
    }

    @Override // com.snapchat.kit.sdk.core.security.EncryptDecryptAlgorithm
    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        return Base64.encodeToString(str.getBytes(), 0);
    }
}
