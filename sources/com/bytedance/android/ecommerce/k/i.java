package com.bytedance.android.ecommerce.k;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public final class i {
    static {
        Covode.recordClassIndex(3440);
    }

    public static String a(String str, String str2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY----", "").getBytes(), 0)));
            OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-1", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT);
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
            instance.init(1, generatePublic, oAEPParameterSpec);
            return Base64.encodeToString(instance.doFinal(str2.getBytes()), 2);
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }
}
