package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import com.bytedance.covode.number.Covode;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.UnrecoverableEntryException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SecretKeyFactory {
    static {
        Covode.recordClassIndex(35813);
    }

    private SecretKeyFactory() {
    }

    private static SecretKey generate() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return instance.generateKey();
    }

    public static SecretGenerationResult getFromKeyStore(KeyStore keyStore) {
        try {
            if (keyStore.containsAlias("SnapConnectSDK.AES")) {
                return new SecretGenerationResult(((KeyStore.SecretKeyEntry) keyStore.getEntry("SnapConnectSDK.AES", null)).getSecretKey(), false);
            }
        } catch (KeyStoreException | UnrecoverableEntryException unused) {
        }
        KeyGenerator instance = KeyGenerator.getInstance("AES", keyStore.getType());
        instance.init(new KeyGenParameterSpec.Builder("SnapConnectSDK.AES", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
        return new SecretGenerationResult(instance.generateKey(), true);
    }

    private static String encodeSecret(SecretKey secretKey, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        return encryptDecryptAlgorithm.encrypt(new String(secretKey.getEncoded()));
    }

    private static SecretKey decodeSecret(String str, int i2, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        String decrypt = encryptDecryptAlgorithm.decrypt(str);
        if (decrypt == null) {
            return null;
        }
        return new SecretKeySpec(decrypt.getBytes(), decrypt.length() - i2, i2, "AES");
    }

    public static SecretGenerationResult getFromSharedPreferences(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, boolean z) {
        SecretKey secretKey;
        boolean z2;
        String string;
        if (z || (string = sharedPreferences.getString("encoded_secret", null)) == null || (secretKey = decodeSecret(string, 32, encryptDecryptAlgorithm)) == null) {
            z2 = true;
            secretKey = generate();
            sharedPreferences.edit().putString("encoded_secret", encodeSecret(secretKey, encryptDecryptAlgorithm)).apply();
        } else {
            z2 = false;
        }
        return new SecretGenerationResult(secretKey, z2);
    }
}
