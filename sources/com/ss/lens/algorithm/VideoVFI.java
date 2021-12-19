package com.ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class VideoVFI {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101105);
    }

    private native int nativeGetVideoVFIOutput(long j2);

    private native long nativeInitVideoVFI(String str, int i2, int i3, int i4, boolean z);

    private native void nativeReleaseVideoVFI(long j2);

    private native int nativeVideoVFIOesProcess(long j2, int i2, int i3, int i4, int i5, int i6, float f2, float[] fArr, boolean z);

    private native int nativeVideoVFIProcess(long j2, int i2, int i3, int i4, int i5, int i6, float f2, boolean z);

    public int GetVideoVFIOutput() {
        MethodCollector.i(5614);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(5614);
            return -1;
        }
        int nativeGetVideoVFIOutput = nativeGetVideoVFIOutput(j2);
        MethodCollector.o(5614);
        return nativeGetVideoVFIOutput;
    }

    public void ReleaseVideoVFI() {
        MethodCollector.i(5762);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(5762);
            return;
        }
        nativeReleaseVideoVFI(j2);
        MethodCollector.o(5762);
    }

    public static void com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public synchronized boolean InitVideoVFI(String str, int i2, int i3, int i4, boolean z) {
        MethodCollector.i(5515);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                try {
                    com_ss_lens_algorithm_VideoVFI_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                    isLibLoaded = true;
                } catch (UnsatisfiedLinkError e2) {
                    e2.printStackTrace();
                    MethodCollector.o(5515);
                    return false;
                }
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(5515);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.o(5515);
            return false;
        }
        long nativeInitVideoVFI = nativeInitVideoVFI(str, i2, i3, i4, z);
        this.mNativePtr = nativeInitVideoVFI;
        if (nativeInitVideoVFI == 0) {
            MethodCollector.o(5515);
            return false;
        }
        MethodCollector.o(5515);
        return true;
    }

    public int VideoVFIProcess(int i2, int i3, int i4, int i5, int i6, float f2, boolean z) {
        MethodCollector.i(5526);
        long j2 = this.mNativePtr;
        if (j2 == 0 || i4 <= 0 || i5 <= 0) {
            MethodCollector.o(5526);
            return -1;
        }
        int nativeVideoVFIProcess = nativeVideoVFIProcess(j2, i2, i3, i4, i5, i6, f2, z);
        MethodCollector.o(5526);
        return nativeVideoVFIProcess;
    }

    public int VideoVFIOesProcess(int i2, int i3, int i4, int i5, int i6, float f2, float[] fArr, boolean z) {
        MethodCollector.i(5524);
        long j2 = this.mNativePtr;
        if (j2 == 0 || i4 <= 0 || i5 <= 0) {
            MethodCollector.o(5524);
            return -1;
        }
        int nativeVideoVFIOesProcess = nativeVideoVFIOesProcess(j2, i2, i3, i4, i5, i6, f2, fArr, z);
        MethodCollector.o(5524);
        return nativeVideoVFIOesProcess;
    }
}
