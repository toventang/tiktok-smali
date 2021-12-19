package com.bytedance.push.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

final class e {
    static {
        Covode.recordClassIndex(25708);
    }

    static byte[] a(InputStream inputStream) {
        MethodCollector.i(7698);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.o(7698);
                return byteArray;
            }
        }
    }
}
