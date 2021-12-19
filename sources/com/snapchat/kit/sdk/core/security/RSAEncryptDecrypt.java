package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.x500.X500Principal;

public class RSAEncryptDecrypt implements EncryptDecryptAlgorithm {
    private final KeyPair mKeyPair;

    /* access modifiers changed from: package-private */
    /* renamed from: com.snapchat.kit.sdk.core.security.RSAEncryptDecrypt$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(35810);
        }
    }

    static {
        Covode.recordClassIndex(35809);
    }

    public PublicKeyParams getPublicKeyParams() {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.mKeyPair.getPublic();
        return new PublicKeyParams(rSAPublicKey.getModulus().toString(), rSAPublicKey.getPublicExponent().toString(), null);
    }

    @Override // com.snapchat.kit.sdk.core.security.EncryptDecryptAlgorithm
    public String decrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return decryptInternal(str);
        } catch (IllegalArgumentException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    @Override // com.snapchat.kit.sdk.core.security.EncryptDecryptAlgorithm
    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        try {
            return encryptInternal(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            return null;
        }
    }

    public static class PublicKeyParams {
        String mModulus;
        String mPublicExp;

        static {
            Covode.recordClassIndex(35811);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof PublicKeyParams)) {
                return false;
            }
            PublicKeyParams publicKeyParams = (PublicKeyParams) obj;
            if (!Objects.equals(this.mModulus, publicKeyParams.mModulus) || !Objects.equals(this.mPublicExp, publicKeyParams.mPublicExp)) {
                return false;
            }
            return true;
        }

        private PublicKeyParams(String str, String str2) {
            this.mModulus = str;
            this.mPublicExp = str2;
        }

        /* synthetic */ PublicKeyParams(String str, String str2, AnonymousClass1 r3) {
            this(str, str2);
        }
    }

    private String decryptInternal(String str) {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(2, this.mKeyPair.getPrivate());
        return new String(instance.doFinal(Base64.decode(str, 0)));
    }

    private String encryptInternal(String str) {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(1, this.mKeyPair.getPublic());
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
    }

    public RSAEncryptDecrypt(KeyStore keyStore, Context context, PublicKeyParams publicKeyParams) {
        this.mKeyPair = getKeyPair(keyStore, context, publicKeyParams);
    }

    private static KeyPair getKeyPair(KeyStore keyStore, Context context, PublicKeyParams publicKeyParams) {
        if (!(publicKeyParams == null || publicKeyParams.mModulus == null || publicKeyParams.mPublicExp == null || !keyStore.containsAlias("SnapConnectSDK.RSA"))) {
            try {
                return new KeyPair(KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(publicKeyParams.mModulus), new BigInteger(publicKeyParams.mPublicExp))), ((KeyStore.PrivateKeyEntry) keyStore.getEntry("SnapConnectSDK.RSA", null)).getPrivateKey());
            } catch (InvalidKeySpecException unused) {
            }
        }
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        instance.add(1, 1);
        Date time2 = instance.getTime();
        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", keyStore.getType());
        instance2.initialize(new KeyPairGeneratorSpec.Builder(context).setAlias("SnapConnectSDK.RSA").setStartDate(time).setEndDate(time2).setSubject(new X500Principal("CN=SnapConnectSDK.RSA")).setSerialNumber(BigInteger.ONE).setKeySize(8192).build());
        return instance2.generateKeyPair();
    }
}
