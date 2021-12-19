package com.lynx.tasm.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class ResourceLoader {
    static {
        Covode.recordClassIndex(35269);
    }

    private native void nativeConfigLynxResourceSetting();

    private static byte[] a(InputStream inputStream) {
        MethodCollector.i(12200);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.o(12200);
                return byteArray;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r0.printStackTrace();
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e4 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010a A[SYNTHETIC, Splitter:B:58:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122 A[SYNTHETIC, Splitter:B:66:0x0122] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] loadJSSource(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.core.ResourceLoader.loadJSSource(java.lang.String):byte[]");
    }
}
