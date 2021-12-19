package com.bytedance.globalpayment.iap.google.f;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.h.a;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

public final class c {
    static {
        Covode.recordClassIndex(17645);
    }

    public static PublicKey a(String str) {
        a.a().e();
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Throwable th) {
            a.a().e();
            throw new RuntimeException(th);
        }
    }

    public static boolean a(PublicKey publicKey, String str, String str2) {
        a.a().e();
        new StringBuilder("Security: try verify , publicKey is ").append(publicKey).append(" signedData is ").append(str).append(" signature is ").append(str2);
        try {
            byte[] decode = Base64.decode(str2, 0);
            try {
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(publicKey);
                instance.update(str.getBytes());
                if (instance.verify(decode)) {
                    return true;
                }
                a.a().e();
                return false;
            } catch (NoSuchAlgorithmException unused) {
                a.a().e();
                return false;
            } catch (InvalidKeyException unused2) {
                a.a().e();
                return false;
            } catch (SignatureException unused3) {
                a.a().e();
                return false;
            }
        } catch (IllegalArgumentException unused4) {
            a.a().e();
            return false;
        }
    }
}
