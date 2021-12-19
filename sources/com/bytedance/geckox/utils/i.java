package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f30128a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(17497);
    }

    public static String a(File file, String str) {
        Throwable th;
        MethodCollector.i(6977);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                String b2 = b(fileInputStream2, str);
                c.a(fileInputStream2);
                MethodCollector.o(6977);
                return b2;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                c.a(fileInputStream);
                MethodCollector.o(6977);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c.a(fileInputStream);
            MethodCollector.o(6977);
            throw th;
        }
    }

    public static void a(InputStream inputStream, String str) {
        if (str != null) {
            String b2 = b(inputStream, "MD5");
            if (!b2.equals(str)) {
                throw new RuntimeException("md5 check failed file: local md5:" + b2 + " expect md5:" + str);
            }
            return;
        }
        throw new RuntimeException("md5 check failed: md5 == null");
    }

    private static String b(InputStream inputStream, String str) {
        MethodCollector.i(7038);
        byte[] bArr = new byte[16384];
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            byte[] digest = instance.digest();
            int length = digest.length;
            if (length + 0 <= digest.length) {
                int i2 = length * 2;
                char[] cArr = new char[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = digest[i4 + 0] & 255;
                    int i6 = i3 + 1;
                    char[] cArr2 = f30128a;
                    cArr[i3] = cArr2[i5 >> 4];
                    i3 = i6 + 1;
                    cArr[i6] = cArr2[i5 & 15];
                }
                String str2 = new String(cArr, 0, i2);
                c.a(inputStream);
                MethodCollector.o(7038);
                return str2;
            }
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.o(7038);
            throw indexOutOfBoundsException;
        } catch (Exception e2) {
            RuntimeException runtimeException = new RuntimeException("getHash error: " + e2.getMessage());
            MethodCollector.o(7038);
            throw runtimeException;
        } catch (Throwable th) {
            c.a(inputStream);
            MethodCollector.o(7038);
            throw th;
        }
    }
}
