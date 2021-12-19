package com.kakao.auth.helper;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import com.a;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.Utility;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* access modifiers changed from: package-private */
public class AESEncryptor implements Encryptor {
    private static final IvParameterSpec IV_PARAMETER_SPEC;
    private static final String cipherAlgorithm = Utils.base64DecodeAndXor("Iio+ASgjKE4/ZSIjXDMOCUoCDww=");
    private static final byte[] initVector;
    private static final String keyGenAlgorithm = Utils.base64DecodeAndXor("My0oeSI1IzInbyA+LVFaW2wiNSokPAMiMipOLS4=");
    private Cipher decryptor;
    private Cipher encryptor;

    /* access modifiers changed from: package-private */
    public static class AndroidIdUtils {
        static {
            Covode.recordClassIndex(34312);
        }

        AndroidIdUtils() {
        }

        private static String stripZeroOrSpace(String str) {
            if (str == null) {
                return null;
            }
            return str.replaceAll("[0\\s]", "");
        }

        private static byte[] hash(String str) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.reset();
            instance.update(str.getBytes());
            return instance.digest();
        }

        static byte[] generateAndroidId(Context context) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            Objects.requireNonNull(string, "android_id is null.");
            return hash(a.a("SDK-%s", new Object[]{stripZeroOrSpace(string)}));
        }
    }

    static class Utils {
        static {
            Covode.recordClassIndex(34313);
        }

        private Utils() {
        }

        static String xorMessage(String str) {
            return xorMessage(str, "com.kakao.api");
        }

        static String base64DecodeAndXor(String str) {
            return xorMessage(new String(Base64.decode(str, 0)));
        }

        static String xorMessage(String str, String str2) {
            if (!(str == null || str2 == null)) {
                try {
                    char[] charArray = str2.toCharArray();
                    char[] charArray2 = str.toCharArray();
                    int length = charArray2.length;
                    int length2 = charArray.length;
                    char[] cArr = new char[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        cArr[i2] = (char) (charArray2[i2] ^ charArray[i2 % length2]);
                    }
                    return new String(cArr);
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(34311);
        byte[] bArr = {112, 78, 75, 55, -54, -30, -10, 44, 102, -126, -126, 92, -116, -48, -123, -55};
        initVector = bArr;
        IV_PARAMETER_SPEC = new IvParameterSpec(bArr);
    }

    @Override // com.kakao.auth.helper.Encryptor
    public String decrypt(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.decryptor.doFinal(Base64.decode(str, 2)), "UTF-8");
    }

    @Override // com.kakao.auth.helper.Encryptor
    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        return Base64.encodeToString(this.encryptor.doFinal(str.getBytes("UTF-8")), 2);
    }

    AESEncryptor(Context context, byte[] bArr) {
        String keyHash = Utility.getKeyHash(context);
        SecretKey generateSecret = SecretKeyFactory.getInstance(keyGenAlgorithm).generateSecret(new PBEKeySpec(keyHash.substring(0, Math.min(keyHash.length(), 16)).toCharArray(), bArr, 2, 256));
        SecretKeySpec secretKeySpec = new SecretKeySpec(generateSecret.getEncoded(), "AES");
        String str = cipherAlgorithm;
        this.encryptor = Cipher.getInstance(str);
        this.decryptor = Cipher.getInstance(str);
        try {
            Cipher cipher = this.encryptor;
            IvParameterSpec ivParameterSpec = IV_PARAMETER_SPEC;
            cipher.init(1, secretKeySpec, ivParameterSpec);
            this.decryptor.init(2, secretKeySpec, ivParameterSpec);
        } catch (InvalidKeyException unused) {
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(Arrays.copyOfRange(generateSecret.getEncoded(), 0, generateSecret.getEncoded().length / 2), "AES");
            Cipher cipher2 = this.encryptor;
            IvParameterSpec ivParameterSpec2 = IV_PARAMETER_SPEC;
            cipher2.init(1, secretKeySpec2, ivParameterSpec2);
            this.decryptor.init(2, secretKeySpec2, ivParameterSpec2);
        }
    }
}
