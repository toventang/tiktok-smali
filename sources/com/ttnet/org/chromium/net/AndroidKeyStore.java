package com.ttnet.org.chromium.net;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.f;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class AndroidKeyStore {
    static {
        Covode.recordClassIndex(103363);
    }

    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String str) {
        try {
            Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        } catch (Exception e2) {
            f.c("AndroidKeyStore", "Exception while checking support for " + str + ": " + e2, new Object[0]);
            return false;
        }
    }

    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String str) {
        try {
            Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return false;
        } catch (Exception e2) {
            f.c("AndroidKeyStore", "Exception while checking support for " + str + ": " + e2, new Object[0]);
            return false;
        }
    }

    private static byte[] encryptWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Cipher instance = Cipher.getInstance(str);
            try {
                instance.init(1, privateKey);
                return instance.doFinal(bArr);
            } catch (Exception e2) {
                f.c("AndroidKeyStore", "Exception while encrypting input with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e2, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            f.c("AndroidKeyStore", "Cipher " + str + " not supported: " + e3, new Object[0]);
            return null;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        try {
            Signature instance = Signature.getInstance(str);
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                return instance.sign();
            } catch (Exception e2) {
                f.c("AndroidKeyStore", "Exception while signing message with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e2, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e3) {
            f.c("AndroidKeyStore", "Signature algorithm " + str + " not supported: " + e3, new Object[0]);
            return null;
        }
    }
}
