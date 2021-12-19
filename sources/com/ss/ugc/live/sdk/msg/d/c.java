package com.ss.ugc.live.sdk.msg.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

public final class c {
    static {
        Covode.recordClassIndex(102820);
    }

    public static byte[] a(byte[] bArr) {
        MethodCollector.i(4834);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayInputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        byteArrayInputStream.close();
        MethodCollector.o(4834);
        return byteArray;
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(4893);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = gZIPInputStream.read(bArr, 0, 4096);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                gZIPInputStream.close();
                MethodCollector.o(4893);
                return;
            }
        }
    }
}
