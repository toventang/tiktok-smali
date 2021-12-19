package com.bef.effectsdk;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.Arrays;
import java.util.List;

public class BEFEffectNative {
    private static final List<String> list;

    private static native long nativeCreateHandle(boolean z);

    private static native int nativeDestroyHandle(long j2);

    private static native String nativeGetEffectSDKVersion();

    private static native int nativeInitResourceFinder(long j2, ResourceFinder resourceFinder, int i2, int i3, String str);

    private static native int nativeProcessAlgorithm(long j2, int i2, int i3, int i4, double d2);

    private static native int nativeProcessFrame(long j2, int i2, int i3, int i4, int i5, double d2);

    private static native int nativeReleaseResourceFinder(long j2, ResourceFinder resourceFinder);

    private static native int nativeSendMessage(long j2, long j3, long j4, long j5, String str);

    private static native void nativeSetCameraPosition(long j2, boolean z);

    private static native void nativeSetFrameOrientation(long j2, int i2);

    private static native void nativeSetOrientation(long j2, int i2);

    private static native int nativeSetStickerPath(long j2, String str);

    private static native int nativeTouchEvent(long j2, int i2, int[] iArr, float[] fArr, float[] fArr2);

    public static String getEffectSDKVersion() {
        MethodCollector.i(680);
        String nativeGetEffectSDKVersion = nativeGetEffectSDKVersion();
        MethodCollector.o(680);
        return nativeGetEffectSDKVersion;
    }

    static {
        Covode.recordClassIndex(2826);
        List<String> asList = Arrays.asList("effect");
        list = asList;
        try {
            for (String str : asList) {
                com_bef_effectsdk_BEFEffectNative_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void com_bef_effectsdk_BEFEffectNative_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static long createHandle(boolean z) {
        MethodCollector.i(682);
        long nativeCreateHandle = nativeCreateHandle(z);
        MethodCollector.o(682);
        return nativeCreateHandle;
    }

    public static int destroyHandle(long j2) {
        MethodCollector.i(685);
        int nativeDestroyHandle = nativeDestroyHandle(j2);
        MethodCollector.o(685);
        return nativeDestroyHandle;
    }

    public static int releaseResourceFinder(long j2, ResourceFinder resourceFinder) {
        MethodCollector.i(704);
        int nativeReleaseResourceFinder = nativeReleaseResourceFinder(j2, resourceFinder);
        MethodCollector.o(704);
        return nativeReleaseResourceFinder;
    }

    public static void setCameraPosition(long j2, boolean z) {
        MethodCollector.i(709);
        nativeSetCameraPosition(j2, z);
        MethodCollector.o(709);
    }

    public static void setFrameOrientation(long j2, int i2) {
        MethodCollector.i(713);
        nativeSetFrameOrientation(j2, i2);
        MethodCollector.o(713);
    }

    public static void setOrientation(long j2, int i2) {
        MethodCollector.i(711);
        nativeSetOrientation(j2, i2);
        MethodCollector.o(711);
    }

    public static int setStickerPath(long j2, String str) {
        MethodCollector.i(705);
        int nativeSetStickerPath = nativeSetStickerPath(j2, str);
        MethodCollector.o(705);
        return nativeSetStickerPath;
    }

    public static int touchBeginEvent(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(714);
        int nativeTouchEvent = nativeTouchEvent(j2, 0, iArr, fArr, fArr2);
        MethodCollector.o(714);
        return nativeTouchEvent;
    }

    public static int touchEndEvent(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(718);
        int nativeTouchEvent = nativeTouchEvent(j2, 2, iArr, fArr, fArr2);
        MethodCollector.o(718);
        return nativeTouchEvent;
    }

    public static int touchMoveEvent(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(715);
        int nativeTouchEvent = nativeTouchEvent(j2, 1, iArr, fArr, fArr2);
        MethodCollector.o(715);
        return nativeTouchEvent;
    }

    public static int initResourceFinder(long j2, ResourceFinder resourceFinder, int i2, int i3, String str) {
        MethodCollector.i(686);
        int nativeInitResourceFinder = nativeInitResourceFinder(j2, resourceFinder, i2, i3, str);
        MethodCollector.o(686);
        return nativeInitResourceFinder;
    }

    public static int processAlgorithm(long j2, int i2, int i3, int i4, double d2) {
        MethodCollector.i(706);
        int nativeProcessAlgorithm = nativeProcessAlgorithm(j2, i2, i3, i4, d2);
        MethodCollector.o(706);
        return nativeProcessAlgorithm;
    }

    public static int sendMessage(long j2, long j3, long j4, long j5, String str) {
        MethodCollector.i(708);
        int nativeSendMessage = nativeSendMessage(j2, j3, j4, j5, str);
        MethodCollector.o(708);
        return nativeSendMessage;
    }

    public static int processFrame(long j2, int i2, int i3, int i4, int i5, double d2) {
        MethodCollector.i(707);
        int nativeProcessFrame = nativeProcessFrame(j2, i2, i3, i4, i5, d2);
        MethodCollector.o(707);
        return nativeProcessFrame;
    }
}
