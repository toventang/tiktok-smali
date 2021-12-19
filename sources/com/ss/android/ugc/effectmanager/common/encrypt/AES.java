package com.ss.android.ugc.effectmanager.common.encrypt;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import h.f.b.l;
import h.m.d;
import h.m.p;
import h.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AES {
    public static final AES INSTANCE = new AES();
    private static boolean hasInitialized;
    private static IvParameterSpec ivParameterSpec;
    private static SecretKeySpec secretKeySpec;

    private AES() {
    }

    static {
        Covode.recordClassIndex(95290);
    }

    private final synchronized boolean checkIfInitialized() {
        boolean z;
        byte[] generateSecretKey;
        MethodCollector.i(533);
        if (!hasInitialized && (generateSecretKey = generateSecretKey()) != null) {
            AES aes = INSTANCE;
            secretKeySpec = aes.initSecretKeySpec(generateSecretKey);
            ivParameterSpec = aes.initIvParameterSpec(generateSecretKey);
            hasInitialized = true;
        }
        z = hasInitialized;
        MethodCollector.o(533);
        return z;
    }

    private final byte[] generateSecretKey() {
        String platformSDKVersion = EPUtils.getPlatformSDKVersion();
        if (platformSDKVersion != null) {
            try {
                String mD5String16Bit = MD5Utils.getMD5String16Bit(platformSDKVersion + ":android");
                l.a((Object) mD5String16Bit, "");
                Charset forName = Charset.forName("UTF-8");
                l.a((Object) forName, "");
                if (mD5String16Bit != null) {
                    byte[] bytes = mD5String16Bit.getBytes(forName);
                    l.a((Object) bytes, "");
                    return bytes;
                }
                throw new w("null cannot be cast to non-null type");
            } catch (Exception e2) {
                EPLog.e("AES_TAG", "generateSecretKey error, " + e2.getMessage());
            }
        }
        return null;
    }

    private final IvParameterSpec initIvParameterSpec(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }

    private final SecretKeySpec initSecretKeySpec(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static final String decrypt(String str) {
        AES aes = INSTANCE;
        if (!aes.checkIfInitialized() || str == null || p.a((CharSequence) str)) {
            return "";
        }
        return aes.decryptInternal(str);
    }

    public static final List<String> decryptArray(List<String> list) {
        if (!INSTANCE.checkIfInitialized() || CollectionUtil.isListEmpty(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            l.a();
        }
        for (String str : list) {
            String decrypt = decrypt(str);
            if (decrypt != null) {
                arrayList.add(decrypt);
            }
        }
        return arrayList;
    }

    private final String decryptInternal(String str) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = instance.doFinal(Base64.decode(str, 0));
            l.a((Object) doFinal, "");
            return new String(doFinal, d.f158808a);
        } catch (Exception e2) {
            EPLog.d("AES_TAG", "Error while decrypting " + str + ", exception: " + e2);
            return "";
        }
    }

    public static final String encrypt(String str) {
        boolean z;
        if (INSTANCE.checkIfInitialized()) {
            if (str == null || p.a((CharSequence) str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance.init(1, secretKeySpec, ivParameterSpec);
                    Charset forName = Charset.forName("UTF-8");
                    l.a((Object) forName, "");
                    if (str != null) {
                        byte[] bytes = str.getBytes(forName);
                        l.a((Object) bytes, "");
                        return Base64.encodeToString(instance.doFinal(bytes), 0);
                    }
                    throw new w("null cannot be cast to non-null type");
                } catch (Exception e2) {
                    System.out.println((Object) "Error while encrypting: ".concat(String.valueOf(e2)));
                }
            }
        }
        return "";
    }
}
