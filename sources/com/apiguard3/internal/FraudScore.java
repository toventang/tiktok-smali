package com.apiguard3.internal;

import android.webkit.URLUtil;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import javax.security.auth.Destroyable;

public final class FraudScore implements Destroyable {
    private static int AGRequest = 1;
    private static char[] getBody = {'\"', 'Y', 'h', 'j', 'u', 't', 'r', 'q', 'p', 'I', 'A', 'b', 'g', 'J', 'M', 'J', 'A', 'c', 'B', '@', '@', 'G', 'q', 'p', 'l', '2', 'd', 'o', 't', 'p', 's', 's', 'l', 'd', 'B', 'L', 'n', 'b', 'c', 'k', 'o', 'f', '@', 'J', 'k', 'd', 'g', 'f', 'X'};
    private static int getHeaders;
    private byte[] getMethod;
    private de getUrl;

    static {
        Covode.recordClassIndex(2524);
    }

    @Override // javax.security.auth.Destroyable
    public final synchronized void destroy() {
        char c2;
        MethodCollector.i(2754);
        byte[] bArr = this.getMethod;
        if (bArr == null) {
            c2 = 'M';
        } else {
            c2 = ']';
        }
        if (c2 != 'M') {
            int i2 = AGRequest + 15;
            getHeaders = i2 % 128;
            int i3 = i2 % 2;
            Arrays.fill(bArr, (byte) 0);
            this.getMethod = null;
        }
        if (this.getUrl == null) {
            MethodCollector.o(2754);
            return;
        }
        this.getUrl = null;
        int i4 = AGRequest + 111;
        getHeaders = i4 % 128;
        if (i4 % 2 != 0) {
            MethodCollector.o(2754);
        } else {
            MethodCollector.o(2754);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (isDestroyed() == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String getMethod() {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.FraudScore.getMethod():java.lang.String");
    }

    public final synchronized boolean isDestroyed() {
        MethodCollector.i(2755);
        int i2 = AGRequest + 109;
        getHeaders = i2 % 128;
        if (i2 % 2 != 0) {
            de deVar = this.getUrl;
            try {
                throw new NullPointerException("hashCode");
            } catch (Throwable th) {
                MethodCollector.o(2755);
                throw th;
            }
        } else if (this.getUrl != null) {
            MethodCollector.o(2755);
            return false;
        } else {
            int i3 = getHeaders + 93;
            AGRequest = i3 % 128;
            if (i3 % 2 != 0) {
                MethodCollector.o(2755);
                return true;
            }
            MethodCollector.o(2755);
            return true;
        }
    }

    public static FraudScore getBody(long j2) {
        int i2 = getHeaders + 1;
        AGRequest = i2 % 128;
        int i3 = i2 % 2;
        FraudScore AGRequest2 = ScoredEntry.AGRequest(Config.getUrl(String.valueOf(j2)));
        int i4 = AGRequest + 35;
        getHeaders = i4 % 128;
        int i5 = i4 % 2;
        return AGRequest2;
    }

    public static FraudScore getHeaders(char... cArr) {
        int i2 = getHeaders + 75;
        AGRequest = i2 % 128;
        if (i2 % 2 != 0) {
            return ScoredEntry.AGRequest(Config.getHeaders(cArr));
        }
        ScoredEntry.AGRequest(Config.getHeaders(cArr));
        throw new NullPointerException("hashCode");
    }

    public static FraudScore getUrl(String str) {
        int i2 = AGRequest + 11;
        getHeaders = i2 % 128;
        if (i2 % 2 == 0) {
            return ScoredEntry.AGRequest(Config.getUrl(str));
        }
        ScoredEntry.AGRequest(Config.getUrl(str));
        throw new NullPointerException("hashCode");
    }

    FraudScore(byte[] bArr, de deVar) {
        if (deVar != null) {
            this.getMethod = deVar.AGRequest(bArr);
            this.getUrl = deVar;
            return;
        }
        throw new IllegalArgumentException(getUrl(new int[]{0, 25, 0, 0}, !URLUtil.isContentUrl("content:"), "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000").intern());
    }

    private static String getUrl(int[] iArr, boolean z, String str) {
        char[] cArr;
        int i2;
        byte[] bArr = str;
        if (str != null) {
            int i3 = AGRequest + 111;
            getHeaders = i3 % 128;
            int i4 = i3 % 2;
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr2 = new char[i6];
        System.arraycopy(getBody, i5, cArr2, 0, i6);
        if (bArr2 != null) {
            char[] cArr3 = new char[i6];
            char c2 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (bArr2[i9] == 1) {
                    cArr3[i9] = (char) (((cArr2[i9] << 1) + 1) - c2);
                } else {
                    cArr3[i9] = (char) ((cArr2[i9] << 1) - c2);
                    int i10 = getHeaders + 79;
                    AGRequest = i10 % 128;
                    int i11 = i10 % 2;
                }
                c2 = cArr3[i9];
            }
            cArr2 = cArr3;
        }
        if (i8 > 0) {
            char[] cArr4 = new char[i6];
            System.arraycopy(cArr2, 0, cArr4, 0, i6);
            int i12 = i6 - i8;
            System.arraycopy(cArr4, 0, cArr2, i12, i8);
            System.arraycopy(cArr4, i8, cArr2, 0, i12);
        }
        if (z) {
            int i13 = AGRequest + 19;
            getHeaders = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i6];
                i2 = 0;
            } else {
                cArr = new char[i6];
                i2 = 1;
            }
            while (i2 < i6) {
                cArr[i2] = cArr2[(i6 - i2) - 1];
                i2++;
            }
            cArr2 = cArr;
        }
        if (i7 > 0) {
            int i14 = 0;
            while (i14 < i6) {
                int i15 = AGRequest + 83;
                getHeaders = i15 % 128;
                if (i15 % 2 != 0) {
                    cArr2[i14] = (char) (cArr2[i14] << iArr[3]);
                    i14 += 17;
                } else {
                    cArr2[i14] = (char) (cArr2[i14] - iArr[2]);
                    i14++;
                }
            }
        }
        return new String(cArr2);
    }
}
