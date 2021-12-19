package com.bytedance.retrofit2.mime;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.security.MessageDigest;

public class DigestUtil {
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(26044);
    }

    public static String md5Hex(byte[] bArr) {
        try {
            return new String(encodeHex(MessageDigest.getInstance("MD5").digest(bArr), DIGITS_UPPER));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String md5Hex(InputStream inputStream) {
        MethodCollector.i(4837);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            int read = inputStream.read(bArr, 0, 1024);
            while (read >= 0) {
                instance.update(bArr, 0, read);
                read = inputStream.read(bArr, 0, 1024);
            }
            String str = new String(encodeHex(instance.digest(), DIGITS_UPPER));
            MethodCollector.o(4837);
            return str;
        } catch (Throwable unused) {
            MethodCollector.o(4837);
            return null;
        }
    }

    private static char[] encodeHex(byte[] bArr, char[] cArr) {
        int length = bArr.length;
        char[] cArr2 = new char[(length << 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i2 + 1;
            cArr2[i2] = cArr[(bArr[i3] & 240) >>> 4];
            i2 = i4 + 1;
            cArr2[i4] = cArr[bArr[i3] & 15];
        }
        return cArr2;
    }
}
