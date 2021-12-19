package com.apiguard3.internal;

import android.os.Build;
import android.os.SystemClock;
import com.apiguard3.internal.setImportantForAutofill;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.ugc.effectplatform.b.a.e;

/* access modifiers changed from: package-private */
public final class setAccessibilityTraversalBefore implements setImportantForAutofill.getBody {
    private static byte[] AGRequest = {23, -59, -87, 77, -11, 19, -23, -53, 57, 4, -67, 68, -9, 1, -14, 3, 7, 1, -16, 1, -26, 27, -9, 14, -19, 15, 5, -5, -9, -4, e.f153515b, -53, 31, 15, -6, -5, 7, -3, -17, -23, 15, 17, -14, 67, -6, -4, 11, -25, 25, -11, 9, -17, 10, -3, -13, -4, 17, 4, -13, -13, -1, 5, -9, e.f153515b, -17, -4, e.f153515b, -48, -4, 1, -16, 1, 9, -37, 33, -16, 1, 51, -5, 17, -21, -52, 51, -5, 17, -21, -52, 50, 10, -4, -65, 49, e.f153515b, -9, -4, 12, -22, 15, -16, -51, -4, e.f153515b, -36, 33, -9, 4, -13, 2, -10, -15, 17, -13, 11, -19, -27, 33, -16, 1};
    private static int getBody;
    public static final int getHeaders = 120;
    public static final int getMethod = 0;
    public static final byte[] getUrl = null;
    private static int method = 1;

    static {
        Covode.recordClassIndex(2572);
        getBody();
    }

