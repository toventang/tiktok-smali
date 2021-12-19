package com.ss.lens.algorithm;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class VideoOCLSR {
    private static boolean isLibLoaded;
    private long mNativePtr;

    static {
        Covode.recordClassIndex(101104);
    }

    private native int nativeGetVideoOclSrOutput(long j2);

    private native long nativeInitVideoOclSr(String str, int i2, boolean z, boolean z2, int i3, int i4);

    private native void nativeReleaseVideoOclSr(long j2);

    private native int nativeVideoOclSrOesProcess(long j2, int i2, int i3, int i4, float[] fArr, boolean z);

    private native int nativeVideoOclSrProcess(long j2, int i2, int i3, int i4, boolean z);

    public int GetVideoOclSrOutput() {
        MethodCollector.i(5804);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(5804);
            return -1;
        }
        int nativeGetVideoOclSrOutput = nativeGetVideoOclSrOutput(j2);
        MethodCollector.o(5804);
        return nativeGetVideoOclSrOutput;
    }

    public void ReleaseVideoOclSr() {
        MethodCollector.i(5851);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(5851);
            return;
        }
        nativeReleaseVideoOclSr(j2);
        MethodCollector.o(5851);
    }

    public static void com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public synchronized boolean InitVideoOclSr(String str, int i2, boolean z) {
        MethodCollector.i(5588);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
            try {
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(5588);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.o(5588);
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i2, z, true, 720, 1440);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr == 0) {
            MethodCollector.o(5588);
            return false;
        }
        MethodCollector.o(5588);
        return true;
    }

    public int VideoOclSrProcess(int i2, int i3, int i4, boolean z) {
        MethodCollector.i(5801);
        long j2 = this.mNativePtr;
        if (j2 == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.o(5801);
            return -1;
        }
        int nativeVideoOclSrProcess = nativeVideoOclSrProcess(j2, i2, i3, i4, z);
        MethodCollector.o(5801);
        return nativeVideoOclSrProcess;
    }

    public int VideoOclSrOesProcess(int i2, int i3, int i4, float[] fArr, boolean z) {
        MethodCollector.i(5799);
        long j2 = this.mNativePtr;
        if (j2 == 0 || i3 <= 0 || i4 <= 0) {
            MethodCollector.o(5799);
            return -1;
        }
        int nativeVideoOclSrOesProcess = nativeVideoOclSrOesProcess(j2, i2, i3, i4, fArr, z);
        MethodCollector.o(5799);
        return nativeVideoOclSrOesProcess;
    }

    public synchronized boolean InitVideoOclSr(String str, int i2, boolean z, int i3, int i4) {
        MethodCollector.i(5695);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
            try {
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(5695);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.o(5695);
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i2, z, true, i3, i4);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr == 0) {
            MethodCollector.o(5695);
            return false;
        }
        MethodCollector.o(5695);
        return true;
    }

    public synchronized boolean InitVideoOclSr(String str, int i2, boolean z, boolean z2, int i3, int i4) {
        MethodCollector.i(5698);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
            try {
                com_ss_lens_algorithm_VideoOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(5698);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.o(5698);
            return false;
        }
        long nativeInitVideoOclSr = nativeInitVideoOclSr(str, i2, z, z2, i3, i4);
        this.mNativePtr = nativeInitVideoOclSr;
        if (nativeInitVideoOclSr == 0) {
            MethodCollector.o(5698);
            return false;
        }
        MethodCollector.o(5698);
        return true;
    }
}
