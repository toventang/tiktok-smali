package com.ss.lens.algorithm;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public class PictureOCLSR {
    private static boolean isLibLoaded;
    private long mNativePtr;
    private int maxHeight = 1080;
    private int maxWidth = 600;
    private int minHeight = 500;
    private int minWidth = 360;

    static {
        Covode.recordClassIndex(101102);
    }

    public static int com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    private native long nativeInitPictureOclSr(String str, int i2, int i3, int i4);

    private native int nativePictureOclSrProcess(long j2, Bitmap bitmap, Bitmap bitmap2);

    private native void nativeReleasePictureOclSr(long j2);

    public void ReleasePictureOclSr() {
        MethodCollector.i(6212);
        long j2 = this.mNativePtr;
        if (j2 == 0) {
            MethodCollector.o(6212);
            return;
        }
        nativeReleasePictureOclSr(j2);
        MethodCollector.o(6212);
    }

    public static void com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public synchronized boolean InitPictureOclSr(String str) {
        MethodCollector.i(6118);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
            try {
                com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(6118);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.o(6118);
            return false;
        }
        long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, 4);
        this.mNativePtr = nativeInitPictureOclSr;
        if (nativeInitPictureOclSr == 0) {
            MethodCollector.o(6118);
            return false;
        }
        MethodCollector.o(6118);
        return true;
    }

    public boolean IsSrSupport(Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.RGB_565) {
            com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d("vrsr_picture", "sr is not supported because input picture format is not support, only support format rgb_565");
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0 || height % 2 != 0) {
            com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d("vrsr_picture", "sr is not supported because input size h " + height + " w " + width + " is not support");
            return false;
        } else if (width >= this.minWidth && width <= this.maxWidth && height >= this.minHeight && height <= this.maxHeight) {
            return true;
        } else {
            com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d("vrsr_picture", "sr is not supported because input size h " + height + " w " + width + " is not support");
            return false;
        }
    }

    public synchronized boolean InitPictureOclSr(String str, int i2) {
        MethodCollector.i(6122);
        if (!isLibLoaded) {
            try {
                com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
            } catch (UnsatisfiedLinkError e2) {
                e2.printStackTrace();
            }
            try {
                com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                isLibLoaded = true;
            } catch (UnsatisfiedLinkError e3) {
                e3.printStackTrace();
                MethodCollector.o(6122);
                return false;
            }
        }
        if (str.isEmpty()) {
            MethodCollector.o(6122);
            return false;
        }
        long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i2);
        this.mNativePtr = nativeInitPictureOclSr;
        if (nativeInitPictureOclSr == 0) {
            MethodCollector.o(6122);
            return false;
        }
        MethodCollector.o(6122);
        return true;
    }

    public synchronized int PictureOclSrProcess(Bitmap bitmap, Bitmap bitmap2) {
        MethodCollector.i(6211);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0 || height % 2 != 0) {
            com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d("vrsr_picture", "sr process failed because input size h " + height + " w " + width + " is not support");
            MethodCollector.o(6211);
            return -1;
        } else if (width < this.minWidth || width > this.maxWidth || height < this.minHeight || height > this.maxHeight) {
            com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d("vrsr_picture", "sr is not supported because input size h " + height + " w " + width + " is not support");
            MethodCollector.o(6211);
            return -1;
        } else {
            int nativePictureOclSrProcess = nativePictureOclSrProcess(this.mNativePtr, bitmap, bitmap2);
            if (nativePictureOclSrProcess != 0) {
                com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LogLancet_d("vrsr_picture", "sr process failed with error code " + Integer.valueOf(nativePictureOclSrProcess).toString());
                MethodCollector.o(6211);
                return -1;
            }
            MethodCollector.o(6211);
            return 0;
        }
    }

    public synchronized boolean InitPictureOclSr(String str, int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.i(6181);
        if (i3 <= i4 && i5 <= i6 && i3 > 0) {
            if (i5 > 0) {
                if (!isLibLoaded) {
                    try {
                        com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("c++_shared");
                        com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("bytenn");
                    } catch (UnsatisfiedLinkError e2) {
                        e2.printStackTrace();
                    }
                    try {
                        com_ss_lens_algorithm_PictureOCLSR_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lens");
                        isLibLoaded = true;
                    } catch (UnsatisfiedLinkError e3) {
                        e3.printStackTrace();
                        MethodCollector.o(6181);
                        return false;
                    }
                }
                this.maxHeight = i6;
                this.minHeight = i5;
                this.maxWidth = i4;
                this.minWidth = i3;
                if (str.isEmpty()) {
                    MethodCollector.o(6181);
                    return false;
                }
                long nativeInitPictureOclSr = nativeInitPictureOclSr(str, this.maxHeight, this.maxWidth, i2);
                this.mNativePtr = nativeInitPictureOclSr;
                if (nativeInitPictureOclSr == 0) {
                    MethodCollector.o(6181);
                    return false;
                }
                MethodCollector.o(6181);
                return true;
            }
        }
        MethodCollector.o(6181);
        return false;
    }
}
