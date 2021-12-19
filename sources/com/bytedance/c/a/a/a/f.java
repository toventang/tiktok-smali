package com.bytedance.c.a.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public final class f {
    static {
        Covode.recordClassIndex(15742);
    }

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        static {
            Covode.recordClassIndex(15743);
        }

        private a(int i2) {
            this.nativeInt = i2;
        }
    }

    private static byte[] a(InputStream inputStream) {
        MethodCollector.i(8643);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.o(8643);
                return byteArray;
            }
        }
    }

    public static byte[] a(String str, byte[] bArr, a aVar, String str2) {
        MethodCollector.i(8660);
        String str3 = null;
        if (str == null) {
            MethodCollector.o(8660);
            return null;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr = byteArrayOutputStream.toByteArray();
                str3 = "gzip";
            } catch (Throwable unused) {
                gZIPOutputStream.close();
                MethodCollector.o(8660);
                return null;
            }
        } else if (a.DEFLATER == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream2.toByteArray();
            str3 = "deflate";
        }
        byte[] a2 = EncryptorUtil.a(bArr, bArr.length);
        if (a2 != null) {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            str = str + "tt_data=a";
            str2 = "application/octet-stream;tt-data=a";
            bArr = a2;
        }
        byte[] a3 = a(str, bArr, str2, str3, "POST");
        MethodCollector.o(8660);
        return a3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:45|(1:50)(1:49)|(2:52|53)|54|55|56|58) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ff */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(java.lang.String r8, byte[] r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.c.a.a.a.f.a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String):byte[]");
    }
}
