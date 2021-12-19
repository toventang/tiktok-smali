package com.ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class VideoNNSR {
    private long mNativePtr;

    private native int nativeGetVideoNNSrOutput(long j2);

    private native long nativeInitVideoNNSr(int i2, int i3, String str, String str2, String str3, boolean z);

    private native void nativeReleaseVideoNNSr(long j2);

    private native int nativeVideoNNSrOesProcess(long j2, int i2, float[] fArr, boolean z);

    private native int nativeVideoNNSrProcess(long j2, int i2, boolean z);

    static {
        Covode.recordClassIndex(101103);
        try {
            com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }

    public int GetVideoNNSrOutput() {
        MethodCollector.i(6706);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(6706);
            return -1;
        }
        int nativeGetVideoNNSrOutput = nativeGetVideoNNSrOutput(j2);
        MethodCollector.o(6706);
        return nativeGetVideoNNSrOutput;
    }

    public void ReleaseVideoNNSr() {
        MethodCollector.i(6708);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(6708);
            return;
        }
        nativeReleaseVideoNNSr(j2);
        MethodCollector.o(6708);
    }

    public static void com_ss_lens_algorithm_VideoNNSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public int VideoNNSrProcess(int i2, boolean z) {
        MethodCollector.i(6703);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(6703);
            return -1;
        }
        int nativeVideoNNSrProcess = nativeVideoNNSrProcess(j2, i2, z);
        MethodCollector.o(6703);
        return nativeVideoNNSrProcess;
    }

    public int VideoNNSrOesProcess(int i2, float[] fArr, boolean z) {
        MethodCollector.i(6632);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(6632);
            return -1;
        }
        int nativeVideoNNSrOesProcess = nativeVideoNNSrOesProcess(j2, i2, fArr, z);
        MethodCollector.o(6632);
        return nativeVideoNNSrOesProcess;
    }

    public boolean InitVideoNNSr(int i2, int i3, String str, String str2, String str3, boolean z) {
        MethodCollector.i(6629);
        if (i2 <= 0 || i3 <= 0 || str.isEmpty() || str2.isEmpty() || str3.isEmpty()) {
            MethodCollector.o(6629);
            return false;
        }
        long nativeInitVideoNNSr = nativeInitVideoNNSr(i2, i3, str, str2, str3, z);
        this.mNativePtr = nativeInitVideoNNSr;
        if (nativeInitVideoNNSr == 0) {
            MethodCollector.o(6629);
            return false;
        }
        MethodCollector.o(6629);
        return true;
    }
}
