package com.apiguard3.internal;

import com.apiguard3.internal.setImportantForAutofill;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class setAutofillId implements setImportantForAutofill.getMethod {
    private static int AGRequest;
    private static int getUrl = 1;

    static {
        Covode.recordClassIndex(2579);
    }

    /* access modifiers changed from: package-private */
    public static class getBody {
        public ZipEntry getMethod;
        public ZipFile getUrl;

        static {
            Covode.recordClassIndex(2580);
        }

        public getBody(ZipFile zipFile, ZipEntry zipEntry) {
            this.getUrl = zipFile;
            this.getMethod = zipEntry;
        }
    }

    private static long getHeaders(InputStream inputStream, OutputStream outputStream) {
        long j2;
        int i2;
        MethodCollector.i(2076);
        int i3 = AGRequest + 99;
        int i4 = i3 % 128;
        getUrl = i4;
        if (i3 % 2 != 0) {
            j2 = 0;
            i2 = 4096;
        } else {
            j2 = 1;
            i2 = 13321;
        }
        byte[] bArr = new byte[i2];
        int i5 = i4 + 57;
        AGRequest = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                MethodCollector.o(2076);
                return j2;
            }
            outputStream.write(bArr, 0, read);
            j2 += (long) read;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.apiguard3.internal.setAutofillId.getBody getUrl(android.content.Context r14, java.lang.String[] r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setAutofillId.getUrl(android.content.Context, java.lang.String[], java.lang.String):com.apiguard3.internal.setAutofillId$getBody");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:113|(3:69|70|71)|72|73|74|76|77|(1:79)(1:80)|81|82) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x00b3 */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075 A[SYNTHETIC, Splitter:B:38:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081 A[SYNTHETIC, Splitter:B:47:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00c3 A[Catch:{ IOException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00c4 A[Catch:{ IOException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00d7 A[SYNTHETIC, Splitter:B:90:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00dd A[SYNTHETIC, Splitter:B:94:0x00dd] */
    @Override // com.apiguard3.internal.setImportantForAutofill.getMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getBody(android.content.Context r15, java.lang.String[] r16, java.lang.String r17, java.io.File r18, com.apiguard3.internal.setContentCaptureSession r19) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setAutofillId.getBody(android.content.Context, java.lang.String[], java.lang.String, java.io.File, com.apiguard3.internal.setContentCaptureSession):void");
    }
}
