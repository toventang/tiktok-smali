package com.ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class AdaptiveSharpen {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101099);
    }

    private native int nativeAdaptiveSharpenProcess(long j2, int i2, int i3, int i4, float[] fArr, boolean z, int i5, float f2, float f3, float f4, int i6);

    private native int nativeGetAdaptiveSharpenOutput(long j2);

    private native long nativeInitAdaptiveSharpen(boolean z, int i2, int i3, int i4);

    private native void nativeReleaseAdaptiveSharpen(long j2);

    public int GetAdaptiveSharpenOutput() {
        MethodCollector.i(6879);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(6879);
            return -1;
        }
        int nativeGetAdaptiveSharpenOutput = nativeGetAdaptiveSharpenOutput(j2);
        MethodCollector.o(6879);
        return nativeGetAdaptiveSharpenOutput;
    }

    public void ReleaseAdaptiveSharpen() {
        MethodCollector.i(6880);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(6880);
            return;
        }
        nativeReleaseAdaptiveSharpen(j2);
        MethodCollector.o(6880);
    }

    public static void com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public synchronized boolean InitAdaptiveSharpen(boolean z, int i2, int i3, int i4) {
        MethodCollector.i(6753);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
            try {
                com_ss_lens_algorithm_AdaptiveSharpen_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(6753);
                return false;
            }
        }
        long nativeInitAdaptiveSharpen = nativeInitAdaptiveSharpen(z, i2, i3, i4);
        this.mNativePtr = nativeInitAdaptiveSharpen;
        if (nativeInitAdaptiveSharpen == 0) {
            MethodCollector.o(6753);
            return false;
        }
        MethodCollector.o(6753);
        return true;
    }

    public int AdaptiveSharpenProcess(int i2, int i3, int i4, boolean z, int i5, float f2, float f3, float f4, int i6) {
        MethodCollector.i(6760);
        long j2 = this.mNativePtr;
        if (j2 == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.o(6760);
            return -1;
        }
        int nativeAdaptiveSharpenProcess = nativeAdaptiveSharpenProcess(j2, i2, i3, i4, null, z, i5, f2, f3, f4, i6);
        MethodCollector.o(6760);
        return nativeAdaptiveSharpenProcess;
    }

    public int AdaptiveSharpenOesProcess(int i2, int i3, int i4, float[] fArr, boolean z, int i5, float f2, float f3, float f4, int i6) {
        MethodCollector.i(6757);
        long j2 = this.mNativePtr;
        if (j2 == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.o(6757);
            return -1;
        }
        int nativeAdaptiveSharpenProcess = nativeAdaptiveSharpenProcess(j2, i2, i3, i4, fArr, z, i5, f2, f3, f4, i6);
        MethodCollector.o(6757);
        return nativeAdaptiveSharpenProcess;
    }
}