    private static void getBody() {
        getUrl = new byte[]{98, 23, -100, -90, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        getMethod = 87;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getHeaders(int r9, byte r10, int r11) {
        /*
            int r8 = r10 + 46
            int r7 = r11 + 4
            int r0 = 24 - r9
            byte[] r6 = com.apiguard3.internal.setAccessibilityTraversalBefore.AGRequest
            byte[] r5 = new byte[r0]
            int r4 = r0 + -1
            r3 = 0
            if (r6 != 0) goto L_0x002a
            r2 = 0
            r9 = r4
        L_0x0011:
            int r7 = r7 + 1
            int r8 = r8 + r4
            int r8 = r8 + 2
            r1 = r2
            r4 = r9
        L_0x0018:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r4) goto L_0x0025
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r3)
            return r0
        L_0x0025:
            byte r0 = r6[r7]
            r9 = r4
            r4 = r0
            goto L_0x0011
        L_0x002a:
            r1 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setAccessibilityTraversalBefore.getHeaders(int, byte, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getHeaders(int r8, int r9, byte r10) {
        /*
            int r0 = r10 * 4
            int r1 = r0 + 11
            int r0 = r9 * 3
            int r7 = 4 - r0
            byte[] r6 = com.apiguard3.internal.setAccessibilityTraversalBefore.getUrl
            int r0 = r8 * 2
            int r5 = 102 - r0
            byte[] r4 = new byte[r1]
            int r3 = r1 + -1
            r2 = 0
            if (r6 != 0) goto L_0x0031
            r1 = 0
            r8 = r3
        L_0x0017:
            int r0 = -r5
            int r3 = r3 + r0
            int r5 = r3 + 2
            int r7 = r7 + 1
            r3 = r8
        L_0x001e:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r3) goto L_0x0029
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r2)
            return r0
        L_0x0029:
            int r1 = r1 + 1
            byte r0 = r6[r7]
            r8 = r3
            r3 = r5
            r5 = r0
            goto L_0x0017
        L_0x0031:
            r1 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setAccessibilityTraversalBefore.getHeaders(int, int, byte):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x033f, code lost:
        if (android.os.Build.VERSION.SDK_INT <= 27) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r1 = com.apiguard3.internal.setAccessibilityTraversalBefore.AGRequest;
        r7 = java.lang.Runtime.class.getMethod(getHeaders((int) ((byte) r1[23]), (byte) r1[8], (int) ((byte) (com.apiguard3.internal.setAccessibilityTraversalBefore.getHeaders & 480))), null).invoke(null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r3 = com.apiguard3.internal.setAccessibilityTraversalBefore.AGRequest;
        r1 = java.io.File.class.getMethod(getHeaders((int) ((byte) r3[50]), (byte) r3[8], (int) ((byte) r3[48])), null).invoke(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r3 = new java.lang.Object[2];
        r3[1] = com.apiguard3.internal.setAccessibilityTraversalBefore.class.getClassLoader();
        r3[0] = r1;
        r11 = com.apiguard3.internal.setAccessibilityTraversalBefore.AGRequest;
        r2 = (byte) (r11[5] - 1);
        r0 = java.lang.Runtime.class.getDeclaredMethod(getHeaders((int) r2, (byte) (r2 | 36), (int) ((byte) r11[11])), java.lang.String.class, java.lang.ClassLoader.class);
        r0.setAccessible(true);
        r0.invoke(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03ad, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b8, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03bb, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03bd, code lost:
        r0 = r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03c1, code lost:
        if (r0 != null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03c3, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03c6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03c7, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03ca, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03cc, code lost:
        r0 = r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03d0, code lost:
        if (r0 != null) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03d2, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03d5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03d6, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03d9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:?, code lost:
        r1 = com.apiguard3.internal.setAccessibilityTraversalBefore.AGRequest;
        r11 = com.apiguard3.internal.setAccessibilityTraversalBefore.getHeaders;
        r3 = java.lang.Runtime.class.getMethod(getHeaders((int) ((byte) r1[23]), (byte) r1[8], (int) ((byte) (r11 & 480))), null).invoke(null, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r8 = com.apiguard3.internal.setAccessibilityTraversalBefore.AGRequest;
        r1 = java.io.File.class.getMethod(getHeaders((int) ((byte) r8[50]), (byte) r8[8], (int) ((byte) r8[48])), null).invoke(r5, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0414, code lost:
        r0 = com.apiguard3.internal.setAccessibilityTraversalBefore.class.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0418, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r8 = new java.lang.Object[2];
        r8[1] = r0;
        r8[0] = r1;
        r1 = (byte) (r11 & 448);
        r0 = java.lang.Runtime.class.getDeclaredMethod(getHeaders((int) ((byte) com.apiguard3.internal.setAccessibilityTraversalBefore.AGRequest[23]), r1, (int) ((byte) (r1 | 41))), java.lang.String.class, java.lang.ClassLoader.class);
        r0.setAccessible(true);
        r0.invoke(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0477, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0478, code lost:
        r0 = r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x047c, code lost:
        if (r0 != null) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x047e, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0481, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0482, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0485, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0486, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0488, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x048b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x048c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0496, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0497, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0498, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0499, code lost:
        r0 = r1.getCause();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2749);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04a0, code lost:
        if (r0 != null) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04a3, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x033b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void getUrl(java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 1308
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setAccessibilityTraversalBefore.getUrl(java.lang.String):void");
    }

    setAccessibilityTraversalBefore() {
    }

    @Override // com.apiguard3.internal.setImportantForAutofill.getBody
    public final String[] getHeaders() {
        char c2;
        int i2 = method + 65;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT < 21) {
            c2 = 'M';
        } else {
            c2 = 26;
        }
        if (c2 != 'M' && Build.SUPPORTED_ABIS.length > 0) {
            return Build.SUPPORTED_ABIS;
        }
        if (setImportantForAutofill.getMethod(Build.CPU_ABI2)) {
            return new String[]{Build.CPU_ABI};
        }
        int i4 = method + 69;
        getBody = i4 % 128;
        int i5 = i4 % 2;
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    @Override // com.apiguard3.internal.setImportantForAutofill.getBody
    public final void AGRequest(String str) {
        int i2 = getBody + 123;
        method = i2 % 128;
        int i3 = i2 % 2;
        com_apiguard3_internal_setAccessibilityTraversalBefore_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(str);
    }

    public static void com_apiguard3_internal_setAccessibilityTraversalBefore_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(String str) {
        MethodCollector.i(2736);
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        m.a(uptimeMillis, str);
        MethodCollector.o(2736);
    }

    @Override // com.apiguard3.internal.setImportantForAutofill.getBody
    public final String getBody(String str) {
        int i2 = getBody + 107;
        method = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = AGRequest;
        if (str.startsWith(getHeaders((int) ((byte) (-bArr[80])), (byte) 62, (int) ((byte) bArr[0])))) {
            byte[] bArr2 = AGRequest;
            byte b2 = (byte) (-bArr2[80]);
            byte b3 = (byte) (bArr2[13] - 1);
            if (str.endsWith(getHeaders((int) b2, b3, (int) ((byte) (b3 | 39))))) {
                return str;
            }
        }
        String mapLibraryName = System.mapLibraryName(str);
        int i4 = getBody + 105;
        method = i4 % 128;
        int i5 = i4 % 2;
        return mapLibraryName;
    }

    @Override // com.apiguard3.internal.setImportantForAutofill.getBody
    public final void getHeaders(String str) {
        int i2 = method + 121;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        getUrl(str);
        int i4 = method + 123;
        getBody = i4 % 128;
        if (i4 % 2 != 0) {
            throw new NullPointerException("hashCode");
        }
    }
}
