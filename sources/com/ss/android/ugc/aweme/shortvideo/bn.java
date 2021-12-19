package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class bn {

    /* renamed from: a  reason: collision with root package name */
    protected static char[] f125045a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(82149);
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return a(str.getBytes());
    }

    public static String a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(f125045a[(b2 & 240) >> 4]);
                stringBuffer.append(f125045a[b2 & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String a(File file) {
        MethodCollector.i(11135);
        if (!file.isFile()) {
            MethodCollector.o(11135);
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    String b2 = b(instance.digest());
                    MethodCollector.o(11135);
                    return b2;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(11135);
            return "";
        }
    }

    private static String b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            cArr2[i2] = cArr[(b2 >>> 4) & 15];
            i2 = i3 + 1;
            cArr2[i3] = cArr[b2 & 15];
        }
        return new String(cArr2);
    }
}
