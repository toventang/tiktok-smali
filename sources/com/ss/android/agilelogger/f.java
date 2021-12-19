package com.ss.android.agilelogger;

import android.os.Looper;
import com.bytedance.covode.number.Covode;

public final class f {
    static {
        Covode.recordClassIndex(36557);
    }

    public static boolean a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|12|(2:14|(4:16|17|18|20))|(2:34|35)|36|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = new java.io.BufferedReader(new java.io.FileReader("/proc/self/cmdline"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1 = r2.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r1 = r1.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2433);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r2 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2433);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r2 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(2433);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[SYNTHETIC, Splitter:B:25:0x0060] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.f.b():java.lang.String");
    }
}
