package com.bytedance.crash.util;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.m;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.nativecrash.g;
import com.bytedance.crash.runtime.b;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NativeTools {

    /* renamed from: b  reason: collision with root package name */
    public static HashMap<String, String> f27972b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static NativeTools f27973c;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f27974a;

    private static native void doSetNpthCatchAddr(long j2);

    private static native int nativeAnrDump(String str);

    private static native int nativeAnrMonitorInit();

    private static native int nativeAnrMonitorLoop();

    private static native int nativeCloseFile(int i2);

    private static native int nativeDumpCrashInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z);

    private static native int nativeDumpLogcat(String str, String str2);

    private static native int nativeDumpPthreadList(String str, String str2);

    private static native int nativeDumpThrowable(String str, Throwable th);

    private static native int nativeFillNativeHeapSize(NativeHeapSize nativeHeapSize);

    private static native String nativeGetBuildID(String str);

    private static native int nativeGetFDCount();

    private static native String[] nativeGetFdListForAPM();

    private static native int nativeGetMapsSize(String str);

    private static native String nativeGetOOMReason(String str, String str2);

    public static native long nativeGetPathSize(String str, int i2);

    private static native int nativeGetResendSigquit();

    private static native long nativeGetSymbolAddress(String str, String str2, int i2);

    private static native long nativeGetThreadCpuTimeMills(int i2);

    private static native int nativeGetThreadInfoFromTombStone(String str, String str2);

    private static native boolean nativeIs64BitLibrary();

    private static native int nativeLockFile(String str);

    private static native int nativeOpenFile(String str);

    private static native boolean nativePidExists(int i2);

    private static native void nativeSetMallocInfoFunctionAddress(long j2);

    private static native void nativeSetResendSigquit(int i2);

    private static native int nativeTerminateMonitorWait(long j2, String str, String str2, String str3, boolean z, boolean z2, boolean z3);

    private static native int nativeToolsInit(int i2, String str);

    private static native int nativeUnlockFile(int i2);

    private static native int nativeUpdateEspInfoFromTombStone(String str, String str2);

    private static native int nativeWriteFile(int i2, String str, int i3);

    private static void onClearExcept(int[] iArr) {
    }

    private static void onStartAllClear() {
        g.e();
    }

    public final void a(boolean z) {
        MethodCollector.i(7726);
        if (!this.f27974a) {
            MethodCollector.o(7726);
            return;
        }
        try {
            nativeSetResendSigquit(z ? 1 : 0);
            MethodCollector.o(7726);
        } catch (Throwable unused) {
            MethodCollector.o(7726);
        }
    }

    static {
        Covode.recordClassIndex(16366);
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT < 21 || Header.b()) {
            return false;
        }
        return true;
    }

    private static void onProcessBeWorker() {
        b.c(m.f27724a);
        m.f27730g.isDebugMode();
        g.d();
    }

    public final int b() {
        MethodCollector.i(7507);
        if (!this.f27974a) {
            MethodCollector.o(7507);
            return -1;
        }
        try {
            int nativeGetFDCount = nativeGetFDCount();
            MethodCollector.o(7507);
            return nativeGetFDCount;
        } catch (Throwable unused) {
            MethodCollector.o(7507);
            return -1;
        }
    }

    public final int e() {
        MethodCollector.i(7655);
        if (!this.f27974a) {
            MethodCollector.o(7655);
            return -1;
        }
        try {
            int nativeAnrMonitorInit = nativeAnrMonitorInit();
            MethodCollector.o(7655);
            return nativeAnrMonitorInit;
        } catch (Throwable unused) {
            MethodCollector.o(7655);
            return -1;
        }
    }

    public final int f() {
        MethodCollector.i(7723);
        if (!this.f27974a) {
            MethodCollector.o(7723);
            return -1;
        }
        try {
            int nativeAnrMonitorLoop = nativeAnrMonitorLoop();
            MethodCollector.o(7723);
            return nativeAnrMonitorLoop;
        } catch (Throwable unused) {
            MethodCollector.o(7723);
            return -1;
        }
    }

    public class NativeHeapSize {
        public long allocate;
        public long free;
        public long total;

        static {
            Covode.recordClassIndex(16368);
        }

        public void print() {
            v.a("NativeHeapSize.total = " + this.total);
            v.a("NativeHeapSize.allocate = " + this.allocate);
            v.a("NativeHeapSize.free = " + this.free);
        }

        public NativeHeapSize() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        com.bytedance.librarian.Librarian.b("npth_tools", true, com.bytedance.crash.m.f27724a);
        r6.f27974a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private NativeTools() {
        /*
            r6 = this;
            java.lang.String r5 = "npth_tools"
            r6.<init>()
            boolean r0 = r6.f27974a
            if (r0 != 0) goto L_0x0027
            r4 = 1
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0020 }
            r1 = 0
            r0 = 0
            com.bytedance.librarian.Librarian.b(r5, r1, r0)     // Catch:{ all -> 0x0020 }
            com.ss.android.ugc.aweme.lancet.m.a(r2, r5)     // Catch:{ all -> 0x0020 }
            r6.f27974a = r4     // Catch:{ all -> 0x0020 }
            com.bytedance.crash.util.NativeTools$1 r0 = new com.bytedance.crash.util.NativeTools$1     // Catch:{ all -> 0x0020 }
            r0.<init>()     // Catch:{ all -> 0x0020 }
            com.bytedance.crash.util.s.f28019a = r0     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            android.content.Context r0 = com.bytedance.crash.m.f27724a     // Catch:{ all -> 0x0027 }
            com.bytedance.librarian.Librarian.b(r5, r4, r0)     // Catch:{ all -> 0x0027 }
            r6.f27974a = r4     // Catch:{ all -> 0x0027 }
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.NativeTools.<init>():void");
    }

    public final boolean g() {
        MethodCollector.i(7735);
        if (!this.f27974a) {
            MethodCollector.o(7735);
            return false;
        }
        try {
            if (nativeGetResendSigquit() != 0) {
                MethodCollector.o(7735);
                return true;
            }
            MethodCollector.o(7735);
            return false;
        } catch (Throwable unused) {
            MethodCollector.o(7735);
            return false;
        }
    }

    public static NativeTools a() {
        long j2;
        MethodCollector.i(7097);
        if (f27973c == null) {
            synchronized (NativeTools.class) {
                try {
                    if (f27973c == null) {
                        NativeTools nativeTools = new NativeTools();
                        f27973c = nativeTools;
                        try {
                            if (nativeTools.f27974a) {
                                nativeToolsInit(Build.VERSION.SDK_INT, NativeImpl.b(m.f27724a));
                                if (!NativeImpl.f27758a) {
                                    j2 = 0;
                                } else {
                                    j2 = NativeImpl.doGetNpthCatchAddr();
                                }
                                doSetNpthCatchAddr(j2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7097);
                    throw th;
                }
            }
        }
        NativeTools nativeTools2 = f27973c;
        MethodCollector.o(7097);
        return nativeTools2;
    }

    public final List<String> d() {
        MethodCollector.i(7652);
        if (!this.f27974a) {
            MethodCollector.o(7652);
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String[] nativeGetFdListForAPM = nativeGetFdListForAPM();
            if (nativeGetFdListForAPM != null) {
                arrayList.addAll(Arrays.asList(nativeGetFdListForAPM));
            }
            MethodCollector.o(7652);
            return arrayList;
        } catch (Throwable unused) {
            MethodCollector.o(7652);
            return null;
        }
    }

    public final boolean c() {
        MethodCollector.i(7509);
        if (!this.f27974a) {
            MethodCollector.o(7509);
            return false;
        }
        try {
            boolean nativeIs64BitLibrary = nativeIs64BitLibrary();
            MethodCollector.o(7509);
            return nativeIs64BitLibrary;
        } catch (Throwable unused) {
            MethodCollector.o(7509);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0094, code lost:
        com.bytedance.crash.runtime.n.b().b(com.bytedance.crash.b.g.f27490j);
        com.bytedance.crash.b.g.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        monitor-enter(com.bytedance.crash.b.g.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        com.bytedance.crash.b.g.f27487g = false;
        com.bytedance.crash.b.g.class.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        monitor-exit(com.bytedance.crash.b.g.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ae, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(8038);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        com.bytedance.crash.runtime.n.b().a(com.bytedance.crash.b.g.f27490j, 35000);
        com.bytedance.crash.runtime.n.b().a(new com.bytedance.crash.b.g.AnonymousClass4(), com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void reportEventForAnrMonitor() {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.NativeTools.reportEventForAnrMonitor():void");
    }

    public static String g(String str) {
        MethodCollector.i(7810);
        try {
            String nativeGetBuildID = nativeGetBuildID(str);
            MethodCollector.o(7810);
            return nativeGetBuildID;
        } catch (Throwable unused) {
            MethodCollector.o(7810);
            return null;
        }
    }

    public final int c(String str) {
        MethodCollector.i(7166);
        if (!this.f27974a) {
            MethodCollector.o(7166);
            return -1;
        }
        try {
            int nativeOpenFile = nativeOpenFile(str);
            MethodCollector.o(7166);
            return nativeOpenFile;
        } catch (Throwable unused) {
            MethodCollector.o(7166);
            return -1;
        }
    }

    public final int d(String str) {
        MethodCollector.i(7374);
        if (!this.f27974a) {
            MethodCollector.o(7374);
            return -1;
        }
        try {
            int nativeLockFile = nativeLockFile(str);
            MethodCollector.o(7374);
            return nativeLockFile;
        } catch (Throwable unused) {
            MethodCollector.o(7374);
            return -1;
        }
    }

    public void setMallocInfoFunc(long j2) {
        MethodCollector.i(7989);
        if (!this.f27974a) {
            MethodCollector.o(7989);
            return;
        }
        try {
            nativeSetMallocInfoFunctionAddress(j2);
            MethodCollector.o(7989);
        } catch (Throwable unused) {
            MethodCollector.o(7989);
        }
    }

    public final int a(int i2) {
        MethodCollector.i(7309);
        if (!this.f27974a) {
            MethodCollector.o(7309);
            return -1;
        }
        try {
            int nativeCloseFile = nativeCloseFile(i2);
            MethodCollector.o(7309);
            return nativeCloseFile;
        } catch (Throwable unused) {
            MethodCollector.o(7309);
            return -1;
        }
    }

    public final int b(int i2) {
        MethodCollector.i(7439);
        if (!this.f27974a) {
            MethodCollector.o(7439);
            return -1;
        }
        try {
            int nativeUnlockFile = nativeUnlockFile(i2);
            MethodCollector.o(7439);
            return nativeUnlockFile;
        } catch (Throwable unused) {
            MethodCollector.o(7439);
            return -1;
        }
    }

    public final long c(int i2) {
        MethodCollector.i(7554);
        if (!this.f27974a) {
            MethodCollector.o(7554);
            return -1;
        }
        try {
            long nativeGetThreadCpuTimeMills = nativeGetThreadCpuTimeMills(i2);
            MethodCollector.o(7554);
            return nativeGetThreadCpuTimeMills;
        } catch (Throwable unused) {
            MethodCollector.o(7554);
            return 0;
        }
    }

    public final int b(String str) {
        MethodCollector.i(7164);
        if (!this.f27974a) {
            MethodCollector.o(7164);
            return -1;
        }
        try {
            int nativeDumpCrashInfo = nativeDumpCrashInfo(null, null, null, null, null, str, null, false);
            MethodCollector.o(7164);
            return nativeDumpCrashInfo;
        } catch (Throwable unused) {
            MethodCollector.o(7164);
            return -1;
        }
    }

    public final boolean e(String str) {
        MethodCollector.i(7737);
        if (!this.f27974a) {
            MethodCollector.o(7737);
            return false;
        }
        try {
            nativeAnrDump(str);
            MethodCollector.o(7737);
            return true;
        } catch (Throwable unused) {
            MethodCollector.o(7737);
            return false;
        }
    }

    public static String f(String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            return sb.toString();
        }
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable unused) {
        }
        return sb.toString().toUpperCase();
    }

    public final boolean d(int i2) {
        MethodCollector.i(7917);
        if (!this.f27974a) {
            MethodCollector.o(7917);
            return false;
        }
        try {
            boolean nativePidExists = nativePidExists(i2);
            MethodCollector.o(7917);
            return nativePidExists;
        } catch (Throwable unused) {
            MethodCollector.o(7917);
            return false;
        }
    }

    public final int a(String str) {
        MethodCollector.i(7159);
        if (!this.f27974a) {
            MethodCollector.o(7159);
            return -1;
        }
        try {
            int nativeDumpCrashInfo = nativeDumpCrashInfo(null, null, null, null, null, null, str, false);
            MethodCollector.o(7159);
            return nativeDumpCrashInfo;
        } catch (Throwable unused) {
            MethodCollector.o(7159);
            return -1;
        }
    }

    private static void onFindOneDied(int i2, String str) {
        g.a(i2, str);
    }

    public final int d(String str, String str2) {
        MethodCollector.i(7873);
        if (!this.f27974a) {
            MethodCollector.o(7873);
            return -1;
        }
        try {
            int nativeGetThreadInfoFromTombStone = nativeGetThreadInfoFromTombStone(str, str2);
            MethodCollector.o(7873);
            return nativeGetThreadInfoFromTombStone;
        } catch (Throwable unused) {
            MethodCollector.o(7873);
            return -1;
        }
    }

    public final int e(String str, String str2) {
        MethodCollector.i(7921);
        if (!this.f27974a) {
            MethodCollector.o(7921);
            return -1;
        }
        try {
            int nativeUpdateEspInfoFromTombStone = nativeUpdateEspInfoFromTombStone(str, str2);
            MethodCollector.o(7921);
            return nativeUpdateEspInfoFromTombStone;
        } catch (Throwable unused) {
            MethodCollector.o(7921);
            return -1;
        }
    }

    public final String c(String str, String str2) {
        MethodCollector.i(7871);
        if (!this.f27974a) {
            MethodCollector.o(7871);
            return "UNKNOWN";
        }
        try {
            String nativeGetOOMReason = nativeGetOOMReason(str, str2);
            if (nativeGetOOMReason == null) {
                MethodCollector.o(7871);
                return "UNKNOWN";
            }
            MethodCollector.o(7871);
            return nativeGetOOMReason;
        } catch (Throwable unused) {
            MethodCollector.o(7871);
            return "UNKNOWN";
        }
    }

    public final int a(int i2, String str) {
        MethodCollector.i(7218);
        if (!this.f27974a) {
            MethodCollector.o(7218);
            return -1;
        }
        try {
            int nativeWriteFile = nativeWriteFile(i2, str, str.length());
            MethodCollector.o(7218);
            return nativeWriteFile;
        } catch (Throwable unused) {
            MethodCollector.o(7218);
            return -1;
        }
    }

    public final void b(String str, String str2) {
        MethodCollector.i(7862);
        if (!this.f27974a) {
            MethodCollector.o(7862);
            return;
        }
        try {
            nativeDumpPthreadList(str, str2);
            MethodCollector.o(7862);
        } catch (Throwable unused) {
            MethodCollector.o(7862);
        }
    }

    public final int a(String str, String str2) {
        MethodCollector.i(7162);
        if (!this.f27974a) {
            MethodCollector.o(7162);
            return -1;
        }
        try {
            int nativeDumpLogcat = nativeDumpLogcat(str, str2);
            MethodCollector.o(7162);
            return nativeDumpLogcat;
        } catch (Throwable unused) {
            MethodCollector.o(7162);
            return -1;
        }
    }

    public long getSymbolAddress(String str, String str2, boolean z) {
        int i2;
        MethodCollector.i(7987);
        if (!this.f27974a) {
            MethodCollector.o(7987);
            return -1;
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            long nativeGetSymbolAddress = nativeGetSymbolAddress(str, str2, i2);
            MethodCollector.o(7987);
            return nativeGetSymbolAddress;
        } catch (Throwable unused) {
            MethodCollector.o(7987);
            return 0;
        }
    }

    public final int a(long j2, String str, String str2) {
        boolean z;
        boolean z2;
        MethodCollector.i(7868);
        if (!this.f27974a) {
            MethodCollector.o(7868);
            return -1;
        }
        try {
            String c2 = b.c(m.f27724a);
            boolean b2 = b.b(m.f27724a);
            if (b.a("custom_event_settings", "npth_simple_setting", "disable_kill_history_data") == 1) {
                z = false;
            } else {
                z = true;
            }
            if (b.a("custom_event_settings", "npth_simple_setting", "disable_kill_history_subprocess") == 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            int nativeTerminateMonitorWait = nativeTerminateMonitorWait(j2, str, str2, c2, b2, z, z2);
            MethodCollector.o(7868);
            return nativeTerminateMonitorWait;
        } catch (Throwable unused) {
            m.f27730g.isDebugMode();
            MethodCollector.o(7868);
            return -1;
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        MethodCollector.i(7099);
        nativeDumpCrashInfo(str, str2, str3, str4, str5, null, null, false);
        MethodCollector.o(7099);
    }
}
