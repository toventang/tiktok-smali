package com.ss.android.token;

import android.os.Build;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static String f61005a = "MIICXAIBAAKBgQCyEFRPAsPPveGVFOB1pdduJpiNMghV1vlADTtncJxefJ9M2vg9\nT1ghyVYg4HlYeT8AxOv926Ex83tdEiiHhf9o43s05REzFmL+ew+lp3HZPDdTeWuH\nNX46aUcODhnXTZUm00I4+0BJrqbj34pRlKXpJAfLmsp5CsAEN7qMPpg2QwIDAQAB\nAoGBAKXLOITcwS+D0C+8YYaJZP5F55LIPCSY5jkyWNZmbuI3TSgFVk/XueqziYNR\nHws20WfI8ybKQdu9pmaxSpVtObKFNh4QOs3utDmNCWj5VZQQ1CrKjotchsCUyJdG\nfG5IcuORAoGGfTGi2OZ2HBEYnbyS9qkcm7iIeHoPi6hiOl7ZAkEA2hpE+g9U85R/\nSt20XAnV3ub01r4aErrm1o4zgpNSrXDrxt8vcgsRME+AzNVN2gkn0FNWgBxdXvUu\ndi6Ke9rz1QJBANEBCUOwB5708PefN4ZJ9N0p/iyzXf6nXU7hKWL0RHngLMBVpu4h\ncqPPsqc68qsIIeuYC/T09ibiyr9e6G8txbcCQAW9nUUrtCO5K+SPk1i81YlJcPZa\nCJunmb3Z/lcYg5uXFk2kwD3zNp+b6Br8HlF33jloiCVVGcwPDgsETJbX+4UCQAnx\nkK1FvLcVVDmTu6KJ9jpnew5JYllxQQE1uTBaCr/5qGdmK9D8imW8xfUq2szEUEjT\nLQ50cRmchKTiMRDJDrUCQB9x1+tXAaDMiV/3mzHFqCafIMAASo51cLfuV7XS+r/2\n53L/BRf/4c2m0Zq9pJ5kuKoH//WIiXgNzYeHnqgEayk=";

    /* renamed from: b  reason: collision with root package name */
    private static String f61006b = "RSA";

    /* renamed from: c  reason: collision with root package name */
    private static String f61007c = "RSA/ECB/PKCS1Padding";

    static {
        Covode.recordClassIndex(37585);
    }

    public static PrivateKey a(String str) {
        KeyFactory keyFactory;
        try {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode(str, 0));
            if (Build.VERSION.SDK_INT >= 28) {
                keyFactory = KeyFactory.getInstance("RSA");
            } else {
                keyFactory = KeyFactory.getInstance("RSA", "BC");
            }
            return keyFactory.generatePrivate(pKCS8EncodedKeySpec);
        } catch (NoSuchAlgorithmException unused) {
            throw new Exception("no such algorithm");
        } catch (InvalidKeySpecException unused2) {
            throw new Exception("invalid keySpec");
        } catch (NullPointerException unused3) {
            throw new Exception("key data is null");
        }
    }

    public static byte[] a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher instance = Cipher.getInstance(f61007c);
            instance.init(2, privateKey);
            return instance.doFinal(bArr);
        } catch (Exception e2) {
            e.a(e2);
            return null;
        }
    }
}
