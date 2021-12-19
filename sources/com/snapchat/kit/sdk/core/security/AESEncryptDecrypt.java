package com.snapchat.kit.sdk.core.security;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.p;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public class AESEncryptDecrypt implements EncryptDecryptAlgorithm {
    private final f mGson;
    private final SecretKey mSecretKey;

    static {
        Covode.recordClassIndex(35802);
    }

    @Override // com.snapchat.kit.sdk.core.security.EncryptDecryptAlgorithm
    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.mGson.b(encryptInternal(str));
        } catch (p | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    @Override // com.snapchat.kit.sdk.core.security.EncryptDecryptAlgorithm
    public String decrypt(String str) {
        EncryptedData encryptedData;
        try {
            encryptedData = (EncryptedData) this.mGson.a(str, EncryptedData.class);
        } catch (p unused) {
            encryptedData = null;
        }
        if (!(encryptedData == null || encryptedData.mData == null || encryptedData.mIv == null)) {
            try {
                return decryptInternal(encryptedData);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused2) {
            }
        }
        return null;
    }

    private String decryptInternal(EncryptedData encryptedData) {
        byte[] decode = Base64.decode(encryptedData.mIv, 0);
        byte[] decode2 = Base64.decode(encryptedData.mData, 0);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.mSecretKey, new GCMParameterSpec(128, decode));
        return new String(instance.doFinal(decode2));
    }

    private EncryptedData encryptInternal(String str) {
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, this.mSecretKey);
        return new EncryptedData(Base64.encodeToString(instance.getIV(), 0), Base64.encodeToString(instance.doFinal(str.getBytes()), 0));
    }

    /* access modifiers changed from: package-private */
    public static class EncryptedData {
        String mData;
        String mIv;

        static {
            Covode.recordClassIndex(35803);
        }

        EncryptedData(String str, String str2) {
            this.mIv = str;
            this.mData = str2;
        }
    }

    public AESEncryptDecrypt(SecretKey secretKey, f fVar) {
        this.mSecretKey = secretKey;
        this.mGson = fVar;
    }
}
