package com.bef.effectsdk.game;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.Arrays;
import java.util.List;

public class NativeInterface {
    private static final List<String> list;

    interface NativeMessageListener {
        static {
            Covode.recordClassIndex(2885);
        }

        int nativeOnMsgReceived(long j2, long j3, long j4, String str);
    }

    private static native int nativeAddMessageListener(long j2, NativeMessageListener nativeMessageListener);

    private static native void nativeCreateHandle(long[] jArr);

    private static native int nativeDestroy(long j2);

    private static native int nativeInit(long j2, int i2, int i3);

    private static native int nativePause(long j2);

    private static native int nativePostMessage(long j2, long j3, long j4, long j5, String str);

    private static native int nativeProcess(long j2, int i2, int i3, double d2);

    private static native int nativeRemoveMessageListener(long j2, NativeMessageListener nativeMessageListener);

    private static native int nativeResume(long j2);

    private static native int nativeSetSize(long j2, int i2, int i3);

    private static native int nativeSetStickerPath(long j2, String str);

    private static native int nativeTouchesBegin(long j2, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesEnd(long j2, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesMove(long j2, int[] iArr, float[] fArr, float[] fArr2);

    static {
        Covode.recordClassIndex(2884);
        List<String> asList = Arrays.asList("effect");
        list = asList;
        try {
            for (String str : asList) {
                com_bef_effectsdk_game_NativeInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void com_bef_effectsdk_game_NativeInterface_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static void createHandle(long[] jArr) {
        MethodCollector.i(1408);
        nativeCreateHandle(jArr);
        MethodCollector.o(1408);
    }

    public static int destroy(long j2) {
        MethodCollector.i(1416);
        int nativeDestroy = nativeDestroy(j2);
        MethodCollector.o(1416);
        return nativeDestroy;
    }

    public static int pause(long j2) {
        MethodCollector.i(1414);
        int nativePause = nativePause(j2);
        MethodCollector.o(1414);
        return nativePause;
    }

    public static int resume(long j2) {
        MethodCollector.i(1415);
        int nativeResume = nativeResume(j2);
        MethodCollector.o(1415);
        return nativeResume;
    }

    public static int addMessageListener(long j2, NativeMessageListener nativeMessageListener) {
        MethodCollector.i(1422);
        int nativeAddMessageListener = nativeAddMessageListener(j2, nativeMessageListener);
        MethodCollector.o(1422);
        return nativeAddMessageListener;
    }

    public static int removeMessageListener(long j2, NativeMessageListener nativeMessageListener) {
        MethodCollector.i(1423);
        int nativeRemoveMessageListener = nativeRemoveMessageListener(j2, nativeMessageListener);
        MethodCollector.o(1423);
        return nativeRemoveMessageListener;
    }

    public static int setGameBundlePath(long j2, String str) {
        MethodCollector.i(1411);
        int nativeSetStickerPath = nativeSetStickerPath(j2, str);
        MethodCollector.o(1411);
        return nativeSetStickerPath;
    }

    public static int init(long j2, int i2, int i3) {
        MethodCollector.i(1410);
        int nativeInit = nativeInit(j2, i2, i3);
        MethodCollector.o(1410);
        return nativeInit;
    }

    public static int setSize(long j2, int i2, int i3) {
        MethodCollector.i(1412);
        int nativeSetSize = nativeSetSize(j2, i2, i3);
        MethodCollector.o(1412);
        return nativeSetSize;
    }

    public static int processFrame(long j2, int i2, int i3, double d2) {
        MethodCollector.i(1413);
        int nativeProcess = nativeProcess(j2, i2, i3, d2);
        MethodCollector.o(1413);
        return nativeProcess;
    }

    public static int touchesBegin(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(1417);
        int nativeTouchesBegin = nativeTouchesBegin(j2, iArr, fArr, fArr2);
        MethodCollector.o(1417);
        return nativeTouchesBegin;
    }

    public static int touchesEnd(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(1420);
        int nativeTouchesEnd = nativeTouchesEnd(j2, iArr, fArr, fArr2);
        MethodCollector.o(1420);
        return nativeTouchesEnd;
    }

    public static int touchesMove(long j2, int[] iArr, float[] fArr, float[] fArr2) {
        MethodCollector.i(1419);
        int nativeTouchesMove = nativeTouchesMove(j2, iArr, fArr, fArr2);
        MethodCollector.o(1419);
        return nativeTouchesMove;
    }

    public static int postMessage(long j2, long j3, long j4, long j5, String str) {
        MethodCollector.i(1421);
        int nativePostMessage = nativePostMessage(j2, j3, j4, j5, str);
        MethodCollector.o(1421);
        return nativePostMessage;
    }
}
