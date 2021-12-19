package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class k {
    static {
        Covode.recordClassIndex(35483);
    }

    public static String a(InputStream inputStream) {
        byte[] b2 = b(inputStream);
        if (b2 == null) {
            return null;
        }
        return new String(b2);
    }

    private static byte[] b(InputStream inputStream) {
        MethodCollector.i(13799);
        if (inputStream == null) {
            MethodCollector.o(13799);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.o(13799);
                    return byteArray;
                }
            } catch (IOException unused) {
                MethodCollector.o(13799);
                return null;
            }
        }
    }
}
