package com.bytedance.android.livesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

public final class o {
    static {
        Covode.recordClassIndex(11806);
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(8727);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = gZIPInputStream.read(bArr, 0, 4096);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                gZIPInputStream.close();
                MethodCollector.o(8727);
                return;
            }
        }
    }
}
