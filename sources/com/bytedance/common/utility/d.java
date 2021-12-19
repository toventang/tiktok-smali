package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f26930a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(15896);
    }

    public static String a(byte[] bArr) {
        Objects.requireNonNull(bArr, "bytes is null");
        return a(bArr, bArr.length);
    }

    public static String b(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr);
                    return a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String a(File file) {
        MethodCollector.i(2021);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance == null) {
                MethodCollector.o(2021);
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr, 0, 8192);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    String a2 = a(instance.digest());
                    MethodCollector.o(2021);
                    return a2;
                }
            }
        } catch (Exception unused) {
            MethodCollector.o(2021);
            return null;
        }
    }

    public static String b(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return a(instance.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static byte[] a(String str) {
        if (str == null || str.length() % 2 == 1) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: ".concat(String.valueOf(str)));
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[(length / 2)];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(charArray[i2], 16) << 4) + Character.digit(charArray[i2 + 1], 16));
        }
        return bArr;
    }

    public static String a(byte[] bArr, int i2) {
        Objects.requireNonNull(bArr, "bytes is null");
        if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = bArr[i5 + 0] & 255;
                int i7 = i4 + 1;
                char[] cArr2 = f26930a;
                cArr[i4] = cArr2[i6 >> 4];
                i4 = i7 + 1;
                cArr[i7] = cArr2[i6 & 15];
            }
            return new String(cArr, 0, i3);
        }
        throw new IndexOutOfBoundsException();
    }
}
