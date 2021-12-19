package com.facebook.common.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;

public final class a {
    static {
        Covode.recordClassIndex(28629);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(5186);
        i.a(inputStream);
        i.a(outputStream);
        byte[] bArr = new byte[4096];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
            } else {
                MethodCollector.o(5186);
                return j2;
            }
        }
    }

    public static int a(InputStream inputStream, byte[] bArr, int i2) {
        MethodCollector.i(5190);
        i.a(inputStream);
        i.a(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3 + 0, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            MethodCollector.o(5190);
            return i3;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("len is negative");
        MethodCollector.o(5190);
        throw indexOutOfBoundsException;
    }
}
