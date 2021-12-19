package com.bytedance.frameworks.encryptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class EncryptorUtil {
    private static native byte[] ttEncrypt(byte[] bArr, int i2);

    static {
        Covode.recordClassIndex(17134);
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.b("Encryptor", false, null);
            m.a(uptimeMillis, "Encryptor");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public static byte[] a(byte[] bArr, int i2) {
        MethodCollector.i(12529);
        if (bArr != null && i2 > 0) {
            try {
                if (bArr.length == i2) {
                    byte[] ttEncrypt = ttEncrypt(bArr, i2);
                    MethodCollector.o(12529);
                    return ttEncrypt;
                }
            } catch (Throwable unused) {
                MethodCollector.o(12529);
                return null;
            }
        }
        MethodCollector.o(12529);
        return null;
    }
}
