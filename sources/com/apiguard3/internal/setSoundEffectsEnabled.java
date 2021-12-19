package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.OutputStream;

public class setSoundEffectsEnabled extends setHasTransientState {
    private static int AGRequest = 0;
    private static int getBody;
    private static int getHeaders = 0;
    private static int getMethod = 1;
    private static long getUrl = 8746101853618467533L;

    static {
        Covode.recordClassIndex(2614);
        getBody = 1;
        getBody = 67;
    }

    private static native String b(int i2, int i3);

    /* access modifiers changed from: package-private */
    public static class getUrl extends OutputStream {
        private static int AGRequest;
        private static int getHeaders = 0;
        private static int getMethod = 1;
        private static int getUrl = 0;
        private long getBody;

        static {
            Covode.recordClassIndex(2616);
            AGRequest = 1;
            AGRequest = 89;
        }

        private getUrl() {
            MethodCollector.i(2202);
            MethodCollector.o(2202);
        }

        /* synthetic */ getUrl(byte b2) {
            this();
        }

        static /* synthetic */ long getUrl(getUrl geturl) {
            int i2 = getHeaders;
            int i3 = i2 + 37;
            getMethod = i3 % 128;
            int i4 = i3 % 2;
            long j2 = geturl.getBody;
            int i5 = (i2 + 22) - 1;
            getMethod = i5 % 128;
            if (i5 % 2 != 0) {
                return j2;
            }
            int i6 = getUrl + 1;
            AGRequest = i6 % 128;
            int i7 = i6 % 2;
            throw new NullPointerException("hashCode");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
            if ((r1 % 2) != 0) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
            if (r9.getBody != 1078223722248L) goto L_0x0041;
         */
        @Override // java.io.OutputStream
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void write(int r10) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setSoundEffectsEnabled.getUrl.write(int):void");
        }
    }

    public static int AGRequest() {
        int i2 = getHeaders;
        int i3 = i2 + 25;
        int i4 = i3 % 128;
        getBody = i4;
        int i5 = i3 % 2;
        int i6 = AGRequest;
        int i7 = ((i6 | 15) << 1) - (i6 ^ 15);
        getMethod = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = i4 + 117;
            getHeaders = i8 % 128;
            int i9 = i8 % 2;
        } else {
            int i10 = i2 + 51;
            getBody = i10 % 128;
            int i11 = i10 % 2;
        }
        return getUrl(17).getMethod();
    }

    /* access modifiers changed from: package-private */
    public static class getMethod extends ClassLoader {
        private static char AGRequest = 17361;
        private static int AGRequest$Builder = 0;
        private static char getBody = 57388;
        private static char getHeaders = 43300;
        private static char getMethod = 53354;
        private static int method = 0;
        private static int newBuilder = 1;
        private static int url;
        private final ClassLoader getUrl;

        static {
            Covode.recordClassIndex(2615);
            url = 1;
            url = 23;
        }

        getMethod(ClassLoader classLoader) {
            super(classLoader);
            this.getUrl = classLoader;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
            r0 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.AGRequest$Builder;
            r1 = (r0 & 5) + (r0 | 5);
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.newBuilder = r1 % 128;
            r0 = r1 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ca, code lost:
            return false;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:7:0x0046] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean AGRequest(java.lang.String r7) {
            /*
            // Method dump skipped, instructions count: 203
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setSoundEffectsEnabled.getMethod.AGRequest(java.lang.String):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
            if ((r1 % 2) == 0) goto L_0x00f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            r1 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.method + 47;
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.url = r1 % 128;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
            if ((r1 % 2) == 0) goto L_0x00f3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
            if (r0 == true) goto L_0x00ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
            r7 = r17.toCharArray();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            r4 = new char[r7.length];
            r3 = new char[2];
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
            if (r2 < r7.length) goto L_0x00ea;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
            if (r0 == true) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
            r2 = new java.lang.String(r4, 1, (int) r4[0]);
            r1 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.method + 47;
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.url = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
            r1 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.newBuilder + 59;
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.AGRequest$Builder = r1 % 128;
            r1 = r1 % 2;
            r3[0] = r7[r2];
            r15 = r2 + 1;
            r3[1] = r7[r15];
            r14 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.getMethod;
            r13 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.getHeaders;
            r12 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.AGRequest;
            r11 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.getBody;
            r10 = 58224;
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
            if (r9 < 16) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
            r0 = 'A';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
            if (r0 == 'A') goto L_0x00d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
            r1 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.url + 11;
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.method = r1 % 128;
            r1 = r1 % 2;
            r3[1] = (char) (r3[1] - (((r3[0] + r10) ^ ((r3[0] << 4) + r12)) ^ ((r3[0] >>> 5) + r11)));
            r3[0] = (char) (r3[0] - (((r3[1] + r10) ^ ((r3[1] << 4) + r14)) ^ ((r3[1] >>> 5) + r13)));
            r10 = (char) (r10 - 40503);
            r9 = r9 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
            r0 = '\b';
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d5, code lost:
            r4[r2] = r3[0];
            r4[r15] = r3[1];
            r2 = r2 + 2;
            r1 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.newBuilder + 17;
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.AGRequest$Builder = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ea, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
            r7 = r17.toCharArray();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
            if ((r1 / 3) != 0) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
            if ((r1 % 2) == 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
            r1 = r2 + 23;
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.method = r1 % 128;
            r1 = r1 % 2;
            r1 = com.apiguard3.internal.setSoundEffectsEnabled.getMethod.AGRequest$Builder + 37;
            com.apiguard3.internal.setSoundEffectsEnabled.getMethod.newBuilder = r1 % 128;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getMethod(java.lang.String r17) {
            /*
            // Method dump skipped, instructions count: 263
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setSoundEffectsEnabled.getMethod.getMethod(java.lang.String):java.lang.String");
        }
    }

    static int getUrl(long j2) {
        int i2 = getHeaders + 81;
        int i3 = i2 % 128;
        getBody = i3;
        int i4 = i2 % 2;
        int i5 = getMethod;
        boolean z = true;
        int i6 = (i5 ^ 19) + ((i5 & 19) << 1);
        AGRequest = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = i3 + 109;
            getHeaders = i7 % 128;
            int i8 = i7 % 2;
            z = false;
        }
        if (z) {
            int i9 = ((int) (j2 >> 32)) & 1437226410;
            int i10 = ((int) j2) & -1437226411;
            return (i10 & i9) | (i9 ^ i10);
        }
        int i11 = (int) j2;
        int i12 = (i11 ^ -1437226411) | (i11 & -1437226411) | (1437226410 & ((int) (j2 >> 26)));
        int i13 = i3 + 111;
        getHeaders = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0084, code lost:
        if (r6 < 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b0, code lost:
        if ((r1 >>> 5) == 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c1, code lost:
        if ((r1 % 2) != 0) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00db A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long getBody(long r6) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setSoundEffectsEnabled.getBody(long):long");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:9:0x0029 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0029 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getUrl(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setSoundEffectsEnabled.getUrl(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0087, code lost:
        if ((r1 % 2) != 0) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.apiguard3.internal.setLongClickable getUrl(int r11) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setSoundEffectsEnabled.getUrl(int):com.apiguard3.internal.setLongClickable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:16:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getUrl(java.lang.String... r10) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setSoundEffectsEnabled.getUrl(java.lang.String[]):boolean");
    }
}
