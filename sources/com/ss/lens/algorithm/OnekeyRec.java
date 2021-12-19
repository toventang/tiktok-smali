package com.ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class OnekeyRec {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101101);
    }

    private native int nativeGetOnekeyRecOutput(long j2);

    private native long nativeInitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3);

    private native int nativeOnekeyRecProcess(long j2, int i2, int i3, int i4, float[] fArr, boolean z);

    private native void nativeReleaseOnekeyRec(long j2);

    public int GetOnekeyRecOutput() {
        MethodCollector.i(5928);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(5928);
            return -1;
        }
        int nativeGetOnekeyRecOutput = nativeGetOnekeyRecOutput(j2);
        MethodCollector.o(5928);
        return nativeGetOnekeyRecOutput;
    }

    public void ReleaseOnekeyRec() {
        MethodCollector.i(5929);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(5929);
            return;
        }
        nativeReleaseOnekeyRec(j2);
        MethodCollector.o(5929);
    }

    public static void com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public int OnekeyRecProcess(int i2, int i3, int i4, float[] fArr, boolean z) {
        MethodCollector.i(5927);
        long j2 = this.mNativePtr;
        if (j2 == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.o(5927);
            return -1;
        }
        int nativeOnekeyRecProcess = nativeOnekeyRecProcess(j2, i2, i3, i4, fArr, z);
        MethodCollector.o(5927);
        return nativeOnekeyRecProcess;
    }

    public synchronized boolean InitOnekeyRec(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, int i3) {
        MethodCollector.i(5923);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
            try {
                com_ss_lens_algorithm_OnekeyRec_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(5923);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.o(5923);
            return false;
        }
        long nativeInitOnekeyRec = nativeInitOnekeyRec(str, z, z2, z3, z4, z5, z6, i2, i3);
        this.mNativePtr = nativeInitOnekeyRec;
        if (nativeInitOnekeyRec == 0) {
            MethodCollector.o(5923);
            return false;
        }
        MethodCollector.o(5923);
        return true;
    }
}
