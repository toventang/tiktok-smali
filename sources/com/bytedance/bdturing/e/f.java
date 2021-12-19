package com.bytedance.bdturing.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.e.b;
import h.e.c;
import h.e.q;
import h.f.b.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f26474a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f26475b;

    /* renamed from: c  reason: collision with root package name */
    private final a f26476c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.bdturing.d.a f26477d;

    public interface a {
        static {
            Covode.recordClassIndex(15565);
        }

        void a(int i2, String str, long j2);
    }

    static {
        Covode.recordClassIndex(15564);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        r11.f26476c.a(500, r4, java.lang.System.currentTimeMillis() - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fd A[ExcHandler: Exception (r0v13 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r4 
      PHI: (r4v3 java.lang.String) = (r4v1 java.lang.String), (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:15:0x009d, B:23:0x00d9, B:24:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:15:0x009d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.e.f.a():void");
    }

    private static String a(byte[] bArr, byte[] bArr2, InputStream inputStream) {
        MethodCollector.i(11037);
        if (bArr == null || bArr2 == null) {
            String a2 = q.a(new InputStreamReader(inputStream));
            MethodCollector.o(11037);
            return a2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        instance.init(2, secretKeySpec, ivParameterSpec);
        l.d(inputStream, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b.a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l.b(byteArray, "");
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(instance.doFinal(byteArray)));
        try {
            String a3 = q.a(new InputStreamReader(gZIPInputStream));
            c.a(gZIPInputStream, null);
            MethodCollector.o(11037);
            return a3;
        } catch (Throwable th) {
            c.a(gZIPInputStream, th);
            MethodCollector.o(11037);
            throw th;
        }
    }

    public f(String str, Map<String, String> map, a aVar, com.bytedance.bdturing.d.a aVar2) {
        l.c(str, "");
        l.c(map, "");
        l.c(aVar, "");
        l.c(aVar2, "");
        this.f26474a = str;
        this.f26475b = map;
        this.f26476c = aVar;
        this.f26477d = aVar2;
    }
}
