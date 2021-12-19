package com.bytedance.framwork.core.b.e;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a {
    static {
        Covode.recordClassIndex(17166);
    }

    public static String a(byte[] bArr, String str) {
        String str2 = "";
        try {
            byte[] decode = Base64.decode(bArr, 0);
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
                Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
                instance.init(2, secretKeySpec);
                String str3 = new String(instance.doFinal(decode));
                try {
                    int indexOf = str3.indexOf("$");
                    if (indexOf != -1) {
                        return str3.substring(0, indexOf);
                    }
                    return str3;
                } catch (Exception unused) {
                    str2 = str3;
                    return str2;
                }
            } catch (Exception unused2) {
                return str2;
            }
        } catch (Exception unused3) {
            return str2;
        }
    }
}
